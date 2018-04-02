package com.gl365.payquery.service.mgr.impl;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.pagehelper.PageInfo;
import com.gl365.payquery.dto.mgr.request.QueryPagePayMainReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPagePayReturnReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPagePayTotalByOperatorDetailReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPagePayTotalByOperatorReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPayDetailByPayIdReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPayMainByPayIdReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPayMainGroupPayReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPayReturnByPayIdReqDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayMainRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayMainTotalRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayReturnRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayReturnTotalRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayTotalByOperatorDetailRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayTotalByOperatorDetailTotalRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayTotalByOperatorRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPayDetailByPayIdRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPayMainByPayIdRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPayMainGroupPayRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPayReturnByPayIdRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPayTotalByOperatorRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPayTotalByOperatorTotalRespDTO;
import com.gl365.payquery.enums.mgr.MgrMsg;
import com.gl365.payquery.enums.msg.Msg;
import com.gl365.payquery.exception.ServiceException;
import com.gl365.payquery.model.PayDetail;
import com.gl365.payquery.model.PayMain;
import com.gl365.payquery.model.PayReturn;
import com.gl365.payquery.service.dbservice.PayDetailService;
import com.gl365.payquery.service.dbservice.PayMainService;
import com.gl365.payquery.service.dbservice.PayReturnService;
import com.gl365.payquery.service.mgr.MgrService;
import com.gl365.payquery.util.Gl365StrUtils;
@Service
public class MgrServiceImpl implements MgrService {
	private static final Logger LOG = LoggerFactory.getLogger(MgrServiceImpl.class);
	@Autowired
	private PayMainService payMainService;
	@Autowired
	private PayReturnService payReturnService;
	@Autowired
	private PayDetailService payDetailService;

	@Override
	public QueryPayMainByPayIdRespDTO queryPayMainByPayId(QueryPayMainByPayIdReqDTO request) {
		if (request == null) throw new ServiceException(MgrMsg.ERROR_01.getCode(), MgrMsg.ERROR_01.getDesc());
		String payId = request.getPayId();
		if (StringUtils.isEmpty(payId)) throw new ServiceException(MgrMsg.ERROR_02.getCode(), MgrMsg.ERROR_02.getDesc());
		PayMain payMain = this.payMainService.queryByPayId(payId);
		QueryPayMainByPayIdRespDTO result = new QueryPayMainByPayIdRespDTO();
		result.setResultCode(Msg.S000.getCode());
		result.setResultDesc(Msg.S000.getDesc());
		result.setResultData(payMain);
		LOG.debug("#####result={}", Gl365StrUtils.toStr(result));
		return result;
	}

	@Override
	public QueryPagePayMainRespDTO queryPagePayMain(QueryPagePayMainReqDTO request) {
		int pageNum = request.getPageNum();
		int pageSize = request.getPageSize();
		LOG.debug("#####result={}", Gl365StrUtils.toStr(request));
		PayMain payMain = new PayMain();
		BeanUtils.copyProperties(request, payMain);
		PageInfo<PayMain> pageInfo = this.payMainService.queryPagePayMain(payMain, pageNum, pageSize);
		LOG.debug("#####result={}", Gl365StrUtils.toStr(pageInfo));
		QueryPagePayMainRespDTO result = new QueryPagePayMainRespDTO();
		result.setResultData(pageInfo);
		QueryPagePayMainTotalRespDTO resultDataTotal = this.payMainService.queryPagePayMainTotal(payMain);
		result.setResultDataTotal(resultDataTotal);
		return result;
	}

	@Override
	public QueryPagePayReturnRespDTO queryPagePayReturn(QueryPagePayReturnReqDTO request) {
		int pageNum = request.getPageNum();
		int pageSize = request.getPageSize();
		PayReturn payReturn = new PayReturn();
		BeanUtils.copyProperties(request, payReturn);
		PageInfo<PayReturn> pageInfo = this.payReturnService.queryPagePayReturn(payReturn, pageNum, pageSize);
		QueryPagePayReturnRespDTO result = new QueryPagePayReturnRespDTO();
		result.setResultData(pageInfo);
		QueryPagePayReturnTotalRespDTO resultDataTotal = this.payReturnService.queryPagepayReturnTotal(payReturn);
		result.setResultDataTotal(resultDataTotal);
		return result;
	}

