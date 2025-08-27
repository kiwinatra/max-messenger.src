package defpackage;

/* renamed from: d9c  reason: default package */
public final class d9c extends ad9 {
    public static volatile d9c[] f;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public float d = c44.DEFAULT_ASPECT_RATIO;
    public b9c[] e;

    public d9c() {
        if (b9c.c == null) {
            synchronized (bj7.b) {
                try {
                    if (b9c.c == null) {
                        b9c.c = new b9c[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.e = b9c.c;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i = this.a;
        int i2 = 0;
        int f2 = i != 0 ? j43.f(1, i) : 0;
        int i3 = this.b;
        if (i3 != 0) {
            f2 += j43.f(2, i3);
        }
        int i4 = this.c;
        if (i4 != 0) {
            f2 += j43.f(3, i4);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
            f2 += j43.e(4);
        }
        b9c[] b9cArr = this.e;
        if (b9cArr != null && b9cArr.length > 0) {
            while (true) {
                b9c[] b9cArr2 = this.e;
                if (i2 >= b9cArr2.length) {
                    break;
                }
                b9c b9c = b9cArr2[i2];
                if (b9c != null) {
                    f2 = j43.i(5, b9c) + f2;
                }
                i2++;
            }
        }
        return f2;
    }

    public final ad9 mergeFrom(i43 i43) {
        while (true) {
            int s = i43.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                this.a = i43.p();
            } else if (s == 16) {
                int p = i43.p();
                if (p == 0) {
                    this.b = p;
                }
            } else if (s == 24) {
                this.c = i43.p();
            } else if (s == 37) {
                this.d = i43.i();
            } else if (s == 42) {
                int q = ct.q(i43, 42);
                b9c[] b9cArr = this.e;
                int length = b9cArr == null ? 0 : b9cArr.length;
                int i = q + length;
                b9c[] b9cArr2 = new b9c[i];
                if (length != 0) {
                    System.arraycopy(b9cArr, 0, b9cArr2, 0, length);
                }
                while (length < i - 1) {
                    b9c b9c = new b9c();
                    b9cArr2[length] = b9c;
                    i43.j(b9c);
                    i43.s();
                    length++;
                }
                b9c b9c2 = new b9c();
                b9cArr2[length] = b9c2;
                i43.j(b9c2);
                this.e = b9cArr2;
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
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
            j43.v(this.d, 4);
        }
        b9c[] b9cArr = this.e;
        if (b9cArr != null && b9cArr.length > 0) {
            int i4 = 0;
            while (true) {
                b9c[] b9cArr2 = this.e;
                if (i4 < b9cArr2.length) {
                    b9c b9c = b9cArr2[i4];
                    if (b9c != null) {
                        j43.y(5, b9c);
                    }
                    i4++;
                } else {
                    return;
                }
            }
        }
    }
}
