package defpackage;

import androidx.media3.common.ParserException;
import java.util.Collections;
import java.util.List;

/* renamed from: ey6  reason: default package */
public final class ey6 {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final String j;

    public ey6(List list, int i2, int i3, int i4, int i5, int i6, int i7, float f2, int i8, String str) {
        this.a = list;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = f2;
        this.i = i8;
        this.j = str;
    }

    public static ey6 a(l8b l8b) {
        int i2;
        int i3;
        l8b l8b2 = l8b;
        try {
            l8b2.H(21);
            int u = l8b.u() & 3;
            int u2 = l8b.u();
            int i4 = l8b2.b;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < u2; i7++) {
                l8b2.H(1);
                int A = l8b.A();
                for (int i8 = 0; i8 < A; i8++) {
                    int A2 = l8b.A();
                    i6 += A2 + 4;
                    l8b2.H(A2);
                }
            }
            l8b2.G(i4);
            byte[] bArr = new byte[i6];
            int i9 = -1;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            float f2 = 1.0f;
            String str = null;
            int i15 = 0;
            int i16 = 0;
            while (i15 < u2) {
                int u3 = l8b.u() & 63;
                int A3 = l8b.A();
                int i17 = i5;
                while (i17 < A3) {
                    int A4 = l8b.A();
                    int i18 = u2;
                    System.arraycopy(b0h.b, i5, bArr, i16, 4);
                    int i19 = i16 + 4;
                    System.arraycopy(l8b2.a, l8b2.b, bArr, i19, A4);
                    if (u3 == 33 && i17 == 0) {
                        x4a I = b0h.I(i19, bArr, i19 + A4);
                        int i20 = I.e + 8;
                        i10 = I.f + 8;
                        i11 = I.m;
                        int i21 = I.n;
                        int i22 = I.o;
                        float f3 = I.k;
                        int i23 = I.l;
                        i3 = u3;
                        i2 = A3;
                        i9 = i20;
                        str = hd8.e(I.a, I.b, I.c, I.d, I.g, I.h);
                        float f4 = f3;
                        i13 = i22;
                        i12 = i21;
                        i14 = i23;
                        f2 = f4;
                    } else {
                        i3 = u3;
                        i2 = A3;
                    }
                    i16 = i19 + A4;
                    l8b2.H(A4);
                    i17++;
                    u2 = i18;
                    u3 = i3;
                    A3 = i2;
                    i5 = 0;
                }
                int i24 = u2;
                i15++;
                i5 = 0;
            }
            return new ey6(i6 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), u + 1, i9, i10, i11, i12, i13, f2, i14, str);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ParserException.a("Error parsing HEVC config", e2);
        }
    }
}
