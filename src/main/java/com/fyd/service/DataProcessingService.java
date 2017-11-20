package com.fyd.service;


import com.fyd.domain.DataProcessingRequestDomain;
import com.fyd.domain.DataProcessingResponseDomain;

public interface DataProcessingService {
	public DataProcessingResponseDomain processData(DataProcessingRequestDomain request);
}
