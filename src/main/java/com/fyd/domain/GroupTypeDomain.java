package com.fyd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupTypeDomain {
	
	private Long groupTypeId;

	private String groupTypeCode;

	private String groupTypeDesc;
	
}
