package com.my.tracker.obfuscated;

import android.text.TextUtils;
import kotlin.io.ConstantsKt;

public abstract class q1 {
    protected final q a = new q(16384);
    protected final q b = new q(ConstantsKt.DEFAULT_BLOCK_SIZE);

    public synchronized void a() {
        this.a.d();
        this.b.d();
    }

    public static void a(r1 r1Var, String str, k0 k0Var, t0 t0Var, q qVar) {
        qVar.a();
        qVar.a(1, str);
        if (k0Var != null && !TextUtils.isEmpty(k0Var.a)) {
            boolean z = k0Var.b;
            qVar.a(2, k0Var.a);
            qVar.a(3, z ? 1 : 0);
        }
        if (t0Var != null && !TextUtils.isEmpty(t0Var.a)) {
            boolean z2 = t0Var.b;
            qVar.a(4, t0Var.a);
            qVar.a(5, z2 ? 1 : 0);
        }
        if (qVar.b() > 0) {
            r1Var.a(31, qVar);
        }
    }

    public static void a(r1 r1Var, g gVar, z zVar, q qVar, q qVar2) {
        qVar.a();
        if (gVar != null) {
            qVar2.a();
            qVar2.a(1, gVar.a);
            int i = gVar.b;
            if (i != -1) {
                qVar2.a(2, i);
            }
            if (qVar2.b() > 0) {
                qVar.a(31, qVar2);
            }
        }
        qVar.a(1, zVar.g);
        qVar.a(2, zVar.f);
        qVar.a(3, zVar.k);
        qVar.a(4, zVar.e);
        r1Var.a(21, qVar);
    }

    public static void a(r1 r1Var, String str, String str2, f0 f0Var, q qVar, q qVar2) {
        z zVar = f0Var.c;
        qVar.a();
        a((r1) qVar, str, f0Var.d, f0Var.e, qVar2);
        int i = zVar.a;
        if (i != -1) {
            qVar.a(1, i);
        }
        if (!TextUtils.isEmpty(zVar.d)) {
            qVar.a(2, zVar.d);
        }
        if (!TextUtils.isEmpty(zVar.j)) {
            qVar.a(3, zVar.j);
        }
        if (!TextUtils.isEmpty(zVar.p)) {
            qVar.a(4, zVar.p);
        }
        if (!TextUtils.isEmpty(zVar.b)) {
            qVar.a(5, zVar.b);
        }
        if (!TextUtils.isEmpty(zVar.c)) {
            qVar.a(6, zVar.c);
        }
        if (!TextUtils.isEmpty(zVar.i)) {
            qVar.a(7, zVar.i);
        }
        if (!TextUtils.isEmpty(zVar.h)) {
            qVar.a(8, zVar.h);
        }
        int i2 = zVar.w;
        if (i2 != -1) {
            qVar.a(9, i2);
        }
        int i3 = zVar.q;
        if (i3 != -1) {
            qVar.a(10, i3);
        }
        int i4 = zVar.r;
        if (i4 != -1) {
            qVar.a(11, i4);
        }
        int i5 = zVar.s;
        if (i5 != -1) {
            qVar.a(12, i5);
        }
        if (!Float.isNaN(zVar.u)) {
            qVar.a(13, zVar.u);
        }
        if (!Float.isNaN(zVar.v)) {
            qVar.a(14, zVar.v);
        }
        if (!Float.isNaN(zVar.t)) {
            qVar.a(15, zVar.t);
        }
        qVar.a(16, str2);
        o oVar = f0Var.j;
        if (oVar != null) {
            int i6 = oVar.a;
            if (i6 != -1) {
                qVar.a(17, i6);
            }
            int i7 = oVar.b;
            if (i7 >= 0) {
                qVar.a(18, i7);
            }
        }
        long j = zVar.x;
        if (j != -1) {
            qVar.a(19, j);
        }
        long j2 = zVar.y;
        if (j2 != -1) {
            qVar.a(20, j2);
        }
        int i8 = zVar.z;
        if (i8 != -1) {
            qVar.a(23, i8);
        }
        int i9 = zVar.A;
        if (i9 != -1) {
            qVar.a(24, i9);
        }
        h0 h0Var = f0Var.k;
        if (h0Var != null && !TextUtils.isEmpty(h0Var.a)) {
            qVar.a(25, f0Var.k.a);
        }
        if (qVar.b() > 0) {
            r1Var.a(23, qVar);
        }
    }

    public static void a(r1 r1Var, z0 z0Var, q qVar) {
        if (!z0Var.equals(z0.g)) {
            qVar.a();
            if (!Double.isNaN(z0Var.b)) {
                qVar.a(1, z0Var.b);
            }
            if (!Double.isNaN(z0Var.c)) {
                qVar.a(2, z0Var.c);
            }
            if (!Float.isNaN(z0Var.d)) {
                qVar.a(3, (double) z0Var.d);
            }
            if (!Float.isNaN(z0Var.e)) {
                qVar.a(4, (double) z0Var.e);
            }
            long j = z0Var.f;
            if (j > 0) {
                qVar.a(5, v2.b(j));
            }
            int i = z0Var.a;
            if (i != -1) {
                qVar.a(6, i);
            }
            if (qVar.b() > 0) {
                r1Var.a(26, qVar);
            }
        }
    }

    public static void a(r1 r1Var, h1 h1Var, x0 x0Var, z zVar, q qVar) {
        qVar.a();
        int i = h1Var.a;
        int i2 = 1;
        if (i != -1) {
            qVar.a(1, i);
        }
        Boolean bool = h1Var.c;
        if (bool != null) {
            qVar.a(7, bool == Boolean.TRUE ? 1 : 0);
        }
        qVar.a(2, h1Var.b);
        if (!TextUtils.isEmpty(zVar.l)) {
            qVar.a(3, zVar.l);
        }
        if (!TextUtils.isEmpty(zVar.m)) {
            qVar.a(4, zVar.m);
        }
        if (!TextUtils.isEmpty(zVar.n)) {
            qVar.a(5, zVar.n);
        }
        if (!TextUtils.isEmpty(zVar.o)) {
            qVar.a(6, zVar.o);
        }
        if (x0Var != null) {
            qVar.a(8, x0Var.a);
        }
        if (h1Var.d != 2) {
            i2 = 0;
        }
        qVar.a(11, i2);
        if (qVar.b() > 0) {
            r1Var.a(25, qVar);
        }
    }

    public static void a(r1 r1Var, boolean z, b3 b3Var, q qVar) {
        int i;
        qVar.a();
        if (!z && ((i = b3Var.b) == 0 || i == 1 || i == 2)) {
            qVar.a(1, i);
        }
        int i2 = b3Var.a;
        if (i2 > -1) {
            qVar.a(2, i2);
        }
        if (!z) {
            qVar.a(3, b3Var.c);
            qVar.a(4, b3Var.d);
            qVar.a(5, b3Var.e);
            qVar.a(6, b3Var.f);
            qVar.a(7, b3Var.g);
            qVar.a(8, b3Var.h);
            qVar.a(9, b3Var.i);
        }
        if (qVar.b() > 0) {
            r1Var.a(22, qVar);
        }
    }
}
