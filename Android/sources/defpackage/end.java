package defpackage;

import kotlin.UByte;
import kotlin.uuid.Uuid;

/* renamed from: end  reason: default package */
public final class end implements rtf {
    public final cnd a;
    public final g1g b = new g1g(32);
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public end(cnd cnd) {
        this.a = cnd;
    }

    public final void a() {
        this.f = true;
    }

    public final void b(int i, g1g g1g) {
        boolean z = (i & 1) != 0;
        int v = z ? g1g.b + g1g.v() : -1;
        if (this.f) {
            if (z) {
                this.f = false;
                g1g.H(v);
                this.d = 0;
            } else {
                return;
            }
        }
        while (g1g.c() > 0) {
            int i2 = this.d;
            g1g g1g2 = this.b;
            if (i2 < 3) {
                if (i2 == 0) {
                    int v2 = g1g.v();
                    g1g.H(g1g.b - 1);
                    if (v2 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(g1g.c(), 3 - this.d);
                g1g.g(this.d, g1g2.a, min);
                int i3 = this.d + min;
                this.d = i3;
                if (i3 == 3) {
                    g1g2.H(0);
                    g1g2.G(3);
                    g1g2.I(1);
                    int v3 = g1g2.v();
                    int v4 = g1g2.v();
                    this.e = (v3 & Uuid.SIZE_BITS) != 0;
                    int i4 = (((v3 & 15) << 8) | v4) + 3;
                    this.c = i4;
                    byte[] bArr = g1g2.a;
                    if (bArr.length < i4) {
                        g1g2.d(Math.min(4098, Math.max(i4, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(g1g.c(), this.c - this.d);
                g1g.g(this.d, g1g2.a, min2);
                int i5 = this.d + min2;
                this.d = i5;
                int i6 = this.c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.e) {
                        byte[] bArr2 = g1g2.a;
                        int i7 = t0g.a;
                        int i8 = -1;
                        for (int i9 = 0; i9 < i6; i9++) {
                            i8 = t0g.m[((i8 >>> 24) ^ (bArr2[i9] & UByte.MAX_VALUE)) & UByte.MAX_VALUE] ^ (i8 << 8);
                        }
                        if (i8 != 0) {
                            this.f = true;
                            return;
                        }
                        g1g2.G(this.c - 4);
                    } else {
                        g1g2.G(i6);
                    }
                    g1g2.H(0);
                    this.a.h(g1g2);
                    this.d = 0;
                }
            }
        }
    }

    public final void e(qkf qkf, wf5 wf5, qtf qtf) {
        this.a.e(qkf, wf5, qtf);
        this.f = true;
    }
}
