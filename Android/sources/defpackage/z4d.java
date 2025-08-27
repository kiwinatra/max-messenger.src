package defpackage;

/* renamed from: z4d  reason: default package */
public final class z4d {
    public static final z4d d = new z4d(0, false, false);
    public static final z4d e = new z4d(500, true, false);
    public static final z4d f = new z4d(0, false, true);
    public final long a;
    public final boolean b;
    public final boolean c;

    static {
        new z4d(100, true, false);
    }

    public z4d(long j, boolean z, boolean z2) {
        this.b = z;
        this.a = j;
        if (z2) {
            bs0.m("shouldRetry must be false when completeWithoutFailure is set to true", !z);
        }
        this.c = z2;
    }
}
