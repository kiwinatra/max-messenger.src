package defpackage;

/* renamed from: b9c  reason: default package */
public final class b9c extends ad9 {
    public static volatile b9c[] c;
    public int a = 0;
    public float[] b = ct.f;

    public b9c() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i = this.a;
        int f = i != 0 ? j43.f(1, i) : 0;
        float[] fArr = this.b;
        return (fArr == null || fArr.length <= 0) ? f : (fArr.length * 4) + f + fArr.length;
    }

    public final ad9 mergeFrom(i43 i43) {
        while (true) {
            int s = i43.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                int p = i43.p();
                if (p == 0 || p == 1) {
                    this.a = p;
                }
            } else if (s == 18) {
                int p2 = i43.p();
                int e = i43.e(p2);
                int i = p2 / 4;
                float[] fArr = this.b;
                int length = fArr == null ? 0 : fArr.length;
                int i2 = i + length;
                float[] fArr2 = new float[i2];
                if (length != 0) {
                    System.arraycopy(fArr, 0, fArr2, 0, length);
                }
                while (length < i2) {
                    fArr2[length] = i43.i();
                    length++;
                }
                this.b = fArr2;
                i43.d(e);
            } else if (s == 21) {
                int q = ct.q(i43, 21);
                float[] fArr3 = this.b;
                int length2 = fArr3 == null ? 0 : fArr3.length;
                int i3 = q + length2;
                float[] fArr4 = new float[i3];
                if (length2 != 0) {
                    System.arraycopy(fArr3, 0, fArr4, 0, length2);
                }
                while (length2 < i3 - 1) {
                    fArr4[length2] = i43.i();
                    i43.s();
                    length2++;
                }
                fArr4[length2] = i43.i();
                this.b = fArr4;
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
        float[] fArr = this.b;
        if (fArr != null && fArr.length > 0) {
            int i2 = 0;
            while (true) {
                float[] fArr2 = this.b;
                if (i2 < fArr2.length) {
                    j43.v(fArr2[i2], 2);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }
}
