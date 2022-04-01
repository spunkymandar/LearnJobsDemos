package com.example.demo.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.example.demo.ProductNotFoundException;

@ControllerAdvice
@RestController
public class MyExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	public final ResponseEntity<ExceptionResponse> handleException(ProductNotFoundException exception, WebRequest request){
		ExceptionResponse exceptionResponse=new ExceptionResponse(new Date(), exception.getMessage(),request.getDescription(false));
		
		return new ResponseEntity<ExceptionResponse>(exceptionResponse,HttpStatus.NOT_FOUND);
	}
	
//	@ExceptionHandler(ProductNotFoundException.class)
//	public final ResponseEntity<ExceptionResponse> handleException(ProductNotFoundException exception, WebRequest request) {
//		ExceptionResponse exceptionResponse=new ExceptionResponse(new Date(), exception.getMessage(), request.getDescription(false));
//		return new ResponseEntity<ExceptionResponse>(exceptionResponse,HttpStatus.NOT_FOUND);
//	}
}
