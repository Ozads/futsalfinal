package com.ozads.futsalnepal.exception;

import org.hibernate.service.spi.ServiceException;


@SuppressWarnings("serial")
public class LoginFailException extends ServiceException {

	/**
	 * @param message
	 */
	public LoginFailException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
