package com.gl365.payquery.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gl365.payquery.dto.mgr.request.QueryPagePayTotalByOperatorReqDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayTotalByOperatorRespDTO;
import com.gl365.payquery.enums.msg.Msg;
import com.gl365.payquery.exception.ServiceException;
import com.gl365.payquery.service.mgr.MgrService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@RestController
public class QueryPagePayTotalByOperatorController {
	
	private static final Logger LOG = LoggerFactory.getLogger(QueryPagePayTotalByOperatorController.class);
	@Autowired
	private MgrService mgrService;
	
	@PostMapping(value = "queryPagePayTotalByOperator")
	@HystrixCommand(fallbackMethod = "fallback")
	public QueryPagePayTotalByOperatorRespDTO queryPagePayMain(@RequestBody QueryPagePayTotalByOperatorReqDTO request) {
		LOG.debug("#####QueryPagePayTotalByOperatorReqDTO={}", request);
		QueryPagePayTotalByOperatorRespDTO result = new QueryPagePayTotalByOperatorRespDTO();
		try {
			result = this.mgrService.queryPagePayTotalByOperator(request);
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

	public QueryPagePayTotalByOperatorRespDTO fallback(QueryPagePayTotalByOperatorReqDTO request) {
		QueryPagePayTotalByOperatorRespDTO result = new QueryPagePayTotalByOperatorRespDTO();
		result.setResultCode(Msg.F000.getCode());
		result.setResultDesc(Msg.F000.getDesc());
		return result;
	}

}
