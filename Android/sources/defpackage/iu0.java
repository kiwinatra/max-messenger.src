package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: iu0  reason: default package */
public final class iu0 implements o70 {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final AtomicBoolean b = new AtomicBoolean(false);
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final tsd d;
    public final Object e;
    public hu0 f;
    public final o70 g;
    public final int h;
    public final int i;
    public final int j;
    public final AtomicBoolean k;
    public int l;

    public iu0(q70 q70, y90 y90) {
        k40 k40;
        boolean z = false;
        if (k40.c != null) {
            k40 = k40.c;
        } else {
            synchronized (k40.class) {
                try {
                    if (k40.c == null) {
                        k40.c = new k40(0);
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            k40 = k40.c;
        }
        this.d = new tsd(k40);
        this.e = new Object();
        this.f = null;
        this.k = new AtomicBoolean(false);
        this.g = q70;
        int a2 = y90.a();
        this.h = a2;
        int i2 = y90.b;
        this.i = i2;
        bs0.m("mBytesPerFrame must be greater than 0.", ((long) a2) > 0);
        bs0.m("mSampleRate must be greater than 0.", ((long) i2) > 0 ? true : z);
        this.j = 500;
        this.l = a2 * 1024;
    }

    public final void a(b8d b8d, tsd tsd) {
        bs0.r("AudioStream can not be started when setCallback.", !this.a.get());
        b();
        this.d.execute(new ktg(this, b8d, tsd, 6));
    }

    public final void b() {
        bs0.r("AudioStream has been released.", !this.b.get());
    }

    public final void c() {
        if (this.k.get()) {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.l);
            hu0 hu0 = new hu0(allocateDirect, this.g.read(allocateDirect), this.h, this.i);
            int i2 = this.j;
            synchronized (this.e) {
                try {
                    this.c.offer(hu0);
                    while (this.c.size() > i2) {
                        this.c.poll();
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (this.k.get()) {
                this.d.execute(new gu0(this, 2));
            }
        }
    }

    public final ba0 read(ByteBuffer byteBuffer) {
        boolean z;
        b();
        bs0.r("AudioStream has not been started.", this.a.get());
        this.d.execute(new l40(this, byteBuffer.remaining(), 2));
        ba0 ba0 = new ba0(0, 0);
        do {
            synchronized (this.e) {
                try {
                    hu0 hu0 = this.f;
                    this.f = null;
                    if (hu0 == null) {
                        hu0 = (hu0) this.c.poll();
                    }
                    if (hu0 != null) {
                        ba0 = hu0.a(byteBuffer);
                        if (hu0.c.remaining() > 0) {
                            this.f = hu0;
                        }
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            z = ba0.a <= 0 && this.a.get() && !this.b.get();
            if (z) {
                try {
                    Thread.sleep(1);
                    continue;
                } catch (InterruptedException unused) {
                }
            }
        } while (z);
        return ba0;
    }

    public final void release() {
        if (!this.b.getAndSet(true)) {
            this.d.execute(new gu0(this, 3));
        }
    }

    public final void start() {
        b();
        AtomicBoolean atomicBoolean = this.a;
        if (!atomicBoolean.getAndSet(true)) {
            FutureTask futureTask = new FutureTask(new gu0(this, 1), (Object) null);
            this.d.execute(futureTask);
            try {
                futureTask.get();
            } catch (InterruptedException | ExecutionException e2) {
                atomicBoolean.set(false);
                throw new Exception(e2);
            }
        }
    }

    public final void stop() {
        b();
        if (this.a.getAndSet(false)) {
            this.d.execute(new gu0(this, 0));
        }
    }
}
