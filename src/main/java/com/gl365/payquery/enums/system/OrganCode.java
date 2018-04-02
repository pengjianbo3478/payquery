package com.gl365.payquery.enums.system;
public enum OrganCode {
	/**
	 * 支付渠道-给乐40001
	 */
	GL("40001 ", "给乐"),
	/**
	 * 10001-付费通
	 */
	FFT("10001", "付费通");
	private final String code;
	private final String desc;

	private OrganCode(String code, String desc) {
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
