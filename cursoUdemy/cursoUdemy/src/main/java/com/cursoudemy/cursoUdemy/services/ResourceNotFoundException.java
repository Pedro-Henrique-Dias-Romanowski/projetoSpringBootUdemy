package com.cursoudemy.cursoUdemy.services;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Resource not found. Id:" + id);
    }
}
