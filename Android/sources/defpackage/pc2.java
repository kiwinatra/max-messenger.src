package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: pc2  reason: default package */
public final class pc2 extends qm implements lcf {
    public final Set X;
    public final String Y = pc2.class.getName();
    public final long o;
    public final long v;
    public final long w;
    public final long x;
    public final int y;
    public final int z;

    public pc2(long j, long j2, long j3, long j4, long j5, int i, int i2, Set set) {
        super(j);
        this.o = j2;
        this.v = j3;
        this.w = j4;
        this.x = j5;
        this.y = i;
        this.z = i2;
        this.X = set;
    }

    public final void e(ibf ibf) {
        bd2 bd2 = (bd2) ibf;
        z68.c(this.Y, "onSuccess: " + bd2, new Object[0]);
        if (l().G(this.o) != null) {
            fa9 o2 = o();
            List d = bd2.d();
            o2.h(this.o, ((ltb) q()).a.s(), d);
            r62 l = l();
            l.getClass();
            int i = bd2.v;
            z68.c("r62", "onChatMedia: totalCount = " + i, new Object[0]);
            int i2 = this.z;
            int i3 = this.y;
            Set set = this.X;
            long j = this.w;
            long j2 = this.o;
            long j3 = j2;
            l.i(j3, false, new p52(l, i2, i3, set, i, bd2, j, j2));
            l.m.c(new xy2(Collections.singletonList(Long.valueOf(j3)), false));
            sv0 k = k();
            int size = bd2.d().size();
            k.c(new ee2(this.a, this.w, this.y, this.z, size, this.X));
        }
    }

    public final fbf g() {
        return new yt(this.v, Long.valueOf(this.x), this.X, Integer.valueOf(this.y), Integer.valueOf(this.z));
    }

    public final void h(qaf qaf) {
        k().c(new hj0(this.a, qaf));
    }
}
