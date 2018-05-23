package com.fyd.hobohunt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "group_types")
public class GroupTypes {

	@Id
	@GeneratedValue
	@Column(name = "group_type_id")
	private Long groupTypeId;

	@Column(name = "group_type_code")
	private String groupTypeCode;

	@Column(name = "group_type_description")
	private String groupTypeDesc;
}
