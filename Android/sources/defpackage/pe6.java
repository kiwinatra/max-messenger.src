package defpackage;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.webrtc.EncodedImage;

/* renamed from: pe6  reason: default package */
public final class pe6 implements z9d {
    public volatile boolean a;
    public volatile u64 b;
    public final ConcurrentLinkedQueue c;
    public final AtomicInteger d = new AtomicInteger();
    public final AtomicInteger e;
    public final zjf f;
    public volatile psg g;
    public volatile boolean h;

    public pe6() {
        new AtomicLong();
        this.e = new AtomicInteger();
        this.c = new ConcurrentLinkedQueue();
        this.f = new zjf();
    }

    public static void b(psg psg) {
        if (psg != null) {
            synchronized (psg.a) {
                psg.a.notify();
            }
        }
    }

    public final void a(u64 u64, byte[] bArr, int i) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.get();
        byte b2 = wrap.get();
        wrap.getShort();
        if (b2 == 1) {
            this.h = true;
        }
    }

    public final synchronized void c(boolean z) {
        try {
            if (this.a) {
                this.a = false;
                psg psg = this.g;
                if (psg != null) {
                    psg.o = true;
                    if (z) {
                        synchronized (psg.b) {
                            psg.c = null;
                        }
                    }
                }
                b(psg);
                Iterator it = this.c.iterator();
                while (it.hasNext()) {
                    EncodedImage encodedImage = (EncodedImage) it.next();
                    this.d.addAndGet(-encodedImage.buffer.remaining());
                    encodedImage.release();
                    it.remove();
                }
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void d(u64 u64) {
        try {
            if (this.b != null) {
                this.b.e.remove(this);
                this.b.c(this);
            }
            c(true);
            this.b = u64;
            if (this.b != null) {
                this.b.e.add(this);
                this.b.a(this);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final synchronized void e() {
        c(true);
        this.a = true;
        psg psg = new psg(this, this.b);
        this.g = psg;
        psg.start();
    }
}
