package com.gl365.payquery.dto.mgr.response;
import java.io.Serializable;
import java.util.List;
import com.gl365.payquery.model.PayDetail;
import com.gl365.payquery.util.gson.GsonUtils;
public class QueryPayDetailByPayIdRespDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String resultCode;
	private String resultDesc;
	private List<PayDetail> resultData;

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

	public List<PayDetail> getResultData() {
		return resultData;
	}

	public void setResultData(List<PayDetail> resultData) {
		this.resultData = resultData;
	}
	
	@Override
	public String toString() {
		return GsonUtils.toJson(this);
	}
}
