package defpackage;

import java.util.Arrays;

/* renamed from: c07  reason: default package */
public final class c07 extends m03 {
    public byte[] X;
    public volatile boolean Y;
    public byte[] Z;

    public final void a() {
        this.Y = true;
    }

    public final void load() {
        try {
            this.z.G(this.b);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.Y) {
                byte[] bArr = this.X;
                if (bArr.length < i2 + 16384) {
                    this.X = Arrays.copyOf(bArr, bArr.length + 16384);
                }
                i = this.z.read(this.X, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.Y) {
                this.Z = Arrays.copyOf(this.X, i2);
            }
            b0h.l(this.z);
        } catch (Throwable th) {
            b0h.l(this.z);
            throw th;
        }
    }
}
