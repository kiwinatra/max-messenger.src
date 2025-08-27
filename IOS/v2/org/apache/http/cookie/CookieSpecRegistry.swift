package org.apache.http.cookie;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.params.HttpParams;

@Deprecated
public final class CookieSpecRegistry {
    private final Map<String, CookieSpecFactory> registeredSpecs = new LinkedHashMap();

    public synchronized CookieSpec getCookieSpec(String str, HttpParams httpParams) throws IllegalStateException {
        CookieSpecFactory cookieSpecFactory;
        if (str != null) {
            cookieSpecFactory = this.registeredSpecs.get(str.toLowerCase(Locale.ENGLISH));
            if (cookieSpecFactory != null) {
            } else {
                throw new IllegalStateException("Unsupported cookie spec: ".concat(str));
            }
        } else {
            throw new IllegalArgumentException("Name may not be null");
        }
        return cookieSpecFactory.newInstance(httpParams);
    }

    public synchronized List<String> getSpecNames() {
        return new ArrayList(this.registeredSpecs.keySet());
    }

    public synchronized void register(String str, CookieSpecFactory cookieSpecFactory) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        } else if (cookieSpecFactory != null) {
            this.registeredSpecs.put(str.toLowerCase(Locale.ENGLISH), cookieSpecFactory);
        } else {
            throw new IllegalArgumentException("Cookie spec factory may not be null");
        }
    }

    public synchronized void setItems(Map<String, CookieSpecFactory> map) {
        if (map != null) {
            this.registeredSpecs.clear();
            this.registeredSpecs.putAll(map);
        }
    }

    public synchronized void unregister(String str) {
        if (str != null) {
            this.registeredSpecs.remove(str.toLowerCase(Locale.ENGLISH));
        } else {
            throw new IllegalArgumentException("Id may not be null");
        }
    }

    public synchronized CookieSpec getCookieSpec(String str) throws IllegalStateException {
        return getCookieSpec(str, (HttpParams) null);
    }
}
