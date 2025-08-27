package org.apache.http.impl.cookie;

import java.util.List;
import kotlin.jvm.internal.IntCompanionObject;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.CookieSpec;
import org.apache.http.cookie.MalformedCookieException;

@Deprecated
public class BestMatchSpec implements CookieSpec {
    private BrowserCompatSpec compat;
    private final String[] datepatterns;
    private NetscapeDraftSpec netscape;
    private final boolean oneHeader;
    private RFC2965Spec strict;

    public BestMatchSpec(String[] strArr, boolean z) {
        this.datepatterns = strArr;
        this.oneHeader = z;
    }

    private BrowserCompatSpec getCompat() {
        if (this.compat == null) {
            this.compat = new BrowserCompatSpec(this.datepatterns);
        }
        return this.compat;
    }

    private NetscapeDraftSpec getNetscape() {
        if (this.netscape == null) {
            String[] strArr = this.datepatterns;
            if (strArr == null) {
                strArr = BrowserCompatSpec.DATE_PATTERNS;
            }
            this.netscape = new NetscapeDraftSpec(strArr);
        }
        return this.netscape;
    }

    private RFC2965Spec getStrict() {
        if (this.strict == null) {
            this.strict = new RFC2965Spec(this.datepatterns, this.oneHeader);
        }
        return this.strict;
    }

    public List<Header> formatCookies(List<Cookie> list) {
        if (list != null) {
            int i = IntCompanionObject.MAX_VALUE;
            for (Cookie next : list) {
                if (next.getVersion() < i) {
                    i = next.getVersion();
                }
            }
            return i > 0 ? getStrict().formatCookies(list) : getCompat().formatCookies(list);
        }
        throw new IllegalArgumentException("List of cookie may not be null");
    }

    public int getVersion() {
        return getStrict().getVersion();
    }

    public Header getVersionHeader() {
        return getStrict().getVersionHeader();
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (cookieOrigin != null) {
            return cookie.getVersion() > 0 ? getStrict().match(cookie, cookieOrigin) : getCompat().match(cookie, cookieOrigin);
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) throws MalformedCookieException {
        if (header == null) {
            throw new IllegalArgumentException("Header may not be null");
        } else if (cookieOrigin != null) {
            HeaderElement[] elements = header.getElements();
            boolean z = false;
            boolean z2 = false;
            for (HeaderElement headerElement : elements) {
                if (headerElement.getParameterByName(ClientCookie.VERSION_ATTR) != null) {
                    z2 = true;
                }
                if (headerElement.getParameterByName(ClientCookie.EXPIRES_ATTR) != null) {
                    z = true;
                }
            }
            return z2 ? getStrict().parse(elements, cookieOrigin) : z ? getNetscape().parse(header, cookieOrigin) : getCompat().parse(elements, cookieOrigin);
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (cookieOrigin == null) {
            throw new IllegalArgumentException("Cookie origin may not be null");
        } else if (cookie.getVersion() > 0) {
            getStrict().validate(cookie, cookieOrigin);
        } else {
            getCompat().validate(cookie, cookieOrigin);
        }
    }

    public BestMatchSpec() {
        this((String[]) null, false);
    }
}
