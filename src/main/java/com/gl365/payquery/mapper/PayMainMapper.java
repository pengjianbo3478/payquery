package com.gl365.payquery.mapper;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gl365.payquery.dto.mgr.request.QueryPagePayTotalByOperatorDetailReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPagePayTotalByOperatorReqDTO;
import com.gl365.payquery.dto.mgr.response.QueryPayTotalByOperatorRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPayTotalByOperatorTotalRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayMainTotalRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayTotalByOperatorDetailTotalRespDTO;
import com.gl365.payquery.model.PayMain;
@Repository
public interface PayMainMapper {
	PayMain queryByPayId(String payId);

	List<PayMain> queryPagePayMain(PayMain payMain);
	
	PayMain queryByUserIdAndGroupOrderId(PayMain payMain);
	
	List<PayMain> queryByPayIdList(List<String> payIds);
	
	QueryPagePayMainTotalRespDTO queryPagePayMainTotal(PayMain payMain);
	
	List<QueryPayTotalByOperatorRespDTO> queryPagePayTotalByOperator(QueryPagePayTotalByOperatorReqDTO request);
	
	QueryPayTotalByOperatorTotalRespDTO queryPagePayTotalByOperatorTotal(QueryPagePayTotalByOperatorReqDTO request);
	
	List<PayMain> queryPagePayTotalByOperatorDetail(QueryPagePayTotalByOperatorDetailReqDTO request);
	
	QueryPagePayTotalByOperatorDetailTotalRespDTO queryPagePayTotalByOperatorDetailTotal(QueryPagePayTotalByOperatorDetailReqDTO request);
}