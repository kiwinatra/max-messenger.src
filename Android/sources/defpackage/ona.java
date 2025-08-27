package defpackage;

import kotlin.jvm.functions.Function0;
import one.me.android.OneMeApplication;

/* renamed from: ona  reason: default package */
public final /* synthetic */ class ona implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ OneMeApplication b;

    public /* synthetic */ ona(OneMeApplication oneMeApplication, int i) {
        this.a = i;
        this.b = oneMeApplication;
    }

    /* JADX WARNING: type inference failed for: r1v39, types: [wtd, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v12, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARNING: type inference failed for: r5v14, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARNING: type inference failed for: r4v20, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARNING: type inference failed for: r2v50, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0754  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0758  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r18 = this;
            r1 = r18
            java.lang.Class<kn4> r0 = defpackage.kn4.class
            r2 = 27
            r3 = -1
            java.lang.Class<qjd> r5 = defpackage.qjd.class
            r6 = 0
            r7 = 5
            r8 = 3
            r9 = 1
            r10 = 2
            r11 = 0
            int r12 = r1.a
            switch(r12) {
                case 0: goto L_0x07ec;
                case 1: goto L_0x06b3;
                case 2: goto L_0x06a3;
                case 3: goto L_0x0697;
                case 4: goto L_0x068b;
                case 5: goto L_0x0667;
                case 6: goto L_0x0635;
                case 7: goto L_0x0611;
                case 8: goto L_0x05ee;
                case 9: goto L_0x05ce;
                case 10: goto L_0x05ad;
                case 11: goto L_0x0555;
                case 12: goto L_0x047f;
                case 13: goto L_0x0423;
                case 14: goto L_0x0414;
                case 15: goto L_0x0406;
                case 16: goto L_0x031c;
                case 17: goto L_0x02f5;
                case 18: goto L_0x02d6;
                case 19: goto L_0x02be;
                case 20: goto L_0x0214;
                case 21: goto L_0x01fc;
                case 22: goto L_0x01d3;
                case 23: goto L_0x01ad;
                case 24: goto L_0x017f;
                case 25: goto L_0x013f;
                case 26: goto L_0x0112;
                case 27: goto L_0x00b8;
                case 28: goto L_0x009c;
                default: goto L_0x0015;
            }
        L_0x0015:
            int r0 = one.me.android.OneMeApplication.X
            v9a r0 = new v9a
            one.me.android.OneMeApplication r0 = r1.b
            ym r0 = r0.g()
            sjd r1 = defpackage.sjd.a
            nd r1 = r1.c()
            ktb r2 = defpackage.ktb.a
            q4 r2 = r2.getAccessor()
            java.lang.Object r2 = r2.g(r5)
            qjd r2 = (defpackage.qjd) r2
            java.lang.String r3 = "v9a"
            java.lang.String r4 = "execute"
            defpackage.z68.c(r3, r4, new java.lang.Object[0])
            android.content.pm.PackageManager r4 = r0.getPackageManager()     // Catch:{ all -> 0x0093 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ all -> 0x0093 }
            java.lang.String r0 = r4.getInstallerPackageName(r0)     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x008d
            int r4 = r0.length()
            if (r4 != 0) goto L_0x004d
            goto L_0x008d
        L_0x004d:
            java.lang.String r4 = "execute: installer %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r0}
            defpackage.z68.c(r3, r4, r5)
            r4 = 32
            r5 = 95
            java.lang.String r0 = kotlin.text.StringsKt__StringsJVMKt.replace$default((java.lang.String) r0, (char) r4, (char) r5, false, 4, (java.lang.Object) null)
            r4 = 47
            java.lang.String r0 = kotlin.text.StringsKt__StringsJVMKt.replace$default((java.lang.String) r0, (char) r4, (char) r5, false, 4, (java.lang.Object) null)
            ls7 r4 = r2.g
            java.lang.String r5 = "install-market"
            java.lang.String r4 = r4.getString(r5, r11)
            java.lang.String r6 = "execute: prevInstaller %s"
            java.lang.Object[] r7 = new java.lang.Object[]{r4}
            defpackage.z68.c(r3, r6, r7)
            if (r4 == 0) goto L_0x0084
            int r3 = r4.length()
            if (r3 != 0) goto L_0x007e
            goto L_0x0084
        L_0x007e:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r0)
            if (r3 != 0) goto L_0x0099
        L_0x0084:
            r2.l(r5, r0)
            java.lang.String r2 = "INSTALLER"
            r1.f(r2, r0)
            goto L_0x0099
        L_0x008d:
            java.lang.String r0 = "installer is empty"
            defpackage.z68.p(r3, r0)
            goto L_0x0099
        L_0x0093:
            r0 = move-exception
            java.lang.String r1 = "could not get installer package name"
            defpackage.z68.f(r3, r1, r0)
        L_0x0099:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x009c:
            int r0 = one.me.android.OneMeApplication.X
            one.me.android.OneMeApplication r0 = r1.b
            ym r0 = r0.g()
            kotlin.Lazy r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            id3 r0 = (defpackage.id3) r0
            qra r0 = (defpackage.qra) r0
            tcf r0 = r0.I()
            r0.j()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00b8:
            int r0 = one.me.android.OneMeApplication.X
            qra r0 = defpackage.qra.a
            q4 r0 = r0.getAccessor()
            java.lang.Class<rta> r2 = defpackage.rta.class
            java.lang.Object r0 = r0.g(r2)
            rta r0 = (defpackage.rta) r0
            qm7 r2 = defpackage.kv0.b()
            sjd r3 = defpackage.sjd.a
            q4 r4 = r3.getAccessor()
            java.lang.Class<s04> r5 = defpackage.s04.class
            java.lang.Object r4 = r4.g(r5)
            s04 r4 = (defpackage.s04) r4
            kotlin.coroutines.CoroutineContext r2 = kotlin.coroutines.CoroutineContext.Element.DefaultImpls.plus(r2, r4)
            gaf r3 = r3.y()
            osa r3 = (defpackage.osa) r3
            gc8 r3 = r3.c()
            gc8 r3 = r3.t0()
            kotlin.coroutines.CoroutineContext r2 = r2.plus(r3)
            jx3 r2 = defpackage.e14.a(r2)
            fvf r3 = defpackage.dq4.b
            una r4 = new una
            one.me.android.OneMeApplication r1 = r1.b
            r4.<init>(r0, r1, r11)
            defpackage.ev0.v(r2, r3, r11, r4, r10)
            ome r0 = r0.a
            vna r3 = new vna
            r3.<init>(r1, r11)
            ps5 r1 = new ps5
            r1.<init>(r0, r3, r7)
            defpackage.bs0.K(r1, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0112:
            int r0 = one.me.android.OneMeApplication.X
            ru.ok.messages.TimeChangeReceiver r0 = new ru.ok.messages.TimeChangeReceiver
            r0.<init>()
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.intent.action.DATE_CHANGED"
            r2.<init>(r3)
            one.me.android.OneMeApplication r1 = r1.b
            r1.registerReceiver(r0, r2)
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.intent.action.TIME_SET"
            r2.<init>(r3)
            r1.registerReceiver(r0, r2)
            android.content.IntentFilter r2 = new android.content.IntentFilter
            java.lang.String r3 = "android.intent.action.TIMEZONE_CHANGED"
            r2.<init>(r3)
            r1.registerReceiver(r0, r2)
            ru.ok.messages.TimeChangeReceiver.a()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x013f:
            int r0 = one.me.android.OneMeApplication.X
            tna r0 = new tna
            one.me.android.OneMeApplication r1 = r1.b
            r0.<init>(r1)
            r1.registerActivityLifecycleCallbacks(r0)
            r04 r2 = defpackage.r04.a
            zna r3 = new zna
            r3.<init>(r2)
            one.me.android.di.ConcurrentComponent r2 = one.me.android.di.ConcurrentComponent.INSTANCE
            gaf r2 = r2.getDispatchers()
            osa r2 = (defpackage.osa) r2
            q04 r2 = r2.a()
            java.lang.String r4 = "chroma"
            q04 r2 = r2.s0(r9, r4)
            qm7 r4 = defpackage.kv0.b()
            kotlin.coroutines.CoroutineContext r2 = r2.plus(r4)
            kotlin.coroutines.CoroutineContext r2 = r2.plus(r3)
            jx3 r2 = defpackage.e14.a(r2)
            sna r3 = new sna
            r3.<init>(r1, r0, r11)
            defpackage.ev0.v(r2, r11, r11, r3, r8)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x017f:
            int r0 = one.me.android.OneMeApplication.X
            one.me.android.OneMeApplication r0 = r1.b
            ym r0 = r0.g()
            kotlin.Lazy r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            id3 r0 = (defpackage.id3) r0
            qra r0 = (defpackage.qra) r0
            q4 r0 = r0.getAccessor()
            java.lang.Class<zp1> r1 = defpackage.zp1.class
            java.lang.Object r0 = r0.g(r1)
            zp1 r0 = (defpackage.zp1) r0
            r0.getClass()
            xp1 r1 = new xp1
            r1.<init>(r0, r8)
            lfd r0 = r0.x0
            r0.c(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x01ad:
            int r0 = one.me.android.OneMeApplication.X
            one.me.android.OneMeApplication r0 = r1.b
            ym r0 = r0.g()
            kotlin.Lazy r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            id3 r0 = (defpackage.id3) r0
            qra r0 = (defpackage.qra) r0
            q4 r0 = r0.getAccessor()
            java.lang.Class<st3> r1 = defpackage.st3.class
            java.lang.Object r0 = r0.g(r1)
            st3 r0 = (defpackage.st3) r0
            sv0 r1 = r0.a
            r1.d(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x01d3:
            int r0 = one.me.android.OneMeApplication.X
            one.me.android.OneMeApplication r0 = r1.b
            ym r0 = r0.g()
            kotlin.Lazy r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            id3 r0 = (defpackage.id3) r0
            qra r0 = (defpackage.qra) r0
            q4 r0 = r0.getAccessor()
            java.lang.Class<jqg> r1 = defpackage.jqg.class
            java.lang.Object r0 = r0.g(r1)
            jqg r0 = (defpackage.jqg) r0
            iud r1 = new iud
            r1.<init>()
            r0.a(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x01fc:
            int r0 = one.me.android.OneMeApplication.X
            one.me.android.OneMeApplication r0 = r1.b
            ym r0 = r0.g()
            kotlin.Lazy r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            id3 r0 = (defpackage.id3) r0
            qra r0 = (defpackage.qra) r0
            r0.F()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0214:
            int r0 = one.me.android.OneMeApplication.X
            boa r0 = new boa
            one.me.android.OneMeApplication r1 = r1.b
            r0.<init>(r1)
            fk r1 = defpackage.ii.c
            java.util.concurrent.atomic.AtomicReference r2 = r1.a
            java.lang.Object r3 = r2.get()
            if (r3 != r0) goto L_0x0228
            goto L_0x0272
        L_0x0228:
            r2.set(r0)
            java.util.concurrent.ConcurrentHashMap r0 = r1.c
            r0.clear()
            java.util.concurrent.ConcurrentHashMap r0 = r1.b
            r0.clear()
            y35 r0 = new y35
            java.util.Map r2 = kotlin.collections.MapsKt.emptyMap()
            r0.<init>((java.util.Map) r2)
            r1.d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            y35 r2 = r1.d
            java.lang.Object r2 = r2.b
            java.util.Map r2 = (java.util.Map) r2
            java.util.Collection r2 = r2.values()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0255:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0270
            java.lang.Object r3 = r2.next()
            m25 r3 = (defpackage.m25) r3
            l25 r4 = r3.b
            if (r4 == 0) goto L_0x0255
            k15 r5 = new k15
            r5.<init>(r4)
            java.lang.String r3 = r3.a
            r0.put(r3, r5)
            goto L_0x0255
        L_0x0270:
            r1.e = r0
        L_0x0272:
            fk r0 = defpackage.ii.c
            y35 r1 = r0.d
            java.lang.Object r1 = r1.b
            java.util.Map r1 = (java.util.Map) r1
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0282:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02bb
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            m25 r3 = (defpackage.m25) r3
            l25 r3 = r3.b
            if (r3 == 0) goto L_0x0282
            java.net.URL r3 = r3.c
            if (r3 != 0) goto L_0x029d
            goto L_0x0282
        L_0x029d:
            java.lang.String r3 = r3.toString()
            qa7 r3 = defpackage.qa7.b(r3)
            if (r3 != 0) goto L_0x02a8
            goto L_0x0282
        L_0x02a8:
            ba7 r4 = defpackage.ld9.B()
            i0 r4 = r4.c(r3)
            wj r5 = new wj
            r5.<init>((defpackage.qa7) r3, (defpackage.fk) r0, (java.util.Map.Entry) r2)
            io1 r2 = defpackage.io1.a
            r4.m(r5, r2)
            goto L_0x0282
        L_0x02bb:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02be:
            int r0 = one.me.android.OneMeApplication.X
            one.me.android.OneMeApplication r0 = r1.b
            ym r0 = r0.g()
            kotlin.Lazy r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            id3 r0 = (defpackage.id3) r0
            qra r0 = (defpackage.qra) r0
            r0.C()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02d6:
            int r0 = one.me.android.OneMeApplication.X
            one.me.android.OneMeApplication r0 = r1.b
            ym r1 = r0.g()
            kotlin.Lazy r1 = r1.c
            r1.getValue()
            ktb r1 = defpackage.ktb.a
            q4 r1 = r1.getAccessor()
            java.lang.Object r1 = r1.g(r5)
            qjd r1 = (defpackage.qjd) r1
            defpackage.b0h.L(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02f5:
            int r0 = one.me.android.OneMeApplication.X
            one.me.android.di.ConcurrentComponent r0 = one.me.android.di.ConcurrentComponent.INSTANCE
            gaf r0 = r0.getDispatchers()
            osa r0 = (defpackage.osa) r0
            q04 r0 = r0.a()
            qm7 r2 = defpackage.kv0.b()
            kotlin.coroutines.CoroutineContext r0 = r0.plus(r2)
            jx3 r0 = defpackage.e14.a(r0)
            rna r2 = new rna
            one.me.android.OneMeApplication r1 = r1.b
            r2.<init>(r1, r11)
            defpackage.ev0.v(r0, r11, r11, r2, r8)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x031c:
            int r0 = one.me.android.OneMeApplication.X
            ktb r0 = defpackage.ktb.a
            akd r8 = r0.c()
            r8.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r12 = ru.ok.tamtam.android.prefs.PmsKey.f84mytrackerenabled
            boolean r8 = r8.m(r12, r9)
            if (r8 == 0) goto L_0x0403
            u4a r8 = defpackage.u4a.a
            akd r8 = r0.c()
            r8.getClass()
            boolean r8 = r8.m(r12, r9)
            r8 = r8 ^ r9
            if (r8 == 0) goto L_0x0341
            goto L_0x0403
        L_0x0341:
            q4 r0 = r0.getAccessor()
            java.lang.Object r0 = r0.g(r5)
            qjd r0 = (defpackage.qjd) r0
            long r8 = r0.s()
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x035f
            com.my.tracker.MyTrackerParams r3 = com.my.tracker.MyTracker.getTrackerParams()
            java.lang.String r4 = java.lang.String.valueOf(r8)
            r3.setCustomUserId(r4)
            goto L_0x0366
        L_0x035f:
            com.my.tracker.MyTrackerParams r3 = com.my.tracker.MyTracker.getTrackerParams()
            r3.setCustomUserId(r11)
        L_0x0366:
            com.my.tracker.MyTrackerConfig r3 = com.my.tracker.MyTracker.getTrackerConfig()
            com.my.tracker.MyTrackerConfig r3 = r3.setLocationTrackingMode(r6)
            q0a r4 = new q0a
            r5 = 17
            r4.<init>((int) r5)
            com.my.tracker.MyTrackerConfig r3 = r3.setOkHttpClientProvider(r4)
            com.my.tracker.MyTrackerConfig r3 = r3.setAutotrackingPurchaseEnabled(r6)
            com.my.tracker.MyTrackerConfig r3 = r3.setKidMode(r6)
            com.my.tracker.config.AntiFraudConfig$Builder r4 = com.my.tracker.config.AntiFraudConfig.newBuilder()
            com.my.tracker.config.AntiFraudConfig$Builder r4 = r4.useLightSensor(r6)
            com.my.tracker.config.AntiFraudConfig$Builder r4 = r4.usePressureSensor(r6)
            com.my.tracker.config.AntiFraudConfig$Builder r4 = r4.useGyroscopeSensor(r6)
            com.my.tracker.config.AntiFraudConfig$Builder r4 = r4.useProximitySensor(r6)
            com.my.tracker.config.AntiFraudConfig$Builder r4 = r4.useMagneticFieldSensor(r6)
            com.my.tracker.config.AntiFraudConfig r4 = r4.build()
            r3.setAntiFraudConfig(r4)
            java.lang.String r3 = "34982109644049932883"
            one.me.android.OneMeApplication r1 = r1.b
            com.my.tracker.MyTracker.initTracker(r3, r1)
            jha r3 = r0.t()
            co1 r3 = defpackage.kv0.h(r3)
            r4a r4 = new r4a
            r4.<init>(r10, r11)
            ps5 r5 = new ps5
            r5.<init>(r3, r4, r7)
            jx3 r3 = defpackage.u4a.b
            defpackage.bs0.K(r5, r3)
            qra r4 = defpackage.qra.a
            q4 r5 = r4.getAccessor()
            java.lang.Class<x88> r6 = defpackage.x88.class
            java.lang.Object r5 = r5.g(r6)
            x88 r5 = (defpackage.x88) r5
            dtc r5 = r5.stream()
            wb r6 = new wb
            r6.<init>(r2, r5, r0)
            ql8 r0 = new ql8
            r2 = 10
            r0.<init>(r6, r2)
            s4a r2 = new s4a
            r2.<init>(r10, r11)
            ps5 r5 = new ps5
            r5.<init>(r0, r2, r7)
            defpackage.bs0.K(r5, r3)
            java.lang.String r0 = com.my.tracker.MyTracker.getInstanceId(r1)     // Catch:{ all -> 0x03f7 }
            hn4 r1 = r4.n()     // Catch:{ all -> 0x03f7 }
            java.util.concurrent.atomic.AtomicReference r1 = r1.l     // Catch:{ all -> 0x03f7 }
            r1.set(r0)     // Catch:{ all -> 0x03f7 }
            goto L_0x0403
        L_0x03f7:
            r0 = move-exception
            java.lang.Class<u4a> r1 = defpackage.u4a.class
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "fail to fetch mytracker instance id"
            defpackage.z68.f(r1, r2, r0)
        L_0x0403:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0406:
            one.me.android.OneMeApplication r0 = r1.b
            int r1 = one.me.android.OneMeApplication.X
            q0a r1 = new q0a
            r1.<init>((one.me.android.OneMeApplication) r0)
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase.m = r1
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0414:
            int r0 = one.me.android.OneMeApplication.X
            zy1 r0 = new zy1
            one.me.android.OneMeApplication r1 = r1.b
            r0.<init>(r1)
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0423:
            int r0 = one.me.android.OneMeApplication.X
            one.me.android.OneMeApplication r0 = r1.b
            ym r1 = r0.g()
            fme[] r1 = r1.o
            java.util.Iterator r1 = kotlin.jvm.internal.ArrayIteratorKt.iterator(r1)
        L_0x0431:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x047c
            java.lang.Object r2 = r1.next()
            fme r2 = (defpackage.fme) r2
            ym r3 = r0.g()
            fsc r2 = (defpackage.fsc) r2
            r2.getClass()
            int r4 = defpackage.erc.a
            etc r4 = defpackage.scf.e0
            dsc r5 = new dsc
            r5.<init>(r10, r11)
            ps5 r8 = new ps5
            r8.<init>(r4, r5)
            on2 r4 = new on2
            r5 = 28
            r4.<init>(r8, r5)
            esc r5 = new esc
            r5.<init>(r10, r11)
            ps5 r8 = new ps5
            r8.<init>(r4, r5, r7)
            defpackage.bs0.K(r8, r2)
            defpackage.fsc.a(r3)
            ltb r2 = r3.c()
            cud r2 = r2.b
            csc r4 = new csc
            r4.<init>(r6, r3)
            java.util.concurrent.CopyOnWriteArraySet r2 = r2.n
            r2.add(r4)
            goto L_0x0431
        L_0x047c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x047f:
            int r0 = one.me.android.OneMeApplication.X
            one.me.android.OneMeApplication r0 = r1.b
            ym r0 = r0.g()
            kotlin.Lazy r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            id3 r0 = (defpackage.id3) r0
            qra r0 = (defpackage.qra) r0
            q4 r0 = r0.getAccessor()
            java.lang.Class<gc1> r1 = defpackage.gc1.class
            java.lang.Object r0 = r0.g(r1)
            gc1 r0 = (defpackage.gc1) r0
            ao1 r1 = r0.e
            if (r1 == 0) goto L_0x04a9
            boolean r1 = r1.f()
            if (r1 != 0) goto L_0x04a9
            goto L_0x0541
        L_0x04a9:
            kotlin.Lazy r1 = r0.a
            java.lang.Object r1 = r1.getValue()
            ic1 r1 = (defpackage.ic1) r1
            j6d r1 = r1.a
            mka r1 = r1.n()
            p9a r2 = defpackage.p9a.c
            wbe r1 = r1.i(r2)
            t9a r2 = defpackage.t9a.c
            wh8 r3 = new wh8
            r3.<init>(r10, r1, r2)
            u9a r1 = defpackage.u9a.c
            ai8 r2 = new ai8
            r2.<init>(r3, r1, r9)
            java.util.List r1 = java.util.Collections.emptyList()
            java.lang.String r3 = "defaultItem is null"
            java.util.Objects.requireNonNull(r1, r3)
            hb3 r3 = new hb3
            r3.<init>(r10, r2, r1)
            kotlin.Lazy r1 = r0.b
            java.lang.Object r1 = r1.getValue()
            lfd r1 = (defpackage.lfd) r1
            fce r1 = r3.n(r1)
            q0a r2 = new q0a
            r2.<init>((int) r6)
            oa3 r3 = new oa3
            r4 = 4
            r3.<init>(r4, r1, r2)
            fm0 r1 = new fm0
            r2 = 12
            r1.<init>(r2)
            yia r2 = new yia
            r2.<init>(r3, r1, r8)
            v00 r1 = new v00
            r1.<init>(r7)
            wbe r1 = r2.C(r1)
            kotlin.Lazy r2 = r0.c
            java.lang.Object r2 = r2.getValue()
            lfd r2 = (defpackage.lfd) r2
            fce r1 = r1.j(r2)
            fm0 r2 = new fm0
            r3 = 13
            r2.<init>(r3)
            tbe r3 = new tbe
            r3.<init>(r1, r2, r9)
            fm0 r1 = new fm0
            r2 = 14
            r1.<init>(r2)
            d9d r2 = new d9d
            r4 = 18
            r2.<init>(r4, r0)
            ekd r4 = defpackage.m58.g
            ao1 r5 = new ao1
            r5.<init>(r8, r2, r4)
            java.lang.String r2 = "observer is null"
            java.util.Objects.requireNonNull(r5, r2)
            vbe r2 = new vbe     // Catch:{ NullPointerException -> 0x0553, all -> 0x0544 }
            r2.<init>(r9, r1, r5)     // Catch:{ NullPointerException -> 0x0553, all -> 0x0544 }
            r3.l(r2)     // Catch:{ NullPointerException -> 0x0553, all -> 0x0544 }
            r0.e = r5
        L_0x0541:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0544:
            r0 = move-exception
            defpackage.hd8.Z(r0)
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "subscribeActual failed"
            r1.<init>(r2)
            r1.initCause(r0)
            throw r1
        L_0x0553:
            r0 = move-exception
            throw r0
        L_0x0555:
            one.me.android.OneMeApplication r0 = r1.b
            int r1 = one.me.android.OneMeApplication.X
            ym r0 = r0.g()
            r0.getClass()
            defpackage.scf.c0 = r0
            vpa r1 = defpackage.kv0.f
            if (r1 == 0) goto L_0x0567
            r11 = r1
        L_0x0567:
            r11.getClass()
            xtd r1 = defpackage.xtd.c
            gga r2 = defpackage.xtd.a
            r2.getClass()
            defpackage.xtd.b = r1
            wtd r1 = new wtd
            defpackage.kv0.J()
            r1.<init>()
            defpackage.dbe.w = r1
            xm r1 = new xm
            r1.<init>(r0)
            java.util.concurrent.CopyOnWriteArraySet r2 = defpackage.ytd.a
            r2.add(r1)
            android.app.Application r1 = r0.a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = defpackage.mad.a
            float r1 = r1.getDimension(r2)
            int r1 = (int) r1
            defpackage.ie0.w0 = r1
            r6 r1 = new r6
            r1.<init>(r10, r0)
            defpackage.ie0.x0 = r1
            int r0 = defpackage.nad.X1
            defpackage.yd0.n = r0
            defpackage.yd0.o = r0
            java.lang.String r0 = "ym"
            java.lang.String r1 = "onCreate finish"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x05ad:
            int r0 = one.me.android.OneMeApplication.X
            one.me.android.OneMeApplication r0 = r1.b
            ym r0 = r0.g()
            kotlin.Lazy r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            id3 r0 = (defpackage.id3) r0
            qra r0 = (defpackage.qra) r0
            q4 r0 = r0.getAccessor()
            java.lang.Class<aeb> r1 = defpackage.aeb.class
            java.lang.Object r0 = r0.g(r1)
            aeb r0 = (defpackage.aeb) r0
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x05ce:
            int r0 = one.me.android.OneMeApplication.X
            qra r0 = defpackage.qra.a
            q4 r0 = r0.getAccessor()
            java.lang.Class<xcb> r2 = defpackage.xcb.class
            java.lang.Object r0 = r0.g(r2)
            xcb r0 = (defpackage.xcb) r0
            r0.getClass()
            lj5 r2 = new lj5
            r2.<init>(r8, r0)
            one.me.android.OneMeApplication r0 = r1.b
            r0.registerActivityLifecycleCallbacks(r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x05ee:
            int r0 = one.me.android.OneMeApplication.X
            java.lang.String[] r0 = defpackage.n54.c
            java.lang.String[] r2 = defpackage.n54.d
            one.me.android.OneMeApplication r1 = r1.b
            boolean r2 = defpackage.n54.e(r1, r2)
            android.content.SharedPreferences r1 = defpackage.n54.m(r1)
            android.content.SharedPreferences$Editor r1 = r1.edit()
        L_0x0602:
            if (r6 >= r10) goto L_0x060b
            r3 = r0[r6]
            r1.putBoolean(r3, r2)
            int r6 = r6 + r9
            goto L_0x0602
        L_0x060b:
            r1.commit()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0611:
            int r0 = one.me.android.OneMeApplication.X
            one.me.android.OneMeApplication r0 = r1.b
            ym r1 = r0.g()
            kotlin.Lazy r1 = r1.c
            java.lang.Object r1 = r1.getValue()
            id3 r1 = (defpackage.id3) r1
            qra r1 = (defpackage.qra) r1
            q4 r1 = r1.getAccessor()
            java.lang.Class<k8> r2 = defpackage.k8.class
            java.lang.Object r1 = r1.g(r2)
            k8 r1 = (defpackage.k8) r1
            r0.registerActivityLifecycleCallbacks(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0635:
            int r0 = one.me.android.OneMeApplication.X
            one.me.android.OneMeApplication r0 = r1.b
            ym r1 = r0.g()
            kotlin.Lazy r1 = r1.c
            java.lang.Object r1 = r1.getValue()
            id3 r1 = (defpackage.id3) r1
            qra r1 = (defpackage.qra) r1
            fa9 r1 = r1.u()
            er7 r3 = new er7
            ym r0 = r0.g()
            kotlin.Lazy r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            id3 r0 = (defpackage.id3) r0
            qra r0 = (defpackage.qra) r0
            nd r0 = r0.c()
            r3.<init>((int) r2, (java.lang.Object) r0)
            r1.i = r3
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0667:
            one.me.android.OneMeApplication r1 = r1.b
            java.lang.String r1 = r1.y
            qra r2 = defpackage.qra.a
            q4 r2 = r2.getAccessor()
            java.lang.Object r0 = r2.g(r0)
            kn4 r0 = (defpackage.kn4) r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "performance.class = "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            defpackage.z68.c(r1, r0, new java.lang.Object[0])
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x068b:
            int r0 = one.me.android.OneMeApplication.X
            v6e r0 = new v6e
            v95 r2 = defpackage.xd3.a
            one.me.android.OneMeApplication r1 = r1.b
            r0.<init>(r1)
            return r0
        L_0x0697:
            int r0 = one.me.android.OneMeApplication.X
            js9 r0 = defpackage.fu4.k
            one.me.android.OneMeApplication r1 = r1.b
            r0.e(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x06a3:
            one.me.android.OneMeApplication r0 = r1.b
            int r1 = one.me.android.OneMeApplication.X
            e4 r1 = new e4
            r2 = 29
            r1.<init>((int) r2, (java.lang.Object) r0)
            defpackage.n54.v = r1
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x06b3:
            one.me.android.OneMeApplication r1 = r1.b
            int r2 = one.me.android.OneMeApplication.X
            qra r2 = defpackage.qra.a
            q4 r5 = r2.getAccessor()
            java.lang.Class<vpa> r6 = defpackage.vpa.class
            java.lang.Object r5 = r5.g(r6)
            vpa r5 = (defpackage.vpa) r5
            r5.getClass()
            ktb r5 = defpackage.ktb.a
            akd r5 = r5.c()
            ru.ok.tamtam.android.prefs.PmsKey r6 = ru.ok.tamtam.android.prefs.PmsKey.f8anrconfig
            java.lang.String r5 = r5.z(r6, r11)
            if (r5 != 0) goto L_0x06da
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x07eb
        L_0x06da:
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x0741 }
            r6.<init>((java.lang.String) r5)     // Catch:{ all -> 0x0741 }
            java.lang.String r12 = "enabled"
            boolean r12 = r6.optBoolean(r12)     // Catch:{ all -> 0x0741 }
            if (r12 != 0) goto L_0x06ea
        L_0x06e7:
            r0 = r11
            goto L_0x0752
        L_0x06ea:
            java.lang.String r12 = "timeout"
            org.json.JSONObject r6 = r6.optJSONObject(r12)     // Catch:{ all -> 0x0741 }
            if (r6 != 0) goto L_0x06f3
            goto L_0x06e7
        L_0x06f3:
            q4 r2 = r2.getAccessor()     // Catch:{ all -> 0x0741 }
            java.lang.Object r0 = r2.g(r0)     // Catch:{ all -> 0x0741 }
            kn4 r0 = (defpackage.kn4) r0     // Catch:{ all -> 0x0741 }
            java.lang.String r2 = "low"
            long r12 = r6.optLong(r2, r3)     // Catch:{ all -> 0x0741 }
            java.lang.String r2 = "avg"
            long r14 = r6.optLong(r2, r3)     // Catch:{ all -> 0x0741 }
            java.lang.String r2 = "high"
            long r16 = r6.optLong(r2, r3)     // Catch:{ all -> 0x0741 }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x0741 }
            if (r0 == 0) goto L_0x072e
            if (r0 == r9) goto L_0x0727
            if (r0 != r10) goto L_0x0721
            int r0 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x071e
            goto L_0x06e7
        L_0x071e:
            r12 = r16
            goto L_0x0733
        L_0x0721:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0741 }
            r0.<init>()     // Catch:{ all -> 0x0741 }
            throw r0     // Catch:{ all -> 0x0741 }
        L_0x0727:
            int r0 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x072c
            goto L_0x06e7
        L_0x072c:
            r12 = r14
            goto L_0x0733
        L_0x072e:
            int r0 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0733
            goto L_0x06e7
        L_0x0733:
            hl r0 = new hl     // Catch:{ all -> 0x0741 }
            kotlin.time.Duration$Companion r2 = kotlin.time.Duration.Companion     // Catch:{ all -> 0x0741 }
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.MILLISECONDS     // Catch:{ all -> 0x0741 }
            long r2 = kotlin.time.DurationKt.toDuration((long) r12, (kotlin.time.DurationUnit) r2)     // Catch:{ all -> 0x0741 }
            r0.<init>(r2)     // Catch:{ all -> 0x0741 }
            goto L_0x0752
        L_0x0741:
            java.lang.String r0 = "invalid anr json config "
            java.lang.String r0 = r0.concat(r5)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r0)
            java.lang.String r3 = "AnrConfig"
            defpackage.z68.f(r3, r0, r2)
            goto L_0x06e7
        L_0x0752:
            if (r0 != 0) goto L_0x0758
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x07eb
        L_0x0758:
            java.lang.String r1 = r1.y
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x075f
            goto L_0x0778
        L_0x075f:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x0778
            w78 r3 = defpackage.w78.o
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "anr config = "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r2.d(r3, r1, r4, r11)
        L_0x0778:
            g6d r1 = new g6d
            kotlin.Lazy r2 = defpackage.xd3.i
            java.lang.Object r3 = r2.getValue()
            gaf r3 = (defpackage.gaf) r3
            osa r3 = (defpackage.osa) r3
            gc8 r3 = r3.c()
            pna r4 = new pna
            r4.<init>(r7)
            r1.<init>(r0, r3, r4, r9)
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r0.<init>(r3)
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>(r9)
            ml r4 = new ml
            r4.<init>(r1, r11)
            sbd r1 = new sbd
            r1.<init>(r4)
            ivb r4 = defpackage.ivb.y
            lv7 r5 = r4.w
            iu7 r6 = defpackage.iu7.o
            co1 r1 = defpackage.ct.k(r1, r5, r6)
            xna r5 = new xna
            r5.<init>(r3, r0, r11)
            ps5 r0 = new ps5
            r0.<init>(r1, r5, r7)
            yp2 r1 = new yp2
            r1.<init>(r8, r11, r8)
            wb r3 = new wb
            r5 = 15
            r3.<init>(r5, r0, r1)
            java.lang.Object r0 = r2.getValue()
            gaf r0 = (defpackage.gaf) r0
            osa r0 = (defpackage.osa) r0
            q04 r0 = r0.a()
            java.lang.String r1 = "AnrWatchDog-Observe"
            q04 r0 = r0.s0(r9, r1)
            bs5 r0 = defpackage.bs0.F(r3, r0)
            ju7 r1 = r4.getLifecycle()
            vu7 r1 = defpackage.i8b.t(r1)
            defpackage.bs0.K(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x07eb:
            return r0
        L_0x07ec:
            int r0 = one.me.android.OneMeApplication.X
            du7 r0 = new du7     // Catch:{ all -> 0x07f7 }
            r0.<init>()     // Catch:{ all -> 0x07f7 }
            r0.a()     // Catch:{ all -> 0x07f7 }
            goto L_0x0801
        L_0x07f7:
            r0 = move-exception
            one.me.android.OneMeApplication r1 = r1.b
            java.lang.String r1 = r1.y
            java.lang.String r2 = "fail to upgrade library!"
            defpackage.z68.f(r1, r2, r0)
        L_0x0801:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ona.invoke():java.lang.Object");
    }
}
