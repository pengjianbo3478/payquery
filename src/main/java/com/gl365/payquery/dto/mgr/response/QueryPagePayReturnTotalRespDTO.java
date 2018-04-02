package com.gl365.payquery.dto.mgr.response;
import java.io.Serializable;
import java.math.BigDecimal;
import com.gl365.payquery.util.gson.GsonUtils;
public class QueryPagePayReturnTotalRespDTO implements Serializable {
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
	 * 商户实得总额
	 */
	private BigDecimal merchantSettleAmountTotal;
	/**
	 * 支付手续费
	 */
	private BigDecimal payFeeTotal;

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

	public BigDecimal getMerchantSettleAmountTotal() {
		return merchantSettleAmountTotal;
	}

	public void setMerchantSettleAmountTotal(BigDecimal merchantSettleAmountTotal) {
		this.merchantSettleAmountTotal = merchantSettleAmountTotal;
	}

	public BigDecimal getPayFeeTotal() {
		return payFeeTotal;
	}

	public void setPayFeeTotal(BigDecimal payFeeTotal) {
		this.payFeeTotal = payFeeTotal;
	}
	
	@Override
	public String toString() {
		return GsonUtils.toJson(this);
	}
}
