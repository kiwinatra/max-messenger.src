package org.apache.http.protocol;

import java.util.HashMap;
import java.util.Map;

@Deprecated
public class UriPatternMatcher {
    private final Map handlerMap = new HashMap();

    public Object lookup(String str) {
        if (str != null) {
            int indexOf = str.indexOf("?");
            if (indexOf != -1) {
                str = str.substring(0, indexOf);
            }
            Object obj = this.handlerMap.get(str);
            if (obj == null) {
                String str2 = null;
                for (String str3 : this.handlerMap.keySet()) {
                    if (matchUriRequestPattern(str3, str) && (str2 == null || str2.length() < str3.length() || (str2.length() == str3.length() && str3.endsWith("*")))) {
                        obj = this.handlerMap.get(str3);
                        str2 = str3;
                    }
                }
            }
            return obj;
        }
        throw new IllegalArgumentException("Request URI may not be null");
    }

    public boolean matchUriRequestPattern(String str, String str2) {
        if (str.equals("*")) {
            return true;
        }
        if (!str.endsWith("*") || !str2.startsWith(str.substring(0, str.length() - 1))) {
            return str.startsWith("*") && str2.endsWith(str.substring(1, str.length()));
        }
        return true;
    }

    public void register(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("URI request pattern may not be null");
        } else if (obj != null) {
            this.handlerMap.put(str, obj);
        } else {
            throw new IllegalArgumentException("HTTP request handelr may not be null");
        }
    }

    public void setHandlers(Map map) {
        if (map != null) {
            this.handlerMap.clear();
            this.handlerMap.putAll(map);
            return;
        }
        throw new IllegalArgumentException("Map of handlers may not be null");
    }

    public void unregister(String str) {
        if (str != null) {
            this.handlerMap.remove(str);
        }
    }
}
