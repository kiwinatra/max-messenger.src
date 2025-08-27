package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: c28  reason: default package */
public final /* synthetic */ class c28 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c28(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r0v49, types: [zx3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r11 = this;
            r0 = -1
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = 4
            r3 = 2
            r4 = 8
            r5 = 1
            r6 = 6
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r11.a
            switch(r10) {
                case 0: goto L_0x037c;
                case 1: goto L_0x0351;
                case 2: goto L_0x032d;
                case 3: goto L_0x02fb;
                case 4: goto L_0x02ee;
                case 5: goto L_0x02d4;
                case 6: goto L_0x02c4;
                case 7: goto L_0x02bf;
                case 8: goto L_0x02b3;
                case 9: goto L_0x02ae;
                case 10: goto L_0x02a7;
                case 11: goto L_0x028b;
                case 12: goto L_0x027e;
                case 13: goto L_0x0252;
                case 14: goto L_0x0243;
                case 15: goto L_0x021a;
                case 16: goto L_0x0215;
                case 17: goto L_0x01d7;
                case 18: goto L_0x0156;
                case 19: goto L_0x0145;
                case 20: goto L_0x0122;
                case 21: goto L_0x010d;
                case 22: goto L_0x0104;
                case 23: goto L_0x00d4;
                case 24: goto L_0x008a;
                case 25: goto L_0x0080;
                case 26: goto L_0x0077;
                case 27: goto L_0x003e;
                case 28: goto L_0x0020;
                default: goto L_0x0011;
            }
        L_0x0011:
            java.lang.Object r11 = r11.b
            fj r11 = (defpackage.fj) r11
            java.lang.Object r11 = r11.b
            android.content.Context r11 = (android.content.Context) r11
            java.lang.String r0 = "permissions_prefs"
            android.content.SharedPreferences r11 = r11.getSharedPreferences(r0, r9)
            return r11
        L_0x0020:
            java.lang.Object r11 = r11.b
            ddb r11 = (defpackage.ddb) r11
            kotlin.Lazy r0 = r11.b
            java.lang.Object r0 = r0.getValue()
            edb r0 = (defpackage.edb) r0
            java.lang.String[] r11 = r11.a
            boolean r11 = r0.b(r11)
            if (r11 == 0) goto L_0x0037
            zcb r11 = defpackage.zcb.a
            goto L_0x0039
        L_0x0037:
            zcb r11 = defpackage.zcb.b
        L_0x0039:
            xme r11 = defpackage.f6e.a(r11)
            return r11
        L_0x003e:
            kotlin.reflect.KProperty[] r0 = one.me.sdk.permissionhost.PermissionBottomSheet.F0
            java.lang.Object r11 = r11.b
            one.me.sdk.permissionhost.PermissionBottomSheet r11 = (one.me.sdk.permissionhost.PermissionBottomSheet) r11
            r11.getClass()
            kotlin.reflect.KProperty[] r0 = one.me.sdk.permissionhost.PermissionBottomSheet.F0
            r1 = r0[r6]
            is r1 = r11.D0
            java.lang.Object r2 = r1.a(r11)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto L_0x0074
            r0 = r0[r6]
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.b(r11, r0)
            zx3 r0 = r11.getTargetController()
            boolean r1 = r0 instanceof defpackage.kcb
            if (r1 == 0) goto L_0x006b
            r8 = r0
            kcb r8 = (defpackage.kcb) r8
        L_0x006b:
            if (r8 == 0) goto L_0x0072
            boolean r0 = r11.E0
            r8.O(r0)
        L_0x0072:
            r11.E0 = r9
        L_0x0074:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x0077:
            java.lang.Object r11 = r11.b
            one.me.sdk.richvector.internal.element.PathElement r11 = (one.me.sdk.richvector.internal.element.PathElement) r11
            android.graphics.Path r11 = one.me.sdk.richvector.internal.element.PathElement.path_delegate$lambda$0(r11)
            return r11
        L_0x0080:
            f3b r0 = new f3b
            java.lang.Object r11 = r11.b
            h3b r11 = (defpackage.h3b) r11
            r0.<init>(r11)
            return r0
        L_0x008a:
            int r0 = defpackage.cad.p0
            java.lang.Object r11 = r11.b
            h2b r11 = (defpackage.h2b) r11
            android.content.Context r1 = r11.getContext()
            android.graphics.drawable.Drawable r0 = defpackage.ew3.b(r1, r0)
            r1 = 20
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            r0.setBounds(r9, r9, r2, r1)
            js9 r1 = defpackage.fu4.k
            android.content.Context r11 = r11.getContext()
            fu4 r11 = r1.e(r11)
            k2b r11 = r11.f()
            u67 r11 = r11.getIcon()
            int r11 = r11.i
            r0.setTint(r11)
            return r0
        L_0x00d4:
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            java.lang.Object r11 = r11.b
            c2b r11 = (defpackage.c2b) r11
            d2b r1 = r11.k1
            float r1 = r1.a
            float[] r4 = new float[r4]
            r4[r9] = r1
            r4[r5] = r1
            r4[r3] = r1
            r3 = 3
            r4[r3] = r1
            r4[r2] = r7
            r1 = 5
            r4[r1] = r7
            r4[r6] = r7
            r1 = 7
            r4[r1] = r7
            r0.setCornerRadii(r4)
            r0.setShape(r9)
            d2b r11 = r11.k1
            int r11 = r11.b
            r0.setSize(r9, r11)
            return r0
        L_0x0104:
            java.lang.Object r11 = r11.b
            jtc r11 = (defpackage.jtc) r11
            k4d r11 = r11.h()
            return r11
        L_0x010d:
            u09 r0 = new u09
            java.lang.Object r11 = r11.b
            bud r11 = (defpackage.bud) r11
            akd r11 = (defpackage.akd) r11
            r11.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r1 = ru.ok.tamtam.android.prefs.PmsKey.f75mediatransform
            java.lang.String r11 = r11.z(r1, r8)
            r0.<init>(r11)
            return r0
        L_0x0122:
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Object r11 = r11.b
            wsa r11 = (defpackage.wsa) r11
            r11.v = r0
            psa r0 = defpackage.psa.o
            r11.c = r0
            r11.x = r8
            r11.z = r8
            r11.y = r8
            android.text.TextPaint r0 = r11.E0
            int r1 = r11.K0
            r0.setAlpha(r1)
            android.graphics.drawable.GradientDrawable r11 = r11.A0
            r0 = 255(0xff, float:3.57E-43)
            r11.setAlpha(r0)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x0145:
            java.lang.Object r11 = r11.b
            uqa r11 = (defpackage.uqa) r11
            kotlin.Lazy r11 = r11.b
            java.lang.Object r11 = r11.getValue()
            java.lang.String r11 = (java.lang.String) r11
            java.util.List r11 = kotlin.collections.CollectionsKt.listOf(r11)
            return r11
        L_0x0156:
            java.lang.Object r11 = r11.b
            java.util.concurrent.atomic.AtomicBoolean r11 = (java.util.concurrent.atomic.AtomicBoolean) r11
            int r0 = one.me.android.OneMeApplication.X
            qra r0 = defpackage.qra.a
            q4 r0 = r0.getAccessor()
            java.lang.Class<ei0> r1 = defpackage.ei0.class
            java.lang.Object r0 = r0.g(r1)
            ei0 r0 = (defpackage.ei0) r0
            r0.getClass()
            long r1 = java.lang.System.nanoTime()
            kotlin.Lazy r3 = r0.a
            java.lang.Object r3 = r3.getValue()
            edb r3 = (defpackage.edb) r3
            java.lang.String[] r4 = defpackage.edb.f
            boolean r3 = r3.b(r4)
            r3 = r3 ^ r5
            r0.e = r3
            kotlin.Lazy r3 = r0.a
            java.lang.Object r3 = r3.getValue()
            edb r3 = (defpackage.edb) r3
            int r4 = android.os.Build.VERSION.SDK_INT
            r6 = 33
            if (r4 < r6) goto L_0x0197
            java.lang.String[] r4 = defpackage.edb.k
            boolean r3 = r3.b(r4)
            goto L_0x019b
        L_0x0197:
            r3.getClass()
            r3 = r5
        L_0x019b:
            r3 = r3 ^ r5
            r0.f = r3
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x01a3
            goto L_0x01c7
        L_0x01a3:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x01c7
            w78 r4 = defpackage.w78.o
            kotlin.time.Duration$Companion r6 = kotlin.time.Duration.Companion
            long r6 = java.lang.System.nanoTime()
            long r6 = r6 - r1
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.NANOSECONDS
            long r1 = kotlin.time.DurationKt.toDuration((long) r6, (kotlin.time.DurationUnit) r1)
            java.lang.String r1 = kotlin.time.Duration.m1402toStringimpl(r1)
            java.lang.String r2 = "checkMainBannerPermissions by "
            java.lang.String r1 = defpackage.a81.m(r2, r1)
            java.lang.String r2 = "BannersInitialDataStorage"
            r3.d(r4, r2, r1, r8)
        L_0x01c7:
            boolean r1 = r0.e
            if (r1 != 0) goto L_0x01d0
            boolean r0 = r0.f
            if (r0 != 0) goto L_0x01d0
            goto L_0x01d1
        L_0x01d0:
            r5 = r9
        L_0x01d1:
            r11.set(r5)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x01d7:
            r0 = 64
            float r0 = (float) r0
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r0 = r0 * r2
            int r0 = kotlin.math.MathKt.roundToInt((float) r0)
            m7a r2 = new m7a
            r2.<init>()
            java.lang.Object r11 = r11.b
            n7a r11 = (defpackage.n7a) r11
            r2.setCallback(r11)
            js9 r3 = defpackage.fu4.k
            k2b r11 = r3.f(r11)
            c7e r11 = defpackage.n7a.q(r11)
            r2.b(r11)
            r2.setBounds(r9, r9, r0, r0)
            float r11 = (float) r0
            float r11 = r11 / r1
            kotlin.reflect.KProperty[] r0 = defpackage.m7a.j
            r0 = r0[r9]
            java.lang.Float r11 = java.lang.Float.valueOf(r11)
            bl r1 = r2.i
            r1.setValue(r2, r0, r11)
            return r2
        L_0x0215:
            java.lang.Object r11 = r11.b
            n1a r11 = (defpackage.n1a) r11
            return r11
        L_0x021a:
            kotlin.time.Duration$Companion r0 = kotlin.time.Duration.Companion
            java.lang.Object r11 = r11.b
            xy9 r11 = (defpackage.xy9) r11
            bud r11 = r11.b
            akd r11 = (defpackage.akd) r11
            r11.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r0 = ru.ok.tamtam.android.prefs.PmsKey.f77mindurationplaybackspeed
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES
            r2 = 10
            long r1 = r1.toSeconds(r2)
            int r1 = (int) r1
            long r1 = (long) r1
            long r0 = r11.r(r0, r1)
            int r11 = (int) r0
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            long r0 = kotlin.time.DurationKt.toDuration((int) r11, (kotlin.time.DurationUnit) r0)
            kotlin.time.Duration r11 = kotlin.time.Duration.m1351boximpl(r0)
            return r11
        L_0x0243:
            java.lang.Object r11 = r11.b
            ix9 r11 = (defpackage.ix9) r11
            androidx.recyclerview.widget.RecyclerView r11 = r11.a
            android.content.Context r11 = r11.getContext()
            android.graphics.drawable.StateListDrawable r11 = defpackage.ev0.i(r11)
            return r11
        L_0x0252:
            java.lang.Object r11 = r11.b
            tr9 r11 = (defpackage.tr9) r11
            android.graphics.Rect r2 = r11.getBounds()
            int r2 = r2.width()
            float r2 = (float) r2
            float r2 = r2 * r1
            float[] r1 = new float[r3]
            r1[r9] = r2
            r1[r5] = r7
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            r2 = 10000(0x2710, double:4.9407E-320)
            r1.setDuration(r2)
            r1.setRepeatCount(r0)
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r1.setInterpolator(r0)
            r1.addUpdateListener(r11)
            return r1
        L_0x027e:
            java.lang.Object r11 = r11.b
            f0 r11 = (defpackage.f0) r11
            java.lang.Class r11 = r11.getClass()
            java.lang.String r11 = r11.getName()
            return r11
        L_0x028b:
            java.lang.Object r11 = r11.b
            oq9 r11 = (defpackage.oq9) r11
            android.content.Context r11 = r11.a
            int r1 = defpackage.pqa.C
            android.graphics.drawable.Drawable r11 = defpackage.ew3.b(r11, r1)
            android.graphics.PorterDuffColorFilter r1 = new android.graphics.PorterDuffColorFilter
            u67 r2 = defpackage.l2b.f
            r2.getClass()
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.<init>(r0, r2)
            r11.setColorFilter(r1)
            return r11
        L_0x02a7:
            kotlin.reflect.KProperty[] r0 = one.me.messages.list.ui.MessagesListWidget.R0
            java.lang.Object r11 = r11.b
            android.view.View r11 = (android.view.View) r11
            return r11
        L_0x02ae:
            java.lang.Object r11 = r11.b
            android.text.Layout r11 = (android.text.Layout) r11
            return r11
        L_0x02b3:
            at6 r0 = new at6
            java.lang.Object r11 = r11.b
            ef9 r11 = (defpackage.ef9) r11
            jx3 r11 = r11.f
            r0.<init>(r11)
            return r0
        L_0x02bf:
            java.lang.Object r11 = r11.b
            java.lang.String r11 = (java.lang.String) r11
            return r11
        L_0x02c4:
            dg7 r0 = new dg7
            java.lang.Object r11 = r11.b
            d99 r11 = (defpackage.d99) r11
            android.view.View r11 = r11.G0
            android.content.Context r11 = r11.getContext()
            r0.<init>(r11)
            return r0
        L_0x02d4:
            java.lang.Object r11 = r11.b
            x59 r11 = (defpackage.x59) r11
            bud r11 = r11.v
            akd r11 = (defpackage.akd) r11
            r11.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r0 = ru.ok.tamtam.android.prefs.PmsKey.f71maxreadmarks
            r1 = 300(0x12c, float:4.2E-43)
            long r1 = (long) r1
            long r0 = r11.r(r0, r1)
            int r11 = (int) r0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            return r11
        L_0x02ee:
            java.lang.Object r11 = r11.b
            r49 r11 = (defpackage.r49) r11
            kotlin.jvm.functions.Function0 r11 = r11.v
            java.lang.Object r11 = r11.invoke()
            gh4 r11 = (defpackage.gh4) r11
            return r11
        L_0x02fb:
            kotlin.reflect.KProperty[] r0 = one.me.main.MainScreen.x
            java.lang.Object r11 = r11.b
            one.me.main.MainScreen r11 = (one.me.main.MainScreen) r11
            android.os.Bundle r11 = r11.getArgs()
            java.lang.String r0 = "main:arg:deep_link"
            java.lang.String r11 = r11.getString(r0)
            if (r11 != 0) goto L_0x030f
            java.lang.String r11 = ""
        L_0x030f:
            fc8 r0 = defpackage.fc8.a
            q4 r0 = r0.getAccessor()
            java.lang.Class<hr0> r1 = defpackage.hr0.class
            java.lang.Object r0 = r0.g(r1)
            hr0 r0 = (defpackage.hr0) r0
            sjd r1 = defpackage.sjd.a
            jtb r1 = r1.u()
            ltb r1 = (defpackage.ltb) r1
            hq r1 = r1.c
            uc8 r2 = new uc8
            r2.<init>(r1, r0, r11)
            return r2
        L_0x032d:
            java.lang.Object r11 = r11.b
            ce r11 = (defpackage.ce) r11
            r11.a(r9, r4)
            java.lang.Object r11 = r11.v
            u6h r11 = (defpackage.u6h) r11
            java.lang.Object r11 = r11.b
            s3a r11 = (defpackage.s3a) r11
            ru.ok.messages.messages.widgets.MessageComposeEditText r0 = r11.X
            boolean r0 = r0.hasSelection()
            if (r0 == 0) goto L_0x034e
            android.widget.ImageView r0 = r11.w0
            android.widget.ImageView r11 = r11.x0
            r0.setVisibility(r2)
            r11.setVisibility(r9)
        L_0x034e:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x0351:
            kotlin.reflect.KProperty[] r0 = one.me.devmenu.logsviewer.LogsViewerScreen.w
            java.lang.Object r11 = r11.b
            one.me.devmenu.logsviewer.LogsViewerScreen r11 = (one.me.devmenu.logsviewer.LogsViewerScreen) r11
            android.content.Context r0 = r11.getContext()
            h3b r0 = defpackage.o54.d(r0, r8)
            int r1 = one.me.devmenu.logsviewer.LogsViewerScreen.x
            r0.setId(r1)
            java.lang.String r1 = "Логи"
            r0.setTitle((java.lang.CharSequence) r1)
            z2b r1 = defpackage.z2b.a
            r0.setForm(r1)
            p2b r1 = new p2b
            vq7 r2 = new vq7
            r2.<init>((int) r6, (java.lang.Object) r11)
            r1.<init>(r2)
            r0.setLeftActions(r1)
            return r0
        L_0x037c:
            java.lang.Object r11 = r11.b
            ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker r11 = (ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker) r11
            c25 r11 = ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker.emojiFontLoadingNotifications_delegate$lambda$0(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c28.invoke():java.lang.Object");
    }
}
