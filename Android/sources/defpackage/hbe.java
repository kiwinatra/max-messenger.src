package defpackage;

import java.util.Arrays;

/* renamed from: hbe  reason: default package */
public final class hbe {
    public static final hbe d;
    public final Comparable[] a;
    public final Object[] b;
    public final int c;

    static {
        Comparable[] comparableArr = new Comparable[0];
        d = new hbe(comparableArr, comparableArr);
    }

    public hbe(Comparable[] comparableArr, Object[] objArr) {
        if (comparableArr.length == objArr.length) {
            this.a = comparableArr;
            this.b = objArr;
            this.c = comparableArr.length;
            return;
        }
        StringBuilder sb = new StringBuilder("different array sizes: ");
        sb.append(comparableArr.length);
        sb.append(" keys and ");
        throw new IllegalArgumentException(wj6.l(sb, objArr.length, " values"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbe)) {
            return false;
        }
        hbe hbe = (hbe) obj;
        return hbe.c == this.c && Arrays.equals(hbe.a, this.a) && Arrays.equals(hbe.b, this.b);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.b) * 31) + Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.c; i++) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append("{");
            sb.append(this.a[i]);
            sb.append(" : ");
            sb.append(this.b[i]);
            sb.append('}');
        }
        sb.append(']');
        return sb.toString();
    }
}
