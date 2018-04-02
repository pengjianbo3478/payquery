package com.gl365.payquery.dto.mgr.response;

import java.io.Serializable;
import java.math.BigDecimal;
import com.gl365.payquery.util.gson.GsonUtils;

public class QueryPagePayMainTotalRespDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 交易总额
	 */
	private BigDecimal totalAmountTotal;
	/**
	 * 现金总额
	 */
	private BigDecimal cashAmountTotal;
	/**
	 * 乐豆总额
	 */
	private BigDecimal beanAmountTotal;
	/**
	 * 返利总额
	 */
	private BigDecimal giftAmountTotal;
	/**
	 * 商户实得总额
	 */
	private BigDecimal merchantSettleAmountTotal;
	/**
	 * 不可返利合计
	 */
	private BigDecimal noBenefitAmountTotal;
	/**
	 * 平台服务费/返佣金额
	 */
	private BigDecimal commAmountTotal;
	
	/**
	 * POS收款汇总
	 */
	private BigDecimal posPayAmountTotal;
	
	/**
	 * 线上收款汇总/非POS
	 */
	private BigDecimal onlinePayAmountTotal;

	public BigDecimal getCommAmountTotal() {
		return commAmountTotal;
	}

	public void setCommAmountTotal(BigDecimal commAmountTotal) {
		this.commAmountTotal = commAmountTotal;
	}

	public BigDecimal getNoBenefitAmountTotal() {
		return noBenefitAmountTotal;
	}

	public void setNoBenefitAmountTotal(BigDecimal noBenefitAmountTotal) {
		this.noBenefitAmountTotal = noBenefitAmountTotal;
	}

	public BigDecimal getTotalAmountTotal() {
		return totalAmountTotal;
	}

	public void setTotalAmountTotal(BigDecimal totalAmountTotal) {
		this.totalAmountTotal = totalAmountTotal;
	}

	public BigDecimal getCashAmountTotal() {
		return cashAmountTotal;
	}

	public void setCashAmountTotal(BigDecimal cashAmountTotal) {
		this.cashAmountTotal = cashAmountTotal;
	}

	public BigDecimal getBeanAmountTotal() {
		return beanAmountTotal;
	}

	public void setBeanAmountTotal(BigDecimal beanAmountTotal) {
		this.beanAmountTotal = beanAmountTotal;
	}

	public BigDecimal getGiftAmountTotal() {
		return giftAmountTotal;
	}

	public void setGiftAmountTotal(BigDecimal giftAmountTotal) {
		this.giftAmountTotal = giftAmountTotal;
	}

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
