package com.gl365.payquery.dto.mgr.request;
import java.io.Serializable;
import com.gl365.payquery.util.gson.GsonUtils;
public class QueryPayMainGroupPayReqDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String groupOrderId;
	private String userId;

	public String getGroupOrderId() {
		return groupOrderId;
	}

	public void setGroupOrderId(String groupOrderId) {
		this.groupOrderId = groupOrderId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return GsonUtils.toJson(this);
	}
}
