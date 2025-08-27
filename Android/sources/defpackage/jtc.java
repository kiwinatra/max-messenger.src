package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: jtc  reason: default package */
public final class jtc implements Cloneable {
    public final boolean A0;
    public boolean X;
    public boolean Y;
    public boolean Z = true;
    public final ntc a;
    public final bk3 b;
    public final g47 c;
    public final AtomicBoolean o = new AtomicBoolean();
    public Object v;
    public volatile boolean v0;
    public t95 w;
    public volatile ce w0;
    public mtc x;
    public volatile mtc x0;
    public boolean y;
    public final rla y0;
    public ce z;
    public final y2d z0;

    public jtc(rla rla, y2d y2d, boolean z2) {
        this.y0 = rla;
        this.z0 = y2d;
        this.A0 = z2;
        this.a = (ntc) rla.b.b;
        this.b = (bk3) rla.v.b;
        g47 g47 = new g47(1, this);
        g47.g((long) rla.F0, TimeUnit.MILLISECONDS);
        Unit unit = Unit.INSTANCE;
        this.c = g47;
    }

    public static final String a(jtc jtc) {
        StringBuilder sb = new StringBuilder();
        sb.append(jtc.v0 ? "canceled " : "");
        sb.append(jtc.A0 ? "web socket" : "call");
        sb.append(" to ");
        sb.append(jtc.z0.b.g());
        return sb.toString();
    }

