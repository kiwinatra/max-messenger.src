package defpackage;

import java.util.Arrays;

/* renamed from: t30  reason: default package */
public final class t30 {
    public static final t30 c = new t30(8, new int[]{2});
    public static final t30 d = new t30(8, new int[]{2, 5, 6});
    public static final int[] e = {5, 6, 18, 17, 14, 7, 8};
    public final int[] a;
    public final int b;

    public t30(int i, int[] iArr) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.a = new int[0];
        }
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t30)) {
            return false;
        }
        t30 t30 = (t30) obj;
        return Arrays.equals(this.a, t30.a) && this.b == t30.b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.a) * 31) + this.b;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.a);
        StringBuilder sb = new StringBuilder(g63.f(67, arrays));
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(this.b);
        sb.append(", supportedEncodings=");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
