package com.douglas.os.resources.exceptions;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FieldMessage implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String filedName;
	private String message;
	
	

}
