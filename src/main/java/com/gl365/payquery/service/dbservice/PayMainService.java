package com.gl365.payquery.service.dbservice;

import com.github.pagehelper.PageInfo;
import com.gl365.payquery.dto.mgr.request.QueryPagePayTotalByOperatorDetailReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPagePayTotalByOperatorReqDTO;
import com.gl365.payquery.dto.mgr.response.QueryPayTotalByOperatorRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPayTotalByOperatorTotalRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayMainTotalRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayTotalByOperatorDetailTotalRespDTO;
import com.gl365.payquery.model.PayMain;

public interface PayMainService {
	PayMain queryByPayId(String payId);

	PageInfo<PayMain> queryPagePayMain(PayMain payMain, int pageNum, int pageSize);

	QueryPagePayMainTotalRespDTO queryPagePayMainTotal(PayMain payMain);

	PayMain queryByUserIdAndGroupOrderId(String userId, String groupOrderId);

	PageInfo<QueryPayTotalByOperatorRespDTO> queryPagePayTotalByOperator(QueryPagePayTotalByOperatorReqDTO request, int pageNum, int pageSize);
	
	QueryPayTotalByOperatorTotalRespDTO queryPagePayTotalByOperatorTotal(QueryPagePayTotalByOperatorReqDTO request);
	
	PageInfo<PayMain> queryPagePayTotalByOperatorDetail(QueryPagePayTotalByOperatorDetailReqDTO request, int pageNum, int pageSize);
	
	QueryPagePayTotalByOperatorDetailTotalRespDTO queryPagePayTotalByOperatorDetailTotal(QueryPagePayTotalByOperatorDetailReqDTO request);
}
