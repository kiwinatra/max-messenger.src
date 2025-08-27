package org.apache.http.impl.client;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.http.FormattedHeader;
import org.apache.http.Header;
import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScheme;
import org.apache.http.auth.AuthSchemeRegistry;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.MalformedChallengeException;
import org.apache.http.client.AuthenticationHandler;
import org.apache.http.client.protocol.ClientContext;
import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.CharArrayBuffer;

@Deprecated
public abstract class AbstractAuthenticationHandler implements AuthenticationHandler {
    private static final List<String> DEFAULT_SCHEME_PRIORITY = Arrays.asList(new String[]{"ntlm", "digest", "basic"});
    private final Log log = LogFactory.getLog((Class) getClass());

    public List<String> getAuthPreferences() {
        return DEFAULT_SCHEME_PRIORITY;
    }

    public Map<String, Header> parseChallenges(Header[] headerArr) throws MalformedChallengeException {
        CharArrayBuffer charArrayBuffer;
        int i;
        HashMap hashMap = new HashMap(headerArr.length);
        for (FormattedHeader formattedHeader : headerArr) {
            if (formattedHeader instanceof FormattedHeader) {
                FormattedHeader formattedHeader2 = formattedHeader;
                charArrayBuffer = formattedHeader2.getBuffer();
                i = formattedHeader2.getValuePos();
            } else {
                String value = formattedHeader.getValue();
                if (value != null) {
                    charArrayBuffer = new CharArrayBuffer(value.length());
                    charArrayBuffer.append(value);
                    i = 0;
                } else {
                    throw new MalformedChallengeException("Header value is null");
                }
            }
            while (i < charArrayBuffer.length() && HTTP.isWhitespace(charArrayBuffer.charAt(i))) {
                i++;
            }
            int i2 = i;
            while (i2 < charArrayBuffer.length() && !HTTP.isWhitespace(charArrayBuffer.charAt(i2))) {
                i2++;
            }
            hashMap.put(charArrayBuffer.substring(i, i2).toLowerCase(Locale.ENGLISH), formattedHeader);
        }
        return hashMap;
    }

    public AuthScheme selectScheme(Map<String, Header> map, HttpResponse httpResponse, HttpContext httpContext) throws AuthenticationException {
        AuthScheme authScheme;
        AuthSchemeRegistry authSchemeRegistry = (AuthSchemeRegistry) httpContext.getAttribute(ClientContext.AUTHSCHEME_REGISTRY);
        if (authSchemeRegistry != null) {
            List<String> list = (List) httpContext.getAttribute(ClientContext.AUTH_SCHEME_PREF);
            if (list == null) {
                list = getAuthPreferences();
            }
            if (this.log.isDebugEnabled()) {
                Log log2 = this.log;
                log2.debug("Authentication schemes in the order of preference: " + list);
            }
            int i = 0;
            while (true) {
                if (i >= list.size()) {
                    authScheme = null;
                    break;
                }
                String str = list.get(i);
                if (map.get(str.toLowerCase(Locale.ENGLISH)) != null) {
                    if (this.log.isDebugEnabled()) {
                        this.log.debug(str.concat(" authentication scheme selected"));
                    }
                    try {
                        authScheme = authSchemeRegistry.getAuthScheme(str, httpResponse.getParams());
                        break;
                    } catch (IllegalStateException unused) {
                        if (this.log.isWarnEnabled()) {
                            Log log3 = this.log;
                            log3.warn("Authentication scheme " + str + " not supported");
                        }
                    }
                } else {
                    if (this.log.isDebugEnabled()) {
                        Log log4 = this.log;
                        log4.debug("Challenge for " + str + " authentication scheme not available");
                    }
                    i++;
                }
            }
            if (authScheme != null) {
                return authScheme;
            }
            throw new AuthenticationException("Unable to respond to any of these challenges: " + map);
        }
        throw new IllegalStateException("AuthScheme registry not set in HTTP context");
    }
}
