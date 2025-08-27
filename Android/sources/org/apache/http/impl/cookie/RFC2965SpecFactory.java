package org.apache.http.impl.cookie;

import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecFactory;
import org.apache.http.cookie.params.CookieSpecPNames;
import org.apache.http.params.HttpParams;

@Deprecated
public class RFC2965SpecFactory implements CookieSpecFactory {
    public CookieSpec newInstance(HttpParams httpParams) {
        return httpParams != null ? new RFC2965Spec((String[]) httpParams.getParameter(CookieSpecPNames.DATE_PATTERNS), httpParams.getBooleanParameter(CookieSpecPNames.SINGLE_COOKIE_HEADER, false)) : new RFC2965Spec();
    }
}
