package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import kotlin.Unit;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: h47  reason: default package */
public final class h47 {
    public long a;
    public long b;
    public long c;
    public long d;
    public final ArrayDeque e;
    public boolean f;
    public final f47 g;
    public final e47 h;
    public final g47 i = new g47(0, this);
    public final g47 j = new g47(0, this);
    public int k;
    public IOException l;
    public final int m;
    public final a47 n;

    public h47(int i2, a47 a47, boolean z, boolean z2, lx6 lx6) {
        this.m = i2;
        this.n = a47;
        this.d = (long) a47.B0.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.e = arrayDeque;
        this.g = new f47(this, (long) a47.A0.a(), z2);
        this.h = new e47(this, z);
        if (lx6 != null) {
            if (!h()) {
                arrayDeque.add(lx6);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (!h()) {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    public final void a() {
        boolean z;
        boolean i2;
        byte[] bArr = u0g.a;
        synchronized (this) {
            try {
                f47 f47 = this.g;
                if (!f47.v && f47.c) {
                    e47 e47 = this.h;
                    if (e47.c || e47.b) {
                        z = true;
                        i2 = i();
                        Unit unit = Unit.INSTANCE;
                    }
                }
                z = false;
                i2 = i();
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            c(9, (IOException) null);
        } else if (!i2) {
            this.n.g(this.m);
        }
    }

    public final void b() {
        e47 e47 = this.h;
        if (e47.b) {
            throw new IOException("stream closed");
        } else if (e47.c) {
            throw new IOException("stream finished");
        } else if (this.k != 0) {
            Throwable th = this.l;
            if (th == null) {
                th = new StreamResetException(this.k);
            }
            throw th;
        }
    }

    public final void c(int i2, IOException iOException) {
        if (d(i2, iOException)) {
            this.n.H0.m(this.m, i2);
        }
    }

    public final boolean d(int i2, IOException iOException) {
        byte[] bArr = u0g.a;
        synchronized (this) {
            if (this.k != 0) {
                return false;
            }
            if (this.g.v && this.h.c) {
                return false;
            }
            this.k = i2;
            this.l = iOException;
            notifyAll();
            Unit unit = Unit.INSTANCE;
            this.n.g(this.m);
            return true;
        }
    }

    public final void e(int i2) {
        if (d(i2, (IOException) null)) {
            this.n.o(this.m, i2);
        }
    }

    public final synchronized int f() {
        return this.k;
    }

    public final e47 g() {
        synchronized (this) {
            try {
                if (!this.f) {
                    if (!h()) {
                        throw new IllegalStateException("reply before requesting the sink".toString());
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.h;
    }

    public final boolean h() {
        return this.n.a == ((this.m & 1) == 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0023, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean i() {
        /*
            r3 = this;
            monitor-enter(r3)
            int r0 = r3.k     // Catch:{ all -> 0x0025 }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r3)
            return r1
        L_0x0008:
            f47 r0 = r3.g     // Catch:{ all -> 0x0025 }
            boolean r2 = r0.v     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x0012
            boolean r0 = r0.c     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
        L_0x0012:
            e47 r0 = r3.h     // Catch:{ all -> 0x0025 }
            boolean r2 = r0.c     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x001c
            boolean r0 = r0.b     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
        L_0x001c:
            boolean r0 = r3.f     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            monitor-exit(r3)
            r3 = 1
            return r3
        L_0x0025:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h47.i():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001c A[Catch:{ all -> 0x0011 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(defpackage.lx6 r3, boolean r4) {
        /*
            r2 = this;
            byte[] r0 = defpackage.u0g.a
            monitor-enter(r2)
            boolean r0 = r2.f     // Catch:{ all -> 0x0011 }
            r1 = 1
            if (r0 == 0) goto L_0x0013
            if (r4 != 0) goto L_0x000b
            goto L_0x0013
        L_0x000b:
            f47 r3 = r2.g     // Catch:{ all -> 0x0011 }
            r3.getClass()     // Catch:{ all -> 0x0011 }
            goto L_0x001a
        L_0x0011:
            r3 = move-exception
            goto L_0x0034
        L_0x0013:
            r2.f = r1     // Catch:{ all -> 0x0011 }
            java.util.ArrayDeque r0 = r2.e     // Catch:{ all -> 0x0011 }
            r0.add(r3)     // Catch:{ all -> 0x0011 }
        L_0x001a:
            if (r4 == 0) goto L_0x0020
            f47 r3 = r2.g     // Catch:{ all -> 0x0011 }
            r3.v = r1     // Catch:{ all -> 0x0011 }
        L_0x0020:
            boolean r3 = r2.i()     // Catch:{ all -> 0x0011 }
            r2.notifyAll()     // Catch:{ all -> 0x0011 }
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0011 }
            monitor-exit(r2)
            if (r3 != 0) goto L_0x0033
            a47 r3 = r2.n
            int r2 = r2.m
            r3.g(r2)
        L_0x0033:
            return
        L_0x0034:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h47.j(lx6, boolean):void");
    }

    public final void k() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}
