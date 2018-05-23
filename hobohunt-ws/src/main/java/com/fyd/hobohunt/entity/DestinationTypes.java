package com.fyd.hobohunt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "destination_types")
public class DestinationTypes {

	@Id
	@GeneratedValue
	@Column(name = "destination_type_id")
	private Long destinationTypeId;

	@Column(name = "destination_type_code")
	private String destinationTypeCode;

	@Column(name = "destination_type_description")
	private String destinationTypeDesc;
}
