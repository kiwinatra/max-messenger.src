package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jae  reason: default package */
public final class jae implements o70 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final int c;
    public final int d;
    public byte[] e;
    public long f;
    public b8d g;
    public Executor h;

    public jae(y90 y90) {
        this.c = y90.a();
        this.d = y90.b;
    }

    public final void a(b8d b8d, tsd tsd) {
        bs0.r("AudioStream can not be started when setCallback.", !this.a.get());
        b();
        this.g = b8d;
        this.h = tsd;
    }

    public final void b() {
        bs0.r("AudioStream has been released.", !this.b.get());
    }

    public final ba0 read(ByteBuffer byteBuffer) {
        b();
        bs0.r("AudioStream has not been started.", this.a.get());
        int i = this.c;
        long Q = m5a.Q(i, (long) byteBuffer.remaining());
        long j = (long) i;
        boolean z = true;
        bs0.m("bytesPerFrame must be greater than 0.", j > 0);
        int i2 = (int) (j * Q);
        if (i2 <= 0) {
            return new ba0(0, this.f);
        }
        long u = this.f + m5a.u(this.d, Q);
        long nanoTime = u - System.nanoTime();
        if (nanoTime > 0) {
            try {
                Thread.sleep(TimeUnit.NANOSECONDS.toMillis(nanoTime));
            } catch (InterruptedException unused) {
            }
        }
        if (i2 > byteBuffer.remaining()) {
            z = false;
        }
        bs0.r((String) null, z);
        byte[] bArr = this.e;
        if (bArr == null || bArr.length < i2) {
            this.e = new byte[i2];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.e, 0, i2).limit(position + i2).position(position);
        ba0 ba0 = new ba0(i2, this.f);
        this.f = u;
        return ba0;
    }

    public final void release() {
        this.b.getAndSet(true);
    }

    public final void start() {
        b();
        if (!this.a.getAndSet(true)) {
            this.f = System.nanoTime();
            b8d b8d = this.g;
            Executor executor = this.h;
            if (b8d != null && executor != null) {
                executor.execute(new mgd(9, b8d));
            }
        }
    }

    public final void stop() {
        b();
        this.a.set(false);
    }
}
