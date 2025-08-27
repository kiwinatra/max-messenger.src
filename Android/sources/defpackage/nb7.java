package defpackage;

import java.util.Arrays;

/* renamed from: nb7  reason: default package */
public final class nb7 extends q1 implements c1g {
    public final byte a;
    public final byte[] b;

    public nb7(byte b2, byte[] bArr) {
        this.a = b2;
        this.b = bArr;
    }

    public final nb7 A() {
        return this;
    }

    public final String b() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(Byte.toString(this.a));
        sb.append(",\"");
        for (byte num : this.b) {
            sb.append(Integer.toString(num, 16));
        }
        sb.append("\"]");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c1g)) {
            return false;
        }
        c1g c1g = (c1g) obj;
        int g = ((q1) c1g).g();
        if (g == 0) {
            throw null;
        } else if (g != 9) {
            return false;
        } else {
            nb7 t = c1g.t();
            return this.a == t.a && Arrays.equals(this.b, t.b);
        }
    }

    public final int g() {
        return 9;
    }

    public final int hashCode() {
        int i = this.a + 31;
        for (byte b2 : this.b) {
            i = (i * 31) + b2;
        }
        return i;
    }

    public final nb7 t() {
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(Byte.toString(this.a));
        sb.append(",0x");
        for (byte num : this.b) {
            sb.append(Integer.toString(num, 16));
        }
        sb.append(")");
        return sb.toString();
    }
}
