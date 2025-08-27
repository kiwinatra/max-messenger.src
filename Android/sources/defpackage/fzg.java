package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: fzg  reason: default package */
public class fzg implements Iterable, Serializable {
    public static final fzg c = new fzg(y0h.b);
    public int a = 0;
    public final byte[] b;

    static {
        int i = czg.a;
    }

    public fzg(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int f(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException(a81.j(i, "Beginning index: ", " < 0"));
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException(g63.h("Beginning index larger than ending index: ", i, i2, ", "));
        } else {
            throw new IndexOutOfBoundsException(g63.h("End index: ", i2, i3, " >= "));
        }
    }

    public static fzg g(int i, byte[] bArr, int i2) {
        f(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new fzg(bArr2);
    }

    public byte b(int i) {
        return this.b[i];
    }

    public byte d(int i) {
        return this.b[i];
    }

    public int e() {
        return this.b.length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fzg) || e() != ((fzg) obj).e()) {
            return false;
        }
        if (e() == 0) {
            return true;
        }
        if (!(obj instanceof fzg)) {
            return obj.equals(this);
        }
        fzg fzg = (fzg) obj;
        int i = this.a;
        int i2 = fzg.a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int e = e();
        if (e > fzg.e()) {
            throw new IllegalArgumentException("Length too large: " + e + e());
        } else if (e <= fzg.e()) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < e) {
                if (this.b[i3] != fzg.b[i4]) {
                    return false;
                }
                i3++;
                i4++;
            }
            return true;
        } else {
            throw new IllegalArgumentException(g63.h("Ran off end of other: 0, ", e, fzg.e(), ", "));
        }
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int e = e();
        int i2 = e;
        for (int i3 = 0; i3 < e; i3++) {
            i2 = (i2 * 31) + this.b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    public final /* synthetic */ Iterator iterator() {
        return new dzg(this);
    }

    public final String toString() {
        String str;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int e = e();
        if (e() <= 50) {
            str = n79.Z(this);
        } else {
            int f = f(0, 47, e());
            str = n79.Z(f == 0 ? c : new ezg(f, this.b)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(e);
        sb.append(" contents=\"");
        return wj6.n(sb, str, "\">");
    }
}
