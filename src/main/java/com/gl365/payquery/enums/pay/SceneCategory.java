package com.gl365.payquery.enums.pay;

public enum SceneCategory {

	KJ("KJ", "快捷支付"), WX("WX", "微信支付"), ZFB("ZFB", "支付宝支付");

	private final String code;
	private final String desc;

	private SceneCategory(String code, String desc) {
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