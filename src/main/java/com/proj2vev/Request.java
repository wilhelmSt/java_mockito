package com.proj2vev;

public class Request implements IRequest {
  @Override
  public String getURL() {
    return "https://api.adviceslip.com/advice/116";
  }
}
