package com.edson.adapter;

public class WebAdapter implements WebRequester {
  private WebService service;

  public void connect(WebService currentService) {
    this.service = currentService;
  }

  @Override
  public int request(Object request) {
    Json result = this.toJson(request);
    Json response = service.request(result);
    if(response != null) {
      return 200;
    }
    return 500;
  }

  private Json toJson(Object input) {
    return new Json();
  }
  
}

class Json {}
