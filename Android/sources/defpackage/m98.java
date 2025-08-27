package defpackage;

import kotlin.Lazy;

/* renamed from: m98  reason: default package */
public final class m98 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Lazy f;
    public final Lazy g;
    public final Lazy h;
    public final Lazy i;
    public final Lazy j;
    public final Lazy k;
    public final Lazy l;
    public final Lazy m;
    public final Lazy n;
    public final Lazy o;
    public final Lazy p;
    public final Lazy q;
    public final Lazy r;
    public final Lazy s;
    public final Lazy t;
    public final Lazy u;
    public final Lazy v;
    public final Lazy w;

    public m98(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6, Lazy lazy7, Lazy lazy8, Lazy lazy9, Lazy lazy10, Lazy lazy11, Lazy lazy12, Lazy lazy13, Lazy lazy14, Lazy lazy15, Lazy lazy16, Lazy lazy17, Lazy lazy18, Lazy lazy19, Lazy lazy20, Lazy lazy21, Lazy lazy22, Lazy lazy23) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
        this.d = lazy4;
        this.e = lazy5;
        this.f = lazy6;
        this.g = lazy7;
        this.h = lazy8;
        this.i = lazy9;
        this.j = lazy10;
        this.k = lazy11;
        this.l = lazy12;
        this.m = lazy13;
        this.n = lazy14;
        this.o = lazy15;
        this.p = lazy16;
        this.q = lazy17;
        this.r = lazy18;
        this.s = lazy19;
        this.t = lazy20;
        this.u = lazy21;
        this.v = lazy22;
        this.w = lazy23;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(47:90|91|92|93|94|95|96|97|98|99|100|101|102|103|104|105|106|107|108|109|110|111|112|113|114|115|116|117|118|119|120|121|162|(1:164)|165|(1:167)|168|(2:171|169)|204|172|(6:175|176|177|207|205|173)|206|180|181|182|185|186) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:108:0x04e4 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:110:0x0504 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r17) {
        /*
            r16 = this;
            r1 = r16
            r3 = 19
            r4 = 27
            r5 = 18
            r6 = 11
            r7 = 0
            r8 = 15
            r9 = 1
            r10 = 2
            r11 = 4
            java.lang.Class<m98> r0 = defpackage.m98.class
            java.lang.String r0 = r0.getName()
            java.lang.String r12 = "process: start"
            defpackage.z68.c(r0, r12, new java.lang.Object[0])
            kotlin.Lazy r0 = r1.j
            java.lang.Object r0 = r0.getValue()
            v21 r0 = (defpackage.v21) r0
            r0.getClass()
            kotlin.Lazy r0 = r1.k
            java.lang.Object r0 = r0.getValue()
            pbf r0 = (defpackage.pbf) r0
            r12 = r0
            wbf r12 = (defpackage.wbf) r12
            r12.getClass()
            java.lang.String r13 = defpackage.wbf.q
            java.lang.String r0 = "restartSynchronous"
            defpackage.z68.c(r13, r0, new java.lang.Object[0])
            if (r17 != 0) goto L_0x008b
            l98 r0 = new l98
            kotlin.Lazy r14 = r12.f
            java.lang.Object r14 = r14.getValue()
            jtb r14 = (defpackage.jtb) r14
            ltb r14 = (defpackage.ltb) r14
            a33 r14 = r14.a
            long r14 = r14.n()
            kotlin.Lazy r2 = r12.g
            java.lang.Object r2 = r2.getValue()
            fn4 r2 = (defpackage.fn4) r2
            hn4 r2 = (defpackage.hn4) r2
            kotlin.Lazy r2 = r2.i
            java.lang.Object r2 = r2.getValue()
            f8f r2 = (defpackage.f8f) r2
            java.lang.String r2 = r2.g()
            r0.<init>(r14, r2)
            r12.b(r0, r0, r7)
            kotlin.Lazy r0 = r12.n
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            r0.shutdown()
            java.util.concurrent.CountDownLatch r0 = r12.b
            if (r0 == 0) goto L_0x0096
            java.util.concurrent.CountDownLatch r0 = r12.b     // Catch:{ InterruptedException -> 0x0084 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0084 }
            r14 = 5
            r0.await(r14, r2)     // Catch:{ InterruptedException -> 0x0084 }
            goto L_0x0096
        L_0x0084:
            r0 = move-exception
            java.lang.String r2 = "syncLogoutLatch timeout"
            defpackage.z68.b(r13, r2, r0)
            goto L_0x0096
        L_0x008b:
            kotlin.Lazy r0 = r12.n
            java.lang.Object r0 = r0.getValue()
            java.util.concurrent.ExecutorService r0 = (java.util.concurrent.ExecutorService) r0
            r0.shutdownNow()
        L_0x0096:
            lce r0 = new lce
            r0.<init>(r6, r12)
            kotlin.Lazy r0 = kotlin.LazyKt.lazy(r0)
            r12.n = r0
            kotlin.Lazy r0 = r12.m
            java.lang.Object r0 = r0.getValue()
            zbf r0 = (defpackage.zbf) r0
            r0.g()
            java.lang.String r0 = "restartSynchronous finished"
            defpackage.z68.c(r13, r0, new java.lang.Object[0])
            kotlin.Lazy r0 = r1.a
            java.lang.Object r0 = r0.getValue()
            jtb r0 = (defpackage.jtb) r0
            ltb r0 = (defpackage.ltb) r0
            a33 r2 = r0.a
            r2.b()
            cud r2 = r0.b
            r2.b()
            hq r2 = r0.c
            r2.b()
            u80 r2 = r0.d
            r2.b()
            vj5 r0 = r0.e
            r0.b()
            kotlin.Lazy r0 = r1.b
            java.lang.Object r0 = r0.getValue()
            km3 r0 = (defpackage.km3) r0
            r0.d()
            java.util.concurrent.ConcurrentHashMap r2 = r0.a
            r2.clear()
            java.util.concurrent.ConcurrentHashMap r2 = r0.b
            r2.clear()
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.c
            r0.clear()
            kotlin.Lazy r0 = r1.c
            java.lang.Object r0 = r0.getValue()
            ptb r0 = (defpackage.ptb) r0
            java.util.concurrent.ConcurrentHashMap r0 = r0.o
            r0.clear()
            kotlin.Lazy r0 = r1.d
            java.lang.Object r0 = r0.getValue()
            r62 r0 = (defpackage.r62) r0
            r0.f()
            s52 r2 = new s52
            r2.<init>(r0, r9)
            java.lang.String r12 = "clear"
            r0.p0(r12, r2)
            kotlin.Lazy r0 = r1.e
            java.lang.Object r0 = r0.getValue()
            ysc r0 = (defpackage.ysc) r0
            r0.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.concurrent.ConcurrentHashMap r0 = r0.i
            java.util.Collection r12 = r0.values()
            r2.<init>(r12)
            r0.clear()
            java.util.Iterator r0 = r2.iterator()
        L_0x012d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x013d
            java.lang.Object r2 = r0.next()
            mq4 r2 = (defpackage.mq4) r2
            defpackage.jbd.c(r2)
            goto L_0x012d
        L_0x013d:
            kotlin.Lazy r0 = r1.f
            java.lang.Object r0 = r0.getValue()
            esb r0 = (defpackage.esb) r0
            if (r0 == 0) goto L_0x014a
            r0.a()
        L_0x014a:
            kotlin.Lazy r0 = r1.g
            java.lang.Object r0 = r0.getValue()
            r2 = r0
            moe r2 = (defpackage.moe) r2
            r2.getClass()
            java.lang.String r0 = "moe"
            java.lang.String r12 = "Clear"
            defpackage.z68.c(r0, r12, new java.lang.Object[0])
            java.util.concurrent.ConcurrentHashMap r0 = r2.a
            r0.clear()
            java.util.concurrent.ConcurrentHashMap r0 = r2.b
            r0.clear()
            jtb r0 = r2.e
            ltb r0 = (defpackage.ltb) r0
            a33 r0 = r0.a
            r12 = 0
            java.lang.Long r14 = java.lang.Long.valueOf(r12)
            java.lang.String r15 = "user.stickersLastSync"
            r0.k(r15, r14)
            hs7 r0 = r2.k
            java.lang.Object r0 = r0.get()
            gvc r0 = (defpackage.gvc) r0
            r0.getClass()
            java.lang.String r14 = "gvc"
            java.lang.String r15 = "Clear"
            defpackage.z68.c(r14, r15, new java.lang.Object[0])
            ifg r14 = r0.g
            r14.d()
            wuc r0 = r0.b()
            wbe r0 = r0.b()
            qbb r14 = new qbb
            r14.<init>(r8)
            na3 r15 = new na3
            r15.<init>(r11, r0, r14)
            jha r0 = r15.m()
            gga r14 = defpackage.m58.f
            mqd r15 = new mqd
            r15.<init>(r5)
            ue4 r6 = new ue4
            r6.<init>(r8)
            defpackage.ryg.k0(r0, r14, r15, r6)
            monitor-enter(r2)
            hs7 r0 = r2.f     // Catch:{ all -> 0x07d5 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x07d5 }
            ln5 r0 = (defpackage.ln5) r0     // Catch:{ all -> 0x07d5 }
            po5 r0 = (defpackage.po5) r0     // Catch:{ all -> 0x07d5 }
            java.io.File r0 = r0.q()     // Catch:{ all -> 0x07d5 }
            r0.delete()     // Catch:{ all -> 0x07d5 }
            monitor-exit(r2)
            ao1 r0 = r2.l
            defpackage.jbd.c(r0)
            r0 = 0
            defpackage.jbd.c(r0)
            om0 r0 = r2.m
            java.util.List r2 = java.util.Collections.emptyList()
            r0.d(r2)
            kotlin.Lazy r0 = r1.n
            java.lang.Object r0 = r0.getValue()
            mq0 r0 = (defpackage.mq0) r0
            if (r0 == 0) goto L_0x01f2
            nob r2 = defpackage.jbd.a
            b5 r6 = new b5
            r6.<init>(r10, r0)
            fm0 r0 = new fm0
            r0.<init>(r10)
            r2.r(r6, r0)
        L_0x01f2:
            kotlin.Lazy r0 = r1.o
            java.lang.Object r0 = r0.getValue()
            r2 = r0
            rf9 r2 = (defpackage.rf9) r2
            r2.getClass()
            java.lang.String r6 = "rf9"
            java.lang.String r0 = "clear: "
            defpackage.z68.c(r6, r0, new java.lang.Object[0])
            kotlin.Lazy r0 = r2.a     // Catch:{ all -> 0x023d }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x023d }
            yf9 r0 = (defpackage.yf9) r0     // Catch:{ all -> 0x023d }
            wh8 r0 = r0.a()     // Catch:{ all -> 0x023d }
            java.util.List r14 = kotlin.collections.CollectionsKt.emptyList()     // Catch:{ all -> 0x023d }
            java.lang.Object r0 = r0.c(r14)     // Catch:{ all -> 0x023d }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x023d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x023d }
        L_0x021f:
            boolean r14 = r0.hasNext()     // Catch:{ all -> 0x023d }
            if (r14 == 0) goto L_0x0243
            java.lang.Object r14 = r0.next()     // Catch:{ all -> 0x023d }
            qf9 r14 = (defpackage.qf9) r14     // Catch:{ all -> 0x023d }
            kotlin.Lazy r15 = r2.c     // Catch:{ all -> 0x023d }
            java.lang.Object r15 = r15.getValue()     // Catch:{ all -> 0x023d }
            gl5 r15 = (defpackage.gl5) r15     // Catch:{ all -> 0x023d }
            xc9 r14 = r14.a     // Catch:{ all -> 0x023d }
            long r12 = r14.a     // Catch:{ all -> 0x023d }
            r15.a(r12)     // Catch:{ all -> 0x023d }
            r12 = 0
            goto L_0x021f
        L_0x023d:
            r0 = move-exception
            java.lang.String r12 = "clear failure!"
            defpackage.z68.f(r6, r12, r0)
        L_0x0243:
            kotlin.Lazy r0 = r2.a     // Catch:{ Exception -> 0x0262 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x0262 }
            yf9 r0 = (defpackage.yf9) r0     // Catch:{ Exception -> 0x0262 }
            wbe r0 = r0.b()     // Catch:{ Exception -> 0x0262 }
            p79 r2 = new p79     // Catch:{ Exception -> 0x0262 }
            r2.<init>(r8)     // Catch:{ Exception -> 0x0262 }
            na3 r12 = new na3     // Catch:{ Exception -> 0x0262 }
            r12.<init>(r11, r0, r2)     // Catch:{ Exception -> 0x0262 }
            r12.a()     // Catch:{ Exception -> 0x0262 }
            java.lang.String r0 = "clear: cleared message upload repository"
            defpackage.z68.c(r6, r0, new java.lang.Object[0])     // Catch:{ Exception -> 0x0262 }
            goto L_0x0268
        L_0x0262:
            r0 = move-exception
            java.lang.String r2 = "clear: failed to clear message upload repository"
            defpackage.z68.f(r6, r2, r0)
        L_0x0268:
            kotlin.Lazy r0 = r1.p
            java.lang.Object r0 = r0.getValue()
            r2 = r0
            bu4 r2 = (defpackage.bu4) r2
            if (r2 == 0) goto L_0x032f
            java.lang.String r6 = defpackage.bu4.g
            java.lang.String r0 = "clear: "
            defpackage.z68.c(r6, r0, new java.lang.Object[0])
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x02b8 }
            kotlin.reflect.KProperty[] r0 = defpackage.bu4.f     // Catch:{ all -> 0x02b8 }
            r0 = r0[r10]     // Catch:{ all -> 0x02b8 }
            hs7 r0 = r2.d     // Catch:{ all -> 0x02b8 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x02b8 }
            ju4 r0 = (defpackage.ju4) r0     // Catch:{ all -> 0x02b8 }
            wbe r0 = r0.a()     // Catch:{ all -> 0x02b8 }
            u9a r12 = defpackage.u9a.o     // Catch:{ all -> 0x02b8 }
            wh8 r13 = new wh8     // Catch:{ all -> 0x02b8 }
            r13.<init>(r10, r0, r12)     // Catch:{ all -> 0x02b8 }
            v9a r0 = defpackage.v9a.o     // Catch:{ all -> 0x02b8 }
            oa3 r12 = new oa3     // Catch:{ all -> 0x02b8 }
            r12.<init>(r9, r13, r0)     // Catch:{ all -> 0x02b8 }
            gga r0 = defpackage.gga.y     // Catch:{ all -> 0x02b8 }
            yia r13 = new yia     // Catch:{ all -> 0x02b8 }
            r14 = 3
            r13.<init>(r12, r0, r14)     // Catch:{ all -> 0x02b8 }
            oha r0 = r13.B()     // Catch:{ all -> 0x02b8 }
            nfd r12 = defpackage.nfd.y     // Catch:{ all -> 0x02b8 }
            wh8 r13 = new wh8     // Catch:{ all -> 0x02b8 }
            r13.<init>(r10, r0, r12)     // Catch:{ all -> 0x02b8 }
            java.lang.Object r0 = r13.b()     // Catch:{ all -> 0x02b8 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x02b8 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x02b8 }
            goto L_0x02c3
        L_0x02b8:
            r0 = move-exception
            kotlin.Result$Companion r12 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x02c3:
            java.util.List r12 = kotlin.collections.CollectionsKt.emptyList()
            boolean r13 = kotlin.Result.m29isFailureimpl(r0)
            if (r13 == 0) goto L_0x02ce
            r0 = r12
        L_0x02ce:
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0309
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x02d8:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x0309
            java.lang.Object r12 = r0.next()
            au4 r12 = (defpackage.au4) r12
            st4 r12 = r12.a
            long r12 = r12.a
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "cancel: chatId = "
            r14.<init>(r15)
            r14.append(r12)
            java.lang.String r14 = r14.toString()
            defpackage.z68.c(r6, r14, new java.lang.Object[0])
            kotlin.reflect.KProperty[] r14 = defpackage.bu4.f
            r14 = r14[r9]
            hs7 r14 = r2.c
            java.lang.Object r14 = r14.get()
            gl5 r14 = (defpackage.gl5) r14
            r14.b(r12)
            goto L_0x02d8
        L_0x0309:
            kotlin.reflect.KProperty[] r0 = defpackage.bu4.f     // Catch:{ all -> 0x0329 }
            r0 = r0[r10]     // Catch:{ all -> 0x0329 }
            hs7 r0 = r2.d     // Catch:{ all -> 0x0329 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0329 }
            ju4 r0 = (defpackage.ju4) r0     // Catch:{ all -> 0x0329 }
            wbe r0 = r0.a()     // Catch:{ all -> 0x0329 }
            s9a r2 = defpackage.s9a.o     // Catch:{ all -> 0x0329 }
            na3 r12 = new na3     // Catch:{ all -> 0x0329 }
            r12.<init>(r11, r0, r2)     // Catch:{ all -> 0x0329 }
            r12.a()     // Catch:{ all -> 0x0329 }
            java.lang.String r0 = "clear: cleared draft upload repository"
            defpackage.z68.c(r6, r0, new java.lang.Object[0])     // Catch:{ all -> 0x0329 }
            goto L_0x032f
        L_0x0329:
            r0 = move-exception
            java.lang.String r2 = "clear: failed to clear draft upload repository"
            defpackage.z68.f(r6, r2, r0)
        L_0x032f:
            kotlin.Lazy r0 = r1.q
            java.lang.Object r0 = r0.getValue()
            r6 = r0
            jxf r6 = (defpackage.jxf) r6
            monitor-enter(r6)
            java.lang.String r0 = "jxf"
            java.lang.String r2 = "clear: "
            defpackage.z68.c(r0, r2, new java.lang.Object[0])     // Catch:{ all -> 0x07d2 }
            ifg r0 = r6.i     // Catch:{ all -> 0x07d2 }
            r0.d()     // Catch:{ all -> 0x07d2 }
            java.util.concurrent.ConcurrentHashMap r0 = r6.h     // Catch:{ all -> 0x07d2 }
            r0.clear()     // Catch:{ all -> 0x07d2 }
            fzf r0 = r6.a     // Catch:{ all -> 0x07d2 }
            ma3 r0 = r0.clear()     // Catch:{ all -> 0x07d2 }
            jha r0 = r0.m()     // Catch:{ all -> 0x07d2 }
            gga r2 = defpackage.m58.f     // Catch:{ all -> 0x07d2 }
            xff r12 = new xff     // Catch:{ all -> 0x07d2 }
            r12.<init>(r4)     // Catch:{ all -> 0x07d2 }
            ue4 r13 = new ue4     // Catch:{ all -> 0x07d2 }
            r14 = 17
            r13.<init>(r14)     // Catch:{ all -> 0x07d2 }
            defpackage.ryg.k0(r0, r2, r12, r13)     // Catch:{ all -> 0x07d2 }
            monitor-exit(r6)
            kotlin.Lazy r0 = r1.r
            java.lang.Object r0 = r0.getValue()
            r12 = r0
            t4g r12 = (defpackage.t4g) r12
            monitor-enter(r12)
            java.lang.String r0 = "t4g"
            java.lang.String r6 = "clear: "
            defpackage.z68.c(r0, r6, new java.lang.Object[0])     // Catch:{ all -> 0x07cf }
            ifg r0 = r12.h     // Catch:{ all -> 0x07cf }
            r0.d()     // Catch:{ all -> 0x07cf }
            java.util.HashMap r0 = r12.i     // Catch:{ all -> 0x07cf }
            r0.clear()     // Catch:{ all -> 0x07cf }
            v4g r0 = r12.b     // Catch:{ all -> 0x07cf }
            wbe r0 = r0.a()     // Catch:{ all -> 0x07cf }
            hxf r6 = new hxf     // Catch:{ all -> 0x07cf }
            r13 = 12
            r6.<init>(r13)     // Catch:{ all -> 0x07cf }
            na3 r13 = new na3     // Catch:{ all -> 0x07cf }
            r13.<init>(r11, r0, r6)     // Catch:{ all -> 0x07cf }
            jha r0 = r13.m()     // Catch:{ all -> 0x07cf }
            hxf r6 = new hxf     // Catch:{ all -> 0x07cf }
            r13 = 9
            r6.<init>(r13)     // Catch:{ all -> 0x07cf }
            ue4 r13 = new ue4     // Catch:{ all -> 0x07cf }
            r13.<init>(r5)     // Catch:{ all -> 0x07cf }
            defpackage.ryg.k0(r0, r2, r6, r13)     // Catch:{ all -> 0x07cf }
            monitor-exit(r12)
            kotlin.Lazy r0 = r1.h
            java.lang.Object r0 = r0.getValue()
            qwa r0 = (defpackage.qwa) r0
            kotlin.Lazy r2 = r0.h
            java.lang.Object r2 = r2.getValue()
            z84 r2 = (defpackage.z84) r2
            r2.getClass()
            java.lang.String r5 = defpackage.z84.k
            java.lang.String r6 = "cancelAll"
            defpackage.z68.c(r5, r6, new java.lang.Object[0])
            u84 r5 = new u84
            r5.<init>((defpackage.z84) r2, (int) r9)
            r2.b(r5)
            kotlin.Lazy r2 = r0.a
            java.lang.Object r2 = r2.getValue()
            ltb r2 = (defpackage.ltb) r2
            a33 r2 = r2.a
            java.lang.String r5 = "notifications.lastEventNotificationId"
            ls7 r2 = r2.g
            r6 = 20
            int r2 = r2.getInt(r5, r6)
            int r2 = r2 + r9
            r5 = 999(0x3e7, float:1.4E-42)
            if (r2 != r5) goto L_0x03e3
            r2 = r6
        L_0x03e3:
            kotlin.Lazy r5 = r0.a
            java.lang.Object r5 = r5.getValue()
            ltb r5 = (defpackage.ltb) r5
            a33 r5 = r5.a
            java.lang.String r12 = "notifications.lastEventNotificationId"
            r5.j(r2, r12)
            int r2 = r2 - r9
        L_0x03f3:
            if (r3 >= r2) goto L_0x0403
            kotlin.Lazy r5 = r0.c
            java.lang.Object r5 = r5.getValue()
            pwa r5 = (defpackage.pwa) r5
            r5.a(r2)
            int r2 = r2 + -1
            goto L_0x03f3
        L_0x0403:
            kotlin.Lazy r2 = r0.a
            java.lang.Object r2 = r2.getValue()
            ltb r2 = (defpackage.ltb) r2
            a33 r2 = r2.a
            java.lang.String r5 = "notifications.lastEventNotificationId"
            r2.j(r6, r5)
            kotlin.Lazy r2 = r0.c
            java.lang.Object r2 = r2.getValue()
            pwa r2 = (defpackage.pwa) r2
            r2.a(r10)
            kotlin.Lazy r2 = r0.c
            java.lang.Object r2 = r2.getValue()
            pwa r2 = (defpackage.pwa) r2
            r5 = 6
            r2.a(r5)
            kotlin.Lazy r0 = r0.d
            java.lang.Object r0 = r0.getValue()
            o68 r0 = (defpackage.o68) r0
            r0.c()
            kotlin.Lazy r0 = r1.i
            java.lang.Object r0 = r0.getValue()
            s74 r0 = (defpackage.s74) r0
            a74 r0 = (defpackage.a74) r0
            java.lang.String r2 = "deleteAllExceptStats end"
            java.lang.String r5 = "a74"
            cya r6 = r0.a
            java.lang.String r12 = "deleteAllExceptStats start"
            defpackage.z68.c(r5, r12, new java.lang.Object[0])     // Catch:{ all -> 0x053e }
            i6d r12 = r6.m()     // Catch:{ all -> 0x053e }
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r12 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r12     // Catch:{ all -> 0x053e }
            r12.c()     // Catch:{ all -> 0x053e }
            z6d r12 = r0.c     // Catch:{ all -> 0x053e }
            aj9 r12 = r12.d()     // Catch:{ all -> 0x053e }
            i6d r13 = r12.a     // Catch:{ all -> 0x053e }
            r13.b()     // Catch:{ all -> 0x053e }
            uf9 r12 = r12.p     // Catch:{ all -> 0x053e }
            gf6 r14 = r12.E()     // Catch:{ all -> 0x053e }
            r13.c()     // Catch:{ all -> 0x0568 }
            r14.n()     // Catch:{ all -> 0x0563 }
            r13.r()     // Catch:{ all -> 0x0563 }
            r13.l()     // Catch:{ all -> 0x0568 }
            r12.S(r14)     // Catch:{ all -> 0x053e }
            f6d r12 = r0.b     // Catch:{ all -> 0x053e }
            r12.b()     // Catch:{ all -> 0x053e }
            g6d r12 = r0.d     // Catch:{ all -> 0x053e }
            ht3 r12 = r12.p()     // Catch:{ all -> 0x053e }
            i6d r13 = r12.a     // Catch:{ all -> 0x053e }
            r13.c()     // Catch:{ all -> 0x053e }
            defpackage.ht3.a(r12)     // Catch:{ all -> 0x055e }
            r13.r()     // Catch:{ all -> 0x055e }
            r13.l()     // Catch:{ all -> 0x053e }
            c7d r12 = r0.e     // Catch:{ all -> 0x053e }
            r12.a()     // Catch:{ all -> 0x053e }
            q7d r12 = r0.f     // Catch:{ all -> 0x053e }
            hef r12 = r12.b()     // Catch:{ all -> 0x053e }
            i6d r13 = r12.a     // Catch:{ all -> 0x053e }
            r13.b()     // Catch:{ all -> 0x053e }
            t5d r12 = r12.h     // Catch:{ all -> 0x053e }
            gf6 r14 = r12.E()     // Catch:{ all -> 0x053e }
            r13.c()     // Catch:{ all -> 0x0559 }
            r14.n()     // Catch:{ all -> 0x0554 }
            r13.r()     // Catch:{ all -> 0x0554 }
            r13.l()     // Catch:{ all -> 0x0559 }
            r12.S(r14)     // Catch:{ all -> 0x053e }
            p7d r12 = r0.h     // Catch:{ all -> 0x053e }
            java.lang.Object r12 = r12.c     // Catch:{ all -> 0x053e }
            kotlin.Lazy r12 = (kotlin.Lazy) r12     // Catch:{ all -> 0x053e }
            java.lang.Object r12 = r12.getValue()     // Catch:{ all -> 0x053e }
            kse r12 = (defpackage.kse) r12     // Catch:{ all -> 0x053e }
            i6d r13 = r12.a     // Catch:{ all -> 0x053e }
            r13.b()     // Catch:{ all -> 0x053e }
            t5d r12 = r12.c     // Catch:{ all -> 0x053e }
            gf6 r14 = r12.E()     // Catch:{ all -> 0x053e }
            r13.c()     // Catch:{ all -> 0x054f }
            r14.n()     // Catch:{ all -> 0x054a }
            r13.r()     // Catch:{ all -> 0x054a }
            r13.l()     // Catch:{ all -> 0x054f }
            r12.S(r14)     // Catch:{ all -> 0x053e }
            gk r12 = r0.u     // Catch:{ all -> 0x053e }
            r12.d()     // Catch:{ all -> 0x053e }
            izf r12 = r0.j     // Catch:{ all -> 0x04e4 }
            ma3 r12 = r12.clear()     // Catch:{ all -> 0x04e4 }
            r12.a()     // Catch:{ all -> 0x04e4 }
        L_0x04e4:
            ere r0 = r0.p     // Catch:{ all -> 0x0504 }
            j6d r0 = r0.a     // Catch:{ all -> 0x0504 }
            mka r0 = r0.n()     // Catch:{ all -> 0x0504 }
            dre r12 = new dre     // Catch:{ all -> 0x0504 }
            r12.<init>(r10)     // Catch:{ all -> 0x0504 }
            wbe r0 = r0.i(r12)     // Catch:{ all -> 0x0504 }
            mqd r10 = new mqd     // Catch:{ all -> 0x0504 }
            r12 = 28
            r10.<init>(r12)     // Catch:{ all -> 0x0504 }
            na3 r12 = new na3     // Catch:{ all -> 0x0504 }
            r12.<init>(r11, r0, r10)     // Catch:{ all -> 0x0504 }
            r12.a()     // Catch:{ all -> 0x0504 }
        L_0x0504:
            i6d r0 = r6.m()     // Catch:{ all -> 0x053e }
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r0 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r0     // Catch:{ all -> 0x053e }
            lfa r0 = r0.J()     // Catch:{ all -> 0x053e }
            i6d r10 = r0.a     // Catch:{ all -> 0x053e }
            r10.b()     // Catch:{ all -> 0x053e }
            uf9 r12 = r0.c     // Catch:{ all -> 0x053e }
            gf6 r13 = r12.E()     // Catch:{ all -> 0x053e }
            r10.c()     // Catch:{ all -> 0x0545 }
            r13.n()     // Catch:{ all -> 0x0540 }
            r10.r()     // Catch:{ all -> 0x0540 }
            r10.l()     // Catch:{ all -> 0x0545 }
            r12.S(r13)     // Catch:{ all -> 0x053e }
            i6d r0 = r6.m()     // Catch:{ all -> 0x053e }
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r0 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r0     // Catch:{ all -> 0x053e }
            r0.r()     // Catch:{ all -> 0x053e }
            i6d r0 = r6.m()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r0 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r0
        L_0x0537:
            r0.l()
            defpackage.z68.c(r5, r2, new java.lang.Object[0])
            goto L_0x0579
        L_0x053e:
            r0 = move-exception
            goto L_0x056d
        L_0x0540:
            r0 = move-exception
            r10.l()     // Catch:{ all -> 0x0545 }
            throw r0     // Catch:{ all -> 0x0545 }
        L_0x0545:
            r0 = move-exception
            r12.S(r13)     // Catch:{ all -> 0x053e }
            throw r0     // Catch:{ all -> 0x053e }
        L_0x054a:
            r0 = move-exception
            r13.l()     // Catch:{ all -> 0x054f }
            throw r0     // Catch:{ all -> 0x054f }
        L_0x054f:
            r0 = move-exception
            r12.S(r14)     // Catch:{ all -> 0x053e }
            throw r0     // Catch:{ all -> 0x053e }
        L_0x0554:
            r0 = move-exception
            r13.l()     // Catch:{ all -> 0x0559 }
            throw r0     // Catch:{ all -> 0x0559 }
        L_0x0559:
            r0 = move-exception
            r12.S(r14)     // Catch:{ all -> 0x053e }
            throw r0     // Catch:{ all -> 0x053e }
        L_0x055e:
            r0 = move-exception
            r13.l()     // Catch:{ all -> 0x053e }
            throw r0     // Catch:{ all -> 0x053e }
        L_0x0563:
            r0 = move-exception
            r13.l()     // Catch:{ all -> 0x0568 }
            throw r0     // Catch:{ all -> 0x0568 }
        L_0x0568:
            r0 = move-exception
            r12.S(r14)     // Catch:{ all -> 0x053e }
            throw r0     // Catch:{ all -> 0x053e }
        L_0x056d:
            java.lang.String r10 = "During deleting got exception"
            defpackage.z68.f(r5, r10, r0)     // Catch:{ all -> 0x07c1 }
            i6d r0 = r6.m()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r0 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r0
            goto L_0x0537
        L_0x0579:
            kotlin.Lazy r0 = r1.l
            java.lang.Object r0 = r0.getValue()
            fn4 r0 = (defpackage.fn4) r0
            r0.getClass()
            kotlin.Lazy r0 = r1.m
            java.lang.Object r0 = r0.getValue()
            uua r0 = (defpackage.uua) r0
            if (r0 == 0) goto L_0x05ab
            java.lang.String r2 = "OneMeInitialDataStorage"
            java.lang.String r5 = "reset"
            defpackage.z68.c(r2, r5, new java.lang.Object[0])
            kotlin.Lazy r2 = r0.b
            java.lang.Object r2 = r2.getValue()
            zq9 r2 = (defpackage.zq9) r2
            r2.a()
            kotlin.Lazy r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            kr9 r0 = (defpackage.kr9) r0
            r0.a()
        L_0x05ab:
            kotlin.Lazy r0 = r1.s
            java.lang.Object r0 = r0.getValue()
            d18 r0 = (defpackage.d18) r0
            if (r0 == 0) goto L_0x06cc
            j18 r0 = (defpackage.j18) r0
            java.lang.String r2 = "j18"
            java.lang.String r5 = "Clear live location manager"
            defpackage.z68.c(r2, r5, new java.lang.Object[0])
            r0.n()
            cc2 r2 = r0.z
            r2.getClass()
            java.lang.String r5 = "cc2"
            java.lang.String r6 = "Clear"
            defpackage.z68.c(r5, r6, new java.lang.Object[0])
            wbe r2 = r2.a()
            fm0 r5 = new fm0
            r5.<init>(r4)
            na3 r4 = new na3
            r4.<init>(r11, r2, r5)
            r4.a()
            hs7 r2 = r0.E0
            java.lang.Object r2 = r2.get()
            ipg r2 = (defpackage.ipg) r2
            r2.getClass()
            java.lang.String r4 = "LIVE_LOCATION_WORKER"
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r5 = defpackage.ipg.o
            java.lang.String r6 = "cancelAllWorkByTag %s"
            defpackage.z68.c(r5, r6, r4)
            apg r2 = r2.h()
            dpg r2 = (defpackage.dpg) r2
            r2.getClass()
            ew1 r4 = new ew1
            r4.<init>(r2)
            wdf r2 = r2.d
            r2.h(r4)
            pq3 r2 = r0.y
            wbe r2 = r2.a()
            zb2 r4 = new zb2
            r5 = 13
            r4.<init>(r5)
            na3 r5 = new na3
            r5.<init>(r11, r2, r4)
            r5.a()
            java.util.concurrent.ConcurrentHashMap r2 = r0.w
            r2.clear()
            kc3 r2 = r0.v
            r2.d()
            g68 r2 = r0.w0
            r2.e(r0)
            g68 r2 = r0.w0
            r2.c(r0)
            or7 r2 = r0.F0
            defpackage.jbd.c(r2)
            r4 = 0
            r0.J0 = r4
            java.util.HashSet r2 = r0.x
            r2.clear()
            ao1 r2 = r0.G0
            defpackage.jbd.c(r2)
            dac r2 = r0.a
            lfd r4 = r0.z0
            lja r2 = r2.s(r4)
            e18 r4 = new e18
            r4.<init>(r0, r9)
            n77 r5 = new n77
            r6 = 13
            r5.<init>(r6)
            dj6 r6 = defpackage.m58.e
            or7 r9 = new or7
            r9.<init>(r4, r5, r6)
            r2.a(r9)
            kc3 r2 = r0.v
            r2.a(r9)
            dac r2 = r0.b
            lfd r4 = r0.z0
            lja r2 = r2.s(r4)
            e18 r4 = new e18
            r4.<init>(r0, r7)
            n77 r5 = new n77
            r7 = 10
            r5.<init>(r7)
            or7 r7 = new or7
            r7.<init>(r4, r5, r6)
            r2.a(r7)
            kc3 r2 = r0.v
            r2.a(r7)
            dac r2 = r0.c
            lfd r4 = r0.z0
            lja r2 = r2.s(r4)
            e18 r4 = new e18
            r5 = 11
            r4.<init>(r0, r5)
            n77 r5 = new n77
            r7 = 21
            r5.<init>(r7)
            or7 r7 = new or7
            r7.<init>(r4, r5, r6)
            r2.a(r7)
            kc3 r2 = r0.v
            r2.a(r7)
            dac r2 = r0.o
            lfd r4 = r0.y0
            lja r2 = r2.s(r4)
            e18 r4 = new e18
            r5 = 7
            r4.<init>(r0, r5)
            n77 r5 = new n77
            r5.<init>(r3)
            or7 r3 = new or7
            r3.<init>(r4, r5, r6)
            r2.a(r3)
            kc3 r0 = r0.v
            r0.a(r3)
        L_0x06cc:
            kotlin.Lazy r0 = r1.t
            java.lang.Object r0 = r0.getValue()
            p1f r0 = (defpackage.p1f) r0
            java.util.concurrent.ConcurrentHashMap r0 = r0.c
            java.util.Collection r2 = r0.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x06de:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x06ee
            java.lang.Object r3 = r2.next()
            o1f r3 = (defpackage.o1f) r3
            r3.clear()
            goto L_0x06de
        L_0x06ee:
            r0.clear()
            kotlin.Lazy r0 = r1.u
            java.lang.Object r0 = r0.getValue()
            iz r0 = (defpackage.iz) r0
            java.util.concurrent.ConcurrentHashMap r0 = r0.a
            r0.clear()
            kotlin.Lazy r0 = r1.v
            java.lang.Object r0 = r0.getValue()
            vi5 r0 = (defpackage.vi5) r0
            r0.getClass()
            java.lang.String r2 = "vi5"
            java.lang.String r3 = "clear: "
            defpackage.z68.c(r2, r3, new java.lang.Object[0])
            hs7 r2 = r0.g
            java.lang.Object r2 = r2.get()
            qi5 r2 = (defpackage.qi5) r2
            r2.getClass()
            java.lang.String r3 = "qi5"
            java.lang.String r4 = "cancelRequests: "
            defpackage.z68.c(r3, r4, new java.lang.Object[0])
            java.util.concurrent.ConcurrentHashMap r3 = r2.f
            r3.clear()
            kc3 r2 = r2.g
            r2.d()
            kc3 r2 = r0.h
            r2.d()
            hs7 r0 = r0.a
            java.lang.Object r0 = r0.get()
            rh5 r0 = (defpackage.rh5) r0
            wbe r0 = r0.a()
            lw4 r2 = new lw4
            r3 = 14
            r2.<init>(r3)
            na3 r3 = new na3
            r3.<init>(r11, r0, r2)
            jha r0 = r3.m()
            gga r2 = defpackage.m58.f
            ci5 r3 = new ci5
            r3.<init>(r8)
            ue4 r4 = new ue4
            r5 = 8
            r4.<init>(r5)
            defpackage.ryg.k0(r0, r2, r3, r4)
            kotlin.Lazy r0 = r1.w
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x076a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x079a
            java.lang.Object r0 = r2.next()
            r3 = r0
            s98 r3 = (defpackage.s98) r3
            r3.a()     // Catch:{ all -> 0x077b }
            goto L_0x076a
        L_0x077b:
            r0 = move-exception
            r4 = r0
            java.lang.Class<m98> r0 = defpackage.m98.class
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "notifyListeners: listener "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = " failed!"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            defpackage.z68.f(r0, r3, r4)
            goto L_0x076a
        L_0x079a:
            kotlin.Lazy r0 = r1.i
            java.lang.Object r0 = r0.getValue()
            s74 r0 = (defpackage.s74) r0
            a74 r0 = (defpackage.a74) r0
            r0.getClass()
            cya r0 = r0.a     // Catch:{ all -> 0x07ad }
            r0.close()     // Catch:{ all -> 0x07ad }
            goto L_0x07b5
        L_0x07ad:
            r0 = move-exception
            java.lang.String r1 = "a74"
            java.lang.String r2 = "Got error during closing database"
            defpackage.z68.f(r1, r2, r0)
        L_0x07b5:
            java.lang.Class<m98> r0 = defpackage.m98.class
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "process: done"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])
            return
        L_0x07c1:
            r0 = move-exception
            i6d r1 = r6.m()
            ru.ok.tamtam.android.db.room.OneMeRoomDatabase r1 = (ru.ok.tamtam.android.db.room.OneMeRoomDatabase) r1
            r1.l()
            defpackage.z68.c(r5, r2, new java.lang.Object[0])
            throw r0
        L_0x07cf:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x07cf }
            throw r0
        L_0x07d2:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x07d2 }
            throw r0
        L_0x07d5:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x07d5 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m98.a(boolean):void");
    }
}
