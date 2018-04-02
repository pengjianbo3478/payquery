package com.gl365.payquery.dto.mgr.response;
import java.io.Serializable;
import com.gl365.payquery.model.PayReturn;
import com.gl365.payquery.util.gson.GsonUtils;
public class QueryPayReturnByPayIdRespDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String resultCode;
	private String resultDesc;
	private PayReturn resultData;

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

	public PayReturn getResultData() {
		return resultData;
	}

	public void setResultData(PayReturn resultData) {
		this.resultData = resultData;
	}
	
	@Override
	public String toString() {
		return GsonUtils.toJson(this);
	}
}
