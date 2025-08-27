package defpackage;

import kotlin.Lazy;

/* renamed from: c48  reason: default package */
public final class c48 {
    public final Lazy a;
    public final Lazy b;

    public c48(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    public static mka b(c48 c48, long j, long j2, boolean z, long j3, int i) {
        long j4 = (i & 1) != 0 ? 0 : j;
        long j5 = (i & 2) != 0 ? 0 : j2;
        boolean z2 = (i & 4) != 0 ? true : z;
        long j6 = (i & 16) != 0 ? 0 : j3;
        c48.getClass();
        return new mka(2, new b48(c48, j4, j5, z2, 0, j6));
    }

    public final mka a(long j, boolean z) {
        return b(this, j, 0, z, 0, 26);
    }
}
