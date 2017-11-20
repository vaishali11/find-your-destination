package com.fyd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "vacation_types")
public class VacationTypes {
	
	@Id
	@GeneratedValue
	@Column(name = "vacation_type_id")
	private Long vacationTypeId;

	@Column(name = "vacation_type_code")
	private String vacationTypeCode;

	@Column(name = "vacation_type_description")
	private String vacationTypeDesc;
}
