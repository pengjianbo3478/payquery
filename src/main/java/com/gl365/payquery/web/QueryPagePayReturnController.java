package com.gl365.payquery.web;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.gl365.payquery.dto.mgr.request.QueryPagePayReturnReqDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayReturnRespDTO;
import com.gl365.payquery.enums.msg.Msg;
import com.gl365.payquery.exception.ServiceException;
import com.gl365.payquery.service.mgr.MgrService;
import com.gl365.payquery.util.Gl365StrUtils;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@RestController
public class QueryPagePayReturnController {
	private static final Logger LOG = LoggerFactory.getLogger(QueryPagePayReturnController.class);
	@Autowired
	private MgrService mgrService;

	@PostMapping(value = "queryPagePayReturn")
	@HystrixCommand(fallbackMethod = "fallback")
	public QueryPagePayReturnRespDTO queryPagePayReturn(@RequestBody QueryPagePayReturnReqDTO request) {
		LOG.debug("#####QueryPagePayReturnReqDTO={}", request);
		QueryPagePayReturnRespDTO result = new QueryPagePayReturnRespDTO();
		try {
			result = this.mgrService.queryPagePayReturn(request);
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

	public QueryPagePayReturnRespDTO fallback(QueryPagePayReturnReqDTO request) {
		QueryPagePayReturnRespDTO result = new QueryPagePayReturnRespDTO();
		result.setResultCode(Msg.F000.getCode());
		result.setResultDesc(Msg.F000.getDesc());
		return result;
	}
}
