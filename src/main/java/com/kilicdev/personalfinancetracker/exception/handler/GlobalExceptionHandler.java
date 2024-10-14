package com.kilicdev.personalfinancetracker.exception.handler;

import com.kilicdev.personalfinancetracker.controller.response.Error;
import com.kilicdev.personalfinancetracker.controller.response.LoginResponse;
import com.kilicdev.personalfinancetracker.enums.ErrorCode;
import com.kilicdev.personalfinancetracker.exception.custom.InvalidCredentialsException;
import com.kilicdev.personalfinancetracker.exception.custom.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(InvalidCredentialsException.class)
  public ResponseEntity<LoginResponse> handleInvalidCredentialsException(
      InvalidCredentialsException ex) {
    LoginResponse response = new LoginResponse();
    ErrorCode errorCode = ErrorCode.INVALID_CREDENTIALS;

    Error error = new Error(errorCode.getCode(), errorCode.getTitle(), errorCode.getMessage());
    response.setError(error);
    response.setResult(false);

    return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);
  }

  @ExceptionHandler(UserNotFoundException.class)
  public ResponseEntity<LoginResponse> handleUserNotFoundException(UserNotFoundException ex) {
    LoginResponse response = new LoginResponse();
    ErrorCode errorCode = ErrorCode.USER_NOT_FOUND;

    Error error = new Error(errorCode.getCode(), errorCode.getTitle(), errorCode.getMessage());
    response.setError(error);
    response.setResult(false);

    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
  }
}
