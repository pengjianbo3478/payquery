package com.gl365.payquery.model;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.gl365.payquery.util.gson.GsonUtils;
public class PayStream implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 给乐流水号
	 */
	private String payId;
	/**
	 * 请求流水号
	 */
	private String requestId;
	/**
	 * 请求交易日期
	 */
	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate requestDate;
	/**
	 * 原请求流水号
	 */
	private String origRequestId;
	@JsonFormat(pattern = "yyyy-MM-dd")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	/**
	 * 原交易日期
	 */
	private LocalDate origPayDate;
	/**
	 * 支付机构代码
	 */
	private String organCode;
	/**
	 * 机构商户号
	 */
	private String organMerchantNo;
	/**
	 * 终端号
	 */
	private String terminal;
	/**
	 * 操作员
	 */
	private String operator;
	/**
	 * 交易类型
	 */
	private String transType;
	/**
	 * 交易总金额
	 */
	private BigDecimal totalAmount = BigDecimal.ZERO;
	/**
	 * 退货金额
	 */
	private BigDecimal returnAmount = BigDecimal.ZERO;
	/**
	 * 处理状态
	 */
	private String dealStatus;
	/**
	 * 处理状态描述
	 */
	private String dealDesc;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime createTime;
	private String createBy;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime modifyTime;
	private String modifyBy;
	private String uniqueSerial;

	/**
	 * 给乐流水号
	 * @return
	 */
	public String getPayId() {
		return payId;
	}

	/**
	 * 给乐流水号
	 * @param payId
	 */
	public void setPayId(String payId) {
		this.payId = payId;
	}

	/**
	 * 请求流水号
	 * @return
	 */
	public String getRequestId() {
		return requestId;
	}

	/**
	 * 请求流水号
	 * @param requestId
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	/**
	 * 请求交易日期
	 * @return 
	 */
	public LocalDate getRequestDate() {
		return requestDate;
	}

	/**
	 * 请求交易日期
	 * @param requestDate
	 */
	public void setRequestDate(LocalDate requestDate) {
		this.requestDate = requestDate;
	}

	/**
	 * 原请求流水号
	 * @return
	 */
	public String getOrigRequestId() {
		return origRequestId;
	}

	/**
	 * 原请求流水号
	 * @param origRequestId
	 */
	public void setOrigRequestId(String origRequestId) {
		this.origRequestId = origRequestId;
	}

	/**
	 * 原交易日期
	 * @return
	 */
	public LocalDate getOrigPayDate() {
		return origPayDate;
	}

	/**
	 * 原交易日期
	 * @param origPayDate
	 */
	public void setOrigPayDate(LocalDate origPayDate) {
		this.origPayDate = origPayDate;
	}

	/**
	 * 支付机构代码
	 * @return
	 */
	public String getOrganCode() {
		return organCode;
	}

	/**
	 * 支付机构代码
	 * @param organCode
	 */
	public void setOrganCode(String organCode) {
		this.organCode = organCode;
	}

	/**
	 * 机构商户号
	 * @return
	 */
	public String getOrganMerchantNo() {
		return organMerchantNo;
	}

	/**
	 * 机构商户号
	 * @param organMerchantNo
	 */
	public void setOrganMerchantNo(String organMerchantNo) {
		this.organMerchantNo = organMerchantNo;
	}

	/**
	 * 终端号
	 * @return
	 */
	public String getTerminal() {
		return terminal;
	}

	/**
	 * 终端号
	 * @param terminal
	 */
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	/**
	 * 操作员
	 * @return
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * 操作员
	 * @param operator
	 */
	public void setOperator(String operator) {
		this.operator = operator;
	}

	/**
	 * 交易类型
	 * @return
	 */
	public String getTransType() {
		return transType;
	}

	/**
	 * 交易类型
	 * @param transType
	 */
	public void setTransType(String transType) {
		this.transType = transType;
	}

	/**
	 * 交易总金额
	 * @return
	 */
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	/**
	 * 交易总金额
	 * @param totalAmount
	 */
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	/**
	 * 退货金额
	 * @return
	 */
	public BigDecimal getReturnAmount() {
		return returnAmount;
	}

	/**
	 * 退货金额
	 * @param returnAmount
	 */
	public void setReturnAmount(BigDecimal returnAmount) {
		this.returnAmount = returnAmount;
	}

	/**
	 * 处理状态
	 * @return
	 */
	public String getDealStatus() {
		return dealStatus;
	}

	/**
	 * 处理状态
	 * @param dealStatus
	 */
	public void setDealStatus(String dealStatus) {
		this.dealStatus = dealStatus;
	}

	public LocalDateTime getCreateTime() {
		return createTime;
	}

	public void setCreateTime(LocalDateTime createTime) {
		this.createTime = createTime;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public LocalDateTime getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(LocalDateTime modifyTime) {
		this.modifyTime = modifyTime;
	}

	public String getModifyBy() {
		return modifyBy;
	}

	public void setModifyBy(String modifyBy) {
		this.modifyBy = modifyBy;
	}

	@Override
	public String toString() {
		return GsonUtils.toJson(this);
	}

	/**
	 * <p>防重复流水号</p>
	 * @return the uniqueSerial
	 */
	public String getUniqueSerial() {
		return uniqueSerial;
	}

	/**
	 * <p>防重复流水号</p>
	 * @param uniqueSerial the uniqueSerial to set
	 */
	public void setUniqueSerial(String uniqueSerial) {
		this.uniqueSerial = uniqueSerial;
	}

	public PayStream(String payId, String dealStatus, String dealDesc) {
		super();
		this.payId = payId;
		this.dealStatus = dealStatus;
		this.dealDesc = dealDesc;
	}

	public PayStream() {
		super();
	}

	public String getDealDesc() {
		return dealDesc;
	}

	public void setDealDesc(String dealDesc) {
		this.dealDesc = dealDesc;
	}
}