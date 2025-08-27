package org.apache.http.protocol;

import java.util.HashMap;
import java.util.Map;

@Deprecated
public class BasicHttpContext implements HttpContext {
    private Map map;
    private final HttpContext parentContext;

    public BasicHttpContext() {
        this((HttpContext) null);
    }

    public Object getAttribute(String str) {
        HttpContext httpContext;
        if (str != null) {
            Map map2 = this.map;
            Object obj = map2 != null ? map2.get(str) : null;
            return (obj != null || (httpContext = this.parentContext) == null) ? obj : httpContext.getAttribute(str);
        }
        throw new IllegalArgumentException("Id may not be null");
    }

    public Object removeAttribute(String str) {
        if (str != null) {
            Map map2 = this.map;
            if (map2 != null) {
                return map2.remove(str);
            }
            return null;
        }
        throw new IllegalArgumentException("Id may not be null");
    }

    public void setAttribute(String str, Object obj) {
        if (str != null) {
            if (this.map == null) {
                this.map = new HashMap();
            }
            this.map.put(str, obj);
            return;
        }
        throw new IllegalArgumentException("Id may not be null");
    }

    public BasicHttpContext(HttpContext httpContext) {
        this.map = null;
        this.parentContext = httpContext;
    }
}
