package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: kqf  reason: default package */
public class kqf {
    public static final kqf C = new kqf(new iqf());
    public static final String D = Integer.toString(1, 36);
    public static final String E = Integer.toString(2, 36);
    public static final String F = Integer.toString(3, 36);
    public static final String G = Integer.toString(4, 36);
    public static final String H = Integer.toString(5, 36);
    public static final String I = Integer.toString(6, 36);
    public static final String J = Integer.toString(7, 36);
    public static final String K = Integer.toString(8, 36);
    public static final String L = Integer.toString(9, 36);
    public static final String M = Integer.toString(10, 36);
    public static final String N = Integer.toString(11, 36);
    public static final String O = Integer.toString(12, 36);
    public static final String P = Integer.toString(13, 36);
    public static final String Q = Integer.toString(14, 36);
    public static final String R = Integer.toString(15, 36);
    public static final String S = Integer.toString(16, 36);
    public static final String T = Integer.toString(17, 36);
    public static final String U = Integer.toString(18, 36);
    public static final String V = Integer.toString(19, 36);
    public static final String W = Integer.toString(20, 36);
    public static final String X = Integer.toString(21, 36);
    public static final String Y = Integer.toString(22, 36);
    public static final String Z = Integer.toString(23, 36);
    public static final String a0 = Integer.toString(24, 36);
    public static final String b0 = Integer.toString(25, 36);
    public static final String c0 = Integer.toString(26, 36);
    public static final String d0 = Integer.toString(27, 36);
    public static final String e0 = Integer.toString(28, 36);
    public static final String f0 = Integer.toString(29, 36);
    public static final String g0 = Integer.toString(30, 36);
    public static final String h0 = Integer.toString(31, 36);
    public final wb7 A;
    public final dc7 B;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final tb7 l;
    public final int m;
    public final tb7 n;
    public final int o;
    public final int p;
    public final int q;
    public final tb7 r;
    public final gqf s;
    public final tb7 t;
    public final int u;
    public final int v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    static {
        int i2 = v0g.a;
    }

