package com.fyd.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MoodTypeDomain {
	
	private Long moodTypeId;

	private String moodTypeCode;

	private String moodTypeDesc;
	
}
