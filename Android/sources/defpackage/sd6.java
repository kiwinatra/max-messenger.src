package defpackage;

import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.uuid.Uuid;

/* renamed from: sd6  reason: default package */
public final class sd6 {
    public final ypf a;
    public final qpf b = new qpf(0);
    public final g1g c = new g1g(3, false);
    public aqf d;
    public zh4 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final g1g j = new g1g(1);
    public final g1g k = new g1g(3, false);
    public boolean l;

    public sd6(ypf ypf, aqf aqf, zh4 zh4) {
        this.a = ypf;
        this.d = aqf;
        this.e = zh4;
        this.d = aqf;
        this.e = zh4;
        ypf.d(aqf.a.f);
        d();
    }

    public final opf a() {
        if (!this.l) {
            return null;
        }
        qpf qpf = this.b;
        int i2 = t0g.a;
        int i3 = ((zh4) qpf.o).a;
        opf opf = (opf) qpf.p;
        if (opf == null) {
            opf[] opfArr = this.d.a.k;
            opf = opfArr == null ? null : opfArr[i3];
        }
        if (opf == null || !opf.a) {
            return null;
        }
        return opf;
    }

    public final boolean b() {
        this.f++;
        if (!this.l) {
            return false;
        }
        int i2 = this.g + 1;
        this.g = i2;
        int[] iArr = this.b.f;
        int i3 = this.h;
        if (i2 != iArr[i3]) {
            return true;
        }
        this.h = i3 + 1;
        this.g = 0;
        return false;
    }

    public final int c(int i2, int i3) {
        g1g g1g;
        opf a2 = a();
        if (a2 == null) {
            return 0;
        }
        qpf qpf = this.b;
        int i4 = a2.d;
        if (i4 != 0) {
            g1g = (g1g) qpf.q;
        } else {
            int i5 = t0g.a;
            byte[] bArr = a2.e;
            int length = bArr.length;
            g1g g1g2 = this.k;
            g1g2.F(length, bArr);
            i4 = bArr.length;
            g1g = g1g2;
        }
        boolean z = qpf.j && qpf.k[this.f];
        boolean z2 = z || i3 != 0;
        g1g g1g3 = this.j;
        g1g3.a[0] = (byte) ((z2 ? Uuid.SIZE_BITS : 0) | i4);
        g1g3.H(0);
        ypf ypf = this.a;
        ypf.c(1, g1g3);
        ypf.c(i4, g1g);
        if (!z2) {
            return i4 + 1;
        }
        g1g g1g4 = this.c;
        if (!z) {
            g1g4.E(8);
            byte[] bArr2 = g1g4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i3 & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[4] = (byte) ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[5] = (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[6] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[7] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
            ypf.c(8, g1g4);
            return i4 + 9;
        }
        g1g g1g5 = (g1g) qpf.q;
        int A = g1g5.A();
        g1g5.I(-2);
        int i6 = (A * 6) + 2;
        if (i3 != 0) {
            g1g4.E(i6);
            byte[] bArr3 = g1g4.a;
            g1g5.g(0, bArr3, i6);
            int i7 = (((bArr3[2] & UByte.MAX_VALUE) << 8) | (bArr3[3] & UByte.MAX_VALUE)) + i3;
            bArr3[2] = (byte) ((i7 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr3[3] = (byte) (i7 & KotlinVersion.MAX_COMPONENT_VALUE);
        } else {
            g1g4 = g1g5;
        }
        ypf.c(i6, g1g4);
        return i4 + 1 + i6;
    }

    public final void d() {
        qpf qpf = this.b;
        qpf.c = 0;
        qpf.m = 0;
        qpf.n = false;
        qpf.j = false;
        qpf.l = false;
        qpf.p = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.l = false;
    }
}
