package org.apache.http.protocol;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.params.HttpProtocolParams;

@Deprecated
public class RequestUserAgent implements HttpRequestInterceptor {
    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        String userAgent;
        if (httpRequest == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (!httpRequest.containsHeader(HTTP.USER_AGENT) && (userAgent = HttpProtocolParams.getUserAgent(httpRequest.getParams())) != null) {
            httpRequest.addHeader(HTTP.USER_AGENT, userAgent);
        }
    }
}
