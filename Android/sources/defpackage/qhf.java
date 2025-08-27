package defpackage;

import android.util.LruCache;

/* renamed from: qhf  reason: default package */
public final class qhf {
    public static final LruCache a = new LruCache(5);

    public static void a(kf0 kf0, uhf uhf) {
        if (kf0 != null) {
            z68.c("ThemeBackgroundCache", "Save theme " + kf0 + " to cache.", new Object[0]);
            a.put(kf0, uhf);
        }
    }
}
