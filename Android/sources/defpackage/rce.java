package defpackage;

import java.util.Arrays;

/* renamed from: rce  reason: default package */
public final class rce implements t28 {
    public final long a = l28.c.getAndIncrement();
    public final q74 b;
    public final tne c;
    public byte[] o;

    public rce(j74 j74, q74 q74) {
        this.b = q74;
        this.c = new tne(j74);
    }

    public final void a() {
    }

    public final void load() {
        tne tne = this.c;
        tne.b = 0;
        try {
            tne.G(this.b);
            int i = 0;
            while (i != -1) {
                int i2 = (int) tne.b;
                byte[] bArr = this.o;
                if (bArr == null) {
                    this.o = new byte[1024];
                } else if (i2 == bArr.length) {
                    this.o = Arrays.copyOf(bArr, bArr.length * 2);
                }
                byte[] bArr2 = this.o;
                i = tne.read(bArr2, i2, bArr2.length - i2);
            }
            b0h.l(tne);
        } catch (Throwable th) {
            b0h.l(tne);
            throw th;
        }
    }
}
