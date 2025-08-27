package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import kotlin.UByte;

/* renamed from: e5b  reason: default package */
public final class e5b extends ixe {
    public static final byte[] p = {79, 112, 117, 115, 72, 101, 97, 100};
    public static final byte[] q = {79, 112, 117, 115, 84, 97, 103, 115};
    public boolean o;

    public static boolean g(l8b l8b, byte[] bArr) {
        if (l8b.a() < bArr.length) {
            return false;
        }
        int i = l8b.b;
        byte[] bArr2 = new byte[bArr.length];
        l8b.e(0, bArr2, bArr.length);
        l8b.G(i);
        return Arrays.equals(bArr2, bArr);
    }

    public final long b(l8b l8b) {
        byte[] bArr = l8b.a;
        byte b = 0;
        byte b2 = bArr[0];
        if (bArr.length > 1) {
            b = bArr[1];
        }
        return (((long) this.f) * hi7.u(b2, b)) / 1000000;
    }

    public final boolean d(l8b l8b, long j, ox0 ox0) {
        if (g(l8b, p)) {
            byte[] copyOf = Arrays.copyOf(l8b.a, l8b.c);
            byte b = copyOf[9] & UByte.MAX_VALUE;
            ArrayList c = hi7.c(copyOf);
            if (((ea6) ox0.c) != null) {
                return true;
            }
            ba6 ba6 = new ba6();
            ba6.m = vq9.l("audio/opus");
            ba6.A = b;
            ba6.B = 48000;
            ba6.p = c;
            ox0.c = new ea6(ba6);
            return true;
        } else if (g(l8b, q)) {
            n79.o((ea6) ox0.c);
            if (this.o) {
                return true;
            }
            this.o = true;
            l8b.H(8);
            sp9 G = o54.G(tb7.q((String[]) o54.H(l8b, false, false).b));
            if (G == null) {
                return true;
            }
            ba6 a = ((ea6) ox0.c).a();
            a.j = G.b(((ea6) ox0.c).k);
            ox0.c = new ea6(a);
            return true;
        } else {
            n79.o((ea6) ox0.c);
            return false;
        }
    }

    public final void f(boolean z) {
        super.f(z);
        if (z) {
            this.o = false;
        }
    }
}
