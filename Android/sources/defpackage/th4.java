package defpackage;

import android.content.Context;
import android.net.TrafficStats;
import java.net.Socket;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: th4  reason: default package */
public final class th4 implements r23 {
    public final fn4 a;
    public final rh3 b;
    public final jtb c;
    public final AtomicBoolean d = new AtomicBoolean();
    public final LinkedHashMap e;
    public final LinkedHashSet f;
    public final ni3 g;
    public final lfd h;
    public final cm i;
    public final die j;
    public volatile Iterator k;
    public volatile s9c l;
    public final List m;
    public eh3 n;

    public th4(Context context, rh3 rh3, jtb jtb, fn4 fn4, g51 g51, ni3 ni3, lfd lfd, cm cmVar, die die) {
        new AtomicBoolean();
        this.e = new LinkedHashMap();
        this.f = new LinkedHashSet();
        this.n = new eh3(false);
        this.b = rh3;
        this.c = jtb;
        this.a = fn4;
        this.g = ni3;
        this.h = lfd;
        this.i = cmVar;
        this.j = die;
        fz7 fz7 = (fz7) cmVar;
        this.m = Collections.singletonList(new ph3(fz7.c, fz7.d));
        int i2 = s9c.l;
    }

    public final ni3 a() {
        return this.g;
    }

    public final void b(Socket socket) {
        if (socket != null) {
            TrafficStats.untagSocket(socket);
        }
    }

    public final int c() {
        if (this.l != null) {
            return this.l.c();
        }
        return -1;
    }

