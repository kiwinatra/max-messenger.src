package defpackage;

import java.util.Arrays;

/* renamed from: lf7  reason: default package */
public final class lf7 extends ad9 {
    public byte[] a = ct.h;

    public lf7() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        if (!Arrays.equals(this.a, ct.h)) {
            return j43.b(1, this.a);
        }
        return 0;
    }

    public final ad9 mergeFrom(i43 i43) {
        while (true) {
            int s = i43.s();
            if (s == 0) {
                break;
            } else if (s == 10) {
                this.a = i43.g();
            } else if (!i43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(j43 j43) {
        if (!Arrays.equals(this.a, ct.h)) {
            j43.s(1, this.a);
        }
    }
}
