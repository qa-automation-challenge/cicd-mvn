package com.celfocus.qa.cicd.training;

import com.celfocus.qa.cicd.training.exceptions.NoMessageException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

  private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

  public static void main(String[] args) throws NoMessageException {
    LOGGER.log(Level.SEVERE, MessageReceiver.acknowledge(args));
  }

}
