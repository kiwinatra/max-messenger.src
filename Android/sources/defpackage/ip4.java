package defpackage;

import java.io.EOFException;
import kotlin.io.ConstantsKt;

/* renamed from: ip4  reason: default package */
public final class ip4 implements zpf {
    public final byte[] a = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];

    public final void a(long j, int i, int i2, int i3, xpf xpf) {
    }

    public final void b(l8b l8b, int i, int i2) {
        l8b.H(i);
    }

    public final int c(c74 c74, int i, boolean z) {
        byte[] bArr = this.a;
        int read = c74.read(bArr, 0, Math.min(bArr.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void e(ea6 ea6) {
    }
}
