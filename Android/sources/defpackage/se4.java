package defpackage;

import java.util.ArrayDeque;
import kotlin.UByte;

/* renamed from: se4  reason: default package */
public final class se4 {
    public final byte[] a;
    public final ArrayDeque b;
    public int c;
    public int d;
    public long e;
    public final Object f;
    public Object g;

    public se4(int i) {
        switch (i) {
            case 1:
                this.a = new byte[8];
                this.b = new ArrayDeque();
                this.f = new g1g(1, false);
                return;
            default:
                this.a = new byte[8];
                this.b = new ArrayDeque();
                this.f = new g1g(0, false);
                return;
        }
    }

    public long a(gf4 gf4, int i) {
        byte[] bArr = this.a;
        gf4.j(bArr, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & UByte.MAX_VALUE));
        }
        return j;
    }

    public long b(hf4 hf4, int i) {
        byte[] bArr = this.a;
        hf4.j(bArr, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & UByte.MAX_VALUE));
        }
        return j;
    }
}
