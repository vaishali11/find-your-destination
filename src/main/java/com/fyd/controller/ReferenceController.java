package com.fyd.controller;

import java.util.List;

import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fyd.domain.DestinationTypeDomain;
import com.fyd.domain.GroupTypeDomain;
import com.fyd.domain.MoodTypeDomain;
import com.fyd.domain.VacationTypeDomain;
import com.fyd.service.ReferenceService;

@RestController
@RequestMapping("/v1/reference/")
public class ReferenceController {

	@Autowired
	private ReferenceService referenceService;

	@GetMapping(path = "/vacation-types", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<VacationTypeDomain> getVacationTypes(
			@RequestParam(required = false) @Size(min = 1) String vacationTypeCode) {
		return referenceService.getVacationTypes(vacationTypeCode);
	}

	@GetMapping(path = "/destination-types", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<DestinationTypeDomain> getDestinationTypes(
			@RequestParam(required = false) @Size(min = 1) String vacationTypeCode) {
		return referenceService.getDestinationTypes(vacationTypeCode);
	}

	@GetMapping(path = "/group-types", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<GroupTypeDomain> getGroupTypes(@RequestParam(required = false) @Size(min = 1) String vacationTypeCode) {
		return referenceService.getGroupTypes(vacationTypeCode);
	}

	@GetMapping(path = "/mood-types", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<MoodTypeDomain> getMoodTypes(@RequestParam(required = false) @Size(min = 1) String vacationTypeCode) {
		return referenceService.getMoodTypes(vacationTypeCode);
	}

}
