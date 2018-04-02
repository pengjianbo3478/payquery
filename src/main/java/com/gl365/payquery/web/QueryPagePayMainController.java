package com.gl365.payquery.web;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.gl365.payquery.dto.mgr.request.QueryPagePayMainReqDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayMainRespDTO;
import com.gl365.payquery.enums.msg.Msg;
import com.gl365.payquery.exception.ServiceException;
import com.gl365.payquery.service.mgr.MgrService;
import com.gl365.payquery.util.Gl365StrUtils;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@RestController
public class QueryPagePayMainController {
	private static final Logger LOG = LoggerFactory.getLogger(QueryPagePayMainController.class);
	@Autowired
	private MgrService mgrService;

	@PostMapping(value = "queryPagePayMain")
	@HystrixCommand(fallbackMethod = "fallback")
	public QueryPagePayMainRespDTO queryPagePayMain(@RequestBody QueryPagePayMainReqDTO request) {
		LOG.debug("#####QueryPagePayMainReqDTO={}", request);
		QueryPagePayMainRespDTO result = new QueryPagePayMainRespDTO();
		try {
			result = this.mgrService.queryPagePayMain(request);
			result.setResultCode(Msg.S000.getCode());
			result.setResultDesc(Msg.S000.getDesc());
		}
		catch (ServiceException e) {
			LOG.error(e.getMessage(), e);
			result.setResultCode(e.getCode());
			result.setResultDesc(e.getDesc());
		}
		catch (Exception e) {
			result.setResultCode(Msg.F000.getCode());
			result.setResultDesc(Msg.F000.getDesc());
		}
		LOG.debug("result={}", Gl365StrUtils.toStr(result));
		return result;
	}

	public QueryPagePayMainRespDTO fallback(QueryPagePayMainReqDTO request) {
		QueryPagePayMainRespDTO result = new QueryPagePayMainRespDTO();
		result.setResultCode(Msg.F000.getCode());
		result.setResultDesc(Msg.F000.getDesc());
		return result;
	}
}
