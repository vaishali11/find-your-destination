package com.fyd.hobohunt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fyd.hobohunt.domain.DestinationTypeDomain;
import com.fyd.hobohunt.entity.DestinationTypes;

@Repository
public interface DestinationTypesRepository extends JpaRepository<DestinationTypes, Long> {

	String DEFAULT_QUERY = "SELECT new com.fyd.hobohunt.domain.DestinationTypeDomain(d.destinationTypeId, "
			+ "d.destinationTypeCode, d.destinationTypeDesc) FROM DestinationTypes d";

	@Query(DEFAULT_QUERY + " WHERE d.destinationTypeCode = :destinationTypeCode")
	public List<DestinationTypeDomain> findByDestinationTypeCode(
			@Param(value = "destinationTypeCode") String destinationTypeCode);

	@Query(DEFAULT_QUERY)
	public List<DestinationTypeDomain> findAllValues();

	
}
