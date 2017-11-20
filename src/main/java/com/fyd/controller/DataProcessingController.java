package com.fyd.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fyd.domain.DataProcessingRequestDomain;
import com.fyd.domain.DataProcessingResponseDomain;
import com.fyd.service.DataProcessingService;

@RestController
@RequestMapping("/v1/process")
public class DataProcessingController {
	@Autowired
	DataProcessingService dService;
	
	@RequestMapping(value = "/processData", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public DataProcessingResponseDomain processData(@RequestBody @Valid DataProcessingRequestDomain request) {
		return dService.processData(request);
		
	}
	
}
