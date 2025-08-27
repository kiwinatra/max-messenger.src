package org.apache.http;

import java.util.Locale;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.LangUtils;

@Deprecated
public final class HttpHost implements Cloneable {
    public static final String DEFAULT_SCHEME_NAME = "http";
    protected final String hostname;
    protected final String lcHostname;
    protected final int port;
    protected final String schemeName;

    public HttpHost(String str, int i, String str2) {
        if (str != null) {
            this.hostname = str;
            Locale locale = Locale.ENGLISH;
            this.lcHostname = str.toLowerCase(locale);
            if (str2 != null) {
                this.schemeName = str2.toLowerCase(locale);
            } else {
                this.schemeName = DEFAULT_SCHEME_NAME;
            }
            this.port = i;
            return;
        }
        throw new IllegalArgumentException("Host name may not be null");
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpHost)) {
            return false;
        }
        HttpHost httpHost = (HttpHost) obj;
        return this.lcHostname.equals(httpHost.lcHostname) && this.port == httpHost.port && this.schemeName.equals(httpHost.schemeName);
    }

    public String getHostName() {
        return this.hostname;
    }

    public int getPort() {
        return this.port;
    }

    public String getSchemeName() {
        return this.schemeName;
    }

    public int hashCode() {
        return LangUtils.hashCode(LangUtils.hashCode(LangUtils.hashCode(17, (Object) this.lcHostname), this.port), (Object) this.schemeName);
    }

    public String toHostString() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
        charArrayBuffer.append(this.hostname);
        if (this.port != -1) {
            charArrayBuffer.append(':');
            charArrayBuffer.append(Integer.toString(this.port));
        }
        return charArrayBuffer.toString();
    }

    public String toString() {
        return toURI();
    }

    public String toURI() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(32);
        charArrayBuffer.append(this.schemeName);
        charArrayBuffer.append("://");
        charArrayBuffer.append(this.hostname);
        if (this.port != -1) {
            charArrayBuffer.append(':');
            charArrayBuffer.append(Integer.toString(this.port));
        }
        return charArrayBuffer.toString();
    }

    public HttpHost(String str, int i) {
        this(str, i, (String) null);
    }

    public HttpHost(String str) {
        this(str, -1, (String) null);
    }

    public HttpHost(HttpHost httpHost) {
        this(httpHost.hostname, httpHost.port, httpHost.schemeName);
    }
}
