package org.apache.http.message;

import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
public class BasicLineFormatter implements LineFormatter {
    public static final BasicLineFormatter DEFAULT = new BasicLineFormatter();

    public static final String formatHeader(Header header, LineFormatter lineFormatter) {
        if (lineFormatter == null) {
            lineFormatter = DEFAULT;
        }
        return lineFormatter.formatHeader((CharArrayBuffer) null, header).toString();
    }

    public static final String formatProtocolVersion(ProtocolVersion protocolVersion, LineFormatter lineFormatter) {
        if (lineFormatter == null) {
            lineFormatter = DEFAULT;
        }
        return lineFormatter.appendProtocolVersion((CharArrayBuffer) null, protocolVersion).toString();
    }

    public static final String formatRequestLine(RequestLine requestLine, LineFormatter lineFormatter) {
        if (lineFormatter == null) {
            lineFormatter = DEFAULT;
        }
        return lineFormatter.formatRequestLine((CharArrayBuffer) null, requestLine).toString();
    }

    public static final String formatStatusLine(StatusLine statusLine, LineFormatter lineFormatter) {
        if (lineFormatter == null) {
            lineFormatter = DEFAULT;
        }
        return lineFormatter.formatStatusLine((CharArrayBuffer) null, statusLine).toString();
    }

    public CharArrayBuffer appendProtocolVersion(CharArrayBuffer charArrayBuffer, ProtocolVersion protocolVersion) {
        if (protocolVersion != null) {
            int estimateProtocolVersionLen = estimateProtocolVersionLen(protocolVersion);
            if (charArrayBuffer == null) {
                charArrayBuffer = new CharArrayBuffer(estimateProtocolVersionLen);
            } else {
                charArrayBuffer.ensureCapacity(estimateProtocolVersionLen);
            }
            charArrayBuffer.append(protocolVersion.getProtocol());
            charArrayBuffer.append('/');
            charArrayBuffer.append(Integer.toString(protocolVersion.getMajor()));
            charArrayBuffer.append('.');
            charArrayBuffer.append(Integer.toString(protocolVersion.getMinor()));
            return charArrayBuffer;
        }
        throw new IllegalArgumentException("Protocol version may not be null");
    }

    public void doFormatHeader(CharArrayBuffer charArrayBuffer, Header header) {
        String name = header.getName();
        String value = header.getValue();
        int length = name.length() + 2;
        if (value != null) {
            length += value.length();
        }
        charArrayBuffer.ensureCapacity(length);
        charArrayBuffer.append(name);
        charArrayBuffer.append(": ");
        if (value != null) {
            charArrayBuffer.append(value);
        }
    }

    public void doFormatRequestLine(CharArrayBuffer charArrayBuffer, RequestLine requestLine) {
        String method = requestLine.getMethod();
        String uri = requestLine.getUri();
        int length = uri.length();
        charArrayBuffer.ensureCapacity(estimateProtocolVersionLen(requestLine.getProtocolVersion()) + length + method.length() + 1 + 1);
        charArrayBuffer.append(method);
        charArrayBuffer.append(' ');
        charArrayBuffer.append(uri);
        charArrayBuffer.append(' ');
        appendProtocolVersion(charArrayBuffer, requestLine.getProtocolVersion());
    }

    public void doFormatStatusLine(CharArrayBuffer charArrayBuffer, StatusLine statusLine) {
        int estimateProtocolVersionLen = estimateProtocolVersionLen(statusLine.getProtocolVersion()) + 5;
        String reasonPhrase = statusLine.getReasonPhrase();
        if (reasonPhrase != null) {
            estimateProtocolVersionLen += reasonPhrase.length();
        }
        charArrayBuffer.ensureCapacity(estimateProtocolVersionLen);
        appendProtocolVersion(charArrayBuffer, statusLine.getProtocolVersion());
        charArrayBuffer.append(' ');
        charArrayBuffer.append(Integer.toString(statusLine.getStatusCode()));
        charArrayBuffer.append(' ');
        if (reasonPhrase != null) {
            charArrayBuffer.append(reasonPhrase);
        }
    }

    public int estimateProtocolVersionLen(ProtocolVersion protocolVersion) {
        return protocolVersion.getProtocol().length() + 4;
    }

    public CharArrayBuffer initBuffer(CharArrayBuffer charArrayBuffer) {
        if (charArrayBuffer == null) {
            return new CharArrayBuffer(64);
        }
        charArrayBuffer.clear();
        return charArrayBuffer;
    }

    public CharArrayBuffer formatHeader(CharArrayBuffer charArrayBuffer, Header header) {
        if (header == null) {
            throw new IllegalArgumentException("Header may not be null");
        } else if (header instanceof FormattedHeader) {
            return ((FormattedHeader) header).getBuffer();
        } else {
            CharArrayBuffer initBuffer = initBuffer(charArrayBuffer);
            doFormatHeader(initBuffer, header);
            return initBuffer;
        }
    }

    public CharArrayBuffer formatRequestLine(CharArrayBuffer charArrayBuffer, RequestLine requestLine) {
        if (requestLine != null) {
            CharArrayBuffer initBuffer = initBuffer(charArrayBuffer);
            doFormatRequestLine(initBuffer, requestLine);
            return initBuffer;
        }
        throw new IllegalArgumentException("Request line may not be null");
    }

    public CharArrayBuffer formatStatusLine(CharArrayBuffer charArrayBuffer, StatusLine statusLine) {
        if (statusLine != null) {
            CharArrayBuffer initBuffer = initBuffer(charArrayBuffer);
            doFormatStatusLine(initBuffer, statusLine);
            return initBuffer;
        }
        throw new IllegalArgumentException("Status line may not be null");
    }
}
