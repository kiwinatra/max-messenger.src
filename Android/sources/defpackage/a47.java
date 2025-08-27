package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* renamed from: a47  reason: default package */
public final class a47 implements Closeable {
    public static final a0e K0;
    public final a0e A0;
    public a0e B0;
    public long C0;
    public long D0;
    public long E0;
    public long F0;
    public final Socket G0;
    public final i47 H0;
    public final fb1 I0;
    public final LinkedHashSet J0;
    public final cef X;
    public final cef Y;
    public final wc8 Z;
    public final boolean a = true;
    public final q37 b;
    public final LinkedHashMap c;
    public final String o;
    public int v;
    public long v0;
    public int w;
    public long w0;
    public boolean x;
    public long x0;
    public final fef y;
    public long y0;
    public final cef z;
    public long z0;

    static {
        a0e a0e = new a0e();
        a0e.b(7, 65535);
        a0e.b(5, 16384);
        K0 = a0e;
    }

    public a47(sb0 sb0) {
        this.b = (q37) sb0.f;
        this.c = new LinkedHashMap();
        String str = (String) sb0.b;
        this.o = str;
        this.w = 3;
        fef fef = (fef) sb0.g;
        this.y = fef;
        cef f = fef.f();
        this.z = f;
        this.X = fef.f();
        this.Y = fef.f();
        this.Z = wc8.v;
        a0e a0e = new a0e();
        a0e.b(7, 16777216);
        Unit unit = Unit.INSTANCE;
        this.A0 = a0e;
        a0e a0e2 = K0;
        this.B0 = a0e2;
        this.F0 = (long) a0e2.a();
        this.G0 = (Socket) sb0.c;
        this.H0 = new i47((wu0) sb0.e, true);
        this.I0 = new fb1(this, new d47((xu0) sb0.d, true));
        this.J0 = new LinkedHashSet();
        int i = sb0.a;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
            f.c(new o37(tr1.j(str, " ping"), this, nanos), nanos);
        }
    }

    public final void U(int i, long j) {
        this.z.c(new z37(this.o + '[' + i + "] windowUpdate", this, i, j), 0);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(2:1|2)|5|(2:19|(5:21|22|23|35|24))|26|27|28|29|30|32) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r4, int r5, java.io.IOException r6) {
        /*
            r3 = this;
            byte[] r0 = defpackage.u0g.a
            r3.j(r4)     // Catch:{ IOException -> 0x0005 }
        L_0x0005:
            monitor-enter(r3)
            java.util.LinkedHashMap r4 = r3.c     // Catch:{ all -> 0x0027 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x0027 }
            r4 = r4 ^ 1
            r0 = 0
            if (r4 == 0) goto L_0x0031
            java.util.LinkedHashMap r4 = r3.c     // Catch:{ all -> 0x0027 }
            java.util.Collection r4 = r4.values()     // Catch:{ all -> 0x0027 }
            h47[] r1 = new defpackage.h47[r0]     // Catch:{ all -> 0x0027 }
            java.lang.Object[] r4 = r4.toArray(r1)     // Catch:{ all -> 0x0027 }
            if (r4 == 0) goto L_0x0029
            h47[] r4 = (defpackage.h47[]) r4     // Catch:{ all -> 0x0027 }
            java.util.LinkedHashMap r1 = r3.c     // Catch:{ all -> 0x0027 }
            r1.clear()     // Catch:{ all -> 0x0027 }
            goto L_0x0032
        L_0x0027:
            r4 = move-exception
            goto L_0x005c
        L_0x0029:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ all -> 0x0027 }
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            r4.<init>(r5)     // Catch:{ all -> 0x0027 }
            throw r4     // Catch:{ all -> 0x0027 }
        L_0x0031:
            r4 = 0
        L_0x0032:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0027 }
            monitor-exit(r3)
            if (r4 == 0) goto L_0x0042
            int r1 = r4.length
        L_0x0038:
            if (r0 >= r1) goto L_0x0042
            r2 = r4[r0]
            r2.c(r5, r6)     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            int r0 = r0 + 1
            goto L_0x0038
        L_0x0042:
            i47 r4 = r3.H0     // Catch:{ IOException -> 0x0047 }
            r4.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            java.net.Socket r4 = r3.G0     // Catch:{ IOException -> 0x004c }
            r4.close()     // Catch:{ IOException -> 0x004c }
        L_0x004c:
            cef r4 = r3.z
            r4.e()
            cef r4 = r3.X
            r4.e()
            cef r3 = r3.Y
            r3.e()
            return
        L_0x005c:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a47.a(int, int, java.io.IOException):void");
    }

    public final void b(IOException iOException) {
        a(2, 2, iOException);
    }

    public final void close() {
        a(1, 9, (IOException) null);
    }

    public final synchronized h47 d(int i) {
        return (h47) this.c.get(Integer.valueOf(i));
    }

    public final void flush() {
        this.H0.flush();
    }

    public final synchronized h47 g(int i) {
        h47 h47;
        h47 = (h47) this.c.remove(Integer.valueOf(i));
        notifyAll();
        return h47;
    }

    public final void j(int i) {
        synchronized (this.H0) {
            synchronized (this) {
                if (!this.x) {
                    this.x = true;
                    int i2 = this.v;
                    Unit unit = Unit.INSTANCE;
                    this.H0.g(i2, u0g.a, i);
                }
            }
        }
    }

    public final synchronized void m(long j) {
        long j2 = this.C0 + j;
        this.C0 = j2;
        long j3 = j2 - this.D0;
        if (j3 >= ((long) (this.A0.a() / 2))) {
            U(0, j3);
            this.D0 += j3;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:28|29|30) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.H0.b);
        r6 = (long) r2;
        r8.E0 += r6;
        r4 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0067, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0069, code lost:
        throw r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x005b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(int r9, boolean r10, defpackage.rt0 r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto L_0x000d
            i47 r8 = r8.H0
            r8.b(r10, r9, r11, r3)
            return
        L_0x000d:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x006a
            monitor-enter(r8)
        L_0x0012:
            long r4 = r8.E0     // Catch:{ InterruptedException -> 0x005b }
            long r6 = r8.F0     // Catch:{ InterruptedException -> 0x005b }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x0034
            java.util.LinkedHashMap r2 = r8.c     // Catch:{ InterruptedException -> 0x005b }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x005b }
            boolean r2 = r2.containsKey(r4)     // Catch:{ InterruptedException -> 0x005b }
            if (r2 == 0) goto L_0x002c
            r8.wait()     // Catch:{ InterruptedException -> 0x005b }
            goto L_0x0012
        L_0x002a:
            r9 = move-exception
            goto L_0x0068
        L_0x002c:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ InterruptedException -> 0x005b }
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch:{ InterruptedException -> 0x005b }
            throw r9     // Catch:{ InterruptedException -> 0x005b }
        L_0x0034:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch:{ all -> 0x002a }
            int r2 = (int) r4     // Catch:{ all -> 0x002a }
            i47 r4 = r8.H0     // Catch:{ all -> 0x002a }
            int r4 = r4.b     // Catch:{ all -> 0x002a }
            int r2 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x002a }
            long r4 = r8.E0     // Catch:{ all -> 0x002a }
            long r6 = (long) r2     // Catch:{ all -> 0x002a }
            long r4 = r4 + r6
            r8.E0 = r4     // Catch:{ all -> 0x002a }
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x002a }
            monitor-exit(r8)
            long r12 = r12 - r6
            i47 r4 = r8.H0
            if (r10 == 0) goto L_0x0056
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0056
            r5 = 1
            goto L_0x0057
        L_0x0056:
            r5 = r3
        L_0x0057:
            r4.b(r5, r9, r11, r2)
            goto L_0x000d
        L_0x005b:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x002a }
            r9.interrupt()     // Catch:{ all -> 0x002a }
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x002a }
            r9.<init>()     // Catch:{ all -> 0x002a }
            throw r9     // Catch:{ all -> 0x002a }
        L_0x0068:
            monitor-exit(r8)
            throw r9
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a47.n(int, boolean, rt0, long):void");
    }

    public final void o(int i, int i2) {
        this.z.c(new t37(this.o + '[' + i + "] writeSynReset", i, i2, 1, this), 0);
    }
}
