package com.gl365.payquery.dto.mgr.response;

import java.io.Serializable;
import java.math.BigDecimal;

import com.gl365.payquery.util.gson.GsonUtils;

public class QueryPayTotalByOperatorTotalRespDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 商户实得总额
	 */
	private BigDecimal merchantSettleAmountTotal;

	/**
	 * 返利总额
	 */
	private BigDecimal giftAmountTotal;

	/**
	 * 平台服务费/返佣金额
	 */
	private BigDecimal commAmountTotal;
	/**
	 * 交易总额
	 */
	private BigDecimal totalAmountTotal;
	
	/**
	 * POS收款汇总
	 */
	private BigDecimal posPayAmountTotal;
	
	/**
	 * 线上收款汇总/非POS
	 */
	private BigDecimal onlinePayAmountTotal;

	public BigDecimal getMerchantSettleAmountTotal() {
		return merchantSettleAmountTotal;
	}

	public void setMerchantSettleAmountTotal(BigDecimal merchantSettleAmountTotal) {
		this.merchantSettleAmountTotal = merchantSettleAmountTotal;
	}

	public BigDecimal getGiftAmountTotal() {
		return giftAmountTotal;
	}

	public void setGiftAmountTotal(BigDecimal giftAmountTotal) {
		this.giftAmountTotal = giftAmountTotal;
	}

	public BigDecimal getCommAmountTotal() {
		return commAmountTotal;
	}

	public void setCommAmountTotal(BigDecimal commAmountTotal) {
		this.commAmountTotal = commAmountTotal;
	}

	public BigDecimal getTotalAmountTotal() {
		return totalAmountTotal;
	}

	public void setTotalAmountTotal(BigDecimal totalAmountTotal) {
		this.totalAmountTotal = totalAmountTotal;
	}

	@Override
	public String toString() {
		return GsonUtils.toJson(this);
	}

	public BigDecimal getPosPayAmountTotal() {
		return posPayAmountTotal;
	}

	public void setPosPayAmountTotal(BigDecimal posPayAmountTotal) {
		this.posPayAmountTotal = posPayAmountTotal;
	}

	public BigDecimal getOnlinePayAmountTotal() {
		return onlinePayAmountTotal;
	}

	public void setOnlinePayAmountTotal(BigDecimal onlinePayAmountTotal) {
		this.onlinePayAmountTotal = onlinePayAmountTotal;
	}
}
