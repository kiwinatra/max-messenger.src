package defpackage;

/* renamed from: pu9  reason: default package */
public final class pu9 implements zpf {
    public ea6 a;
    public final byte[] b = new byte[16000];

    public final void a(long j, int i, int i2, int i3, xpf xpf) {
    }

    public final void b(l8b l8b, int i, int i2) {
        while (i > 0) {
            byte[] bArr = this.b;
            int min = Math.min(i, bArr.length);
            l8b.e(0, bArr, min);
            i -= min;
        }
    }

    public final int c(c74 c74, int i, boolean z) {
        int i2 = i;
        while (i2 > 0) {
            byte[] bArr = this.b;
            boolean z2 = false;
            int read = c74.read(bArr, 0, Math.min(i2, bArr.length));
            if (read != -1) {
                z2 = true;
            }
            n79.n(z2);
            i2 -= read;
        }
        return i;
    }

    public final void e(ea6 ea6) {
        this.a = ea6;
    }
}
