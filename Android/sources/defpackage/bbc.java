package defpackage;

import java.util.Arrays;
import java.util.List;

/* renamed from: bbc  reason: default package */
public final class bbc extends jkf {
    public static final bbc g = new bbc(k0d.v, (abc) null);
    public static final Object h = new Object();
    public final tb7 e;
    public final abc f;

    static {
        lx5 lx5 = tb7.b;
    }

    public bbc(tb7 tb7, abc abc) {
        this.e = tb7;
        this.f = abc;
    }

    public final int b(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbc)) {
            return false;
        }
        bbc bbc = (bbc) obj;
        return cjf.n(this.e, bbc.e) && cjf.n(this.f, bbc.f);
    }

    public final ekf g(int i, ekf ekf, boolean z) {
        abc v = v(i);
        Long valueOf = Long.valueOf(v.b);
        long S = v0g.S(v.c);
        ekf.getClass();
        ekf.j(valueOf, (Object) null, i, S, 0, q9.g, false);
        return ekf;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, this.f});
    }

    public final int i() {
        return p();
    }

    public final Object m(int i) {
        throw new UnsupportedOperationException();
    }

    public final hkf n(int i, hkf hkf, long j) {
        abc v = v(i);
        hkf.b(h, v.a, (Object) null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, true, false, (wq8) null, 0, v0g.S(v.c), i, i, 0);
        return hkf;
    }

    public final int p() {
        return this.e.size() + (this.f == null ? 0 : 1);
    }

    public final boolean r(ir8 ir8) {
        abc abc = this.f;
        if (abc != null && ir8.equals(abc.a)) {
            return true;
        }
        int i = 0;
        while (true) {
            tb7 tb7 = this.e;
            if (i >= tb7.size()) {
                return false;
            }
            if (ir8.equals(((abc) tb7.get(i)).a)) {
                return true;
            }
            i++;
        }
    }

    public final bbc s(int i, ir8 ir8, long j) {
        tb7 tb7 = this.e;
        int size = tb7.size();
        abc abc = this.f;
        n79.g(i < size || (i == tb7.size() && abc != null));
        if (i == tb7.size()) {
            return new bbc(tb7, new abc(ir8, -1, j));
        }
        long j2 = ((abc) tb7.get(i)).b;
        qb7 qb7 = new qb7();
        qb7.f(tb7.subList(0, i));
        qb7.d(new abc(ir8, j2, j));
        qb7.f(tb7.subList(i + 1, tb7.size()));
        return new bbc(qb7.j(), abc);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [qb7, jb7] */
    public final bbc t(int i, List list) {
        ? jb7 = new jb7(4);
        tb7 tb7 = this.e;
        jb7.e(tb7.subList(0, i));
        for (int i2 = 0; i2 < list.size(); i2++) {
            jb7.a(new abc((ir8) list.get(i2), -1, -9223372036854775807L));
        }
        jb7.e(tb7.subList(i, tb7.size()));
        return new bbc(jb7.j(), this.f);
    }

    public final long u(int i) {
        if (i >= 0) {
            tb7 tb7 = this.e;
            if (i < tb7.size()) {
                return ((abc) tb7.get(i)).b;
            }
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r2 = r2.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.abc v(int r3) {
        /*
            r2 = this;
            tb7 r0 = r2.e
            int r1 = r0.size()
            if (r3 != r1) goto L_0x000d
            abc r2 = r2.f
            if (r2 == 0) goto L_0x000d
            goto L_0x0013
        L_0x000d:
            java.lang.Object r2 = r0.get(r3)
            abc r2 = (defpackage.abc) r2
        L_0x0013:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbc.v(int):abc");
    }
}
