package com.cg.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)

public class AddressNotFoundException  extends Exception{
	public AddressNotFoundException(String message)
	{
		super(message);
	}
	

}
