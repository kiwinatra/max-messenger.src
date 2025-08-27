package defpackage;

/* renamed from: of7  reason: default package */
public final class of7 extends ad9 {
    public nf7[] a;

    public of7() {
        if (nf7.u == null) {
            synchronized (bj7.b) {
                try {
                    if (nf7.u == null) {
                        nf7.u = new nf7[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.a = nf7.u;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        nf7[] nf7Arr = this.a;
        int i = 0;
        if (nf7Arr == null || nf7Arr.length <= 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            nf7[] nf7Arr2 = this.a;
            if (i >= nf7Arr2.length) {
                return i2;
            }
            nf7 nf7 = nf7Arr2[i];
            if (nf7 != null) {
                i2 = j43.i(1, nf7) + i2;
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
                nf7[] nf7Arr = this.a;
                int length = nf7Arr == null ? 0 : nf7Arr.length;
                int i = q + length;
                nf7[] nf7Arr2 = new nf7[i];
                if (length != 0) {
                    System.arraycopy(nf7Arr, 0, nf7Arr2, 0, length);
                }
                while (length < i - 1) {
                    nf7 nf7 = new nf7();
                    nf7Arr2[length] = nf7;
                    i43.j(nf7);
                    i43.s();
                    length++;
                }
                nf7 nf72 = new nf7();
                nf7Arr2[length] = nf72;
                i43.j(nf72);
                this.a = nf7Arr2;
            } else if (!i43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(j43 j43) {
        nf7[] nf7Arr = this.a;
        if (nf7Arr != null && nf7Arr.length > 0) {
            int i = 0;
            while (true) {
                nf7[] nf7Arr2 = this.a;
                if (i < nf7Arr2.length) {
                    nf7 nf7 = nf7Arr2[i];
                    if (nf7 != null) {
                        j43.y(1, nf7);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
