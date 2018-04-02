package com.gl365.payquery.service.dbservice.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gl365.payquery.dto.mgr.response.QueryPagePayReturnTotalRespDTO;
import com.gl365.payquery.mapper.PayMainMapper;
import com.gl365.payquery.mapper.PayReturnMapper;
import com.gl365.payquery.model.PayReturn;
import com.gl365.payquery.service.dbservice.PayReturnService;
@Service
public class PayReturnServiceImpl implements PayReturnService {
	@Autowired
	PayReturnMapper payReturnMapper;
	@Autowired
	PayMainMapper payMainMapper;

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PageInfo<PayReturn> queryPagePayReturn(PayReturn payReturn, int pageNum, int pageSize) {
		Page<PayReturn> page = PageHelper.startPage(pageNum, pageSize);
		this.payReturnMapper.queryPagePayReturn(payReturn);
		PageInfo<PayReturn> result = new PageInfo<PayReturn>(page);
		return result;
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PayReturn queryByPayId(String payId) {
		return this.payReturnMapper.queryByPayId(payId);
	}

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public QueryPagePayReturnTotalRespDTO queryPagepayReturnTotal(PayReturn payReturn) {
		return this.payReturnMapper.queryPagePayReturnTotal(payReturn);
	}
}
