package com.fyd.controller;

import java.util.List;

import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fyd.domain.VacationTypeDomain;
import com.fyd.service.ReferenceService;

@RestController
@RequestMapping("/v1/references/")
public class ReferenceController {
	@Autowired
	ReferenceService rService;
	
	@RequestMapping("/getVacationTypes")
	public List<VacationTypeDomain> getVacationTypes(@RequestParam(required = false) @Size(min = 1)  String vacationTypeCode){
		return rService.getVacationTypes(vacationTypeCode);
	}
	
}
