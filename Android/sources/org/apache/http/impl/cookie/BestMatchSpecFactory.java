package org.apache.http.impl.cookie;

import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.CookieSpecFactory;
import org.apache.http.cookie.params.CookieSpecPNames;
import org.apache.http.params.HttpParams;

@Deprecated
public class BestMatchSpecFactory implements CookieSpecFactory {
    public CookieSpec newInstance(HttpParams httpParams) {
        return httpParams != null ? new BestMatchSpec((String[]) httpParams.getParameter(CookieSpecPNames.DATE_PATTERNS), httpParams.getBooleanParameter(CookieSpecPNames.SINGLE_COOKIE_HEADER, false)) : new BestMatchSpec();
    }
}
