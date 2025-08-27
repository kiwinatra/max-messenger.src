package org.apache.http.impl;

import java.util.Locale;
import org.apache.http.HttpResponse;
import org.apache.http.HttpResponseFactory;
import org.apache.http.ProtocolVersion;
import org.apache.http.ReasonPhraseCatalog;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicHttpResponse;
import org.apache.http.message.BasicStatusLine;
import org.apache.http.protocol.HttpContext;

@Deprecated
public class DefaultHttpResponseFactory implements HttpResponseFactory {
    protected final ReasonPhraseCatalog reasonCatalog;

    public DefaultHttpResponseFactory(ReasonPhraseCatalog reasonPhraseCatalog) {
        if (reasonPhraseCatalog != null) {
            this.reasonCatalog = reasonPhraseCatalog;
            return;
        }
        throw new IllegalArgumentException("Reason phrase catalog must not be null.");
    }

    public Locale determineLocale(HttpContext httpContext) {
        return Locale.getDefault();
    }

    public HttpResponse newHttpResponse(ProtocolVersion protocolVersion, int i, HttpContext httpContext) {
        if (protocolVersion != null) {
            Locale determineLocale = determineLocale(httpContext);
            return new BasicHttpResponse((StatusLine) new BasicStatusLine(protocolVersion, i, this.reasonCatalog.getReason(i, determineLocale)), this.reasonCatalog, determineLocale);
        }
        throw new IllegalArgumentException("HTTP version may not be null");
    }

    public DefaultHttpResponseFactory() {
        this(EnglishReasonPhraseCatalog.INSTANCE);
    }

    public HttpResponse newHttpResponse(StatusLine statusLine, HttpContext httpContext) {
        if (statusLine != null) {
            return new BasicHttpResponse(statusLine, this.reasonCatalog, determineLocale(httpContext));
        }
        throw new IllegalArgumentException("Status line may not be null");
    }
}
