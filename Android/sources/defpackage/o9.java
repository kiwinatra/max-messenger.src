package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: o9  reason: default package */
public final class o9 {
    public static final String j = Integer.toString(0, 36);
    public static final String k = Integer.toString(1, 36);
    public static final String l = Integer.toString(2, 36);
    public static final String m = Integer.toString(3, 36);
    public static final String n = Integer.toString(4, 36);
    public static final String o = Integer.toString(5, 36);
    public static final String p = Integer.toString(6, 36);
    public static final String q = Integer.toString(7, 36);
    public static final String r = Integer.toString(8, 36);
    public final long a;
    public final int b;
    public final int c;
    public final Uri[] d;
    public final ir8[] e;
    public final int[] f;
    public final long[] g;
    public final long h;
    public final boolean i;

    static {
        int i2 = v0g.a;
    }

    public o9(long j2, int i2, int i3, int[] iArr, ir8[] ir8Arr, long[] jArr, long j3, boolean z) {
        Uri uri;
        int i4 = 0;
        n79.g(iArr.length == ir8Arr.length);
        this.a = j2;
        this.b = i2;
        this.c = i3;
        this.f = iArr;
        this.e = ir8Arr;
        this.g = jArr;
        this.h = j3;
        this.i = z;
        this.d = new Uri[ir8Arr.length];
        while (true) {
            Uri[] uriArr = this.d;
            if (i4 < uriArr.length) {
                ir8 ir8 = ir8Arr[i4];
                if (ir8 == null) {
                    uri = null;
                } else {
                    xq8 xq8 = ir8.b;
                    xq8.getClass();
                    uri = xq8.a;
                }
                uriArr[i4] = uri;
                i4++;
            } else {
                return;
            }
        }
    }

    public final int a(int i2) {
        int i3;
        int i4 = i2 + 1;
        while (true) {
            int[] iArr = this.f;
            if (i4 >= iArr.length || this.i || (i3 = iArr[i4]) == 0 || i3 == 1) {
                return i4;
            }
            i4++;
        }
        return i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o9.class != obj.getClass()) {
            return false;
        }
        o9 o9Var = (o9) obj;
        return this.a == o9Var.a && this.b == o9Var.b && this.c == o9Var.c && Arrays.equals(this.e, o9Var.e) && Arrays.equals(this.f, o9Var.f) && Arrays.equals(this.g, o9Var.g) && this.h == o9Var.h && this.i == o9Var.i;
    }

    public final int hashCode() {
        long j2 = this.a;
        int hashCode = Arrays.hashCode(this.e);
        int hashCode2 = Arrays.hashCode(this.f);
        int hashCode3 = Arrays.hashCode(this.g);
        long j3 = this.h;
        return ((((hashCode3 + ((hashCode2 + ((hashCode + (((((this.b * 31) + this.c) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31)) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.i ? 1 : 0);
    }
}
