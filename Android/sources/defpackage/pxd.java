package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.IBinder;
import java.util.Arrays;

/* renamed from: pxd  reason: default package */
public final class pxd implements nxd {
    public static final String j = Integer.toString(0, 36);
    public static final String k = Integer.toString(1, 36);
    public static final String l = Integer.toString(2, 36);
    public static final String m = Integer.toString(3, 36);
    public static final String n = Integer.toString(4, 36);
    public static final String o = Integer.toString(5, 36);
    public static final String p = Integer.toString(6, 36);
    public static final String q = Integer.toString(7, 36);
    public static final String r = Integer.toString(8, 36);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final ComponentName g;
    public final IBinder h;
    public final Bundle i;

    static {
        int i2 = v0g.a;
    }

    public pxd(int i2, int i3, int i4, int i5, String str, String str2, ComponentName componentName, IBinder iBinder, Bundle bundle) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = str;
        this.f = str2;
        this.g = componentName;
        this.h = iBinder;
        this.i = bundle;
    }

    public final int a() {
        return this.a;
    }

    public final ComponentName b() {
        return this.g;
    }

    public final Object c() {
        return this.h;
    }

    public final String d() {
        return this.f;
    }

    public final boolean e() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r4 = (defpackage.pxd) r4;
        r0 = r4.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof defpackage.pxd
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            pxd r4 = (defpackage.pxd) r4
            int r0 = r4.a
            int r2 = r3.a
            if (r2 != r0) goto L_0x0049
            int r0 = r3.b
            int r2 = r4.b
            if (r0 != r2) goto L_0x0049
            int r0 = r3.c
            int r2 = r4.c
            if (r0 != r2) goto L_0x0049
            int r0 = r3.d
            int r2 = r4.d
            if (r0 != r2) goto L_0x0049
            java.lang.String r0 = r3.e
            java.lang.String r2 = r4.e
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L_0x0049
            java.lang.String r0 = r3.f
            java.lang.String r2 = r4.f
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L_0x0049
            android.content.ComponentName r0 = r3.g
            android.content.ComponentName r2 = r4.g
            boolean r0 = defpackage.v0g.a(r0, r2)
            if (r0 == 0) goto L_0x0049
            android.os.IBinder r3 = r3.h
            android.os.IBinder r4 = r4.h
            boolean r3 = defpackage.v0g.a(r3, r4)
            if (r3 == 0) goto L_0x0049
            r1 = 1
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pxd.equals(java.lang.Object):boolean");
    }

    public final int f() {
        return this.d;
    }

    public final Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putInt(j, this.a);
        bundle.putInt(k, this.b);
        bundle.putInt(l, this.c);
        bundle.putString(m, this.e);
        bundle.putString(n, this.f);
        bundle.putBinder(p, this.h);
        bundle.putParcelable(o, this.g);
        bundle.putBundle(q, this.i);
        bundle.putInt(r, this.d);
        return bundle;
    }

    public final Bundle getExtras() {
        return new Bundle(this.i);
    }

    public final String getPackageName() {
        return this.e;
    }

    public final int getType() {
        return this.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f, this.g, this.h});
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.e + " type=" + this.b + " libraryVersion=" + this.c + " interfaceVersion=" + this.d + " service=" + this.f + " IMediaSession=" + this.h + " extras=" + this.i + "}";
    }
}
