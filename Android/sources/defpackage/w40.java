package defpackage;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: w40  reason: default package */
public final class w40 implements gu6 {
    public final j60 a;
    public final ConcurrentLinkedQueue b;
    public final ConcurrentLinkedQueue c;
    public final ConcurrentLinkedQueue d;
    public final AtomicLong e;
    public g6d f;
    public ba4 g;
    public h60 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public boolean n;
    public boolean o;

    public w40(j60 j60, e05 e05, ea6 ea6) {
        j60 j602 = new j60(ea6);
        boolean z = false;
        n79.f(j602, (j602.c == -1 || j602.a == -1 || j602.b == -1) ? false : true);
        this.b = new ConcurrentLinkedQueue();
        ByteBuffer order = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        for (int i2 = 0; i2 < 10; i2++) {
            ba4 ba4 = new ba4(2);
            ba4.v = order;
            this.b.add(ba4);
        }
        this.c = new ConcurrentLinkedQueue();
        this.d = new ConcurrentLinkedQueue();
        this.f = new g6d(j602);
        h60 k2 = k(e05, ea6, j602, j60);
        this.h = k2;
        k2.b();
        j60 j603 = this.h.d;
        this.a = j603;
        n79.f(j603, j603.c == 2 ? true : z);
        this.e = new AtomicLong(-9223372036854775807L);
        this.l = -9223372036854775807L;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [qb7, jb7] */
    public static h60 k(e05 e05, ea6 ea6, j60 j60, j60 j602) {
        int i2;
        sp9 sp9;
        ? jb7 = new jb7(4);
        if (!(!e05.d || ea6 == null || (sp9 = ea6.k) == null)) {
            jb7.a(new uge(new x4d(sp9)));
        }
        jb7.e(e05.g.a);
        int i3 = j602.a;
        if (i3 != -1) {
            vfe vfe = new vfe();
            vfe.b = i3;
            jb7.a(vfe);
        }
        int i4 = j602.b;
        if (i4 == 1 || i4 == 2) {
            a22 a22 = new a22();
            b22 a2 = b22.a(1, i4);
            SparseArray sparseArray = a22.i;
            sparseArray.put(a2.a, a2);
            b22 a3 = b22.a(2, i4);
            sparseArray.put(a3.a, a3);
            jb7.a(a22);
        }
        h60 h60 = new h60(jb7.j());
        j60 a4 = h60.a(j60);
        if ((i3 == -1 || i3 == a4.a) && ((i4 == -1 || i4 == a4.b) && ((i2 = j602.c) == -1 || i2 == a4.c))) {
            return h60;
        }
        throw new AudioProcessor$UnhandledAudioFormatException("Audio can not be modified to match downstream format", j60);
    }

    public final void b(e05 e05, long j2, ea6 ea6, boolean z) {
        boolean z2 = false;
        if (ea6 == null) {
            if (j2 != -9223372036854775807L) {
                z2 = true;
            }
            n79.m("Could not generate silent audio because duration is unknown.", z2);
        } else {
            n79.n(vq9.h(ea6.n));
            j60 j60 = new j60(ea6);
            if (!(j60.c == -1 || j60.a == -1 || j60.b == -1)) {
                z2 = true;
            }
            n79.m(j60, z2);
        }
        this.d.add(new v40(e05, j2, ea6, z));
    }

    public final ba4 d() {
        if (!this.d.isEmpty()) {
            return null;
        }
        return (ba4) this.b.peek();
    }

    public final boolean f() {
        n79.n(this.d.isEmpty());
        ba4 ba4 = (ba4) this.b.remove();
        this.c.add(ba4);
        this.e.compareAndSet(-9223372036854775807L, ba4.x);
        return true;
    }

    public final void i() {
        g6d g6d = this.f;
        long j2 = this.l;
        long j3 = this.m;
        j60 j60 = (j60) g6d.b;
        long Y = j2 - v0g.Y(j60.a, j3 / ((long) j60.d));
        j60 j602 = (j60) g6d.b;
        ((AtomicLong) g6d.o).addAndGet(((long) j602.d) * v0g.a0(Y, (long) j602.a, 1000000, RoundingMode.CEILING));
        this.n = true;
        if (this.o) {
            this.k = true;
        }
    }

    public final void j(ba4 ba4) {
        ba4.z();
        ba4.x = 0;
        this.b.add(ba4);
    }

    public final ByteBuffer l() {
        ByteBuffer byteBuffer;
        j60 j60;
        boolean z = this.i;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.d;
        if (!z) {
            byteBuffer = m60.a;
        } else {
            boolean f2 = this.h.f();
            ConcurrentLinkedQueue concurrentLinkedQueue2 = this.c;
            if (f2) {
                while (true) {
                    if (this.f.u()) {
                        ByteBuffer n2 = this.f.n();
                        this.h.i(n2);
                        if (n2.hasRemaining()) {
                            break;
                        } else if (!this.f.u()) {
                            this.h.h();
                            break;
                        }
                    } else {
                        ba4 ba4 = (ba4) concurrentLinkedQueue2.peek();
                        if (ba4 == null) {
                            if (!concurrentLinkedQueue.isEmpty()) {
                                if (!n()) {
                                    this.h.h();
                                    break;
                                }
                                i();
                            } else {
                                break;
                            }
                        } else if (ba4.h(4)) {
                            if (!n()) {
                                this.h.h();
                                this.j = true;
                                j((ba4) concurrentLinkedQueue2.remove());
                                break;
                            }
                            i();
                            j((ba4) concurrentLinkedQueue2.remove());
                        } else {
                            ByteBuffer byteBuffer2 = ba4.v;
                            byteBuffer2.getClass();
                            this.h.i(byteBuffer2);
                            this.m += ((long) byteBuffer2.remaining()) - ((long) byteBuffer2.remaining());
                            if (byteBuffer2.hasRemaining()) {
                                break;
                            }
                            j((ba4) concurrentLinkedQueue2.remove());
                        }
                    }
                }
                byteBuffer = this.h.d();
            } else if (this.f.u()) {
                byteBuffer = this.f.n();
            } else {
                ba4 ba42 = this.g;
                if (ba42 != null) {
                    byteBuffer = ba42.v;
                    n79.o(byteBuffer);
                    if (!byteBuffer.hasRemaining()) {
                        ba4 ba43 = this.g;
                        n79.o(ba43);
                        j(ba43);
                        this.g = null;
                    }
                }
                ba4 ba44 = (ba4) concurrentLinkedQueue2.poll();
                if (ba44 == null) {
                    if (!concurrentLinkedQueue.isEmpty() && n()) {
                        i();
                    }
                    byteBuffer = m60.a;
                } else {
                    ByteBuffer byteBuffer3 = ba44.v;
                    this.j = ba44.h(4);
                    if (byteBuffer3 == null || !byteBuffer3.hasRemaining() || this.j) {
                        j(ba44);
                        if (this.j && n()) {
                            i();
                        }
                        byteBuffer = m60.a;
                    } else {
                        this.g = ba44;
                        this.m += (long) byteBuffer3.remaining();
                        byteBuffer = byteBuffer3;
                    }
                }
            }
        }
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        if (!m() && !concurrentLinkedQueue.isEmpty()) {
            v40 v40 = (v40) concurrentLinkedQueue.poll();
            n79.o(v40);
            this.m = 0;
            this.o = v40.d;
            this.n = false;
            e05 e05 = v40.a;
            long j2 = v40.b;
            ea6 ea6 = v40.c;
            if (ea6 != null) {
                this.l = j2;
                j60 = new j60(ea6);
                this.f = new g6d(j60);
            } else {
                if (e05.g.a.isEmpty()) {
                    this.l = e05.b(j2);
                } else {
                    this.l = j2;
                }
                this.e.compareAndSet(-9223372036854775807L, 0);
                i();
                j60 = (j60) this.f.b;
            }
            if (this.i) {
                this.h = k(e05, ea6, j60, this.a);
            }
            this.h.b();
            this.j = false;
            this.i = true;
        }
        return m60.a;
    }

    public final boolean m() {
        ByteBuffer byteBuffer;
        if (!this.i) {
            return false;
        }
        ba4 ba4 = this.g;
        if ((ba4 == null || (byteBuffer = ba4.v) == null || !byteBuffer.hasRemaining()) && !this.f.u() && this.c.isEmpty()) {
            return this.h.f() && !this.h.e();
        }
        return true;
    }

    public final boolean n() {
        if (!this.n) {
            long j2 = this.l;
            if (j2 != -9223372036854775807L) {
                long j3 = this.m;
                j60 j60 = (j60) this.f.b;
                if (j2 - v0g.Y(j60.a, j3 / ((long) j60.d)) > 2000) {
                    return true;
                }
            }
        }
        return false;
    }
}
