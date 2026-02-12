package creational.design.pattern.builder.step.builder.builder;

import creational.design.pattern.builder.step.builder.stepbuilder.HeadersStep;
import creational.design.pattern.builder.step.builder.stepbuilder.MethodStep;
import creational.design.pattern.builder.step.builder.stepbuilder.OptionalStep;
import creational.design.pattern.builder.step.builder.stepbuilder.UrlStep;

// Target (Product)
public class HttpRequest {

    private String url;
    private String method;
    private String headers;
    private String body;
    private Integer timeout;



    // Private constructor → only Builder can create it
    private HttpRequest(HttpRequestStepBuilder builder){

        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers;
        this.body = builder.body;
        this.timeout = builder.timeout;
    }


    public void send() {
        System.out.println("URL     : " + url);
        System.out.println("METHOD  : " + method);
        System.out.println("HEADERS : " + headers);
        System.out.println("BODY    : " + body);
        System.out.println("TIMEOUT    : " + timeout);
    }


    // ---------- BUILDER ---------- Inner class
    public static class HttpRequestStepBuilder implements UrlStep, MethodStep, HeadersStep, OptionalStep {

        private String url;
        private String method;
        private String headers;
        private String body;
        private Integer timeout;

        // method chaining
        // static method to start the building process
        public static UrlStep getBuilder(){
            return new HttpRequestStepBuilder();
        }
        @Override
        public OptionalStep body(String body) {

            this.body = body;
            return this;
        }

        @Override
        public OptionalStep timeout(Integer timeout) {

            if(timeout <= 0){
                throw new IllegalArgumentException("Timeout must be positive.");
            }
            this.timeout = timeout;
            return this;
        }

        @Override
        public OptionalStep headers(String headers) {

            this.headers = headers;
            return this;
        }

        @Override
        public HeadersStep method(String method) {

            this.method = method;
            return this;
        }

        @Override
        public MethodStep url(String url) {

            this.url = url;
            return this;
        }

        @Override
        public HttpRequest build() {

            if(this.url.isEmpty()){
                throw new IllegalArgumentException("URL can't be empty.");
            }
            return new HttpRequest(this);
        }

    }
}
