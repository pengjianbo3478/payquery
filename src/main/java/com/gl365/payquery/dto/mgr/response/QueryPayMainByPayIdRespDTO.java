package com.gl365.payquery.dto.mgr.response;
import java.io.Serializable;
import com.gl365.payquery.model.PayMain;
import com.gl365.payquery.util.gson.GsonUtils;
public class QueryPayMainByPayIdRespDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String resultCode;
	private String resultDesc;
	private PayMain resultData;

	/**
	 * @return the resultCode
	 */
	public String getResultCode() {
		return resultCode;
	}

	/**
	 * @param resultCode the resultCode to set
	 */
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	/**
	 * @return the resultDesc
	 */
	public String getResultDesc() {
		return resultDesc;
	}

	/**
	 * @param resultDesc the resultDesc to set
	 */
	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}

	/**
	 * @return the resultData
	 */
	public PayMain getResultData() {
		return resultData;
	}

	/**
	 * @param resultData the resultData to set
	 */
	public void setResultData(PayMain resultData) {
		this.resultData = resultData;
	}
	
	@Override
	public String toString() {
		return GsonUtils.toJson(this);
	}
}
