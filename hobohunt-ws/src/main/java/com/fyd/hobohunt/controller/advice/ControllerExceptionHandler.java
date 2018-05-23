package com.fyd.hobohunt.controller.advice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.fyd.hobohunt.domain.ErrorObject;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
public class ControllerExceptionHandler {

	/**
	 * It is a global exception handler for the uncaught Exception
	 * 
	 * @param e
	 * @return {@link List} of {@link ErrorObject}
	 */
	@ResponseBody
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public List<ErrorObject> handleException(Exception e) {
		log.error("Error occured: {}", e);
		List<ErrorObject> errorObjects = new ArrayList<>();
		errorObjects.add(new ErrorObject("FYD001", e.getMessage()));
		return errorObjects;

	}
}
