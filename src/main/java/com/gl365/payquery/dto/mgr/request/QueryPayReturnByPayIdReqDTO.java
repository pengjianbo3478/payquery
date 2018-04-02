package com.gl365.payquery.dto.mgr.request;
import java.io.Serializable;
import com.gl365.payquery.util.gson.GsonUtils;
public class QueryPayReturnByPayIdReqDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String payId;

	public String getPayId() {
		return payId;
	}

	public void setPayId(String payId) {
		this.payId = payId;
	}
	
	@Override
	public String toString() {
		return GsonUtils.toJson(this);
	}
}
