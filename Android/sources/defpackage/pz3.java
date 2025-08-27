package defpackage;

import kotlin.reflect.KProperty;

/* renamed from: pz3  reason: default package */
public final class pz3 {
    public static final /* synthetic */ KProperty[] d;
    public static final String e;
    public final hs7 a;
    public final hs7 b;
    public final hs7 c;

    static {
        Class<pz3> cls = pz3.class;
        d = new KProperty[]{wj6.p(cls, "appPrefs", "getAppPrefs()Lru/ok/tamtam/prefs/AppPrefs;", 0), wj6.p(cls, "videoConverter", "getVideoConverter()Lru/ok/tamtam/media/converter/VideoConverter;", 0), wj6.p(cls, "mediaProcessor", "getMediaProcessor()Lru/ok/tamtam/MediaProcessor;", 0)};
        e = cls.getName();
    }

    public pz3(hs7 hs7, hs7 hs72, hs7 hs73) {
        this.a = hs7;
        this.b = hs72;
        this.c = hs73;
    }

    /* JADX WARNING: type inference failed for: r5v25, types: [java.lang.Comparable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.jha a(defpackage.qf9 r13) {
        /*
            r12 = this;
            r0 = 0
            r1 = 2
            r2 = 1
            java.lang.String r3 = e
            java.lang.String r4 = "convertVideo: messageUpload = %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r13}
            defpackage.z68.c(r3, r4, r5)
            xyf r3 = r13.d
            xyf r4 = defpackage.xyf.VIDEO
            if (r3 == r4) goto L_0x0019
            ija r12 = defpackage.jha.q(r13)
            return r12
        L_0x0019:
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            r3.element = r13
            p4g r4 = r13.e
            if (r4 != 0) goto L_0x00be
            we8 r13 = r13.a()
            i20 r4 = new i20
            r4.<init>(r2)
            T r5 = r3.element
            qf9 r5 = (defpackage.qf9) r5
            kotlin.reflect.KProperty[] r6 = d
            r7 = r6[r0]
            hs7 r7 = r12.a
            java.lang.Object r7 = r7.get()
            fq r7 = (defpackage.fq) r7
            pid r7 = (defpackage.pid) r7
            y3g r7 = r7.p()
            qac r7 = r7.a
            r6 = r6[r1]
            hs7 r6 = r12.c
            java.lang.Object r6 = r6.get()
            ou8 r6 = (defpackage.ou8) r6
            java.lang.String r5 = r5.b
            wj0 r6 = (defpackage.wj0) r6
            r6.getClass()
            r8 = 0
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x0062 }
            android.content.Context r9 = r6.a     // Catch:{ all -> 0x0062 }
            java.util.ArrayList r5 = defpackage.sac.a(r5, r9, r6)     // Catch:{ all -> 0x0062 }
            goto L_0x006b
        L_0x0062:
            r5 = move-exception
            java.lang.String r6 = "wj0"
            java.lang.String r9 = "getAvailableQualitiesForVideo: failed"
            defpackage.z68.f(r6, r9, r5)
            r5 = r8
        L_0x006b:
            if (r5 != 0) goto L_0x006e
            goto L_0x00ae
        L_0x006e:
            java.util.Iterator r5 = r5.iterator()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L_0x0079
            goto L_0x00a0
        L_0x0079:
            java.lang.Object r8 = r5.next()
            boolean r6 = r5.hasNext()
            if (r6 != 0) goto L_0x0084
            goto L_0x00a0
        L_0x0084:
            r6 = r8
            rac r6 = (defpackage.rac) r6
            qac r6 = r6.a
        L_0x0089:
            java.lang.Object r9 = r5.next()
            r10 = r9
            rac r10 = (defpackage.rac) r10
            qac r10 = r10.a
            int r11 = r6.compareTo(r10)
            if (r11 <= 0) goto L_0x009a
            r8 = r9
            r6 = r10
        L_0x009a:
            boolean r9 = r5.hasNext()
            if (r9 != 0) goto L_0x0089
        L_0x00a0:
            rac r8 = (defpackage.rac) r8
            if (r8 != 0) goto L_0x00a5
            goto L_0x00ae
        L_0x00a5:
            qac r5 = r8.a
            java.lang.Comparable r5 = kotlin.ranges.RangesKt.coerceAtLeast(r5, r7)
            r7 = r5
            qac r7 = (defpackage.qac) r7
        L_0x00ae:
            r4.a = r7
            p4g r5 = new p4g
            r5.<init>(r4)
            r13.e = r5
            qf9 r4 = new qf9
            r4.<init>(r13)
            r3.element = r4
        L_0x00be:
            T r13 = r3.element
            r4 = r13
            qf9 r4 = (defpackage.qf9) r4
            p4g r4 = r4.e
            if (r4 != 0) goto L_0x00cc
            ija r12 = defpackage.jha.q(r13)
            return r12
        L_0x00cc:
            i20 r13 = new i20
            r13.<init>(r2)
            qac r5 = r4.a
            r13.a = r5
            float r5 = r4.b
            r13.b = r5
            float r5 = r4.c
            r13.c = r5
            boolean r4 = r4.d
            r13.d = r4
            p4g r4 = new p4g
            r4.<init>(r13)
            p7d r13 = new p7d
            r5 = 25
            r13.<init>((int) r5)
            T r5 = r3.element
            qf9 r5 = (defpackage.qf9) r5
            java.lang.String r5 = r5.b
            r13.b = r5
            r13.c = r4
            k4g r4 = new k4g
            r4.<init>(r13)
            kotlin.reflect.KProperty[] r13 = d
            r13 = r13[r2]
            hs7 r12 = r12.b
            java.lang.Object r12 = r12.get()
            t4g r12 = (defpackage.t4g) r12
            monitor-enter(r12)
            java.lang.String r13 = "t4g"
            java.lang.String r5 = "convertVideo: %s"
            java.lang.Object[] r6 = new java.lang.Object[]{r4}     // Catch:{ all -> 0x01c4 }
            defpackage.z68.c(r13, r5, r6)     // Catch:{ all -> 0x01c4 }
            java.util.HashMap r13 = r12.i     // Catch:{ all -> 0x01c4 }
            java.lang.Object r13 = r13.get(r4)     // Catch:{ all -> 0x01c4 }
            jha r13 = (defpackage.jha) r13     // Catch:{ all -> 0x01c4 }
            if (r13 == 0) goto L_0x0121
            monitor-exit(r12)
            goto L_0x01ad
        L_0x0121:
            v4g r13 = r12.b     // Catch:{ all -> 0x01c4 }
            wbe r13 = r13.a()     // Catch:{ all -> 0x01c4 }
            q4g r5 = new q4g     // Catch:{ all -> 0x01c4 }
            r5.<init>(r4, r2)     // Catch:{ all -> 0x01c4 }
            wh8 r6 = new wh8     // Catch:{ all -> 0x01c4 }
            r6.<init>(r1, r13, r5)     // Catch:{ all -> 0x01c4 }
            hxf r13 = new hxf     // Catch:{ all -> 0x01c4 }
            r5 = 13
            r13.<init>(r5)     // Catch:{ all -> 0x01c4 }
            ai8 r5 = new ai8     // Catch:{ all -> 0x01c4 }
            r5.<init>(r6, r13, r2)     // Catch:{ all -> 0x01c4 }
            hxf r13 = new hxf     // Catch:{ all -> 0x01c4 }
            r6 = 11
            r13.<init>(r6)     // Catch:{ all -> 0x01c4 }
            si8 r6 = new si8     // Catch:{ all -> 0x01c4 }
            gga r7 = defpackage.m58.f     // Catch:{ all -> 0x01c4 }
            dj6 r8 = defpackage.m58.e     // Catch:{ all -> 0x01c4 }
            r6.<init>(r5, r13, r7, r8)     // Catch:{ all -> 0x01c4 }
            z52 r13 = new z52     // Catch:{ all -> 0x01c4 }
            r5 = 12
            r13.<init>(r5, r12, r4)     // Catch:{ all -> 0x01c4 }
            bi8 r5 = new bi8     // Catch:{ all -> 0x01c4 }
            r5.<init>(r13)     // Catch:{ all -> 0x01c4 }
            qi8 r13 = new qi8     // Catch:{ all -> 0x01c4 }
            r13.<init>(r6, r5)     // Catch:{ all -> 0x01c4 }
            s4g r5 = new s4g     // Catch:{ all -> 0x01c4 }
            r5.<init>(r12, r0)     // Catch:{ all -> 0x01c4 }
            wh8 r0 = new wh8     // Catch:{ all -> 0x01c4 }
            r0.<init>(r2, r13, r5)     // Catch:{ all -> 0x01c4 }
            boolean r13 = r0 instanceof defpackage.kj6     // Catch:{ all -> 0x01c4 }
            if (r13 == 0) goto L_0x0173
            kj6 r0 = (defpackage.kj6) r0     // Catch:{ all -> 0x01c4 }
            jha r13 = r0.d()     // Catch:{ all -> 0x01c4 }
            goto L_0x0178
        L_0x0173:
            gb3 r13 = new gb3     // Catch:{ all -> 0x01c4 }
            r13.<init>(r1, r0)     // Catch:{ all -> 0x01c4 }
        L_0x0178:
            hzf r0 = new hzf     // Catch:{ all -> 0x01c4 }
            r5 = 6
            r0.<init>(r5, r12, r4)     // Catch:{ all -> 0x01c4 }
            iia r13 = r13.j(r0)     // Catch:{ all -> 0x01c4 }
            xbf r0 = new xbf     // Catch:{ all -> 0x01c4 }
            r5 = 16
            r0.<init>((int) r5, (java.lang.Object) r12, (java.lang.Object) r4)     // Catch:{ all -> 0x01c4 }
            rha r5 = new rha     // Catch:{ all -> 0x01c4 }
            r5.<init>(r13, r7, r0, r1)     // Catch:{ all -> 0x01c4 }
            s4g r13 = new s4g     // Catch:{ all -> 0x01c4 }
            r13.<init>(r12, r2)     // Catch:{ all -> 0x01c4 }
            rha r0 = new rha     // Catch:{ all -> 0x01c4 }
            r0.<init>(r5, r13, r8, r1)     // Catch:{ all -> 0x01c4 }
            bka r13 = r0.t()     // Catch:{ all -> 0x01c4 }
            sja r0 = new sja     // Catch:{ all -> 0x01c4 }
            r0.<init>(r13)     // Catch:{ all -> 0x01c4 }
            lfd r13 = r12.f     // Catch:{ all -> 0x01c4 }
            pka r13 = r0.x(r13)     // Catch:{ all -> 0x01c4 }
            java.util.HashMap r0 = r12.i     // Catch:{ all -> 0x01c4 }
            r0.put(r4, r13)     // Catch:{ all -> 0x01c4 }
            monitor-exit(r12)
        L_0x01ad:
            djd r12 = defpackage.djd.o
            gga r0 = defpackage.m58.f
            dj6 r1 = defpackage.m58.e
            iia r2 = new iia
            r2.<init>(r13, r12, r0, r1)
            oz3 r12 = new oz3
            r12.<init>(r3)
            yia r13 = new yia
            r0 = 3
            r13.<init>(r2, r12, r0)
            return r13
        L_0x01c4:
            r13 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x01c4 }
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz3.a(qf9):jha");
    }
}
