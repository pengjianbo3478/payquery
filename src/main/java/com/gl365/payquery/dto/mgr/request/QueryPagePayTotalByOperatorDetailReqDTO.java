package com.gl365.payquery.dto.mgr.request;
import java.io.Serializable;
import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.gl365.payquery.util.gson.GsonUtils;
public class QueryPagePayTotalByOperatorDetailReqDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private int pageNum = 1;
	private int pageSize = 10;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime payStartDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime payEndDate;
	private String operator;
	private String merchantNo;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	@Override
	public String toString() {
		return GsonUtils.toJson(this);
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getMerchantNo() {
		return merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public LocalDateTime getPayStartDate() {
		return payStartDate;
	}

	public void setPayStartDate(LocalDateTime payStartDate) {
		this.payStartDate = payStartDate;
	}

	public LocalDateTime getPayEndDate() {
		return payEndDate;
	}

	public void setPayEndDate(LocalDateTime payEndDate) {
		this.payEndDate = payEndDate;
	}
}
