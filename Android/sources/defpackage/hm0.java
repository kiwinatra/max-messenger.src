package defpackage;

/* renamed from: hm0  reason: default package */
public final class hm0 implements vz7 {
    public final vz7 a;
    public int b = 0;
    public int c = -1;
    public int o = -1;
    public Object v = null;

    public hm0(y35 y35) {
        this.a = y35;
    }

    public final void a() {
        int i = this.b;
        if (i != 0) {
            vz7 vz7 = this.a;
            if (i == 1) {
                vz7.f(this.c, this.o);
            } else if (i == 2) {
                vz7.h(this.c, this.o);
            } else if (i == 3) {
                vz7.m(this.c, this.o, this.v);
            }
            this.v = null;
            this.b = 0;
        }
    }

    public final void c(int i, int i2) {
        a();
        this.a.c(i, i2);
    }

    public final void f(int i, int i2) {
        int i3;
        if (this.b == 1 && i >= (i3 = this.c)) {
            int i4 = this.o;
            if (i <= i3 + i4) {
                this.o = i4 + i2;
                this.c = Math.min(i, i3);
                return;
            }
        }
        a();
        this.c = i;
        this.o = i2;
        this.b = 1;
    }

    public final void h(int i, int i2) {
        int i3;
        if (this.b != 2 || (i3 = this.c) < i || i3 > i + i2) {
            a();
            this.c = i;
            this.o = i2;
            this.b = 2;
            return;
        }
        this.o += i2;
        this.c = i;
    }

    public final void m(int i, int i2, Object obj) {
        int i3;
        if (this.b == 3) {
            int i4 = this.c;
            int i5 = this.o;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.v == obj) {
                this.c = Math.min(i, i4);
                this.o = Math.max(i5 + i4, i3) - this.c;
                return;
            }
        }
        a();
        this.c = i;
        this.o = i2;
        this.v = obj;
        this.b = 3;
    }
}
