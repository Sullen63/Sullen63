package com.PetClinic.pethealth.model;

public class Scheduled {

	Integer code;
	String message;
	
	public Scheduled() {
		
	}

	public Scheduled(Integer code, String message) {

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
		return "Scheduled [code=" + code + ", message=" + message + "]";
	}
	
}
