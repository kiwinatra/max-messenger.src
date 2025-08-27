package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: t2d  reason: default package */
public final class t2d extends x2d implements q64 {
    public final kod y;

    public t2d(long j, ea6 ea6, List list, kod kod, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(ea6, list, kod, arrayList, arrayList2, arrayList3);
        this.y = kod;
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

    public final q64 c() {
        return this;
    }

    public final dpc d() {
        return null;
    }

    public final long i(long j, long j2) {
        return this.y.f(j, j2);
    }

    public final long l(long j, long j2) {
        return this.y.d(j, j2);
    }

    public final long n(long j, long j2) {
        kod kod = this.y;
        if (kod.f != null) {
            return -9223372036854775807L;
        }
        long c = kod.c(j, j2) + kod.d(j, j2);
        return (kod.f(c, j) + kod.h(c)) - kod.i;
    }

    public final dpc o(long j) {
        return this.y.i(j, this);
    }

    public final long u(long j, long j2) {
        return this.y.g(j, j2);
    }
}
