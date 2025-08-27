package defpackage;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.drm.KeysExpiredException;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* renamed from: je4  reason: default package */
public final class je4 implements zv4 {
    public final List a;
    public final qb5 b;
    public final xe8 c;
    public final xv1 d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final HashMap h;
    public final j04 i;
    public final gga j;
    public final lpb k;
    public final lf6 l;
    public final UUID m;
    public final hy n;
    public int o;
    public int p;
    public HandlerThread q;
    public ge4 r;
    public f44 s;
    public DrmSession$DrmSessionException t;
    public byte[] u;
    public byte[] v;
    public mb5 w;
    public ob5 x;

    public je4(UUID uuid, qb5 qb5, xe8 xe8, xv1 xv1, List list, int i2, boolean z, boolean z2, byte[] bArr, HashMap hashMap, lf6 lf6, Looper looper, gga gga, lpb lpb) {
        if (i2 == 1 || i2 == 3) {
            bArr.getClass();
        }
        this.m = uuid;
        this.c = xe8;
        this.d = xv1;
        this.b = qb5;
        this.e = i2;
        this.f = z;
        this.g = z2;
        if (bArr != null) {
            this.v = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.h = hashMap;
        this.l = lf6;
        this.i = new j04(0);
        this.j = gga;
        this.k = lpb;
        this.o = 2;
        this.n = new hy(this, looper, 2);
    }

    public final UUID a() {
        return this.m;
    }

    public final boolean b() {
        return this.f;
    }

    public final boolean c(String str) {
        byte[] bArr = this.u;
        y64.k(bArr);
        return this.b.f(bArr, str);
    }

    public final DrmSession$DrmSessionException d() {
        if (this.o == 1) {
            return this.t;
        }
        return null;
    }

    public final f44 e() {
        return this.s;
    }

    public final void f(fw4 fw4) {
        int i2 = this.p;
        if (i2 > 0) {
            int i3 = i2 - 1;
            this.p = i3;
            if (i3 == 0) {
                this.o = 0;
                hy hyVar = this.n;
                int i4 = t0g.a;
                hyVar.removeCallbacksAndMessages((Object) null);
                ge4 ge4 = this.r;
                synchronized (ge4) {
                    ge4.removeCallbacksAndMessages((Object) null);
                    ge4.b = true;
                }
                this.r = null;
                this.q.quit();
                this.q = null;
                this.s = null;
                this.t = null;
                this.w = null;
                this.x = null;
                byte[] bArr = this.u;
                if (bArr != null) {
                    this.b.h(bArr);
                    this.u = null;
                }
            }
            if (fw4 != null) {
                j04 j04 = this.i;
                synchronized (j04.b) {
                    try {
                        Integer num = (Integer) j04.c.get(fw4);
                        if (num != null) {
                            ArrayList arrayList = new ArrayList(j04.v);
                            arrayList.remove(fw4);
                            j04.v = Collections.unmodifiableList(arrayList);
                            if (num.intValue() == 1) {
                                j04.c.remove(fw4);
                                HashSet hashSet = new HashSet(j04.o);
                                hashSet.remove(fw4);
                                j04.o = Collections.unmodifiableSet(hashSet);
                            } else {
                                j04.c.put(fw4, Integer.valueOf(num.intValue() - 1));
                            }
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                if (this.i.b(fw4) == 0) {
                    fw4.f();
                }
            }
            xv1 xv1 = this.d;
            int i5 = this.p;
            oe4 oe4 = (oe4) xv1.b;
            if (i5 == 1 && oe4.p > 0 && oe4.l != -9223372036854775807L) {
                oe4.o.add(this);
                Handler handler = oe4.u;
                handler.getClass();
                handler.postAtTime(new ne4(0, this), this, SystemClock.uptimeMillis() + oe4.l);
            } else if (i5 == 0) {
                oe4.m.remove(this);
                if (oe4.r == this) {
                    oe4.r = null;
                }
                if (oe4.s == this) {
                    oe4.s = null;
                }
                xe8 xe8 = oe4.i;
                HashSet hashSet2 = (HashSet) xe8.b;
                hashSet2.remove(this);
                if (((je4) xe8.c) == this) {
                    xe8.c = null;
                    if (!hashSet2.isEmpty()) {
                        je4 je4 = (je4) hashSet2.iterator().next();
                        xe8.c = je4;
                        ob5 c2 = je4.b.c();
                        je4.x = c2;
                        ge4 ge42 = je4.r;
                        int i6 = t0g.a;
                        c2.getClass();
                        ge42.getClass();
                        ge42.obtainMessage(0, new he4(k28.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), c2)).sendToTarget();
                    }
                }
                if (oe4.l != -9223372036854775807L) {
                    Handler handler2 = oe4.u;
                    handler2.getClass();
                    handler2.removeCallbacksAndMessages(this);
                    oe4.o.remove(this);
                }
            }
            oe4.j();
        }
    }

    public final void g(fw4 fw4) {
        boolean z = false;
        if (this.p < 0) {
            this.p = 0;
        }
        if (fw4 != null) {
            j04 j04 = this.i;
            synchronized (j04.b) {
                try {
                    ArrayList arrayList = new ArrayList(j04.v);
                    arrayList.add(fw4);
                    j04.v = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) j04.c.get(fw4);
                    if (num == null) {
                        HashSet hashSet = new HashSet(j04.o);
                        hashSet.add(fw4);
                        j04.o = Collections.unmodifiableSet(hashSet);
                    }
                    j04.c.put(fw4, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        int i2 = this.p + 1;
        this.p = i2;
        if (i2 == 1) {
            if (this.o == 2) {
                z = true;
            }
            y64.j(z);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.q = handlerThread;
            handlerThread.start();
            this.r = new ge4(this, this.q.getLooper(), 0);
            if (l()) {
                h(true);
            }
        } else if (fw4 != null && i() && this.i.b(fw4) == 1) {
            fw4.d(this.o);
        }
        oe4 oe4 = (oe4) this.d.b;
        if (oe4.l != -9223372036854775807L) {
            oe4.o.remove(this);
            Handler handler = oe4.u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    public final int getState() {
        return this.o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0095 A[Catch:{ NumberFormatException -> 0x0099 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(boolean r11) {
        /*
            r10 = this;
            boolean r0 = r10.g
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            byte[] r0 = r10.u
            int r1 = defpackage.t0g.a
            int r1 = r10.e
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x003e
            if (r1 == r2) goto L_0x003e
            if (r1 == r3) goto L_0x0029
            r0 = 3
            if (r1 == r0) goto L_0x0018
            goto L_0x00f3
        L_0x0018:
            byte[] r1 = r10.v
            r1.getClass()
            byte[] r1 = r10.u
            r1.getClass()
            byte[] r1 = r10.v
            r10.m(r0, r1, r11)
            goto L_0x00f3
        L_0x0029:
            byte[] r1 = r10.v
            if (r1 == 0) goto L_0x0039
            qb5 r4 = r10.b     // Catch:{ Exception -> 0x0033 }
            r4.g(r0, r1)     // Catch:{ Exception -> 0x0033 }
            goto L_0x0039
        L_0x0033:
            r11 = move-exception
            r10.j(r11, r2)
            goto L_0x00f3
        L_0x0039:
            r10.m(r3, r0, r11)
            goto L_0x00f3
        L_0x003e:
            byte[] r1 = r10.v
            if (r1 != 0) goto L_0x0047
            r10.m(r2, r0, r11)
            goto L_0x00f3
        L_0x0047:
            int r4 = r10.o
            r5 = 4
            if (r4 == r5) goto L_0x0058
            qb5 r4 = r10.b     // Catch:{ Exception -> 0x0052 }
            r4.g(r0, r1)     // Catch:{ Exception -> 0x0052 }
            goto L_0x0058
        L_0x0052:
            r11 = move-exception
            r10.j(r11, r2)
            goto L_0x00f3
        L_0x0058:
            java.util.UUID r1 = defpackage.ww0.d
            java.util.UUID r2 = r10.m
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0068
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x00b8
        L_0x0068:
            java.util.Map r1 = r10.n()
            if (r1 != 0) goto L_0x0070
            r1 = 0
            goto L_0x00a1
        L_0x0070:
            android.util.Pair r2 = new android.util.Pair
            java.lang.String r4 = "LicenseDurationRemaining"
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.Object r4 = r1.get(r4)     // Catch:{ NumberFormatException -> 0x0086 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ NumberFormatException -> 0x0086 }
            if (r4 == 0) goto L_0x0086
            long r8 = java.lang.Long.parseLong(r4)     // Catch:{ NumberFormatException -> 0x0086 }
            goto L_0x0087
        L_0x0086:
            r8 = r6
        L_0x0087:
            java.lang.Long r4 = java.lang.Long.valueOf(r8)
            java.lang.String r8 = "PlaybackDurationRemaining"
            java.lang.Object r1 = r1.get(r8)     // Catch:{ NumberFormatException -> 0x0099 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x0099 }
            if (r1 == 0) goto L_0x0099
            long r6 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0099 }
        L_0x0099:
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r2.<init>(r4, r1)
            r1 = r2
        L_0x00a1:
            r1.getClass()
            java.lang.Object r2 = r1.first
            java.lang.Long r2 = (java.lang.Long) r2
            long r6 = r2.longValue()
            java.lang.Object r1 = r1.second
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r1 = java.lang.Math.min(r6, r1)
        L_0x00b8:
            int r4 = r10.e
            if (r4 != 0) goto L_0x00c6
            r6 = 60
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 > 0) goto L_0x00c6
            r10.m(r3, r0, r11)
            goto L_0x00f3
        L_0x00c6:
            r6 = 0
            int r11 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r11 > 0) goto L_0x00d5
            com.google.android.exoplayer2.drm.KeysExpiredException r11 = new com.google.android.exoplayer2.drm.KeysExpiredException
            r11.<init>()
            r10.j(r11, r3)
            goto L_0x00f3
        L_0x00d5:
            r10.o = r5
            j04 r10 = r10.i
            java.lang.Object r11 = r10.b
            monitor-enter(r11)
            java.util.Set r10 = r10.o     // Catch:{ all -> 0x00f4 }
            monitor-exit(r11)     // Catch:{ all -> 0x00f4 }
            java.util.Iterator r10 = r10.iterator()
        L_0x00e3:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00f3
            java.lang.Object r11 = r10.next()
            fw4 r11 = (defpackage.fw4) r11
            r11.c()
            goto L_0x00e3
        L_0x00f3:
            return
        L_0x00f4:
            r10 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00f4 }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.je4.h(boolean):void");
    }

    public final boolean i() {
        int i2 = this.o;
        return i2 == 3 || i2 == 4;
    }

    public final void j(Exception exc, int i2) {
        int i3;
        Set<fw4> set;
        int i4 = t0g.a;
        if (i4 < 21 || !rw4.a(exc)) {
            if (i4 < 23 || !tw4.a(exc)) {
                if (i4 < 18 || !qw4.b(exc)) {
                    if (i4 >= 18 && qw4.a(exc)) {
                        i3 = 6007;
                    } else if (exc instanceof UnsupportedDrmException) {
                        i3 = 6001;
                    } else if (exc instanceof DefaultDrmSessionManager$MissingSchemeDataException) {
                        i3 = 6003;
                    } else if (exc instanceof KeysExpiredException) {
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
            i3 = rw4.b(exc);
        }
        this.t = new DrmSession$DrmSessionException(exc, i3);
        iq.a("DRM session error", exc);
        j04 j04 = this.i;
        synchronized (j04.b) {
            set = j04.o;
        }
        for (fw4 e2 : set) {
            e2.e(exc);
        }
        if (this.o != 4) {
            this.o = 1;
        }
    }

    public final void k(Exception exc, boolean z) {
        if (exc instanceof NotProvisionedException) {
            xe8 xe8 = this.c;
            ((HashSet) xe8.b).add(this);
            if (((je4) xe8.c) == null) {
                xe8.c = this;
                ob5 c2 = this.b.c();
                this.x = c2;
                ge4 ge4 = this.r;
                int i2 = t0g.a;
                c2.getClass();
                ge4.getClass();
                ge4.obtainMessage(0, new he4(k28.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), c2)).sendToTarget();
                return;
            }
            return;
        }
        j(exc, z ? 1 : 2);
    }

    public final boolean l() {
        Set<fw4> set;
        if (i()) {
            return true;
        }
        try {
            byte[] e2 = this.b.e();
            this.u = e2;
            this.b.o(e2, this.k);
            this.s = this.b.d(this.u);
            this.o = 3;
            j04 j04 = this.i;
            synchronized (j04.b) {
                set = j04.o;
            }
            for (fw4 d2 : set) {
                d2.d(3);
            }
            this.u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            xe8 xe8 = this.c;
            ((HashSet) xe8.b).add(this);
            if (((je4) xe8.c) == null) {
                xe8.c = this;
                ob5 c2 = this.b.c();
                this.x = c2;
                ge4 ge4 = this.r;
                int i2 = t0g.a;
                c2.getClass();
                ge4.getClass();
                ge4.obtainMessage(0, new he4(k28.h.getAndIncrement(), true, SystemClock.elapsedRealtime(), c2)).sendToTarget();
            }
        } catch (Exception e3) {
            j(e3, 1);
        }
        return false;
    }

    public final void m(int i2, byte[] bArr, boolean z) {
        try {
            mb5 k2 = this.b.k(bArr, this.a, i2, this.h);
            this.w = k2;
            ge4 ge4 = this.r;
            int i3 = t0g.a;
            k2.getClass();
            ge4.getClass();
            ge4.obtainMessage(1, new he4(k28.h.getAndIncrement(), z, SystemClock.elapsedRealtime(), k2)).sendToTarget();
        } catch (Exception e2) {
            k(e2, true);
        }
    }

    public final Map n() {
        byte[] bArr = this.u;
        if (bArr == null) {
            return null;
        }
        return this.b.a(bArr);
    }
}
