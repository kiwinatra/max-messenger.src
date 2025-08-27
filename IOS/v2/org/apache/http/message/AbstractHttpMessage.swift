package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.HttpMessage;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;

@Deprecated
public abstract class AbstractHttpMessage implements HttpMessage {
    protected HeaderGroup headergroup;
    protected HttpParams params;

    public AbstractHttpMessage(HttpParams httpParams) {
        this.headergroup = new HeaderGroup();
        this.params = httpParams;
    }

    public void addHeader(Header header) {
        this.headergroup.addHeader(header);
    }

    public boolean containsHeader(String str) {
        return this.headergroup.containsHeader(str);
    }

    public Header[] getAllHeaders() {
        return this.headergroup.getAllHeaders();
    }

    public Header getFirstHeader(String str) {
        return this.headergroup.getFirstHeader(str);
    }

    public Header[] getHeaders(String str) {
        return this.headergroup.getHeaders(str);
    }

    public Header getLastHeader(String str) {
        return this.headergroup.getLastHeader(str);
    }

    public HttpParams getParams() {
        if (this.params == null) {
            this.params = new BasicHttpParams();
        }
        return this.params;
    }

    public HeaderIterator headerIterator() {
        return this.headergroup.iterator();
    }

    public void removeHeader(Header header) {
        this.headergroup.removeHeader(header);
    }

    public void removeHeaders(String str) {
        if (str != null) {
            HeaderIterator it = this.headergroup.iterator();
            while (it.hasNext()) {
                if (str.equalsIgnoreCase(((Header) it.next()).getName())) {
                    it.remove();
                }
            }
        }
    }

    public void setHeader(Header header) {
        this.headergroup.updateHeader(header);
    }

    public void setHeaders(Header[] headerArr) {
        this.headergroup.setHeaders(headerArr);
    }

    public void setParams(HttpParams httpParams) {
        if (httpParams != null) {
            this.params = httpParams;
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public void addHeader(String str, String str2) {
        if (str != null) {
            this.headergroup.addHeader(new BasicHeader(str, str2));
            return;
        }
        throw new IllegalArgumentException("Header name may not be null");
    }

    public HeaderIterator headerIterator(String str) {
        return this.headergroup.iterator(str);
    }

    public void setHeader(String str, String str2) {
        if (str != null) {
            this.headergroup.updateHeader(new BasicHeader(str, str2));
            return;
        }
        throw new IllegalArgumentException("Header name may not be null");
    }

    public AbstractHttpMessage() {
        this((HttpParams) null);
    }
}
