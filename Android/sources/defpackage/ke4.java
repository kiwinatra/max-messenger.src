package defpackage;

import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.KeysExpiredException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: ke4  reason: default package */
public final class ke4 implements aw4 {
    public final List a;
    public final rb5 b;
    public final ox0 c;
    public final y35 d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap h;
    public final j04 i;
    public final nfd j;
    public final mpb k;
    public final lf6 l;
    public final UUID m;
    public final Looper n;
    public final hy o;
    public int p;
    public int q;
    public HandlerThread r;
    public ge4 s;
    public g44 t;
    public DrmSession$DrmSessionException u;
    public byte[] v;
    public byte[] w;
    public nb5 x;
    public pb5 y;

    public ke4(UUID uuid, rb5 rb5, ox0 ox0, y35 y35, List list, int i2, boolean z, boolean z2, byte[] bArr, HashMap hashMap, lf6 lf6, Looper looper, nfd nfd, mpb mpb) {
        if (i2 == 1 || i2 == 3) {
            bArr.getClass();
        }
        this.m = uuid;
        this.c = ox0;
        this.d = y35;
        this.b = rb5;
        this.e = i2;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.w = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.h = hashMap;
        this.l = lf6;
        this.i = new j04(1);
        this.j = nfd;
        this.k = mpb;
        this.p = 2;
        this.n = looper;
        this.o = new hy(this, looper, 3);
    }

    public final UUID a() {
        p();
        return this.m;
    }

    public final boolean b() {
        p();
        return this.f;
    }

    public final boolean c(String str) {
        p();
        byte[] bArr = this.v;
        n79.o(bArr);
        return this.b.f(bArr, str);
    }

    public final DrmSession$DrmSessionException d() {
        p();
        if (this.p == 1) {
            return this.u;
        }
        return null;
    }

    public final g44 e() {
        p();
        return this.t;
    }

