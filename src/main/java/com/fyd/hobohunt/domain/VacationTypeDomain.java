package com.fyd.hobohunt.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VacationTypeDomain {
	
	private Long vacationTypeId;
	
	private String vacationTypeCode;
	
	private String vacationTypeDesc;
	
}
