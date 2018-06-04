package com.ozads.futsalnepal.exception;

import org.hibernate.service.spi.ServiceException;


@SuppressWarnings("serial")
public class NotValideExpection extends ServiceException {

	/**
	 * @param message
	 */
	public NotValideExpection(String message) {
		super(message);
	}

}
