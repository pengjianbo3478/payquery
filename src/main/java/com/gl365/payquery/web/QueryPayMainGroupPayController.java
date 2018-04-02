package com.gl365.payquery.web;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.gl365.payquery.dto.mgr.request.QueryPayMainGroupPayReqDTO;
import com.gl365.payquery.dto.mgr.response.QueryPayMainGroupPayRespDTO;
import com.gl365.payquery.enums.msg.Msg;
import com.gl365.payquery.exception.ServiceException;
import com.gl365.payquery.service.mgr.MgrService;
import com.gl365.payquery.util.Gl365StrUtils;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
@RestController
public class QueryPayMainGroupPayController {
	private static final Logger LOG = LoggerFactory.getLogger(QueryPayMainGroupPayController.class);
	@Autowired
	private MgrService mgrService;

	@PostMapping(value = "queryPayMainGroupPay")
	@HystrixCommand(fallbackMethod = "fallback")
	public QueryPayMainGroupPayRespDTO queryPayMainByPayId(@RequestBody QueryPayMainGroupPayReqDTO request) {
		LOG.debug("#####QueryPayMainByPayIdReqDTO={}", request);
		QueryPayMainGroupPayRespDTO response = new QueryPayMainGroupPayRespDTO();
		try {
			response = this.mgrService.queryPayMainGroupPay(request);
		}
		catch (ServiceException e) {
			LOG.error(e.getMessage(), e);
			response.setResultCode(e.getCode());
			response.setResultDesc(e.getDesc());
		}
		catch (Exception e) {
			response.setResultCode(Msg.F000.getCode());
			response.setResultDesc(Msg.F000.getDesc());
		}
		LOG.debug("response={}", Gl365StrUtils.toStr(response));
		return response;
	}

	public QueryPayMainGroupPayRespDTO fallback(QueryPayMainGroupPayReqDTO request) {
		QueryPayMainGroupPayRespDTO result = new QueryPayMainGroupPayRespDTO();
		result.setResultCode(Msg.F000.getCode());
		result.setResultDesc(Msg.F000.getDesc());
		return result;
	}
}
