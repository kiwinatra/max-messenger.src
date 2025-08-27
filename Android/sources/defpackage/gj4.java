package defpackage;

import java.util.Arrays;

/* renamed from: gj4  reason: default package */
public final class gj4 implements jv0 {
    public final int a;
    public final int[] b;
    public final int c;

    public gj4(int[] iArr, int i, int i2) {
        this.a = i;
        int[] copyOf = Arrays.copyOf(iArr, iArr.length);
        this.b = copyOf;
        this.c = i2;
        Arrays.sort(copyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gj4.class != obj.getClass()) {
            return false;
        }
        gj4 gj4 = (gj4) obj;
        return this.a == gj4.a && Arrays.equals(this.b, gj4.b) && this.c == gj4.c;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c;
    }
}
