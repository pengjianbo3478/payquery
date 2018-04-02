package com.gl365.payquery.dto.mgr.response;

import java.io.Serializable;
import java.math.BigDecimal;

import com.gl365.payquery.util.gson.GsonUtils;

public class QueryPayTotalByOperatorRespDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String operateType;

	private String operator;

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
	 * 订单数
	 */
	private Long txnCount;

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public BigDecimal getTotalAmountTotal() {
		return totalAmountTotal;
	}

	public void setTotalAmountTotal(BigDecimal totalAmountTotal) {
		this.totalAmountTotal = totalAmountTotal;
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

	public Long getTxnCount() {
		return txnCount;
	}

	public void setTxnCount(Long txnCount) {
		this.txnCount = txnCount;
	}

	public BigDecimal getCommAmountTotal() {
		return commAmountTotal;
	}

	public void setCommAmountTotal(BigDecimal commAmountTotal) {
		this.commAmountTotal = commAmountTotal;
	}

	public String getOperateType() {
		return operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

}
