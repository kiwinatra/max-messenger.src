package defpackage;

import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: rq5  reason: default package */
public final class rq5 extends ixe {
    public uq5 o;
    public vy p;

    public final long c(g1g g1g) {
        byte[] bArr = g1g.a;
        if (bArr[0] != -1) {
            return -1;
        }
        int i = (bArr[2] & UByte.MAX_VALUE) >> 4;
        if (i == 6 || i == 7) {
            g1g.I(4);
            g1g.D();
        }
        int A = hsg.A(i, g1g);
        g1g.H(0);
        return (long) A;
    }

    public final boolean e(g1g g1g, long j, xe8 xe8) {
        g1g g1g2 = g1g;
        xe8 xe82 = xe8;
        byte[] bArr = g1g2.a;
        uq5 uq5 = this.o;
        if (uq5 == null) {
            uq5 uq52 = new uq5(bArr, 17, 0);
            this.o = uq52;
            xe82.b = uq52.d(Arrays.copyOfRange(bArr, 9, g1g2.c), (rp9) null);
            return true;
        }
        byte b = bArr[0];
        if ((b & ByteCompanionObject.MAX_VALUE) == 3) {
            dm4 H = cvg.H(g1g);
            long j2 = uq5.k;
            uq5 uq53 = new uq5(uq5.b, uq5.c, uq5.d, uq5.e, uq5.f, uq5.h, uq5.i, j2, H, (rp9) uq5.m);
            this.o = uq53;
            vy vyVar = new vy(2);
            vyVar.o = uq53;
            vyVar.v = H;
            vyVar.b = -1;
            vyVar.c = -1;
            this.p = vyVar;
            return true;
        } else if (b != -1) {
            return true;
        } else {
            vy vyVar2 = this.p;
            if (vyVar2 != null) {
                vyVar2.b = j;
                xe82.c = vyVar2;
            }
            ((ca6) xe82.b).getClass();
            return false;
        }
    }

    public final void f(boolean z) {
        super.f(z);
        if (z) {
            this.o = null;
            this.p = null;
        }
    }
}
