package defpackage;

/* renamed from: qf7  reason: default package */
public final class qf7 extends ad9 {
    public pf7[] a;

    public qf7() {
        if (pf7.f == null) {
            synchronized (bj7.b) {
                try {
                    if (pf7.f == null) {
                        pf7.f = new pf7[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.a = pf7.f;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        pf7[] pf7Arr = this.a;
        int i = 0;
        if (pf7Arr == null || pf7Arr.length <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            pf7[] pf7Arr2 = this.a;
            if (i >= pf7Arr2.length) {
                return i2;
            }
            pf7 pf7 = pf7Arr2[i];
            if (pf7 != null) {
                i2 = j43.i(1, pf7) + i2;
            }
            i++;
        }
    }

    public final ad9 mergeFrom(i43 i43) {
        while (true) {
            int s = i43.s();
            if (s == 0) {
                break;
            } else if (s == 10) {
                int q = ct.q(i43, 10);
                pf7[] pf7Arr = this.a;
                int length = pf7Arr == null ? 0 : pf7Arr.length;
                int i = q + length;
                pf7[] pf7Arr2 = new pf7[i];
                if (length != 0) {
                    System.arraycopy(pf7Arr, 0, pf7Arr2, 0, length);
                }
                while (length < i - 1) {
                    pf7 pf7 = new pf7();
                    pf7Arr2[length] = pf7;
                    i43.j(pf7);
                    i43.s();
                    length++;
                }
                pf7 pf72 = new pf7();
                pf7Arr2[length] = pf72;
                i43.j(pf72);
                this.a = pf7Arr2;
            } else if (!i43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(j43 j43) {
        pf7[] pf7Arr = this.a;
        if (pf7Arr != null && pf7Arr.length > 0) {
            int i = 0;
            while (true) {
                pf7[] pf7Arr2 = this.a;
                if (i < pf7Arr2.length) {
                    pf7 pf7 = pf7Arr2[i];
                    if (pf7 != null) {
                        j43.y(1, pf7);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
