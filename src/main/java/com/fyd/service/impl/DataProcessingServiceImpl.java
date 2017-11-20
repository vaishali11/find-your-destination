package com.fyd.service.impl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.fyd.domain.DataProcessingRequestDomain;
import com.fyd.domain.DataProcessingResponseDomain;
import com.fyd.service.DataProcessingService;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class DataProcessingServiceImpl implements DataProcessingService{
	
	public DataProcessingResponseDomain processData(DataProcessingRequestDomain request) {
		
		DataProcessingRequestDomain r = new DataProcessingRequestDomain();
//		r = request;
		r.setVacationType("GRP");
		DataProcessingRequestDomain rr = new DataProcessingRequestDomain();
//		rr = request;
//		rr.setCities(Arrays.asList("DAL"));
		rr.setVacationType("GRP");
		Set<DataProcessingRequestDomain> s = new HashSet<>();
		s.add(r);
		s.add(rr);
		s.add(request);
		
		log.info("{}", s);
		
		return new DataProcessingResponseDomain();
	}
}
