package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* renamed from: jla  reason: default package */
public final class jla {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public boolean d;
    public final Object e;
    public final Object f;

    public jla(bug bug, osg osg) {
        this.a = 2;
        this.f = bug;
        this.b = osg.c;
        this.d |= (osg.a & 4) != 0;
        if ((osg.a & 4) != 0) {
            this.e = new ByteArrayOutputStream(600000);
        } else {
            this.e = new ByteArrayOutputStream(34000);
        }
        while (true) {
            ByteBuffer byteBuffer = osg.e;
            int min = Math.min(byteBuffer.remaining(), ((bug) this.f).c.length);
            if (min == 0) {
                this.c = 1;
                return;
            } else {
                byteBuffer.get(((bug) this.f).c, 0, min);
                ((ByteArrayOutputStream) this.e).write(((bug) this.f).c, 0, min);
            }
        }
    }

    public int a(int i) {
        int i2;
        int i3;
        switch (this.a) {
            case 0:
                int i4 = 0;
                this.c = 0;
                do {
                    int i5 = this.c;
                    int i6 = i + i5;
                    kla kla = (kla) this.e;
                    if (i6 < kla.c) {
                        int[] iArr = kla.f;
                        this.c = i5 + 1;
                        i2 = iArr[i5 + i];
                        i4 += i2;
                    }
                    return i4;
                } while (i2 == 255);
                return i4;
            default:
                int i7 = 0;
                this.c = 0;
                do {
                    int i8 = this.c;
                    int i9 = i + i8;
                    kla kla2 = (kla) this.e;
                    if (i9 < kla2.c) {
                        int[] iArr2 = kla2.f;
                        this.c = i8 + 1;
                        i3 = iArr2[i8 + i];
                        i7 += i3;
                    }
                    return i7;
                } while (i3 == 255);
                return i7;
        }
    }

    public boolean b(gf4 gf4) {
        int i;
        y64.j(gf4 != null);
        boolean z = this.d;
        g1g g1g = (g1g) this.f;
        if (z) {
            this.d = false;
            g1g.E(0);
        }
        while (!this.d) {
            int i2 = this.b;
            kla kla = (kla) this.e;
            if (i2 < 0) {
                if (kla.c(gf4, -1) && kla.a(gf4, true)) {
                    int i3 = kla.d;
                    if ((kla.a & 1) == 1 && g1g.c == 0) {
                        i3 += a(0);
                        i = this.c;
                    } else {
                        i = 0;
                    }
                    try {
                        gf4.z(i3);
                        this.b = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.b);
            int i4 = this.b + this.c;
            if (a2 > 0) {
                g1g.d(g1g.c + a2);
                try {
                    gf4.j(g1g.a, g1g.c, a2, false);
                    g1g.G(g1g.c + a2);
                    this.d = kla.f[i4 + -1] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i4 == kla.c) {
                i4 = -1;
            }
            this.b = i4;
        }
        return true;
    }

    public boolean c(hf4 hf4) {
        int i;
        n79.n(hf4 != null);
        boolean z = this.d;
        l8b l8b = (l8b) this.f;
        if (z) {
            this.d = false;
            l8b.D(0);
        }
        while (!this.d) {
            int i2 = this.b;
            kla kla = (kla) this.e;
            if (i2 < 0) {
                if (kla.d(hf4, -1) && kla.b(hf4, true)) {
                    int i3 = kla.d;
                    if ((kla.a & 1) == 1 && l8b.c == 0) {
                        i3 += a(0);
                        i = this.c;
                    } else {
                        i = 0;
                    }
                    try {
                        hf4.z(i3);
                        this.b = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.b);
            int i4 = this.b + this.c;
            if (a2 > 0) {
                l8b.b(l8b.c + a2);
                try {
                    hf4.j(l8b.a, l8b.c, a2, false);
                    l8b.F(l8b.c + a2);
                    this.d = kla.f[i4 + -1] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i4 == kla.c) {
                i4 = -1;
            }
            this.b = i4;
        }
        return true;
    }

    public jla(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.e = new kla(1);
                this.f = new l8b(0, new byte[65025]);
                this.b = -1;
                return;
            default:
                this.e = new kla(0);
                this.f = new g1g(0, new byte[65025]);
                this.b = -1;
                return;
        }
    }
}
