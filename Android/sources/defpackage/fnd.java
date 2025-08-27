package defpackage;

import kotlin.uuid.Uuid;

/* renamed from: fnd  reason: default package */
public final class fnd implements stf {
    public final dnd a;
    public final l8b b = new l8b(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public fnd(dnd dnd) {
        this.a = dnd;
    }

    public final void a() {
        this.f = true;
    }

    public final void b(int i, l8b l8b) {
        boolean z = (i & 1) != 0;
        int u = z ? l8b.b + l8b.u() : -1;
        if (this.f) {
            if (z) {
                this.f = false;
                l8b.G(u);
                this.d = 0;
            } else {
                return;
            }
        }
        while (l8b.a() > 0) {
            int i2 = this.d;
            l8b l8b2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int u2 = l8b.u();
                    l8b.G(l8b.b - 1);
                    if (u2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(l8b.a(), 3 - this.d);
                l8b.e(this.d, l8b2.a, min);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == 3) {
                    l8b2.G(0);
                    l8b2.F(3);
                    l8b2.H(1);
                    int u3 = l8b2.u();
                    int u4 = l8b2.u();
                    this.e = (u3 & Uuid.SIZE_BITS) != 0;
                    int i4 = (((u3 & 15) << 8) | u4) + 3;
                    this.c = i4;
                    byte[] bArr = l8b2.a;
                    if (bArr.length < i4) {
                        l8b2.b(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(l8b.a(), this.c - this.d);
                l8b.e(this.d, l8b2.a, min2);
                int i5 = this.d + min2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (!this.e) {
                        l8b2.F(i6);
                    } else if (v0g.n(0, i6, -1, l8b2.a) != 0) {
                        this.f = true;
                        return;
                    } else {
                        l8b2.F(this.c - 4);
                    }
                    l8b2.G(0);
                    this.a.f(l8b2);
                    this.d = 0;
                }
            }
        }
    }

    public final void d(rkf rkf, xf5 xf5, qtf qtf) {
        this.a.d(rkf, xf5, qtf);
        this.f = true;
    }
}
