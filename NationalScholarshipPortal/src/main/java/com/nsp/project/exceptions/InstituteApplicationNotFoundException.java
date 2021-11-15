package com.nsp.project.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class InstituteApplicationNotFoundException extends RuntimeException {
	
	public InstituteApplicationNotFoundException(String message) {
		super(message);
	}
}
