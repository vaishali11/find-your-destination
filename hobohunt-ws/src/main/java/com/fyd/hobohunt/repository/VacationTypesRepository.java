package com.fyd.hobohunt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fyd.hobohunt.domain.VacationTypeDomain;
import com.fyd.hobohunt.entity.VacationTypes;

@Repository
public interface VacationTypesRepository extends JpaRepository<VacationTypes, Long> {

	String defaultQuery = "SELECT new com.fyd.hobohunt.domain.VacationTypeDomain(v.vacationTypeId, "
			+ "v.vacationTypeCode, v.vacationTypeDesc) FROM VacationTypes v";

	@Query(defaultQuery + " WHERE v.vacationTypeCode = :vacationTypeCode")
	public List<VacationTypeDomain> findByVacationTypeCode(@Param(value = "vacationTypeCode") String code);

	@Query(defaultQuery)
	public List<VacationTypeDomain> findAllValues();

}
