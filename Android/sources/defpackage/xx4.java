package defpackage;

import java.io.EOFException;
import kotlin.io.ConstantsKt;

/* renamed from: xx4  reason: default package */
public final class xx4 implements ypf {
    public final byte[] a = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];

    public final int a(b74 b74, int i, boolean z) {
        byte[] bArr = this.a;
        int read = b74.read(bArr, 0, Math.min(bArr.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void b(long j, int i, int i2, int i3, wpf wpf) {
    }

    public final void c(int i, g1g g1g) {
        g1g.I(i);
    }

    public final void d(ca6 ca6) {
    }
}
