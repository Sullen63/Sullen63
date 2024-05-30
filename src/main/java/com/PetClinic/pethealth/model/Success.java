package com.PetClinic.pethealth.model;

public class Success {

	Integer code;
	String message;
	
	public Success() {
		
}
	
	public Success(Integer code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Success [code=" + code + ", message=" + message + "]";
	}
	
}
