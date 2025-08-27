package org.apache.http.impl.client;

import java.net.URI;
import java.net.URISyntaxException;
import org.apache.http.HttpRequest;
import org.apache.http.ProtocolException;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.message.AbstractHttpMessage;
import org.apache.http.message.BasicRequestLine;
import org.apache.http.params.HttpProtocolParams;

@Deprecated
public class RequestWrapper extends AbstractHttpMessage implements HttpUriRequest {
    private int execCount;
    private String method;
    private final HttpRequest original;
    private URI uri;
    private ProtocolVersion version;

    public RequestWrapper(HttpRequest httpRequest) throws ProtocolException {
        if (httpRequest != null) {
            this.original = httpRequest;
            setParams(httpRequest.getParams());
            if (httpRequest instanceof HttpUriRequest) {
                HttpUriRequest httpUriRequest = (HttpUriRequest) httpRequest;
                this.uri = httpUriRequest.getURI();
                this.method = httpUriRequest.getMethod();
                this.version = null;
            } else {
                RequestLine requestLine = httpRequest.getRequestLine();
                try {
                    this.uri = new URI(requestLine.getUri());
                    this.method = requestLine.getMethod();
                    this.version = httpRequest.getProtocolVersion();
                } catch (URISyntaxException e) {
                    throw new ProtocolException("Invalid request URI: " + requestLine.getUri(), e);
                }
            }
            this.execCount = 0;
            return;
        }
        throw new IllegalArgumentException("HTTP request may not be null");
    }

    public void abort() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public int getExecCount() {
        return this.execCount;
    }

    public String getMethod() {
        return this.method;
    }

    public HttpRequest getOriginal() {
        return this.original;
    }

    public ProtocolVersion getProtocolVersion() {
        ProtocolVersion protocolVersion = this.version;
        return protocolVersion != null ? protocolVersion : HttpProtocolParams.getVersion(getParams());
    }

    public RequestLine getRequestLine() {
        String method2 = getMethod();
        ProtocolVersion protocolVersion = getProtocolVersion();
        URI uri2 = this.uri;
        String aSCIIString = uri2 != null ? uri2.toASCIIString() : null;
        if (aSCIIString == null || aSCIIString.length() == 0) {
            aSCIIString = "/";
        }
        return new BasicRequestLine(method2, aSCIIString, protocolVersion);
    }

    public URI getURI() {
        return this.uri;
    }

    public void incrementExecCount() {
        this.execCount++;
    }

    public boolean isAborted() {
        return false;
    }

    public boolean isRepeatable() {
        return true;
    }

    public void resetHeaders() {
        this.headergroup.clear();
        setHeaders(this.original.getAllHeaders());
    }

    public void setMethod(String str) {
        if (str != null) {
            this.method = str;
            return;
        }
        throw new IllegalArgumentException("Method name may not be null");
    }

    public void setProtocolVersion(ProtocolVersion protocolVersion) {
        this.version = protocolVersion;
    }

    public void setURI(URI uri2) {
        this.uri = uri2;
    }
}
