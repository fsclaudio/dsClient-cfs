package com.cfs.dsClient.services.exceptions;

public class EntityNotFoundPerException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public EntityNotFoundPerException(String msg) {
		super(msg);
		
	}

}
