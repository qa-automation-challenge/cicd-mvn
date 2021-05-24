package com.celfocus.qa.cicd.training.exceptions;

public class NoMessageException extends Exception {
  public NoMessageException() {
    super("No message received, please send a message as the argument.");
  }
}
