package defpackage;

import kotlin.jvm.functions.Function0;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: jl8  reason: default package */
public final /* synthetic */ class jl8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarWidget b;

    public /* synthetic */ jl8(MediaBarWidget mediaBarWidget, int i) {
        this.a = i;
        this.b = mediaBarWidget;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: one.me.sdk.gallery.selectalbum.SelectAlbumWidget} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v19, types: [bbe] */
    /* JADX WARNING: type inference failed for: r2v41 */
    /* JADX WARNING: type inference failed for: r2v42 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r16 = this;
            r0 = r16
            r4 = 18
            r5 = 2
            r6 = 3
            r7 = 16
            r8 = 13
            r9 = 12
            iu7 r10 = defpackage.iu7.o
            r11 = 0
            r12 = -2
            r13 = 8
            r14 = 1
            r15 = -1
            r1 = 5
            r2 = 0
            one.me.chatscreen.mediabar.MediaBarWidget r3 = r0.b
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x056f;
                case 1: goto L_0x050e;
                case 2: goto L_0x04e4;
                case 3: goto L_0x04cb;
                case 4: goto L_0x04b2;
                case 5: goto L_0x039d;
                case 6: goto L_0x036e;
                case 7: goto L_0x02d5;
                case 8: goto L_0x023d;
                case 9: goto L_0x01e9;
                case 10: goto L_0x01db;
                case 11: goto L_0x01cb;
                case 12: goto L_0x01bc;
                case 13: goto L_0x0159;
                case 14: goto L_0x00dd;
                case 15: goto L_0x00da;
                case 16: goto L_0x00b8;
                case 17: goto L_0x00a7;
                case 18: goto L_0x0051;
                case 19: goto L_0x0046;
                case 20: goto L_0x0039;
                default: goto L_0x001d;
            }
        L_0x001d:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            oz1 r0 = new oz1
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            int r1 = defpackage.lra.y
            r0.setId(r1)
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r1.<init>(r15, r15)
            r0.setLayoutParams(r1)
            r0.setVisibility(r13)
            return r0
        L_0x0039:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            om6 r0 = new om6
            jl8 r1 = new jl8
            r1.<init>(r3, r9)
            r0.<init>(r1)
            return r0
        L_0x0046:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            android.content.Context r0 = r3.getContext()
            xm6 r0 = defpackage.fqc.a(r0)
            return r0
        L_0x0051:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r4 = r3.getContext()
            r0.<init>(r4)
            r0.setOrientation(r14)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r15, r12)
            r9 = 80
            r4.gravity = r9
            r0.setLayoutParams(r4)
            kotlin.reflect.KProperty[] r4 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            r8 = r4[r8]
            sn0 r8 = r3.H0
            java.lang.Object r8 = r8.getValue()
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r0.addView(r8)
            dc9 r8 = r3.m0()
            r0.addView(r8)
            r4 = r4[r7]
            sn0 r4 = r3.N0
            java.lang.Object r4 = r4.getValue()
            oz1 r4 = (defpackage.oz1) r4
            r0.addView(r4)
            yh7 r4 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            defpackage.h88.f(r0, r4, r2)
            o r4 = new o
            r4.<init>(r6, r2, r1)
            defpackage.b0h.H(r0, r4)
            mx1 r1 = new mx1
            r1.<init>(r5, r3)
            r0.addOnLayoutChangeListener(r1)
            r0.setClickable(r14)
            return r0
        L_0x00a7:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            oz1 r0 = new oz1
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            int r1 = defpackage.ogc.media_bar__bottom_container
            r0.setId(r1)
            return r0
        L_0x00b8:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            il8 r0 = r3.r0()
            og9 r1 = defpackage.og9.o
            zqd r0 = r0.Y
            r0.C(r1)
            android.widget.LinearLayout r0 = r3.h0()
            yh7 r1 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            defpackage.h88.f(r0, r1, r2)
            dc9 r0 = r3.m0()
            int r1 = defpackage.cad.c1
            r0.setLeftIcon(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00da:
            fb6 r0 = r3.Z0
            return r0
        L_0x00dd:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r4 = r3.getContext()
            r0.<init>(r4)
            int r4 = defpackage.ogc.media_bar__draggable_container
            r0.setId(r4)
            r0.setOrientation(r14)
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r4.<init>(r15, r15)
            r0.setLayoutParams(r4)
            lr0 r4 = r3.J0
            r0.setOutlineProvider(r4)
            android.graphics.drawable.ColorDrawable r4 = r3.K0
            r0.setForeground(r4)
            ed1 r4 = new ed1
            r4.<init>(r6, r2, r14)
            defpackage.b0h.H(r0, r4)
            kotlin.reflect.KProperty[] r2 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            r1 = r2[r1]
            sn0 r1 = r3.Z
            java.lang.Object r1 = r1.getValue()
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r0.addView(r1)
            h3b r1 = r3.q0()
            r0.addView(r1)
            r1 = 9
            r1 = r2[r1]
            sn0 r1 = r3.z0
            java.lang.Object r1 = r1.getValue()
            oz1 r1 = (defpackage.oz1) r1
            r0.addView(r1)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            android.content.Context r4 = r0.getContext()
            r1.<init>(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r15, r15)
            r1.setLayoutParams(r4)
            r4 = 7
            r2 = r2[r4]
            sn0 r2 = r3.w0
            java.lang.Object r2 = r2.getValue()
            oz1 r2 = (defpackage.oz1) r2
            r1.addView(r2)
            oz1 r2 = r3.p0()
            r1.addView(r2)
            r0.addView(r1)
            return r0
        L_0x0159:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            orb r0 = r3.n0()
            lrb r0 = r0.getScrollState()
            lrb r1 = defpackage.lrb.c
            if (r0 == r1) goto L_0x0168
            goto L_0x01b9
        L_0x0168:
            oz1 r0 = r3.p0()
            r0.setVisibility(r11)
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            r1 = r0[r4]
            kotlin.properties.ReadOnlyProperty r5 = r3.U0
            java.lang.Object r1 = r5.getValue(r3, r1)
            mz2 r1 = (defpackage.mz2) r1
            java.lang.String r6 = r1.b()
            java.lang.String r7 = "select_album_widget"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 != 0) goto L_0x01a1
            one.me.sdk.gallery.selectalbum.SelectAlbumWidget r9 = new one.me.sdk.gallery.selectalbum.SelectAlbumWidget
            java.lang.String r6 = r3.a
            r9.<init>(r6, r2)
            i9d r6 = new i9d
            r11 = 0
            r14 = -1
            r10 = 0
            r12 = 0
            r13 = 0
            r8 = r6
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r6.d(r7)
            e9d r1 = r1.a
            r1.R(r6)
        L_0x01a1:
            r0 = r0[r4]
            java.lang.Object r0 = r5.getValue(r3, r0)
            mz2 r0 = (defpackage.mz2) r0
            zx3 r0 = r0.a()
            boolean r1 = r0 instanceof one.me.sdk.gallery.selectalbum.SelectAlbumWidget
            if (r1 == 0) goto L_0x01b4
            r2 = r0
            one.me.sdk.gallery.selectalbum.SelectAlbumWidget r2 = (one.me.sdk.gallery.selectalbum.SelectAlbumWidget) r2
        L_0x01b4:
            if (r2 == 0) goto L_0x01b9
            r2.f0()
        L_0x01b9:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x01bc:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            il8 r0 = r3.r0()
            boolean r0 = r0.l()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x01cb:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            il8 r0 = r3.r0()
            kotlin.reflect.KProperty[] r1 = defpackage.il8.G0
            zqd r0 = r0.Y
            r0.C(r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x01db:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            il8 r0 = r3.r0()
            kotlin.reflect.KProperty[] r1 = defpackage.il8.G0
            r0.m(r11)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x01e9:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            dc9 r0 = new dc9
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r15, r12)
            r0.setLayoutParams(r1)
            r0.setVisibility(r13)
            wb9 r1 = defpackage.wb9.a
            r0.setRightOuterIconActionState(r1)
            int r1 = defpackage.mra.J
            r0.setInputHint((int) r1)
            ll8 r1 = new ll8
            r1.<init>(r3, r14)
            ne1 r2 = new ne1
            r2.<init>(r13, r1, r0)
            bc9 r1 = r0.c
            r1.addTextChangedListener(r2)
            android.content.Context r1 = r0.getContext()
            jl8 r2 = new jl8
            r4 = 10
            r2.<init>(r3, r4)
            pg6 r1 = defpackage.kne.a(r1, r2)
            r0.setRightOuterIconTouchListener(r1)
            android.content.Context r1 = r0.getContext()
            jl8 r2 = new jl8
            r4 = 11
            r2.<init>(r3, r4)
            pg6 r1 = defpackage.kne.a(r1, r2)
            r0.setLeftInnerIconTouchListener(r1)
            return r0
        L_0x023d:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r4 = r3.getContext()
            r0.<init>(r4)
            r0.setVerticalGravity(r7)
            one.me.sdk.uikit.common.button.OneMeButton r4 = new one.me.sdk.uikit.common.button.OneMeButton
            android.content.Context r5 = r0.getContext()
            r4.<init>(r5, r2)
            zpa r5 = defpackage.zpa.b
            r4.setMode(r5)
            xpa r5 = defpackage.xpa.c
            r4.setAppearance(r5)
            int r5 = defpackage.kra.f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.setEndIcon((java.lang.Integer) r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r12, r12)
            float r6 = (float) r13
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r7 = r7 * r6
            int r7 = kotlin.math.MathKt.roundToInt((float) r7)
            android.content.res.Resources r8 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r6 = r6 * r8
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            int r8 = r5.topMargin
            int r11 = r5.bottomMargin
            r5.setMargins(r7, r8, r6, r11)
            r4.setLayoutParams(r5)
            xu3 r5 = new xu3
            r6 = 26
            r5.<init>((int) r6, (java.lang.Object) r3)
            defpackage.ct.G(r4, 300, r5)
            r0.addView(r4)
            kotlin.reflect.KProperty[] r4 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            r4 = r4[r9]
            sn0 r4 = r3.G0
            java.lang.Object r4 = r4.getValue()
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r0.addView(r4)
            il8 r4 = r3.r0()
            etc r4 = r4.C0
            jv7 r5 = r3.getViewLifecycleOwner()
            ju7 r5 = r5.getLifecycle()
            co1 r4 = defpackage.ct.k(r4, r5, r10)
            dm8 r5 = new dm8
            r5.<init>(r2, r0, r3)
            ps5 r2 = new ps5
            r2.<init>(r4, r5, r1)
            tu7 r1 = r3.getViewLifecycleScope()
            defpackage.bs0.K(r2, r1)
            return r0
        L_0x02d5:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            androidx.recyclerview.widget.RecyclerView r0 = new androidx.recyclerview.widget.RecyclerView
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1, r2)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.<init>(r11, r12, r4)
            r4 = 4
            float r4 = (float) r4
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r4
            int r5 = kotlin.math.MathKt.roundToInt((float) r5)
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r4 = r4 * r6
            int r4 = kotlin.math.MathKt.roundToInt((float) r4)
            r6 = 6
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r6 = r6 * r7
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            int r7 = r1.leftMargin
            r1.setMargins(r7, r5, r6, r4)
            r0.setLayoutParams(r1)
            yyc r1 = r0.getItemAnimator()
            boolean r4 = r1 instanceof defpackage.mg4
            if (r4 == 0) goto L_0x032b
            r2 = r1
            mg4 r2 = (defpackage.mg4) r2
        L_0x032b:
            if (r2 == 0) goto L_0x032f
            r2.g = r11
        L_0x032f:
            android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
            r1.<init>()
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r4 = 1094713344(0x41400000, float:12.0)
            float r2 = r2 * r4
            r1.setCornerRadius(r2)
            r0.setBackground(r1)
            r0.setClipToOutline(r14)
            kotlin.reflect.KProperty[] r1 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            r2 = 11
            r1 = r1[r2]
            sn0 r1 = r3.F0
            java.lang.Object r1 = r1.getValue()
            xqd r1 = (defpackage.xqd) r1
            qo3 r2 = new qo3
            r2.<init>(r14, r0, r3)
            r1.w = r2
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.getContext()
            r1.<init>()
            r1.n1(r11)
            r0.setLayoutManager(r1)
            return r0
        L_0x036e:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            xqd r0 = new xqd
            il8 r4 = r3.r0()
            r0.<init>(r4)
            il8 r4 = r3.r0()
            xme r4 = r4.v0
            jv7 r5 = r3.getViewLifecycleOwner()
            ju7 r5 = r5.getLifecycle()
            co1 r4 = defpackage.ct.k(r4, r5, r10)
            cm8 r5 = new cm8
            r5.<init>(r2, r0)
            ps5 r2 = new ps5
            r2.<init>(r4, r5, r1)
            tu7 r1 = r3.getViewLifecycleScope()
            defpackage.bs0.K(r2, r1)
            return r0
        L_0x039d:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            xt1 r0 = new xt1
            android.content.Context r5 = r3.getContext()
            r0.<init>(r5)
            r0.setListener(r3)
            kotlin.Lazy r5 = r3.x0
            java.lang.Object r5 = r5.getValue()
            hcc r5 = (defpackage.hcc) r5
            un2 r6 = defpackage.un2.a
            q4 r6 = r6.getAccessor()
            java.lang.Class<aua> r7 = defpackage.aua.class
            java.lang.Object r6 = r6.g(r7)
            aua r6 = (defpackage.aua) r6
            java.util.concurrent.ExecutorService r6 = r6.c()
            ecc r7 = r0.a
            if (r7 == 0) goto L_0x03ca
            r11 = r14
        L_0x03ca:
            if (r11 == 0) goto L_0x03ce
            goto L_0x0489
        L_0x03ce:
            ecc r7 = new ecc
            android.content.Context r8 = r0.getContext()
            r7.<init>(r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r8.<init>(r15, r15)
            r7.setLayoutParams(r8)
            r0.a = r7
            wie r8 = new wie
            r8.<init>((int) r13, (java.lang.Object) r0)
            r7.o = r5
            r7.w = r8
            r7.v = r6
            at1 r6 = r7.getCameraApi()
            zbc r8 = new zbc
            r8.<init>(r7)
            r6.setCameraListener(r8)
            s85 r6 = r5.Y
            jv7 r8 = defpackage.sag.a(r7)
            ju7 r8 = r8.getLifecycle()
            co1 r6 = defpackage.ct.k(r6, r8, r10)
            bcc r8 = new bcc
            r8.<init>(r2, r7)
            ps5 r9 = new ps5
            r9.<init>(r6, r8, r1)
            jv7 r6 = defpackage.sag.a(r7)
            ju7 r6 = r6.getLifecycle()
            vu7 r6 = defpackage.i8b.t(r6)
            defpackage.bs0.K(r9, r6)
            jv7 r6 = defpackage.sag.a(r7)
            ju7 r6 = r6.getLifecycle()
            xme r8 = r5.X
            co1 r6 = defpackage.ct.k(r8, r6, r10)
            ccc r8 = new ccc
            r8.<init>(r2, r7)
            ps5 r9 = new ps5
            r9.<init>(r6, r8, r1)
            jv7 r6 = defpackage.sag.a(r7)
            ju7 r6 = r6.getLifecycle()
            vu7 r6 = defpackage.i8b.t(r6)
            defpackage.bs0.K(r9, r6)
            jv7 r6 = defpackage.sag.a(r7)
            ju7 r6 = r6.getLifecycle()
            xme r5 = r5.z
            co1 r5 = defpackage.ct.k(r5, r6, r10)
            dcc r6 = new dcc
            r6.<init>(r2, r7)
            ps5 r8 = new ps5
            r8.<init>(r5, r6, r1)
            jv7 r5 = defpackage.sag.a(r7)
            ju7 r5 = r5.getLifecycle()
            vu7 r5 = defpackage.i8b.t(r5)
            defpackage.bs0.K(r8, r5)
            ecc r5 = r0.a
            if (r5 != 0) goto L_0x0472
            r5 = r2
        L_0x0472:
            r0.addView(r5)
            ecc r5 = r0.a
            if (r5 != 0) goto L_0x047a
            r5 = r2
        L_0x047a:
            at1 r5 = r5.getCameraApi()
            r5.e()
            x4 r5 = new x4
            r5.<init>((int) r4, (java.lang.Object) r0)
            defpackage.ct.G(r0, 300, r5)
        L_0x0489:
            il8 r4 = r3.r0()
            k26 r4 = r4.A0
            jv7 r5 = r3.getViewLifecycleOwner()
            ju7 r5 = r5.getLifecycle()
            co1 r4 = defpackage.ct.k(r4, r5, r10)
            nl8 r5 = new nl8
            r5.<init>(r2, r0)
            ps5 r2 = new ps5
            r2.<init>(r4, r5, r1)
            tu7 r1 = r3.getViewLifecycleScope()
            defpackage.bs0.K(r2, r1)
            android.graphics.drawable.ColorDrawable r1 = r3.A0
            r0.setForeground(r1)
            return r0
        L_0x04b2:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            oz1 r0 = new oz1
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            int r1 = defpackage.ogc.media_bar__partial_media_access_container
            r0.setId(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r15, r12)
            r0.setLayoutParams(r1)
            return r0
        L_0x04cb:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            oz1 r0 = new oz1
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            int r1 = defpackage.ogc.media_bar__primary_container
            r0.setId(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r1.<init>(r15, r15)
            r0.setLayoutParams(r1)
            return r0
        L_0x04e4:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            android.content.Context r0 = r3.getContext()
            h3b r0 = defpackage.o54.d(r0, r2)
            int r1 = defpackage.ogc.media_bar__album_chooser
            r0.setId(r1)
            int r1 = defpackage.dlc.media_bar_recent
            r0.setTitle((int) r1)
            q2b r1 = new q2b
            ll8 r2 = new ll8
            r2.<init>(r3, r5)
            r1.<init>(r2)
            r0.setLeftActions(r1)
            jl8 r1 = new jl8
            r1.<init>(r3, r8)
            r0.setTitleClickListener(r1)
            return r0
        L_0x050e:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            android.widget.LinearLayout$LayoutParams r1 = new android.widget.LinearLayout$LayoutParams
            r2 = 10
            float r2 = (float) r2
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r2 = r2 * r4
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            r1.<init>(r15, r2)
            r0.setLayoutParams(r1)
            r1 = 4
            float r2 = (float) r1
            android.content.res.Resources r1 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r2
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r2 = r2 * r4
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            int r4 = r0.getPaddingLeft()
            int r5 = r0.getPaddingRight()
            r0.setPadding(r4, r1, r5, r2)
            kotlin.reflect.KProperty[] r1 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            r2 = 4
            r1 = r1[r2]
            sn0 r1 = r3.Y
            java.lang.Object r1 = r1.getValue()
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r0.addView(r1)
            return r0
        L_0x056f:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.mediabar.MediaBarWidget.c1
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r2 = r3.getContext()
            r0.<init>(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 36
            float r3 = (float) r3
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r3 = r3 * r4
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            float r1 = (float) r1
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r1 = r1 * r4
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            r2.<init>(r3, r1)
            r1 = 17
            r2.gravity = r1
            r0.setLayoutParams(r2)
            n04 r1 = new n04
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r3 = 1109393408(0x42200000, float:40.0)
            float r2 = r2 * r3
            r1.<init>(r2)
            r0.setOutlineProvider(r1)
            js9 r1 = defpackage.fu4.k
            android.content.Context r2 = r0.getContext()
            fu4 r1 = r1.e(r2)
            k2b r1 = r1.f()
            u67 r1 = r1.getIcon()
            int r1 = r1.g
            r0.setBackgroundColor(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl8.invoke():java.lang.Object");
    }
}
