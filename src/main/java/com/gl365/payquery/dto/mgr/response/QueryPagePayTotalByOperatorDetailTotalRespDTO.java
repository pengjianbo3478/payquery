package com.gl365.payquery.dto.mgr.response;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.gl365.payquery.util.gson.GsonUtils;
public class QueryPagePayTotalByOperatorDetailTotalRespDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 商户实得总额
	 */
	private BigDecimal merchantSettleAmountTotal;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime payStartDate;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime payEndDate;

	public BigDecimal getMerchantSettleAmountTotal() {
		return merchantSettleAmountTotal;
	}

	public void setMerchantSettleAmountTotal(BigDecimal merchantSettleAmountTotal) {
		this.merchantSettleAmountTotal = merchantSettleAmountTotal;
	}

	@Override
	public String toString() {
		return GsonUtils.toJson(this);
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
