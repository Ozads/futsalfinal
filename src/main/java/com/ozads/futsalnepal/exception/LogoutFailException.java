package com.ozads.futsalnepal.exception;

import org.hibernate.service.spi.ServiceException;


@SuppressWarnings("serial")
public class LogoutFailException extends ServiceException {

	/**
	 * @param message
	 */
	public LogoutFailException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
