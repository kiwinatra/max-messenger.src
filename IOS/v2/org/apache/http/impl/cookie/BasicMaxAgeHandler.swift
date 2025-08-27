package org.apache.http.impl.cookie;

import java.util.Date;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

@Deprecated
public class BasicMaxAgeHandler extends AbstractCookieAttributeHandler {
    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        if (setCookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str != null) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt >= 0) {
                    setCookie.setExpiryDate(new Date((((long) parseInt) * 1000) + System.currentTimeMillis()));
                    return;
                }
                throw new MalformedCookieException("Negative max-age attribute: ".concat(str));
            } catch (NumberFormatException unused) {
                throw new MalformedCookieException("Invalid max-age attribute: ".concat(str));
            }
        } else {
            throw new MalformedCookieException("Missing value for max-age attribute");
        }
    }
}
