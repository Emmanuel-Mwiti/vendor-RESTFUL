package com.emmanuelCloudVendor.two.demo.exception;

public class CloudVendorException {
    private String message;
    private final Throwable throwable;
    private String HttpStatus;

    public CloudVendorException(String message, Throwable throwable, org.springframework.http.HttpStatus httpStatus) {
        this.message = message;
        this.throwable = throwable;
        HttpStatus = String.valueOf(httpStatus);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public String getHttpStatus() {
        return HttpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        HttpStatus = httpStatus;
    }
}
