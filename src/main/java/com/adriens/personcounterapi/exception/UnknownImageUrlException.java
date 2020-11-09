package com.adriens.personcounterapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND) // Marks it as a 404 error
public class UnknownImageUrlException extends RuntimeException {
	private static final long serialVersionUID = 1L; // Serial Version UID

	public UnknownImageUrlException(String exception) {
        super(exception);
    }
}
