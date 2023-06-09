package com.proj2vev;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ClientContoller implements IClientController {
  @Override
  public String getAdvice() throws Exception {
    Client client = new Client();
    Request request = new Request();

    try {
      String response = client.sendRequest(request);
      
      Gson gson = new Gson();
      JsonObject jsonObject = gson.fromJson(response, JsonObject.class);

      String advice = jsonObject.getAsJsonObject("slip").get("advice").getAsString();

      return "Advice: " + advice;
    } catch (Exception e) {
      return "Erro na solicitação: " + e.getMessage();
    }
  }
}
