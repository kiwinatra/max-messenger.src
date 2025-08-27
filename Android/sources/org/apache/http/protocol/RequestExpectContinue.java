package org.apache.http.protocol;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpException;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolVersion;
import org.apache.http.params.HttpProtocolParams;

@Deprecated
public class RequestExpectContinue implements HttpRequestInterceptor {
    public void process(HttpRequest httpRequest, HttpContext httpContext) throws HttpException, IOException {
        HttpEntity entity;
        if (httpRequest == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if ((httpRequest instanceof HttpEntityEnclosingRequest) && (entity = ((HttpEntityEnclosingRequest) httpRequest).getEntity()) != null && entity.getContentLength() != 0) {
            ProtocolVersion protocolVersion = httpRequest.getRequestLine().getProtocolVersion();
            if (HttpProtocolParams.useExpectContinue(httpRequest.getParams()) && !protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
                httpRequest.addHeader(HTTP.EXPECT_DIRECTIVE, HTTP.EXPECT_CONTINUE);
            }
        }
    }
}
