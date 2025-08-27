package com.facebook.common.util;

public class ExceptionWithNoStacktrace extends Exception {
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
