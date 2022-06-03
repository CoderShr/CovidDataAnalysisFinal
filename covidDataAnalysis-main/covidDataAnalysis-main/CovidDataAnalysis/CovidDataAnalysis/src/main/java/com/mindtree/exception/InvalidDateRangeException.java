package com.mindtree.exception;

public class InvalidDateRangeException extends RuntimeException {

	private static final long serialVersionUID = 3388648871562751865L;

	public InvalidDateRangeException(String msg) {
		super(msg);
	}

}
