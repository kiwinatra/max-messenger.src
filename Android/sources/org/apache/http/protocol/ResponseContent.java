package org.apache.http.protocol;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseInterceptor;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;

@Deprecated
public class ResponseContent implements HttpResponseInterceptor {
    public void process(HttpResponse httpResponse, HttpContext httpContext) throws HttpException, IOException {
        if (httpResponse == null) {
            throw new IllegalArgumentException("HTTP request may not be null");
        } else if (httpResponse.containsHeader(HTTP.TRANSFER_ENCODING)) {
            throw new ProtocolException("Transfer-encoding header already present");
        } else if (!httpResponse.containsHeader(HTTP.CONTENT_LEN)) {
            ProtocolVersion protocolVersion = httpResponse.getStatusLine().getProtocolVersion();
            HttpEntity entity = httpResponse.getEntity();
            if (entity != null) {
                long contentLength = entity.getContentLength();
                if (entity.isChunked() && !protocolVersion.lessEquals(HttpVersion.HTTP_1_0)) {
                    httpResponse.addHeader(HTTP.TRANSFER_ENCODING, HTTP.CHUNK_CODING);
                } else if (contentLength >= 0) {
                    httpResponse.addHeader(HTTP.CONTENT_LEN, Long.toString(entity.getContentLength()));
                }
                if (entity.getContentType() != null && !httpResponse.containsHeader(HTTP.CONTENT_TYPE)) {
                    httpResponse.addHeader(entity.getContentType());
                }
                if (entity.getContentEncoding() != null && !httpResponse.containsHeader(HTTP.CONTENT_ENCODING)) {
                    httpResponse.addHeader(entity.getContentEncoding());
                    return;
                }
                return;
            }
            int statusCode = httpResponse.getStatusLine().getStatusCode();
            if (statusCode != 204 && statusCode != 304 && statusCode != 205) {
                httpResponse.addHeader(HTTP.CONTENT_LEN, "0");
            }
        } else {
            throw new ProtocolException("Content-Length header already present");
        }
    }
}
