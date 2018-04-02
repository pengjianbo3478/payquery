package com.gl365.payquery.exception;
public class AccountRespException extends ServiceException {
	private static final long serialVersionUID = 1L;

	public AccountRespException(String code, String desc, Throwable cause) {
		super(code, desc, cause);
	}

	public AccountRespException(String code, String desc) {
		super(code, desc);
	}
}
