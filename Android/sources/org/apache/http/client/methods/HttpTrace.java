package org.apache.http.client.methods;

import java.net.URI;

@Deprecated
public class HttpTrace extends HttpRequestBase {
    public static final String METHOD_NAME = "TRACE";

    public HttpTrace() {
    }

    public String getMethod() {
        return METHOD_NAME;
    }

    public HttpTrace(URI uri) {
        setURI(uri);
    }

    public HttpTrace(String str) {
        setURI(URI.create(str));
    }
}
