package com.ozads.futsalnepal.exception;

import org.hibernate.service.spi.ServiceException;


@SuppressWarnings("serial")
public class AlreadyExistException extends ServiceException {

	/**
	 * @param message
	 */
	public AlreadyExistException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
