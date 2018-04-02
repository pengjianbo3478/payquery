package com.gl365.payquery.service.dbservice;
import com.github.pagehelper.PageInfo;
import com.gl365.payquery.dto.mgr.response.QueryPagePayReturnTotalRespDTO;
import com.gl365.payquery.model.PayReturn;
public interface PayReturnService {

	PageInfo<PayReturn> queryPagePayReturn(PayReturn payReturn, int pageNum, int pageSize);

	PayReturn queryByPayId(String payId);

	QueryPagePayReturnTotalRespDTO queryPagepayReturnTotal(PayReturn payReturn);
}
