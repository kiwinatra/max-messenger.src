package defpackage;

import java.util.HashMap;

/* renamed from: tg4  reason: default package */
public final class tg4 {
    public final cb4 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f = -1;
    public final boolean g = false;
    public final long h = v0g.S((long) 0);
    public final boolean i = false;
    public final HashMap j = new HashMap();
    public long k = -1;

    public tg4(cb4 cb4, int i2, int i3) {
        a("bufferForPlaybackMs", i2, 0, "0");
        a("bufferForPlaybackAfterRebufferMs", i3, 0, "0");
        a("minBufferMs", 50000, i2, "bufferForPlaybackMs");
        a("minBufferMs", 50000, i3, "bufferForPlaybackAfterRebufferMs");
        a("maxBufferMs", 50000, 50000, "minBufferMs");
        a("backBufferDurationMs", 0, 0, "0");
        this.a = cb4;
        long j2 = (long) 50000;
        this.b = v0g.S(j2);
        this.c = v0g.S(j2);
        this.d = v0g.S((long) i2);
        this.e = v0g.S((long) i3);
    }

    public static void a(String str, int i2, int i3, String str2) {
        boolean z = i2 >= i3;
        n79.f(str + " cannot be less than " + str2, z);
    }

    public final int b() {
        int i2 = 0;
        for (rg4 rg4 : this.j.values()) {
            i2 += rg4.b;
        }
        return i2;
    }

    public final boolean c(b28 b28) {
        int i2;
        rg4 rg4 = (rg4) this.j.get(b28.a);
        rg4.getClass();
        cb4 cb4 = this.a;
        synchronized (cb4) {
            i2 = cb4.e * cb4.c;
        }
        boolean z = true;
        boolean z2 = i2 >= b();
        float f2 = b28.c;
        int i3 = (f2 > 1.0f ? 1 : (f2 == 1.0f ? 0 : -1));
        long j2 = this.c;
        long j3 = this.b;
        if (i3 > 0) {
            j3 = Math.min(v0g.A(j3, f2), j2);
        }
        long max = Math.max(j3, 500000);
        long j4 = b28.b;
        if (j4 < max) {
            if (!this.g && z2) {
                z = false;
            }
            rg4.a = z;
            if (!z && j4 < 500000) {
                i8b.V("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j4 >= j2 || z2) {
            rg4.a = false;
        }
        return rg4.a;
    }

    public final void d() {
        if (this.j.isEmpty()) {
            cb4 cb4 = this.a;
            synchronized (cb4) {
                if (cb4.b) {
                    cb4.b(0);
                }
            }
            return;
        }
        this.a.b(b());
    }
}
