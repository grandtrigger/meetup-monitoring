package com.meetup.monitoring.productservice.crosscutting.exception;

public class BusinessException extends Exception {

  public BusinessException(String message) {
    super(message);
  }
}
