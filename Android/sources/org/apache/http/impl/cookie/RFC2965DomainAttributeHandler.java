package org.apache.http.impl.cookie;

import java.util.Locale;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SetCookie;

@Deprecated
public class RFC2965DomainAttributeHandler implements CookieAttributeHandler {
    public boolean domainMatch(String str, String str2) {
        return str.equals(str2) || (str2.startsWith(".") && str.endsWith(str2));
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (cookieOrigin != null) {
            String lowerCase = cookieOrigin.getHost().toLowerCase(Locale.ENGLISH);
            String domain = cookie.getDomain();
            return domainMatch(lowerCase, domain) && lowerCase.substring(0, lowerCase.length() - domain.length()).indexOf(46) == -1;
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    public void parse(SetCookie setCookie, String str) throws MalformedCookieException {
        if (setCookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (str == null) {
            throw new MalformedCookieException("Missing value for domain attribute");
        } else if (str.trim().length() != 0) {
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            if (!lowerCase.startsWith(".")) {
                lowerCase = ".".concat(lowerCase);
            }
            setCookie.setDomain(lowerCase);
        } else {
            throw new MalformedCookieException("Blank value for domain attribute");
        }
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (cookieOrigin != null) {
            String host = cookieOrigin.getHost();
            Locale locale = Locale.ENGLISH;
            String lowerCase = host.toLowerCase(locale);
            if (cookie.getDomain() != null) {
                String lowerCase2 = cookie.getDomain().toLowerCase(locale);
                if (!(cookie instanceof ClientCookie) || !((ClientCookie) cookie).containsAttribute(ClientCookie.DOMAIN_ATTR)) {
                    if (!cookie.getDomain().equals(lowerCase)) {
                        throw new MalformedCookieException("Illegal domain attribute: \"" + cookie.getDomain() + "\".Domain of origin: \"" + lowerCase + "\"");
                    }
                } else if (lowerCase2.startsWith(".")) {
                    int indexOf = lowerCase2.indexOf(46, 1);
                    if ((indexOf < 0 || indexOf == lowerCase2.length() - 1) && !lowerCase2.equals(".local")) {
                        throw new MalformedCookieException("Domain attribute \"" + cookie.getDomain() + "\" violates RFC 2965: the value contains no embedded dots and the value is not .local");
                    } else if (!domainMatch(lowerCase, lowerCase2)) {
                        throw new MalformedCookieException("Domain attribute \"" + cookie.getDomain() + "\" violates RFC 2965: effective host name does not domain-match domain attribute.");
                    } else if (lowerCase.substring(0, lowerCase.length() - lowerCase2.length()).indexOf(46) != -1) {
                        throw new MalformedCookieException("Domain attribute \"" + cookie.getDomain() + "\" violates RFC 2965: effective host minus domain may not contain any dots");
                    }
                } else {
                    throw new MalformedCookieException("Domain attribute \"" + cookie.getDomain() + "\" violates RFC 2109: domain must start with a dot");
                }
            } else {
                throw new MalformedCookieException("Invalid cookie state: domain not specified");
            }
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }
}
