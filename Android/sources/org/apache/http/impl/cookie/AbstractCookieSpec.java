package org.apache.http.impl.cookie;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.cookie.CookieAttributeHandler;
import org.apache.http.cookie.CookieSpec;

@Deprecated
public abstract class AbstractCookieSpec implements CookieSpec {
    private final Map<String, CookieAttributeHandler> attribHandlerMap = new HashMap(10);

    public CookieAttributeHandler findAttribHandler(String str) {
        return this.attribHandlerMap.get(str);
    }

    public CookieAttributeHandler getAttribHandler(String str) {
        CookieAttributeHandler findAttribHandler = findAttribHandler(str);
        if (findAttribHandler != null) {
            return findAttribHandler;
        }
        throw new IllegalStateException(wj6.k("Handler not registered for ", str, " attribute."));
    }

    public Collection<CookieAttributeHandler> getAttribHandlers() {
        return this.attribHandlerMap.values();
    }

    public void registerAttribHandler(String str, CookieAttributeHandler cookieAttributeHandler) {
        if (str == null) {
            throw new IllegalArgumentException("Attribute name may not be null");
        } else if (cookieAttributeHandler != null) {
            this.attribHandlerMap.put(str, cookieAttributeHandler);
        } else {
            throw new IllegalArgumentException("Attribute handler may not be null");
        }
    }
}
