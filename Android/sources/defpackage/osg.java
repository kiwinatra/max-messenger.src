package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;

/* renamed from: osg  reason: default package */
public final class osg extends hhd {
    public final int b;
    public final int c;
    public final int d;
    public final ByteBuffer e;

    public osg(byte[] bArr) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.order(ByteOrder.BIG_ENDIAN);
        wrap.get();
        this.b = wrap.getShort() & UShort.MAX_VALUE;
        wrap.getInt();
        byte b2 = wrap.get();
        int[] A = tr1.A(2);
        int length = A.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i3 = A[i2];
            byte b3 = 1;
            if (i3 == 1) {
                b3 = 0;
            } else if (i3 != 2) {
                throw null;
            }
            if (b3 == b2) {
                i = i3;
                break;
            }
            i2++;
        }
        this.c = i;
        this.d = wrap.getShort() & UShort.MAX_VALUE;
        this.a = wrap.get();
        this.e = wrap.slice();
    }
}
