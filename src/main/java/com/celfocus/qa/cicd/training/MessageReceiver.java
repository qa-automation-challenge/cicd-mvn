package com.celfocus.qa.cicd.training;

import com.celfocus.qa.cicd.training.exceptions.NoMessageException;

public class MessageReceiver {

  private MessageReceiver() {
  }

  public static String acknowledge(String[] args) throws NoMessageException {
    if (args.length < 1) {
      throw new NoMessageException();
    }
    return "Ack: " + args[0];
  }

}
