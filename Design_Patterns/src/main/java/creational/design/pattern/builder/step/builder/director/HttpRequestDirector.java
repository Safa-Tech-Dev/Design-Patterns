package creational.design.pattern.builder.step.builder.director;

import creational.design.pattern.builder.director.builder.builder.HttpRequest;

public class HttpRequestDirector {

    public static HttpRequest createGetRequest(String url){

        return new HttpRequest.HttpRequestBuilder()
                .withUrl(url)
                .withMethod("GET")
                .withBody("{ \"name\": \"Saddam\" }")
                .build();
    }
    public static HttpRequest createJsonPostRequest(String url, String jsonBody){

        return new HttpRequest.HttpRequestBuilder()
                .withUrl(url)
                .withMethod("POST")
                .withHeaders("Content-Type: application/json")
                .withHeaders("Accept: application/json")
                .withBody(jsonBody)
                .build();
    }
}
