package defpackage;

import kotlin.UByte;

/* renamed from: etf  reason: default package */
public final class etf {
    public final byte[] a;
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public etf(int i) {
        switch (i) {
            case 1:
                this.a = new byte[10];
                return;
            default:
                this.a = new byte[10];
                return;
        }
    }

    public void a(ypf ypf, wpf wpf) {
        if (this.c > 0) {
            ypf.b(this.d, this.e, this.f, this.g, wpf);
            this.c = 0;
        }
    }

    public void b(zpf zpf, xpf xpf) {
        if (this.c > 0) {
            zpf.a(this.d, this.e, this.f, this.g, xpf);
            this.c = 0;
        }
    }

    public void c(ypf ypf, long j, int i, int i2, int i3, wpf wpf) {
        if (!(this.g <= i2 + i3)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        } else if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(ypf, wpf);
            }
        }
    }

    public void d(zpf zpf, long j, int i, int i2, int i3, xpf xpf) {
        n79.m("TrueHD chunk samples must be contiguous in the sample queue.", this.g <= i2 + i3);
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                b(zpf, xpf);
            }
        }
    }

    public void e(uf5 uf5) {
        if (!this.b) {
            byte[] bArr = this.a;
            int i = 0;
            uf5.m(0, bArr, 10);
            uf5.y();
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
                byte b2 = bArr[7];
                if ((b2 & 254) == 186) {
                    i = 40 << ((bArr[(b2 & UByte.MAX_VALUE) == 187 ? (char) 9 : 8] >> 4) & 7);
                }
            }
            if (i != 0) {
                this.b = true;
            }
        }
    }

    public void f(vf5 vf5) {
        if (!this.b) {
            byte[] bArr = this.a;
            int i = 0;
            vf5.m(0, bArr, 10);
            vf5.y();
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
                byte b2 = bArr[7];
                if ((b2 & 254) == 186) {
                    i = 40 << ((bArr[(b2 & UByte.MAX_VALUE) == 187 ? (char) 9 : 8] >> 4) & 7);
                }
            }
            if (i != 0) {
                this.b = true;
            }
        }
    }
}
