package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* renamed from: uob  reason: default package */
public final class uob {
    public static final String j = Integer.toString(0, 36);
    public static final String k = Integer.toString(1, 36);
    public static final String l = Integer.toString(2, 36);
    public static final String m = Integer.toString(3, 36);
    public static final String n = Integer.toString(4, 36);
    public static final String o = Integer.toString(5, 36);
    public static final String p = Integer.toString(6, 36);
    public final Object a;
    public final int b;
    public final ir8 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        int i2 = v0g.a;
    }

    public uob(Object obj, int i2, ir8 ir8, Object obj2, int i3, long j2, long j3, int i4, int i5) {
        this.a = obj;
        this.b = i2;
        this.c = ir8;
        this.d = obj2;
        this.e = i3;
        this.f = j2;
        this.g = j3;
        this.h = i4;
        this.i = i5;
    }

    public static uob c(Bundle bundle) {
        int i2 = bundle.getInt(j, 0);
        Bundle bundle2 = bundle.getBundle(k);
        return new uob((Object) null, i2, bundle2 == null ? null : ir8.b(bundle2), (Object) null, bundle.getInt(l, 0), bundle.getLong(m, 0), bundle.getLong(n, 0), bundle.getInt(o, -1), bundle.getInt(p, -1));
    }

    public final boolean a(uob uob) {
        return this.b == uob.b && this.e == uob.e && this.f == uob.f && this.g == uob.g && this.h == uob.h && this.i == uob.i && cjf.n(this.c, uob.c);
    }

    public final uob b(boolean z, boolean z2) {
        if (z && z2) {
            return this;
        }
        int i2 = z2 ? this.b : 0;
        ir8 ir8 = z ? this.c : null;
        int i3 = z2 ? this.e : 0;
        long j2 = 0;
        long j3 = z ? this.f : 0;
        if (z) {
            j2 = this.g;
        }
        return new uob(this.a, i2, ir8, this.d, i3, j3, j2, z ? this.h : -1, z ? this.i : -1);
    }

    public final Bundle d(int i2) {
        Bundle bundle = new Bundle();
        int i3 = this.b;
        if (i2 < 3 || i3 != 0) {
            bundle.putInt(j, i3);
        }
        ir8 ir8 = this.c;
        if (ir8 != null) {
            bundle.putBundle(k, ir8.d(false));
        }
        int i4 = this.e;
        if (i2 < 3 || i4 != 0) {
            bundle.putInt(l, i4);
        }
        long j2 = this.f;
        if (i2 < 3 || j2 != 0) {
            bundle.putLong(m, j2);
        }
        long j3 = this.g;
        if (i2 < 3 || j3 != 0) {
            bundle.putLong(n, j3);
        }
        int i5 = this.h;
        if (i5 != -1) {
            bundle.putInt(o, i5);
        }
        int i6 = this.i;
        if (i6 != -1) {
            bundle.putInt(p, i6);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uob.class != obj.getClass()) {
            return false;
        }
        uob uob = (uob) obj;
        return a(uob) && cjf.n(this.a, uob.a) && cjf.n(this.d, uob.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i)});
    }
}
