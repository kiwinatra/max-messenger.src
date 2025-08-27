package defpackage;

import kotlin.Lazy;
import kotlin.jvm.functions.Function0;

/* renamed from: j35  reason: default package */
public final /* synthetic */ class j35 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j35(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: java.util.Map$Entry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r1v169, types: [java.lang.Object, ldb] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x03a8  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03e9  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x041f  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0436  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0463  */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x04b1  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x04c4  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04ed  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0434 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r17 = this;
            r0 = r17
            r1 = 2
            r2 = 0
            r3 = 0
            r4 = 1
            int r5 = r0.a
            switch(r5) {
                case 0: goto L_0x09ff;
                case 1: goto L_0x0789;
                case 2: goto L_0x0777;
                case 3: goto L_0x0724;
                case 4: goto L_0x0702;
                case 5: goto L_0x06ee;
                case 6: goto L_0x06d6;
                case 7: goto L_0x06ad;
                case 8: goto L_0x069a;
                case 9: goto L_0x0688;
                case 10: goto L_0x064e;
                case 11: goto L_0x0607;
                case 12: goto L_0x059c;
                case 13: goto L_0x053c;
                case 14: goto L_0x052a;
                case 15: goto L_0x04ff;
                case 16: goto L_0x02f8;
                case 17: goto L_0x026a;
                case 18: goto L_0x0237;
                case 19: goto L_0x01c0;
                case 20: goto L_0x01a5;
                case 21: goto L_0x0134;
                case 22: goto L_0x011f;
                case 23: goto L_0x0102;
                case 24: goto L_0x00db;
                case 25: goto L_0x0073;
                case 26: goto L_0x0063;
                case 27: goto L_0x004d;
                case 28: goto L_0x001b;
                default: goto L_0x000b;
            }
        L_0x000b:
            yqa r1 = new yqa
            java.lang.Object r2 = r0.c
            gy8 r2 = (defpackage.gy8) r2
            long r2 = r2.o
            java.lang.Object r0 = r0.b
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            r1.<init>(r0, r2)
            return r1
        L_0x001b:
            java.lang.Object r1 = r0.b
            yna r1 = (defpackage.yna) r1
            java.lang.Object r0 = r0.c
            r2 = r0
            one.me.android.OneMeApplication r2 = (one.me.android.OneMeApplication) r2
            int r0 = one.me.android.OneMeApplication.X
            defpackage.hpf.a(r1)     // Catch:{ all -> 0x0031 }
            java.lang.String r0 = r2.y     // Catch:{ all -> 0x0031 }
            java.lang.String r1 = "Tracer init success!"
            defpackage.z68.c(r0, r1, new java.lang.Object[0])     // Catch:{ all -> 0x0031 }
            goto L_0x004a
        L_0x0031:
            r0 = move-exception
            java.lang.String r1 = r2.y
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "/Tracer"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "failed when init"
            defpackage.z68.f(r1, r2, r0)
        L_0x004a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x004d:
            faa r1 = new faa
            java.lang.Object r2 = r0.c
            iaa r2 = (defpackage.iaa) r2
            kotlin.Lazy r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            d14 r2 = (defpackage.d14) r2
            java.lang.Object r0 = r0.b
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            r1.<init>(r2, r0)
            return r1
        L_0x0063:
            ld0 r1 = new ld0
            java.lang.Object r2 = r0.c
            ir9 r2 = (defpackage.ir9) r2
            int r2 = r2.b
            java.lang.Object r0 = r0.b
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            r1.<init>(r2, r0)
            return r1
        L_0x0073:
            java.lang.Object r1 = r0.c
            po9 r1 = (defpackage.po9) r1
            android.content.Context r4 = r1.a
            int r5 = defpackage.tmc.tt_you
            java.lang.String r4 = r4.getString(r5)
            kotlin.Lazy r1 = r1.i
            java.lang.Object r5 = r1.getValue()
            km3 r5 = (defpackage.km3) r5
            vk3 r5 = r5.r()
            if (r5 == 0) goto L_0x0096
            long r5 = r5.r()
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            goto L_0x0097
        L_0x0096:
            r5 = r3
        L_0x0097:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.Object r1 = r1.getValue()
            km3 r1 = (defpackage.km3) r1
            vk3 r1 = r1.r()
            if (r1 == 0) goto L_0x00c8
            java.lang.Object r0 = r0.b
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            java.lang.Object r0 = r0.getValue()
            jwa r0 = (defpackage.jwa) r0
            r0.getClass()
            iwa r6 = new iwa
            r6.<init>(r0, r1, r3)
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            java.lang.Object r0 = defpackage.ev0.C(r0, r6)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto L_0x00c8
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.b(r0)
            goto L_0x00c9
        L_0x00c8:
            r0 = r3
        L_0x00c9:
            ldb r1 = new ldb
            r1.<init>()
            r1.a = r4
            r1.b = r0
            r1.c = r3
            r1.d = r5
            r1.e = r2
            r1.f = r2
            return r1
        L_0x00db:
            java.lang.Object r1 = r0.b
            en9 r1 = (defpackage.en9) r1
            s85 r1 = r1.t1
            fk9 r2 = defpackage.fk9.b
            java.lang.Object r0 = r0.c
            kx7 r0 = (defpackage.kx7) r0
            gx7 r0 = (defpackage.gx7) r0
            java.lang.String r0 = r0.a
            r2.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ":call-join-preview?link="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            defpackage.a81.r(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0102:
            cx9 r7 = new cx9
            java.lang.Object r1 = r0.c
            en9 r1 = (defpackage.en9) r1
            jx3 r3 = r1.a
            zw r6 = new zw
            r2 = 27
            r6.<init>((int) r2, (java.lang.Object) r1)
            gaf r4 = r1.w
            java.lang.Object r0 = r0.b
            r2 = r0
            kotlin.Lazy r2 = (kotlin.Lazy) r2
            xme r5 = r1.l1
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return r7
        L_0x011f:
            q00 r1 = new q00
            java.lang.Object r2 = r0.c
            ve9 r2 = (defpackage.ve9) r2
            r3 = 17
            r1.<init>(r3, r2)
            android.view.GestureDetector r2 = new android.view.GestureDetector
            java.lang.Object r0 = r0.b
            android.content.Context r0 = (android.content.Context) r0
            r2.<init>(r0, r1)
            return r2
        L_0x0134:
            android.widget.ImageView r1 = new android.widget.ImageView
            java.lang.Object r2 = r0.b
            android.content.Context r2 = (android.content.Context) r2
            r1.<init>(r2)
            int r2 = defpackage.dad.S
            r1.setId(r2)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = 28
            float r3 = (float) r3
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r4 = r4 * r3
            int r4 = kotlin.math.MathKt.roundToInt((float) r4)
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r3 = r3 * r5
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            r2.<init>(r4, r3)
            r3 = 80
            r2.gravity = r3
            java.lang.Object r0 = r0.c
            dc9 r0 = (defpackage.dc9) r0
            int r3 = r0.a
            int r4 = r2.leftMargin
            int r5 = r2.topMargin
            int r6 = r2.rightMargin
            r2.setMargins(r4, r5, r6, r3)
            r1.setLayoutParams(r2)
            int r0 = r0.o
            r1.setImageResource(r0)
            js9 r0 = defpackage.fu4.k
            android.content.Context r2 = r1.getContext()
            fu4 r0 = r0.e(r2)
            k2b r0 = r0.f()
            hq2 r0 = r0.a()
            zqg r0 = r0.f()
            arg r0 = r0.c
            int r0 = r0.c
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.setImageTintList(r0)
            return r1
        L_0x01a5:
            java.lang.Object r1 = r0.b
            xr8 r1 = (defpackage.xr8) r1
            kotlin.jvm.functions.Function0 r1 = r1.d
            java.lang.Object r1 = r1.invoke()
            oq7 r1 = (defpackage.oq7) r1
            if (r1 == 0) goto L_0x01b6
            r1.F()
        L_0x01b6:
            java.lang.Object r0 = r0.c
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            r0.invoke()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x01c0:
            kotlin.reflect.KProperty[] r1 = one.me.sdk.gallery.MediaGalleryWidget.x
            sjd r1 = defpackage.sjd.a
            m95 r1 = r1.l()
            n95 r5 = new n95
            r5.<init>(r1)
            fdb r1 = defpackage.fdb.a
            kotlin.Lazy r8 = r1.c()
            bq8 r1 = defpackage.bq8.a
            q4 r2 = r1.getAccessor()
            java.lang.Class<s48> r3 = defpackage.s48.class
            java.lang.Object r2 = r2.g(r3)
            r7 = r2
            s48 r7 = (defpackage.s48) r7
            kotlin.Lazy r2 = defpackage.rjd.a
            java.lang.Object r2 = r0.b
            android.os.Bundle r2 = (android.os.Bundle) r2
            java.lang.String r3 = "arg_gallery_mode"
            java.lang.Class<ql6> r4 = defpackage.ql6.class
            java.lang.Object r2 = defpackage.n54.k(r2, r3, r4)
            if (r2 == 0) goto L_0x0221
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            r3 = r2
            ql6 r3 = (defpackage.ql6) r3
            java.lang.Object r0 = r0.c
            one.me.sdk.gallery.MediaGalleryWidget r0 = (one.me.sdk.gallery.MediaGalleryWidget) r0
            android.content.Context r4 = r0.getContext()
            q4 r2 = r1.getAccessor()
            java.lang.Class<h48> r6 = defpackage.h48.class
            java.lang.Object r2 = r2.g(r6)
            r6 = r2
            h48 r6 = (defpackage.h48) r6
            q4 r1 = r1.getAccessor()
            java.lang.Class<bud> r2 = defpackage.bud.class
            kotlin.Lazy r9 = r1.h(r2)
            om6 r10 = r0.d0()
            gp6 r0 = new gp6
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0221:
            java.lang.String r0 = r4.getSimpleName()
            java.lang.String r1 = "No value passed for key arg_gallery_mode of type "
            java.lang.String r2 = " in bundle"
            java.lang.String r0 = defpackage.wj6.k(r1, r0, r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0237:
            java.lang.Object r1 = r0.b
            android.view.View r1 = (android.view.View) r1
            boolean r2 = r1 instanceof android.widget.TextView
            if (r2 == 0) goto L_0x024b
            r2 = r1
            android.widget.TextView r2 = (android.widget.TextView) r2
            boolean r2 = r2.getLinksClickable()
            if (r2 != 0) goto L_0x024b
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L_0x0269
        L_0x024b:
            java.lang.Object r0 = r0.c
            my7 r0 = (defpackage.my7) r0
            ny7 r2 = r0.a
            if (r2 != 0) goto L_0x025c
            boolean r2 = r1 instanceof defpackage.ny7
            if (r2 == 0) goto L_0x025b
            r2 = r1
            ny7 r2 = (defpackage.ny7) r2
            goto L_0x025c
        L_0x025b:
            r2 = r3
        L_0x025c:
            if (r2 == 0) goto L_0x0267
            java.lang.String r1 = r0.getURL()
            sy7 r4 = defpackage.sy7.a
            r2.X(r1, r4, r0, r3)
        L_0x0267:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0269:
            return r0
        L_0x026a:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.Object r5 = r0.c
            yo7 r5 = (defpackage.yo7) r5
            ap7 r6 = r5.a
            boolean r6 = r6.m
            java.lang.Object r0 = r0.b
            usd r0 = (defpackage.usd) r0
            if (r6 == 0) goto L_0x028b
            kne r6 = r0.getKind()
            zsd r7 = defpackage.zsd.p
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x028b
            r6 = r4
            goto L_0x028c
        L_0x028b:
            r6 = r2
        L_0x028c:
            defpackage.m5a.L(r5, r0)
            int r5 = r0.e()
            r7 = r2
        L_0x0294:
            if (r7 >= r5) goto L_0x02ed
            java.util.List r8 = r0.g(r7)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x02a5:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x02b7
            java.lang.Object r10 = r8.next()
            boolean r11 = r10 instanceof defpackage.mp7
            if (r11 == 0) goto L_0x02a5
            r9.add(r10)
            goto L_0x02a5
        L_0x02b7:
            java.lang.Object r8 = kotlin.collections.CollectionsKt.singleOrNull(r9)
            mp7 r8 = (defpackage.mp7) r8
            if (r8 == 0) goto L_0x02d8
            java.lang.String[] r8 = r8.names()
            if (r8 == 0) goto L_0x02d8
            int r9 = r8.length
            r10 = r2
        L_0x02c7:
            if (r10 >= r9) goto L_0x02d8
            r11 = r8[r10]
            if (r6 == 0) goto L_0x02d3
            java.util.Locale r12 = java.util.Locale.ROOT
            java.lang.String r11 = r11.toLowerCase(r12)
        L_0x02d3:
            defpackage.m5a.g(r1, r0, r11, r7)
            int r10 = r10 + r4
            goto L_0x02c7
        L_0x02d8:
            if (r6 == 0) goto L_0x02e5
            java.lang.String r8 = r0.f(r7)
            java.util.Locale r9 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r9)
            goto L_0x02e6
        L_0x02e5:
            r8 = r3
        L_0x02e6:
            if (r8 == 0) goto L_0x02eb
            defpackage.m5a.g(r1, r0, r8, r7)
        L_0x02eb:
            int r7 = r7 + r4
            goto L_0x0294
        L_0x02ed:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x02f7
            java.util.Map r1 = kotlin.collections.MapsKt.emptyMap()
        L_0x02f7:
            return r1
        L_0x02f8:
            kotlin.reflect.KProperty[] r5 = one.me.chats.forward.ForwardPickerScreen.I0
            java.lang.Object r5 = r0.b
            one.me.chats.forward.ForwardPickerScreen r5 = (one.me.chats.forward.ForwardPickerScreen) r5
            vhb r6 = r5.l0()
            ukb r6 = r6.c
            ya6 r6 = (defpackage.ya6) r6
            java.lang.Object r0 = r0.c
            dc9 r0 = (defpackage.dc9) r0
            java.lang.CharSequence r9 = r0.getText()
            vhb r0 = r5.l0()
            etc r0 = r0.x
            ome r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            r10 = r0
            java.util.Set r10 = (java.util.Set) r10
            r6.getClass()
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x04fc
            boolean r0 = r6.w
            if (r0 == 0) goto L_0x032c
            goto L_0x04fc
        L_0x032c:
            r6.w = r4
            java.lang.Object r0 = kotlin.collections.CollectionsKt.first(r10)
            r5 = r0
            java.lang.Number r5 = (java.lang.Number) r5
            r5.longValue()
            int r5 = r10.size()
            if (r5 != r4) goto L_0x033f
            goto L_0x0340
        L_0x033f:
            r0 = r3
        L_0x0340:
            java.lang.Long r0 = (java.lang.Long) r0
            java.lang.Long r5 = r6.e
            if (r0 == 0) goto L_0x0380
            zc4 r7 = r6.c
            java.lang.Object r7 = r7.v
            java.util.concurrent.atomic.AtomicReference r7 = (java.util.concurrent.atomic.AtomicReference) r7
            java.lang.Object r7 = r7.get()
            java.util.Set r7 = (java.util.Set) r7
            java.util.Iterator r7 = r7.iterator()
        L_0x0356:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x036e
            java.lang.Object r8 = r7.next()
            r11 = r8
            dkb r11 = (defpackage.dkb) r11
            long r11 = r11.a
            long r13 = r0.longValue()
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x0356
            goto L_0x036f
        L_0x036e:
            r8 = r3
        L_0x036f:
            dkb r8 = (defpackage.dkb) r8
            if (r8 == 0) goto L_0x0376
            ckb r7 = r8.b
            goto L_0x0377
        L_0x0376:
            r7 = r3
        L_0x0377:
            ckb r8 = defpackage.ckb.a
            if (r7 == r8) goto L_0x0380
            if (r5 == 0) goto L_0x037e
            goto L_0x0380
        L_0x037e:
            r14 = r2
            goto L_0x0381
        L_0x0380:
            r14 = r4
        L_0x0381:
            java.util.List r7 = r6.n
            java.util.Collection r7 = (java.util.Collection) r7
            int r7 = r7.size()
            if (r9 == 0) goto L_0x0392
            int r8 = r9.length()
            if (r8 <= 0) goto L_0x0392
            int r7 = r7 + r4
        L_0x0392:
            int r8 = r10.size()
            int r8 = r8 * r7
            java.util.List r7 = r6.n
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r11 = r7 instanceof java.util.Collection
            if (r11 == 0) goto L_0x03aa
            r11 = r7
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x03aa
            r11 = r2
            goto L_0x03c8
        L_0x03aa:
            java.util.Iterator r7 = r7.iterator()
            r11 = r2
        L_0x03af:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L_0x03c8
            java.lang.Object r12 = r7.next()
            ha9 r12 = (defpackage.ha9) r12
            boolean r12 = r12.F()
            if (r12 == 0) goto L_0x03af
            int r11 = r11 + r4
            if (r11 >= 0) goto L_0x03af
            kotlin.collections.CollectionsKt.throwCountOverflow()
            goto L_0x03af
        L_0x03c8:
            int r7 = r10.size()
            int r7 = r7 * r11
            java.util.List r11 = r6.n
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            boolean r12 = r11 instanceof java.util.Collection
            if (r12 == 0) goto L_0x03df
            r12 = r11
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x03df
            goto L_0x03fc
        L_0x03df:
            java.util.Iterator r11 = r11.iterator()
        L_0x03e3:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x03fc
            java.lang.Object r12 = r11.next()
            ha9 r12 = (defpackage.ha9) r12
            boolean r12 = r12.w()
            if (r12 == 0) goto L_0x03e3
            int r2 = r2 + r4
            if (r2 >= 0) goto L_0x03e3
            kotlin.collections.CollectionsKt.throwCountOverflow()
            goto L_0x03e3
        L_0x03fc:
            int r11 = r10.size()
            int r11 = r11 * r2
            if (r5 == 0) goto L_0x0434
            java.util.List r2 = r6.n
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r12 = r2 instanceof java.util.Collection
            if (r12 == 0) goto L_0x0415
            r12 = r2
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x0415
            goto L_0x0434
        L_0x0415:
            java.util.Iterator r2 = r2.iterator()
        L_0x0419:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x0434
            java.lang.Object r12 = r2.next()
            ha9 r12 = (defpackage.ha9) r12
            boolean r13 = r12.C()
            if (r13 != 0) goto L_0x0431
            boolean r12 = r12.G()
            if (r12 == 0) goto L_0x0419
        L_0x0431:
            jgd r1 = defpackage.jgd.CHAT_ATTACHMENTS_MEDIA
            goto L_0x0494
        L_0x0434:
            if (r5 == 0) goto L_0x0461
            java.util.List r2 = r6.n
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r12 = r2 instanceof java.util.Collection
            if (r12 == 0) goto L_0x0448
            r12 = r2
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x0448
            goto L_0x0461
        L_0x0448:
            java.util.Iterator r2 = r2.iterator()
        L_0x044c:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x0461
            java.lang.Object r12 = r2.next()
            ha9 r12 = (defpackage.ha9) r12
            boolean r12 = r12.A()
            if (r12 == 0) goto L_0x044c
            jgd r1 = defpackage.jgd.CHAT_ATTACHMENTS_FILES
            goto L_0x0494
        L_0x0461:
            if (r5 == 0) goto L_0x0492
            java.util.List r2 = r6.n
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r12 = r2 instanceof java.util.Collection
            if (r12 == 0) goto L_0x0475
            r12 = r2
            java.util.Collection r12 = (java.util.Collection) r12
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x0475
            goto L_0x0492
        L_0x0475:
            java.util.Iterator r2 = r2.iterator()
        L_0x0479:
            boolean r12 = r2.hasNext()
            if (r12 == 0) goto L_0x0492
            java.lang.Object r12 = r2.next()
            ha9 r12 = (defpackage.ha9) r12
            ha9 r13 = r12.A0
            if (r13 == 0) goto L_0x0479
            int r12 = r12.y0
            if (r12 == r1) goto L_0x048f
            if (r12 != r4) goto L_0x0479
        L_0x048f:
            jgd r1 = defpackage.jgd.CHAT_ATTACHMENTS_LINKS
            goto L_0x0494
        L_0x0492:
            jgd r1 = defpackage.jgd.CHAT
        L_0x0494:
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            pc7 r4 = new pc7
            nc7 r12 = defpackage.nc7.SEND_5_MESSAGES
            r4.<init>(r12, r8)
            r2.add(r4)
            if (r7 <= 0) goto L_0x04af
            pc7 r4 = new pc7
            nc7 r8 = defpackage.nc7.SEND_3_STICKERS
            r4.<init>(r8, r7)
            r2.add(r4)
        L_0x04af:
            if (r11 <= 0) goto L_0x04bb
            pc7 r4 = new pc7
            nc7 r7 = defpackage.nc7.SEND_AUDIO_MESSAGE
            r4.<init>(r7, r11)
            r2.add(r4)
        L_0x04bb:
            ta6 r4 = new ta6
            r4.<init>(r2, r1)
            d14 r1 = r6.v
            if (r1 == 0) goto L_0x04eb
            caa r2 = defpackage.caa.a
            kotlin.Lazy r7 = r6.h
            java.lang.Object r7 = r7.getValue()
            gaf r7 = (defpackage.gaf) r7
            osa r7 = (defpackage.osa) r7
            q04 r7 = r7.a()
            kotlin.coroutines.CoroutineContext r2 = r2.plus(r7)
            f14 r15 = defpackage.f14.c
            wa6 r13 = new wa6
            r16 = 0
            r7 = r13
            r8 = r6
            r11 = r14
            r12 = r4
            r3 = r13
            r13 = r16
            r7.<init>(r8, r9, r10, r11, r12, r13)
            defpackage.ev0.u(r1, r2, r15, r3)
        L_0x04eb:
            if (r14 == 0) goto L_0x04fc
            if (r5 == 0) goto L_0x04f1
            r3 = 0
            goto L_0x04f2
        L_0x04f1:
            r3 = r0
        L_0x04f2:
            n6e r0 = r6.o
            za6 r1 = new za6
            r1.<init>(r3, r4)
            r0.d(r1)
        L_0x04fc:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x04ff:
            kotlin.reflect.KProperty[] r1 = one.me.chats.forward.ForwardPickerScreen.I0
            java.lang.Object r1 = r0.b
            one.me.chats.forward.ForwardPickerScreen r1 = (one.me.chats.forward.ForwardPickerScreen) r1
            vhb r2 = r1.l0()
            ukb r2 = r2.c
            ya6 r2 = (defpackage.ya6) r2
            og9 r3 = defpackage.og9.o
            zqd r2 = r2.q
            r2.C(r3)
            yh7 r2 = one.me.chats.forward.ForwardPickerScreen.J0
            java.lang.Object r0 = r0.c
            android.view.View r0 = (android.view.View) r0
            r3 = 0
            defpackage.h88.f(r0, r2, r3)
            dc9 r0 = r1.o0()
            int r1 = defpackage.cad.c1
            r0.setLeftIcon(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x052a:
            java.lang.Object r1 = r0.b
            w86 r1 = (defpackage.w86) r1
            udg r1 = r1.w
            java.util.concurrent.CopyOnWriteArraySet r1 = r1.i
            java.lang.Object r0 = r0.c
            u86 r0 = (defpackage.u86) r0
            r1.remove(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x053c:
            java.lang.Object r1 = r0.c
            ru.ok.messages.settings.folders.settings.presentation.FolderSettingsFragment r1 = (ru.ok.messages.settings.folders.settings.presentation.FolderSettingsFragment) r1
            android.os.Bundle r1 = r1.F2()
            java.lang.String r2 = "folders.settings.extra.from"
            android.os.Parcelable r1 = r1.getParcelable(r2)
            r3 = r1
            q46 r3 = (defpackage.q46) r3
            java.lang.Object r0 = r0.b
            f56 r0 = (defpackage.f56) r0
            kq9 r0 = r0.a
            java.lang.Object r1 = r0.a
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            java.lang.Object r1 = r1.get()
            r4 = r1
            j16 r4 = (defpackage.j16) r4
            java.lang.Object r1 = r0.b
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            java.lang.Object r1 = r1.get()
            r5 = r1
            u82 r5 = (defpackage.u82) r5
            java.lang.Object r1 = r0.c
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            java.lang.Object r1 = r1.get()
            r6 = r1
            jua r6 = (defpackage.jua) r6
            java.lang.Object r1 = r0.o
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            java.lang.Object r1 = r1.get()
            r7 = r1
            fq r7 = (defpackage.fq) r7
            java.lang.Object r1 = r0.v
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            java.lang.Object r1 = r1.get()
            r8 = r1
            nd r8 = (defpackage.nd) r8
            java.lang.Object r0 = r0.w
            javax.inject.Provider r0 = (javax.inject.Provider) r0
            java.lang.Object r0 = r0.get()
            r9 = r0
            gaf r9 = (defpackage.gaf) r9
            ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel r0 = new ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x059c:
            java.lang.Object r1 = r0.c
            ru.ok.messages.settings.folders.page.FolderPageFragment r1 = (ru.ok.messages.settings.folders.page.FolderPageFragment) r1
            android.os.Bundle r1 = r1.F2()
            java.lang.String r2 = "extra.chat.folder.id"
            android.os.Parcelable r1 = r1.getParcelable(r2)
            r3 = r1
            z26 r3 = (defpackage.z26) r3
            java.lang.Object r0 = r0.b
            t36 r0 = (defpackage.t36) r0
            ic3 r0 = r0.a
            java.lang.Object r1 = r0.a
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            java.lang.Object r1 = r1.get()
            r4 = r1
            j16 r4 = (defpackage.j16) r4
            java.lang.Object r1 = r0.b
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            java.lang.Object r1 = r1.get()
            r5 = r1
            yva r5 = (defpackage.yva) r5
            java.lang.Object r1 = r0.c
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            java.lang.Object r1 = r1.get()
            r6 = r1
            rtb r6 = (defpackage.rtb) r6
            java.lang.Object r1 = r0.o
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            java.lang.Object r1 = r1.get()
            r7 = r1
            jua r7 = (defpackage.jua) r7
            java.lang.Object r1 = r0.v
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            java.lang.Object r1 = r1.get()
            r8 = r1
            u82 r8 = (defpackage.u82) r8
            java.lang.Object r1 = r0.w
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            java.lang.Object r1 = r1.get()
            r9 = r1
            nd r9 = (defpackage.nd) r9
            java.lang.Object r0 = r0.x
            javax.inject.Provider r0 = (javax.inject.Provider) r0
            java.lang.Object r0 = r0.get()
            r10 = r0
            gaf r10 = (defpackage.gaf) r10
            ru.ok.messages.settings.folders.page.FolderPageViewModel r0 = new ru.ok.messages.settings.folders.page.FolderPageViewModel
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0607:
            java.lang.Object r1 = r0.c
            ru.ok.messages.settings.folders.filters.presentation.FolderFiltersFragment r1 = (ru.ok.messages.settings.folders.filters.presentation.FolderFiltersFragment) r1
            android.os.Bundle r1 = r1.F2()
            java.lang.String r2 = "extra.filter.folder.id"
            java.lang.String r5 = r1.getString(r2)
            java.lang.Object r0 = r0.b
            h16 r0 = (defpackage.h16) r0
            qpg r0 = r0.a
            java.lang.Object r1 = r0.a
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            java.lang.Object r1 = r1.get()
            r4 = r1
            android.app.Application r4 = (android.app.Application) r4
            java.lang.Object r1 = r0.b
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            java.lang.Object r1 = r1.get()
            r6 = r1
            u82 r6 = (defpackage.u82) r6
            java.lang.Object r1 = r0.c
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            java.lang.Object r1 = r1.get()
            r7 = r1
            nd r7 = (defpackage.nd) r7
            java.lang.Object r0 = r0.o
            javax.inject.Provider r0 = (javax.inject.Provider) r0
            java.lang.Object r0 = r0.get()
            r8 = r0
            gaf r8 = (defpackage.gaf) r8
            ru.ok.messages.settings.folders.filters.presentation.FolderFiltersViewModel r0 = new ru.ok.messages.settings.folders.filters.presentation.FolderFiltersViewModel
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8)
            return r0
        L_0x064e:
            java.lang.Object r1 = r0.b
            ru.ok.messages.settings.folders.edit.presentation.FolderEditFragment r1 = (ru.ok.messages.settings.folders.edit.presentation.FolderEditFragment) r1
            android.os.Bundle r1 = r1.F2()
            java.lang.String r2 = "edit.page.target"
            android.os.Parcelable r1 = r1.getParcelable(r2)
            az5 r1 = (defpackage.az5) r1
            java.lang.Object r0 = r0.c
            n06 r0 = (defpackage.n06) r0
            l15 r0 = r0.a
            java.lang.Object r2 = r0.a
            javax.inject.Provider r2 = (javax.inject.Provider) r2
            java.lang.Object r2 = r2.get()
            u82 r2 = (defpackage.u82) r2
            java.lang.Object r3 = r0.b
            javax.inject.Provider r3 = (javax.inject.Provider) r3
            java.lang.Object r3 = r3.get()
            nd r3 = (defpackage.nd) r3
            java.lang.Object r0 = r0.c
            javax.inject.Provider r0 = (javax.inject.Provider) r0
            java.lang.Object r0 = r0.get()
            gaf r0 = (defpackage.gaf) r0
            ru.ok.messages.settings.folders.edit.presentation.FolderEditViewModel r4 = new ru.ok.messages.settings.folders.edit.presentation.FolderEditViewModel
            r4.<init>(r1, r2, r3, r0)
            return r4
        L_0x0688:
            hn5 r1 = new hn5
            java.lang.Object r2 = r0.b
            dn5 r2 = (defpackage.dn5) r2
            ez r3 = r2.c
            wie r2 = r2.b
            java.lang.Object r0 = r0.c
            fn5 r0 = (defpackage.fn5) r0
            r1.<init>(r3, r2, r0)
            return r1
        L_0x069a:
            km5 r1 = new km5
            java.lang.Object r2 = r0.c
            fm5 r2 = (defpackage.fm5) r2
            jm5 r3 = r2.b
            java.lang.Object r0 = r0.b
            android.content.Context r0 = (android.content.Context) r0
            r1.<init>(r0, r3)
            r1.setCallback(r2)
            return r1
        L_0x06ad:
            java.lang.Object r1 = r0.c
            one.me.inappreview.ui.FakeInAppReviewBottomSheet r1 = (one.me.inappreview.ui.FakeInAppReviewBottomSheet) r1
            ne4 r2 = r1.D0
            java.lang.Object r0 = r0.b
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r0.removeCallbacks(r2)
            boolean r0 = r1.E0
            if (r0 == 0) goto L_0x06d3
            mc7 r0 = defpackage.mc7.a
            q4 r0 = r0.getAccessor()
            java.lang.Class<qc7> r1 = defpackage.qc7.class
            java.lang.Object r0 = r0.j(r1)
            qc7 r0 = (defpackage.qc7) r0
            if (r0 == 0) goto L_0x06d3
            xc7 r1 = defpackage.xc7.b
            r0.b(r1)
        L_0x06d3:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x06d6:
            java.lang.Object r1 = r0.b
            tg5 r1 = (defpackage.tg5) r1
            kotlin.jvm.functions.Function1 r1 = r1.E0
            if (r1 == 0) goto L_0x06eb
            java.lang.Object r0 = r0.c
            rg5 r0 = (defpackage.rg5) r0
            long r2 = r0.a
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.invoke(r0)
        L_0x06eb:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x06ee:
            java.lang.Object r1 = r0.c
            rg5 r1 = (defpackage.rg5) r1
            long r1 = r1.a
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object r0 = r0.b
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r0.invoke(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0702:
            hx0 r2 = new hx0
            r2.<init>()
            java.lang.Object r3 = r0.b
            kotlin.Lazy r3 = (kotlin.Lazy) r3
            java.lang.Object r3 = r3.getValue()
            bx0 r3 = (defpackage.bx0) r3
            r2.a = r3
            java.lang.Object r0 = r0.c
            lb5 r0 = (defpackage.lb5) r0
            kotlin.Lazy r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            g74 r0 = (defpackage.g74) r0
            r2.d = r0
            r2.e = r1
            return r2
        L_0x0724:
            java.lang.Object r1 = r0.b
            android.content.Context r1 = (android.content.Context) r1
            xd4 r3 = new xd4
            int r4 = defpackage.t0g.a
            java.lang.String r4 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x073b }
            android.content.pm.PackageManager r5 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x073b }
            android.content.pm.PackageInfo r2 = r5.getPackageInfo(r4, r2)     // Catch:{ NameNotFoundException -> 0x073b }
            java.lang.String r2 = r2.versionName     // Catch:{ NameNotFoundException -> 0x073b }
            goto L_0x073d
        L_0x073b:
            java.lang.String r2 = "?"
        L_0x073d:
            java.lang.String r4 = android.os.Build.VERSION.RELEASE
            r5 = 47
            int r5 = defpackage.g63.f(r5, r2)
            int r5 = defpackage.g63.f(r5, r4)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "ExoPlayer/"
            r6.append(r5)
            r6.append(r2)
            java.lang.String r2 = " (Linux;Android "
            r6.append(r2)
            r6.append(r4)
            java.lang.String r2 = ") ExoPlayerLib/2.17.1"
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            java.lang.Object r0 = r0.c
            kb5 r0 = (defpackage.kb5) r0
            kotlin.Lazy r0 = r0.b
            java.lang.Object r0 = r0.getValue()
            vc4 r0 = (defpackage.vc4) r0
            r3.<init>(r1, r2, r0)
            return r3
        L_0x0777:
            m35 r1 = new m35
            java.lang.Object r2 = r0.c
            k45 r2 = (defpackage.k45) r2
            g6d r3 = r2.d
            android.content.Context r2 = r2.a
            java.lang.Object r0 = r0.b
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            r1.<init>(r3, r2, r0)
            return r1
        L_0x0789:
            java.lang.Object r1 = r0.b
            n35 r1 = (defpackage.n35) r1
            java.lang.Object r0 = r0.c
            r3 = r0
            android.content.Context r3 = (android.content.Context) r3
            r1.getClass()
            android.graphics.Bitmap r0 = defpackage.o54.D(r2, r3)
            if (r0 == 0) goto L_0x079f
            int r2 = r0.getWidth()
        L_0x079f:
            android.content.res.Resources r0 = r3.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r4 = r0.densityDpi
            r0 = 240(0xf0, float:3.36E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5 = 48
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            kotlin.Pair r0 = kotlin.TuplesKt.to(r0, r1)
            r1 = 320(0x140, float:4.48E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6 = 64
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r6)
            r6 = 480(0x1e0, float:6.73E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 96
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            kotlin.Pair r6 = kotlin.TuplesKt.to(r6, r7)
            r8 = 640(0x280, float:8.97E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            kotlin.Pair r7 = kotlin.TuplesKt.to(r8, r7)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r0, r1, r6, r7}
            java.util.Map r6 = kotlin.collections.MapsKt.mapOf(r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r1 = r6.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x07f8:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x081c
            java.lang.Object r7 = r1.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getKey()
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 > r4) goto L_0x07f8
            java.lang.Object r8 = r7.getKey()
            java.lang.Object r7 = r7.getValue()
            r0.put(r8, r7)
            goto L_0x07f8
        L_0x081c:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r7 = r0.iterator()
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x082c
            r0 = 0
            goto L_0x085f
        L_0x082c:
            java.lang.Object r0 = r7.next()
            boolean r1 = r7.hasNext()
            if (r1 != 0) goto L_0x0837
            goto L_0x085f
        L_0x0837:
            r1 = r0
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getKey()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L_0x0844:
            java.lang.Object r8 = r7.next()
            r9 = r8
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r9 = r9.getKey()
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r1 >= r9) goto L_0x0859
            r0 = r8
            r1 = r9
        L_0x0859:
            boolean r8 = r7.hasNext()
            if (r8 != 0) goto L_0x0844
        L_0x085f:
            r8 = r0
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r1 = r6.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x086f:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0893
            java.lang.Object r6 = r1.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r7 = r6.getKey()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 <= r4) goto L_0x086f
            java.lang.Object r7 = r6.getKey()
            java.lang.Object r6 = r6.getValue()
            r0.put(r7, r6)
            goto L_0x086f
        L_0x0893:
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r9 = r0.iterator()
            boolean r0 = r9.hasNext()
            if (r0 != 0) goto L_0x08a3
            r0 = 0
            goto L_0x08d6
        L_0x08a3:
            java.lang.Object r0 = r9.next()
            boolean r1 = r9.hasNext()
            if (r1 != 0) goto L_0x08ae
            goto L_0x08d6
        L_0x08ae:
            r1 = r0
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getKey()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L_0x08bb:
            java.lang.Object r6 = r9.next()
            r7 = r6
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r7 = r7.getKey()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r1 <= r7) goto L_0x08d0
            r0 = r6
            r1 = r7
        L_0x08d0:
            boolean r6 = r9.hasNext()
            if (r6 != 0) goto L_0x08bb
        L_0x08d6:
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Class r1 = r3.getClass()
            java.lang.String r1 = r1.getName()
            a67 r6 = defpackage.z68.b
            if (r6 != 0) goto L_0x08e5
            goto L_0x090f
        L_0x08e5:
            boolean r7 = r6.c()
            if (r7 == 0) goto L_0x090f
            w78 r7 = defpackage.w78.o
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "phoneDensity: "
            r9.<init>(r10)
            r9.append(r4)
            java.lang.String r10 = "; lowerDensity: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r10 = "; higherDensity: "
            r9.append(r10)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r10 = 0
            r6.d(r7, r1, r9, r10)
        L_0x090f:
            if (r0 == 0) goto L_0x0928
            java.lang.Object r1 = r0.getKey()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x0928
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            goto L_0x0957
        L_0x0928:
            if (r8 == 0) goto L_0x0931
            java.lang.Object r1 = r8.getKey()
            java.lang.Integer r1 = (java.lang.Integer) r1
            goto L_0x0932
        L_0x0931:
            r1 = 0
        L_0x0932:
            if (r1 == 0) goto L_0x094b
            java.lang.Object r1 = r8.getKey()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 < r4) goto L_0x094b
            java.lang.Object r0 = r8.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
            goto L_0x0957
        L_0x094b:
            if (r0 == 0) goto L_0x0957
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r5 = r0.intValue()
        L_0x0957:
            java.lang.Class<n35> r0 = defpackage.n35.class
            java.lang.String r1 = r0.getName()
            a67 r4 = defpackage.z68.b
            if (r4 != 0) goto L_0x0962
            goto L_0x0980
        L_0x0962:
            boolean r6 = r4.c()
            if (r6 == 0) goto L_0x0980
            w78 r6 = defpackage.w78.o
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.densityDpi
            java.lang.String r7 = "Emoji size by density: "
            java.lang.String r8 = ", density:"
            java.lang.String r3 = defpackage.g63.h(r7, r5, r3, r8)
            r7 = 0
            r4.d(r6, r1, r3, r7)
        L_0x0980:
            float r1 = (float) r2
            r3 = 13
            float r3 = (float) r3
            float r1 = r1 / r3
            java.lang.String r3 = r0.getName()
            a67 r4 = defpackage.z68.b
            if (r4 != 0) goto L_0x098e
            goto L_0x09a8
        L_0x098e:
            boolean r6 = r4.c()
            if (r6 == 0) goto L_0x09a8
            w78 r6 = defpackage.w78.o
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Calculated emoji size in sprite before coarce: "
            r7.<init>(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            r8 = 0
            r4.d(r6, r3, r7, r8)
        L_0x09a8:
            float r3 = (float) r5
            float r1 = kotlin.ranges.RangesKt.coerceAtMost((float) r1, (float) r3)
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L_0x09cf
            java.lang.String r1 = r0.getName()
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x09bb
            goto L_0x09cd
        L_0x09bb:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x09cd
            w78 r4 = defpackage.w78.o
            java.lang.String r5 = "Fallback for emoji size. Sprite width: "
            java.lang.String r5 = defpackage.wj6.h(r2, r5)
            r6 = 0
            r3.d(r4, r1, r5, r6)
        L_0x09cd:
            r1 = 1111490560(0x42400000, float:48.0)
        L_0x09cf:
            java.lang.String r0 = r0.getName()
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x09d8
            goto L_0x09fa
        L_0x09d8:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x09fa
            w78 r4 = defpackage.w78.o
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Sprite width: "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = "; Calculated emoji size in sprite: "
            r5.append(r2)
            r5.append(r1)
            java.lang.String r2 = r5.toString()
            r10 = 0
            r3.d(r4, r0, r2, r10)
        L_0x09fa:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            return r0
        L_0x09ff:
            l35 r2 = new l35
            java.lang.Object r3 = r0.c
            m35 r3 = (defpackage.m35) r3
            r2.<init>(r3)
            java.lang.Object r0 = r0.b
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            java.lang.Object r0 = r0.getValue()
            gaf r0 = (defpackage.gaf) r0
            osa r0 = (defpackage.osa) r0
            q04 r0 = r0.b()
            java.lang.String r3 = "emoji_sprite_loader"
            q04 r0 = r0.s0(r1, r3)
            kotlin.coroutines.CoroutineContext r0 = r0.plus(r2)
            jx3 r0 = defpackage.e14.a(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j35.invoke():java.lang.Object");
    }

    public /* synthetic */ j35(Object obj, Lazy lazy, int i) {
        this.a = i;
        this.c = obj;
        this.b = lazy;
    }
}
