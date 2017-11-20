package com.fyd.domain;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Country {
	@NotNull(message ="Country code can not be null")
	private String code;
	private String description;
}
