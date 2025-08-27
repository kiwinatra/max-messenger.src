package com.facebook.imagepipeline.memory;

public class BasePool$InvalidSizeException extends RuntimeException {
    public BasePool$InvalidSizeException(Integer num) {
        super("Invalid size: " + num.toString());
    }
}
