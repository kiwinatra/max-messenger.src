package defpackage;

import android.content.Context;

/* renamed from: rqg  reason: default package */
public final class rqg {
    public static final rqg b;
    public xg4 a;

    /* JADX WARNING: type inference failed for: r0v0, types: [rqg, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.a = null;
        b = obj;
    }

    public static xg4 a(Context context) {
        xg4 xg4;
        rqg rqg = b;
        synchronized (rqg) {
            try {
                if (rqg.a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    rqg.a = new xg4(context);
                }
                xg4 = rqg.a;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return xg4;
    }
}
