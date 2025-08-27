package defpackage;

import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* renamed from: hae  reason: default package */
public final class hae extends pi0 {
    public final long i = 150000;
    public final long j = 20000;
    public final short k = 1024;
    public int l;
    public boolean m;
    public byte[] n;
    public byte[] o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public long t;

    public hae() {
        byte[] bArr = t0g.f;
        this.n = bArr;
        this.o = bArr;
    }

    public final void b(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i2 = this.p;
            if (i2 == 0) {
                int limit = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.n.length));
                int limit2 = byteBuffer.limit() - 2;
                while (true) {
                    if (limit2 < byteBuffer.position()) {
                        position = byteBuffer.position();
                        break;
                    } else if (Math.abs(byteBuffer.getShort(limit2)) > this.k) {
                        int i3 = this.l;
                        position = ((limit2 / i3) * i3) + i3;
                        break;
                    } else {
                        limit2 -= 2;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    j(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.s = true;
                    }
                }
                byteBuffer.limit(limit);
            } else if (i2 == 1) {
                int limit3 = byteBuffer.limit();
                int k2 = k(byteBuffer);
                int position2 = k2 - byteBuffer.position();
                byte[] bArr = this.n;
                int length = bArr.length;
                int i4 = this.q;
                int i5 = length - i4;
                if (k2 >= limit3 || position2 >= i5) {
                    int min = Math.min(position2, i5);
                    byteBuffer.limit(byteBuffer.position() + min);
                    byteBuffer.get(this.n, this.q, min);
                    int i6 = this.q + min;
                    this.q = i6;
                    byte[] bArr2 = this.n;
                    if (i6 == bArr2.length) {
                        if (this.s) {
                            l(this.r, bArr2);
                            this.t += (long) ((this.q - (this.r * 2)) / this.l);
                        } else {
                            this.t += (long) ((i6 - this.r) / this.l);
                        }
                        m(byteBuffer, this.n, this.q);
                        this.q = 0;
                        this.p = 2;
                    }
                    byteBuffer.limit(limit3);
                } else {
                    l(i4, bArr);
                    this.q = 0;
                    this.p = 0;
                }
            } else if (i2 == 2) {
                int limit4 = byteBuffer.limit();
                int k3 = k(byteBuffer);
                byteBuffer.limit(k3);
                this.t += (long) (byteBuffer.remaining() / this.l);
                m(byteBuffer, this.o, this.r);
                if (k3 < limit4) {
                    l(this.r, this.o);
                    this.p = 0;
                    byteBuffer.limit(limit4);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final i60 f(i60 i60) {
        if (i60.c == 2) {
            return this.m ? i60 : i60.e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(i60);
    }

    public final void g() {
        if (this.m) {
            i60 i60 = this.b;
            int i2 = i60.d;
            this.l = i2;
            int i3 = i60.a;
            int i4 = ((int) ((this.i * ((long) i3)) / 1000000)) * i2;
            if (this.n.length != i4) {
                this.n = new byte[i4];
            }
            int i5 = ((int) ((this.j * ((long) i3)) / 1000000)) * i2;
            this.r = i5;
            if (this.o.length != i5) {
                this.o = new byte[i5];
            }
        }
        this.p = 0;
        this.t = 0;
        this.q = 0;
        this.s = false;
    }

    public final void h() {
        int i2 = this.q;
        if (i2 > 0) {
            l(i2, this.n);
        }
        if (!this.s) {
            this.t += (long) (this.r / this.l);
        }
    }

    public final void i() {
        this.m = false;
        this.r = 0;
        byte[] bArr = t0g.f;
        this.n = bArr;
        this.o = bArr;
    }

    public final boolean isActive() {
        return this.m;
    }

    public final int k(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs(byteBuffer.getShort(position)) > this.k) {
                int i2 = this.l;
                return (position / i2) * i2;
            }
        }
        return byteBuffer.limit();
    }

    public final void l(int i2, byte[] bArr) {
        j(i2).put(bArr, 0, i2).flip();
        if (i2 > 0) {
            this.s = true;
        }
    }

    public final void m(ByteBuffer byteBuffer, byte[] bArr, int i2) {
        int min = Math.min(byteBuffer.remaining(), this.r);
        int i3 = this.r - min;
        System.arraycopy(bArr, i2 - i3, this.o, 0, i3);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.o, i3, min);
    }
}
