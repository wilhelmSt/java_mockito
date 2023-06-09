package com.proj2vev;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.mockito.Mockito;

public class ClientControllerTest {
  @Test
  public void mockitoTestClient() throws Exception {
    Client clientMock = Mockito.mock(Client.class);
    Request request = new Request();
    String expected = "{\"slip\": { \"id\": 116, \"advice\": \"One of the top five regrets people have is that they didn't stay in contact with friends.\"}}";

    Mockito
      .when(clientMock.sendRequest(request))
      .thenReturn(expected);

    String result = clientMock.sendRequest(request);

    Mockito.verify(clientMock).sendRequest(request);

    assertEquals(
      "Mock test: ",
      expected,
      result
    );
  }
}
