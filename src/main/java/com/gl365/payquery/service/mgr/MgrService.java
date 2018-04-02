package com.gl365.payquery.service.mgr;
import com.gl365.payquery.dto.mgr.request.QueryPagePayMainReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPagePayReturnReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPagePayTotalByOperatorDetailReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPagePayTotalByOperatorReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPayDetailByPayIdReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPayMainByPayIdReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPayMainGroupPayReqDTO;
import com.gl365.payquery.dto.mgr.request.QueryPayReturnByPayIdReqDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayMainRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayReturnRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayTotalByOperatorDetailRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPagePayTotalByOperatorRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPayDetailByPayIdRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPayMainByPayIdRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPayMainGroupPayRespDTO;
import com.gl365.payquery.dto.mgr.response.QueryPayReturnByPayIdRespDTO;
public interface MgrService {
	QueryPayMainByPayIdRespDTO queryPayMainByPayId(QueryPayMainByPayIdReqDTO request);

	QueryPagePayMainRespDTO queryPagePayMain(QueryPagePayMainReqDTO request);

	QueryPagePayReturnRespDTO queryPagePayReturn(QueryPagePayReturnReqDTO request);

	QueryPayReturnByPayIdRespDTO queryPayReturnByPayId(QueryPayReturnByPayIdReqDTO request);

	QueryPayDetailByPayIdRespDTO queryPayDetailByPayId(QueryPayDetailByPayIdReqDTO request);
	
	QueryPayMainGroupPayRespDTO queryPayMainGroupPay(QueryPayMainGroupPayReqDTO request);
	
	QueryPagePayTotalByOperatorRespDTO queryPagePayTotalByOperator(QueryPagePayTotalByOperatorReqDTO request);
	
	QueryPagePayTotalByOperatorDetailRespDTO queryPagePayTotalByOperatorDetail(QueryPagePayTotalByOperatorDetailReqDTO request);
}
