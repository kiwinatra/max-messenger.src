package defpackage;

/* renamed from: g9c  reason: default package */
public final class g9c extends ad9 {
    public float a;
    public float b;
    public int c;
    public boolean d;

    public final int computeSerializedSize() {
        int e = Float.floatToIntBits(this.a) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO) ? j43.e(1) : 0;
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
            e += j43.e(2);
        }
        int i = this.c;
        if (i != 0) {
            e += j43.f(3, i);
        }
        return this.d ? e + j43.a(4) : e;
    }

    public final ad9 mergeFrom(i43 i43) {
        while (true) {
            int s = i43.s();
            if (s == 0) {
                break;
            } else if (s == 13) {
                this.a = i43.i();
            } else if (s == 21) {
                this.b = i43.i();
            } else if (s == 24) {
                this.c = i43.p();
            } else if (s == 32) {
                this.d = i43.f();
            } else if (!i43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(j43 j43) {
        if (Float.floatToIntBits(this.a) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
            j43.v(this.a, 1);
        }
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
            j43.v(this.b, 2);
        }
        int i = this.c;
        if (i != 0) {
            j43.w(3, i);
        }
        boolean z = this.d;
        if (z) {
            j43.r(4, z);
        }
    }
}
