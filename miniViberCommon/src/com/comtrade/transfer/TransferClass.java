package com.comtrade.transfer;

import java.io.Serializable;

public class TransferClass implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int operation;
	private Object clientObject;
	private Object serverObject;
	private String serverMessage;

	public int getOperation() {
		return operation;
	}

	public void setOperation(int operation) {
		this.operation = operation;
	}

	public Object getClientObject() {
		return clientObject;
	}

	public void setClientObject(Object clientObject) {
		this.clientObject = clientObject;
	}

	public Object getServerObject() {
		return serverObject;
	}

	public void setServerObject(Object serverObject) {
		this.serverObject = serverObject;
	}

	public String getServerMessage() {
		return serverMessage;
	}

	public void setServerMessage(String serverMessage) {
		this.serverMessage = serverMessage;
	}

}
