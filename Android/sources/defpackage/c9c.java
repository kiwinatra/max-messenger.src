package defpackage;

/* renamed from: c9c  reason: default package */
public final class c9c extends ad9 {
    public d9c[] a;
    public z8c[] b;
    public f9c c;
    public boolean d;

    public final int computeSerializedSize() {
        int i;
        d9c[] d9cArr = this.a;
        int i2 = 0;
        if (d9cArr != null && d9cArr.length > 0) {
            int i3 = 0;
            i = 0;
            while (true) {
                d9c[] d9cArr2 = this.a;
                if (i3 >= d9cArr2.length) {
                    break;
                }
                d9c d9c = d9cArr2[i3];
                if (d9c != null) {
                    i += j43.i(1, d9c);
                }
                i3++;
            }
        } else {
            i = 0;
        }
        z8c[] z8cArr = this.b;
        if (z8cArr != null && z8cArr.length > 0) {
            while (true) {
                z8c[] z8cArr2 = this.b;
                if (i2 >= z8cArr2.length) {
                    break;
                }
                z8c z8c = z8cArr2[i2];
                if (z8c != null) {
                    i = j43.i(2, z8c) + i;
                }
                i2++;
            }
        }
        f9c f9c = this.c;
        if (f9c != null) {
            i += j43.i(3, f9c);
        }
        return this.d ? i + j43.a(4) : i;
    }

    public final ad9 mergeFrom(i43 i43) {
        while (true) {
            int s = i43.s();
            if (s == 0) {
                break;
            } else if (s == 10) {
                int q = ct.q(i43, 10);
                d9c[] d9cArr = this.a;
                int length = d9cArr == null ? 0 : d9cArr.length;
                int i = q + length;
                d9c[] d9cArr2 = new d9c[i];
                if (length != 0) {
                    System.arraycopy(d9cArr, 0, d9cArr2, 0, length);
                }
                while (length < i - 1) {
                    d9c d9c = new d9c();
                    d9cArr2[length] = d9c;
                    i43.j(d9c);
                    i43.s();
                    length++;
                }
                d9c d9c2 = new d9c();
                d9cArr2[length] = d9c2;
                i43.j(d9c2);
                this.a = d9cArr2;
            } else if (s == 18) {
                int q2 = ct.q(i43, 18);
                z8c[] z8cArr = this.b;
                int length2 = z8cArr == null ? 0 : z8cArr.length;
                int i2 = q2 + length2;
                z8c[] z8cArr2 = new z8c[i2];
                if (length2 != 0) {
                    System.arraycopy(z8cArr, 0, z8cArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    z8c z8c = new z8c();
                    z8cArr2[length2] = z8c;
                    i43.j(z8c);
                    i43.s();
                    length2++;
                }
                z8c z8c2 = new z8c();
                z8cArr2[length2] = z8c2;
                i43.j(z8c2);
                this.b = z8cArr2;
            } else if (s == 26) {
                if (this.c == null) {
                    this.c = new f9c();
                }
                i43.j(this.c);
            } else if (s == 32) {
                this.d = i43.f();
            } else if (!i43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(j43 j43) {
        d9c[] d9cArr = this.a;
        int i = 0;
        if (d9cArr != null && d9cArr.length > 0) {
            int i2 = 0;
            while (true) {
                d9c[] d9cArr2 = this.a;
                if (i2 >= d9cArr2.length) {
                    break;
                }
                d9c d9c = d9cArr2[i2];
                if (d9c != null) {
                    j43.y(1, d9c);
                }
                i2++;
            }
        }
        z8c[] z8cArr = this.b;
        if (z8cArr != null && z8cArr.length > 0) {
            while (true) {
                z8c[] z8cArr2 = this.b;
                if (i >= z8cArr2.length) {
                    break;
                }
                z8c z8c = z8cArr2[i];
                if (z8c != null) {
                    j43.y(2, z8c);
                }
                i++;
            }
        }
        f9c f9c = this.c;
        if (f9c != null) {
            j43.y(3, f9c);
        }
        boolean z = this.d;
        if (z) {
            j43.r(4, z);
        }
    }
}
