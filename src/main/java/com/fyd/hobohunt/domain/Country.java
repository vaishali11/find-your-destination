package com.fyd.hobohunt.domain;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Country {

	@NotNull(message = "Country code can not be null")
	private String code;

	private String description;
}
