package org.apache.http.impl;

import org.apache.http.ConnectionReuseStrategy;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;

@Deprecated
public class NoConnectionReuseStrategy implements ConnectionReuseStrategy {
    public boolean keepAlive(HttpResponse httpResponse, HttpContext httpContext) {
        if (httpResponse == null) {
            throw new IllegalArgumentException("HTTP response may not be null");
        } else if (httpContext != null) {
            return false;
        } else {
            throw new IllegalArgumentException("HTTP context may not be null");
        }
    }
}
