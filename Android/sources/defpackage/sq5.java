package defpackage;

import java.util.Arrays;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: sq5  reason: default package */
public final class sq5 extends ixe {
    public uq5 o;
    public vy p;

    public final long b(l8b l8b) {
        byte[] bArr = l8b.a;
        if (bArr[0] != -1) {
            return -1;
        }
        int i = (bArr[2] & UByte.MAX_VALUE) >> 4;
        if (i == 6 || i == 7) {
            l8b.H(4);
            l8b.B();
        }
        int T = ryg.T(i, l8b);
        l8b.G(0);
        return (long) T;
    }

    public final boolean d(l8b l8b, long j, ox0 ox0) {
        l8b l8b2 = l8b;
        ox0 ox02 = ox0;
        byte[] bArr = l8b2.a;
        uq5 uq5 = this.o;
        if (uq5 == null) {
            uq5 uq52 = new uq5(bArr, 17, 1);
            this.o = uq52;
            ox02.c = uq52.e(Arrays.copyOfRange(bArr, 9, l8b2.c), (sp9) null);
            return true;
        }
        byte b = bArr[0];
        if ((b & ByteCompanionObject.MAX_VALUE) == 3) {
            fj E = vzg.E(l8b);
            long j2 = uq5.k;
            uq5 uq53 = new uq5(uq5.b, uq5.c, uq5.d, uq5.e, uq5.f, uq5.h, uq5.i, j2, E, (sp9) uq5.m);
            this.o = uq53;
            vy vyVar = new vy(3);
            vyVar.o = uq53;
            vyVar.v = E;
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
                ox02.b = vyVar2;
            }
            ((ea6) ox02.c).getClass();
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
