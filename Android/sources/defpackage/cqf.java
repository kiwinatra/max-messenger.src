package defpackage;

import java.util.Arrays;

/* renamed from: cqf  reason: default package */
public final class cqf {
    public final ld5[] a;
    public int b;

    public cqf(ld5... ld5Arr) {
        this.a = ld5Arr;
        int length = ld5Arr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || cqf.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.a, ((cqf) obj).a);
    }

    public final int hashCode() {
        if (this.b == 0) {
            this.b = 527 + Arrays.hashCode(this.a);
        }
        return this.b;
    }
}
