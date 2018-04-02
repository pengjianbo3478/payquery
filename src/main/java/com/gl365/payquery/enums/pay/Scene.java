package com.gl365.payquery.enums.pay;
public enum Scene {
	/**
	 * POS-03
	 */
	POS_PAY("03", "POS"),
	/**
	 * 快捷支付-01
	 */
	FAST_PAY("00", "快捷支付"),
	B_SAO_C("01", "B扫C支付"),
	C_SAO_B("02", "C扫B支付");

	private final String code;
	private final String desc;

	private Scene(String code, String desc) {
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
