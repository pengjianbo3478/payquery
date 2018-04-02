package com.gl365.payquery.enums.pay;
public enum PayStatus {
	/**
	 * 待支付-00
	 */
	WAIT_PAY("00", "待支付"),
	/**
	 * 已支付-01
	 */
	COMPLETE_PAY("01", "已支付"),
	/**
	 * 已撤销-02
	 */
	CANCEL("02", "已撤销"),
	/**
	 * 已部分退货-03
	 */
	PART_RETURN("03", "已部分退货"),
	/**
	 * 已全额退货-04
	 */
	ALL_RETURN("04", "已全额退货"),
	/**
	 * 已冲正-05
	 */
	REVERSE("05", "已冲正");
	private final String code;
	private final String desc;

	private PayStatus(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public String getCode() {
		return code;
	}
}
