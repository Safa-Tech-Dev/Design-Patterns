package creational.design.pattern.builder.simple.builder.client;

import creational.design.pattern.builder.simple.builder.builder.HttpRequest;

public class Client {

    static void main() {

        HttpRequest request = new HttpRequest.HttpRequestBuilder()
                .withUrl("https://api.example.com/users")
                .withMethod("POST")
                .withHeaders("Content-Type: application/json")
                .withBody("{ \"name\": \"Saddam\" }")
                .build();

        request.send();
    }
}
