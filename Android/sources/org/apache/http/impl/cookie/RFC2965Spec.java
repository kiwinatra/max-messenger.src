package org.apache.http.impl.cookie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.cookie.Cookie;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieOrigin;
import org.apache.http.cookie.MalformedCookieException;
import org.apache.http.cookie.SM;
import org.apache.http.message.BufferedHeader;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
public class RFC2965Spec extends RFC2109Spec {
    public RFC2965Spec() {
        this((String[]) null, false);
    }

    private static CookieOrigin adjustEffectiveHost(CookieOrigin cookieOrigin) {
        String host = cookieOrigin.getHost();
        for (int i = 0; i < host.length(); i++) {
            char charAt = host.charAt(i);
            if (charAt == '.' || charAt == ':') {
                return cookieOrigin;
            }
        }
        return new CookieOrigin(host.concat(".local"), cookieOrigin.getPort(), cookieOrigin.getPath(), cookieOrigin.isSecure());
    }

    private BasicClientCookie createCookie(String str, String str2, CookieOrigin cookieOrigin) {
        BasicClientCookie basicClientCookie = new BasicClientCookie(str, str2);
        basicClientCookie.setPath(CookieSpecBase.getDefaultPath(cookieOrigin));
        basicClientCookie.setDomain(CookieSpecBase.getDefaultDomain(cookieOrigin));
        return basicClientCookie;
    }

    private BasicClientCookie createCookie2(String str, String str2, CookieOrigin cookieOrigin) {
        BasicClientCookie2 basicClientCookie2 = new BasicClientCookie2(str, str2);
        basicClientCookie2.setPath(CookieSpecBase.getDefaultPath(cookieOrigin));
        basicClientCookie2.setDomain(CookieSpecBase.getDefaultDomain(cookieOrigin));
        basicClientCookie2.setPorts(new int[]{cookieOrigin.getPort()});
        return basicClientCookie2;
    }

    public void formatCookieAsVer(CharArrayBuffer charArrayBuffer, Cookie cookie, int i) {
        String attribute;
        int[] ports;
        super.formatCookieAsVer(charArrayBuffer, cookie, i);
        if ((cookie instanceof ClientCookie) && (attribute = ((ClientCookie) cookie).getAttribute(ClientCookie.PORT_ATTR)) != null) {
            charArrayBuffer.append("; $Port");
            charArrayBuffer.append("=\"");
            if (attribute.trim().length() > 0 && (ports = cookie.getPorts()) != null) {
                int length = ports.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (i2 > 0) {
                        charArrayBuffer.append(",");
                    }
                    charArrayBuffer.append(Integer.toString(ports[i2]));
                }
            }
            charArrayBuffer.append("\"");
        }
    }

    public int getVersion() {
        return 1;
    }

    public Header getVersionHeader() {
        CharArrayBuffer charArrayBuffer = new CharArrayBuffer(40);
        charArrayBuffer.append(SM.COOKIE2);
        charArrayBuffer.append(": ");
        charArrayBuffer.append("$Version=");
        charArrayBuffer.append(Integer.toString(getVersion()));
        return new BufferedHeader(charArrayBuffer);
    }

    public boolean match(Cookie cookie, CookieOrigin cookieOrigin) {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (cookieOrigin != null) {
            return super.match(cookie, adjustEffectiveHost(cookieOrigin));
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    public List<Cookie> parse(Header header, CookieOrigin cookieOrigin) throws MalformedCookieException {
        if (header == null) {
            throw new IllegalArgumentException("Header may not be null");
        } else if (cookieOrigin != null) {
            CookieOrigin adjustEffectiveHost = adjustEffectiveHost(cookieOrigin);
            HeaderElement[] elements = header.getElements();
            ArrayList arrayList = new ArrayList(elements.length);
            for (HeaderElement headerElement : elements) {
                String name = headerElement.getName();
                String value = headerElement.getValue();
                if (name == null || name.length() == 0) {
                    throw new MalformedCookieException("Cookie name may not be empty");
                }
                BasicClientCookie createCookie2 = header.getName().equals(SM.SET_COOKIE2) ? createCookie2(name, value, adjustEffectiveHost) : createCookie(name, value, adjustEffectiveHost);
                NameValuePair[] parameters = headerElement.getParameters();
                HashMap hashMap = new HashMap(parameters.length);
                for (int length = parameters.length - 1; length >= 0; length--) {
                    NameValuePair nameValuePair = parameters[length];
                    hashMap.put(nameValuePair.getName().toLowerCase(Locale.ENGLISH), nameValuePair);
                }
                for (Map.Entry value2 : hashMap.entrySet()) {
                    NameValuePair nameValuePair2 = (NameValuePair) value2.getValue();
                    String lowerCase = nameValuePair2.getName().toLowerCase(Locale.ENGLISH);
                    createCookie2.setAttribute(lowerCase, nameValuePair2.getValue());
                    CookieAttributeHandler findAttribHandler = findAttribHandler(lowerCase);
                    if (findAttribHandler != null) {
                        findAttribHandler.parse(createCookie2, nameValuePair2.getValue());
                    }
                }
                arrayList.add(createCookie2);
            }
            return arrayList;
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    public void validate(Cookie cookie, CookieOrigin cookieOrigin) throws MalformedCookieException {
        if (cookie == null) {
            throw new IllegalArgumentException("Cookie may not be null");
        } else if (cookieOrigin != null) {
            super.validate(cookie, adjustEffectiveHost(cookieOrigin));
        } else {
            throw new IllegalArgumentException("Cookie origin may not be null");
        }
    }

    public RFC2965Spec(String[] strArr, boolean z) {
        super(strArr, z);
        registerAttribHandler(ClientCookie.DOMAIN_ATTR, new RFC2965DomainAttributeHandler());
        registerAttribHandler(ClientCookie.PORT_ATTR, new RFC2965PortAttributeHandler());
        registerAttribHandler(ClientCookie.COMMENTURL_ATTR, new RFC2965CommentUrlAttributeHandler());
        registerAttribHandler(ClientCookie.DISCARD_ATTR, new RFC2965DiscardAttributeHandler());
        registerAttribHandler(ClientCookie.VERSION_ATTR, new RFC2965VersionAttributeHandler());
    }
}
