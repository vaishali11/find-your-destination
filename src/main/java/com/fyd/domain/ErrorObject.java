package com.fyd.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@JsonInclude(Include.NON_NULL)
public class ErrorObject implements Serializable {

	private static final long serialVersionUID = 1L;

	private String code;

	private String message;

	private String field;

	public ErrorObject() {
		super();
	}

	public ErrorObject(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public ErrorObject(String code, String message, String field) {
		super();
		this.code = code;
		this.message = message;
		this.field = field;
	}

}
