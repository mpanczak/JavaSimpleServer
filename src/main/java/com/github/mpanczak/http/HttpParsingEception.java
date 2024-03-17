package com.github.mpanczak.http;

public class HttpParsingEception extends Exception {

    private final HttpStatusCode errorCode;

    public HttpParsingEception(HttpStatusCode errorCode) {
        super(errorCode.MESSAGE);
        this.errorCode = errorCode;
    }

    public HttpStatusCode getErrorCode() {
        return errorCode;
    }
}
