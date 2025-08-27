package org.apache.http.impl.entity;

import org.apache.http.Header;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.HttpVersion;
import org.apache.http.ProtocolException;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.protocol.HTTP;

@Deprecated
public class StrictContentLengthStrategy implements ContentLengthStrategy {
    public long determineLength(HttpMessage httpMessage) throws HttpException {
        if (httpMessage != null) {
            Header firstHeader = httpMessage.getFirstHeader(HTTP.TRANSFER_ENCODING);
            Header firstHeader2 = httpMessage.getFirstHeader(HTTP.CONTENT_LEN);
            if (firstHeader != null) {
                String value = firstHeader.getValue();
                if (HTTP.CHUNK_CODING.equalsIgnoreCase(value)) {
                    if (!httpMessage.getProtocolVersion().lessEquals(HttpVersion.HTTP_1_0)) {
                        return -2;
                    }
                    throw new ProtocolException("Chunked transfer encoding not allowed for " + httpMessage.getProtocolVersion());
                } else if (HTTP.IDENTITY_CODING.equalsIgnoreCase(value)) {
                    return -1;
                } else {
                    throw new ProtocolException(a81.m("Unsupported transfer encoding: ", value));
                }
            } else if (firstHeader2 == null) {
                return -1;
            } else {
                String value2 = firstHeader2.getValue();
                try {
                    return Long.parseLong(value2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException(a81.m("Invalid content length: ", value2));
                }
            }
        } else {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
    }
}
