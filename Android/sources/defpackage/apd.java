package defpackage;

import java.security.MessageDigest;
import kotlin.collections.ArraysKt;

/* renamed from: apd  reason: default package */
public final class apd extends vw0 {
    public final transient byte[][] v;
    public final transient int[] w;

    public apd(byte[][] bArr, int[] iArr) {
        super(vw0.o.c);
        this.v = bArr;
        this.w = iArr;
    }

    public final String a() {
        throw null;
    }

    public final vw0 b(String str) {
        MessageDigest instance = MessageDigest.getInstance(str);
        byte[][] bArr = this.v;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.w;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            instance.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        return new vw0(instance.digest());
    }

    public final int c() {
        return this.w[this.v.length - 1];
    }

    public final String d() {
        byte[] l = l();
        char[] cArr = new char[(l.length * 2)];
        int i = 0;
        for (byte b : l) {
            int i2 = i + 1;
            char[] cArr2 = tf6.b;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public final byte[] e() {
        return l();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vw0) {
            vw0 vw0 = (vw0) obj;
            if (vw0.c() == c() && h(c(), vw0)) {
                return true;
            }
        }
        return false;
    }

    public final byte f(int i) {
        byte[][] bArr = this.v;
        int[] iArr = this.w;
        n79.l((long) iArr[bArr.length - 1], (long) i, 1);
        int V = y7e.V(this, i);
        return bArr[V][(i - (V == 0 ? 0 : iArr[V - 1])) + iArr[bArr.length + V]];
    }

    public final boolean g(int i, int i2, int i3, byte[] bArr) {
        if (i < 0 || i > c() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = i3 + i;
        int V = y7e.V(this, i);
        while (i < i4) {
            int[] iArr = this.w;
            int i5 = V == 0 ? 0 : iArr[V - 1];
            byte[][] bArr2 = this.v;
            int i6 = iArr[bArr2.length + V];
            int min = Math.min(i4, (iArr[V] - i5) + i5) - i;
            int i7 = (i - i5) + i6;
            byte[] bArr3 = bArr2[V];
            for (int i8 = 0; i8 < min; i8++) {
                if (bArr3[i8 + i7] != bArr[i8 + i2]) {
                    return false;
                }
            }
            i2 += min;
            i += min;
            V++;
        }
        return true;
    }

    public final boolean h(int i, vw0 vw0) {
        if (c() - i < 0) {
            return false;
        }
        int V = y7e.V(this, 0);
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int[] iArr = this.w;
            int i4 = V == 0 ? 0 : iArr[V - 1];
            byte[][] bArr = this.v;
            int i5 = iArr[bArr.length + V];
            int min = Math.min(i, (iArr[V] - i4) + i4) - i2;
            if (!vw0.g(i3, (i2 - i4) + i5, min, bArr[V])) {
                return false;
            }
            i3 += min;
            i2 += min;
            V++;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.v;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.w;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.a = i3;
        return i3;
    }

    public final vw0 i() {
        return new vw0(l()).i();
    }

    public final void k(rt0 rt0, int i) {
        int V = y7e.V(this, 0);
        int i2 = 0;
        while (i2 < i) {
            int[] iArr = this.w;
            int i3 = V == 0 ? 0 : iArr[V - 1];
            byte[][] bArr = this.v;
            int i4 = iArr[bArr.length + V];
            int min = Math.min(i, (iArr[V] - i3) + i3) - i2;
            int i5 = (i2 - i3) + i4;
            hod hod = new hod(bArr[V], i5, i5 + min, true, false);
            hod hod2 = rt0.a;
            if (hod2 == null) {
                hod.g = hod;
                hod.f = hod;
                rt0.a = hod;
            } else {
                hod2.g.b(hod);
            }
            i2 += min;
            V++;
        }
        rt0.b += (long) c();
    }

    public final byte[] l() {
        byte[] bArr = new byte[c()];
        byte[][] bArr2 = this.v;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.w;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            ArraysKt.copyInto(bArr2[i], bArr, i3, i4, i4 + i6);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    public final String toString() {
        return new vw0(l()).toString();
    }
}
