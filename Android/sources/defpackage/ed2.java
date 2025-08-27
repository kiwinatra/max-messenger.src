package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: ed2  reason: default package */
public final class ed2 {
    public final rl a;
    public final r62 b;
    public final fa9 c;
    public final jtb d;
    public final rh3 e;
    public final gb9 f;

    public ed2(rl rlVar, r62 r62, fa9 fa9, jtb jtb, rh3 rh3, gb9 gb9) {
        this.a = rlVar;
        this.b = r62;
        this.c = fa9;
        this.d = jtb;
        this.e = rh3;
        this.f = gb9;
    }

    public final long a(a32 a32, ha9 ha9, boolean z, Set set) {
        int i;
        ed2 ed2;
        a32 a322 = a32;
        ha9 ha92 = ha9;
        long j = a322.b.a;
        long j2 = ha92 != null ? ha92.b : 0;
        long j3 = ha92 != null ? ha92.c : 0;
        int i2 = z ? 100 : 0;
        if (z) {
            ed2 = this;
            i = 0;
        } else {
            i = 100;
            ed2 = this;
        }
        jna jna = (jna) ed2.a;
        long j4 = a322.a;
        if (!jna.r(j4)) {
            return 0;
        }
        return jna.z(jna, new pc2(((ltb) jna.D()).a.n(), j4, j, j2, j3, i2, i, set));
    }

    public final void b(a32 a32, HashSet hashSet) {
        a32 a322 = a32;
        long j = a322.a;
        long j2 = a322.b.a;
        jna jna = (jna) this.a;
        if (jna.r(j)) {
            jna.z(jna, new pc2(((ltb) jna.D()).a.n(), j, j2, 0, 0, 0, 0, hashSet));
        }
    }

    public final boolean c(boolean z) {
        int i = ((ltb) this.d).c.g.getInt("app.media.load.gif", 0);
        return z ? d(i) : i != -1;
    }

    public final boolean d(int i) {
        rh3 rh3 = this.e;
        boolean f2 = rh3.f();
        mi3 b2 = rh3.b();
        if (i != -1) {
            return i != 0 ? b2 == mi3.b : b2 == mi3.b || ((ltb) this.d).c.m() || !f2;
        }
        return false;
    }

    public final boolean e() {
        return d(((ltb) this.d).c.g.getInt("app.media.load.photo", 0));
    }

    public final boolean f(boolean z) {
        int i = ((ltb) this.d).c.g.getInt("app.media.load.stickers", 0);
        return z ? d(i) : i != -1;
    }
}
