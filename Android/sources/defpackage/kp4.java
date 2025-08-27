package defpackage;

import android.content.Context;

/* renamed from: kp4  reason: default package */
public final class kp4 {
    public final int a;
    public final String b;
    public final r2f c;
    public final long d;
    public final long e;
    public final long f;
    public final s9a g;
    public final o9a h;
    public final p9a i;
    public final Context j;

    public kp4(jp4 jp4) {
        o9a o9a;
        p9a p9a;
        Context context = jp4.g;
        this.j = context;
        r2f r2f = jp4.b;
        if ((r2f == null && context == null) ? false : true) {
            if (r2f == null && context != null) {
                jp4.b = new m74(1, this);
            }
            this.a = 1;
            String str = jp4.a;
            str.getClass();
            this.b = str;
            r2f r2f2 = jp4.b;
            r2f2.getClass();
            this.c = r2f2;
            this.d = jp4.c;
            this.e = jp4.d;
            this.f = jp4.e;
            s9a s9a = jp4.f;
            s9a.getClass();
            this.g = s9a;
            synchronized (o9a.class) {
                try {
                    if (o9a.b == null) {
                        o9a.b = new o9a(0);
                    }
                    o9a = o9a.b;
                } finally {
                    while (true) {
                    }
                }
            }
            this.h = o9a;
            synchronized (p9a.class) {
                try {
                    if (p9a.b == null) {
                        p9a.b = new p9a(0);
                    }
                    p9a = p9a.b;
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            this.i = p9a;
            synchronized (s9a.class) {
                if (s9a.b == null) {
                    s9a.b = new s9a(0, (byte) 0);
                }
            }
            return;
        }
        throw new IllegalStateException("Either a non-null context or a base directory path or supplier must be provided.");
    }
}
