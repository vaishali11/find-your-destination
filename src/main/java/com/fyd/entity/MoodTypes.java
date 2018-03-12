package com.fyd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "mood_types")
public class MoodTypes {

	@Id
	@GeneratedValue
	@Column(name = "mood_type_id")
	private Long moodTypeId;

	@Column(name = "mood_type_code")
	private String moodTypeCode;

	@Column(name = "mood_type_description")
	private String moodTypeDesc;
	
}
