package org.apache.http.params;

@Deprecated
public final class DefaultedHttpParams extends AbstractHttpParams {
    private final HttpParams defaults;
    private final HttpParams local;

    public DefaultedHttpParams(HttpParams httpParams, HttpParams httpParams2) {
        if (httpParams != null) {
            this.local = httpParams;
            this.defaults = httpParams2;
            return;
        }
        throw new IllegalArgumentException("HTTP parameters may not be null");
    }

    public HttpParams copy() {
        return new DefaultedHttpParams(this.local.copy(), this.defaults);
    }

    public HttpParams getDefaults() {
        return this.defaults;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r1.defaults;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object getParameter(java.lang.String r2) {
        /*
            r1 = this;
            org.apache.http.params.HttpParams r0 = r1.local
            java.lang.Object r0 = r0.getParameter(r2)
            if (r0 != 0) goto L_0x0010
            org.apache.http.params.HttpParams r1 = r1.defaults
            if (r1 == 0) goto L_0x0010
            java.lang.Object r0 = r1.getParameter(r2)
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.http.params.DefaultedHttpParams.getParameter(java.lang.String):java.lang.Object");
    }

    public boolean removeParameter(String str) {
        return this.local.removeParameter(str);
    }

    public HttpParams setParameter(String str, Object obj) {
        return this.local.setParameter(str, obj);
    }
}
