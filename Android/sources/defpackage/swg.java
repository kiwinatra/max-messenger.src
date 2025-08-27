package defpackage;

import android.content.Context;

/* renamed from: swg  reason: default package */
public final class swg extends ct6 implements nef {
    public static final ox0 Y = new ox0("ClientTelemetry.API", new cvg(2), new sx6(7));
    public static final ox0 Z = new ox0("LocationServices.API", new cvg(4), new sx6(7));
    public static final ox0 v0 = new ox0("SmsRetriever.API", new cvg(3), new sx6(7));
    public static int w0 = 1;

    public s7h d(mef mef) {
        ur0 ur0 = new ur0();
        ur0.b = 0;
        ur0.e = new tj5[]{kv0.d};
        ur0.c = false;
        ur0.d = new nob((Object) mef);
        return c(2, ur0.a());
    }

    public synchronized int e() {
        try {
            if (w0 == 1) {
                Context context = this.a;
                dt6 dt6 = dt6.d;
                int b = dt6.b(12451000, context);
                if (b == 0) {
                    w0 = 4;
                } else if (dt6.a(b, context, (String) null) != null || cz4.a(context, "com.google.android.gms.auth.api.fallback") == 0) {
                    w0 = 2;
                } else {
                    w0 = 3;
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return w0;
    }
}
