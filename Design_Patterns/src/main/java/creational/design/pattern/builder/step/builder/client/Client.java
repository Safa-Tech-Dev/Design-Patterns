package creational.design.pattern.builder.step.builder.client;


import creational.design.pattern.builder.step.builder.builder.HttpRequest;

public class Client {

    static void main() {

        // Only mandatory fields
        HttpRequest request1 = HttpRequest.HttpRequestStepBuilder
                .getBuilder()
                .url("https://api.example.com")
                .method("GET")
                .headers("Authorization=Bearer token")
                .build();

        request1.send();
        IO.println("-------------------------------------------------------------");
        // With body(optional)
        HttpRequest request2 = HttpRequest.HttpRequestStepBuilder
                .getBuilder()
                .url("https://api.example.com")
                .method("POST")
                .headers("Authorization=Bearer token")
                .body("{ \"name\": \"Saddam\" }")
                .build();
        request2.send();

        IO.println("-------------------------------------------------------------");

        // With timeout(optional)
        HttpRequest request3 = HttpRequest.HttpRequestStepBuilder
                .getBuilder()
                .url("https://api.example.com")
                .method("GET")
                .headers("Authorization=Bearer token")
                .timeout(5000)
                .build();

        request3.send();

        IO.println("-------------------------------------------------------------");

        // With both optional fields(body, timeout)
        HttpRequest request4 = HttpRequest.HttpRequestStepBuilder
                .getBuilder()
                .url("https://api.example.com")
                .method("POST")
                .headers("Authorization=Bearer token")
                .body("{ \"name\": \"Saddam\" }") // optional
                .timeout(5000) // optional
                .build();

        request4.send();
        IO.println("-------------------------------------------------------------");


    }
}