	@Override
	public QueryPayReturnByPayIdRespDTO queryPayReturnByPayId(QueryPayReturnByPayIdReqDTO request) {
		String payId = request.getPayId();
		if (StringUtils.isEmpty(payId)) throw new ServiceException(MgrMsg.ERROR_02.getCode(), MgrMsg.ERROR_02.getDesc());
		PayReturn payReturn = this.payReturnService.queryByPayId(payId);
		QueryPayReturnByPayIdRespDTO result = new QueryPayReturnByPayIdRespDTO();
		result.setResultCode(Msg.S000.getCode());
		result.setResultDesc(Msg.S000.getDesc());
		result.setResultData(payReturn);
		return result;
	}

	@Override
	public QueryPayDetailByPayIdRespDTO queryPayDetailByPayId(QueryPayDetailByPayIdReqDTO request) {
		String payId = request.getPayId();
		if (StringUtils.isEmpty(payId)) throw new ServiceException(MgrMsg.ERROR_02.getCode(), MgrMsg.ERROR_02.getDesc());
		List<PayDetail> list = this.payDetailService.queryPayDetailByPayId(payId);
		QueryPayDetailByPayIdRespDTO result = new QueryPayDetailByPayIdRespDTO();
		result.setResultCode(Msg.S000.getCode());
		result.setResultDesc(Msg.S000.getDesc());
		result.setResultData(list);
		return result;
	}

	@Override
	public QueryPayMainGroupPayRespDTO queryPayMainGroupPay(QueryPayMainGroupPayReqDTO request) {
		QueryPayMainGroupPayRespDTO resp = new QueryPayMainGroupPayRespDTO();
		String groupOrderId = request.getGroupOrderId();
		String userId = request.getUserId();
		boolean isEmpty = StringUtils.isEmpty(groupOrderId) || StringUtils.isEmpty(userId);
		if (isEmpty) throw new ServiceException(MgrMsg.ERROR_01.getCode(), MgrMsg.ERROR_01.getDesc());
		PayMain payMain = payMainService.queryByUserIdAndGroupOrderId(userId, groupOrderId);
		if (payMain != null) {
			resp.setGroupOrderId(payMain.getGroupOrderId());
			resp.setPayId(payMain.getPayId());
			resp.setUserId(payMain.getUserId());
		}
		resp.setResultCode(Msg.S000.getCode());
		resp.setResultDesc(Msg.S000.getDesc());
		return resp;
	}

	@Override
	public QueryPagePayTotalByOperatorRespDTO queryPagePayTotalByOperator(QueryPagePayTotalByOperatorReqDTO request) {
		int pageNum = request.getPageNum();
		int pageSize = request.getPageSize();
		LOG.debug("#####request={}", request);
		PageInfo<QueryPayTotalByOperatorRespDTO> pageInfo = this.payMainService.queryPagePayTotalByOperator(request, pageNum, pageSize);
		QueryPagePayTotalByOperatorRespDTO result = new QueryPagePayTotalByOperatorRespDTO();
		result.setResultData(pageInfo);
		request.setPageNum(0);
		request.setPageSize(0);
		QueryPayTotalByOperatorTotalRespDTO resultDataTotal = this.payMainService.queryPagePayTotalByOperatorTotal(request);
		LOG.debug("#####resultDataTotal={}", resultDataTotal);
		result.setResultDataTotal(resultDataTotal);
		LOG.debug("#####result={}", result);
		return result;
	}

	@Override
	public QueryPagePayTotalByOperatorDetailRespDTO queryPagePayTotalByOperatorDetail(QueryPagePayTotalByOperatorDetailReqDTO request) {
		int pageNum = request.getPageNum();
		int pageSize = request.getPageSize();
		PageInfo<PayMain> pageInfo = this.payMainService.queryPagePayTotalByOperatorDetail(request, pageNum, pageSize);
		QueryPagePayTotalByOperatorDetailRespDTO result = new QueryPagePayTotalByOperatorDetailRespDTO();
		result.setResultData(pageInfo);
		QueryPagePayTotalByOperatorDetailTotalRespDTO resultDataTotal = new QueryPagePayTotalByOperatorDetailTotalRespDTO();
		request.setPageNum(0);
		request.setPageSize(0);
		resultDataTotal = this.payMainService.queryPagePayTotalByOperatorDetailTotal(request);
		if (resultDataTotal != null) {
			resultDataTotal.setPayStartDate(request.getPayStartDate());
			resultDataTotal.setPayEndDate(request.getPayEndDate());
		}
		result.setResultDataTotal(resultDataTotal);
		return result;
	}
}
