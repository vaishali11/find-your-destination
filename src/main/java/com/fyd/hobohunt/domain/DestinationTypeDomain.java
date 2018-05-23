package com.fyd.hobohunt.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DestinationTypeDomain {

	private Long destinationTypeId;

	private String destinationTypeCode;

	private String destinationTypeDesc;

}
