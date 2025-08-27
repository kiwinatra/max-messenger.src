package defpackage;

import androidx.media3.common.PlaybackException;
import java.util.Iterator;
import kotlin.Unit;

/* renamed from: hy9  reason: default package */
public final class hy9 implements sob {
    public final /* synthetic */ xy9 a;

    public hy9(xy9 xy9) {
        this.a = xy9;
    }

    public final void H(int i, ir8 ir8) {
        ir8 C0;
        long l = this.a.l();
        jr8 m = this.a.m();
        xy9 xy9 = this.a;
        xy9.D = ir8;
        qo8 qo8 = xy9.o;
        xy9.z = qo8 != null ? qo8.a() : false;
        xy9 xy92 = this.a;
        qo8 qo82 = xy92.o;
        xy92.F = (qo82 == null || (C0 = qo82.C0()) == null) ? null : C0.d;
        xy9 xy93 = this.a;
        qo8 qo83 = xy93.o;
        int i2 = -1;
        xy93.E = xy9.d(xy93, qo83 != null ? qo83.B0() : -1);
        xy9 xy94 = this.a;
        qo8 qo84 = xy94.o;
        if (qo84 != null) {
            i2 = qo84.D0();
        }
        xy9.d(xy94, i2);
        qo8 qo85 = this.a.o;
        if (qo85 != null) {
            qo85.G0();
        }
        xy9 xy95 = this.a;
        z68.c("xy9", "notifyListeners", new Object[0]);
        synchronized (xy95.q) {
            try {
                Iterator it = xy95.q.iterator();
                while (it.hasNext()) {
                    ((gy9) it.next()).d(l, m, xy95.l(), xy95.m());
                    Unit unit = Unit.INSTANCE;
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Y(vob vob, qob qob) {
        float b = vob.b();
        xy9 xy9 = this.a;
        qo8 qo8 = xy9.o;
        if (qo8 != null) {
            qo8.g(b);
        }
        xy9.G = vob.e();
        vob.k();
        xq5 xq5 = qob.a;
        if (xq5.a.get(9)) {
            vob.q0();
        }
        if (xq5.a.get(8)) {
            vob.getRepeatMode();
        }
    }

    public final void b0(us8 us8) {
        xy9 xy9 = this.a;
        xy9.F = us8;
        int i = xy9.N;
        z68.c("xy9", "notifyListeners", new Object[0]);
        synchronized (xy9.q) {
            try {
                Iterator it = xy9.q.iterator();
                while (it.hasNext()) {
                    ((gy9) it.next()).getClass();
                    Unit unit = Unit.INSTANCE;
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(int i) {
        ir8 C0;
        int i2 = xy9.N;
        z68.c("xy9", "onPlaybackStateChanged " + i, new Object[0]);
        xy9 xy9 = this.a;
        xy9.x = i;
        qo8 qo8 = xy9.o;
        xy9.A = qo8 != null && qo8.getPlaybackState() == 2;
        xy9 xy92 = this.a;
        qo8 qo82 = xy92.o;
        xy92.z = qo82 != null ? qo82.a() : false;
        xy9 xy93 = this.a;
        qo8 qo83 = xy93.o;
        xy93.C = qo83 != null && qo83.getPlaybackState() == 4;
        xy9 xy94 = this.a;
        qo8 qo84 = xy94.o;
        xy94.D = qo84 != null ? qo84.C0() : null;
        xy9 xy95 = this.a;
        qo8 qo85 = xy95.o;
        xy95.F = (qo85 == null || (C0 = qo85.C0()) == null) ? null : C0.d;
        if (i == 1) {
            xme xme = this.a.J;
            Float valueOf = Float.valueOf(c44.DEFAULT_ASPECT_RATIO);
            xme.getClass();
            xme.m((Object) null, valueOf);
            xy9 xy96 = this.a;
            xy96.y = false;
            xy96.f();
            xy9 xy97 = this.a;
            z68.c("xy9", "notifyListeners", new Object[0]);
            synchronized (xy97.q) {
                try {
                    Iterator it = xy97.q.iterator();
                    while (it.hasNext()) {
                        ((gy9) it.next()).g(xy97.l(), xy97.m(), xy97.o());
                        Unit unit = Unit.INSTANCE;
                    }
                    Unit unit2 = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (i == 2) {
            xy9 xy98 = this.a;
            z68.c("xy9", "notifyListeners", new Object[0]);
            synchronized (xy98.q) {
                try {
                    Iterator it2 = xy98.q.iterator();
                    while (it2.hasNext()) {
                        ((gy9) it2.next()).f(xy98.l(), xy98.m());
                        Unit unit3 = Unit.INSTANCE;
                    }
                    Unit unit4 = Unit.INSTANCE;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (i == 4) {
            this.a.f();
            xy9 xy99 = this.a;
            z68.c("xy9", "notifyListeners", new Object[0]);
            synchronized (xy99.q) {
                try {
                    Iterator it3 = xy99.q.iterator();
                    while (it3.hasNext()) {
                        xme xme2 = xy99.J;
                        Float valueOf2 = Float.valueOf(1.0f);
                        xme2.getClass();
                        xme2.m((Object) null, valueOf2);
                        ((gy9) it3.next()).i(xy99.l(), xy99.m());
                        Unit unit5 = Unit.INSTANCE;
                    }
                    Unit unit6 = Unit.INSTANCE;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0019, code lost:
        r1 = r0.o;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n(boolean r6) {
        /*
            r5 = this;
            int r0 = defpackage.xy9.N
            java.lang.String r0 = "xy9"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "onIsPlayingChanged "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            xy9 r0 = r5.a
            if (r6 != 0) goto L_0x0026
            qo8 r1 = r0.o
            if (r1 == 0) goto L_0x0026
            int r1 = r1.getPlaybackState()
            r2 = 3
            if (r1 != r2) goto L_0x0026
            r1 = 1
            goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            r0.y = r1
            xy9 r0 = r5.a
            qo8 r0 = r0.o
            if (r0 == 0) goto L_0x0032
            r0.G0()
        L_0x0032:
            xy9 r0 = r5.a
            r0.z = r6
            if (r6 == 0) goto L_0x006f
            r0.x()
            xy9 r5 = r5.a
            java.lang.String r6 = "xy9"
            java.lang.String r0 = "notifyListeners"
            defpackage.z68.c(r6, r0, new java.lang.Object[0])
            java.util.concurrent.CopyOnWriteArraySet r6 = r5.q
            monitor-enter(r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = r5.q     // Catch:{ all -> 0x0067 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0067 }
        L_0x004d:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0067 }
            if (r1 == 0) goto L_0x0069
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0067 }
            gy9 r1 = (defpackage.gy9) r1     // Catch:{ all -> 0x0067 }
            long r2 = r5.l()     // Catch:{ all -> 0x0067 }
            jr8 r4 = r5.m()     // Catch:{ all -> 0x0067 }
            r1.l(r2, r4)     // Catch:{ all -> 0x0067 }
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0067 }
            goto L_0x004d
        L_0x0067:
            r5 = move-exception
            goto L_0x006d
        L_0x0069:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0067 }
            monitor-exit(r6)
            goto L_0x00aa
        L_0x006d:
            monitor-exit(r6)
            throw r5
        L_0x006f:
            boolean r6 = r0.y
            if (r6 == 0) goto L_0x00aa
            r0.f()
            xy9 r5 = r5.a
            java.lang.String r6 = "xy9"
            java.lang.String r0 = "notifyListeners"
            defpackage.z68.c(r6, r0, new java.lang.Object[0])
            java.util.concurrent.CopyOnWriteArraySet r6 = r5.q
            monitor-enter(r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = r5.q     // Catch:{ all -> 0x00a2 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00a2 }
        L_0x0088:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x00a2 }
            if (r1 == 0) goto L_0x00a4
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x00a2 }
            gy9 r1 = (defpackage.gy9) r1     // Catch:{ all -> 0x00a2 }
            long r2 = r5.l()     // Catch:{ all -> 0x00a2 }
            jr8 r4 = r5.m()     // Catch:{ all -> 0x00a2 }
            r1.m(r2, r4)     // Catch:{ all -> 0x00a2 }
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00a2 }
            goto L_0x0088
        L_0x00a2:
            r5 = move-exception
            goto L_0x00a8
        L_0x00a4:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00a2 }
            monitor-exit(r6)
            goto L_0x00aa
        L_0x00a8:
            monitor-exit(r6)
            throw r5
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy9.n(boolean):void");
    }

    public final void o0(gob gob) {
        float f = gob.a;
        xy9 xy9 = this.a;
        if (!(f == xy9.H)) {
            xy9.H = f;
            int i = xy9.N;
            z68.c("xy9", "notifyListeners", new Object[0]);
            synchronized (xy9.q) {
                try {
                    Iterator it = xy9.q.iterator();
                    while (it.hasNext()) {
                        ((gy9) it.next()).j();
                        Unit unit = Unit.INSTANCE;
                    }
                    Unit unit2 = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void onRepeatModeChanged(int i) {
        xy9 xy9 = this.a;
        int i2 = xy9.N;
        z68.c("xy9", "notifyListeners", new Object[0]);
        synchronized (xy9.q) {
            try {
                Iterator it = xy9.q.iterator();
                while (it.hasNext()) {
                    ((gy9) it.next()).getClass();
                    Unit unit = Unit.INSTANCE;
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r5 = kotlin.text.StringsKt.toLongOrNull((r5 = r5.a));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(defpackage.uob r4, defpackage.uob r5, int r6) {
        /*
            r3 = this;
            r0 = 1
            if (r6 != r0) goto L_0x00b1
            int r6 = r4.b
            int r5 = r5.b
            if (r6 == r5) goto L_0x00b1
            ir8 r5 = r4.c
            if (r5 == 0) goto L_0x001c
            java.lang.String r5 = r5.a
            if (r5 == 0) goto L_0x001c
            java.lang.Long r5 = kotlin.text.StringsKt.toLongOrNull(r5)
            if (r5 == 0) goto L_0x001c
            long r5 = r5.longValue()
            goto L_0x001e
        L_0x001c:
            r5 = -1
        L_0x001e:
            pf6 r0 = defpackage.jr8.a
            ir8 r1 = r4.c
            if (r1 == 0) goto L_0x0031
            us8 r1 = r1.d
            if (r1 == 0) goto L_0x0031
            java.lang.Integer r1 = r1.H
            if (r1 == 0) goto L_0x0031
            int r1 = r1.intValue()
            goto L_0x0032
        L_0x0031:
            r1 = -1
        L_0x0032:
            r0.getClass()
            jr8 r0 = defpackage.pf6.h(r1)
            xy9 r1 = r3.a
            qo8 r1 = r1.o
            if (r1 == 0) goto L_0x0075
            int r2 = r4.b
            int r1 = r1.D0()
            if (r2 != r1) goto L_0x0075
            xy9 r3 = r3.a
            int r4 = defpackage.xy9.N
            java.lang.String r4 = "xy9"
            java.lang.String r1 = "notifyListeners"
            defpackage.z68.c(r4, r1, new java.lang.Object[0])
            java.util.concurrent.CopyOnWriteArraySet r4 = r3.q
            monitor-enter(r4)
            java.util.concurrent.CopyOnWriteArraySet r3 = r3.q     // Catch:{ all -> 0x006d }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x006d }
        L_0x005b:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x006d }
            if (r1 == 0) goto L_0x006f
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x006d }
            gy9 r1 = (defpackage.gy9) r1     // Catch:{ all -> 0x006d }
            r1.n(r5, r0)     // Catch:{ all -> 0x006d }
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x006d }
            goto L_0x005b
        L_0x006d:
            r3 = move-exception
            goto L_0x0073
        L_0x006f:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x006d }
            monitor-exit(r4)
            goto L_0x00b1
        L_0x0073:
            monitor-exit(r4)
            throw r3
        L_0x0075:
            xy9 r1 = r3.a
            qo8 r1 = r1.o
            if (r1 == 0) goto L_0x00b1
            int r4 = r4.b
            int r1 = r1.B0()
            if (r4 != r1) goto L_0x00b1
            xy9 r3 = r3.a
            int r4 = defpackage.xy9.N
            java.lang.String r4 = "xy9"
            java.lang.String r1 = "notifyListeners"
            defpackage.z68.c(r4, r1, new java.lang.Object[0])
            java.util.concurrent.CopyOnWriteArraySet r4 = r3.q
            monitor-enter(r4)
            java.util.concurrent.CopyOnWriteArraySet r3 = r3.q     // Catch:{ all -> 0x00a9 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00a9 }
        L_0x0097:
            boolean r1 = r3.hasNext()     // Catch:{ all -> 0x00a9 }
            if (r1 == 0) goto L_0x00ab
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x00a9 }
            gy9 r1 = (defpackage.gy9) r1     // Catch:{ all -> 0x00a9 }
            r1.k(r5, r0)     // Catch:{ all -> 0x00a9 }
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00a9 }
            goto L_0x0097
        L_0x00a9:
            r3 = move-exception
            goto L_0x00af
        L_0x00ab:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00a9 }
            monitor-exit(r4)
            goto L_0x00b1
        L_0x00af:
            monitor-exit(r4)
            throw r3
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy9.q(uob, uob, int):void");
    }

    public final void w0(PlaybackException playbackException) {
        xy9 xy9 = this.a;
        int i = xy9.N;
        z68.c("xy9", "notifyListeners", new Object[0]);
        synchronized (xy9.q) {
            try {
                Iterator it = xy9.q.iterator();
                while (it.hasNext()) {
                    ((gy9) it.next()).c(xy9.l(), xy9.m());
                    Unit unit = Unit.INSTANCE;
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
