package org.apache.http.protocol;

@Deprecated
public final class DefaultedHttpContext implements HttpContext {
    private final HttpContext defaults;
    private final HttpContext local;

    public DefaultedHttpContext(HttpContext httpContext, HttpContext httpContext2) {
        if (httpContext != null) {
            this.local = httpContext;
            this.defaults = httpContext2;
            return;
        }
        throw new IllegalArgumentException("HTTP context may not be null");
    }

    public Object getAttribute(String str) {
        Object attribute = this.local.getAttribute(str);
        return attribute == null ? this.defaults.getAttribute(str) : attribute;
    }

    public HttpContext getDefaults() {
        return this.defaults;
    }

    public Object removeAttribute(String str) {
        return this.local.removeAttribute(str);
    }

    public void setAttribute(String str, Object obj) {
        this.local.setAttribute(str, obj);
    }
}
