package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: xb7  reason: default package */
public final class xb7 extends HashMap {
    public static Map a(String str, String str2) {
        HashMap hashMap = new HashMap(1);
        hashMap.put(str, str2);
        return Collections.unmodifiableMap(hashMap);
    }

    public static Map b(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap(2);
        hashMap.put(str, str2);
        hashMap.put(str3, str4);
        return Collections.unmodifiableMap(hashMap);
    }
}
