package com.fyd.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fyd.domain.DestinationTypeDomain;
import com.fyd.domain.GroupTypeDomain;
import com.fyd.domain.MoodTypeDomain;
import com.fyd.domain.VacationTypeDomain;
import com.fyd.repository.DestinationTypesRepository;
import com.fyd.repository.GroupTypesRepository;
import com.fyd.repository.MoodTypesRepository;
import com.fyd.repository.VacationTypesRepository;

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
