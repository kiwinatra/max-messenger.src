package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: m55  reason: default package */
public final class m55 extends dcd implements gu6 {
    public static final ByteBuffer o = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
    public final ea6 e;
    public final long f;
    public final AtomicLong g = new AtomicLong();
    public final ConcurrentLinkedQueue h = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue i = new ConcurrentLinkedQueue();
    public volatile boolean j;
    public long k;
    public boolean l;
    public long m;
    public ba4 n;

    public m55(ea6 ea6, hrf hrf, g0a g0a, ni3 ni3, long j2) {
        super(ea6, g0a);
        this.e = ea6;
        this.f = j2;
        ni3.e(hrf);
    }

    public final void b(e05 e05, long j2, ea6 ea6, boolean z) {
        AtomicLong atomicLong = this.g;
        this.k = atomicLong.get();
        atomicLong.addAndGet(j2);
    }

    public final ba4 d() {
        if (this.n == null) {
            ba4 ba4 = (ba4) this.h.poll();
            this.n = ba4;
            if (!this.l) {
                if (ba4 == null) {
                    ba4 ba42 = new ba4(2);
                    this.n = ba42;
                    ba42.v = o;
                } else {
                    long j2 = this.m;
                    ByteBuffer byteBuffer = ba4.v;
                    byteBuffer.getClass();
                    this.m = j2 - ((long) byteBuffer.capacity());
                }
            }
        }
        return this.n;
    }

    public final boolean f() {
        ba4 ba4 = this.n;
        ba4.getClass();
        this.n = null;
        if (ba4.h(4)) {
            this.j = true;
        } else {
            ba4.x = this.k + this.f + ba4.x;
            this.i.add(ba4);
        }
        if (!this.l) {
            int size = this.i.size() + this.h.size();
            long j2 = this.m;
            ByteBuffer byteBuffer = ba4.v;
            byteBuffer.getClass();
            long capacity = j2 + ((long) byteBuffer.capacity());
            this.m = capacity;
            this.l = size >= 10 && (size >= 200 || capacity >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE);
        }
        return true;
    }

    public final gu6 j(e05 e05, ea6 ea6, int i2) {
        return this;
    }

    public final ba4 k() {
        return (ba4) this.i.peek();
    }

    public final ea6 l() {
        return this.e;
    }

    public final boolean m() {
        return this.j && this.i.isEmpty();
    }

    public final void o() {
    }

    public final void p() {
        ba4 ba4 = (ba4) this.i.remove();
        ba4.z();
        ba4.x = 0;
        this.h.add(ba4);
    }
}
