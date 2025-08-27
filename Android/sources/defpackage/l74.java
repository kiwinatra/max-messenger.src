package defpackage;

import java.io.InputStream;
import kotlin.UByte;

/* renamed from: l74  reason: default package */
public final class l74 extends InputStream {
    public final /* synthetic */ int a = 0;
    public final byte[] b;
    public boolean c = false;
    public boolean o = false;
    public final Object v;
    public final Object w;

    public l74(h74 h74, p74 p74) {
        this.v = h74;
        this.w = p74;
        this.b = new byte[1];
    }

    public final void close() {
        switch (this.a) {
            case 0:
                if (!this.o) {
                    ((h74) this.v).close();
                    this.o = true;
                    return;
                }
                return;
            default:
                if (!this.o) {
                    ((j74) this.v).close();
                    this.o = true;
                    return;
                }
                return;
        }
    }

    public final void m() {
        switch (this.a) {
            case 0:
                if (!this.c) {
                    ((h74) this.v).N((p74) this.w);
                    this.c = true;
                    return;
                }
                return;
            default:
                if (!this.c) {
                    ((j74) this.v).G((q74) this.w);
                    this.c = true;
                    return;
                }
                return;
        }
    }

    public final int read() {
        switch (this.a) {
            case 0:
                byte[] bArr = this.b;
                if (read(bArr, 0, bArr.length) == -1) {
                    return -1;
                }
                return bArr[0] & UByte.MAX_VALUE;
            default:
                byte[] bArr2 = this.b;
                if (read(bArr2, 0, bArr2.length) == -1) {
                    return -1;
                }
                return bArr2[0] & UByte.MAX_VALUE;
        }
    }

    public final int read(byte[] bArr) {
        switch (this.a) {
            case 0:
                return read(bArr, 0, bArr.length);
            default:
                return read(bArr, 0, bArr.length);
        }
    }

    public l74(j74 j74, q74 q74) {
        this.v = j74;
        this.w = q74;
        this.b = new byte[1];
    }

    public final int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                y64.j(!this.o);
                m();
                int read = ((h74) this.v).read(bArr, i, i2);
                if (read == -1) {
                    return -1;
                }
                return read;
            default:
                n79.n(!this.o);
                m();
                int read2 = ((j74) this.v).read(bArr, i, i2);
                if (read2 == -1) {
                    return -1;
                }
                return read2;
        }
    }
}
