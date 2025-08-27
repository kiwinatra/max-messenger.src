package defpackage;

import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream$InvalidStreamException;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: f69  reason: default package */
public final class f69 extends OutputStream {
    public final d69 a;
    public jd4 b;
    public int c;

    public f69(d69 d69, int i) {
        if (i > 0) {
            this.a = d69;
            this.c = 0;
            this.b = y33.q0(d69.get(i), d69, y33.w);
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final void close() {
        y33.U(this.b);
        this.b = null;
        this.c = -1;
        m();
    }

    public final void m() {
        try {
            super.close();
        } catch (IOException e) {
            n54.I(e);
            throw null;
        }
    }

    public final e69 n() {
        if (y33.m0(this.b)) {
            jd4 jd4 = this.b;
            if (jd4 != null) {
                return new e69(this.c, jd4);
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
    }

    public final void write(int i) {
        write(new byte[]{(byte) i});
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder n = a81.n("length=", bArr.length, "; regionStart=", i, "; regionLength=");
            n.append(i2);
            throw new ArrayIndexOutOfBoundsException(n.toString());
        } else if (y33.m0(this.b)) {
            int i3 = this.c + i2;
            if (y33.m0(this.b)) {
                jd4 jd4 = this.b;
                if (jd4 != null) {
                    if (i3 > ((c69) jd4.e0()).getSize()) {
                        d69 d69 = this.a;
                        c69 c69 = (c69) d69.get(i3);
                        jd4 jd42 = this.b;
                        if (jd42 != null) {
                            ((c69) jd42.e0()).n(c69, this.c);
                            this.b.close();
                            this.b = y33.q0(c69, d69, y33.w);
                        } else {
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                    }
                    jd4 jd43 = this.b;
                    if (jd43 != null) {
                        ((c69) jd43.e0()).V(this.c, i, i2, bArr);
                        this.c += i2;
                        return;
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
        } else {
            throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
        }
    }

    public f69(d69 d69) {
        this(d69, d69.Y[0]);
    }
}
