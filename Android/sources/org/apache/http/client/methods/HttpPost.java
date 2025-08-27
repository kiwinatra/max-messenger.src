package org.apache.http.client.methods;

import java.net.URI;

@Deprecated
public class HttpPost extends HttpEntityEnclosingRequestBase {
    public static final String METHOD_NAME = "POST";

    public HttpPost() {
    }

    public String getMethod() {
        return METHOD_NAME;
    }

    public HttpPost(URI uri) {
        setURI(uri);
    }

    public HttpPost(String str) {
        setURI(URI.create(str));
    }
}
