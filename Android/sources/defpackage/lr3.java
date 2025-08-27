package defpackage;

import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;

/* renamed from: lr3  reason: default package */
public final class lr3 extends qm implements lcf {
    public final long o;
    public final int v = 50;
    public final int w;

    public lr3(int i, long j, long j2) {
        super(j);
        this.o = j2;
        this.w = i;
    }

    public final void e(ibf ibf) {
        mr3 mr3 = (mr3) ibf;
        k().c(new nr3(this.a, mr3.c, mr3.o, mr3.v));
    }

    public final fbf g() {
        np2 np2 = new np2((x3b) null, 9);
        np2.p(this.o, "contactId");
        int i = this.v;
        if (i != 0) {
            np2.h(i, NewHtcHomeBadger.COUNT);
        }
        int i2 = this.w;
        if (i2 != 0) {
            np2.h(i2, "from");
        }
        return np2;
    }

    public final void h(qaf qaf) {
        if (qaf instanceof aaf) {
            k().c(new hj0(this.a, qaf));
        }
    }
}
