package defpackage;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* renamed from: sz0  reason: default package */
public final /* synthetic */ class sz0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ sz0(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.reflect.Field} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v77, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v49, resolved type: android.view.View} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5, types: [ny7] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v13, types: [android.animation.Animator] */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r15 = this;
            r0 = 1
            r1 = 0
            r2 = 2
            r3 = 0
            int r4 = r15.a
            switch(r4) {
                case 0: goto L_0x0447;
                case 1: goto L_0x042b;
                case 2: goto L_0x032f;
                case 3: goto L_0x0317;
                case 4: goto L_0x02f6;
                case 5: goto L_0x01cb;
                case 6: goto L_0x01af;
                case 7: goto L_0x017b;
                case 8: goto L_0x0148;
                case 9: goto L_0x0121;
                case 10: goto L_0x00fb;
                case 11: goto L_0x00e0;
                case 12: goto L_0x00c5;
                case 13: goto L_0x00a2;
                case 14: goto L_0x007f;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r15.b
            zx3 r0 = (defpackage.zx3) r0
            java.lang.Object r2 = r15.c
            one.me.sdk.conductor.changehandlers.swipe.SwipeWidget r2 = (one.me.sdk.conductor.changehandlers.swipe.SwipeWidget) r2
            java.lang.Object r15 = r15.o
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            int r4 = one.me.sdk.conductor.changehandlers.swipe.SwipeWidget.b
            android.view.View r4 = r0.getView()
            if (r4 != 0) goto L_0x0057
            java.lang.String r4 = r2.a
            a67 r5 = defpackage.z68.b
            if (r5 != 0) goto L_0x0024
            goto L_0x0031
        L_0x0024:
            boolean r6 = r5.c()
            if (r6 == 0) goto L_0x0031
            w78 r6 = defpackage.w78.o
            java.lang.String r7 = "getUnderlyingViewProvider: underlying view is null, inflating new one"
            r5.d(r6, r4, r7, r3)
        L_0x0031:
            q94 r4 = defpackage.hy3.b
            kotlin.reflect.KProperty[] r5 = defpackage.hy3.a
            r1 = r5[r1]
            java.lang.Object r1 = r4.getValue(r3, r1)
            java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
            if (r1 == 0) goto L_0x004b
            java.lang.Object[] r4 = new java.lang.Object[]{r15}
            java.lang.Object r0 = r1.invoke(r0, r4)
            r4 = r0
            android.view.View r4 = (android.view.View) r4
            goto L_0x0057
        L_0x004b:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x0057:
            android.view.ViewParent r0 = r4.getParent()
            if (r0 != 0) goto L_0x007e
            java.lang.String r0 = r2.a
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x0064
            goto L_0x0071
        L_0x0064:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x0071
            w78 r2 = defpackage.w78.o
            java.lang.String r5 = "getUnderlyingViewProvider: underlying view is not attached, adding it to container"
            r1.d(r2, r0, r5, r3)
        L_0x0071:
            int r0 = defpackage.mhc.swipe_fade
            android.view.View r0 = r15.findViewById(r0)
            int r0 = r15.indexOfChild(r0)
            r15.addView(r4, r0)
        L_0x007e:
            return r4
        L_0x007f:
            java.lang.Object r0 = r15.b
            h5f r0 = (defpackage.h5f) r0
            yqf r0 = r0.a
            java.lang.Object r1 = r15.c
            bxf r1 = (defpackage.bxf) r1
            kxf r1 = r1.a
            java.lang.String r1 = r1.a
            java.lang.Object r15 = r15.o
            sv3 r15 = (defpackage.sv3) r15
            java.lang.String r15 = r15.c
            kotlin.Lazy r0 = r0.g
            java.lang.Object r0 = r0.getValue()
            ou8 r0 = (defpackage.ou8) r0
            wj0 r0 = (defpackage.wj0) r0
            java.lang.String r15 = r0.a(r1, r15)
            return r15
        L_0x00a2:
            java.lang.Object r0 = r15.c
            ol3 r0 = (defpackage.ol3) r0
            android.view.View r0 = r0.getAnchorButton()
            java.lang.Object r1 = r15.b
            l0f r1 = (defpackage.l0f) r1
            one.me.sdk.messagewrite.mention.SuggestionsWidget r1 = (one.me.sdk.messagewrite.mention.SuggestionsWidget) r1
            v0f r1 = r1.r0()
            i0f r2 = new i0f
            java.lang.Object r15 = r15.o
            o0f r15 = (defpackage.o0f) r15
            r2.<init>(r0, r15)
            xme r15 = r1.K0
            r15.setValue(r2)
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        L_0x00c5:
            java.lang.Object r0 = r15.b
            w43 r0 = (defpackage.w43) r0
            kotlin.jvm.functions.Function1 r0 = r0.S0
            ri9 r1 = new ri9
            java.lang.Object r2 = r15.o
            one.me.messages.list.loader.MessageModel r2 = (one.me.messages.list.loader.MessageModel) r2
            long r4 = r2.a
            java.lang.Object r15 = r15.c
            ybe r15 = (defpackage.ybe) r15
            r1.<init>(r15, r4, r3)
            r0.invoke(r1)
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        L_0x00e0:
            java.lang.Object r0 = r15.b
            w43 r0 = (defpackage.w43) r0
            kotlin.jvm.functions.Function1 r0 = r0.S0
            ri9 r1 = new ri9
            java.lang.Object r2 = r15.o
            one.me.messages.list.loader.MessageModel r2 = (one.me.messages.list.loader.MessageModel) r2
            long r4 = r2.a
            java.lang.Object r15 = r15.c
            ybe r15 = (defpackage.ybe) r15
            r1.<init>(r15, r4, r3)
            r0.invoke(r1)
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        L_0x00fb:
            tg1 r0 = new tg1
            java.lang.Object r1 = r15.b
            kotlin.Lazy r1 = (kotlin.Lazy) r1
            java.lang.Object r1 = r1.getValue()
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r2 = r15.o
            h5d r2 = (defpackage.h5d) r2
            kotlin.Lazy r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            sg1 r2 = (defpackage.sg1) r2
            java.lang.Object r15 = r15.c
            kotlin.Lazy r15 = (kotlin.Lazy) r15
            java.lang.Object r15 = r15.getValue()
            bud r15 = (defpackage.bud) r15
            r0.<init>(r1, r2, r15)
            return r0
        L_0x0121:
            dq2 r0 = new dq2
            java.lang.Object r1 = r15.o
            ru.ok.onechat.reactions.ReactionsViewModel r1 = (ru.ok.onechat.reactions.ReactionsViewModel) r1
            long r4 = r1.c
            java.lang.Object r2 = r15.b
            kotlin.Lazy r2 = (kotlin.Lazy) r2
            java.lang.Object r2 = r2.getValue()
            r6 = r2
            sbe r6 = (defpackage.sbe) r6
            jsc r10 = new jsc
            r2 = 3
            r10.<init>(r1, r2)
            qx2 r9 = r1.d
            java.lang.Object r15 = r15.c
            r7 = r15
            kotlin.Lazy r7 = (kotlin.Lazy) r7
            bud r8 = r1.e
            r3 = r0
            r3.<init>(r4, r6, r7, r8, r9, r10)
            return r0
        L_0x0148:
            java.lang.Object r0 = r15.b
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r0.invoke()
            java.lang.Object r0 = r15.c
            qmb r0 = (defpackage.qmb) r0
            r0.getClass()
            float[] r0 = new float[r2]
            r0 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            if (r0 == 0) goto L_0x0173
            r3 = 200(0xc8, double:9.9E-322)
            r0.setDuration(r3)
            hg r1 = new hg
            java.lang.Object r15 = r15.o
            android.view.View r15 = (android.view.View) r15
            r1.<init>(r15, r2)
            r0.addUpdateListener(r1)
            r3 = r0
        L_0x0173:
            if (r3 == 0) goto L_0x0178
            r3.start()
        L_0x0178:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        L_0x017b:
            java.lang.Object r0 = r15.b
            msa r0 = (defpackage.msa) r0
            kotlin.Lazy r0 = r0.k
            java.lang.Object r0 = r0.getValue()
            esb r0 = (defpackage.esb) r0
            java.util.concurrent.ConcurrentHashMap r1 = r0.c
            java.lang.Object r2 = r15.c
            ha9 r2 = (defpackage.ha9) r2
            long r3 = r2.b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            ep1 r4 = new ep1
            java.lang.Object r15 = r15.o
            a32 r15 = (defpackage.a32) r15
            r5 = 10
            r4.<init>(r0, r2, r15, r5)
            yi r0 = new yi
            r2 = 15
            r0.<init>(r2, r4)
            java.lang.Object r0 = r1.computeIfAbsent(r3, r0)
            gsb r0 = (defpackage.gsb) r0
            r0.i(r15)
            return r0
        L_0x01af:
            wqa r0 = new wqa
            java.lang.Object r1 = r15.o
            gy8 r1 = (defpackage.gy8) r1
            long r4 = r1.o
            java.lang.Object r1 = r1.b
            r6 = r1
            a07 r6 = (defpackage.a07) r6
            java.lang.Object r1 = r15.b
            r2 = r1
            kotlin.Lazy r2 = (kotlin.Lazy) r2
            java.lang.Object r15 = r15.c
            r3 = r15
            kotlin.Lazy r3 = (kotlin.Lazy) r3
            r1 = r0
            r1.<init>(r2, r3, r4, r6)
            return r0
        L_0x01cb:
            java.lang.Object r1 = r15.b
            one.me.android.OneMeApplication r1 = (one.me.android.OneMeApplication) r1
            java.lang.Object r4 = r15.c
            java.util.concurrent.atomic.AtomicBoolean r4 = (java.util.concurrent.atomic.AtomicBoolean) r4
            java.lang.Object r15 = r15.o
            java.util.concurrent.atomic.AtomicReference r15 = (java.util.concurrent.atomic.AtomicReference) r15
            int r5 = one.me.android.OneMeApplication.X
            pna r5 = new pna
            r6 = 6
            r5.<init>(r6)
            sjd r6 = defpackage.sjd.a
            doa r7 = r6.e()
            boolean r7 = r7.e()
            if (r7 == 0) goto L_0x02bb
            boolean r4 = r4.get()
            if (r4 != 0) goto L_0x02bb
            long r8 = java.lang.System.nanoTime()
            yh0 r4 = defpackage.yh0.a
            q4 r4 = r4.getAccessor()
            java.lang.Class<fd4> r10 = defpackage.fd4.class
            java.lang.Object r4 = r4.g(r10)
            fd4 r4 = (defpackage.fd4) r4
            nz3 r10 = new nz3
            r10.<init>(r15, r2)
            r4.getClass()
            ry2 r2 = new ry2
            java.lang.String r4 = "all.chat.folder"
            r2.<init>(r4, r10)
            km3 r4 = r6.i()
            r4.d()
            qra r4 = defpackage.qra.a
            q4 r4 = r4.getAccessor()
            java.lang.Class<ei0> r10 = defpackage.ei0.class
            java.lang.Object r4 = r4.g(r10)
            ei0 r4 = (defpackage.ei0) r4
            r4.getClass()
            long r10 = java.lang.System.nanoTime()
            kotlin.Lazy r12 = r4.a
            java.lang.Object r12 = r12.getValue()
            edb r12 = (defpackage.edb) r12
            java.lang.String[] r13 = defpackage.edb.f
            boolean r12 = r12.b(r13)
            r12 = r12 ^ r0
            r4.e = r12
            kotlin.Lazy r12 = r4.a
            java.lang.Object r12 = r12.getValue()
            edb r12 = (defpackage.edb) r12
            int r13 = android.os.Build.VERSION.SDK_INT
            r14 = 33
            if (r13 < r14) goto L_0x0254
            java.lang.String[] r13 = defpackage.edb.k
            boolean r12 = r12.b(r13)
            goto L_0x0258
        L_0x0254:
            r12.getClass()
            r12 = r0
        L_0x0258:
            r0 = r0 ^ r12
            r4.f = r0
            boolean r12 = r4.e
            if (r12 != 0) goto L_0x0261
            if (r0 == 0) goto L_0x0269
        L_0x0261:
            zh0 r0 = new zh0
            r0.<init>(r4, r2, r3)
            java.lang.Object unused = defpackage.ev0.C(kotlin.coroutines.EmptyCoroutineContext.INSTANCE, r0)
        L_0x0269:
            a67 r0 = defpackage.z68.b
            if (r0 != 0) goto L_0x026e
            goto L_0x0292
        L_0x026e:
            boolean r2 = r0.c()
            if (r2 == 0) goto L_0x0292
            w78 r2 = defpackage.w78.o
            kotlin.time.Duration$Companion r4 = kotlin.time.Duration.Companion
            long r12 = java.lang.System.nanoTime()
            long r12 = r12 - r10
            kotlin.time.DurationUnit r4 = kotlin.time.DurationUnit.NANOSECONDS
            long r10 = kotlin.time.DurationKt.toDuration((long) r12, (kotlin.time.DurationUnit) r4)
            java.lang.String r4 = kotlin.time.Duration.m1402toStringimpl(r10)
            java.lang.String r10 = "load time "
            java.lang.String r4 = defpackage.a81.m(r10, r4)
            java.lang.String r10 = "BannersInitialDataStorage"
            r0.d(r2, r10, r4, r3)
        L_0x0292:
            a67 r0 = defpackage.z68.b
            if (r0 != 0) goto L_0x0297
            goto L_0x02bb
        L_0x0297:
            boolean r2 = r0.c()
            if (r2 == 0) goto L_0x02bb
            w78 r2 = defpackage.w78.o
            kotlin.time.Duration$Companion r4 = kotlin.time.Duration.Companion
            long r10 = java.lang.System.nanoTime()
            long r10 = r10 - r8
            kotlin.time.DurationUnit r4 = kotlin.time.DurationUnit.NANOSECONDS
            long r8 = kotlin.time.DurationKt.toDuration((long) r10, (kotlin.time.DurationUnit) r4)
            java.lang.String r4 = kotlin.time.Duration.m1402toStringimpl(r8)
            java.lang.String r8 = "bannersInitialDataStorage.load by "
            java.lang.String r4 = defpackage.a81.m(r8, r4)
            java.lang.String r8 = "InitialDataStorage"
            r0.d(r2, r8, r4, r3)
        L_0x02bb:
            java.lang.Object r15 = r15.get()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L_0x02d5
            if (r7 != 0) goto L_0x02ca
            goto L_0x02d5
        L_0x02ca:
            java.lang.String r15 = r1.y
            java.lang.String r0 = "LegacyChats: sync load"
            defpackage.z68.c(r15, r0, new java.lang.Object[0])
            r5.invoke()
            goto L_0x02f3
        L_0x02d5:
            java.lang.String r15 = r1.y
            java.lang.String r0 = "LegacyChats: async load"
            defpackage.z68.c(r15, r0, new java.lang.Object[0])
            gaf r15 = r6.y()
            osa r15 = (defpackage.osa) r15
            q04 r15 = r15.b()
            caa r0 = defpackage.caa.a
            si0 r1 = new si0
            r2 = 7
            r1.<init>(r2, r5)
            r15.p0(r0, r1)
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
        L_0x02f3:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        L_0x02f6:
            java.lang.Object r0 = r15.b
            qy7 r0 = (defpackage.qy7) r0
            ny7 r0 = r0.a
            if (r0 != 0) goto L_0x030a
            java.lang.Object r0 = r15.c
            android.view.View r0 = (android.view.View) r0
            boolean r1 = r0 instanceof defpackage.ny7
            if (r1 == 0) goto L_0x030b
            r3 = r0
            ny7 r3 = (defpackage.ny7) r3
            goto L_0x030b
        L_0x030a:
            r3 = r0
        L_0x030b:
            if (r3 == 0) goto L_0x0314
            java.lang.Object r15 = r15.o
            ta9 r15 = (defpackage.ta9) r15
            r3.Z0(r15)
        L_0x0314:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        L_0x0317:
            java.lang.Object r0 = r15.b
            qy7 r0 = (defpackage.qy7) r0
            ny7 r0 = r0.a
            if (r0 == 0) goto L_0x032c
            sy7 r1 = defpackage.sy7.v
            java.lang.Object r2 = r15.c
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r15 = r15.o
            android.view.View r15 = (android.view.View) r15
            r0.X(r2, r1, r3, r15)
        L_0x032c:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        L_0x032f:
            java.lang.Object r2 = r15.o
            xt6 r2 = (defpackage.xt6) r2
            boolean r4 = r2.a()
            if (r4 != 0) goto L_0x033b
            goto L_0x042a
        L_0x033b:
            java.lang.String r4 = "Start creating FirebaseApp"
            java.lang.String r5 = r2.b
            defpackage.z68.c(r5, r4, new java.lang.Object[0])
            long r6 = java.lang.System.nanoTime()
            java.lang.Object r4 = r15.b
            kotlin.Lazy r4 = (kotlin.Lazy) r4
            java.lang.Object r8 = r4.getValue()
            bud r8 = (defpackage.bud) r8
            akd r8 = (defpackage.akd) r8
            r8.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r9 = ru.ok.tamtam.android.prefs.PmsKey.f41fbexecreplace
            boolean r8 = r8.m(r9, r0)
            if (r8 == 0) goto L_0x0402
            java.lang.Object r4 = r4.getValue()
            bud r4 = (defpackage.bud) r4
            akd r4 = (defpackage.akd) r4
            r4.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r8 = ru.ok.tamtam.android.prefs.PmsKey.f40fbexecmodifiersnames
            java.lang.String r8 = r8.name()
            ls7 r4 = r4.g
            java.util.Set r4 = r4.getStringSet(r8, r3)
            if (r4 == 0) goto L_0x0380
            java.lang.String[] r8 = new java.lang.String[r1]
            java.lang.Object[] r4 = r4.toArray(r8)
            java.lang.String[] r4 = (java.lang.String[]) r4
            if (r4 != 0) goto L_0x0382
        L_0x0380:
            java.lang.String[] r4 = defpackage.bud.b
        L_0x0382:
            java.lang.String r8 = "ReplaceExecutorRegistrarLogic"
            java.lang.String r9 = "start"
            defpackage.z68.c(r8, r9, new java.lang.Object[0])
            int r9 = r4.length
            r10 = r1
        L_0x038b:
            if (r10 >= r9) goto L_0x039c
            r11 = r4[r10]
            java.lang.Class<java.lang.reflect.Field> r12 = java.lang.reflect.Field.class
            java.lang.reflect.Field r11 = r12.getDeclaredField(r11)     // Catch:{ all -> 0x039a }
            r11.setAccessible(r0)     // Catch:{ all -> 0x039a }
            r3 = r11
            goto L_0x039c
        L_0x039a:
            int r10 = r10 + r0
            goto L_0x038b
        L_0x039c:
            if (r3 != 0) goto L_0x039f
            goto L_0x0402
        L_0x039f:
            java.lang.String r0 = "BG_EXECUTOR"
            java.lang.reflect.Field r0 = defpackage.hsg.r(r3, r0)
            java.lang.Object r15 = r15.c
            kotlin.Lazy r15 = (kotlin.Lazy) r15
            if (r0 == 0) goto L_0x03ba
            ur r4 = new ur
            r9 = 27
            r4.<init>(r9, r15)
            defpackage.hsg.E(r0, r4)
            java.lang.String r0 = "BG_EXECUTOR replaced"
            defpackage.z68.c(r8, r0, new java.lang.Object[0])
        L_0x03ba:
            java.lang.String r0 = "LITE_EXECUTOR"
            java.lang.reflect.Field r0 = defpackage.hsg.r(r3, r0)
            if (r0 == 0) goto L_0x03d1
            ur r4 = new ur
            r9 = 28
            r4.<init>(r9, r15)
            defpackage.hsg.E(r0, r4)
            java.lang.String r0 = "LITE_EXECUTOR replaced"
            defpackage.z68.c(r8, r0, new java.lang.Object[0])
        L_0x03d1:
            java.lang.String r0 = "BLOCKING_EXECUTOR"
            java.lang.reflect.Field r0 = defpackage.hsg.r(r3, r0)
            if (r0 == 0) goto L_0x03e8
            ur r4 = new ur
            r9 = 29
            r4.<init>(r9, r15)
            defpackage.hsg.E(r0, r4)
            java.lang.String r0 = "BLOCKING_EXECUTOR replaced"
            defpackage.z68.c(r8, r0, new java.lang.Object[0])
        L_0x03e8:
            java.lang.String r0 = "SCHEDULER"
            java.lang.reflect.Field r0 = defpackage.hsg.r(r3, r0)
            if (r0 == 0) goto L_0x03fd
            a2d r3 = new a2d
            r3.<init>(r1, r15)
            defpackage.hsg.E(r0, r3)
            java.lang.String r15 = "SCHEDULER replaced"
            defpackage.z68.c(r8, r15, new java.lang.Object[0])
        L_0x03fd:
            java.lang.String r15 = "finish"
            defpackage.z68.c(r8, r15, new java.lang.Object[0])
        L_0x0402:
            android.content.Context r15 = r2.a
            hp5 r3 = defpackage.hp5.e(r15)
            kotlin.time.Duration$Companion r15 = kotlin.time.Duration.Companion
            long r0 = java.lang.System.nanoTime()
            long r0 = r0 - r6
            kotlin.time.DurationUnit r15 = kotlin.time.DurationUnit.NANOSECONDS
            long r0 = kotlin.time.DurationKt.toDuration((long) r0, (kotlin.time.DurationUnit) r15)
            java.lang.String r15 = kotlin.time.Duration.m1402toStringimpl(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "End creating FirebaseApp. Takes "
            r0.<init>(r1)
            r0.append(r15)
            java.lang.String r15 = r0.toString()
            defpackage.z68.c(r5, r15, new java.lang.Object[0])
        L_0x042a:
            return r3
        L_0x042b:
            java.lang.Object r0 = r15.c
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r15.b
            g71 r1 = (defpackage.g71) r1
            r1.v0 = r0
            java.lang.Object r15 = r15.o
            mo4 r15 = (defpackage.mo4) r15
            r15.getClass()
            y35 r0 = new y35
            r0.<init>((int) r2, (java.lang.Object) r1)
            r15.a(r0)
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
        L_0x0447:
            tz0 r0 = new tz0
            java.lang.Object r1 = r15.b
            kotlin.Lazy r1 = (kotlin.Lazy) r1
            java.lang.Object r2 = r15.o
            uz0 r2 = (defpackage.uz0) r2
            java.lang.Object r15 = r15.c
            kotlin.Lazy r15 = (kotlin.Lazy) r15
            r0.<init>(r1, r2, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz0.invoke():java.lang.Object");
    }

    public /* synthetic */ sz0(Object obj, Lazy lazy, Lazy lazy2, int i) {
        this.a = i;
        this.o = obj;
        this.b = lazy;
        this.c = lazy2;
    }

    public /* synthetic */ sz0(Lazy lazy, Object obj, Lazy lazy2, int i) {
        this.a = i;
        this.b = lazy;
        this.o = obj;
        this.c = lazy2;
    }
}
