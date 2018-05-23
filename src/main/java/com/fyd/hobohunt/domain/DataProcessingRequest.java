package com.fyd.hobohunt.domain;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode(exclude = {"startDate", "endDate"}, callSuper = false)
public class DataProcessingRequest{
	@NotNull(message ="Vacation type can not be null")
	@Size(max =3, min =3)
	private String vacationType;
	@Valid
	private Country country;
	private State state;
	@NotNull(message ="Cities can not be null")
	@Size(min = 1)
	private List<String> cities;
	private Integer noOfPerson;
	private Date startDate;
	private Date endDate;
	
	
	
}
