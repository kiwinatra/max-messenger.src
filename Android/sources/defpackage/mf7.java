package defpackage;

import java.util.Arrays;

/* renamed from: mf7  reason: default package */
public final class mf7 extends ad9 {
    public int a = 0;
    public byte[] b = ct.h;

    public mf7() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i = this.a;
        int n = i != 0 ? j43.n(1, i) : 0;
        return !Arrays.equals(this.b, ct.h) ? n + j43.b(2, this.b) : n;
    }

    public final ad9 mergeFrom(i43 i43) {
        while (true) {
            int s = i43.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                this.a = i43.p();
            } else if (s == 18) {
                this.b = i43.g();
            } else if (!i43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(j43 j43) {
        int i = this.a;
        if (i != 0) {
            j43.G(1, i);
        }
        if (!Arrays.equals(this.b, ct.h)) {
            j43.s(2, this.b);
        }
    }
}
