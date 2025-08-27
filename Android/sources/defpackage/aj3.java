package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: aj3  reason: default package */
public final class aj3 {
    public HashSet a = null;
    public int b;
    public boolean c;
    public final tj3 d;
    public final int e;
    public aj3 f;
    public int g = 0;
    public int h = IntCompanionObject.MIN_VALUE;
    public sfe i;

    public aj3(tj3 tj3, int i2) {
        this.d = tj3;
        this.e = i2;
    }

    public final void a(aj3 aj3, int i2) {
        b(aj3, i2, IntCompanionObject.MIN_VALUE, false);
    }

    public final boolean b(aj3 aj3, int i2, int i3, boolean z) {
        if (aj3 == null) {
            j();
            return true;
        } else if (!z && !i(aj3)) {
            return false;
        } else {
            this.f = aj3;
            if (aj3.a == null) {
                aj3.a = new HashSet();
            }
            HashSet hashSet = this.f.a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.g = i2;
            this.h = i3;
            return true;
        }
    }

    public final void c(int i2, fng fng, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                cvg.t(((aj3) it.next()).d, i2, arrayList, fng);
            }
        }
    }

    public final int d() {
        if (!this.c) {
            return 0;
        }
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r2 = r3.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int e() {
        /*
            r3 = this;
            tj3 r0 = r3.d
            int r0 = r0.g0
            r1 = 8
            if (r0 != r1) goto L_0x000a
            r3 = 0
            return r3
        L_0x000a:
            int r0 = r3.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L_0x001b
            aj3 r2 = r3.f
            if (r2 == 0) goto L_0x001b
            tj3 r2 = r2.d
            int r2 = r2.g0
            if (r2 != r1) goto L_0x001b
            return r0
        L_0x001b:
            int r3 = r3.g
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj3.e():int");
    }

    public final aj3 f() {
        int i2 = this.e;
        int y = tr1.y(i2);
        tj3 tj3 = this.d;
        switch (y) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return tj3.K;
            case 2:
                return tj3.L;
            case 3:
                return tj3.I;
            case 4:
                return tj3.J;
            default:
                throw new AssertionError(g63.p(i2));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((aj3) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    public final boolean i(aj3 aj3) {
        boolean z = false;
        if (aj3 == null) {
            return false;
        }
        int i2 = this.e;
        tj3 tj3 = aj3.d;
        int i3 = aj3.e;
        if (i3 == i2) {
            return i2 != 6 || (tj3.E && this.d.E);
        }
        switch (tr1.y(i2)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z2 = i3 == 2 || i3 == 4;
                if (!(tj3 instanceof iv6)) {
                    return z2;
                }
                if (z2 || i3 == 8) {
                    z = true;
                }
                return z;
            case 2:
            case 4:
                boolean z3 = i3 == 3 || i3 == 5;
                if (!(tj3 instanceof iv6)) {
                    return z3;
                }
                if (z3 || i3 == 9) {
                    z = true;
                }
                return z;
            case 5:
                return (i3 == 2 || i3 == 4) ? false : true;
            case 6:
                return (i3 == 6 || i3 == 8 || i3 == 9) ? false : true;
            default:
                throw new AssertionError(g63.p(i2));
        }
    }

    public final void j() {
        HashSet hashSet;
        aj3 aj3 = this.f;
        if (!(aj3 == null || (hashSet = aj3.a) == null)) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = IntCompanionObject.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        sfe sfe = this.i;
        if (sfe == null) {
            this.i = new sfe(1);
        } else {
            sfe.c();
        }
    }

    public final void l(int i2) {
        this.b = i2;
        this.c = true;
    }

    public final String toString() {
        return this.d.h0 + ":" + g63.p(this.e);
    }
}
