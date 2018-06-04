package com.ozads.futsalnepal.exception;

import org.hibernate.service.spi.ServiceException;


@SuppressWarnings("serial")
public class DidNotMatchException extends ServiceException {

	/**
	 * @param message
	 */
	public DidNotMatchException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
