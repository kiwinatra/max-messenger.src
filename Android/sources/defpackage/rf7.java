package defpackage;

import java.util.Arrays;

/* renamed from: rf7  reason: default package */
public final class rf7 extends ad9 {
    public static volatile rf7[] e;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public byte[] d = ct.h;

    public rf7() {
        this.cachedSize = -1;
    }

    public static rf7[] a() {
        if (e == null) {
            synchronized (bj7.b) {
                try {
                    if (e == null) {
                        e = new rf7[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public final int computeSerializedSize() {
        int i = this.a;
        int f = i != 0 ? j43.f(1, i) : 0;
        int i2 = this.b;
        if (i2 != 0) {
            f += j43.n(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            f += j43.n(3, i3);
        }
        return !Arrays.equals(this.d, ct.h) ? f + j43.b(4, this.d) : f;
    }

    public final ad9 mergeFrom(i43 i43) {
        while (true) {
            int s = i43.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                int p = i43.p();
                if (p == 0 || p == 1 || p == 2 || p == 3 || p == 4) {
                    this.a = p;
                }
            } else if (s == 16) {
                this.b = i43.p();
            } else if (s == 24) {
                this.c = i43.p();
            } else if (s == 34) {
                this.d = i43.g();
            } else if (!i43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(j43 j43) {
        int i = this.a;
        if (i != 0) {
            j43.w(1, i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            j43.G(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            j43.G(3, i3);
        }
        if (!Arrays.equals(this.d, ct.h)) {
            j43.s(4, this.d);
        }
    }
}
