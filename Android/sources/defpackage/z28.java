package defpackage;

import android.os.Bundle;

/* renamed from: z28  reason: default package */
public final class z28 extends fz9 {
    public final int l = 0;
    public final Bundle m = null;
    public final j0h n;
    public jv7 o;
    public a38 p;
    public j0h q;

    public z28(j0h j0h) {
        this.n = j0h;
        this.q = null;
        if (j0h.b == null) {
            j0h.b = this;
            j0h.a = 0;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public final void g() {
        j0h j0h = this.n;
        j0h.c = true;
        j0h.e = false;
        j0h.d = false;
        j0h.j.drainPermits();
        j0h.a();
        j0h.h = new xx(j0h);
        j0h.b();
    }

    public final void h() {
        this.n.c = false;
    }

    public final void j(dla dla) {
        super.j(dla);
        this.o = null;
        this.p = null;
    }

    public final void k(Object obj) {
        super.k(obj);
        j0h j0h = this.q;
        if (j0h != null) {
            j0h.e = true;
            j0h.c = false;
            j0h.d = false;
            j0h.f = false;
            this.q = null;
        }
    }

    public final void l() {
        jv7 jv7 = this.o;
        a38 a38 = this.p;
        if (jv7 != null && a38 != null) {
            super.j(a38);
            e(jv7, a38);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("LoaderInfo{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" #");
        sb.append(this.l);
        sb.append(" : ");
        kv0.k(sb, this.n);
        sb.append("}}");
        return sb.toString();
    }
}
