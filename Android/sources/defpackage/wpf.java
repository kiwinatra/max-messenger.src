package defpackage;

import java.util.Arrays;

/* renamed from: wpf  reason: default package */
public final class wpf {
    public final int a;
    public final byte[] b;
    public final int c;
    public final int d;

    public wpf(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = bArr;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wpf.class != obj.getClass()) {
            return false;
        }
        wpf wpf = (wpf) obj;
        return this.a == wpf.a && this.c == wpf.c && this.d == wpf.d && Arrays.equals(this.b, wpf.b);
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c) * 31) + this.d;
    }
}
