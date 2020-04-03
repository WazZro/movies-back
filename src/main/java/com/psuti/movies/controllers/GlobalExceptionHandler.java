//package com.psuti.movies.controllers;
//
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//import javax.servlet.http.HttpServletResponse;
//import javax.validation.ConstraintViolationException;
//import java.io.IOException;
//
////TODO handler doesnt work
//@ControllerAdvice
//public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
////    @ExceptionHandler(ConstraintViolationException.class)
////    public ResponseEntity<Object> constraintViolationException(RuntimeException ex, WebRequest request) {
////        System.out.println("here");
////        return handleExceptionInternal(ex, "Test error", new HttpHeaders(), HttpStatus.BAD_REQUEST, request);
////    }
//}
