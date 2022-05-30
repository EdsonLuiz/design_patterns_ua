package com.edson.adapter;

public class App {
  public static void main(String[] args) {
    String webhost = "Host: https://google.com\n\r";
    WebService service = new WebService(webhost);
    WebAdapter adapter = new WebAdapter();
    adapter.connect(service);
    WebClient client = new WebClient(adapter);
    client.doWork();
  }
}
