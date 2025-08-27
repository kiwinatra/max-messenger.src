package defpackage;

import java.util.Objects;

/* renamed from: sef  reason: default package */
public final class sef extends q2 {
    public mqf o;
    public qx9 v;
    public je6 w;
    public final yr6 x;

    public sef(yr6 yr6, gy0 gy0) {
        super(gy0);
        this.x = yr6;
    }

    public final synchronized void G() {
        mqf mqf = this.o;
        mqf.getClass();
        mqf.w();
        super.G();
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 112 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int I() {
        /*
            r1 = this;
            mqf r1 = r1.o
            r1.getClass()
            monitor-enter(r1)
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x0012 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0012 }
            int r0 = r0.size()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)
            return r0
        L_0x0010:
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            throw r0
        L_0x0012:
            r0 = move-exception
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sef.I():int");
    }

    public final void P(int i, long j) {
        je6 je6 = this.w;
        je6.getClass();
        this.v.getClass();
        ((gy0) this.a).v(new ref(this, i, je6, j));
    }

    public final void U(je6 je6) {
        this.w = je6;
    }

    public final void V(qx9 qx9) {
        this.v = qx9;
    }

    public final void X(gi4 gi4) {
        this.o = new mqf(this.x, (fs6) gi4, (gy0) this.a);
    }

    public final void Y() {
        ((gy0) this.a).v(new dk4(3, this));
    }

    public final void r() {
        this.o.getClass();
        mqf mqf = this.o;
        Objects.requireNonNull(mqf);
        ((gy0) this.a).v(new dk4(4, mqf));
    }

    public final void release() {
    }

    public final void v(gs6 gs6) {
        ((gy0) this.a).v(new az1(4, this, gs6));
    }
}
