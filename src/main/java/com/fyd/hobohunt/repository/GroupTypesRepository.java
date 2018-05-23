package com.fyd.hobohunt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fyd.hobohunt.domain.GroupTypeDomain;
import com.fyd.hobohunt.entity.GroupTypes;

@Repository
public interface GroupTypesRepository extends JpaRepository<GroupTypes, Long> {

	String DEFAULT_QUERY = "SELECT new com.fyd.hobohunt.domain.GroupTypeDomain(g.groupTypeId, "
			+ "g.groupTypeCode, g.groupTypeDesc) FROM GroupTypes g";

	@Query(DEFAULT_QUERY + " WHERE g.groupTypeCode = :groupTypeCode")
	public List<GroupTypeDomain> findByGroupTypeCode(@Param(value = "groupTypeCode") String groupTypeCode);

	@Query(DEFAULT_QUERY)
	public List<GroupTypeDomain> findAllValues();

}
