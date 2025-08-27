package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.util.Collections;
import java.util.List;

/* renamed from: dy6  reason: default package */
public final class dy6 {
    public final List a;
    public final int b;
    public final float c;
    public final String d;

    public dy6(List list, int i, float f, String str) {
        this.a = list;
        this.b = i;
        this.c = f;
        this.d = str;
    }

    public static dy6 a(g1g g1g) {
        int i;
        g1g g1g2 = g1g;
        try {
            g1g2.I(21);
            int v = g1g.v() & 3;
            int v2 = g1g.v();
            int i2 = g1g2.b;
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < v2; i5++) {
                g1g2.I(1);
                int A = g1g.A();
                for (int i6 = 0; i6 < A; i6++) {
                    int A2 = g1g.A();
                    i4 += A2 + 4;
                    g1g2.I(A2);
                }
            }
            g1g2.H(i2);
            byte[] bArr = new byte[i4];
            float f = 1.0f;
            String str = null;
            int i7 = 0;
            int i8 = 0;
            while (i7 < v2) {
                int v3 = g1g.v() & 127;
                int A3 = g1g.A();
                int i9 = i3;
                while (i9 < A3) {
                    int A4 = g1g.A();
                    System.arraycopy(vzg.b, i3, bArr, i8, 4);
                    int i10 = i8 + 4;
                    System.arraycopy(g1g2.a, g1g2.b, bArr, i10, A4);
                    if (v3 == 33 && i9 == 0) {
                        w4a B = vzg.B(i10, bArr, i10 + A4);
                        i = v2;
                        str = m58.f(B.a, B.b, B.c, B.d, B.e, B.f);
                        f = B.g;
                    } else {
                        i = v2;
                    }
                    i8 = i10 + A4;
                    g1g2.I(A4);
                    i9++;
                    v2 = i;
                    i3 = 0;
                }
                int i11 = v2;
                i7++;
                i3 = 0;
            }
            return new dy6(i4 == 0 ? Collections.emptyList() : Collections.singletonList(bArr), v + 1, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a("Error parsing HEVC config", e);
        }
    }
}
