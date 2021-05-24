package com.celfocus.qa.cicd.training;

import com.celfocus.qa.cicd.training.exceptions.NoMessageException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MessageReceiverTest {

  @Test
  public void testAcknowledge_validMessage_shouldBeAcknowledged() throws NoMessageException {
    String[] args = {"message"};
    assertEquals("Ack: message", MessageReceiver.acknowledge(args));
  }

  @Test
  void testMain_noArguments_shouldThrowException()  {
    String[] args = new String[0];
    assertThrows( NoMessageException.class, () -> MessageReceiver.acknowledge(args));
  }

}