package defpackage;

import com.google.android.exoplayer2.extractor.flv.TagPayloadReader$UnsupportedFormatException;
import kotlin.UByte;

/* renamed from: y8g  reason: default package */
public final class y8g extends j3h {
    public final g1g b = new g1g(vzg.b);
    public final g1g c = new g1g(4);
    public int o;
    public boolean v;
    public boolean w;
    public int x;

    public y8g(ypf ypf) {
        super((Object) ypf);
    }

    public final boolean n1(g1g g1g) {
        int v2 = g1g.v();
        int i = (v2 >> 4) & 15;
        int i2 = v2 & 15;
        if (i2 == 7) {
            this.x = i;
            return i != 5;
        }
        throw new TagPayloadReader$UnsupportedFormatException(i2a.h(39, i2, "Video format not supported: "));
    }

    public final boolean o1(long j, g1g g1g) {
        int v2 = g1g.v();
        byte[] bArr = g1g.a;
        int i = g1g.b;
        int i2 = i + 1;
        g1g.b = i2;
        int i3 = i + 2;
        g1g.b = i3;
        int i4 = (bArr[i2] & UByte.MAX_VALUE) << 8;
        g1g.b = i + 3;
        long j2 = (((long) ((bArr[i3] & UByte.MAX_VALUE) | i4 | (((bArr[i] & UByte.MAX_VALUE) << 24) >> 8))) * 1000) + j;
        ypf ypf = (ypf) this.a;
        if (v2 == 0 && !this.v) {
            byte[] bArr2 = new byte[g1g.c()];
            g1g g1g2 = new g1g(bArr2);
            g1g.g(0, bArr2, g1g.c());
            je0 a = je0.a(g1g2);
            this.o = a.b;
            aa6 aa6 = new aa6();
            aa6.k = "video/avc";
            aa6.h = a.f;
            aa6.p = a.c;
            aa6.q = a.d;
            aa6.t = a.e;
            aa6.m = a.a;
            ypf.d(new ca6(aa6));
            this.v = true;
            return false;
        } else if (v2 != 1 || !this.v) {
            return false;
        } else {
            int i5 = this.x == 1 ? 1 : 0;
            if (!this.w && i5 == 0) {
                return false;
            }
            g1g g1g3 = this.c;
            byte[] bArr3 = g1g3.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i6 = 4 - this.o;
            int i7 = 0;
            while (g1g.c() > 0) {
                g1g.g(i6, g1g3.a, this.o);
                g1g3.H(0);
                int y = g1g3.y();
                g1g g1g4 = this.b;
                g1g4.H(0);
                ypf.c(4, g1g4);
                ypf.c(y, g1g);
                i7 = i7 + 4 + y;
            }
            ((ypf) this.a).b(j2, i5, i7, 0, (wpf) null);
            this.w = true;
            return true;
        }
    }
}
