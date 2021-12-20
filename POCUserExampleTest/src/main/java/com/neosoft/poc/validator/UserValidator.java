package com.neosoft.poc.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.neosoft.poc.model.UserInfo;

public class UserValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(UserInfo.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
     UserInfo user=(UserInfo)target;
  
	}

}
