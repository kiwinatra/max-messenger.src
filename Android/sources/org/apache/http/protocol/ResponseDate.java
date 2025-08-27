package org.apache.http.protocol;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;

@Deprecated
public class ResponseDate implements HttpResponseInterceptor {
    private static final HttpDateGenerator DATE_GENERATOR = new HttpDateGenerator();

    public void process(HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        if (httpResponse == null) {
            throw new IllegalArgumentException("HTTP response may not be null.");
        } else if (httpResponse.getStatusLine().getStatusCode() >= 200 && !httpResponse.containsHeader(HTTP.DATE_HEADER)) {
            httpResponse.setHeader(HTTP.DATE_HEADER, DATE_GENERATOR.getCurrentDate());
        }
    }
}
