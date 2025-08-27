package org.apache.http.impl.cookie;

import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

@Deprecated
public class BasicExpiresHandler extends AbstractCookieAttributeHandler {
    private final String[] datepatterns;

    public BasicExpiresHandler(String[] strArr) {
        if (strArr != null) {
            this.datepatterns = strArr;
            return;
        }
        throw new IllegalArgumentException("Array of date patterns may not be null");
    }

    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        if (setCookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str != null) {
            try {
                setCookie.setExpiryDate(DateUtils.parseDate(str, this.datepatterns));
            } catch (DateParseException unused) {
                throw new MalformedCookieException("Unable to parse expires attribute: ".concat(str));
            }
        } else {
            throw new MalformedCookieException("Missing value for expires attribute");
        }
    }
}