    public kqf(iqf iqf) {
        this.a = iqf.a;
        this.b = iqf.b;
        this.c = iqf.c;
        this.d = iqf.d;
        this.e = iqf.e;
        this.f = iqf.f;
        this.g = iqf.g;
        this.h = iqf.h;
        this.i = iqf.i;
        this.j = iqf.j;
        this.k = iqf.k;
        this.l = iqf.l;
        this.m = iqf.m;
        this.n = iqf.n;
        this.o = iqf.o;
        this.p = iqf.p;
        this.q = iqf.q;
        this.r = iqf.r;
        this.s = iqf.s;
        this.t = iqf.t;
        this.u = iqf.u;
        this.v = iqf.v;
        this.w = iqf.w;
        this.x = iqf.x;
        this.y = iqf.y;
        this.z = iqf.z;
        this.A = wb7.b(iqf.A);
        this.B = dc7.p(iqf.B);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, iqf] */
    public static kqf b(Bundle bundle) {
        gqf gqf;
        k0d k0d;
        ? obj = new Object();
        kqf kqf = C;
        obj.a = bundle.getInt(I, kqf.a);
        obj.b = bundle.getInt(J, kqf.b);
        obj.c = bundle.getInt(K, kqf.c);
        obj.d = bundle.getInt(L, kqf.d);
        obj.e = bundle.getInt(M, kqf.e);
        obj.f = bundle.getInt(N, kqf.f);
        obj.g = bundle.getInt(O, kqf.g);
        obj.h = bundle.getInt(P, kqf.h);
        obj.i = bundle.getInt(Q, kqf.i);
        obj.j = bundle.getInt(R, kqf.j);
        obj.k = bundle.getBoolean(S, kqf.k);
        String[] stringArray = bundle.getStringArray(T);
        String[] strArr = new String[0];
        if (stringArray == null) {
            stringArray = strArr;
        }
        obj.l = tb7.q(stringArray);
        obj.m = bundle.getInt(b0, kqf.m);
        String[] stringArray2 = bundle.getStringArray(D);
        String[] strArr2 = new String[0];
        if (stringArray2 == null) {
            stringArray2 = strArr2;
        }
        obj.n = iqf.e(stringArray2);
        obj.o = bundle.getInt(E, kqf.o);
        obj.p = bundle.getInt(U, kqf.p);
        obj.q = bundle.getInt(V, kqf.q);
        String[] stringArray3 = bundle.getStringArray(W);
        String[] strArr3 = new String[0];
        if (stringArray3 == null) {
            stringArray3 = strArr3;
        }
        obj.r = tb7.q(stringArray3);
        Bundle bundle2 = bundle.getBundle(g0);
        if (bundle2 != null) {
            n70 n70 = new n70();
            gqf gqf2 = gqf.d;
            n70.a = bundle2.getInt(gqf.e, gqf2.a);
            n70.b = bundle2.getBoolean(gqf.f, gqf2.b);
            n70.c = bundle2.getBoolean(gqf.g, gqf2.c);
            gqf = new gqf(n70);
        } else {
            n70 n702 = new n70();
            gqf gqf3 = gqf.d;
            n702.a = bundle.getInt(d0, gqf3.a);
            n702.b = bundle.getBoolean(e0, gqf3.b);
            n702.c = bundle.getBoolean(f0, gqf3.c);
            gqf = new gqf(n702);
        }
        obj.s = gqf;
        String[] stringArray4 = bundle.getStringArray(F);
        String[] strArr4 = new String[0];
        if (stringArray4 == null) {
            stringArray4 = strArr4;
        }
        obj.t = iqf.e(stringArray4);
        obj.u = bundle.getInt(G, kqf.u);
        obj.v = bundle.getInt(c0, kqf.v);
        obj.w = bundle.getBoolean(H, kqf.w);
        obj.x = bundle.getBoolean(h0, kqf.x);
        obj.y = bundle.getBoolean(X, kqf.y);
        obj.z = bundle.getBoolean(Y, kqf.z);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Z);
        if (parcelableArrayList == null) {
            k0d = k0d.v;
        } else {
            qb7 o2 = tb7.o();
            for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                Bundle bundle3 = (Bundle) parcelableArrayList.get(i2);
                bundle3.getClass();
                Bundle bundle4 = bundle3.getBundle(dqf.c);
                bundle4.getClass();
                spf b2 = spf.b(bundle4);
                int[] intArray = bundle3.getIntArray(dqf.d);
                intArray.getClass();
                o2.a(new dqf(b2, cvg.d(intArray)));
            }
            k0d = o2.j();
        }
        obj.A = new HashMap();
        for (int i3 = 0; i3 < k0d.o; i3++) {
            dqf dqf = (dqf) k0d.get(i3);
            obj.A.put(dqf.a, dqf);
        }
        int[] intArray2 = bundle.getIntArray(a0);
        int[] iArr = new int[0];
        if (intArray2 == null) {
            intArray2 = iArr;
        }
        obj.B = new HashSet();
        for (int valueOf : intArray2) {
            obj.B.add(Integer.valueOf(valueOf));
        }
        return new kqf(obj);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, iqf] */
    public iqf a() {
        ? obj = new Object();
        obj.d(this);
        return obj;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(I, this.a);
        bundle.putInt(J, this.b);
        bundle.putInt(K, this.c);
        bundle.putInt(L, this.d);
        bundle.putInt(M, this.e);
        bundle.putInt(N, this.f);
        bundle.putInt(O, this.g);
        bundle.putInt(P, this.h);
        bundle.putInt(Q, this.i);
        bundle.putInt(R, this.j);
        bundle.putBoolean(S, this.k);
        tb7 tb7 = this.l;
        bundle.putStringArray(T, (String[]) tb7.toArray(new String[0]));
        bundle.putInt(b0, this.m);
        bundle.putStringArray(D, (String[]) this.n.toArray(new String[0]));
        bundle.putInt(E, this.o);
        bundle.putInt(U, this.p);
        bundle.putInt(V, this.q);
        bundle.putStringArray(W, (String[]) this.r.toArray(new String[0]));
        bundle.putStringArray(F, (String[]) this.t.toArray(new String[0]));
        bundle.putInt(G, this.u);
        bundle.putInt(c0, this.v);
        bundle.putBoolean(H, this.w);
        gqf gqf = this.s;
        bundle.putInt(d0, gqf.a);
        bundle.putBoolean(e0, gqf.b);
        bundle.putBoolean(f0, gqf.c);
        gqf.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putInt(gqf.e, gqf.a);
        bundle2.putBoolean(gqf.f, gqf.b);
        bundle2.putBoolean(gqf.g, gqf.c);
        bundle.putBundle(g0, bundle2);
        bundle.putBoolean(h0, this.x);
        bundle.putBoolean(X, this.y);
        bundle.putBoolean(Y, this.z);
        bundle.putParcelableArrayList(Z, ev0.G(this.A.values(), new xff(12)));
        bundle.putIntArray(a0, cvg.L(this.B));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kqf kqf = (kqf) obj;
        if (this.a == kqf.a && this.b == kqf.b && this.c == kqf.c && this.d == kqf.d && this.e == kqf.e && this.f == kqf.f && this.g == kqf.g && this.h == kqf.h && this.k == kqf.k && this.i == kqf.i && this.j == kqf.j && this.l.equals(kqf.l) && this.m == kqf.m && this.n.equals(kqf.n) && this.o == kqf.o && this.p == kqf.p && this.q == kqf.q && this.r.equals(kqf.r) && this.s.equals(kqf.s) && this.t.equals(kqf.t) && this.u == kqf.u && this.v == kqf.v && this.w == kqf.w && this.x == kqf.x && this.y == kqf.y && this.z == kqf.z) {
            wb7 wb7 = this.A;
            wb7.getClass();
            if (hd8.o(wb7, kqf.A) && this.B.equals(kqf.B)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.l.hashCode();
        int hashCode2 = this.n.hashCode();
        int hashCode3 = this.r.hashCode();
        int hashCode4 = this.s.hashCode();
        int hashCode5 = this.t.hashCode();
        int hashCode6 = this.A.hashCode();
        return this.B.hashCode() + ((hashCode6 + ((((((((((((((hashCode5 + ((hashCode4 + ((hashCode3 + ((((((((hashCode2 + ((((hashCode + ((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + (this.k ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31)) * 31) + this.m) * 31)) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31)) * 31)) * 31)) * 31) + this.u) * 31) + this.v) * 31) + (this.w ? 1 : 0)) * 31) + (this.x ? 1 : 0)) * 31) + (this.y ? 1 : 0)) * 31) + (this.z ? 1 : 0)) * 31)) * 31);
    }
}
