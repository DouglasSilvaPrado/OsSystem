package com.douglas.os.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class ValidationError extends StandardError {

	private static final long serialVersionUID = 1L;
	
	private List<FieldMessage> errors = new ArrayList<>();
	
	
	
	public void addError(String fieldName, String message) {
		this.errors.add(new FieldMessage(fieldName, message));
	}


	public ValidationError(Long timestamp, Integer status, String error) {
		super(timestamp, status, error);
	}
}
