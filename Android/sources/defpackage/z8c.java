package defpackage;

/* renamed from: z8c  reason: default package */
public final class z8c extends ad9 {
    public static volatile z8c[] c;
    public int a = 0;
    public int b = 0;

    public z8c() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i = this.a;
        int f = i != 0 ? j43.f(1, i) : 0;
        int i2 = this.b;
        return i2 != 0 ? f + j43.f(2, i2) : f;
    }

    public final ad9 mergeFrom(i43 i43) {
        while (true) {
            int s = i43.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                int p = i43.p();
                if (p == 0) {
                    this.a = p;
                }
            } else if (s == 16) {
                this.b = i43.p();
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
    }
}
