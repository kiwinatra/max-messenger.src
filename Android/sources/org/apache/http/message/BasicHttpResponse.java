package org.apache.http.message;

import java.util.Locale;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.ReasonPhraseCatalog;
import org.apache.http.StatusLine;

@Deprecated
public class BasicHttpResponse extends AbstractHttpMessage implements HttpResponse {
    private HttpEntity entity;
    private Locale locale;
    private ReasonPhraseCatalog reasonCatalog;
    private StatusLine statusline;

    public BasicHttpResponse(StatusLine statusLine, ReasonPhraseCatalog reasonPhraseCatalog, Locale locale2) {
        if (statusLine != null) {
            this.statusline = statusLine;
            this.reasonCatalog = reasonPhraseCatalog;
            this.locale = locale2 == null ? Locale.getDefault() : locale2;
            return;
        }
        throw new IllegalArgumentException("Status line may not be null.");
    }

    public HttpEntity getEntity() {
        return this.entity;
    }

    public Locale getLocale() {
        return this.locale;
    }

    public ProtocolVersion getProtocolVersion() {
        return this.statusline.getProtocolVersion();
    }

    public String getReason(int i) {
        ReasonPhraseCatalog reasonPhraseCatalog = this.reasonCatalog;
        if (reasonPhraseCatalog == null) {
            return null;
        }
        return reasonPhraseCatalog.getReason(i, this.locale);
    }

    public StatusLine getStatusLine() {
        return this.statusline;
    }

    public void setEntity(HttpEntity httpEntity) {
        this.entity = httpEntity;
    }

    public void setLocale(Locale locale2) {
        if (locale2 != null) {
            this.locale = locale2;
            int statusCode = this.statusline.getStatusCode();
            this.statusline = new BasicStatusLine(this.statusline.getProtocolVersion(), statusCode, getReason(statusCode));
            return;
        }
        throw new IllegalArgumentException("Locale may not be null.");
    }

    public void setReasonPhrase(String str) {
        if (str == null || (str.indexOf(10) < 0 && str.indexOf(13) < 0)) {
            this.statusline = new BasicStatusLine(this.statusline.getProtocolVersion(), this.statusline.getStatusCode(), str);
            return;
        }
        throw new IllegalArgumentException("Line break in reason phrase.");
    }

    public void setStatusCode(int i) {
        this.statusline = new BasicStatusLine(this.statusline.getProtocolVersion(), i, getReason(i));
    }

    public void setStatusLine(StatusLine statusLine) {
        if (statusLine != null) {
            this.statusline = statusLine;
            return;
        }
        throw new IllegalArgumentException("Status line may not be null");
    }

    public void setStatusLine(ProtocolVersion protocolVersion, int i) {
        this.statusline = new BasicStatusLine(protocolVersion, i, getReason(i));
    }

    public void setStatusLine(ProtocolVersion protocolVersion, int i, String str) {
        this.statusline = new BasicStatusLine(protocolVersion, i, str);
    }

    public BasicHttpResponse(StatusLine statusLine) {
        this(statusLine, (ReasonPhraseCatalog) null, (Locale) null);
    }

    public BasicHttpResponse(ProtocolVersion protocolVersion, int i, String str) {
        this((StatusLine) new BasicStatusLine(protocolVersion, i, str), (ReasonPhraseCatalog) null, (Locale) null);
    }
}
