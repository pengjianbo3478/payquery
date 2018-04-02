package com.gl365.payquery.service.dbservice.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gl365.payquery.dto.mgr.request.QueryPagePayTotalByOperatorDetailReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPagePayTotalByOperatorReqDTO;
import com.gl365.payquery.dto.mgr.response.QueryPayTotalByOperatorRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPayTotalByOperatorTotalRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayMainTotalRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayTotalByOperatorDetailTotalRespDTO;
import com.gl365.payquery.enums.pay.PayStatus;
import com.gl365.payquery.mapper.PayMainMapper;
import com.gl365.payquery.model.PayMain;
import com.gl365.payquery.service.dbservice.PayMainService;
@Service
public class PayMainServiceImpl implements PayMainService {
	@Autowired
	private PayMainMapper payMainMapper;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PayMain queryByPayId(String payId) {
		return this.payMainMapper.queryByPayId(payId);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PageInfo<PayMain> queryPagePayMain(PayMain payMain, int pageNum, int pageSize) {
		Page<PayMain> page = PageHelper.startPage(pageNum, pageSize);
		this.payMainMapper.queryPagePayMain(payMain);
		PageInfo<PayMain> result = new PageInfo<PayMain>(page);
		return result;
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PayMain queryByUserIdAndGroupOrderId(String userId, String groupOrderId) {
		PayMain payMain = new PayMain();
		payMain.setUserId(userId);
		payMain.setGroupOrderId(groupOrderId);
		payMain.setPayStatus(PayStatus.COMPLETE_PAY.getCode());
		return payMainMapper.queryByUserIdAndGroupOrderId(payMain);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public QueryPagePayMainTotalRespDTO queryPagePayMainTotal(PayMain payMain) {
		return this.payMainMapper.queryPagePayMainTotal(payMain);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PageInfo<QueryPayTotalByOperatorRespDTO> queryPagePayTotalByOperator(QueryPagePayTotalByOperatorReqDTO request, int pageNum, int pageSize) {
		Page<QueryPayTotalByOperatorRespDTO> page = PageHelper.startPage(pageNum, pageSize);
		this.payMainMapper.queryPagePayTotalByOperator(request);
		PageInfo<QueryPayTotalByOperatorRespDTO> result = new PageInfo<QueryPayTotalByOperatorRespDTO>(page);
		return result;
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PageInfo<PayMain> queryPagePayTotalByOperatorDetail(QueryPagePayTotalByOperatorDetailReqDTO request,
			int pageNum, int pageSize) {
		Page<PayMain> page = PageHelper.startPage(pageNum, pageSize);
		this.payMainMapper.queryPagePayTotalByOperatorDetail(request);
		PageInfo<PayMain> result = new PageInfo<PayMain>(page);
		PageHelper.clearPage();
		return result;
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public QueryPagePayTotalByOperatorDetailTotalRespDTO queryPagePayTotalByOperatorDetailTotal(
			QueryPagePayTotalByOperatorDetailReqDTO request) {
		return this.payMainMapper.queryPagePayTotalByOperatorDetailTotal(request);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public QueryPayTotalByOperatorTotalRespDTO queryPagePayTotalByOperatorTotal(
			QueryPagePayTotalByOperatorReqDTO request) {
		return this.payMainMapper.queryPagePayTotalByOperatorTotal(request);
	}
}
