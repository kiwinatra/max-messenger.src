package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: bu0  reason: default package */
public final class bu0 implements c69, Closeable {
    public ByteBuffer a;
    public final int b;
    public final long c = ((long) System.identityHashCode(this));

    public bu0(int i) {
        this.a = ByteBuffer.allocateDirect(i);
        this.b = i;
    }

    public final synchronized int U(int i, int i2, int i3, byte[] bArr) {
        int b2;
        bArr.getClass();
        cvg.q(!isClosed());
        this.a.getClass();
        b2 = ev0.b(i, i3, this.b);
        ev0.f(i, bArr.length, i2, b2, this.b);
        this.a.position(i);
        this.a.get(bArr, i2, b2);
        return b2;
    }

    public final synchronized int V(int i, int i2, int i3, byte[] bArr) {
        int b2;
        bArr.getClass();
        cvg.q(!isClosed());
        this.a.getClass();
        b2 = ev0.b(i, i3, this.b);
        ev0.f(i, bArr.length, i2, b2, this.b);
        this.a.position(i);
        this.a.put(bArr, i2, b2);
        return b2;
    }

    public final void a(c69 c69, int i) {
        if (c69 instanceof bu0) {
            cvg.q(!isClosed());
            bu0 bu0 = (bu0) c69;
            cvg.q(!bu0.isClosed());
            this.a.getClass();
            ev0.f(0, bu0.b, 0, i, this.b);
            this.a.position(0);
            ByteBuffer s = bu0.s();
            s.getClass();
            s.position(0);
            byte[] bArr = new byte[i];
            this.a.get(bArr, 0, i);
            s.put(bArr, 0, i);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public final synchronized void close() {
        this.a = null;
    }

    public final long e0() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    public final int getSize() {
        return this.b;
    }

    public final synchronized boolean isClosed() {
        return this.a == null;
    }

    public final long m() {
        return this.c;
    }

    public final void n(c69 c69, int i) {
        c69.getClass();
        long m = c69.m();
        long j = this.c;
        if (m == j) {
            Long.toHexString(j);
            Long.toHexString(c69.m());
            cvg.l(Boolean.FALSE);
        }
        if (c69.m() < this.c) {
            synchronized (c69) {
                synchronized (this) {
                    a(c69, i);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (c69) {
                a(c69, i);
            }
        }
    }

    public final synchronized byte o(int i) {
        boolean z = false;
        cvg.q(!isClosed());
        cvg.l(Boolean.valueOf(i >= 0));
        if (i < this.b) {
            z = true;
        }
        cvg.l(Boolean.valueOf(z));
        this.a.getClass();
        return this.a.get(i);
    }

    public final synchronized ByteBuffer s() {
        return this.a;
    }
}
