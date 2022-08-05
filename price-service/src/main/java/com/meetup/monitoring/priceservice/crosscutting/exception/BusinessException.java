package com.meetup.monitoring.priceservice.crosscutting.exception;

public class BusinessException extends Exception {

  public BusinessException(String message) {
    super(message);
  }
}
