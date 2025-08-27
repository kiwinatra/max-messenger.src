package com.facebook.imagepipeline.memory;

import java.io.Closeable;
import java.nio.ByteBuffer;

@cr4
public class NativeMemoryChunk implements c69, Closeable {
    public final long a;
    public final int b;
    public boolean c;

    static {
        o5a.P("imagepipeline");
    }

    public NativeMemoryChunk(int i) {
        cvg.l(Boolean.valueOf(i > 0));
        this.b = i;
        this.a = nativeAllocate(i);
        this.c = false;
    }

    @cr4
    private static native long nativeAllocate(int i);

    @cr4
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @cr4
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @cr4
    private static native void nativeFree(long j);

    @cr4
    private static native void nativeMemcpy(long j, long j2, int i);

    @cr4
    private static native byte nativeReadByte(long j);

    public final synchronized int U(int i, int i2, int i3, byte[] bArr) {
        int b2;
        bArr.getClass();
        cvg.q(!isClosed());
        b2 = ev0.b(i, i3, this.b);
        ev0.f(i, bArr.length, i2, b2, this.b);
        nativeCopyToByteArray(this.a + ((long) i), bArr, i2, b2);
        return b2;
    }

    public final synchronized int V(int i, int i2, int i3, byte[] bArr) {
        int b2;
        bArr.getClass();
        cvg.q(!isClosed());
        b2 = ev0.b(i, i3, this.b);
        ev0.f(i, bArr.length, i2, b2, this.b);
        nativeCopyFromByteArray(this.a + ((long) i), bArr, i2, b2);
        return b2;
    }

    public final void a(c69 c69, int i) {
        if (c69 instanceof NativeMemoryChunk) {
            cvg.q(!isClosed());
            NativeMemoryChunk nativeMemoryChunk = (NativeMemoryChunk) c69;
            cvg.q(!nativeMemoryChunk.isClosed());
            ev0.f(0, nativeMemoryChunk.b, 0, i, this.b);
            long j = (long) 0;
            nativeMemcpy(nativeMemoryChunk.a + j, this.a + j, i);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public final synchronized void close() {
        if (!this.c) {
            this.c = true;
            nativeFree(this.a);
        }
    }

    public final long e0() {
        return this.a;
    }

    public final void finalize() {
        if (!isClosed()) {
            Integer.toHexString(System.identityHashCode(this));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public final int getSize() {
        return this.b;
    }

    public final synchronized boolean isClosed() {
        return this.c;
    }

    public final long m() {
        return this.a;
    }

    public final void n(c69 c69, int i) {
        c69.getClass();
        if (c69.m() == this.a) {
            Integer.toHexString(System.identityHashCode(this));
            Integer.toHexString(System.identityHashCode(c69));
            Long.toHexString(this.a);
            cvg.l(Boolean.FALSE);
        }
        if (c69.m() < this.a) {
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
        return nativeReadByte(this.a + ((long) i));
    }

    public final ByteBuffer s() {
        return null;
    }

    public NativeMemoryChunk() {
        this.b = 0;
        this.a = 0;
        this.c = true;
    }
}