    public final void f(gw4 gw4) {
        p();
        int i2 = this.q;
        if (i2 <= 0) {
            i8b.o("release() called on a session that's already fully released.");
            return;
        }
        int i3 = i2 - 1;
        this.q = i3;
        if (i3 == 0) {
            this.p = 0;
            hy hyVar = this.o;
            int i4 = v0g.a;
            hyVar.removeCallbacksAndMessages((Object) null);
            ge4 ge4 = this.s;
            synchronized (ge4) {
                ge4.removeCallbacksAndMessages((Object) null);
                ge4.b = true;
            }
            this.s = null;
            this.r.quit();
            this.r = null;
            this.t = null;
            this.u = null;
            this.x = null;
            this.y = null;
            byte[] bArr = this.v;
            if (bArr != null) {
                this.b.h(bArr);
                this.v = null;
            }
        }
        if (gw4 != null) {
            j04 j04 = this.i;
            synchronized (j04.b) {
                try {
                    Integer num = (Integer) j04.c.get(gw4);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(j04.v);
                        arrayList.remove(gw4);
                        j04.v = Collections.unmodifiableList(arrayList);
                        if (num.intValue() == 1) {
                            j04.c.remove(gw4);
                            HashSet hashSet = new HashSet(j04.o);
                            hashSet.remove(gw4);
                            j04.o = Collections.unmodifiableSet(hashSet);
                        } else {
                            j04.c.put(gw4, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            if (this.i.b(gw4) == 0) {
                gw4.f();
            }
        }
        y35 y35 = this.d;
        int i5 = this.q;
        pe4 pe4 = (pe4) y35.b;
        if (i5 == 1 && pe4.p > 0 && pe4.l != -9223372036854775807L) {
            pe4.o.add(this);
            Handler handler = pe4.u;
            handler.getClass();
            handler.postAtTime(new ne4(1, this), this, SystemClock.uptimeMillis() + pe4.l);
        } else if (i5 == 0) {
            pe4.m.remove(this);
            if (pe4.r == this) {
                pe4.r = null;
            }
            if (pe4.s == this) {
                pe4.s = null;
            }
            ox0 ox0 = pe4.i;
            HashSet hashSet2 = (HashSet) ox0.c;
            hashSet2.remove(this);
            if (((ke4) ox0.b) == this) {
                ox0.b = null;
                if (!hashSet2.isEmpty()) {
                    ke4 ke4 = (ke4) hashSet2.iterator().next();
                    ox0.b = ke4;
                    pb5 c2 = ke4.b.c();
                    ke4.y = c2;
                    ge4 ge42 = ke4.s;
                    int i6 = v0g.a;
                    c2.getClass();
                    ge42.getClass();
                    ge42.obtainMessage(1, new ie4(l28.c.getAndIncrement(), true, SystemClock.elapsedRealtime(), c2)).sendToTarget();
                }
            }
            if (pe4.l != -9223372036854775807L) {
                Handler handler2 = pe4.u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                pe4.o.remove(this);
            }
        }
        pe4.j();
    }

    public final void g(gw4 gw4) {
        p();
        boolean z = false;
        if (this.q < 0) {
            i8b.o("Session reference count less than zero: " + this.q);
            this.q = 0;
        }
        if (gw4 != null) {
            j04 j04 = this.i;
            synchronized (j04.b) {
                try {
                    ArrayList arrayList = new ArrayList(j04.v);
                    arrayList.add(gw4);
                    j04.v = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) j04.c.get(gw4);
                    if (num == null) {
                        HashSet hashSet = new HashSet(j04.o);
                        hashSet.add(gw4);
                        j04.o = Collections.unmodifiableSet(hashSet);
                    }
                    j04.c.put(gw4, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i2 = this.q + 1;
        this.q = i2;
        if (i2 == 1) {
            if (this.p == 2) {
                z = true;
            }
            n79.n(z);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.r = handlerThread;
            handlerThread.start();
            this.s = new ge4(this, this.r.getLooper(), 1);
            if (l()) {
                h(true);
            }
        } else if (gw4 != null && i() && this.i.b(gw4) == 1) {
            gw4.d(this.p);
        }
        pe4 pe4 = (pe4) this.d.b;
        if (pe4.l != -9223372036854775807L) {
            pe4.o.remove(this);
            Handler handler = pe4.u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    public final int getState() {
        p();
        return this.p;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0089 A[Catch:{ NumberFormatException -> 0x008d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(boolean r11) {
        /*
            r10 = this;
            boolean r0 = r10.g
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            byte[] r0 = r10.v
            int r1 = defpackage.v0g.a
            int r1 = r10.e
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x0038
            if (r1 == r2) goto L_0x0038
            if (r1 == r3) goto L_0x0029
            r0 = 3
            if (r1 == r0) goto L_0x0018
            goto L_0x00f8
        L_0x0018:
            byte[] r1 = r10.w
            r1.getClass()
            byte[] r1 = r10.v
            r1.getClass()
            byte[] r1 = r10.w
            r10.m(r0, r1, r11)
            goto L_0x00f8
        L_0x0029:
            byte[] r1 = r10.w
            if (r1 == 0) goto L_0x0033
            boolean r1 = r10.o()
            if (r1 == 0) goto L_0x00f8
        L_0x0033:
            r10.m(r3, r0, r11)
            goto L_0x00f8
        L_0x0038:
            byte[] r1 = r10.w
            if (r1 != 0) goto L_0x0041
            r10.m(r2, r0, r11)
            goto L_0x00f8
        L_0x0041:
            int r1 = r10.p
            r2 = 4
            if (r1 == r2) goto L_0x004c
            boolean r1 = r10.o()
            if (r1 == 0) goto L_0x00f8
        L_0x004c:
            java.util.UUID r1 = defpackage.zw0.d
            java.util.UUID r4 = r10.m
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x005c
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x00ac
        L_0x005c:
            java.util.Map r1 = r10.n()
            if (r1 != 0) goto L_0x0064
            r1 = 0
            goto L_0x0095
        L_0x0064:
            android.util.Pair r4 = new android.util.Pair
            java.lang.String r5 = "LicenseDurationRemaining"
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.Object r5 = r1.get(r5)     // Catch:{ NumberFormatException -> 0x007a }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ NumberFormatException -> 0x007a }
            if (r5 == 0) goto L_0x007a
            long r8 = java.lang.Long.parseLong(r5)     // Catch:{ NumberFormatException -> 0x007a }
            goto L_0x007b
        L_0x007a:
            r8 = r6
        L_0x007b:
            java.lang.Long r5 = java.lang.Long.valueOf(r8)
            java.lang.String r8 = "PlaybackDurationRemaining"
            java.lang.Object r1 = r1.get(r8)     // Catch:{ NumberFormatException -> 0x008d }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x008d }
            if (r1 == 0) goto L_0x008d
            long r6 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x008d }
        L_0x008d:
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r4.<init>(r5, r1)
            r1 = r4
        L_0x0095:
            r1.getClass()
            java.lang.Object r4 = r1.first
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r6 = r1.longValue()
            long r4 = java.lang.Math.min(r4, r6)
        L_0x00ac:
            int r1 = r10.e
            if (r1 != 0) goto L_0x00cb
            r6 = 60
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x00cb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Offline license has expired or will expire soon. Remaining seconds: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            defpackage.i8b.m(r1)
            r10.m(r3, r0, r11)
            goto L_0x00f8
        L_0x00cb:
            r0 = 0
            int r11 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x00da
            androidx.media3.exoplayer.drm.KeysExpiredException r11 = new androidx.media3.exoplayer.drm.KeysExpiredException
            r11.<init>()
            r10.j(r11, r3)
            goto L_0x00f8
        L_0x00da:
            r10.p = r2
            j04 r10 = r10.i
            java.lang.Object r11 = r10.b
            monitor-enter(r11)
            java.util.Set r10 = r10.o     // Catch:{ all -> 0x00f9 }
            monitor-exit(r11)     // Catch:{ all -> 0x00f9 }
            java.util.Iterator r10 = r10.iterator()
        L_0x00e8:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00f8
            java.lang.Object r11 = r10.next()
            gw4 r11 = (defpackage.gw4) r11
            r11.c()
            goto L_0x00e8
        L_0x00f8:
            return
        L_0x00f9:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00f9 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke4.h(boolean):void");
    }

    public final boolean i() {
        int i2 = this.p;
        return i2 == 3 || i2 == 4;
    }

    public final void j(Throwable th, int i2) {
        int i3;
        Set<gw4> set;
        int i4 = v0g.a;
        if (i4 < 21 || !sw4.a(th)) {
            if (i4 < 23 || !uw4.a(th)) {
                if (!(th instanceof NotProvisionedException) && !cvg.B(th)) {
                    if (th instanceof DeniedByServerException) {
                        i3 = 6007;
                    } else if (th instanceof UnsupportedDrmException) {
                        i3 = 6001;
                    } else if (th instanceof DefaultDrmSessionManager$MissingSchemeDataException) {
                        i3 = 6003;
                    } else if (th instanceof KeysExpiredException) {
                        i3 = 6008;
                    } else if (i2 != 1) {
                        if (i2 == 2) {
                            i3 = 6004;
                        } else if (i2 != 3) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i3 = 6002;
            }
            i3 = 6006;
        } else {
            i3 = sw4.b(th);
        }
        this.u = new DrmSession$DrmSessionException(th, i3);
        i8b.p("DRM session error", th);
        if (th instanceof Exception) {
            j04 j04 = this.i;
            synchronized (j04.b) {
                set = j04.o;
            }
            for (gw4 e2 : set) {
                e2.e((Exception) th);
            }
        } else if (!(th instanceof Error)) {
            throw new IllegalStateException("Unexpected Throwable subclass", th);
        } else if (!cvg.C(th) && !cvg.B(th)) {
            throw ((Error) th);
        }
        if (this.p != 4) {
            this.p = 1;
        }
    }

    public final void k(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || cvg.B(th)) {
            this.c.D(this);
        } else {
            j(th, z ? 1 : 2);
        }
    }

    public final boolean l() {
        Set<gw4> set;
        if (i()) {
            return true;
        }
        try {
            byte[] e2 = this.b.e();
            this.v = e2;
            this.b.p(e2, this.k);
            this.t = this.b.d(this.v);
            this.p = 3;
            j04 j04 = this.i;
            synchronized (j04.b) {
                set = j04.o;
            }
            for (gw4 d2 : set) {
                d2.d(3);
            }
            this.v.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.c.D(this);
            return false;
        } catch (Exception | NoSuchMethodError e3) {
            if (cvg.B(e3)) {
                this.c.D(this);
                return false;
            }
            j(e3, 1);
            return false;
        }
    }

    public final void m(int i2, byte[] bArr, boolean z) {
        try {
            nb5 k2 = this.b.k(bArr, this.a, i2, this.h);
            this.x = k2;
            ge4 ge4 = this.s;
            int i3 = v0g.a;
            k2.getClass();
            ge4.getClass();
            ge4.obtainMessage(2, new ie4(l28.c.getAndIncrement(), z, SystemClock.elapsedRealtime(), k2)).sendToTarget();
        } catch (Exception | NoSuchMethodError e2) {
            k(e2, true);
        }
    }

    public final Map n() {
        p();
        byte[] bArr = this.v;
        if (bArr == null) {
            return null;
        }
        return this.b.a(bArr);
    }

    public final boolean o() {
        try {
            this.b.g(this.v, this.w);
            return true;
        } catch (Exception | NoSuchMethodError e2) {
            j(e2, 1);
            return false;
        }
    }

    public final void p() {
        Thread currentThread = Thread.currentThread();
        Looper looper = this.n;
        if (currentThread != looper.getThread()) {
            i8b.W("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
