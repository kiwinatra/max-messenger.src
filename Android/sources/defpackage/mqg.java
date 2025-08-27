package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: mqg  reason: default package */
public final class mqg implements Runnable {
    public static final String B0 = h88.V("WorkerWrapper");
    public volatile boolean A0;
    public final q96 X;
    public final WorkDatabase Y;
    public final ypg Z;
    public final Context a;
    public final String b;
    public final List c;
    public final aqg o;
    public final xpg v;
    public final dm4 v0;
    public e08 w;
    public final List w0;
    public final wdf x;
    public String x0;
    public d08 y = d08.a();
    public final cyd y0 = new Object();
    public final ve3 z;
    public final cyd z0 = new Object();

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, cyd] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, cyd] */
    public mqg(n09 n09) {
        this.a = (Context) n09.b;
        this.x = (wdf) n09.a;
        this.X = (q96) n09.c;
        xpg xpg = (xpg) n09.w;
        this.v = xpg;
        this.b = xpg.a;
        this.c = (List) n09.x;
        this.o = (aqg) n09.z;
        this.w = null;
        this.z = (ve3) n09.o;
        WorkDatabase workDatabase = (WorkDatabase) n09.v;
        this.Y = workDatabase;
        this.Z = workDatabase.y();
        this.v0 = workDatabase.t();
        this.w0 = (List) n09.y;
    }

    public final void a(d08 d08) {
        boolean z2 = d08 instanceof c08;
        xpg xpg = this.v;
        String str = B0;
        if (z2) {
            h88 x2 = h88.x();
            x2.G(str, "Worker result SUCCESS for " + this.x0);
            if (xpg.d()) {
                d();
                return;
            }
            dm4 dm4 = this.v0;
            String str2 = this.b;
            ypg ypg = this.Z;
            WorkDatabase workDatabase = this.Y;
            workDatabase.c();
            try {
                ypg.r(xog.c, str2);
                ypg.q(str2, ((c08) this.y).a);
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = dm4.m(str2).iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (ypg.j(str3) == xog.v && dm4.o(str3)) {
                        h88 x3 = h88.x();
                        x3.G(str, "Setting status to enqueued for " + str3);
                        ypg.r(xog.a, str3);
                        ypg.p(currentTimeMillis, str3);
                    }
                }
                workDatabase.r();
                workDatabase.l();
                e(false);
            } catch (Throwable th) {
                workDatabase.l();
                e(false);
                throw th;
            }
        } else if (d08 instanceof b08) {
            h88 x4 = h88.x();
            x4.G(str, "Worker result RETRY for " + this.x0);
            c();
        } else {
            h88 x5 = h88.x();
            x5.G(str, "Worker result FAILURE for " + this.x0);
            if (xpg.d()) {
                d();
            } else {
                g();
            }
        }
    }

    public final void b() {
        boolean h = h();
        WorkDatabase workDatabase = this.Y;
        String str = this.b;
        if (!h) {
            workDatabase.c();
            try {
                xog j = this.Z.j(str);
                workDatabase.x().g(str);
                if (j == null) {
                    e(false);
                } else if (j == xog.b) {
                    a(this.y);
                } else if (!j.a()) {
                    c();
                }
                workDatabase.r();
                workDatabase.l();
            } catch (Throwable th) {
                workDatabase.l();
                throw th;
            }
        }
        List<mfd> list = this.c;
        if (list != null) {
            for (mfd d : list) {
                d.d(str);
            }
            yfd.a(this.z, workDatabase, list);
        }
    }

    public final void c() {
        String str = this.b;
        ypg ypg = this.Z;
        WorkDatabase workDatabase = this.Y;
        workDatabase.c();
        try {
            ypg.r(xog.a, str);
            ypg.p(System.currentTimeMillis(), str);
            ypg.o(-1, str);
            workDatabase.r();
        } finally {
            workDatabase.l();
            e(true);
        }
    }

    public final void d() {
        i6d i6d;
        ppg ppg;
        gf6 E;
        ppg ppg2;
        gf6 E2;
        String str = this.b;
        ypg ypg = this.Z;
        WorkDatabase workDatabase = this.Y;
        workDatabase.c();
        try {
            ypg.p(System.currentTimeMillis(), str);
            i6d = (i6d) ypg.a;
            ypg.r(xog.a, str);
            i6d.b();
            ppg = (ppg) ypg.j;
            E = ppg.E();
            if (str == null) {
                E.X(1);
            } else {
                E.h(1, str);
            }
            i6d.c();
            E.n();
            i6d.r();
            i6d.l();
            ppg.S(E);
            i6d.b();
            ppg2 = (ppg) ypg.f;
            E2 = ppg2.E();
            if (str == null) {
                E2.X(1);
            } else {
                E2.h(1, str);
            }
            i6d.c();
            E2.n();
            i6d.r();
            i6d.l();
            ppg2.S(E2);
            ypg.o(-1, str);
            workDatabase.r();
            workDatabase.l();
            e(false);
        } catch (Throwable th) {
            workDatabase.l();
            e(false);
            throw th;
        }
    }

    public final void e(boolean z2) {
        d7d a2;
        Cursor o2;
        boolean containsKey;
        this.Y.c();
        try {
            ypg y2 = this.Y.y();
            y2.getClass();
            a2 = d7d.a(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            i6d i6d = (i6d) y2.a;
            i6d.b();
            o2 = i6d.o(a2, (CancellationSignal) null);
            boolean z3 = o2.moveToFirst() && o2.getInt(0) != 0;
            o2.close();
            a2.o();
            if (!z3) {
                a7b.a(this.a, RescheduleReceiver.class, false);
            }
            if (z2) {
                this.Z.r(xog.a, this.b);
                this.Z.o(-1, this.b);
            }
            if (!(this.v == null || this.w == null)) {
                q96 q96 = this.X;
                String str = this.b;
                rvb rvb = (rvb) q96;
                synchronized (rvb.Z) {
                    containsKey = rvb.w.containsKey(str);
                }
                if (containsKey) {
                    q96 q962 = this.X;
                    String str2 = this.b;
                    rvb rvb2 = (rvb) q962;
                    synchronized (rvb2.Z) {
                        rvb2.w.remove(str2);
                        rvb2.i();
                    }
                }
            }
            this.Y.r();
            this.Y.l();
            this.y0.j(Boolean.valueOf(z2));
        } catch (Throwable th) {
            this.Y.l();
            throw th;
        }
    }

    public final void f() {
        ypg ypg = this.Z;
        String str = this.b;
        xog j = ypg.j(str);
        xog xog = xog.b;
        String str2 = B0;
        if (j == xog) {
            h88 x2 = h88.x();
            x2.p(str2, "Status for " + str + " is RUNNING; not doing any work and rescheduling for later execution");
            e(true);
            return;
        }
        h88 x3 = h88.x();
        x3.p(str2, "Status for " + str + " is " + j + " ; not doing any work");
        e(false);
    }

    public final void g() {
        String str = this.b;
        WorkDatabase workDatabase = this.Y;
        workDatabase.c();
        try {
            LinkedList linkedList = new LinkedList();
            linkedList.add(str);
            while (true) {
                boolean isEmpty = linkedList.isEmpty();
                ypg ypg = this.Z;
                if (!isEmpty) {
                    String str2 = (String) linkedList.remove();
                    if (ypg.j(str2) != xog.w) {
                        ypg.r(xog.o, str2);
                    }
                    linkedList.addAll(this.v0.m(str2));
                } else {
                    ypg.q(str, ((a08) this.y).a);
                    workDatabase.r();
                    return;
                }
            }
        } finally {
            workDatabase.l();
            e(false);
        }
    }

    public final boolean h() {
        if (!this.A0) {
            return false;
        }
        h88 x2 = h88.x();
        String str = B0;
        x2.p(str, "Work interrupted for " + this.x0);
        xog j = this.Z.j(this.b);
        if (j == null) {
            e(false);
        } else {
            e(!j.a());
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.work.WorkerParameters, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0091, code lost:
        if ((r6.b == r10 && r6.k > 0) != false) goto L_0x0093;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r25 = this;
            r1 = r25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Work [ id="
            r0.<init>(r4)
            java.lang.String r4 = r1.b
            r0.append(r4)
            java.lang.String r5 = ", tags={ "
            r0.append(r5)
            java.util.List r5 = r1.w0
            java.util.Iterator r6 = r5.iterator()
            r7 = 1
            r8 = r7
        L_0x001b:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x0034
            java.lang.Object r9 = r6.next()
            java.lang.String r9 = (java.lang.String) r9
            if (r8 == 0) goto L_0x002b
            r8 = 0
            goto L_0x0030
        L_0x002b:
            java.lang.String r10 = ", "
            r0.append(r10)
        L_0x0030:
            r0.append(r9)
            goto L_0x001b
        L_0x0034:
            java.lang.String r6 = " } ]"
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r1.x0 = r0
            xpg r6 = r1.v
            java.lang.String r0 = "Delaying execution for "
            boolean r8 = r25.h()
            if (r8 == 0) goto L_0x004b
            goto L_0x02b6
        L_0x004b:
            androidx.work.impl.WorkDatabase r8 = r1.Y
            r8.c()
            xog r9 = r6.b     // Catch:{ all -> 0x007d }
            xog r10 = defpackage.xog.a
            java.lang.String r11 = r6.c
            java.lang.String r12 = B0
            if (r9 == r10) goto L_0x0080
            r25.f()     // Catch:{ all -> 0x007d }
            r8.r()     // Catch:{ all -> 0x007d }
            h88 r0 = defpackage.h88.x()     // Catch:{ all -> 0x007d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x007d }
            r1.<init>()     // Catch:{ all -> 0x007d }
            r1.append(r11)     // Catch:{ all -> 0x007d }
            java.lang.String r2 = " is not in ENQUEUED state. Nothing more to do"
            r1.append(r2)     // Catch:{ all -> 0x007d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x007d }
            r0.p(r12, r1)     // Catch:{ all -> 0x007d }
        L_0x0078:
            r8.l()
            goto L_0x02b6
        L_0x007d:
            r0 = move-exception
            goto L_0x02c2
        L_0x0080:
            boolean r9 = r6.d()     // Catch:{ all -> 0x007d }
            if (r9 != 0) goto L_0x0093
            xog r9 = r6.b     // Catch:{ all -> 0x007d }
            if (r9 != r10) goto L_0x0090
            int r9 = r6.k     // Catch:{ all -> 0x007d }
            if (r9 <= 0) goto L_0x0090
            r9 = r7
            goto L_0x0091
        L_0x0090:
            r9 = 0
        L_0x0091:
            if (r9 == 0) goto L_0x00be
        L_0x0093:
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x007d }
            long r15 = r6.a()     // Catch:{ all -> 0x007d }
            int r9 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r9 >= 0) goto L_0x00be
            h88 r2 = defpackage.h88.x()     // Catch:{ all -> 0x007d }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x007d }
            r3.<init>(r0)     // Catch:{ all -> 0x007d }
            r3.append(r11)     // Catch:{ all -> 0x007d }
            java.lang.String r0 = " because it is being executed before schedule."
            r3.append(r0)     // Catch:{ all -> 0x007d }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x007d }
            r2.p(r12, r0)     // Catch:{ all -> 0x007d }
            r1.e(r7)     // Catch:{ all -> 0x007d }
            r8.r()     // Catch:{ all -> 0x007d }
            goto L_0x0078
        L_0x00be:
            r8.r()     // Catch:{ all -> 0x007d }
            r8.l()
            boolean r0 = r6.d()
            ypg r9 = r1.Z
            ve3 r13 = r1.z
            if (r0 == 0) goto L_0x00d2
            t64 r0 = r6.e
            goto L_0x0176
        L_0x00d2:
            o9a r0 = r13.d
            java.lang.String r14 = r6.d
            r0.getClass()
            java.lang.String r0 = defpackage.og7.a
            r15 = 0
            java.lang.Class r0 = java.lang.Class.forName(r14)     // Catch:{ Exception -> 0x00eb }
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r15)     // Catch:{ Exception -> 0x00eb }
            java.lang.Object r0 = r0.newInstance(r15)     // Catch:{ Exception -> 0x00eb }
            og7 r0 = (defpackage.og7) r0     // Catch:{ Exception -> 0x00eb }
            goto L_0x00fc
        L_0x00eb:
            r0 = move-exception
            h88 r2 = defpackage.h88.x()
            java.lang.String r3 = "Trouble instantiating + "
            java.lang.String r3 = defpackage.a81.m(r3, r14)
            java.lang.String r14 = defpackage.og7.a
            r2.u(r14, r3, r0)
            r0 = r15
        L_0x00fc:
            if (r0 != 0) goto L_0x011a
            h88 r0 = defpackage.h88.x()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not create Input Merger "
            r2.<init>(r3)
            java.lang.String r3 = r6.d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.t(r12, r2)
            r25.g()
            goto L_0x02b6
        L_0x011a:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            t64 r3 = r6.e
            r2.add(r3)
            r9.getClass()
            java.lang.String r3 = "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)"
            d7d r3 = defpackage.d7d.a(r7, r3)
            if (r4 != 0) goto L_0x0133
            r3.X(r7)
            goto L_0x0136
        L_0x0133:
            r3.h(r7, r4)
        L_0x0136:
            java.lang.Object r14 = r9.a
            i6d r14 = (defpackage.i6d) r14
            r14.b()
            android.database.Cursor r14 = r14.o(r3, r15)
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x0166 }
            int r7 = r14.getCount()     // Catch:{ all -> 0x0166 }
            r15.<init>(r7)     // Catch:{ all -> 0x0166 }
        L_0x014a:
            boolean r7 = r14.moveToNext()     // Catch:{ all -> 0x0166 }
            if (r7 == 0) goto L_0x0169
            r7 = 0
            boolean r17 = r14.isNull(r7)     // Catch:{ all -> 0x0166 }
            if (r17 == 0) goto L_0x015a
            r19 = 0
            goto L_0x015e
        L_0x015a:
            byte[] r19 = r14.getBlob(r7)     // Catch:{ all -> 0x0166 }
        L_0x015e:
            t64 r7 = defpackage.t64.a(r19)     // Catch:{ all -> 0x0166 }
            r15.add(r7)     // Catch:{ all -> 0x0166 }
            goto L_0x014a
        L_0x0166:
            r0 = move-exception
            goto L_0x02bb
        L_0x0169:
            r14.close()
            r3.o()
            r2.addAll(r15)
            t64 r0 = r0.a(r2)
        L_0x0176:
            androidx.work.WorkerParameters r2 = new androidx.work.WorkerParameters
            java.util.UUID r3 = java.util.UUID.fromString(r4)
            int r6 = r6.k
            java.util.concurrent.Executor r7 = r13.a
            rpg r14 = new rpg
            wdf r15 = r1.x
            r14.<init>(r8, r15)
            r18 = r10
            vog r10 = new vog
            r19 = r4
            q96 r4 = r1.X
            r10.<init>(r8, r4, r15)
            r2.<init>()
            r2.a = r3
            r2.b = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r5)
            r2.c = r0
            aqg r0 = r1.o
            r2.d = r0
            r2.e = r6
            r2.f = r7
            r2.g = r15
            gqg r0 = r13.c
            r2.h = r0
            r2.i = r14
            r2.j = r10
            e08 r3 = r1.w
            if (r3 != 0) goto L_0x01be
            android.content.Context r3 = r1.a
            e08 r0 = r0.b(r3, r11, r2)
            r1.w = r0
        L_0x01be:
            e08 r0 = r1.w
            if (r0 != 0) goto L_0x01dc
            h88 r0 = defpackage.h88.x()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Could not create Worker "
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r0.t(r12, r2)
            r25.g()
            goto L_0x02b6
        L_0x01dc:
            boolean r0 = r0.isUsed()
            if (r0 == 0) goto L_0x0201
            h88 r0 = defpackage.h88.x()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Received an already-used Worker "
            r2.<init>(r3)
            r2.append(r11)
            java.lang.String r3 = "; Worker Factory should return new instances"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.t(r12, r2)
            r25.g()
            goto L_0x02b6
        L_0x0201:
            e08 r0 = r1.w
            r0.setUsed()
            r8.c()
            r2 = r19
            xog r0 = r9.j(r2)     // Catch:{ all -> 0x024d }
            r3 = r18
            if (r0 != r3) goto L_0x024f
            xog r0 = defpackage.xog.b     // Catch:{ all -> 0x024d }
            r9.r(r0, r2)     // Catch:{ all -> 0x024d }
            java.lang.Object r0 = r9.a     // Catch:{ all -> 0x024d }
            r3 = r0
            i6d r3 = (defpackage.i6d) r3     // Catch:{ all -> 0x024d }
            r3.b()     // Catch:{ all -> 0x024d }
            java.lang.Object r0 = r9.i     // Catch:{ all -> 0x024d }
            r4 = r0
            ppg r4 = (defpackage.ppg) r4     // Catch:{ all -> 0x024d }
            gf6 r5 = r4.E()     // Catch:{ all -> 0x024d }
            if (r2 != 0) goto L_0x0230
            r6 = 1
            r5.X(r6)     // Catch:{ all -> 0x024d }
            goto L_0x0234
        L_0x0230:
            r6 = 1
            r5.h(r6, r2)     // Catch:{ all -> 0x024d }
        L_0x0234:
            r3.c()     // Catch:{ all -> 0x024d }
            r5.n()     // Catch:{ all -> 0x0245 }
            r3.r()     // Catch:{ all -> 0x0245 }
            r3.l()     // Catch:{ all -> 0x024d }
            r4.S(r5)     // Catch:{ all -> 0x024d }
            r7 = r6
            goto L_0x0250
        L_0x0245:
            r0 = move-exception
            r3.l()     // Catch:{ all -> 0x024d }
            r4.S(r5)     // Catch:{ all -> 0x024d }
            throw r0     // Catch:{ all -> 0x024d }
        L_0x024d:
            r0 = move-exception
            goto L_0x02b7
        L_0x024f:
            r7 = 0
        L_0x0250:
            r8.r()     // Catch:{ all -> 0x024d }
            r8.l()
            if (r7 == 0) goto L_0x02b3
            boolean r0 = r25.h()
            if (r0 == 0) goto L_0x025f
            goto L_0x02b6
        L_0x025f:
            uog r0 = new uog
            e08 r2 = r1.w
            android.content.Context r3 = r1.a
            xpg r4 = r1.v
            wdf r5 = r1.x
            r19 = r0
            r20 = r3
            r21 = r4
            r22 = r2
            r23 = r10
            r24 = r5
            r19.<init>(r20, r21, r22, r23, r24)
            g6d r15 = (defpackage.g6d) r15
            java.lang.Object r2 = r15.o
            ky6 r2 = (defpackage.ky6) r2
            r2.execute(r0)
            l8g r2 = new l8g
            cyd r0 = r0.a
            r3 = 6
            r2.<init>(r3, r1, r0)
            ep4 r4 = new ep4
            r4.<init>(r3)
            cyd r3 = r1.z0
            r3.d(r2, r4)
            vj6 r2 = new vj6
            r4 = 27
            r5 = 0
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r0, (boolean) r5, (int) r4)
            java.lang.Object r4 = r15.o
            ky6 r4 = (defpackage.ky6) r4
            r0.d(r2, r4)
            java.lang.String r0 = r1.x0
            uj6 r2 = new uj6
            r4 = 29
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r0, (boolean) r5, (int) r4)
            java.lang.Object r0 = r15.b
            qn r0 = (defpackage.qn) r0
            r3.d(r2, r0)
            goto L_0x02b6
        L_0x02b3:
            r25.f()
        L_0x02b6:
            return
        L_0x02b7:
            r8.l()
            throw r0
        L_0x02bb:
            r14.close()
            r3.o()
            throw r0
        L_0x02c2:
            r8.l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mqg.run():void");
    }
}
