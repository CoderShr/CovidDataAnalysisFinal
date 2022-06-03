package com.mindtree.exception;

public class InvalidDateException extends RuntimeException{

	private static final long serialVersionUID = -4906723374582540819L;

	public InvalidDateException(String message) {
		super(message);
	}

}
