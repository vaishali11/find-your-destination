package com.fyd.hobohunt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fyd.hobohunt.domain.MoodTypeDomain;
import com.fyd.hobohunt.entity.MoodTypes;

@Repository
public interface MoodTypesRepository extends JpaRepository<MoodTypes, Long> {

	String DEFAULT_QUERY = "SELECT new com.fyd.hobohunt.domain.MoodTypeDomain(m.moodTypeId, "
			+ "m.moodTypeCode, m.moodTypeDesc) FROM MoodTypes m";

	@Query(DEFAULT_QUERY + " WHERE m.moodTypeCode = :moodTypeCode")
	public List<MoodTypeDomain> findByMoodTypeCode(@Param(value = "moodTypeCode") String moodTypeCode);

	@Query(DEFAULT_QUERY)
	public List<MoodTypeDomain> findAllValues();

}
