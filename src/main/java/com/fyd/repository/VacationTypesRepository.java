package com.fyd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fyd.domain.VacationTypeDomain;
import com.fyd.entity.VacationTypes;

@Repository
public interface VacationTypesRepository extends JpaRepository<VacationTypes, Long>{
//	@Query("SELECT v FROM VacationTypes v WHERE v.vacationTypeCode = :vacationTypeCode")
//	public List<VacationTypes> findByVacationTypeCode(@Param(value = "vacationTypeCode") String vacationTypeCode);
	
	
	
	String defaultQuery = "SELECT new com.fyd.domain.VacationTypeDomain(v.vacationTypeId, "
			+ "v.vacationTypeCode, v.vacationTypeDesc) FROM VacationTypes v";
	
	@Query(defaultQuery + " WHERE v.vacationTypeCode = :vacationTypeCode")
	public List<VacationTypeDomain> findByVacationTypeCode(@Param(value = "vacationTypeCode")String code);

	@Query(defaultQuery)
	public List<VacationTypeDomain> findAllValues();
	
	
}
