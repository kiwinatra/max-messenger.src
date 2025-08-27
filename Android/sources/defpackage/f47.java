package defpackage;

import java.io.IOException;
import kotlin.Unit;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: f47  reason: default package */
public final class f47 implements yfe {
    public final rt0 a = new Object();
    public final rt0 b = new Object();
    public boolean c;
    public final long o;
    public boolean v;
    public final /* synthetic */ h47 w;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, rt0] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, rt0] */
    public f47(h47 h47, long j, boolean z) {
        this.w = h47;
        this.o = j;
        this.v = z;
    }

    public final void a(long j) {
        byte[] bArr = u0g.a;
        this.w.n.m(j);
    }

    public final void close() {
        long j;
        synchronized (this.w) {
            this.c = true;
            rt0 rt0 = this.b;
            j = rt0.b;
            rt0.m();
            h47 h47 = this.w;
            if (h47 != null) {
                h47.notifyAll();
                Unit unit = Unit.INSTANCE;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
            }
        }
        if (j > 0) {
            a(j);
        }
        this.w.a();
    }

    /* JADX INFO: finally extract failed */
    public final long e(rt0 rt0, long j) {
        Throwable th;
        boolean z;
        long j2;
        long j3 = j;
        long j4 = 0;
        if (j3 >= 0) {
            while (true) {
                synchronized (this.w) {
                    this.w.i.i();
                    try {
                        if (this.w.f() != 0) {
                            th = this.w.l;
                            if (th == null) {
                                th = new StreamResetException(this.w.f());
                            }
                        } else {
                            th = null;
                        }
                        if (!this.c) {
                            rt0 rt02 = this.b;
                            long j5 = rt02.b;
                            z = false;
                            if (j5 > j4) {
                                j2 = rt02.e(rt0, Math.min(j3, j5));
                                h47 h47 = this.w;
                                long j6 = h47.a + j2;
                                h47.a = j6;
                                long j7 = j6 - h47.b;
                                if (th == null && j7 >= ((long) (h47.n.A0.a() / 2))) {
                                    h47 h472 = this.w;
                                    h472.n.U(h472.m, j7);
                                    h47 h473 = this.w;
                                    h473.b = h473.a;
                                }
                            } else {
                                rt0 rt03 = rt0;
                                if (!this.v && th == null) {
                                    this.w.k();
                                    z = true;
                                }
                                j2 = -1;
                            }
                            this.w.i.m();
                            Unit unit = Unit.INSTANCE;
                        } else {
                            throw new IOException("stream closed");
                        }
                    } catch (Throwable th2) {
                        this.w.i.m();
                        throw th2;
                    }
                }
                if (z) {
                    j4 = 0;
                } else if (j2 != -1) {
                    a(j2);
                    return j2;
                } else if (th == null) {
                    return -1;
                } else {
                    throw th;
                }
            }
        } else {
            throw new IllegalArgumentException(wj6.i(j3, "byteCount < 0: ").toString());
        }
    }

    public final lkf q() {
        return this.w.i;
    }
}
