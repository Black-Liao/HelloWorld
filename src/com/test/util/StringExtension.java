package com.test.util;

public class StringExtension {

	public static boolean isNull(String str) {
		return str == null && "".equals(str)? true : false;
	}
	
}
