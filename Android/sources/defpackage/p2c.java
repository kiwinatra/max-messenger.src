package defpackage;

import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* renamed from: p2c  reason: default package */
public final /* synthetic */ class p2c extends AdaptedFunctionReference implements Function2, SuspendFunction {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p2c(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.a = i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r1v43, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r9v5, types: [android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r9v8, types: [android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r9v11, types: [android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r9v14, types: [android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r9v18 */
    /* JADX WARNING: type inference failed for: r9v19 */
    /* JADX WARNING: type inference failed for: r9v20 */
    /* JADX WARNING: type inference failed for: r9v21 */
    /* JADX WARNING: type inference failed for: r9v22 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r32, java.lang.Object r33) {
        /*
            r31 = this;
            r0 = r31
            r1 = -1
            r2 = 2
            r3 = 5
            r4 = 3
            java.lang.String r5 = ""
            r6 = 8
            r7 = 1
            r8 = 0
            r9 = 0
            int r10 = r0.a
            switch(r10) {
                case 0: goto L_0x07cf;
                case 1: goto L_0x07bb;
                case 2: goto L_0x07a7;
                case 3: goto L_0x0793;
                case 4: goto L_0x0745;
                case 5: goto L_0x069c;
                case 6: goto L_0x0688;
                case 7: goto L_0x0617;
                case 8: goto L_0x05de;
                case 9: goto L_0x054c;
                case 10: goto L_0x0484;
                case 11: goto L_0x045c;
                case 12: goto L_0x0410;
                case 13: goto L_0x03cc;
                case 14: goto L_0x0257;
                case 15: goto L_0x018a;
                case 16: goto L_0x0149;
                case 17: goto L_0x012a;
                case 18: goto L_0x00cc;
                case 19: goto L_0x0079;
                case 20: goto L_0x0058;
                case 21: goto L_0x0024;
                default: goto L_0x0012;
            }
        L_0x0012:
            r1 = r32
            tf9 r1 = (defpackage.tf9) r1
            r2 = r33
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            ru.ok.tamtam.upload.workers.UploadFileAttachWorker r0 = (ru.ok.tamtam.upload.workers.UploadFileAttachWorker) r0
            r0.g(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0024:
            r1 = r32
            vk3 r1 = (defpackage.vk3) r1
            r2 = r33
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            rvf r0 = (defpackage.rvf) r0
            r0.getClass()
            boolean r2 = r1.c()
            xme r0 = r0.h
            if (r2 != 0) goto L_0x0052
            boolean r2 = r1.w()
            if (r2 == 0) goto L_0x0042
            goto L_0x0052
        L_0x0042:
            ovf r2 = new ovf
            long r3 = r1.r()
            r2.<init>(r3)
            r0.getClass()
            r0.m(r9, r2)
            goto L_0x0055
        L_0x0052:
            r0.setValue(r9)
        L_0x0055:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0058:
            r1 = r32
            kxf r1 = (defpackage.kxf) r1
            r2 = r33
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            h5f r0 = (defpackage.h5f) r0
            r0.getClass()
            w4f r3 = new w4f
            r3.<init>(r0, r1, r9)
            g12 r0 = new g12
            kotlin.coroutines.EmptyCoroutineContext r4 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            cu0 r6 = defpackage.cu0.a
            r5 = -2
            r7 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r0
        L_0x0079:
            r1 = r32
            bxf r1 = (defpackage.bxf) r1
            r2 = r33
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            h5f r0 = (defpackage.h5f) r0
            r0.getClass()
            y4f r2 = new y4f
            r2.<init>(r0, r1, r9)
            sbd r4 = new sbd
            r4.<init>(r2)
            zjb r2 = new zjb
            r5 = 11
            r2.<init>(r4, r1, r5)
            kotlin.time.Duration$Companion r4 = kotlin.time.Duration.Companion
            r4 = 500(0x1f4, float:7.0E-43)
            kotlin.time.DurationUnit r5 = kotlin.time.DurationUnit.MILLISECONDS
            long r4 = kotlin.time.DurationKt.toDuration((int) r4, (kotlin.time.DurationUnit) r5)
            g12 r2 = defpackage.gt5.d(r2, r4)
            uu5 r4 = new uu5
            r5 = 10
            r4.<init>(r0, r1, r9, r5)
            wb r1 = new wb
            r5 = 15
            r1.<init>(r5, r2, r4)
            z4f r2 = new z4f
            r2.<init>(r0, r9)
            wb r4 = new wb
            r5 = 16
            r4.<init>(r5, r1, r2)
            a5f r1 = new a5f
            r1.<init>(r0, r9)
            ps5 r0 = new ps5
            r0.<init>(r4, r1, r3)
            return r0
        L_0x00cc:
            r1 = r32
            java.util.List r1 = (java.util.List) r1
            r2 = r33
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            gwe r0 = (defpackage.gwe) r0
            r0.getClass()
            java.util.List r2 = kotlin.collections.CollectionsKt.createListBuilder()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x00e5:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x011e
            java.lang.Object r3 = r1.next()
            boe r3 = (defpackage.boe) r3
            java.lang.String r4 = r3.y
            if (r4 != 0) goto L_0x00f6
            r4 = r5
        L_0x00f6:
            int r6 = r4.length()
            if (r6 != 0) goto L_0x00fe
            java.lang.String r4 = r3.o
        L_0x00fe:
            r13 = r4
            gpe r4 = new gpe
            r17 = 0
            r21 = 3872(0xf20, float:5.426E-42)
            long r7 = r3.a
            long r11 = r3.Z
            java.lang.String r14 = r3.v0
            int r15 = r3.b
            int r3 = r3.c
            r18 = 0
            r19 = 0
            r6 = r4
            r9 = r11
            r16 = r3
            r6.<init>(r7, r9, r11, r13, r14, r15, r16, r17, r18, r19, r21)
            r2.add(r4)
            goto L_0x00e5
        L_0x011e:
            java.util.List r1 = kotlin.collections.CollectionsKt.build(r2)
            xme r0 = r0.w0
            r0.setValue(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x012a:
            r1 = r32
            v5a r1 = (defpackage.v5a) r1
            r2 = r33
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            one.me.stickersshowcase.StickersShowcaseScreen r0 = (one.me.stickersshowcase.StickersShowcaseScreen) r0
            kotlin.reflect.KProperty[] r2 = one.me.stickersshowcase.StickersShowcaseScreen.Y
            r0.getClass()
            boolean r1 = r1 instanceof defpackage.p33
            if (r1 == 0) goto L_0x0146
            e9d r0 = r0.getRouter()
            r0.C()
        L_0x0146:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0149:
            r1 = r32
            t8e r1 = (defpackage.t8e) r1
            r2 = r33
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            one.me.stickersshowcase.StickersShowcaseScreen r0 = (one.me.stickersshowcase.StickersShowcaseScreen) r0
            kotlin.reflect.KProperty[] r2 = one.me.stickersshowcase.StickersShowcaseScreen.Y
            r0.getClass()
            boolean r2 = r1 instanceof defpackage.t8e
            if (r2 == 0) goto L_0x0187
            z3a r2 = r0.z
            if (r2 == 0) goto L_0x0165
            r2.o()
        L_0x0165:
            e0b r2 = new e0b
            r2.<init>((one.me.sdk.arch.Widget) r0)
            o0b r3 = new o0b
            int r4 = r1.a
            r3.<init>(r4)
            r2.f(r3)
            android.content.Context r3 = r0.getContext()
            int r1 = r1.b
            java.lang.String r1 = r3.getString(r1)
            r2.i(r1)
            z3a r1 = r2.j()
            r0.z = r1
        L_0x0187:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x018a:
            r3 = r32
            v8e r3 = (defpackage.v8e) r3
            r5 = r33
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r0 = r0.receiver
            one.me.stickersshowcase.StickersShowcaseScreen r0 = (one.me.stickersshowcase.StickersShowcaseScreen) r0
            kotlin.reflect.KProperty[] r5 = one.me.stickersshowcase.StickersShowcaseScreen.Y
            r0.getClass()
            u8e r5 = r3.a
            int r5 = r5.ordinal()
            o61 r10 = r0.X
            sn0 r11 = r0.x
            sn0 r12 = r0.y
            if (r5 == 0) goto L_0x021d
            if (r5 == r7) goto L_0x01fb
            if (r5 == r2) goto L_0x01fb
            if (r5 != r4) goto L_0x01f5
            android.view.View r2 = r0.getView()
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x01ba
            r9 = r2
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
        L_0x01ba:
            if (r9 == 0) goto L_0x01de
            java.lang.Object r2 = r12.getValue()
            android.view.View r2 = (android.view.View) r2
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r1, r1)
            kotlin.reflect.KProperty[] r1 = one.me.stickersshowcase.StickersShowcaseScreen.Y
            r1 = r1[r7]
            kotlin.properties.ReadOnlyProperty r4 = r0.v
            java.lang.Object r1 = r4.getValue(r0, r1)
            h3b r1 = (defpackage.h3b) r1
            int r1 = r1.getMeasuredHeight()
            r3.topMargin = r1
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            defpackage.f6e.b(r9, r2, r3)
        L_0x01de:
            r12.getValue()
            java.lang.Object r1 = r12.getValue()
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r8)
            defpackage.h88.D(r11)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = r0.c0()
            r0.setVisibility(r6)
            goto L_0x0254
        L_0x01f5:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01fb:
            java.util.List r1 = r3.b
            r10.G(r1)
            defpackage.h88.D(r11)
            defpackage.h88.D(r12)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r1 = r0.c0()
            r1.setVisibility(r8)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r1 = r0.c0()
            mve r0 = r0.d0()
            boolean r0 = r0.k()
            r1.setRefreshingNext(r0)
            goto L_0x0254
        L_0x021d:
            android.view.View r1 = r0.getView()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0228
            r9 = r1
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
        L_0x0228:
            if (r9 == 0) goto L_0x0233
            java.lang.Object r1 = r11.getValue()
            android.view.View r1 = (android.view.View) r1
            defpackage.f6e.c(r9, r1, -1)
        L_0x0233:
            java.lang.Object r1 = r11.getValue()
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r8)
            defpackage.h88.D(r12)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r1 = r0.c0()
            r1.setVisibility(r6)
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r10.G(r1)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = r0.c0()
            r0.setRefreshingNext(r8)
        L_0x0254:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0257:
            r1 = r32
            vue r1 = (defpackage.vue) r1
            r2 = r33
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            zue r0 = (defpackage.zue) r0
            r0.getClass()
            java.util.List r2 = r1.a
            if (r2 == 0) goto L_0x03c9
            java.util.List r2 = r1.b
            if (r2 == 0) goto L_0x03c9
            java.util.List r2 = r1.c
            if (r2 == 0) goto L_0x03c9
            java.util.List r2 = kotlin.collections.CollectionsKt.createListBuilder()
            java.util.List r3 = r1.a
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 == 0) goto L_0x0290
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0284
            goto L_0x0290
        L_0x0284:
            java.lang.String r3 = r0.j(r3)
            mgf r4 = new mgf
            r4.<init>(r3)
            r16 = r4
            goto L_0x0292
        L_0x0290:
            r16 = r9
        L_0x0292:
            s1e r3 = new s1e
            int r4 = defpackage.n1b.p
            igf r14 = new igf
            r14.<init>(r4)
            int r4 = defpackage.l1b.c
            java.lang.Integer r17 = java.lang.Integer.valueOf(r4)
            a1e r26 = defpackage.a1e.a
            r19 = 0
            r22 = 904(0x388, float:1.267E-42)
            r11 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            r13 = 0
            r15 = 0
            r20 = 0
            r21 = 0
            r10 = r3
            r18 = r26
            r10.<init>(r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            vmd r4 = new vmd
            nue r6 = defpackage.nue.b
            r6.getClass()
            pa4 r6 = new pa4
            java.lang.String r10 = ":stickers/recent"
            r6.<init>(r10)
            int r20 = defpackage.m1b.m
            jnd r23 = defpackage.jnd.a
            r21 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            r17 = r4
            r18 = r3
            r19 = r6
            r17.<init>(r18, r19, r20, r21, r23)
            r2.add(r4)
            java.util.List r3 = r1.b
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 == 0) goto L_0x02f5
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x02e9
            goto L_0x02f5
        L_0x02e9:
            java.lang.String r3 = r0.j(r3)
            mgf r4 = new mgf
            r4.<init>(r3)
            r24 = r4
            goto L_0x02f7
        L_0x02f5:
            r24 = r9
        L_0x02f7:
            s1e r11 = new s1e
            int r3 = defpackage.n1b.d
            igf r4 = new igf
            r4.<init>(r3)
            int r3 = defpackage.cad.L
            java.lang.Integer r25 = java.lang.Integer.valueOf(r3)
            r27 = 0
            r30 = 904(0x388, float:1.267E-42)
            r19 = 9223372036854775805(0x7ffffffffffffffd, double:NaN)
            r21 = 0
            r23 = 0
            r28 = 0
            r29 = 0
            r18 = r11
            r22 = r4
            r18.<init>(r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            vmd r3 = new vmd
            pa4 r12 = new pa4
            java.lang.String r4 = ":stickers/favorite"
            r12.<init>(r4)
            int r13 = defpackage.m1b.h
            jnd r16 = defpackage.jnd.c
            r14 = 9223372036854775805(0x7ffffffffffffffd, double:NaN)
            r10 = r3
            r10.<init>(r11, r12, r13, r14, r16)
            r2.add(r3)
            java.util.List r3 = r1.c
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L_0x03a0
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0344
            goto L_0x03a0
        L_0x0344:
            rmd r3 = new rmd
            int r4 = defpackage.n1b.r
            igf r6 = new igf
            r6.<init>(r4)
            int r4 = defpackage.m1b.s
            r3.<init>(r4, r6)
            r2.add(r3)
            java.util.List r1 = r1.c
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L_0x03a0
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0363
            goto L_0x03a0
        L_0x0363:
            r3 = r1
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x036a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x03a0
            java.lang.Object r4 = r3.next()
            bqe r4 = (defpackage.bqe) r4
            umd r6 = new umd
            long r11 = r4.a
            java.lang.String r10 = r4.b
            if (r10 != 0) goto L_0x0380
            r14 = r5
            goto L_0x0381
        L_0x0380:
            r14 = r10
        L_0x0381:
            java.util.List r10 = r4.h
            java.lang.String r15 = r0.j(r10)
            int r10 = r1.size()
            if (r10 <= r7) goto L_0x0390
            r17 = r7
            goto L_0x0392
        L_0x0390:
            r17 = r8
        L_0x0392:
            java.lang.String r13 = r4.c
            java.lang.String r4 = r4.g
            r10 = r6
            r16 = r4
            r10.<init>(r11, r13, r14, r15, r16, r17)
            r2.add(r6)
            goto L_0x036a
        L_0x03a0:
            java.util.List r1 = kotlin.collections.CollectionsKt.build(r2)
            xme r0 = r0.y
            r0.setValue(r1)
            java.lang.Class<zue> r0 = defpackage.zue.class
            java.lang.String r0 = r0.getName()
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x03b4
            goto L_0x03c9
        L_0x03b4:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x03c9
            w78 r3 = defpackage.w78.o
            int r1 = r1.size()
            java.lang.String r4 = "process sections. finish, size:"
            java.lang.String r1 = defpackage.wj6.h(r1, r4)
            r2.d(r3, r0, r1, r9)
        L_0x03c9:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x03cc:
            r1 = r32
            java.lang.String r1 = (java.lang.String) r1
            r2 = r33
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            iue r0 = (defpackage.iue) r0
            java.lang.Class<iue> r2 = defpackage.iue.class
            java.lang.String r2 = r2.getName()
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x03e3
            goto L_0x03f7
        L_0x03e3:
            r0.getClass()
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x03f7
            w78 r4 = defpackage.w78.o
            java.lang.String r5 = "Stickers sets search. start, q:"
            java.lang.String r5 = defpackage.a81.m(r5, r1)
            r3.d(r4, r2, r5, r9)
        L_0x03f7:
            jx3 r2 = r0.c
            f14 r3 = defpackage.f14.b
            hue r4 = new hue
            r4.<init>(r1, r0, r9)
            aje r1 = defpackage.ev0.v(r2, r9, r3, r4, r7)
            wie r2 = r0.i
            kotlin.reflect.KProperty[] r3 = defpackage.iue.j
            r3 = r3[r8]
            r2.setValue(r0, r3, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0410:
            r1 = r32
            java.lang.String r1 = (java.lang.String) r1
            r2 = r33
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            ute r0 = (defpackage.ute) r0
            java.lang.Class<ute> r2 = defpackage.ute.class
            java.lang.String r2 = r2.getName()
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x0427
            goto L_0x043b
        L_0x0427:
            r0.getClass()
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x043b
            w78 r4 = defpackage.w78.o
            java.lang.String r5 = "Stickers search. start, q:"
            java.lang.String r5 = defpackage.a81.m(r5, r1)
            r3.d(r4, r2, r5, r9)
        L_0x043b:
            gaf r2 = r0.c
            osa r2 = (defpackage.osa) r2
            q04 r2 = r2.b()
            f14 r3 = defpackage.f14.b
            tte r4 = new tte
            r4.<init>(r1, r0, r9)
            jx3 r1 = r0.a
            aje r1 = defpackage.ev0.u(r1, r2, r3, r4)
            wie r2 = r0.Z
            kotlin.reflect.KProperty[] r3 = defpackage.ute.w0
            r3 = r3[r8]
            r2.setValue(r0, r3, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x045c:
            r1 = r32
            v5a r1 = (defpackage.v5a) r1
            r2 = r33
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            one.me.stickerssearch.StickersSearchScreen r0 = (one.me.stickerssearch.StickersSearchScreen) r0
            kotlin.reflect.KProperty[] r2 = one.me.stickerssearch.StickersSearchScreen.X
            r0.getClass()
            boolean r1 = r1 instanceof defpackage.p33
            if (r1 == 0) goto L_0x0481
            android.app.Activity r1 = r0.getActivity()
            if (r1 == 0) goto L_0x047a
            defpackage.kr7.A(r1)
        L_0x047a:
            e9d r0 = r0.getRouter()
            r0.C()
        L_0x0481:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0484:
            r3 = r32
            kld r3 = (defpackage.kld) r3
            r4 = r33
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            java.lang.Object r0 = r0.receiver
            one.me.stickerssearch.StickersSearchScreen r0 = (one.me.stickerssearch.StickersSearchScreen) r0
            kotlin.reflect.KProperty[] r4 = one.me.stickerssearch.StickersSearchScreen.X
            r0.getClass()
            jld r4 = r3.a
            int r4 = r4.ordinal()
            t56 r5 = r0.z
            sn0 r10 = r0.x
            sn0 r11 = r0.y
            if (r4 == 0) goto L_0x0512
            if (r4 == r7) goto L_0x04f0
            if (r4 != r2) goto L_0x04ea
            android.view.View r3 = r0.getView()
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x04b2
            r9 = r3
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
        L_0x04b2:
            if (r9 == 0) goto L_0x04d6
            java.lang.Object r3 = r11.getValue()
            android.view.View r3 = (android.view.View) r3
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r1, r1)
            kotlin.reflect.KProperty[] r1 = one.me.stickerssearch.StickersSearchScreen.X
            r1 = r1[r2]
            kotlin.properties.ReadOnlyProperty r2 = r0.w
            java.lang.Object r1 = r2.getValue(r0, r1)
            pza r1 = (defpackage.pza) r1
            int r1 = r1.getMeasuredHeight()
            r4.topMargin = r1
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            defpackage.f6e.b(r9, r3, r4)
        L_0x04d6:
            java.lang.Object r1 = r11.getValue()
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r8)
            defpackage.h88.D(r10)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = r0.c0()
            r0.setVisibility(r6)
            goto L_0x0549
        L_0x04ea:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04f0:
            java.util.List r1 = r3.b
            r5.G(r1)
            defpackage.h88.D(r10)
            defpackage.h88.D(r11)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r1 = r0.c0()
            r1.setVisibility(r8)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r1 = r0.c0()
            ute r0 = r0.d0()
            boolean r0 = r0.k()
            r1.setRefreshingNext(r0)
            goto L_0x0549
        L_0x0512:
            android.view.View r1 = r0.getView()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x051d
            r9 = r1
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
        L_0x051d:
            if (r9 == 0) goto L_0x0528
            java.lang.Object r1 = r10.getValue()
            android.view.View r1 = (android.view.View) r1
            defpackage.f6e.c(r9, r1, -1)
        L_0x0528:
            java.lang.Object r1 = r10.getValue()
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r8)
            defpackage.h88.D(r11)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r1 = r0.c0()
            r1.setVisibility(r6)
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r5.G(r1)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r0 = r0.c0()
            r0.setRefreshingNext(r8)
        L_0x0549:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x054c:
            r1 = r32
            mqe r1 = (defpackage.mqe) r1
            r2 = r33
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            one.me.stickerspreview.set.StickerSetBottomSheet r0 = (one.me.stickerspreview.set.StickerSetBottomSheet) r0
            kotlin.reflect.KProperty[] r2 = one.me.stickerspreview.set.StickerSetBottomSheet.x0
            if (r1 != 0) goto L_0x0561
            r0.getClass()
            goto L_0x05db
        L_0x0561:
            r0.getClass()
            kotlin.reflect.KProperty[] r2 = one.me.stickerspreview.set.StickerSetBottomSheet.x0
            r3 = r2[r4]
            sn0 r3 = r0.w0
            java.lang.Object r3 = r3.getValue()
            android.view.View r3 = (android.view.View) r3
            r3.setVisibility(r6)
            java.util.List r3 = r1.v
            int r4 = r3.size()
            android.content.Context r6 = r0.getContext()
            android.content.res.Resources r6 = r6.getResources()
            int r9 = defpackage.gza.a
            java.lang.String r6 = r6.getQuantityString(r9, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r7)
            java.lang.String r4 = java.lang.String.format(r6, r4)
            lqe r6 = defpackage.lqe.b
            lqe r9 = r1.w
            if (r9 != r6) goto L_0x05a0
            int r10 = defpackage.hza.b
            goto L_0x05a2
        L_0x05a0:
            int r10 = defpackage.hza.a
        L_0x05a2:
            if (r9 != r6) goto L_0x05a7
            zpa r6 = defpackage.zpa.b
            goto L_0x05a9
        L_0x05a7:
            zpa r6 = defpackage.zpa.a
        L_0x05a9:
            r2 = r2[r7]
            kotlin.properties.ReadOnlyProperty r7 = r0.X
            java.lang.Object r2 = r7.getValue(r0, r2)
            yte r2 = (defpackage.yte) r2
            android.content.Context r7 = r0.getContext()
            ngf r1 = r1.b
            java.lang.CharSequence r1 = r1.a(r7)
            if (r1 != 0) goto L_0x05c0
            goto L_0x05c1
        L_0x05c0:
            r5 = r1
        L_0x05c1:
            android.widget.TextView r1 = r2.a
            r1.setText(r5)
            android.widget.TextView r1 = r2.b
            r1.setText(r4)
            one.me.sdk.uikit.common.button.OneMeButton r1 = r2.c
            r1.setText((int) r10)
            r1.setMode(r6)
            r1.setVisibility(r8)
            t56 r0 = r0.Z
            r0.G(r3)
        L_0x05db:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x05de:
            r1 = r32
            n85 r1 = (defpackage.n85) r1
            r2 = r33
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            one.me.stickerspreview.StickerPreviewScreen r0 = (one.me.stickerspreview.StickerPreviewScreen) r0
            kotlin.reflect.KProperty[] r2 = one.me.stickerspreview.StickerPreviewScreen.v0
            r0.getClass()
            boolean r2 = r1 instanceof defpackage.p8e
            if (r2 == 0) goto L_0x0614
            e0b r2 = new e0b
            r2.<init>((one.me.sdk.arch.Widget) r0)
            o0b r3 = new o0b
            p8e r1 = (defpackage.p8e) r1
            int r4 = r1.a
            r3.<init>(r4)
            r2.f(r3)
            android.content.Context r0 = r0.getContext()
            int r1 = r1.b
            java.lang.String r0 = r0.getString(r1)
            r2.i(r0)
            r2.j()
        L_0x0614:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0617:
            r1 = r32
            v5a r1 = (defpackage.v5a) r1
            r2 = r33
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            one.me.stickerspreview.StickerPreviewScreen r0 = (one.me.stickerspreview.StickerPreviewScreen) r0
            kotlin.reflect.KProperty[] r2 = one.me.stickerspreview.StickerPreviewScreen.v0
            r0.getClass()
            boolean r1 = r1 instanceof defpackage.p33
            if (r1 == 0) goto L_0x0685
            kotlin.reflect.KProperty[] r1 = one.me.stickerspreview.StickerPreviewScreen.v0
            r1 = r1[r7]
            is r1 = r0.a
            java.lang.Object r1 = r1.a(r0)
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.String r3 = "chats?id="
            java.lang.String r1 = defpackage.wj6.i(r1, r3)
            e9d r2 = r0.getRouter()
            java.util.ArrayList r2 = r2.e()
            java.util.Iterator r2 = r2.iterator()
        L_0x064e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0666
            java.lang.Object r3 = r2.next()
            r4 = r3
            i9d r4 = (defpackage.i9d) r4
            java.lang.String r4 = r4.b
            if (r4 == 0) goto L_0x064e
            boolean r4 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r4, (java.lang.CharSequence) r1, false, 2, (java.lang.Object) null)
            if (r4 != r7) goto L_0x064e
            goto L_0x0667
        L_0x0666:
            r3 = r9
        L_0x0667:
            i9d r3 = (defpackage.i9d) r3
            if (r3 == 0) goto L_0x066d
            java.lang.String r9 = r3.b
        L_0x066d:
            if (r9 == 0) goto L_0x067e
            int r1 = r9.length()
            if (r1 != 0) goto L_0x0676
            goto L_0x067e
        L_0x0676:
            e9d r0 = r0.getRouter()
            r0.D(r9)
            goto L_0x0685
        L_0x067e:
            e9d r0 = r0.getRouter()
            r0.C()
        L_0x0685:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0688:
            r1 = r32
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = r33
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            h3b r0 = (defpackage.h3b) r0
            kotlin.reflect.KProperty[] r2 = one.me.stickerspreview.StickerPreviewScreen.v0
            r0.setTitle((java.lang.CharSequence) r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x069c:
            r1 = r32
            gpe r1 = (defpackage.gpe) r1
            r2 = r33
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            one.me.stickerspreview.StickerPreviewScreen r0 = (one.me.stickerspreview.StickerPreviewScreen) r0
            kotlin.reflect.KProperty[] r2 = one.me.stickerspreview.StickerPreviewScreen.v0
            r0.getClass()
            if (r1 != 0) goto L_0x06b1
            goto L_0x0742
        L_0x06b1:
            kotlin.properties.ReadOnlyProperty r2 = r0.y
            java.lang.String r4 = r1.v
            if (r4 == 0) goto L_0x06f5
            int r4 = r4.length()
            if (r4 != 0) goto L_0x06be
            goto L_0x06f5
        L_0x06be:
            kotlin.reflect.KProperty[] r4 = one.me.stickerspreview.StickerPreviewScreen.v0
            r3 = r4[r3]
            java.lang.Object r2 = r2.getValue(r0, r3)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r3 = 9
            r5 = r4[r3]
            sn0 r5 = r0.Z
            java.lang.Object r6 = r5.getValue()
            pb8 r6 = (defpackage.pb8) r6
            defpackage.f6e.c(r2, r6, -1)
            r2 = r4[r3]
            java.lang.Object r2 = r5.getValue()
            pb8 r2 = (defpackage.pb8) r2
            r3 = 160(0xa0, float:2.24E-43)
            float r3 = (float) r3
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r3 = r3 * r4
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            r2.a(r1, r3)
            goto L_0x0717
        L_0x06f5:
            kotlin.reflect.KProperty[] r4 = one.me.stickerspreview.StickerPreviewScreen.v0
            r3 = r4[r3]
            java.lang.Object r2 = r2.getValue(r0, r3)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r3 = r4[r6]
            sn0 r3 = r0.Y
            java.lang.Object r5 = r3.getValue()
            hoe r5 = (defpackage.hoe) r5
            defpackage.f6e.c(r2, r5, -1)
            r2 = r4[r6]
            java.lang.Object r2 = r3.getValue()
            hoe r2 = (defpackage.hoe) r2
            r2.a(r1)
        L_0x0717:
            kotlin.reflect.KProperty[] r2 = one.me.stickerspreview.StickerPreviewScreen.v0
            r3 = 6
            r4 = r2[r3]
            kotlin.properties.ReadOnlyProperty r5 = r0.z
            java.lang.Object r4 = r5.getValue(r0, r4)
            t67 r4 = (defpackage.t67) r4
            boolean r1 = r1.X
            if (r1 == 0) goto L_0x072b
            int r6 = defpackage.cad.M
            goto L_0x072d
        L_0x072b:
            int r6 = defpackage.cad.L
        L_0x072d:
            r4.setIcon(r6)
            r2 = r2[r3]
            java.lang.Object r0 = r5.getValue(r0, r2)
            t67 r0 = (defpackage.t67) r0
            if (r1 == 0) goto L_0x073d
            int r1 = defpackage.i1b.c
            goto L_0x073f
        L_0x073d:
            int r1 = defpackage.i1b.a
        L_0x073f:
            r0.setLabel(r1)
        L_0x0742:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0745:
            r1 = r32
            lg7 r1 = (defpackage.lg7) r1
            r2 = r33
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            afe r0 = (defpackage.afe) r0
            r0.getClass()
            if (r1 == 0) goto L_0x0790
            oee r1 = (defpackage.oee) r1
            gg3 r1 = r1.F0
            android.view.ViewPropertyAnimator r1 = r1.animate()
            if (r1 != 0) goto L_0x0761
            goto L_0x0790
        L_0x0761:
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = -1054867456(0xffffffffc1200000, float:-10.0)
            float r2 = r2 * r3
            android.view.ViewPropertyAnimator r2 = r1.translationY(r2)
            r5 = 200(0xc8, double:9.9E-322)
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r5)
            kotlin.Lazy r3 = r0.b
            java.lang.Object r3 = r3.getValue()
            android.view.animation.AccelerateDecelerateInterpolator r3 = (android.view.animation.AccelerateDecelerateInterpolator) r3
            android.view.ViewPropertyAnimator r2 = r2.setInterpolator(r3)
            s6e r3 = new s6e
            r3.<init>(r4, r1, r0)
            android.view.ViewPropertyAnimator r0 = r2.withEndAction(r3)
            r0.start()
        L_0x0790:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0793:
            r1 = r32
            java.util.List r1 = (java.util.List) r1
            r2 = r33
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            c3e r0 = (defpackage.c3e) r0
            kotlin.reflect.KProperty[] r2 = one.me.settings.privacy.ui.SettingsPrivacyScreen.x
            r0.G(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x07a7:
            r1 = r32
            java.util.List r1 = (java.util.List) r1
            r2 = r33
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            k2e r0 = (defpackage.k2e) r0
            kotlin.reflect.KProperty[] r2 = one.me.settings.privacy.ui.SettingMediaScreen.w
            r0.G(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x07bb:
            r1 = r32
            java.util.List r1 = (java.util.List) r1
            r2 = r33
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            b4c r0 = (defpackage.b4c) r0
            int r2 = one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen.o
            r0.G(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x07cf:
            r1 = r32
            t34 r1 = (defpackage.t34) r1
            r2 = r33
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            z2c r0 = (defpackage.z2c) r0
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.x0
            boolean r2 = r2.compareAndSet(r8, r7)
            if (r2 != 0) goto L_0x07e4
            goto L_0x0855
        L_0x07e4:
            a32 r2 = r0.k()
            if (r2 != 0) goto L_0x07eb
            goto L_0x0855
        L_0x07eb:
            r0.j(r2)
            r34 r2 = defpackage.r34.a
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            s85 r0 = r0.B0
            if (r2 == 0) goto L_0x0823
            c2c r1 = new c2c
            int r2 = defpackage.lxa.e1
            igf r3 = new igf
            r3.<init>(r2)
            int r2 = defpackage.lxa.c1
            igf r4 = new igf
            r4.<init>(r2)
            pg3 r2 = new pg3
            int r5 = defpackage.jxa.N
            int r6 = defpackage.lxa.b1
            igf r7 = new igf
            r7.<init>(r6)
            og3 r6 = defpackage.og3.c
            r2.<init>(r5, r7, r6)
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r2)
            r1.<init>(r3, r4, r2)
            defpackage.xag.h(r0, r1)
            goto L_0x0855
        L_0x0823:
            s34 r2 = defpackage.s34.a
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x0858
            c2c r1 = new c2c
            int r2 = defpackage.lxa.e1
            igf r3 = new igf
            r3.<init>(r2)
            int r2 = defpackage.lxa.d1
            igf r4 = new igf
            r4.<init>(r2)
            pg3 r2 = new pg3
            int r5 = defpackage.jxa.N
            int r6 = defpackage.lxa.b1
            igf r7 = new igf
            r7.<init>(r6)
            og3 r6 = defpackage.og3.c
            r2.<init>(r5, r7, r6)
            java.util.List r2 = kotlin.collections.CollectionsKt.listOf(r2)
            r1.<init>(r3, r4, r2)
            defpackage.xag.h(r0, r1)
        L_0x0855:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0858:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p2c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
