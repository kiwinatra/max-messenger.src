package defpackage;

import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.uuid.Uuid;

/* renamed from: td6  reason: default package */
public final class td6 {
    public final zpf a;
    public final qpf b = new qpf(1);
    public final l8b c = new l8b();
    public bqf d;
    public ai4 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final l8b j = new l8b(1);
    public final l8b k = new l8b();
    public boolean l;

    public td6(zpf zpf, bqf bqf, ai4 ai4) {
        this.a = zpf;
        this.d = bqf;
        this.e = ai4;
        this.d = bqf;
        this.e = ai4;
        zpf.e(bqf.a.f);
        d();
    }

    public final ppf a() {
        if (!this.l) {
            return null;
        }
        qpf qpf = this.b;
        int i2 = v0g.a;
        int i3 = ((ai4) qpf.o).a;
        ppf ppf = (ppf) qpf.p;
        if (ppf == null) {
            ppf[] ppfArr = this.d.a.k;
            ppf = ppfArr == null ? null : ppfArr[i3];
        }
        if (ppf == null || !ppf.a) {
            return null;
        }
        return ppf;
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
        l8b l8b;
        ppf a2 = a();
        if (a2 == null) {
            return 0;
        }
        qpf qpf = this.b;
        int i4 = a2.d;
        if (i4 != 0) {
            l8b = (l8b) qpf.q;
        } else {
            int i5 = v0g.a;
            byte[] bArr = a2.e;
            int length = bArr.length;
            l8b l8b2 = this.k;
            l8b2.E(length, bArr);
            i4 = bArr.length;
            l8b = l8b2;
        }
        boolean z = qpf.j && qpf.k[this.f];
        boolean z2 = z || i3 != 0;
        l8b l8b3 = this.j;
        l8b3.a[0] = (byte) ((z2 ? Uuid.SIZE_BITS : 0) | i4);
        l8b3.G(0);
        zpf zpf = this.a;
        zpf.b(l8b3, 1, 1);
        zpf.b(l8b, i4, 1);
        if (!z2) {
            return i4 + 1;
        }
        l8b l8b4 = this.c;
        if (!z) {
            l8b4.D(8);
            byte[] bArr2 = l8b4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = (byte) 0;
            bArr2[3] = (byte) (i3 & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[4] = (byte) ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[5] = (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[6] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr2[7] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
            zpf.b(l8b4, 8, 1);
            return i4 + 9;
        }
        l8b l8b5 = (l8b) qpf.q;
        int A = l8b5.A();
        l8b5.H(-2);
        int i6 = (A * 6) + 2;
        if (i3 != 0) {
            l8b4.D(i6);
            byte[] bArr3 = l8b4.a;
            l8b5.e(0, bArr3, i6);
            int i7 = (((bArr3[2] & UByte.MAX_VALUE) << 8) | (bArr3[3] & UByte.MAX_VALUE)) + i3;
            bArr3[2] = (byte) ((i7 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr3[3] = (byte) (i7 & KotlinVersion.MAX_COMPONENT_VALUE);
        } else {
            l8b4 = l8b5;
        }
        zpf.b(l8b4, i6, 1);
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
