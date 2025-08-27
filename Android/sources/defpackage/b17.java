package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: b17  reason: default package */
public final class b17 extends l17 {
    public final int d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final int j;
    public final long k;
    public final int l;
    public final long m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final xv4 q;
    public final tb7 r;
    public final tb7 s;
    public final wb7 t;
    public final long u;
    public final a17 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b17(int i2, String str, List list, long j2, boolean z, long j3, boolean z2, int i3, long j4, int i4, long j5, long j6, boolean z3, boolean z4, boolean z5, xv4 xv4, List list2, List list3, a17 a17, Map map) {
        super(str, z3, list);
        long j7 = j2;
        String str2 = str;
        List list4 = list;
        this.d = i2;
        this.h = j3;
        this.g = z;
        this.i = z2;
        this.j = i3;
        this.k = j4;
        this.l = i4;
        this.m = j5;
        this.n = j6;
        this.o = z4;
        this.p = z5;
        this.q = xv4;
        this.r = tb7.p(list2);
        this.s = tb7.p(list3);
        this.t = wb7.b(map);
        if (!list3.isEmpty()) {
            s07 s07 = (s07) b0h.w(list3);
            this.u = s07.v + s07.c;
        } else if (!list2.isEmpty()) {
            w07 w07 = (w07) b0h.w(list2);
            this.u = w07.v + w07.c;
        } else {
            this.u = 0;
        }
        this.e = j7 != -9223372036854775807L ? j7 >= 0 ? Math.min(this.u, j2) : Math.max(0, this.u + j7) : -9223372036854775807L;
        this.f = j7 >= 0;
        this.v = a17;
    }

    public final Object a(List list) {
        return this;
    }
}
