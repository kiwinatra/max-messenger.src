package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: iqf  reason: default package */
public class iqf {
    public HashMap A;
    public HashSet B;
    public int a = IntCompanionObject.MAX_VALUE;
    public int b = IntCompanionObject.MAX_VALUE;
    public int c = IntCompanionObject.MAX_VALUE;
    public int d = IntCompanionObject.MAX_VALUE;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i = IntCompanionObject.MAX_VALUE;
    public int j = IntCompanionObject.MAX_VALUE;
    public boolean k = true;
    public tb7 l;
    public int m;
    public tb7 n;
    public int o;
    public int p;
    public int q;
    public tb7 r;
    public gqf s;
    public tb7 t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public iqf() {
        lx5 lx5 = tb7.b;
        k0d k0d = k0d.v;
        this.l = k0d;
        this.m = 0;
        this.n = k0d;
        this.o = 0;
        this.p = IntCompanionObject.MAX_VALUE;
        this.q = IntCompanionObject.MAX_VALUE;
        this.r = k0d;
        this.s = gqf.d;
        this.t = k0d;
        this.u = 0;
        this.v = 0;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = false;
        this.A = new HashMap();
        this.B = new HashSet();
    }

    public static k0d e(String[] strArr) {
        qb7 o2 = tb7.o();
        for (String str : strArr) {
            str.getClass();
            o2.a(v0g.T(str));
        }
        return o2.j();
    }

    public void a(dqf dqf) {
        this.A.put(dqf.a, dqf);
    }

    public kqf b() {
        return new kqf(this);
    }

    public iqf c() {
        this.A.clear();
        return this;
    }

    public final void d(kqf kqf) {
        this.a = kqf.a;
        this.b = kqf.b;
        this.c = kqf.c;
        this.d = kqf.d;
        this.e = kqf.e;
        this.f = kqf.f;
        this.g = kqf.g;
        this.h = kqf.h;
        this.i = kqf.i;
        this.j = kqf.j;
        this.k = kqf.k;
        this.l = kqf.l;
        this.m = kqf.m;
        this.n = kqf.n;
        this.o = kqf.o;
        this.p = kqf.p;
        this.q = kqf.q;
        this.r = kqf.r;
        this.s = kqf.s;
        this.t = kqf.t;
        this.u = kqf.u;
        this.v = kqf.v;
        this.w = kqf.w;
        this.x = kqf.x;
        this.y = kqf.y;
        this.z = kqf.z;
        this.B = new HashSet(kqf.B);
        this.A = new HashMap(kqf.A);
    }

    public iqf f(int i2, int i3) {
        this.i = i2;
        this.j = i3;
        this.k = true;
        return this;
    }
}
