package com.gl365.payquery.exception;

/**
 * 
 * @author lenovo
 *
 */
public class InvalidRequestException extends ServiceException {

	private static final long serialVersionUID = 1L;
	
	public InvalidRequestException(String code, String desc, Throwable cause) {
		super(code, desc, cause);
	}

	public InvalidRequestException(String code, String desc) {
		super(code, desc);
	}

}
