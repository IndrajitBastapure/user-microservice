package com.cisco.microservices.users;

/**
 * UserError type used to generate custom errors when there is any exceptions in the applications
 * 
 * @author Sandip Bastapure
 */
public class UserError {
	private String param;
	private String msg;
	private String value;

	public String getParam() {
		return param;
	}

	public void setParam(String param) {
		this.param = param;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
