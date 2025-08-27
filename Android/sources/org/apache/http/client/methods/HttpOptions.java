package org.apache.http.client.methods;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;
import org.apache.http.HeaderElement;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpResponse;

@Deprecated
public class HttpOptions extends HttpRequestBase {
    public static final String METHOD_NAME = "OPTIONS";

    public HttpOptions() {
    }

    public Set<String> getAllowedMethods(HttpResponse httpResponse) {
        if (httpResponse != null) {
            HeaderIterator headerIterator = httpResponse.headerIterator("Allow");
            HashSet hashSet = new HashSet();
            while (headerIterator.hasNext()) {
                for (HeaderElement name : headerIterator.nextHeader().getElements()) {
                    hashSet.add(name.getName());
                }
            }
            return hashSet;
        }
        throw new IllegalArgumentException("HTTP response may not be null");
    }

    public String getMethod() {
        return METHOD_NAME;
    }

    public HttpOptions(URI uri) {
        setURI(uri);
    }

    public HttpOptions(String str) {
        setURI(URI.create(str));
    }
}
