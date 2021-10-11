package com.example.erropersonalizado.resource.exception;

import java.time.Instant;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.erropersonalizado.service.exception.ErroPersonalizado;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ErroPersonalizado.class)
	public ResponseEntity<StandardError> ErroPersonalizado(ErroPersonalizado e, HttpServletRequest request) {
		
		StandardError err = new StandardError();
		err.setTimestamp(Instant.now());
		err.setStatus(HttpStatus.BAD_REQUEST.value());
		err.setError(e.getMessage());
		err.setPath(request.getRequestURI());
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(err);
	}
	
}
