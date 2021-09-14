package com.tis.mx.infraestructure.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.tis.mx.application.controller.CalculatorInputException;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler({CalculatorInputException.class})
  public ResponseEntity<ErrorResponse> badRequest(
      CalculatorInputException calculatorInputException) {
    return new ResponseEntity<>(new ErrorResponse(1001, calculatorInputException.getMessage(),
        "input validation","reenvie la peticion con valores de invercion correcto"),
        HttpStatus.BAD_REQUEST);
  }
  
  @ExceptionHandler({Exception.class})
  public ResponseEntity<ErrorResponse> internalServerException(
      Exception serverException) {
    return new ResponseEntity<>(
        new ErrorResponse(1001, serverException.getMessage(), "input validation",
            "error interno"),
        HttpStatus.INTERNAL_SERVER_ERROR);
  }

 
}
