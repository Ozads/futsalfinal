package com.ozads.futsalnepal.exception;

import org.hibernate.service.spi.ServiceException;


@SuppressWarnings("serial")
public class ValidationException extends ServiceException {

	/**
	 * @param message
	 */
	public ValidationException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
