package defpackage;

import android.util.LruCache;

/* renamed from: i4g  reason: default package */
public final class i4g {
    public static final LruCache a = new LruCache(1000);

    public static g4g a(String str) {
        LruCache lruCache = a;
        h4g h4g = (h4g) lruCache.get(str);
        if (h4g == null) {
            return null;
        }
        if (h4g.b + 3600000 > System.currentTimeMillis()) {
            return h4g.a;
        }
        lruCache.remove(str);
        return null;
    }
}
