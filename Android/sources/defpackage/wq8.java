package defpackage;

import android.os.Bundle;

/* renamed from: wq8  reason: default package */
public final class wq8 {
    public static final wq8 f = new uq8().a();
    public static final String g = Integer.toString(0, 36);
    public static final String h = Integer.toString(1, 36);
    public static final String i = Integer.toString(2, 36);
    public static final String j = Integer.toString(3, 36);
    public static final String k = Integer.toString(4, 36);
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        int i2 = v0g.a;
    }

    public wq8(uq8 uq8) {
        long j2 = uq8.a;
        long j3 = uq8.b;
        long j4 = uq8.c;
        float f2 = uq8.d;
        float f3 = uq8.e;
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = f2;
        this.e = f3;
    }

    public static wq8 b(Bundle bundle) {
        uq8 uq8 = new uq8();
        wq8 wq8 = f;
        uq8.a = bundle.getLong(g, wq8.a);
        uq8.b = bundle.getLong(h, wq8.b);
        uq8.c = bundle.getLong(i, wq8.c);
        uq8.d = bundle.getFloat(j, wq8.d);
        uq8.e = bundle.getFloat(k, wq8.e);
        return new wq8(uq8);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, uq8] */
    public final uq8 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        return obj;
    }

    public final Bundle c() {
        Bundle bundle = new Bundle();
        wq8 wq8 = f;
        long j2 = wq8.a;
        long j3 = this.a;
        if (j3 != j2) {
            bundle.putLong(g, j3);
        }
        long j4 = wq8.b;
        long j5 = this.b;
        if (j5 != j4) {
            bundle.putLong(h, j5);
        }
        long j6 = wq8.c;
        long j7 = this.c;
        if (j7 != j6) {
            bundle.putLong(i, j7);
        }
        float f2 = wq8.d;
        float f3 = this.d;
        if (f3 != f2) {
            bundle.putFloat(j, f3);
        }
        float f4 = wq8.e;
        float f5 = this.e;
        if (f5 != f4) {
            bundle.putFloat(k, f5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wq8)) {
            return false;
        }
        wq8 wq8 = (wq8) obj;
        return this.a == wq8.a && this.b == wq8.b && this.c == wq8.c && this.d == wq8.d && this.e == wq8.e;
    }

    public final int hashCode() {
        long j2 = this.a;
        long j3 = this.b;
        long j4 = this.c;
        int i2 = ((((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31;
        float f2 = this.d;
        int i3 = 0;
        int floatToIntBits = (i2 + (f2 != c44.DEFAULT_ASPECT_RATIO ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.e;
        if (f3 != c44.DEFAULT_ASPECT_RATIO) {
            i3 = Float.floatToIntBits(f3);
        }
        return floatToIntBits + i3;
    }
}
