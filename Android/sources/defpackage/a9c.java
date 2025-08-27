package defpackage;

/* renamed from: a9c  reason: default package */
public final class a9c extends ad9 {
    public f9c a;
    public float b;
    public float[] c;

    public final int computeSerializedSize() {
        f9c f9c = this.a;
        int i = f9c != null ? j43.i(1, f9c) : 0;
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
            i += j43.e(2);
        }
        float[] fArr = this.c;
        return (fArr == null || fArr.length <= 0) ? i : (fArr.length * 4) + i + fArr.length;
    }

    public final ad9 mergeFrom(i43 i43) {
        while (true) {
            int s = i43.s();
            if (s == 0) {
                break;
            } else if (s == 10) {
                if (this.a == null) {
                    this.a = new f9c();
                }
                i43.j(this.a);
            } else if (s == 21) {
                this.b = i43.i();
            } else if (s == 26) {
                int p = i43.p();
                int e = i43.e(p);
                int i = p / 4;
                float[] fArr = this.c;
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
                this.c = fArr2;
                i43.d(e);
            } else if (s == 29) {
                int q = ct.q(i43, 29);
                float[] fArr3 = this.c;
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
                this.c = fArr4;
            } else if (!i43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(j43 j43) {
        f9c f9c = this.a;
        if (f9c != null) {
            j43.y(1, f9c);
        }
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
            j43.v(this.b, 2);
        }
        float[] fArr = this.c;
        if (fArr != null && fArr.length > 0) {
            int i = 0;
            while (true) {
                float[] fArr2 = this.c;
                if (i < fArr2.length) {
                    j43.v(fArr2[i], 3);
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
