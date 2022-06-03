package com.mindtree.validator;

import java.text.ParseException;

@FunctionalInterface
public interface DateValidator {

	boolean isValid(String dateStr) throws ParseException ;
}