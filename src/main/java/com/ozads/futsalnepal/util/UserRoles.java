package com.ozads.futsalnepal.util;

public enum UserRoles {
	
	ADMIN("ADMIN", "admin"),

	CUSTOMER("CUSTOMER", "customer"),
	
	COURT("COURT","court"),
	
	USER("USER","user");
	

	

	private final String value;
	private final String description;

	private UserRoles(String value, String description) {
		this.value = value;
		this.description = description;
	}

	/**
	 * Return the String value of this status.
	 */
	public String value() {
		return this.value;
	}

	/**
	 * Return the description of this status.
	 */
	public String getReasonPhrase() {
		return this.description;
	}

	/**
	 * Return a string representation of this status value.
	 */
	@Override
	public String toString() {
		return this.value;
	}

}
