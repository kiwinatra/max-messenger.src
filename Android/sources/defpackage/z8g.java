package defpackage;

import androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException;
import kotlin.UByte;

/* renamed from: z8g  reason: default package */
public final class z8g extends j3h {
    public final l8b b = new l8b(b0h.b);
    public final l8b c = new l8b(4);
    public int o;
    public boolean v;
    public boolean w;
    public int x;

    public z8g(zpf zpf) {
        super((Object) zpf);
    }

    public final boolean n1(l8b l8b) {
        int u = l8b.u();
        int i = (u >> 4) & 15;
        int i2 = u & 15;
        if (i2 == 7) {
            this.x = i;
            return i != 5;
        }
        throw new TagPayloadReader$UnsupportedFormatException(wj6.h(i2, "Video format not supported: "));
    }

    public final boolean o1(long j, l8b l8b) {
        int u = l8b.u();
        byte[] bArr = l8b.a;
        int i = l8b.b;
        int i2 = i + 1;
        l8b.b = i2;
        int i3 = i + 2;
        l8b.b = i3;
        int i4 = (bArr[i2] & UByte.MAX_VALUE) << 8;
        l8b.b = i + 3;
        long j2 = (((long) ((bArr[i3] & UByte.MAX_VALUE) | i4 | (((bArr[i] & UByte.MAX_VALUE) << 24) >> 8))) * 1000) + j;
        zpf zpf = (zpf) this.a;
        if (u == 0 && !this.v) {
            byte[] bArr2 = new byte[l8b.a()];
            l8b l8b2 = new l8b(bArr2);
            l8b.e(0, bArr2, l8b.a());
            ke0 a = ke0.a(l8b2);
            this.o = a.b;
            ba6 ba6 = new ba6();
            ba6.m = vq9.l("video/avc");
            ba6.i = a.l;
            ba6.s = a.c;
            ba6.t = a.d;
            ba6.w = a.k;
            ba6.p = a.a;
            zpf.e(ba6.a());
            this.v = true;
            return false;
        } else if (u != 1 || !this.v) {
            return false;
        } else {
            int i5 = this.x == 1 ? 1 : 0;
            if (!this.w && i5 == 0) {
                return false;
            }
            l8b l8b3 = this.c;
            byte[] bArr3 = l8b3.a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i6 = 4 - this.o;
            int i7 = 0;
            while (l8b.a() > 0) {
                l8b.e(i6, l8b3.a, this.o);
                l8b3.G(0);
                int y = l8b3.y();
                l8b l8b4 = this.b;
                l8b4.G(0);
                zpf.b(l8b4, 4, 0);
                zpf.b(l8b, y, 0);
                i7 = i7 + 4 + y;
            }
            ((zpf) this.a).a(j2, i5, i7, 0, (xpf) null);
            this.w = true;
            return true;
        }
    }
}
