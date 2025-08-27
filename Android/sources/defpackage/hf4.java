package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import kotlin.io.ConstantsKt;

/* renamed from: hf4  reason: default package */
public final class hf4 implements vf5 {
    public final byte[] a = new byte[ConstantsKt.DEFAULT_BLOCK_SIZE];
    public final c74 b;
    public final long c;
    public long o;
    public byte[] v = new byte[65536];
    public int w;
    public int x;

    static {
        cs8.a("media3.extractor");
    }

    public hf4(c74 c74, long j, long j2) {
        this.b = c74;
        this.o = j;
        this.c = j2;
    }

    public final boolean a(int i, boolean z) {
        b(i);
        int i2 = this.x - this.w;
        while (i2 < i) {
            i2 = d(this.v, this.w, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.x = this.w + i2;
        }
        this.w += i;
        return true;
    }

    public final void b(int i) {
        int i2 = this.w + i;
        byte[] bArr = this.v;
        if (i2 > bArr.length) {
            this.v = Arrays.copyOf(this.v, v0g.j(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    public final int c(int i, byte[] bArr, int i2) {
        int i3;
        b(i2);
        int i4 = this.x;
        int i5 = this.w;
        int i6 = i4 - i5;
        if (i6 == 0) {
            i3 = d(this.v, i5, i2, 0, true);
            if (i3 == -1) {
                return -1;
            }
            this.x += i3;
        } else {
            i3 = Math.min(i2, i6);
        }
        System.arraycopy(this.v, this.w, bArr, i, i3);
        this.w += i3;
        return i3;
    }

    public final int d(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.b.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    public final int e(int i) {
        int min = Math.min(this.x, i);
        f(min);
        if (min == 0) {
            byte[] bArr = this.a;
            min = d(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        if (min != -1) {
            this.o += (long) min;
        }
        return min;
    }

    public final void f(int i) {
        int i2 = this.x - i;
        this.x = i2;
        this.w = 0;
        byte[] bArr = this.v;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.v = bArr2;
    }

    public final long h() {
        return this.o;
    }

    public final boolean j(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        int i4 = this.x;
        if (i4 == 0) {
            i3 = 0;
        } else {
            i3 = Math.min(i4, i2);
            System.arraycopy(this.v, 0, bArr, i, i3);
            f(i3);
        }
        int i5 = i3;
        while (i5 < i2 && i5 != -1) {
            i5 = d(bArr, i, i2, i5, z);
        }
        if (i5 != -1) {
            this.o += (long) i5;
        }
        return i5 != -1;
    }

    public final void m(int i, byte[] bArr, int i2) {
        q(bArr, i, i2, false);
    }

    public final boolean q(byte[] bArr, int i, int i2, boolean z) {
        if (!a(i2, z)) {
            return false;
        }
        System.arraycopy(this.v, this.w - i2, bArr, i, i2);
        return true;
    }

    public final long r() {
        return this.o + ((long) this.w);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.x;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.v, 0, bArr, i, min);
            f(min);
            i4 = min;
        }
        if (i4 == 0) {
            i4 = d(bArr, i, i2, 0, true);
        }
        if (i4 != -1) {
            this.o += (long) i4;
        }
        return i4;
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        j(bArr, i, i2, false);
    }

    public final void s(int i) {
        a(i, false);
    }

    public final long w() {
        return this.c;
    }

    public final void y() {
        this.w = 0;
    }

    public final void z(int i) {
        int min = Math.min(this.x, i);
        f(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            i2 = d(this.a, -i2, Math.min(i, this.a.length + i2), i2, false);
        }
        if (i2 != -1) {
            this.o += (long) i2;
        }
    }
}
