package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: n9  reason: default package */
public final class n9 implements jv0 {
    public static final rx0 y = new rx0(16);
    public final long a;
    public final int b;
    public final Uri[] c;
    public final int[] o;
    public final long[] v;
    public final long w;
    public final boolean x;

    public n9(long j, int i, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
        y64.g(iArr.length == uriArr.length);
        this.a = j;
        this.b = i;
        this.o = iArr;
        this.c = uriArr;
        this.v = jArr;
        this.w = j2;
        this.x = z;
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.o;
            if (i3 >= iArr.length || this.x || (i2 = iArr[i3]) == 0 || i2 == 1) {
                return i3;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n9.class != obj.getClass()) {
            return false;
        }
        n9 n9Var = (n9) obj;
        return this.a == n9Var.a && this.b == n9Var.b && Arrays.equals(this.c, n9Var.c) && Arrays.equals(this.o, n9Var.o) && Arrays.equals(this.v, n9Var.v) && this.w == n9Var.w && this.x == n9Var.x;
    }

    public final int hashCode() {
        long j = this.a;
        int hashCode = Arrays.hashCode(this.o);
        int hashCode2 = Arrays.hashCode(this.v);
        long j2 = this.w;
        return ((((hashCode2 + ((hashCode + (((((this.b * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.c)) * 31)) * 31)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.x ? 1 : 0);
    }
}
