package com.proj2vev;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class Client implements IClient {
  @Override
  public String sendRequest(Request request) throws Exception {
    URI uri = new URI(request.getURL());
    URL url = uri.toURL();
    HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    connection.setRequestMethod("GET");

    BufferedReader reader = new BufferedReader(
      new InputStreamReader(connection.getInputStream())
    );
    StringBuilder response = new StringBuilder();
    String line;

    while ((line = reader.readLine()) != null) {
        response.append(line);
    }

    reader.close();
    connection.disconnect();

    return response.toString();
  }

}
