package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ftc  reason: default package */
public final class ftc implements wu0 {
    public final rt0 a = new Object();
    public boolean b;
    public final nde c;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, rt0] */
    public ftc(nde nde) {
        this.c = nde;
    }

    public final wu0 B(int i) {
        if (!this.b) {
            this.a.x0(i);
            F();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final wu0 D(int i) {
        if (!this.b) {
            this.a.u0(i);
            F();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final wu0 F() {
        if (!this.b) {
            rt0 rt0 = this.a;
            long n = rt0.n();
            if (n > 0) {
                this.c.O(rt0, n);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final wu0 M(String str) {
        if (!this.b) {
            rt0 rt0 = this.a;
            rt0.getClass();
            rt0.z0(0, str.length(), str);
            F();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final wu0 N(vw0 vw0) {
        if (!this.b) {
            rt0 rt0 = this.a;
            rt0.getClass();
            byte[] bArr = vw0.c;
            rt0.write(bArr, 0, bArr.length);
            F();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void O(rt0 rt0, long j) {
        if (!this.b) {
            this.a.O(rt0, j);
            F();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final wu0 Q(long j) {
        if (!this.b) {
            this.a.w0(j);
            F();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final wu0 c0(int i, byte[] bArr, int i2) {
        if (!this.b) {
            this.a.write(bArr, i, i2);
            F();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void close() {
        nde nde = this.c;
        if (!this.b) {
            try {
                rt0 rt0 = this.a;
                long j = rt0.b;
                if (j > 0) {
                    nde.O(rt0, j);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                nde.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.b = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final void flush() {
        if (!this.b) {
            rt0 rt0 = this.a;
            long j = rt0.b;
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            nde nde = this.c;
            if (i > 0) {
                nde.O(rt0, j);
            }
            nde.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final rt0 getBuffer() {
        return this.a;
    }

    public final boolean isOpen() {
        return !this.b;
    }

    public final wu0 j0(long j) {
        if (!this.b) {
            this.a.v0(j);
            F();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final lkf q() {
        return this.c.q();
    }

    public final String toString() {
        return "buffer(" + this.c + ')';
    }

    public final int write(ByteBuffer byteBuffer) {
        if (!this.b) {
            int write = this.a.write(byteBuffer);
            F();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final wu0 y() {
        if (!this.b) {
            rt0 rt0 = this.a;
            long j = rt0.b;
            if (j > 0) {
                this.c.O(rt0, j);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final wu0 z(int i) {
        if (!this.b) {
            this.a.y0(i);
            F();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final wu0 write(byte[] bArr) {
        if (!this.b) {
            rt0 rt0 = this.a;
            rt0.getClass();
            rt0.write(bArr, 0, bArr.length);
            F();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
