package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.UByte;

/* renamed from: d5b  reason: default package */
public final class d5b extends ixe {
    public static final byte[] o = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] p = {79, 112, 117, 115, 84, 97, 103, 115};

    public static boolean g(g1g g1g, byte[] bArr) {
        if (g1g.c() < bArr.length) {
            return false;
        }
        int i = g1g.b;
        byte[] bArr2 = new byte[bArr.length];
        g1g.g(0, bArr2, bArr.length);
        g1g.H(i);
        return Arrays.equals(bArr2, bArr);
    }

    public final long c(g1g g1g) {
        byte b;
        byte[] bArr = g1g.a;
        byte b2 = bArr[0];
        byte b3 = b2 & UByte.MAX_VALUE;
        byte b4 = b2 & 3;
        if (b4 != 0) {
            b = 2;
            if (!(b4 == 1 || b4 == 2)) {
                b = bArr[1] & 63;
            }
        } else {
            b = 1;
        }
        int i = b3 >> 3;
        int i2 = i & 3;
        return (((long) this.f) * (((long) b) * ((long) (i >= 16 ? 2500 << i2 : i >= 12 ? 10000 << (i & 1) : i2 == 3 ? 60000 : 10000 << i2)))) / 1000000;
    }

    public final boolean e(g1g g1g, long j, xe8 xe8) {
        boolean z = false;
        if (g(g1g, o)) {
            byte[] copyOf = Arrays.copyOf(g1g.a, g1g.c);
            byte b = copyOf[9] & UByte.MAX_VALUE;
            ArrayList f = tf6.f(copyOf);
            if (((ca6) xe8.b) == null) {
                z = true;
            }
            y64.j(z);
            aa6 aa6 = new aa6();
            aa6.k = "audio/opus";
            aa6.x = b;
            aa6.y = 48000;
            aa6.m = f;
            xe8.b = new ca6(aa6);
            return true;
        } else if (g(g1g, p)) {
            y64.k((ca6) xe8.b);
            g1g.I(8);
            rp9 G = n54.G(tb7.q((String[]) n54.L(g1g, false, false).b));
            if (G == null) {
                return true;
            }
            aa6 a = ((ca6) xe8.b).a();
            rp9 rp9 = ((ca6) xe8.b).X;
            if (rp9 != null) {
                pp9[] pp9Arr = rp9.a;
                if (pp9Arr.length != 0) {
                    int i = t0g.a;
                    pp9[] pp9Arr2 = G.a;
                    Object[] copyOf2 = Arrays.copyOf(pp9Arr2, pp9Arr2.length + pp9Arr.length);
                    System.arraycopy(pp9Arr, 0, copyOf2, pp9Arr2.length, pp9Arr.length);
                    G = new rp9((pp9[]) copyOf2);
                }
            }
            a.i = G;
            xe8.b = new ca6(a);
            return true;
        } else {
            y64.k((ca6) xe8.b);
            return false;
        }
    }
}