    public final void close() {
        z68.a("th4", "close request");
        k((s9c) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c A[SYNTHETIC, Splitter:B:27:0x008c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.net.Socket connect() {
        /*
            r11 = this;
            r0 = 1
            java.lang.String r1 = "th4"
            java.lang.String r2 = "connect request"
            defpackage.z68.c(r1, r2, new java.lang.Object[0])
            eh3 r1 = new eh3
            r1.<init>(r0)
            r11.n = r1
            r11.close()
            rh3 r1 = r11.b
            boolean r1 = r1.e()
            r2 = 0
            if (r1 == 0) goto L_0x0025
            java.util.concurrent.atomic.AtomicBoolean r1 = r11.d
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x0025
            r1 = r0
            goto L_0x0026
        L_0x0025:
            r1 = r2
        L_0x0026:
            r3 = 0
            if (r1 != 0) goto L_0x0032
            java.lang.String r0 = "th4"
            java.lang.String r1 = "should not connect, breaking"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            goto L_0x01ef
        L_0x0032:
            monitor-enter(r11)
            java.lang.String r1 = "hosts updated: "
            java.lang.String r4 = "th4"
            java.lang.String r5 = "update hosts"
            defpackage.z68.c(r4, r5, new java.lang.Object[0])     // Catch:{ all -> 0x010c }
            java.util.LinkedHashSet r4 = r11.f     // Catch:{ all -> 0x010c }
            monitor-enter(r4)     // Catch:{ all -> 0x010c }
            java.util.LinkedHashSet r5 = r11.f     // Catch:{ all -> 0x0056 }
            r5.clear()     // Catch:{ all -> 0x0056 }
            jtb r5 = r11.c     // Catch:{ all -> 0x0056 }
            ltb r5 = (defpackage.ltb) r5     // Catch:{ all -> 0x0056 }
            a33 r5 = r5.a     // Catch:{ all -> 0x0056 }
            ph3 r5 = defpackage.b59.s(r5)     // Catch:{ all -> 0x0056 }
            if (r5 == 0) goto L_0x0059
            java.util.LinkedHashSet r6 = r11.f     // Catch:{ all -> 0x0056 }
            r6.add(r5)     // Catch:{ all -> 0x0056 }
            goto L_0x0059
        L_0x0056:
            r0 = move-exception
            goto L_0x0223
        L_0x0059:
            fn4 r5 = r11.a     // Catch:{ all -> 0x0056 }
            r5.e()     // Catch:{ all -> 0x0056 }
            java.util.LinkedHashSet r5 = r11.f     // Catch:{ all -> 0x0056 }
            java.util.List r6 = r11.m     // Catch:{ all -> 0x0056 }
            java.lang.Object r6 = r6.get(r2)     // Catch:{ all -> 0x0056 }
            ph3 r6 = (defpackage.ph3) r6     // Catch:{ all -> 0x0056 }
            r5.add(r6)     // Catch:{ all -> 0x0056 }
            jtb r5 = r11.c     // Catch:{ all -> 0x0056 }
            ltb r5 = (defpackage.ltb) r5     // Catch:{ all -> 0x0056 }
            a33 r5 = r5.a     // Catch:{ all -> 0x0056 }
            ls7 r5 = r5.g     // Catch:{ all -> 0x0056 }
            java.lang.String r6 = "app.lastSuccessProxy"
            java.lang.String r5 = r5.getString(r6, r3)     // Catch:{ all -> 0x0056 }
            boolean r6 = defpackage.cvg.A(r5)     // Catch:{ all -> 0x0056 }
            if (r6 != 0) goto L_0x0089
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0089 }
            r6.<init>((java.lang.String) r5)     // Catch:{ JSONException -> 0x0089 }
            ph3 r5 = defpackage.ph3.a(r6)     // Catch:{ JSONException -> 0x0089 }
            goto L_0x008a
        L_0x0089:
            r5 = r3
        L_0x008a:
            if (r5 == 0) goto L_0x0091
            java.util.LinkedHashSet r6 = r11.f     // Catch:{ all -> 0x0056 }
            r6.add(r5)     // Catch:{ all -> 0x0056 }
        L_0x0091:
            java.util.LinkedHashSet r5 = r11.f     // Catch:{ all -> 0x0056 }
            jtb r6 = r11.c     // Catch:{ all -> 0x0056 }
            ltb r6 = (defpackage.ltb) r6     // Catch:{ all -> 0x0056 }
            a33 r6 = r6.a     // Catch:{ all -> 0x0056 }
            defpackage.b59.e(r5, r6)     // Catch:{ all -> 0x0056 }
            jtb r5 = r11.c     // Catch:{ all -> 0x0056 }
            ltb r5 = (defpackage.ltb) r5     // Catch:{ all -> 0x0056 }
            a33 r5 = r5.a     // Catch:{ all -> 0x0056 }
            java.util.List r5 = defpackage.b59.B(r5)     // Catch:{ all -> 0x0056 }
            if (r5 == 0) goto L_0x00b3
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x0056 }
            if (r6 != 0) goto L_0x00b3
            java.util.LinkedHashSet r6 = r11.f     // Catch:{ all -> 0x0056 }
            r6.addAll(r5)     // Catch:{ all -> 0x0056 }
        L_0x00b3:
            java.util.LinkedHashSet r5 = r11.f     // Catch:{ all -> 0x0056 }
            java.util.List r6 = r11.m     // Catch:{ all -> 0x0056 }
            r5.addAll(r6)     // Catch:{ all -> 0x0056 }
            java.util.LinkedHashSet r5 = r11.f     // Catch:{ all -> 0x0056 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0056 }
            r11.k = r5     // Catch:{ all -> 0x0056 }
            java.lang.String r5 = "th4"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0056 }
            r6.<init>(r1)     // Catch:{ all -> 0x0056 }
            java.util.LinkedHashSet r1 = r11.f     // Catch:{ all -> 0x0056 }
            int r1 = r1.size()     // Catch:{ all -> 0x0056 }
            r6.append(r1)     // Catch:{ all -> 0x0056 }
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0056 }
            defpackage.z68.c(r5, r1, new java.lang.Object[0])     // Catch:{ all -> 0x0056 }
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
        L_0x00da:
            java.util.LinkedHashSet r1 = r11.f     // Catch:{ all -> 0x010c }
            monitor-enter(r1)     // Catch:{ all -> 0x010c }
            java.util.Iterator r4 = r11.k     // Catch:{ all -> 0x0220 }
            boolean r4 = r4.hasNext()     // Catch:{ all -> 0x0220 }
            monitor-exit(r1)     // Catch:{ all -> 0x0220 }
            if (r4 == 0) goto L_0x01e7
            java.lang.String r1 = "th4"
            java.lang.String r4 = "iterate connectClient: hasMoreProxies"
            defpackage.z68.c(r1, r4, new java.lang.Object[0])     // Catch:{ all -> 0x010c }
            rh3 r1 = r11.b     // Catch:{ all -> 0x010c }
            boolean r1 = r1.e()     // Catch:{ all -> 0x010c }
            if (r1 == 0) goto L_0x00ff
            java.util.concurrent.atomic.AtomicBoolean r1 = r11.d     // Catch:{ all -> 0x010c }
            boolean r1 = r1.get()     // Catch:{ all -> 0x010c }
            if (r1 == 0) goto L_0x00ff
            r1 = r0
            goto L_0x0100
        L_0x00ff:
            r1 = r2
        L_0x0100:
            if (r1 != 0) goto L_0x010f
            java.lang.String r0 = "th4"
            java.lang.String r1 = "should not connect, breaking"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])     // Catch:{ all -> 0x010c }
            monitor-exit(r11)     // Catch:{ all -> 0x010c }
            goto L_0x01ef
        L_0x010c:
            r0 = move-exception
            goto L_0x0225
        L_0x010f:
            rh3 r1 = r11.b     // Catch:{ all -> 0x010c }
            mi3 r1 = r1.b()     // Catch:{ all -> 0x010c }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x010c }
            r4 = 4
            if (r1 == r0) goto L_0x0121
            if (r1 == r4) goto L_0x0121
            r1 = 15000(0x3a98, float:2.102E-41)
            goto L_0x0123
        L_0x0121:
            r1 = 10000(0x2710, float:1.4013E-41)
        L_0x0123:
            rh3 r5 = r11.b     // Catch:{ all -> 0x010c }
            mi3 r5 = r5.b()     // Catch:{ all -> 0x010c }
            int r5 = r5.ordinal()     // Catch:{ all -> 0x010c }
            if (r5 == r0) goto L_0x0134
            if (r5 == r4) goto L_0x0134
            r4 = 3000(0xbb8, float:4.204E-42)
            goto L_0x0136
        L_0x0134:
            r4 = 1500(0x5dc, float:2.102E-42)
        L_0x0136:
            java.util.LinkedHashSet r5 = r11.f     // Catch:{ all -> 0x010c }
            monitor-enter(r5)     // Catch:{ all -> 0x010c }
            r6 = r2
        L_0x013a:
            r7 = 3
            if (r6 >= r7) goto L_0x0178
            java.util.Iterator r7 = r11.k     // Catch:{ all -> 0x0174 }
            boolean r7 = r7.hasNext()     // Catch:{ all -> 0x0174 }
            if (r7 != 0) goto L_0x0146
            goto L_0x0178
        L_0x0146:
            java.util.Iterator r7 = r11.k     // Catch:{ all -> 0x0174 }
            java.lang.Object r7 = r7.next()     // Catch:{ all -> 0x0174 }
            ph3 r7 = (defpackage.ph3) r7     // Catch:{ all -> 0x0174 }
            java.lang.String r8 = "th4"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0174 }
            r9.<init>()     // Catch:{ all -> 0x0174 }
            java.lang.String r10 = "step 2 "
            r9.append(r10)     // Catch:{ all -> 0x0174 }
            r9.append(r7)     // Catch:{ all -> 0x0174 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x0174 }
            defpackage.z68.c(r8, r9, new java.lang.Object[0])     // Catch:{ all -> 0x0174 }
            java.util.LinkedHashMap r8 = r11.e     // Catch:{ all -> 0x0174 }
            boolean r8 = r8.containsKey(r7)     // Catch:{ all -> 0x0174 }
            if (r8 != 0) goto L_0x0176
            int r8 = r4 * r6
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0174 }
            r11.m(r7, r1, r8, r9)     // Catch:{ all -> 0x0174 }
            goto L_0x0176
        L_0x0174:
            r0 = move-exception
            goto L_0x01e5
        L_0x0176:
            int r6 = r6 + r0
            goto L_0x013a
        L_0x0178:
            monitor-exit(r5)     // Catch:{ all -> 0x0174 }
            s9c r1 = r11.l()     // Catch:{ all -> 0x010c }
            if (r1 != 0) goto L_0x0188
            java.lang.String r1 = "th4"
            java.lang.String r4 = "continue looking for available hosts"
            defpackage.z68.c(r1, r4, new java.lang.Object[0])     // Catch:{ all -> 0x010c }
            goto L_0x00da
        L_0x0188:
            eh3 r0 = r11.n     // Catch:{ all -> 0x010c }
            r0.getClass()     // Catch:{ all -> 0x010c }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x010c }
            r0.b = r2     // Catch:{ all -> 0x010c }
            eh3 r0 = r11.n     // Catch:{ all -> 0x010c }
            eh3 r2 = r1.h     // Catch:{ all -> 0x010c }
            r0.getClass()     // Catch:{ all -> 0x010c }
            long r3 = r2.d     // Catch:{ all -> 0x010c }
            r0.d = r3     // Catch:{ all -> 0x010c }
            long r3 = r2.e     // Catch:{ all -> 0x010c }
            r0.e = r3     // Catch:{ all -> 0x010c }
            long r3 = r2.f     // Catch:{ all -> 0x010c }
            r0.f = r3     // Catch:{ all -> 0x010c }
            java.lang.String r3 = r2.g     // Catch:{ all -> 0x010c }
            r0.g = r3     // Catch:{ all -> 0x010c }
            int r3 = r2.h     // Catch:{ all -> 0x010c }
            r0.h = r3     // Catch:{ all -> 0x010c }
            int r2 = r2.c     // Catch:{ all -> 0x010c }
            r0.c = r2     // Catch:{ all -> 0x010c }
            jtb r0 = r11.c     // Catch:{ all -> 0x010c }
            ltb r0 = (defpackage.ltb) r0     // Catch:{ all -> 0x010c }
            a33 r0 = r0.a     // Catch:{ all -> 0x010c }
            ph3 r2 = r1.j     // Catch:{ all -> 0x010c }
            int r3 = defpackage.b59.v     // Catch:{ all -> 0x010c }
            org.json.JSONObject r2 = r2.b()     // Catch:{ all -> 0x010c }
            if (r2 == 0) goto L_0x01d1
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x010c }
            boolean r3 = defpackage.cvg.A(r2)     // Catch:{ all -> 0x010c }
            if (r3 != 0) goto L_0x01d1
            java.lang.String r3 = "app.lastSuccessProxy"
            r0.l(r3, r2)     // Catch:{ all -> 0x010c }
        L_0x01d1:
            java.lang.String r0 = "th4"
            java.lang.String r2 = "connected to %s"
            ph3 r3 = r1.j     // Catch:{ all -> 0x010c }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x010c }
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch:{ all -> 0x010c }
            defpackage.z68.c(r0, r2, r3)     // Catch:{ all -> 0x010c }
            monitor-exit(r11)     // Catch:{ all -> 0x010c }
            r3 = r1
            goto L_0x01ef
        L_0x01e5:
            monitor-exit(r5)     // Catch:{ all -> 0x0174 }
            throw r0     // Catch:{ all -> 0x010c }
        L_0x01e7:
            monitor-exit(r11)     // Catch:{ all -> 0x010c }
            java.lang.String r0 = "th4"
            java.lang.String r1 = "connection failed"
            defpackage.z68.f(r0, r1, r3)
        L_0x01ef:
            r11.l = r3
            s9c r0 = r11.l
            if (r0 == 0) goto L_0x020a
            s9c r0 = r11.l
            java.net.Socket r0 = r0.e
            if (r0 == 0) goto L_0x020a
            s9c r0 = r11.l
            java.net.Socket r0 = r0.e
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x020a
            s9c r11 = r11.l
            java.net.Socket r11 = r11.e
            return r11
        L_0x020a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "host connection failed "
            r1.<init>(r2)
            s9c r11 = r11.l
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            r0.<init>(r11)
            throw r0
        L_0x0220:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0220 }
            throw r0     // Catch:{ all -> 0x010c }
        L_0x0223:
            monitor-exit(r4)     // Catch:{ all -> 0x0056 }
            throw r0     // Catch:{ all -> 0x010c }
        L_0x0225:
            monitor-exit(r11)     // Catch:{ all -> 0x010c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.th4.connect():java.net.Socket");
    }

    public final boolean d() {
        return true;
    }

    public final void f(boolean z) {
        this.d.set(z);
    }

    public final long g(int i2) {
        return xi0.n(i2, this.a.d());
    }

    public final String h() {
        return this.l != null ? this.l.j.a : "unresolved";
    }

    public final eh3 j() {
        return this.n;
    }

    public final void k(s9c s9c) {
        z68.c("th4", "cancel tasks".concat(s9c != null ? a81.m(", except ", s9c.j.toString()) : ""), new Object[0]);
        synchronized (this.f) {
            try {
                for (Map.Entry entry : this.e.entrySet()) {
                    if (s9c == null) {
                        ((Future) entry.getValue()).cancel(true);
                    } else if (!((ph3) entry.getKey()).equals(s9c.j)) {
                        ((Future) entry.getValue()).cancel(true);
                    }
                }
            } finally {
            }
        }
    }

    public final s9c l() {
        s9c s9c;
        Iterator it = this.e.values().iterator();
        while (true) {
            s9c = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                s9c s9c2 = (s9c) ((Future) it.next()).get();
                if (!(s9c2 == null || s9c2.e == null)) {
                    s9c = s9c2;
                    break;
                }
            } catch (CancellationException e2) {
                String obj = e2.toString();
                z68.c("th4", "skip cancelled task, error: " + obj, new Object[0]);
            } catch (Exception e3) {
                String obj2 = e3.toString();
                z68.f("th4", "execution error: " + obj2, (Throwable) null);
                z68.c("th4", "connection error", new Object[0]);
                int i2 = s9c.l;
            }
        }
        synchronized (this.f) {
            this.e.clear();
        }
        return s9c;
    }

    public final void m(ph3 ph3, int i2, int i3, TimeUnit timeUnit) {
        z68.c("th4", "schedule connection: delay = %d host = %s", Integer.valueOf(i3), ph3.toString());
        ph3 ph32 = ph3;
        int i4 = i2;
        s9c s9c = new s9c(ph32, this.a, this.b, i4, this.g, this.i, this.j);
        mka mka = new mka(1, new ib4(7, this, s9c));
        lfd lfd = this.h;
        hb3 hb3 = new hb3(4, new tbe(mka.n(lfd), new rt3(14, (Object) this), 3), new p00(4, this, s9c));
        ala A = jha.A((long) i3, timeUnit, lfd);
        pj6 pj6 = new pj6();
        Objects.requireNonNull(pj6, "observer is null");
        try {
            A.a(new rbe(pj6, hb3));
            ph3 ph33 = ph3;
            this.e.put(ph3, pj6);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            hd8.Z(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }
}
