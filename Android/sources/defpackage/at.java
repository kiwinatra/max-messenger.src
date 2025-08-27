package defpackage;

import android.os.SharedMemory;
import android.system.ErrnoException;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: at  reason: default package */
public final class at implements c69, Closeable {
    public SharedMemory a;
    public ByteBuffer b;
    public final long c;

    public at(int i) {
        cvg.l(Boolean.valueOf(i > 0));
        try {
            SharedMemory create = SharedMemory.create("AshmemMemoryChunk", i);
            this.a = create;
            this.b = create.mapReadWrite();
            this.c = (long) System.identityHashCode(this);
        } catch (ErrnoException e) {
            throw new RuntimeException("Fail to create AshmemMemory", e);
        }
    }

    public final synchronized int U(int i, int i2, int i3, byte[] bArr) {
        int b2;
        bArr.getClass();
        this.b.getClass();
        b2 = ev0.b(i, i3, getSize());
        ev0.f(i, bArr.length, i2, b2, getSize());
        this.b.position(i);
        this.b.get(bArr, i2, b2);
        return b2;
    }

    public final synchronized int V(int i, int i2, int i3, byte[] bArr) {
        int b2;
        bArr.getClass();
        this.b.getClass();
        b2 = ev0.b(i, i3, getSize());
        ev0.f(i, bArr.length, i2, b2, getSize());
        this.b.position(i);
        this.b.put(bArr, i2, b2);
        return b2;
    }

    public final void a(c69 c69, int i) {
        if (c69 instanceof at) {
            cvg.q(!isClosed());
            at atVar = (at) c69;
            cvg.q(!atVar.isClosed());
            this.b.getClass();
            atVar.b.getClass();
            ev0.f(0, atVar.getSize(), 0, i, getSize());
            this.b.position(0);
            atVar.b.position(0);
            byte[] bArr = new byte[i];
            this.b.get(bArr, 0, i);
            atVar.b.put(bArr, 0, i);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public final synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.a;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.b;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.b = null;
                this.a = null;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final long e0() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    public final int getSize() {
        this.a.getClass();
        return this.a.getSize();
    }

    public final synchronized boolean isClosed() {
        return this.b == null || this.a == null;
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
        if (i < getSize()) {
            z = true;
        }
        cvg.l(Boolean.valueOf(z));
        this.b.getClass();
        return this.b.get(i);
    }

    public final ByteBuffer s() {
        return this.b;
    }
}
