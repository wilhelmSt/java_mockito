package com.proj2vev;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RequestTest 
{
  @Test
  public void shouldReturnAPI() {
    Request request = new Request();
    String requested = request.getURL();

    assertEquals(
        "If is equals", 
        "https://api.adviceslip.com/advice/116",
        requested
      );
  }
}
