package com.github.mpanczak.http;

public class HttpRequest extends HttpMessage{

    private HttpMethod method;
    private HttpStatusCode requestTarget;
    private String httpVersion;

    HttpRequest(){
    }

    public HttpMethod getMethod() {
        return method;
    }

    void setMethod(HttpMethod method) {
        this.method = method;
    }
}
