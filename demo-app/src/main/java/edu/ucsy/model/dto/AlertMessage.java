package edu.ucsy.model.dto;

public class AlertMessage {

	private String message;
	private Type type;
	
	public AlertMessage(String message, Type type) {
		super();
		this.message = message;
		this.type = type;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public enum Type {
		ADDED, DELETED, EDITED
	}
}
