package defpackage;

import android.content.Context;
import android.media.session.MediaSessionManager;
import android.util.Log;

/* renamed from: ny8  reason: default package */
public final class ny8 {
    public static final boolean b = Log.isLoggable("MediaSessionManager", 3);
    public static final Object c = new Object();
    public static volatile ny8 d;
    public ky8 a;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, ny8] */
    public static ny8 a(Context context) {
        ny8 ny8;
        if (context != null) {
            synchronized (c) {
                try {
                    if (d == null) {
                        Context applicationContext = context.getApplicationContext();
                        ? obj = new Object();
                        ky8 ky8 = new ky8(applicationContext);
                        MediaSessionManager mediaSessionManager = (MediaSessionManager) applicationContext.getSystemService("media_session");
                        obj.a = ky8;
                        d = obj;
                    }
                    ny8 = d;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return ny8;
        }
        throw new IllegalArgumentException("context cannot be null");
    }

    public final boolean b(ly8 ly8) {
        if (ly8 != null) {
            return this.a.b(ly8.a);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }
}
