package com.matrimonial.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotDefaultSelectValidator implements
		ConstraintValidator<NotDefaultSelect, String> {
	@Override
	public void initialize(NotDefaultSelect constraint) {

	}

	@Override
	public boolean isValid(String selectedValue, ConstraintValidatorContext ctx) {
		if (selectedValue == null) {
			return false;
		}
		if (selectedValue.equals("") || selectedValue.equals("0")
				|| selectedValue.equalsIgnoreCase("default")
				|| selectedValue.equalsIgnoreCase("please select")) {
			return false;
		}
		return true;
	}

}