package defpackage;

import java.util.Arrays;

/* renamed from: v4a  reason: default package */
public final class v4a {
    public final /* synthetic */ int a;
    public final int b;
    public boolean c;
    public boolean d;
    public byte[] e;
    public int f;

    public v4a(int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = i;
                byte[] bArr = new byte[131];
                this.e = bArr;
                bArr[2] = 1;
                return;
            default:
                this.b = i;
                byte[] bArr2 = new byte[131];
                this.e = bArr2;
                bArr2[2] = 1;
                return;
        }
    }

    public final void a(int i, byte[] bArr, int i2) {
        switch (this.a) {
            case 0:
                if (this.c) {
                    int i3 = i2 - i;
                    byte[] bArr2 = this.e;
                    int length = bArr2.length;
                    int i4 = this.f;
                    if (length < i4 + i3) {
                        this.e = Arrays.copyOf(bArr2, (i4 + i3) * 2);
                    }
                    System.arraycopy(bArr, i, this.e, this.f, i3);
                    this.f += i3;
                    return;
                }
                return;
            default:
                if (this.c) {
                    int i5 = i2 - i;
                    byte[] bArr3 = this.e;
                    int length2 = bArr3.length;
                    int i6 = this.f;
                    if (length2 < i6 + i5) {
                        this.e = Arrays.copyOf(bArr3, (i6 + i5) * 2);
                    }
                    System.arraycopy(bArr, i, this.e, this.f, i5);
                    this.f += i5;
                    return;
                }
                return;
        }
    }

    public final boolean b(int i) {
        switch (this.a) {
            case 0:
                if (!this.c) {
                    return false;
                }
                this.f -= i;
                this.c = false;
                this.d = true;
                return true;
            default:
                if (!this.c) {
                    return false;
                }
                this.f -= i;
                this.c = false;
                this.d = true;
                return true;
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                this.c = false;
                this.d = false;
                return;
            default:
                this.c = false;
                this.d = false;
                return;
        }
    }

    public final void d(int i) {
        switch (this.a) {
            case 0:
                boolean z = true;
                y64.j(!this.c);
                if (i != this.b) {
                    z = false;
                }
                this.c = z;
                if (z) {
                    this.f = 3;
                    this.d = false;
                    return;
                }
                return;
            default:
                boolean z2 = true;
                n79.n(!this.c);
                if (i != this.b) {
                    z2 = false;
                }
                this.c = z2;
                if (z2) {
                    this.f = 3;
                    this.d = false;
                    return;
                }
                return;
        }
    }
}
