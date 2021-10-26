package com.rorschach.staybooking.exception;

public class GeoEncodingException extends RuntimeException {
    public GeoEncodingException(String message) {
        super(message);
    }
}