package defpackage;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* renamed from: kxd  reason: default package */
public final class kxd {
    public final Context a;
    public final Object b = new Object();
    public final abe c = new abe(new ve(6, (Object) this));
    public volatile boolean d;
    public final long e = System.currentTimeMillis();
    public g8f f;
    public long g = Long.MIN_VALUE;
    public g8f h;
    public long i = Long.MIN_VALUE;
    public List j = CollectionsKt.emptyList();
    public volatile fxd k;
    public volatile fxd l;

    public kxd(Context context) {
        this.a = context;
    }

    public static void d(kxd kxd, int i2, boolean z, e4e e4e, int i3) {
        fxd fxd = null;
        if ((i3 & 1) != 0) {
            fxd fxd2 = kxd.k;
            if (fxd2 == null) {
                fxd2 = null;
            }
            i2 = fxd2.f;
        }
        if ((i3 & 2) != 0) {
            fxd fxd3 = kxd.k;
            if (fxd3 == null) {
                fxd3 = null;
            }
            z = fxd3.h;
        }
        if ((i3 & 4) != 0) {
            fxd fxd4 = kxd.k;
            if (fxd4 == null) {
                fxd4 = null;
            }
            e4e = fxd4.g;
        }
        synchronized (kxd.b) {
            kxd.b();
            fxd fxd5 = kxd.k;
            if (fxd5 == null) {
                fxd5 = null;
            }
            kxd.k = fxd.a(fxd5, i2, e4e, z, 31);
            Collection dropLast = CollectionsKt.dropLast(kxd.j, 1);
            fxd fxd6 = kxd.k;
            if (fxd6 != null) {
                fxd = fxd6;
            }
            List plus = CollectionsKt.plus(dropLast, fxd);
            kxd.j = plus;
            gsg.b(kxd.c, plus);
            kxd.c.b();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void a() {
        synchronized (this.b) {
            b();
            this.i = this.e;
            this.j = CollectionsKt.listOf(CollectionsKt.last(this.j));
            this.c.a(Long.valueOf(this.i), "session_state_upload_ts");
            gsg.b(this.c, this.j);
            this.c.b();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r1 = kotlin.collections.CollectionsKt.emptyList();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00b8 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f A[Catch:{ all -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062 A[Catch:{ all -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065 A[Catch:{ all -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008e A[Catch:{ all -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ae A[Catch:{ all -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c2 A[Catch:{ all -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fd A[Catch:{ all -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0108 A[Catch:{ all -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011e A[Catch:{ all -> 0x002c }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011f A[Catch:{ all -> 0x002c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r15 = this;
            boolean r0 = r15.d
            if (r0 != 0) goto L_0x013d
            java.lang.Object r0 = r15.b
            monitor-enter(r0)
            boolean r1 = r15.d     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x0137
            abe r1 = r15.c     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "session_start_ts"
            kotlin.Lazy r1 = r1.b     // Catch:{ all -> 0x002c }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x002c }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x002c }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x002c }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x002c }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002c }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x002c }
            r2 = -9223372036854775808
            if (r1 == 0) goto L_0x002f
            long r4 = r1.longValue()     // Catch:{ all -> 0x002c }
            goto L_0x0030
        L_0x002c:
            r15 = move-exception
            goto L_0x013b
        L_0x002f:
            r4 = r2
        L_0x0030:
            r15.g = r4     // Catch:{ all -> 0x002c }
            abe r1 = r15.c     // Catch:{ all -> 0x002c }
            java.lang.String r4 = "session_system_state"
            kotlin.Lazy r1 = r1.b     // Catch:{ all -> 0x002c }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x002c }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x002c }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x002c }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x002c }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x002c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x002c }
            r4 = 0
            if (r1 != 0) goto L_0x004f
        L_0x004d:
            r1 = r4
            goto L_0x0053
        L_0x004f:
            g8f r1 = defpackage.ld8.A(r1)     // Catch:{ Exception -> 0x004d }
        L_0x0053:
            r15.h = r1     // Catch:{ all -> 0x002c }
            android.content.Context r1 = r15.a     // Catch:{ all -> 0x002c }
            g8f r1 = defpackage.te8.h(r1)     // Catch:{ all -> 0x002c }
            g8f r5 = r15.h     // Catch:{ all -> 0x002c }
            if (r5 == 0) goto L_0x0062
            java.util.Map r5 = r5.m     // Catch:{ all -> 0x002c }
            goto L_0x0063
        L_0x0062:
            r5 = r4
        L_0x0063:
            if (r5 == 0) goto L_0x0072
            java.util.Map r6 = r1.m     // Catch:{ all -> 0x002c }
            java.util.Map r5 = kotlin.collections.MapsKt.plus(r5, r6)     // Catch:{ all -> 0x002c }
            r6 = 12287(0x2fff, float:1.7218E-41)
            r7 = 0
            g8f r1 = defpackage.g8f.a(r1, r7, r5, r6)     // Catch:{ all -> 0x002c }
        L_0x0072:
            r15.f = r1     // Catch:{ all -> 0x002c }
            abe r1 = r15.c     // Catch:{ all -> 0x002c }
            java.lang.String r5 = "session_state_upload_ts"
            kotlin.Lazy r1 = r1.b     // Catch:{ all -> 0x002c }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x002c }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x002c }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x002c }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x002c }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x002c }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x0092
            long r2 = r1.longValue()     // Catch:{ all -> 0x002c }
        L_0x0092:
            r15.i = r2     // Catch:{ all -> 0x002c }
            abe r1 = r15.c     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "session_states"
            kotlin.Lazy r1 = r1.b     // Catch:{ all -> 0x002c }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x002c }
            java.util.concurrent.atomic.AtomicReference r1 = (java.util.concurrent.atomic.AtomicReference) r1     // Catch:{ all -> 0x002c }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x002c }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x002c }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x002c }
            if (r1 != 0) goto L_0x00b3
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()     // Catch:{ all -> 0x002c }
            goto L_0x00bc
        L_0x00b3:
            java.util.ArrayList r1 = defpackage.hsg.p(r1)     // Catch:{ Exception -> 0x00b8 }
            goto L_0x00bc
        L_0x00b8:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()     // Catch:{ all -> 0x002c }
        L_0x00bc:
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x002c }
            g8f r2 = r15.f     // Catch:{ all -> 0x002c }
            if (r2 != 0) goto L_0x00c3
            r2 = r4
        L_0x00c3:
            fxd r3 = new fxd     // Catch:{ all -> 0x002c }
            long r6 = r2.b     // Catch:{ all -> 0x002c }
            java.util.Map r5 = r2.m     // Catch:{ all -> 0x002c }
            java.lang.String r8 = "processName"
            java.lang.Object r5 = r5.get(r8)     // Catch:{ all -> 0x002c }
            r11 = r5
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x002c }
            java.lang.String r8 = r2.a     // Catch:{ all -> 0x002c }
            java.lang.String r9 = r2.d     // Catch:{ all -> 0x002c }
            java.lang.String r10 = r2.f     // Catch:{ all -> 0x002c }
            boolean r14 = r2.k     // Catch:{ all -> 0x002c }
            r13 = 0
            r12 = 1
            r5 = r3
            r5.<init>(r6, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x002c }
            java.util.List r1 = kotlin.collections.CollectionsKt.plus(r1, r3)     // Catch:{ all -> 0x002c }
            r2 = 50
            java.util.List r1 = kotlin.collections.CollectionsKt.takeLast(r1, r2)     // Catch:{ all -> 0x002c }
            r15.j = r1     // Catch:{ all -> 0x002c }
            int r1 = r1.size()     // Catch:{ all -> 0x002c }
            java.util.List r2 = r15.j     // Catch:{ all -> 0x002c }
            java.lang.Object r2 = kotlin.collections.CollectionsKt.last(r2)     // Catch:{ all -> 0x002c }
            fxd r2 = (defpackage.fxd) r2     // Catch:{ all -> 0x002c }
            r15.k = r2     // Catch:{ all -> 0x002c }
            r2 = 1
            if (r1 <= r2) goto L_0x0108
            java.util.List r3 = r15.j     // Catch:{ all -> 0x002c }
            int r1 = r1 + -2
            java.lang.Object r1 = r3.get(r1)     // Catch:{ all -> 0x002c }
            fxd r1 = (defpackage.fxd) r1     // Catch:{ all -> 0x002c }
            goto L_0x0109
        L_0x0108:
            r1 = r4
        L_0x0109:
            r15.l = r1     // Catch:{ all -> 0x002c }
            abe r1 = r15.c     // Catch:{ all -> 0x002c }
            java.lang.String r3 = "session_start_ts"
            long r5 = r15.e     // Catch:{ all -> 0x002c }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x002c }
            r1.a(r5, r3)     // Catch:{ all -> 0x002c }
            abe r1 = r15.c     // Catch:{ all -> 0x002c }
            g8f r3 = r15.f     // Catch:{ all -> 0x002c }
            if (r3 != 0) goto L_0x011f
            goto L_0x0120
        L_0x011f:
            r4 = r3
        L_0x0120:
            java.lang.String r3 = defpackage.ld8.A0(r4)     // Catch:{ all -> 0x002c }
            java.lang.String r4 = "session_system_state"
            r1.a(r3, r4)     // Catch:{ all -> 0x002c }
            abe r1 = r15.c     // Catch:{ all -> 0x002c }
            java.util.List r3 = r15.j     // Catch:{ all -> 0x002c }
            defpackage.gsg.b(r1, r3)     // Catch:{ all -> 0x002c }
            abe r1 = r15.c     // Catch:{ all -> 0x002c }
            r1.b()     // Catch:{ all -> 0x002c }
            r15.d = r2     // Catch:{ all -> 0x002c }
        L_0x0137:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x002c }
            monitor-exit(r0)
            goto L_0x013d
        L_0x013b:
            monitor-exit(r0)
            throw r15
        L_0x013d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kxd.b():void");
    }

    public final g8f c() {
        b();
        g8f g8f = this.f;
        if (g8f == null) {
            g8f = null;
        }
        g8f.getClass();
        return g8f.a(g8f, false, MapsKt.plus(g8f.m, TuplesKt.to("date", new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXXX", Locale.US).format(new Date()))), 12287);
    }

    public final void e(boolean z) {
        synchronized (this.b) {
            b();
            g8f g8f = this.f;
            if ((g8f == null ? null : g8f).k != z) {
                if (g8f == null) {
                    g8f = null;
                }
                g8f a2 = g8f.a(g8f, z, (Map) null, 15359);
                this.f = a2;
                this.c.a(ld8.A0(a2), "session_system_state");
                d(this, 0, z, (e4e) null, 5);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    public final void f(Map map) {
        boolean z;
        synchronized (this.b) {
            try {
                b();
                g8f g8f = this.f;
                g8f g8f2 = null;
                if (g8f == null) {
                    g8f = null;
                }
                Map mutableMap = MapsKt.toMutableMap(g8f.m);
                loop0:
                while (true) {
                    z = false;
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getValue();
                        String take = StringsKt.take((String) entry.getKey(), 32);
                        String take2 = str != null ? StringsKt.take(str, 64) : null;
                        if (!Intrinsics.areEqual(mutableMap.get(take), (Object) take2)) {
                            if (take2 != null) {
                                mutableMap.put(take, take2);
                            } else {
                                mutableMap.remove(take);
                            }
                            z = true;
                        }
                    }
                    break loop0;
                }
                if (z) {
                    g8f g8f3 = this.f;
                    if (g8f3 != null) {
                        g8f2 = g8f3;
                    }
                    g8f a2 = g8f.a(g8f2, false, mutableMap, 12287);
                    this.f = a2;
                    this.c.a(ld8.A0(a2), "session_system_state");
                    this.c.b();
                    Unit unit = Unit.INSTANCE;
                }
            } finally {
            }
        }
    }

    public final void g(int i2) {
        b();
        fxd fxd = this.l;
        if (fxd != null) {
            synchronized (this.b) {
                b();
                fxd a2 = fxd.a(fxd, i2, (e4e) null, false, 223);
                this.l = a2;
                if (this.j.size() > 1) {
                    List plus = CollectionsKt.plus(CollectionsKt.plus(CollectionsKt.dropLast(this.j, 2), a2), CollectionsKt.last(this.j));
                    this.j = plus;
                    gsg.b(this.c, plus);
                    this.c.b();
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }
}
