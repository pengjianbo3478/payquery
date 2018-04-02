package com.gl365.payquery.dto.mgr.response;

import java.io.Serializable;

import com.github.pagehelper.PageInfo;
import com.gl365.payquery.util.gson.GsonUtils;

public class QueryPagePayTotalByOperatorRespDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String resultCode;
	private String resultDesc;
	private PageInfo<QueryPayTotalByOperatorRespDTO> resultData;
	private QueryPayTotalByOperatorTotalRespDTO resultDataTotal;
	
	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultDesc() {
		return resultDesc;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}

	public PageInfo<QueryPayTotalByOperatorRespDTO> getResultData() {
		return resultData;
	}

	public void setResultData(PageInfo<QueryPayTotalByOperatorRespDTO> resultData) {
		this.resultData = resultData;
	}

	@Override
	public String toString() {
		return GsonUtils.toJson(this);
	}

	public QueryPayTotalByOperatorTotalRespDTO getResultDataTotal() {
		return resultDataTotal;
	}

	public void setResultDataTotal(QueryPayTotalByOperatorTotalRespDTO resultDataTotal) {
		this.resultDataTotal = resultDataTotal;
	}

}
