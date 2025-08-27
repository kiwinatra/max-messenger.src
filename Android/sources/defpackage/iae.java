package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import kotlin.KotlinVersion;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: iae  reason: default package */
public final class iae extends qi0 {
    public final float i = 0.2f;
    public final short j = 1024;
    public final int k = 10;
    public final long l = 100000;
    public final long m = 2000000;
    public int n;
    public boolean o;
    public int p;
    public long q;
    public int r = 0;
    public byte[] s;
    public int t = 0;
    public int u = 0;
    public byte[] v;

    public iae() {
        byte[] bArr = v0g.f;
        this.s = bArr;
        this.v = bArr;
    }

    public final void b(ByteBuffer byteBuffer) {
        int position;
        int limit;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i2 = this.p;
            short s2 = this.j;
            boolean z = true;
            if (i2 == 0) {
                int limit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit2, byteBuffer.position() + this.s.length));
                int limit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (limit3 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(limit3) << 8) | (byteBuffer.get(limit3 - 1) & UByte.MAX_VALUE)) > s2) {
                        int i3 = this.n;
                        position = ((limit3 / i3) * i3) + i3;
                        break;
                    }
                    limit3 -= 2;
                }
                if (position == byteBuffer.position()) {
                    this.p = 1;
                } else {
                    byteBuffer.limit(Math.min(position, byteBuffer.capacity()));
                    k(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(limit2);
            } else if (i2 == 1) {
                n79.n(this.t < this.s.length);
                int limit4 = byteBuffer.limit();
                int position2 = byteBuffer.position() + 1;
                while (true) {
                    if (position2 >= byteBuffer.limit()) {
                        limit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(position2) << 8) | (byteBuffer.get(position2 - 1) & UByte.MAX_VALUE)) > s2) {
                        int i4 = this.n;
                        limit = (position2 / i4) * i4;
                        break;
                    }
                    position2 += 2;
                }
                int position3 = limit - byteBuffer.position();
                int i5 = this.t;
                int i6 = this.u;
                int i7 = i5 + i6;
                byte[] bArr = this.s;
                if (i7 < bArr.length) {
                    i5 = bArr.length;
                } else {
                    i7 = i6 - (bArr.length - i5);
                }
                int i8 = i5 - i7;
                boolean z2 = limit < limit4;
                int min = Math.min(position3, i8);
                byteBuffer.limit(byteBuffer.position() + min);
                byteBuffer.get(this.s, i7, min);
                int i9 = this.u + min;
                this.u = i9;
                n79.n(i9 <= this.s.length);
                if (!z2 || position3 >= i8) {
                    z = false;
                }
                m(z);
                if (z) {
                    this.p = 0;
                    this.r = 0;
                }
                byteBuffer.limit(limit4);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final j60 g(j60 j60) {
        if (j60.c == 2) {
            return j60.a == -1 ? j60.e : j60;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(j60);
    }

    public final void h() {
        if (isActive()) {
            j60 j60 = this.b;
            int i2 = j60.b * 2;
            this.n = i2;
            int i3 = ((((int) ((this.l * ((long) j60.a)) / 1000000)) / 2) / i2) * i2 * 2;
            if (this.s.length != i3) {
                this.s = new byte[i3];
                this.v = new byte[i3];
            }
        }
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.t = 0;
        this.u = 0;
    }

    public final void i() {
        if (this.u > 0) {
            m(true);
            this.r = 0;
        }
    }

    public final boolean isActive() {
        return super.isActive() && this.o;
    }

    public final void j() {
        this.o = false;
        byte[] bArr = v0g.f;
        this.s = bArr;
        this.v = bArr;
    }

    public final int l(int i2) {
        int length = ((((int) ((this.m * ((long) this.b.a)) / 1000000)) - this.r) * this.n) - (this.s.length / 2);
        n79.n(length >= 0);
        int i3 = this.n;
        return (((int) Math.min((((float) i2) * this.i) + 0.5f, (float) length)) / i3) * i3;
    }

    public final void m(boolean z) {
        int i2;
        int i3;
        int i4 = this.u;
        byte[] bArr = this.s;
        if (i4 == bArr.length || z) {
            boolean z2 = false;
            if (this.r == 0) {
                if (z) {
                    n(i4, 3);
                    i2 = i4;
                } else {
                    n79.n(i4 >= bArr.length / 2);
                    i2 = this.s.length / 2;
                    n(i2, 0);
                }
                i3 = i2;
            } else if (z) {
                int length = i4 - (bArr.length / 2);
                int length2 = (bArr.length / 2) + length;
                int l2 = l(length) + (this.s.length / 2);
                n(l2, 2);
                int i5 = length2;
                i3 = l2;
                i2 = i5;
            } else {
                i2 = i4 - (bArr.length / 2);
                i3 = l(i2);
                n(i3, 1);
            }
            n79.m("bytesConsumed is not aligned to frame size: %s" + i2, i2 % this.n == 0);
            if (i4 >= i3) {
                z2 = true;
            }
            n79.n(z2);
            this.u -= i2;
            int i6 = this.t + i2;
            this.t = i6;
            this.t = i6 % this.s.length;
            int i7 = this.r;
            int i8 = this.n;
            this.r = (i3 / i8) + i7;
            this.q += (long) ((i2 - i3) / i8);
        }
    }

    public final void n(int i2, int i3) {
        if (i2 != 0) {
            boolean z = true;
            n79.g(this.u >= i2);
            if (i3 == 2) {
                int i4 = this.t;
                int i5 = this.u;
                int i6 = i4 + i5;
                byte[] bArr = this.s;
                if (i6 <= bArr.length) {
                    System.arraycopy(bArr, i6 - i2, this.v, 0, i2);
                } else {
                    int length = i5 - (bArr.length - i4);
                    if (length >= i2) {
                        System.arraycopy(bArr, length - i2, this.v, 0, i2);
                    } else {
                        int i7 = i2 - length;
                        System.arraycopy(bArr, bArr.length - i7, this.v, 0, i7);
                        System.arraycopy(this.s, 0, this.v, i7, length);
                    }
                }
            } else {
                int i8 = this.t;
                int i9 = i8 + i2;
                byte[] bArr2 = this.s;
                if (i9 <= bArr2.length) {
                    System.arraycopy(bArr2, i8, this.v, 0, i2);
                } else {
                    int length2 = bArr2.length - i8;
                    System.arraycopy(bArr2, i8, this.v, 0, length2);
                    System.arraycopy(this.s, 0, this.v, length2, i2 - length2);
                }
            }
            n79.f("sizeToOutput is not aligned to frame size: " + i2, i2 % this.n == 0);
            n79.n(this.t < this.s.length);
            byte[] bArr3 = this.v;
            if (i2 % this.n != 0) {
                z = false;
            }
            n79.f("byteOutput size is not aligned to frame size " + i2, z);
            if (i3 != 3) {
                for (int i10 = 0; i10 < i2; i10 += 2) {
                    int i11 = i10 + 1;
                    byte b = (bArr3[i11] << 8) | (bArr3[i10] & UByte.MAX_VALUE);
                    int i12 = this.k;
                    if (i3 == 0) {
                        i12 = ((((i10 * 1000) / (i2 - 1)) * (i12 - 100)) / 1000) + 100;
                    } else if (i3 == 2) {
                        i12 += (((i10 * 1000) * (100 - i12)) / (i2 - 1)) / 1000;
                    }
                    int i13 = (b * i12) / 100;
                    if (i13 >= 32767) {
                        bArr3[i10] = -1;
                        bArr3[i11] = ByteCompanionObject.MAX_VALUE;
                    } else if (i13 <= -32768) {
                        bArr3[i10] = 0;
                        bArr3[i11] = ByteCompanionObject.MIN_VALUE;
                    } else {
                        bArr3[i10] = (byte) (i13 & KotlinVersion.MAX_COMPONENT_VALUE);
                        bArr3[i11] = (byte) (i13 >> 8);
                    }
                }
            }
            k(i2).put(bArr3, 0, i2).flip();
        }
    }
}
