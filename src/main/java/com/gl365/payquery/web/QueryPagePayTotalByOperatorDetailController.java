package com.gl365.payquery.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.gl365.payquery.dto.mgr.request.QueryPagePayTotalByOperatorDetailReqDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayTotalByOperatorDetailRespDTO;
import com.gl365.payquery.enums.msg.Msg;
import com.gl365.payquery.exception.ServiceException;
import com.gl365.payquery.service.mgr.MgrService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class QueryPagePayTotalByOperatorDetailController {
	private static final Logger LOG = LoggerFactory.getLogger(QueryPagePayTotalByOperatorDetailController.class);
	@Autowired
	private MgrService mgrService;
	
	@PostMapping(value = "queryPagePayTotalByOperatorDetail")
	@HystrixCommand(fallbackMethod = "fallback")
	public QueryPagePayTotalByOperatorDetailRespDTO queryPagePayTotalByOperatorDetail(@RequestBody QueryPagePayTotalByOperatorDetailReqDTO request) {
		LOG.debug("#####QueryPagePayTotalByOperatorDetailReqDTO={}", request);
		QueryPagePayTotalByOperatorDetailRespDTO result = new QueryPagePayTotalByOperatorDetailRespDTO();
		try {
			result = this.mgrService.queryPagePayTotalByOperatorDetail(request);
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
		LOG.debug("result={}", result);
		return result;
	}

	public QueryPagePayTotalByOperatorDetailRespDTO fallback(QueryPagePayTotalByOperatorDetailReqDTO request) {
		QueryPagePayTotalByOperatorDetailRespDTO result = new QueryPagePayTotalByOperatorDetailRespDTO();
		result.setResultCode(Msg.F000.getCode());
		result.setResultDesc(Msg.F000.getDesc());
		return result;
	}

}
