package defpackage;

/* renamed from: f5g  reason: default package */
public final class f5g {
    public static final f5g i = new f5g(-1, 1, -1, -1, 1.0f, -1, -1, false);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final int f;
    public final int g;
    public final boolean h;

    public f5g(int i2, int i3, int i4, int i5, float f2, int i6, int i7, boolean z) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = f2;
        this.f = i6;
        this.g = i7;
        this.h = z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [e5g, java.lang.Object] */
    public final e5g a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        obj.h = this.h;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f5g)) {
            return false;
        }
        f5g f5g = (f5g) obj;
        return this.a == f5g.a && this.b == f5g.b && this.c == f5g.c && this.d == f5g.d && this.e == f5g.e && this.f == f5g.f && this.g == f5g.g && this.h == f5g.h;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.e) + ((((((((217 + this.a) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31) + this.f) * 31) + this.g) * 31) + (this.h ? 1 : 0);
    }
}
