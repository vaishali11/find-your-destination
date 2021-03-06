package com.fyd.hobohunt.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyd.hobohunt.domain.DestinationTypeDomain;
import com.fyd.hobohunt.domain.GroupTypeDomain;
import com.fyd.hobohunt.domain.MoodTypeDomain;
import com.fyd.hobohunt.domain.VacationTypeDomain;
import com.fyd.hobohunt.repository.DestinationTypesRepository;
import com.fyd.hobohunt.repository.GroupTypesRepository;
import com.fyd.hobohunt.repository.MoodTypesRepository;
import com.fyd.hobohunt.repository.VacationTypesRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ReferenceService {

	@Autowired
	private VacationTypesRepository vacationTypesRepository;

	@Autowired
	private DestinationTypesRepository destinationTypesRepository;

	@Autowired
	private GroupTypesRepository groupTypesRepository;

	@Autowired
	private MoodTypesRepository moodTypesRepository;

	public List<VacationTypeDomain> getVacationTypes(String vacationTypeCode) {
		log.debug("Vacation Type Code: {}", vacationTypeCode);
		return StringUtils.isNotBlank(vacationTypeCode)
				? vacationTypesRepository.findByVacationTypeCode(vacationTypeCode)
				: vacationTypesRepository.findAllValues();
	}

	public List<DestinationTypeDomain> getDestinationTypes(String destinationTypeCode) {
		log.debug("Destination Type Code: {}", destinationTypeCode);
		return StringUtils.isNotBlank(destinationTypeCode)
				? destinationTypesRepository.findByDestinationTypeCode(destinationTypeCode)
				: destinationTypesRepository.findAllValues();
	}

	public List<GroupTypeDomain> getGroupTypes(String groupTypeCode) {
		log.debug("Group Type Code: {}", groupTypeCode);
		return StringUtils.isNotBlank(groupTypeCode) ? groupTypesRepository.findByGroupTypeCode(groupTypeCode)
				: groupTypesRepository.findAllValues();
	}

	public List<MoodTypeDomain> getMoodTypes(String moodTypeCode) {
		log.debug("Mood Type Code: {}", moodTypeCode);
		return StringUtils.isNotBlank(moodTypeCode) ? moodTypesRepository.findByMoodTypeCode(moodTypeCode)
				: moodTypesRepository.findAllValues();
	}

}
