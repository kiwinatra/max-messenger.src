package defpackage;

/* renamed from: i9c  reason: default package */
public final class i9c extends ad9 {
    public static volatile i9c[] e;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public n86 d = null;

    public i9c() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i = this.a;
        int f = i != 0 ? j43.f(1, i) : 0;
        int i2 = this.b;
        if (i2 != 0) {
            f += j43.f(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            f += j43.f(3, i3);
        }
        n86 n86 = this.d;
        return n86 != null ? f + j43.i(4, n86) : f;
    }

    public final ad9 mergeFrom(i43 i43) {
        while (true) {
            int s = i43.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                this.a = i43.p();
            } else if (s == 16) {
                this.b = i43.p();
            } else if (s == 24) {
                this.c = i43.p();
            } else if (s == 34) {
                if (this.d == null) {
                    this.d = new n86(3);
                }
                i43.j(this.d);
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
            j43.w(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            j43.w(3, i3);
        }
        n86 n86 = this.d;
        if (n86 != null) {
            j43.y(4, n86);
        }
    }
}
