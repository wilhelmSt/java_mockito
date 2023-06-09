package com.proj2vev;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClientTest {
  @Test
  public void shouldReturnRequest() throws Exception {
    Client client = new Client();
    Request request = new Request();

    assertEquals(
        "If is equals: ",
        "{\"slip\": { \"id\": 116, \"advice\": \"One of the top five regrets people have is that they didn't stay in contact with friends.\"}}", 
        client.sendRequest(request)
      );
  }
}
