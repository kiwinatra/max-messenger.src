package defpackage;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: yb4  reason: default package */
public final class yb4 {
    public final boolean a;
    public final boolean b;
    public final SparseArray c = new SparseArray();
    public int d;
    public j60 e = j60.e;
    public int f = -1;
    public ur1[] g = new ur1[0];
    public long h = -9223372036854775807L;
    public long i = -1;
    public long j;
    public long k = LongCompanionObject.MAX_VALUE;
    public long l;

    public yb4(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        if (z) {
            this.l = LongCompanionObject.MAX_VALUE;
        }
    }

    public final int a(j60 j60, long j2) {
        c();
        c();
        j60 j602 = this.e;
        if (j60.a != j602.a || !ld9.k(j60) || !ld9.k(j602)) {
            throw new AudioProcessor$UnhandledAudioFormatException("Can not add source. MixerFormat=" + this.e, j60);
        }
        long a0 = v0g.a0(j2 - this.h, (long) j60.a, 1000000, RoundingMode.CEILING);
        int i2 = this.d;
        this.d = i2 + 1;
        this.c.append(i2, new xb4(this, j60, b22.a(j60.b, this.e.b), a0));
        LinkedHashMap linkedHashMap = p94.a;
        synchronized (p94.class) {
        }
        return i2;
    }

    public final ur1 b(long j2) {
        ByteBuffer order = ByteBuffer.allocateDirect(this.f * this.e.d).order(ByteOrder.nativeOrder());
        order.mark();
        return new ur1(order, j2, j2 + ((long) this.f));
    }

    public final void c() {
        n79.m("Audio mixer is not configured.", !this.e.equals(j60.e));
    }

    public final void d(j60 j60) {
        n79.m("Audio mixer already configured.", this.e.equals(j60.e));
        if (ld9.k(j60)) {
            this.e = j60;
            this.f = (500 * j60.a) / 1000;
            this.h = 0;
            LinkedHashMap linkedHashMap = p94.a;
            synchronized (p94.class) {
            }
            this.g = new ur1[]{b(0), b((long) this.f)};
            this.i = Math.min(this.k, this.j + ((long) this.f));
            return;
        }
        throw new AudioProcessor$UnhandledAudioFormatException("Can not mix to this AudioFormat.", j60);
    }

    public final boolean e() {
        c();
        long j2 = this.j;
        return j2 >= this.k || (j2 >= this.l && this.c.size() == 0);
    }

    public final void f(int i2, ByteBuffer byteBuffer) {
        int i3;
        yb4 yb4 = this;
        int i4 = i2;
        ByteBuffer byteBuffer2 = byteBuffer;
        c();
        if (byteBuffer.hasRemaining()) {
            SparseArray sparseArray = yb4.c;
            n79.m("Source not found.", v0g.l(sparseArray, i4));
            xb4 xb4 = (xb4) sparseArray.get(i4);
            if (xb4.a < yb4.i) {
                long min = Math.min(xb4.a + ((long) (byteBuffer.remaining() / xb4.b.d)), yb4.i);
                if (xb4.c.d) {
                    xb4.a(min, byteBuffer2);
                    return;
                }
                long j2 = xb4.a;
                long j3 = yb4.j;
                if (j2 < j3) {
                    xb4.a(Math.min(min, j3), byteBuffer2);
                    if (xb4.a == min) {
                        return;
                    }
                }
                ur1[] ur1Arr = yb4.g;
                int length = ur1Arr.length;
                int i5 = 0;
                while (i5 < length) {
                    ur1 ur1 = ur1Arr[i5];
                    long j4 = xb4.a;
                    if (j4 >= ur1.b) {
                        i3 = i5;
                    } else {
                        int i6 = ((int) (j4 - ur1.a)) * yb4.e.d;
                        ByteBuffer byteBuffer3 = (ByteBuffer) ur1.c;
                        byteBuffer3.position(byteBuffer3.position() + i6);
                        long min2 = Math.min(min, ur1.b);
                        j60 j60 = yb4.e;
                        n79.g(min2 >= xb4.a);
                        int i7 = (int) (min2 - xb4.a);
                        boolean z = xb4.d.b;
                        i3 = i5;
                        ld9.M(byteBuffer, xb4.b, (ByteBuffer) ur1.c, j60, xb4.c, i7, true, z);
                        xb4.a = min2;
                        byteBuffer3.reset();
                        if (xb4.a == min) {
                            return;
                        }
                    }
                    i5 = i3 + 1;
                    yb4 = this;
                }
            }
        }
    }
}
