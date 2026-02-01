package creational.design.pattern.builder.director.builder.client;

import creational.design.pattern.builder.director.builder.builder.HttpRequest;
import creational.design.pattern.builder.director.builder.director.HttpRequestDirector;

public class Client {

    static void main() {

        // Normal request from Builder directly
        HttpRequest request = new HttpRequest.HttpRequestBuilder()
                .withUrl("https://api.example.com/users")
                .withMethod("POST")
                .withHeaders("Content-Type: application/json")
                .withBody("{ \"name\": \"Saddam\" }")
                .build();

        request.send();
        IO.println("***********************************************************");

        // from director : create Get requet
        HttpRequest request1 = HttpRequestDirector.createGetRequest("https://api.example.com/users");
        request1.send();

        IO.println("***********************************************************");

        // from director : create Json Post Request
        HttpRequest request2 = HttpRequestDirector.createJsonPostRequest("https://api.example.com/users", "{ \"name\": \"Saddam\" }");
        request2.send();
    }
}
