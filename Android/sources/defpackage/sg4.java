package defpackage;

/* renamed from: sg4  reason: default package */
public final class sg4 {
    public final cb4 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e = t0g.D((long) 5000);
    public final int f = -1;
    public final boolean g = false;
    public final long h = t0g.D((long) 0);
    public final boolean i = false;
    public int j = 13107200;
    public boolean k;

    public sg4(cb4 cb4, int i2) {
        a("bufferForPlaybackMs", i2, 0, "0");
        a("bufferForPlaybackAfterRebufferMs", 5000, 0, "0");
        a("minBufferMs", 50000, i2, "bufferForPlaybackMs");
        a("minBufferMs", 50000, 5000, "bufferForPlaybackAfterRebufferMs");
        a("maxBufferMs", 50000, 50000, "minBufferMs");
        a("backBufferDurationMs", 0, 0, "0");
        this.a = cb4;
        long j2 = (long) 50000;
        this.b = t0g.D(j2);
        this.c = t0g.D(j2);
        this.d = t0g.D((long) i2);
    }

    public static void a(String str, int i2, int i3, String str2) {
        boolean z = i2 >= i3;
        StringBuilder sb = new StringBuilder(str2.length() + str.length() + 21);
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        y64.f(sb.toString(), z);
    }

    public final void b(boolean z) {
        int i2 = this.f;
        if (i2 == -1) {
            i2 = 13107200;
        }
        this.j = i2;
        this.k = false;
        if (z) {
            cb4 cb4 = this.a;
            synchronized (cb4) {
                if (cb4.b) {
                    cb4.b(0);
                }
            }
        }
    }
}
