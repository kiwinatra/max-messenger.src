package defpackage;

import java.util.Arrays;

/* renamed from: xpf  reason: default package */
public final class xpf {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public xpf(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xpf.class != obj.getClass()) {
            return false;
        }
        xpf xpf = (xpf) obj;
        return this.a == xpf.a && this.c == xpf.c && this.d == xpf.d && Arrays.equals(this.b, xpf.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
