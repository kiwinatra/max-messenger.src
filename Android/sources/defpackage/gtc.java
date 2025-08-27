package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.KotlinVersion;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.LongCompanionObject;

/* renamed from: gtc  reason: default package */
public final class gtc implements xu0 {
    public final rt0 a = new Object();
    public boolean b;
    public final yfe c;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, rt0] */
    public gtc(yfe yfe) {
        this.c = yfe;
    }

    public final boolean C() {
        if (!this.b) {
            rt0 rt0 = this.a;
            if (rt0.C()) {
                if (this.c.e(rt0, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, rt0] */
    public final String H(long j) {
        long j2 = j;
        if (j2 >= 0) {
            long j3 = j2 == LongCompanionObject.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
            byte b2 = (byte) 10;
            long a2 = a(b2, 0, j3);
            int i = (a2 > -1 ? 1 : (a2 == -1 ? 0 : -1));
            rt0 rt0 = this.a;
            if (i != 0) {
                return au0.a(rt0, a2);
            }
            if (j3 < LongCompanionObject.MAX_VALUE && n(j3) && rt0.U(j3 - 1) == ((byte) 13) && n(1 + j3) && rt0.U(j3) == b2) {
                return au0.a(rt0, j3);
            }
            ? obj = new Object();
            rt0.o(obj, 0, Math.min((long) 32, rt0.b));
            throw new EOFException("\\n not found: limit=" + Math.min(rt0.b, j2) + " content=" + obj.f(obj.b).d() + "…");
        }
        throw new IllegalArgumentException(wj6.i(j2, "limit < 0: ").toString());
    }

    public final long L(zx zxVar) {
        rt0 rt0;
        long j = 0;
        while (true) {
            long j2 = (long) ConstantsKt.DEFAULT_BUFFER_SIZE;
            yfe yfe = this.c;
            rt0 = this.a;
            if (yfe.e(rt0, j2) == -1) {
                break;
            }
            long n = rt0.n();
            if (n > 0) {
                j += n;
                zxVar.O(rt0, n);
            }
        }
        long j3 = rt0.b;
        if (j3 <= 0) {
            return j;
        }
        long j4 = j + j3;
        zxVar.O(rt0, j3);
        return j4;
    }

    public final String P(Charset charset) {
        rt0 rt0 = this.a;
        rt0.t0(this.c);
        return rt0.p0(rt0.b, charset);
    }

    public final void R(rt0 rt0, long j) {
        rt0 rt02 = this.a;
        try {
            i0(j);
            rt02.R(rt0, j);
        } catch (EOFException e) {
            rt0.t0(rt02);
            throw e;
        }
    }

    public final void S(long j) {
        if (!this.b) {
            while (j > 0) {
                rt0 rt0 = this.a;
                if (rt0.b == 0) {
                    if (this.c.e(rt0, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                        throw new EOFException();
                    }
                }
                long min = Math.min(j, rt0.b);
                rt0.S(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final String Y() {
        return H(LongCompanionObject.MAX_VALUE);
    }

    public final long a(byte b2, long j, long j2) {
        if (!this.b) {
            long j3 = 0;
            if (j2 >= 0) {
                while (j3 < j2) {
                    long V = this.a.V(b2, j3, j2);
                    if (V != -1) {
                        return V;
                    }
                    rt0 rt0 = this.a;
                    long j4 = rt0.b;
                    if (j4 >= j2) {
                        return -1;
                    }
                    if (this.c.e(rt0, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                        return -1;
                    }
                    j3 = Math.max(j3, j4);
                }
                return -1;
            }
            throw new IllegalArgumentException(wj6.i(j2, "fromIndex=0 toIndex=").toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void close() {
        if (!this.b) {
            this.b = true;
            this.c.close();
            this.a.m();
        }
    }

    public final long e(rt0 rt0, long j) {
        if (!(j >= 0)) {
            throw new IllegalArgumentException(wj6.i(j, "byteCount < 0: ").toString());
        } else if (!this.b) {
            rt0 rt02 = this.a;
            if (rt02.b == 0) {
                if (this.c.e(rt02, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                    return -1;
                }
            }
            return rt02.e(rt0, Math.min(j, rt02.b));
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final vw0 f(long j) {
        i0(j);
        return this.a.f(j);
    }

    public final int f0(b5b b5b) {
        if (!this.b) {
            while (true) {
                rt0 rt0 = this.a;
                int b2 = au0.b(rt0, b5b, true);
                if (b2 == -2) {
                    if (this.c.e(rt0, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                        break;
                    }
                } else if (b2 != -1) {
                    rt0.S((long) b5b.a[b2].c());
                    return b2;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final rt0 getBuffer() {
        return this.a;
    }

    public final void i0(long j) {
        if (!n(j)) {
            throw new EOFException();
        }
    }

    public final boolean isOpen() {
        return !this.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long l0() {
        /*
            r6 = this;
            r0 = 1
            r6.i0(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.n(r2)
            rt0 r3 = r6.a
            if (r2 == 0) goto L_0x005c
            long r4 = (long) r0
            byte r2 = r3.U(r4)
            r4 = 48
            byte r4 = (byte) r4
            if (r2 < r4) goto L_0x0020
            r4 = 57
            byte r4 = (byte) r4
            if (r2 <= r4) goto L_0x0035
        L_0x0020:
            r4 = 97
            byte r4 = (byte) r4
            if (r2 < r4) goto L_0x002a
            r4 = 102(0x66, float:1.43E-43)
            byte r4 = (byte) r4
            if (r2 <= r4) goto L_0x0035
        L_0x002a:
            r4 = 65
            byte r4 = (byte) r4
            if (r2 < r4) goto L_0x0037
            r4 = 70
            byte r4 = (byte) r4
            if (r2 <= r4) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x005c
        L_0x003a:
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.<init>(r1)
            r1 = 16
            int r1 = kotlin.text.CharsKt.checkRadix(r1)
            int r1 = kotlin.text.CharsKt.checkRadix(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x005c:
            long r0 = r3.l0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gtc.l0():long");
    }

    public final int m() {
        i0(4);
        int readInt = this.a.readInt();
        return ((readInt & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | ((-16777216 & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final boolean n(long j) {
        rt0 rt0;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(wj6.i(j, "byteCount < 0: ").toString());
        } else if (!this.b) {
            do {
                rt0 = this.a;
                if (rt0.b >= j) {
                    return true;
                }
            } while (this.c.e(rt0, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final InputStream o0() {
        return new kt0(this, 1);
    }

    public final lkf q() {
        return this.c.q();
    }

    public final int read(ByteBuffer byteBuffer) {
        rt0 rt0 = this.a;
        if (rt0.b == 0) {
            if (this.c.e(rt0, (long) ConstantsKt.DEFAULT_BUFFER_SIZE) == -1) {
                return -1;
            }
        }
        return rt0.read(byteBuffer);
    }

    public final byte readByte() {
        i0(1);
        return this.a.readByte();
    }

    public final void readFully(byte[] bArr) {
        rt0 rt0 = this.a;
        try {
            i0((long) bArr.length);
            rt0.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = rt0.b;
                if (j > 0) {
                    int e0 = rt0.e0(bArr, i, (int) j);
                    if (e0 != -1) {
                        i += e0;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    public final int readInt() {
        i0(4);
        return this.a.readInt();
    }

    public final long readLong() {
        i0(8);
        return this.a.readLong();
    }

    public final short readShort() {
        i0(2);
        return this.a.readShort();
    }

    public final String toString() {
        return "buffer(" + this.c + ')';
    }
}
