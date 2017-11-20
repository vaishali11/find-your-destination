package com.fyd.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class DataProcessingResponseDomain {
	private String vacationType;
	private Country country;
	private State state;
	private List<String> cities;
	private Integer noOfPerson;
	private Date startDate;
	private Date endDate;
}
