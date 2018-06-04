package com.ozads.futsalnepal.exception;

import org.hibernate.service.spi.ServiceException;


@SuppressWarnings("serial")
public class ExpireException extends ServiceException {

	/**
	 * @param message
	 */
	public ExpireException(String message) {
		super(message);
	}

}
