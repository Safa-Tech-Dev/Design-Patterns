package creational.design.pattern.builder.director.builder.builder;

// Target (Product)
public class HttpRequest {

    private String url;
    private String method;
    private String headers;
    private String body;



    // Private constructor → only Builder can create it
    private HttpRequest(HttpRequestBuilder builder){

        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers;
        this.body = builder.body;
    }


    public void send() {
        System.out.println("URL     : " + url);
        System.out.println("METHOD  : " + method);
        System.out.println("HEADERS : " + headers);
        System.out.println("BODY    : " + body);
    }


    // ---------- BUILDER ---------- Inner class
    public static class HttpRequestBuilder{

        private String url;
        private String method;
        private String headers;
        private String body;

        // method chaining
        // this keyword used here to return the reference of HttpRequestBuilder instance
        public HttpRequestBuilder withUrl(String url){

            this.url = url;
            return this;  // return the reference of HttpRequestBuilder instance
        }

        public HttpRequestBuilder withMethod(String method){

            this.method = method;
            return this;
        }

        public HttpRequestBuilder withHeaders(String headers){

            this.headers = headers;
            return this;
        }

        public HttpRequestBuilder withBody(String body){

            this.body = body;
            return this;
        }

        public HttpRequest build(){

            if(this.url.isEmpty()){

                throw new IllegalArgumentException("URL can't be empty");
            }
            return new HttpRequest(this);
        }

    }
}
