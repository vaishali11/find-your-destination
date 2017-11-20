package com.fyd.service;

import java.util.List;

import com.fyd.domain.VacationTypeDomain;

public interface ReferenceService {
	public List<VacationTypeDomain> getVacationTypes(String vacationTypeCode);
}
