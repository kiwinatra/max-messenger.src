package defpackage;

/* renamed from: pf7  reason: default package */
public final class pf7 extends ad9 {
    public static volatile pf7[] f;
    public String a = "";
    public String b = "";
    public int c = 0;
    public n86 d = null;
    public rf7[] e = rf7.a();

    public pf7() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i = 0;
        int l = !this.a.equals("") ? j43.l(1, this.a) : 0;
        if (!this.b.equals("")) {
            l += j43.l(2, this.b);
        }
        int i2 = this.c;
        if (i2 != 0) {
            l += j43.n(3, i2);
        }
        n86 n86 = this.d;
        if (n86 != null) {
            l += j43.i(4, n86);
        }
        rf7[] rf7Arr = this.e;
        if (rf7Arr != null && rf7Arr.length > 0) {
            while (true) {
                rf7[] rf7Arr2 = this.e;
                if (i >= rf7Arr2.length) {
                    break;
                }
                rf7 rf7 = rf7Arr2[i];
                if (rf7 != null) {
                    l = j43.i(17, rf7) + l;
                }
                i++;
            }
        }
        return l;
    }

    public final ad9 mergeFrom(i43 i43) {
        while (true) {
            int s = i43.s();
            if (s == 0) {
                break;
            } else if (s == 10) {
                this.a = i43.r();
            } else if (s == 18) {
                this.b = i43.r();
            } else if (s == 24) {
                this.c = i43.p();
            } else if (s == 34) {
                if (this.d == null) {
                    this.d = new n86(1);
                }
                i43.j(this.d);
            } else if (s == 138) {
                int q = ct.q(i43, 138);
                rf7[] rf7Arr = this.e;
                int length = rf7Arr == null ? 0 : rf7Arr.length;
                int i = q + length;
                rf7[] rf7Arr2 = new rf7[i];
                if (length != 0) {
                    System.arraycopy(rf7Arr, 0, rf7Arr2, 0, length);
                }
                while (length < i - 1) {
                    rf7 rf7 = new rf7();
                    rf7Arr2[length] = rf7;
                    i43.j(rf7);
                    i43.s();
                    length++;
                }
                rf7 rf72 = new rf7();
                rf7Arr2[length] = rf72;
                i43.j(rf72);
                this.e = rf7Arr2;
            } else if (!i43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(j43 j43) {
        if (!this.a.equals("")) {
            j43.E(1, this.a);
        }
        if (!this.b.equals("")) {
            j43.E(2, this.b);
        }
        int i = this.c;
        if (i != 0) {
            j43.G(3, i);
        }
        n86 n86 = this.d;
        if (n86 != null) {
            j43.y(4, n86);
        }
        rf7[] rf7Arr = this.e;
        if (rf7Arr != null && rf7Arr.length > 0) {
            int i2 = 0;
            while (true) {
                rf7[] rf7Arr2 = this.e;
                if (i2 < rf7Arr2.length) {
                    rf7 rf7 = rf7Arr2[i2];
                    if (rf7 != null) {
                        j43.y(17, rf7);
                    }
                    i2++;
                } else {
                    return;
                }
            }
        }
    }
}
