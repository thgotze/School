package org.example.exceptions;

public class NoCarsException extends RuntimeException {
  public NoCarsException(String message) {
    super(message);
  }
}