package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;

/* renamed from: ypg  reason: default package */
public final class ypg {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;

    public ypg(i6d i6d) {
        this.a = i6d;
        this.b = new mpg(i6d, 2);
        this.c = new we4(i6d, 6);
        this.d = new ppg(i6d, 6);
        this.e = new ppg(i6d, 7);
        this.f = new ppg(i6d, 8);
        this.g = new ppg(i6d, 9);
        this.h = new ppg(i6d, 10);
        this.i = new ppg(i6d, 11);
        this.j = new ppg(i6d, 12);
        this.k = new ppg(i6d, 2);
        this.l = new ppg(i6d, 3);
        new ppg(i6d, 4);
        new ppg(i6d, 5);
    }

    public static void d(b59 b59) {
        if (b59 instanceof w8d) {
            ((w8d) b59).getClass();
        } else if (b59 instanceof k54) {
            ((k54) b59).getClass();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: qae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: ts} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: qae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: ts} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: qae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: ts} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: qae} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.ts r9) {
        /*
            r8 = this;
            java.util.Set r0 = r9.keySet()
            qs r0 = (defpackage.qs) r0
            ts r1 = r0.a
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x000f
            return
        L_0x000f:
            int r2 = r9.c
            r3 = 999(0x3e7, float:1.4E-42)
            r4 = 0
            if (r2 <= r3) goto L_0x0046
            ts r0 = new ts
            r0.<init>(r3)
            int r1 = r9.c
            r2 = r4
            r5 = r2
        L_0x001f:
            if (r2 >= r1) goto L_0x0040
            java.lang.Object r6 = r9.f(r2)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r9.i(r2)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r0.put(r6, r7)
            int r2 = r2 + 1
            int r5 = r5 + 1
            if (r5 != r3) goto L_0x001f
            r8.a(r0)
            ts r0 = new ts
            r0.<init>(r3)
            r5 = r4
            goto L_0x001f
        L_0x0040:
            if (r5 <= 0) goto L_0x0045
            r8.a(r0)
        L_0x0045:
            return
        L_0x0046:
            java.lang.String r2 = "SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN ("
            java.lang.StringBuilder r2 = defpackage.tr1.o(r2)
            int r1 = r1.c
            defpackage.n79.c(r2, r1)
            java.lang.String r3 = ")"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            d7d r1 = defpackage.d7d.a(r1, r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 1
        L_0x0063:
            r3 = r0
            ps r3 = (defpackage.ps) r3
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007e
            java.lang.Object r3 = r3.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0078
            r1.X(r2)
            goto L_0x007b
        L_0x0078:
            r1.h(r2, r3)
        L_0x007b:
            int r2 = r2 + 1
            goto L_0x0063
        L_0x007e:
            java.lang.Object r8 = r8.a
            i6d r8 = (defpackage.i6d) r8
            r0 = 0
            android.database.Cursor r8 = r8.o(r1, r0)
            java.lang.String r1 = "work_spec_id"
            int r1 = defpackage.kne.t(r8, r1)     // Catch:{ all -> 0x00ba }
            r2 = -1
            if (r1 != r2) goto L_0x0094
            r8.close()
            return
        L_0x0094:
            boolean r2 = r8.moveToNext()     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x00bc
            java.lang.String r2 = r8.getString(r1)     // Catch:{ all -> 0x00ba }
            java.lang.Object r2 = r9.get(r2)     // Catch:{ all -> 0x00ba }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x0094
            boolean r3 = r8.isNull(r4)     // Catch:{ all -> 0x00ba }
            if (r3 == 0) goto L_0x00ae
            r3 = r0
            goto L_0x00b2
        L_0x00ae:
            byte[] r3 = r8.getBlob(r4)     // Catch:{ all -> 0x00ba }
        L_0x00b2:
            t64 r3 = defpackage.t64.a(r3)     // Catch:{ all -> 0x00ba }
            r2.add(r3)     // Catch:{ all -> 0x00ba }
            goto L_0x0094
        L_0x00ba:
            r9 = move-exception
            goto L_0x00c0
        L_0x00bc:
            r8.close()
            return
        L_0x00c0:
            r8.close()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ypg.a(ts):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: qae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: ts} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: qae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: ts} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: qae} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: ts} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: qae} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(defpackage.ts r9) {
        /*
            r8 = this;
            java.util.Set r0 = r9.keySet()
            qs r0 = (defpackage.qs) r0
            ts r1 = r0.a
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x000f
            return
        L_0x000f:
            int r2 = r9.c
            r3 = 999(0x3e7, float:1.4E-42)
            r4 = 0
            if (r2 <= r3) goto L_0x0046
            ts r0 = new ts
            r0.<init>(r3)
            int r1 = r9.c
            r2 = r4
            r5 = r2
        L_0x001f:
            if (r2 >= r1) goto L_0x0040
            java.lang.Object r6 = r9.f(r2)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r9.i(r2)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r0.put(r6, r7)
            int r2 = r2 + 1
            int r5 = r5 + 1
            if (r5 != r3) goto L_0x001f
            r8.b(r0)
            ts r0 = new ts
            r0.<init>(r3)
            r5 = r4
            goto L_0x001f
        L_0x0040:
            if (r5 <= 0) goto L_0x0045
            r8.b(r0)
        L_0x0045:
            return
        L_0x0046:
            java.lang.String r2 = "SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN ("
            java.lang.StringBuilder r2 = defpackage.tr1.o(r2)
            int r1 = r1.c
            defpackage.n79.c(r2, r1)
            java.lang.String r3 = ")"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            d7d r1 = defpackage.d7d.a(r1, r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 1
        L_0x0063:
            r3 = r0
            ps r3 = (defpackage.ps) r3
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007e
            java.lang.Object r3 = r3.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x0078
            r1.X(r2)
            goto L_0x007b
        L_0x0078:
            r1.h(r2, r3)
        L_0x007b:
            int r2 = r2 + 1
            goto L_0x0063
        L_0x007e:
            java.lang.Object r8 = r8.a
            i6d r8 = (defpackage.i6d) r8
            r0 = 0
            android.database.Cursor r8 = r8.o(r1, r0)
            java.lang.String r1 = "work_spec_id"
            int r1 = defpackage.kne.t(r8, r1)     // Catch:{ all -> 0x00b6 }
            r2 = -1
            if (r1 != r2) goto L_0x0094
            r8.close()
            return
        L_0x0094:
            boolean r2 = r8.moveToNext()     // Catch:{ all -> 0x00b6 }
            if (r2 == 0) goto L_0x00b8
            java.lang.String r2 = r8.getString(r1)     // Catch:{ all -> 0x00b6 }
            java.lang.Object r2 = r9.get(r2)     // Catch:{ all -> 0x00b6 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x00b6 }
            if (r2 == 0) goto L_0x0094
            boolean r3 = r8.isNull(r4)     // Catch:{ all -> 0x00b6 }
            if (r3 == 0) goto L_0x00ae
            r3 = r0
            goto L_0x00b2
        L_0x00ae:
            java.lang.String r3 = r8.getString(r4)     // Catch:{ all -> 0x00b6 }
        L_0x00b2:
            r2.add(r3)     // Catch:{ all -> 0x00b6 }
            goto L_0x0094
        L_0x00b6:
            r9 = move-exception
            goto L_0x00bc
        L_0x00b8:
            r8.close()
            return
        L_0x00bc:
            r8.close()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ypg.b(ts):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, j4e] */
    public j4e c() {
        ? obj = new Object();
        obj.a = (b59) this.a;
        obj.b = (b59) this.b;
        obj.c = (b59) this.c;
        obj.d = (b59) this.d;
        obj.e = (m04) this.e;
        obj.f = (m04) this.f;
        obj.g = (m04) this.g;
        obj.h = (m04) this.h;
        obj.i = (mz4) this.i;
        obj.j = (mz4) this.j;
        obj.k = (mz4) this.k;
        obj.l = (mz4) this.l;
        return obj;
    }

    public void e(String str) {
        i6d i6d = (i6d) this.a;
        i6d.b();
        ppg ppg = (ppg) this.d;
        gf6 E = ppg.E();
        if (str == null) {
            E.X(1);
        } else {
            E.h(1, str);
        }
        i6d.c();
        try {
            E.n();
            i6d.r();
        } finally {
            i6d.l();
            ppg.S(E);
        }
    }

    public ArrayList f() {
        d7d d7d;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        d7d a2 = d7d.a(1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        a2.k(1, (long) 200);
        i6d i6d = (i6d) this.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o, "id");
            int u2 = kne.u(o, "state");
            int u3 = kne.u(o, "worker_class_name");
            int u4 = kne.u(o, "input_merger_class_name");
            int u5 = kne.u(o, "input");
            int u6 = kne.u(o, "output");
            int u7 = kne.u(o, "initial_delay");
            int u8 = kne.u(o, "interval_duration");
            int u9 = kne.u(o, "flex_duration");
            int u10 = kne.u(o, "run_attempt_count");
            int u11 = kne.u(o, "backoff_policy");
            int u12 = kne.u(o, "backoff_delay_duration");
            int u13 = kne.u(o, "last_enqueue_time");
            int u14 = kne.u(o, "minimum_retention_duration");
            d7d = a2;
            try {
                int u15 = kne.u(o, "schedule_requested_at");
                int u16 = kne.u(o, "run_in_foreground");
                int u17 = kne.u(o, "out_of_quota_policy");
                int u18 = kne.u(o, "period_count");
                int u19 = kne.u(o, "generation");
                int u20 = kne.u(o, "required_network_type");
                int u21 = kne.u(o, "requires_charging");
                int u22 = kne.u(o, "requires_device_idle");
                int u23 = kne.u(o, "requires_battery_not_low");
                int u24 = kne.u(o, "requires_storage_not_low");
                int u25 = kne.u(o, "trigger_content_update_delay");
                int u26 = kne.u(o, "trigger_max_content_delay");
                int u27 = kne.u(o, "content_uri_triggers");
                int i7 = u14;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    String string = o.isNull(u) ? null : o.getString(u);
                    xog K = o5a.K(o.getInt(u2));
                    String string2 = o.isNull(u3) ? null : o.getString(u3);
                    String string3 = o.isNull(u4) ? null : o.getString(u4);
                    t64 a3 = t64.a(o.isNull(u5) ? null : o.getBlob(u5));
                    t64 a4 = t64.a(o.isNull(u6) ? null : o.getBlob(u6));
                    long j2 = o.getLong(u7);
                    long j3 = o.getLong(u8);
                    long j4 = o.getLong(u9);
                    int i8 = o.getInt(u10);
                    ag0 H = o5a.H(o.getInt(u11));
                    long j5 = o.getLong(u12);
                    long j6 = o.getLong(u13);
                    int i9 = i7;
                    long j7 = o.getLong(i9);
                    int i10 = u;
                    int i11 = u15;
                    long j8 = o.getLong(i11);
                    u15 = i11;
                    int i12 = u16;
                    if (o.getInt(i12) != 0) {
                        u16 = i12;
                        i2 = u17;
                        z = true;
                    } else {
                        u16 = i12;
                        i2 = u17;
                        z = false;
                    }
                    t5b J = o5a.J(o.getInt(i2));
                    u17 = i2;
                    int i13 = u18;
                    int i14 = o.getInt(i13);
                    u18 = i13;
                    int i15 = u19;
                    int i16 = o.getInt(i15);
                    u19 = i15;
                    int i17 = u20;
                    int I = o5a.I(o.getInt(i17));
                    u20 = i17;
                    int i18 = u21;
                    if (o.getInt(i18) != 0) {
                        u21 = i18;
                        i3 = u22;
                        z2 = true;
                    } else {
                        u21 = i18;
                        i3 = u22;
                        z2 = false;
                    }
                    if (o.getInt(i3) != 0) {
                        u22 = i3;
                        i4 = u23;
                        z3 = true;
                    } else {
                        u22 = i3;
                        i4 = u23;
                        z3 = false;
                    }
                    if (o.getInt(i4) != 0) {
                        u23 = i4;
                        i5 = u24;
                        z4 = true;
                    } else {
                        u23 = i4;
                        i5 = u24;
                        z4 = false;
                    }
                    if (o.getInt(i5) != 0) {
                        u24 = i5;
                        i6 = u25;
                        z5 = true;
                    } else {
                        u24 = i5;
                        i6 = u25;
                        z5 = false;
                    }
                    long j9 = o.getLong(i6);
                    u25 = i6;
                    int i19 = u26;
                    long j10 = o.getLong(i19);
                    u26 = i19;
                    int i20 = u27;
                    u27 = i20;
                    arrayList.add(new xpg(string, K, string2, string3, a3, a4, j2, j3, j4, new wj3(I, z2, z3, z4, z5, j9, j10, o5a.g(o.isNull(i20) ? null : o.getBlob(i20))), i8, H, j5, j6, j7, j8, z, J, i14, i16));
                    u = i10;
                    i7 = i9;
                }
                o.close();
                d7d.o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = a2;
            o.close();
            d7d.o();
            throw th;
        }
    }

    public ArrayList g(int i2) {
        d7d d7d;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        int i6;
        boolean z5;
        int i7;
        d7d a2 = d7d.a(1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        a2.k(1, (long) i2);
        i6d i6d = (i6d) this.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o, "id");
            int u2 = kne.u(o, "state");
            int u3 = kne.u(o, "worker_class_name");
            int u4 = kne.u(o, "input_merger_class_name");
            int u5 = kne.u(o, "input");
            int u6 = kne.u(o, "output");
            int u7 = kne.u(o, "initial_delay");
            int u8 = kne.u(o, "interval_duration");
            int u9 = kne.u(o, "flex_duration");
            int u10 = kne.u(o, "run_attempt_count");
            int u11 = kne.u(o, "backoff_policy");
            int u12 = kne.u(o, "backoff_delay_duration");
            int u13 = kne.u(o, "last_enqueue_time");
            int u14 = kne.u(o, "minimum_retention_duration");
            d7d = a2;
            try {
                int u15 = kne.u(o, "schedule_requested_at");
                int u16 = kne.u(o, "run_in_foreground");
                int u17 = kne.u(o, "out_of_quota_policy");
                int u18 = kne.u(o, "period_count");
                int u19 = kne.u(o, "generation");
                int u20 = kne.u(o, "required_network_type");
                int u21 = kne.u(o, "requires_charging");
                int u22 = kne.u(o, "requires_device_idle");
                int u23 = kne.u(o, "requires_battery_not_low");
                int u24 = kne.u(o, "requires_storage_not_low");
                int u25 = kne.u(o, "trigger_content_update_delay");
                int u26 = kne.u(o, "trigger_max_content_delay");
                int u27 = kne.u(o, "content_uri_triggers");
                int i8 = u14;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    String string = o.isNull(u) ? null : o.getString(u);
                    xog K = o5a.K(o.getInt(u2));
                    String string2 = o.isNull(u3) ? null : o.getString(u3);
                    String string3 = o.isNull(u4) ? null : o.getString(u4);
                    t64 a3 = t64.a(o.isNull(u5) ? null : o.getBlob(u5));
                    t64 a4 = t64.a(o.isNull(u6) ? null : o.getBlob(u6));
                    long j2 = o.getLong(u7);
                    long j3 = o.getLong(u8);
                    long j4 = o.getLong(u9);
                    int i9 = o.getInt(u10);
                    ag0 H = o5a.H(o.getInt(u11));
                    long j5 = o.getLong(u12);
                    long j6 = o.getLong(u13);
                    int i10 = i8;
                    long j7 = o.getLong(i10);
                    int i11 = u;
                    int i12 = u15;
                    long j8 = o.getLong(i12);
                    u15 = i12;
                    int i13 = u16;
                    if (o.getInt(i13) != 0) {
                        u16 = i13;
                        i3 = u17;
                        z = true;
                    } else {
                        u16 = i13;
                        i3 = u17;
                        z = false;
                    }
                    t5b J = o5a.J(o.getInt(i3));
                    u17 = i3;
                    int i14 = u18;
                    int i15 = o.getInt(i14);
                    u18 = i14;
                    int i16 = u19;
                    int i17 = o.getInt(i16);
                    u19 = i16;
                    int i18 = u20;
                    int I = o5a.I(o.getInt(i18));
                    u20 = i18;
                    int i19 = u21;
                    if (o.getInt(i19) != 0) {
                        u21 = i19;
                        i4 = u22;
                        z2 = true;
                    } else {
                        u21 = i19;
                        i4 = u22;
                        z2 = false;
                    }
                    if (o.getInt(i4) != 0) {
                        u22 = i4;
                        i5 = u23;
                        z3 = true;
                    } else {
                        u22 = i4;
                        i5 = u23;
                        z3 = false;
                    }
                    if (o.getInt(i5) != 0) {
                        u23 = i5;
                        i6 = u24;
                        z4 = true;
                    } else {
                        u23 = i5;
                        i6 = u24;
                        z4 = false;
                    }
                    if (o.getInt(i6) != 0) {
                        u24 = i6;
                        i7 = u25;
                        z5 = true;
                    } else {
                        u24 = i6;
                        i7 = u25;
                        z5 = false;
                    }
                    long j9 = o.getLong(i7);
                    u25 = i7;
                    int i20 = u26;
                    long j10 = o.getLong(i20);
                    u26 = i20;
                    int i21 = u27;
                    u27 = i21;
                    arrayList.add(new xpg(string, K, string2, string3, a3, a4, j2, j3, j4, new wj3(I, z2, z3, z4, z5, j9, j10, o5a.g(o.isNull(i21) ? null : o.getBlob(i21))), i9, H, j5, j6, j7, j8, z, J, i15, i17));
                    u = i11;
                    i8 = i10;
                }
                o.close();
                d7d.o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = a2;
            o.close();
            d7d.o();
            throw th;
        }
    }

    public ArrayList h() {
        d7d d7d;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        d7d a2 = d7d.a(0, "SELECT * FROM workspec WHERE state=1");
        i6d i6d = (i6d) this.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o, "id");
            int u2 = kne.u(o, "state");
            int u3 = kne.u(o, "worker_class_name");
            int u4 = kne.u(o, "input_merger_class_name");
            int u5 = kne.u(o, "input");
            int u6 = kne.u(o, "output");
            int u7 = kne.u(o, "initial_delay");
            int u8 = kne.u(o, "interval_duration");
            int u9 = kne.u(o, "flex_duration");
            int u10 = kne.u(o, "run_attempt_count");
            int u11 = kne.u(o, "backoff_policy");
            int u12 = kne.u(o, "backoff_delay_duration");
            int u13 = kne.u(o, "last_enqueue_time");
            int u14 = kne.u(o, "minimum_retention_duration");
            d7d = a2;
            try {
                int u15 = kne.u(o, "schedule_requested_at");
                int u16 = kne.u(o, "run_in_foreground");
                int u17 = kne.u(o, "out_of_quota_policy");
                int u18 = kne.u(o, "period_count");
                int u19 = kne.u(o, "generation");
                int u20 = kne.u(o, "required_network_type");
                int u21 = kne.u(o, "requires_charging");
                int u22 = kne.u(o, "requires_device_idle");
                int u23 = kne.u(o, "requires_battery_not_low");
                int u24 = kne.u(o, "requires_storage_not_low");
                int u25 = kne.u(o, "trigger_content_update_delay");
                int u26 = kne.u(o, "trigger_max_content_delay");
                int u27 = kne.u(o, "content_uri_triggers");
                int i7 = u14;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    String string = o.isNull(u) ? null : o.getString(u);
                    xog K = o5a.K(o.getInt(u2));
                    String string2 = o.isNull(u3) ? null : o.getString(u3);
                    String string3 = o.isNull(u4) ? null : o.getString(u4);
                    t64 a3 = t64.a(o.isNull(u5) ? null : o.getBlob(u5));
                    t64 a4 = t64.a(o.isNull(u6) ? null : o.getBlob(u6));
                    long j2 = o.getLong(u7);
                    long j3 = o.getLong(u8);
                    long j4 = o.getLong(u9);
                    int i8 = o.getInt(u10);
                    ag0 H = o5a.H(o.getInt(u11));
                    long j5 = o.getLong(u12);
                    long j6 = o.getLong(u13);
                    int i9 = i7;
                    long j7 = o.getLong(i9);
                    int i10 = u;
                    int i11 = u15;
                    long j8 = o.getLong(i11);
                    u15 = i11;
                    int i12 = u16;
                    if (o.getInt(i12) != 0) {
                        u16 = i12;
                        i2 = u17;
                        z = true;
                    } else {
                        u16 = i12;
                        i2 = u17;
                        z = false;
                    }
                    t5b J = o5a.J(o.getInt(i2));
                    u17 = i2;
                    int i13 = u18;
                    int i14 = o.getInt(i13);
                    u18 = i13;
                    int i15 = u19;
                    int i16 = o.getInt(i15);
                    u19 = i15;
                    int i17 = u20;
                    int I = o5a.I(o.getInt(i17));
                    u20 = i17;
                    int i18 = u21;
                    if (o.getInt(i18) != 0) {
                        u21 = i18;
                        i3 = u22;
                        z2 = true;
                    } else {
                        u21 = i18;
                        i3 = u22;
                        z2 = false;
                    }
                    if (o.getInt(i3) != 0) {
                        u22 = i3;
                        i4 = u23;
                        z3 = true;
                    } else {
                        u22 = i3;
                        i4 = u23;
                        z3 = false;
                    }
                    if (o.getInt(i4) != 0) {
                        u23 = i4;
                        i5 = u24;
                        z4 = true;
                    } else {
                        u23 = i4;
                        i5 = u24;
                        z4 = false;
                    }
                    if (o.getInt(i5) != 0) {
                        u24 = i5;
                        i6 = u25;
                        z5 = true;
                    } else {
                        u24 = i5;
                        i6 = u25;
                        z5 = false;
                    }
                    long j9 = o.getLong(i6);
                    u25 = i6;
                    int i19 = u26;
                    long j10 = o.getLong(i19);
                    u26 = i19;
                    int i20 = u27;
                    u27 = i20;
                    arrayList.add(new xpg(string, K, string2, string3, a3, a4, j2, j3, j4, new wj3(I, z2, z3, z4, z5, j9, j10, o5a.g(o.isNull(i20) ? null : o.getBlob(i20))), i8, H, j5, j6, j7, j8, z, J, i14, i16));
                    u = i10;
                    i7 = i9;
                }
                o.close();
                d7d.o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = a2;
            o.close();
            d7d.o();
            throw th;
        }
    }

    public ArrayList i() {
        d7d d7d;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        d7d a2 = d7d.a(0, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        i6d i6d = (i6d) this.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o, "id");
            int u2 = kne.u(o, "state");
            int u3 = kne.u(o, "worker_class_name");
            int u4 = kne.u(o, "input_merger_class_name");
            int u5 = kne.u(o, "input");
            int u6 = kne.u(o, "output");
            int u7 = kne.u(o, "initial_delay");
            int u8 = kne.u(o, "interval_duration");
            int u9 = kne.u(o, "flex_duration");
            int u10 = kne.u(o, "run_attempt_count");
            int u11 = kne.u(o, "backoff_policy");
            int u12 = kne.u(o, "backoff_delay_duration");
            int u13 = kne.u(o, "last_enqueue_time");
            int u14 = kne.u(o, "minimum_retention_duration");
            d7d = a2;
            try {
                int u15 = kne.u(o, "schedule_requested_at");
                int u16 = kne.u(o, "run_in_foreground");
                int u17 = kne.u(o, "out_of_quota_policy");
                int u18 = kne.u(o, "period_count");
                int u19 = kne.u(o, "generation");
                int u20 = kne.u(o, "required_network_type");
                int u21 = kne.u(o, "requires_charging");
                int u22 = kne.u(o, "requires_device_idle");
                int u23 = kne.u(o, "requires_battery_not_low");
                int u24 = kne.u(o, "requires_storage_not_low");
                int u25 = kne.u(o, "trigger_content_update_delay");
                int u26 = kne.u(o, "trigger_max_content_delay");
                int u27 = kne.u(o, "content_uri_triggers");
                int i7 = u14;
                ArrayList arrayList = new ArrayList(o.getCount());
                while (o.moveToNext()) {
                    String string = o.isNull(u) ? null : o.getString(u);
                    xog K = o5a.K(o.getInt(u2));
                    String string2 = o.isNull(u3) ? null : o.getString(u3);
                    String string3 = o.isNull(u4) ? null : o.getString(u4);
                    t64 a3 = t64.a(o.isNull(u5) ? null : o.getBlob(u5));
                    t64 a4 = t64.a(o.isNull(u6) ? null : o.getBlob(u6));
                    long j2 = o.getLong(u7);
                    long j3 = o.getLong(u8);
                    long j4 = o.getLong(u9);
                    int i8 = o.getInt(u10);
                    ag0 H = o5a.H(o.getInt(u11));
                    long j5 = o.getLong(u12);
                    long j6 = o.getLong(u13);
                    int i9 = i7;
                    long j7 = o.getLong(i9);
                    int i10 = u;
                    int i11 = u15;
                    long j8 = o.getLong(i11);
                    u15 = i11;
                    int i12 = u16;
                    if (o.getInt(i12) != 0) {
                        u16 = i12;
                        i2 = u17;
                        z = true;
                    } else {
                        u16 = i12;
                        i2 = u17;
                        z = false;
                    }
                    t5b J = o5a.J(o.getInt(i2));
                    u17 = i2;
                    int i13 = u18;
                    int i14 = o.getInt(i13);
                    u18 = i13;
                    int i15 = u19;
                    int i16 = o.getInt(i15);
                    u19 = i15;
                    int i17 = u20;
                    int I = o5a.I(o.getInt(i17));
                    u20 = i17;
                    int i18 = u21;
                    if (o.getInt(i18) != 0) {
                        u21 = i18;
                        i3 = u22;
                        z2 = true;
                    } else {
                        u21 = i18;
                        i3 = u22;
                        z2 = false;
                    }
                    if (o.getInt(i3) != 0) {
                        u22 = i3;
                        i4 = u23;
                        z3 = true;
                    } else {
                        u22 = i3;
                        i4 = u23;
                        z3 = false;
                    }
                    if (o.getInt(i4) != 0) {
                        u23 = i4;
                        i5 = u24;
                        z4 = true;
                    } else {
                        u23 = i4;
                        i5 = u24;
                        z4 = false;
                    }
                    if (o.getInt(i5) != 0) {
                        u24 = i5;
                        i6 = u25;
                        z5 = true;
                    } else {
                        u24 = i5;
                        i6 = u25;
                        z5 = false;
                    }
                    long j9 = o.getLong(i6);
                    u25 = i6;
                    int i19 = u26;
                    long j10 = o.getLong(i19);
                    u26 = i19;
                    int i20 = u27;
                    u27 = i20;
                    arrayList.add(new xpg(string, K, string2, string3, a3, a4, j2, j3, j4, new wj3(I, z2, z3, z4, z5, j9, j10, o5a.g(o.isNull(i20) ? null : o.getBlob(i20))), i8, H, j5, j6, j7, j8, z, J, i14, i16));
                    u = i10;
                    i7 = i9;
                }
                o.close();
                d7d.o();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                o.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = a2;
            o.close();
            d7d.o();
            throw th;
        }
    }

    public xog j(String str) {
        d7d a2 = d7d.a(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            a2.X(1);
        } else {
            a2.h(1, str);
        }
        i6d i6d = (i6d) this.a;
        i6d.b();
        xog xog = null;
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            if (o.moveToFirst()) {
                Integer valueOf = o.isNull(0) ? null : Integer.valueOf(o.getInt(0));
                if (valueOf != null) {
                    xog = o5a.K(valueOf.intValue());
                }
            }
            return xog;
        } finally {
            o.close();
            a2.o();
        }
    }

    public ArrayList k(String str) {
        d7d a2 = d7d.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            a2.X(1);
        } else {
            a2.h(1, str);
        }
        i6d i6d = (i6d) this.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(o.isNull(0) ? null : o.getString(0));
            }
            return arrayList;
        } finally {
            o.close();
            a2.o();
        }
    }

    public ArrayList l(String str) {
        d7d a2 = d7d.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            a2.X(1);
        } else {
            a2.h(1, str);
        }
        i6d i6d = (i6d) this.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                arrayList.add(o.isNull(0) ? null : o.getString(0));
            }
            return arrayList;
        } finally {
            o.close();
            a2.o();
        }
    }

    public xpg m(String str) {
        d7d d7d;
        xpg xpg;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        int i6;
        String str2 = str;
        d7d a2 = d7d.a(1, "SELECT * FROM workspec WHERE id=?");
        if (str2 == null) {
            a2.X(1);
        } else {
            a2.h(1, str2);
        }
        i6d i6d = (i6d) this.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            int u = kne.u(o, "id");
            int u2 = kne.u(o, "state");
            int u3 = kne.u(o, "worker_class_name");
            int u4 = kne.u(o, "input_merger_class_name");
            int u5 = kne.u(o, "input");
            int u6 = kne.u(o, "output");
            int u7 = kne.u(o, "initial_delay");
            int u8 = kne.u(o, "interval_duration");
            int u9 = kne.u(o, "flex_duration");
            int u10 = kne.u(o, "run_attempt_count");
            int u11 = kne.u(o, "backoff_policy");
            int u12 = kne.u(o, "backoff_delay_duration");
            int u13 = kne.u(o, "last_enqueue_time");
            int u14 = kne.u(o, "minimum_retention_duration");
            d7d = a2;
            try {
                int u15 = kne.u(o, "schedule_requested_at");
                int u16 = kne.u(o, "run_in_foreground");
                int u17 = kne.u(o, "out_of_quota_policy");
                int u18 = kne.u(o, "period_count");
                int u19 = kne.u(o, "generation");
                int u20 = kne.u(o, "required_network_type");
                int u21 = kne.u(o, "requires_charging");
                int u22 = kne.u(o, "requires_device_idle");
                int u23 = kne.u(o, "requires_battery_not_low");
                int u24 = kne.u(o, "requires_storage_not_low");
                int u25 = kne.u(o, "trigger_content_update_delay");
                int u26 = kne.u(o, "trigger_max_content_delay");
                int u27 = kne.u(o, "content_uri_triggers");
                if (o.moveToFirst()) {
                    String string = o.isNull(u) ? null : o.getString(u);
                    xog K = o5a.K(o.getInt(u2));
                    String string2 = o.isNull(u3) ? null : o.getString(u3);
                    String string3 = o.isNull(u4) ? null : o.getString(u4);
                    t64 a3 = t64.a(o.isNull(u5) ? null : o.getBlob(u5));
                    t64 a4 = t64.a(o.isNull(u6) ? null : o.getBlob(u6));
                    long j2 = o.getLong(u7);
                    long j3 = o.getLong(u8);
                    long j4 = o.getLong(u9);
                    int i7 = o.getInt(u10);
                    ag0 H = o5a.H(o.getInt(u11));
                    long j5 = o.getLong(u12);
                    long j6 = o.getLong(u13);
                    long j7 = o.getLong(u14);
                    long j8 = o.getLong(u15);
                    if (o.getInt(u16) != 0) {
                        i2 = u17;
                        z = true;
                    } else {
                        z = false;
                        i2 = u17;
                    }
                    t5b J = o5a.J(o.getInt(i2));
                    int i8 = o.getInt(u18);
                    int i9 = o.getInt(u19);
                    int I = o5a.I(o.getInt(u20));
                    if (o.getInt(u21) != 0) {
                        i3 = u22;
                        z2 = true;
                    } else {
                        z2 = false;
                        i3 = u22;
                    }
                    if (o.getInt(i3) != 0) {
                        i4 = u23;
                        z3 = true;
                    } else {
                        z3 = false;
                        i4 = u23;
                    }
                    if (o.getInt(i4) != 0) {
                        i5 = u24;
                        z4 = true;
                    } else {
                        z4 = false;
                        i5 = u24;
                    }
                    if (o.getInt(i5) != 0) {
                        i6 = u25;
                        z5 = true;
                    } else {
                        z5 = false;
                        i6 = u25;
                    }
                    xpg = new xpg(string, K, string2, string3, a3, a4, j2, j3, j4, new wj3(I, z2, z3, z4, z5, o.getLong(i6), o.getLong(u26), o5a.g(o.isNull(u27) ? null : o.getBlob(u27))), i7, H, j5, j6, j7, j8, z, J, i8, i9);
                } else {
                    xpg = null;
                }
                o.close();
                d7d.o();
                return xpg;
            } catch (Throwable th) {
                th = th;
                o.close();
                d7d.o();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d7d = a2;
            o.close();
            d7d.o();
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, vpg] */
    public ArrayList n(String str) {
        d7d a2 = d7d.a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            a2.X(1);
        } else {
            a2.h(1, str);
        }
        i6d i6d = (i6d) this.a;
        i6d.b();
        Cursor o = i6d.o(a2, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                String string = o.isNull(0) ? null : o.getString(0);
                xog K = o5a.K(o.getInt(1));
                ? obj = new Object();
                obj.a = string;
                obj.b = K;
                arrayList.add(obj);
            }
            return arrayList;
        } finally {
            o.close();
            a2.o();
        }
    }

    public void o(long j2, String str) {
        i6d i6d = (i6d) this.a;
        i6d.b();
        ppg ppg = (ppg) this.k;
        gf6 E = ppg.E();
        E.k(1, j2);
        if (str == null) {
            E.X(2);
        } else {
            E.h(2, str);
        }
        i6d.c();
        try {
            E.n();
            i6d.r();
        } finally {
            i6d.l();
            ppg.S(E);
        }
    }

    public void p(long j2, String str) {
        i6d i6d = (i6d) this.a;
        i6d.b();
        ppg ppg = (ppg) this.h;
        gf6 E = ppg.E();
        E.k(1, j2);
        if (str == null) {
            E.X(2);
        } else {
            E.h(2, str);
        }
        i6d.c();
        try {
            E.n();
            i6d.r();
        } finally {
            i6d.l();
            ppg.S(E);
        }
    }

    public void q(String str, t64 t64) {
        i6d i6d = (i6d) this.a;
        i6d.b();
        ppg ppg = (ppg) this.g;
        gf6 E = ppg.E();
        byte[] f2 = t64.f(t64);
        if (f2 == null) {
            E.X(1);
        } else {
            E.l(1, f2);
        }
        if (str == null) {
            E.X(2);
        } else {
            E.h(2, str);
        }
        i6d.c();
        try {
            E.n();
            i6d.r();
        } finally {
            i6d.l();
            ppg.S(E);
        }
    }

    public void r(xog xog, String str) {
        i6d i6d = (i6d) this.a;
        i6d.b();
        ppg ppg = (ppg) this.e;
        gf6 E = ppg.E();
        E.k(1, (long) o5a.h0(xog));
        if (str == null) {
            E.X(2);
        } else {
            E.h(2, str);
        }
        i6d.c();
        try {
            E.n();
            i6d.r();
        } finally {
            i6d.l();
            ppg.S(E);
        }
    }

    public ypg() {
        this.a = new w8d();
        this.b = new w8d();
        this.c = new w8d();
        this.d = new w8d();
        this.e = new d0(c44.DEFAULT_ASPECT_RATIO);
        this.f = new d0(c44.DEFAULT_ASPECT_RATIO);
        this.g = new d0(c44.DEFAULT_ASPECT_RATIO);
        this.h = new d0(c44.DEFAULT_ASPECT_RATIO);
        this.i = new Object();
        this.j = new Object();
        this.k = new Object();
        this.l = new Object();
    }
}
