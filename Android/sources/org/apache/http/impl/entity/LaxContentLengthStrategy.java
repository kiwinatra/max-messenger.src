package org.apache.http.impl.entity;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;
import org.apache.http.ParseException;
import org.apache.http.ProtocolException;
import org.apache.http.entity.ContentLengthStrategy;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.protocol.HTTP;

@Deprecated
public class LaxContentLengthStrategy implements ContentLengthStrategy {
    public long determineLength(HttpMessage httpMessage) throws HttpException {
        long j;
        if (httpMessage != null) {
            boolean isParameterTrue = httpMessage.getParams().isParameterTrue(CoreProtocolPNames.STRICT_TRANSFER_ENCODING);
            Header firstHeader = httpMessage.getFirstHeader(HTTP.TRANSFER_ENCODING);
            Header firstHeader2 = httpMessage.getFirstHeader(HTTP.CONTENT_LEN);
            if (firstHeader != null) {
                try {
                    HeaderElement[] elements = firstHeader.getElements();
                    if (isParameterTrue) {
                        int i = 0;
                        while (i < elements.length) {
                            String name = elements[i].getName();
                            if (name == null || name.length() <= 0 || name.equalsIgnoreCase(HTTP.CHUNK_CODING) || name.equalsIgnoreCase(HTTP.IDENTITY_CODING)) {
                                i++;
                            } else {
                                throw new ProtocolException("Unsupported transfer encoding: ".concat(name));
                            }
                        }
                    }
                    int length = elements.length;
                    if (HTTP.IDENTITY_CODING.equalsIgnoreCase(firstHeader.getValue())) {
                        return -1;
                    }
                    if (length > 0 && HTTP.CHUNK_CODING.equalsIgnoreCase(elements[length - 1].getName())) {
                        return -2;
                    }
                    if (!isParameterTrue) {
                        return -1;
                    }
                    throw new ProtocolException("Chunk-encoding must be the last one applied");
                } catch (ParseException e) {
                    throw new ProtocolException("Invalid Transfer-Encoding header value: " + firstHeader, e);
                }
            } else {
                if (firstHeader2 != null) {
                    Header[] headers = httpMessage.getHeaders(HTTP.CONTENT_LEN);
                    if (!isParameterTrue || headers.length <= 1) {
                        int length2 = headers.length - 1;
                        while (true) {
                            if (length2 < 0) {
                                j = -1;
                                break;
                            }
                            Header header = headers[length2];
                            try {
                                j = Long.parseLong(header.getValue());
                                break;
                            } catch (NumberFormatException unused) {
                                if (!isParameterTrue) {
                                    length2--;
                                } else {
                                    throw new ProtocolException("Invalid content length: " + header.getValue());
                                }
                            }
                        }
                        if (j >= 0) {
                            return j;
                        }
                    } else {
                        throw new ProtocolException("Multiple content length headers");
                    }
                }
                return -1;
            }
        } else {
            throw new IllegalArgumentException("HTTP message may not be null");
        }
    }
}
