package com.fyd.hobohunt.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.fyd.hobohunt.domain.DataProcessingRequest;
import com.fyd.hobohunt.domain.DataProcessingResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DataProcessingService {

	public DataProcessingResponse processData(DataProcessingRequest request) {

		DataProcessingRequest r = new DataProcessingRequest();
		// r = request;
		r.setVacationType("GRP");
		DataProcessingRequest rr = new DataProcessingRequest();
		// rr = request;
		// rr.setCities(Arrays.asList("DAL"));
		rr.setVacationType("GRP");
		Set<DataProcessingRequest> s = new HashSet<>();
		s.add(r);
		s.add(rr);
		s.add(request);

		log.info("{}", s);

		return new DataProcessingResponse();
	}
}
