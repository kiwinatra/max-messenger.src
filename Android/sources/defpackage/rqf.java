package defpackage;

import java.util.Arrays;

/* renamed from: rqf  reason: default package */
public final class rqf implements jv0 {
    public final rpf a;
    public final int[] b;
    public final int c;
    public final boolean[] o;

    public rqf(rpf rpf, int[] iArr, int i, boolean[] zArr) {
        int length = iArr.length;
        int i2 = rpf.a;
        y64.g(i2 == length && i2 == zArr.length);
        this.a = rpf;
        this.b = (int[]) iArr.clone();
        this.c = i;
        this.o = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rqf.class != obj.getClass()) {
            return false;
        }
        rqf rqf = (rqf) obj;
        return this.c == rqf.c && this.a.equals(rqf.a) && Arrays.equals(this.b, rqf.b) && Arrays.equals(this.o, rqf.o);
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.b);
        return Arrays.hashCode(this.o) + ((((hashCode + (this.a.hashCode() * 31)) * 31) + this.c) * 31);
    }
}
