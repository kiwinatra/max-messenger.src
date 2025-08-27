package defpackage;

/* renamed from: f9c  reason: default package */
public final class f9c extends ad9 {
    public float a = c44.DEFAULT_ASPECT_RATIO;
    public float b = c44.DEFAULT_ASPECT_RATIO;
    public float c = c44.DEFAULT_ASPECT_RATIO;
    public float d = c44.DEFAULT_ASPECT_RATIO;

    public f9c() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int e = Float.floatToIntBits(this.a) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO) ? j43.e(1) : 0;
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
            e += j43.e(2);
        }
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
            e += j43.e(3);
        }
        return Float.floatToIntBits(this.d) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO) ? e + j43.e(4) : e;
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
            } else if (s == 29) {
                this.c = i43.i();
            } else if (s == 37) {
                this.d = i43.i();
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
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
            j43.v(this.c, 3);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
            j43.v(this.d, 4);
        }
    }
}