    public final void b(mtc mtc) {
        byte[] bArr = u0g.a;
        if (this.x == null) {
            this.x = mtc;
            mtc.o.add(new itc(this, this.v));
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final IOException c(IOException iOException) {
        IOException iOException2;
        Socket m;
        byte[] bArr = u0g.a;
        mtc mtc = this.x;
        if (mtc != null) {
            synchronized (mtc) {
                m = m();
            }
            if (this.x == null) {
                if (m != null) {
                    u0g.d(m);
                }
                this.b.getClass();
            } else if (m != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        if (!this.y && this.c.j()) {
            iOException2 = new InterruptedIOException("timeout");
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        } else {
            iOException2 = iOException;
        }
        if (iOException != null) {
            this.b.getClass();
        } else {
            this.b.getClass();
        }
        return iOException2;
    }

    public final Object clone() {
        return new jtc(this.y0, this.z0, this.A0);
    }

    public final void e() {
        Socket socket;
        if (!this.v0) {
            this.v0 = true;
            ce ceVar = this.w0;
            if (ceVar != null) {
                ((s95) ceVar.w).cancel();
            }
            mtc mtc = this.x0;
            if (!(mtc == null || (socket = mtc.b) == null)) {
                u0g.d(socket);
            }
            this.b.getClass();
        }
    }

    public final void f(yn1 yn1) {
        htc htc;
        if (this.o.compareAndSet(false, true)) {
            wnb wnb = wnb.a;
            this.v = wnb.a.g();
            this.b.getClass();
            srd srd = this.y0.a;
            htc htc2 = new htc(this, yn1);
            synchronized (srd) {
                ((ArrayDeque) srd.b).add(htc2);
                if (!this.A0) {
                    String str = this.z0.b.e;
                    Iterator it = ((ArrayDeque) srd.c).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            Iterator it2 = ((ArrayDeque) srd.b).iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    htc = null;
                                    break;
                                }
                                htc = (htc) it2.next();
                                if (Intrinsics.areEqual((Object) htc.c.z0.b.e, (Object) str)) {
                                    break;
                                }
                            }
                        } else {
                            htc = (htc) it.next();
                            if (Intrinsics.areEqual((Object) htc.c.z0.b.e, (Object) str)) {
                                break;
                            }
                        }
                    }
                    if (htc != null) {
                        htc2.a = htc.a;
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
            srd.N();
            return;
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    public final k4d h() {
        if (this.o.compareAndSet(false, true)) {
            this.c.i();
            wnb wnb = wnb.a;
            this.v = wnb.a.g();
            this.b.getClass();
            try {
                srd srd = this.y0.a;
                synchronized (srd) {
                    ((ArrayDeque) srd.o).add(this);
                }
                k4d j = j();
                srd srd2 = this.y0.a;
                srd2.t((ArrayDeque) srd2.o, this);
                return j;
            } catch (Throwable th) {
                srd srd3 = this.y0.a;
                srd3.t((ArrayDeque) srd3.o, this);
                throw th;
            }
        } else {
            throw new IllegalStateException("Already Executed".toString());
        }
    }

    public final void i(boolean z2) {
        ce ceVar;
        synchronized (this) {
            if (this.Z) {
                Unit unit = Unit.INSTANCE;
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z2 && (ceVar = this.w0) != null) {
            ((s95) ceVar.w).cancel();
            ((jtc) ceVar.c).k(ceVar, true, true, (IOException) null);
        }
        this.z = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.k4d j() {
        /*
            r12 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            rla r0 = r12.y0
            java.util.List r0 = r0.c
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r2, r0)
            js0 r0 = new js0
            rla r1 = r12.y0
            r3 = 2
            r0.<init>(r3, r1)
            r2.add(r0)
            js0 r0 = new js0
            rla r1 = r12.y0
            ejd r1 = r1.X
            r3 = 0
            r0.<init>(r3, r1)
            r2.add(r0)
            px0 r0 = new px0
            rla r1 = r12.y0
            r1.getClass()
            r1 = 0
            r0.<init>(r1)
            r2.add(r0)
            px0 r0 = defpackage.px0.b
            r2.add(r0)
            boolean r0 = r12.A0
            if (r0 != 0) goto L_0x0046
            rla r0 = r12.y0
            java.util.List r0 = r0.o
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r2, r0)
        L_0x0046:
            kj1 r0 = new kj1
            boolean r1 = r12.A0
            r0.<init>(r1)
            r2.add(r0)
            otc r9 = new otc
            y2d r10 = r12.z0
            rla r0 = r12.y0
            int r6 = r0.G0
            int r7 = r0.H0
            int r8 = r0.I0
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r12
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            k4d r2 = r9.b(r10)     // Catch:{ IOException -> 0x007f, all -> 0x007d }
            boolean r3 = r12.v0     // Catch:{ IOException -> 0x007f, all -> 0x007d }
            if (r3 != 0) goto L_0x0072
            r12.l(r0)
            return r2
        L_0x0072:
            defpackage.u0g.c(r2)     // Catch:{ IOException -> 0x007f, all -> 0x007d }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x007f, all -> 0x007d }
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch:{ IOException -> 0x007f, all -> 0x007d }
            throw r2     // Catch:{ IOException -> 0x007f, all -> 0x007d }
        L_0x007d:
            r2 = move-exception
            goto L_0x0095
        L_0x007f:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r12.l(r1)     // Catch:{ all -> 0x008f }
            if (r1 != 0) goto L_0x0094
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x008f }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r1.<init>(r3)     // Catch:{ all -> 0x008f }
            throw r1     // Catch:{ all -> 0x008f }
        L_0x008f:
            r1 = move-exception
            r11 = r2
            r2 = r1
            r1 = r11
            goto L_0x0095
        L_0x0094:
            throw r1     // Catch:{ all -> 0x008f }
        L_0x0095:
            if (r1 != 0) goto L_0x009a
            r12.l(r0)
        L_0x009a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jtc.j():k4d");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x001e A[Catch:{ all -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0022 A[Catch:{ all -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002c A[Catch:{ all -> 0x0014 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x002e A[Catch:{ all -> 0x0014 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.IOException k(defpackage.ce r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            ce r0 = r2.w0
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L_0x000b
            return r6
        L_0x000b:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L_0x0016
            boolean r1 = r2.X     // Catch:{ all -> 0x0014 }
            if (r1 != 0) goto L_0x001c
            goto L_0x0016
        L_0x0014:
            r3 = move-exception
            goto L_0x005d
        L_0x0016:
            if (r5 == 0) goto L_0x003d
            boolean r1 = r2.Y     // Catch:{ all -> 0x0014 }
            if (r1 == 0) goto L_0x003d
        L_0x001c:
            if (r4 == 0) goto L_0x0020
            r2.X = r3     // Catch:{ all -> 0x0014 }
        L_0x0020:
            if (r5 == 0) goto L_0x0024
            r2.Y = r3     // Catch:{ all -> 0x0014 }
        L_0x0024:
            boolean r4 = r2.X     // Catch:{ all -> 0x0014 }
            if (r4 != 0) goto L_0x002e
            boolean r5 = r2.Y     // Catch:{ all -> 0x0014 }
            if (r5 != 0) goto L_0x002e
            r5 = r0
            goto L_0x002f
        L_0x002e:
            r5 = r3
        L_0x002f:
            if (r4 != 0) goto L_0x003a
            boolean r4 = r2.Y     // Catch:{ all -> 0x0014 }
            if (r4 != 0) goto L_0x003a
            boolean r4 = r2.Z     // Catch:{ all -> 0x0014 }
            if (r4 != 0) goto L_0x003a
            r3 = r0
        L_0x003a:
            r4 = r3
            r3 = r5
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0014 }
            monitor-exit(r2)
            if (r3 == 0) goto L_0x0055
            r3 = 0
            r2.w0 = r3
            mtc r3 = r2.x
            if (r3 == 0) goto L_0x0055
            monitor-enter(r3)
            int r5 = r3.l     // Catch:{ all -> 0x0052 }
            int r5 = r5 + r0
            r3.l = r5     // Catch:{ all -> 0x0052 }
            monitor-exit(r3)
            goto L_0x0055
        L_0x0052:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0052 }
            throw r2
        L_0x0055:
            if (r4 == 0) goto L_0x005c
            java.io.IOException r2 = r2.c(r6)
            return r2
        L_0x005c:
            return r6
        L_0x005d:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jtc.k(ce, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException l(IOException iOException) {
        boolean z2;
        synchronized (this) {
            try {
                z2 = false;
                if (this.Z) {
                    this.Z = false;
                    if (!this.X && !this.Y) {
                        z2 = true;
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2 ? c(iOException) : iOException;
    }

    public final Socket m() {
        mtc mtc = this.x;
        byte[] bArr = u0g.a;
        ArrayList arrayList = mtc.o;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual((Object) (jtc) ((Reference) it.next()).get(), (Object) this)) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            arrayList.remove(i);
            this.x = null;
            if (arrayList.isEmpty()) {
                mtc.p = System.nanoTime();
                ntc ntc = this.a;
                ntc.getClass();
                byte[] bArr2 = u0g.a;
                boolean z2 = mtc.i;
                cef cef = (cef) ntc.c;
                if (z2 || ntc.b == 0) {
                    mtc.i = true;
                    ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) ntc.e;
                    concurrentLinkedQueue.remove(mtc);
                    if (concurrentLinkedQueue.isEmpty()) {
                        cef.a();
                    }
                    return mtc.c;
                }
                cef.c((y37) ntc.d, 0);
            }
            return null;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
