package com.fyd.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyd.domain.VacationTypeDomain;
import com.fyd.entity.VacationTypes;
import com.fyd.repository.VacationTypesRepository;
import com.fyd.service.ReferenceService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ReferenceServiceImpl implements ReferenceService{
	
	@Autowired
	VacationTypesRepository vacationTypesRepository;

	@Override
	public List<VacationTypeDomain> getVacationTypes(String vacationTypeCode) {
		// TODO Auto-generated method stub
		
		log.info("{}", vacationTypeCode);
		
		log.info("Call Vacation Types");
		
		return !StringUtils.isBlank(vacationTypeCode)
				? vacationTypesRepository.findByVacationTypeCode(vacationTypeCode)
				: vacationTypesRepository.findAllValues();	
		
	}

	
}
