package org.apache.http.auth;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.params.HttpParams;

@Deprecated
public final class AuthSchemeRegistry {
    private final Map<String, AuthSchemeFactory> registeredSchemes = new LinkedHashMap();

    public synchronized AuthScheme getAuthScheme(String str, HttpParams httpParams) throws IllegalStateException {
        AuthSchemeFactory authSchemeFactory;
        if (str != null) {
            authSchemeFactory = this.registeredSchemes.get(str.toLowerCase(Locale.ENGLISH));
            if (authSchemeFactory != null) {
            } else {
                throw new IllegalStateException("Unsupported authentication scheme: ".concat(str));
            }
        } else {
            throw new IllegalArgumentException("Name may not be null");
        }
        return authSchemeFactory.newInstance(httpParams);
    }

    public synchronized List<String> getSchemeNames() {
        return new ArrayList(this.registeredSchemes.keySet());
    }

    public synchronized void register(String str, AuthSchemeFactory authSchemeFactory) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        } else if (authSchemeFactory != null) {
            this.registeredSchemes.put(str.toLowerCase(Locale.ENGLISH), authSchemeFactory);
        } else {
            throw new IllegalArgumentException("Authentication scheme factory may not be null");
        }
    }

    public synchronized void setItems(Map<String, AuthSchemeFactory> map) {
        if (map != null) {
            this.registeredSchemes.clear();
            this.registeredSchemes.putAll(map);
        }
    }

    public synchronized void unregister(String str) {
        if (str != null) {
            this.registeredSchemes.remove(str.toLowerCase(Locale.ENGLISH));
        } else {
            throw new IllegalArgumentException("Name may not be null");
        }
    }
}
