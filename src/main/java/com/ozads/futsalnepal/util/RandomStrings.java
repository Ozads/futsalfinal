package com.ozads.futsalnepal.util;

import java.math.BigInteger;
import java.security.SecureRandom;


public class RandomStrings {
	
	private static SecureRandom random = new SecureRandom();

	public static String getToken() {
		return new BigInteger(50, random).toString(64);
}

}
