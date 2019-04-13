package com.dev.models;

import org.springframework.http.HttpStatus;

public class ResponseObject {
	HttpStatus status;
	String message;
	Object payload;
	
	
	public ResponseObject(HttpStatus status, String message, Object payload) {
		super();
		this.status = status;
		this.message = message;
		this.payload = payload;
	}
	
	
	public ResponseObject(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}


	public HttpStatus getStatus() {
		return status;
	}
	public void setStatus(HttpStatus status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getPayload() {
		return payload;
	}
	public void setPayload(Object payload) {
		this.payload = payload;
	}
	
	
}
