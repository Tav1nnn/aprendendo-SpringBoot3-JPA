package com.aprendendoSpring.couseSpring.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException (Object id) {
        super("Resource not foud id " + id);
    }
}
