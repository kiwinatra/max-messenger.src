package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: s2d  reason: default package */
public final class s2d extends w2d implements p64 {
    public final jod y;

    public s2d(long j, ca6 ca6, List list, jod jod, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(ca6, list, jod, arrayList, arrayList2, arrayList3);
        this.y = jod;
    }

    public final boolean A() {
        return this.y.j();
    }

    public final long C() {
        return this.y.d;
    }

    public final long D(long j) {
        return this.y.e(j);
    }

    public final long E(long j, long j2) {
        return this.y.c(j, j2);
    }

    public final String a() {
        return null;
    }

    public final long b(long j) {
        return this.y.h(j);
    }

    public final p64 c() {
        return this;
    }

    public final cpc d() {
        return null;
    }

    public final long i(long j, long j2) {
        return this.y.f(j, j2);
    }

    public final long l(long j, long j2) {
        return this.y.d(j, j2);
    }

    public final long n(long j, long j2) {
        jod jod = this.y;
        if (jod.f != null) {
            return -9223372036854775807L;
        }
        long c = jod.c(j, j2) + jod.d(j, j2);
        return (jod.f(c, j) + jod.h(c)) - jod.i;
    }

    public final cpc o(long j) {
        return this.y.i(j, this);
    }

    public final long u(long j, long j2) {
        return this.y.g(j, j2);
    }
}
