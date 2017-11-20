package com.fyd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VacationTypeDomain {
	private Long vacationTypeId;
	private String vacationTypeCode;
	private String vacationTypeDesc;
}
