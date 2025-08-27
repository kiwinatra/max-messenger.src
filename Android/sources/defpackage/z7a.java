package defpackage;

import kotlin.jvm.functions.Function1;
import one.me.login.neuroavatars.NeuroAvatarsScreen;

/* renamed from: z7a  reason: default package */
public final /* synthetic */ class z7a implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NeuroAvatarsScreen b;

    public /* synthetic */ z7a(NeuroAvatarsScreen neuroAvatarsScreen, int i) {
        this.a = i;
        this.b = neuroAvatarsScreen;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v28, types: [android.widget.LinearLayout, android.view.View, r8a] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = 7
            r2 = 8
            r3 = 19
            r4 = 16
            r5 = 4
            r6 = 0
            r7 = 12
            r8 = 2
            r9 = 3
            r10 = -2
            r11 = -1
            r12 = 1
            r13 = 0
            r14 = 0
            one.me.login.neuroavatars.NeuroAvatarsScreen r15 = r0.b
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x04a4;
                case 1: goto L_0x047f;
                case 2: goto L_0x03e5;
                case 3: goto L_0x03a8;
                case 4: goto L_0x02e0;
                case 5: goto L_0x02d0;
                case 6: goto L_0x01aa;
                case 7: goto L_0x0090;
                default: goto L_0x001b;
            }
        L_0x001b:
            r0 = r17
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            kotlin.reflect.KProperty[] r1 = one.me.login.neuroavatars.NeuroAvatarsScreen.K0
            r15.getClass()
            one.me.sdk.uikit.common.button.OneMeButton r1 = new one.me.sdk.uikit.common.button.OneMeButton
            android.content.Context r2 = r0.getContext()
            r1.<init>(r2, r13)
            int r2 = defpackage.xgc.oneme_login_neuro_avatars_continue_btn
            r1.setId(r2)
            zpa r2 = defpackage.zpa.a
            r1.setMode(r2)
            aqa r2 = defpackage.aqa.c
            r1.setSize(r2)
            xpa r2 = defpackage.xpa.o
            r1.setAppearance(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r11, r10)
            float r3 = (float) r7
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r3
            int r5 = kotlin.math.MathKt.roundToInt((float) r5)
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r3 = r3 * r6
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            float r4 = (float) r4
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r4 = r4 * r6
            int r4 = kotlin.math.MathKt.roundToInt((float) r4)
            r2.setMargins(r5, r14, r3, r4)
            r3 = 48
            r2.gravity = r3
            r1.setLayoutParams(r2)
            x8a r2 = r15.h0()
            jhf r2 = r2.X
            int r2 = r2.c
            r1.setText((int) r2)
            r0.addView(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0090:
            r0 = r17
            com.google.android.material.appbar.AppBarLayout r0 = (com.google.android.material.appbar.AppBarLayout) r0
            kotlin.reflect.KProperty[] r1 = one.me.login.neuroavatars.NeuroAvatarsScreen.K0
            z7a r1 = new z7a
            r1.<init>(r15, r8)
            r15.getClass()
            i53 r4 = new i53
            android.content.Context r5 = r0.getContext()
            r4.<init>(r5, r13)
            dn r5 = new dn
            r5.<init>(r11, r10)
            r5.a = r3
            r4.setLayoutParams(r5)
            r4.setTitleEnabled(r14)
            r1.invoke(r4)
            r0.addView(r4)
            one.me.sdk.uikit.common.avatar.OneMeAvatarView r1 = new one.me.sdk.uikit.common.avatar.OneMeAvatarView
            android.content.Context r3 = r0.getContext()
            r1.<init>(r3, r13)
            int r3 = defpackage.xgc.oneme_login_neuro_avatars_avatar
            r1.setId(r3)
            dn r3 = new dn
            r4 = 96
            float r4 = (float) r4
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r4
            int r5 = kotlin.math.MathKt.roundToInt((float) r5)
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r4 = r4 * r7
            int r4 = kotlin.math.MathKt.roundToInt((float) r4)
            r3.<init>(r5, r4)
            r1.setLayoutParams(r3)
            r0.setGravity(r12)
            a8a r3 = new a8a
            r3.<init>(r15, r14)
            r1.setCloseBadgeClickListener(r3)
            a8a r3 = new a8a
            r3.<init>(r15, r12)
            r1.setOnImageLoadedListener(r3)
            kotlin.Lazy r3 = r15.J0
            java.lang.Object r3 = r3.getValue()
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            r4 = 30
            one.me.sdk.uikit.common.avatar.OneMeAvatarView.g(r1, r3, r13, r4)
            goa r3 = defpackage.goa.a
            r1.setAvatarShape(r3)
            r0.addView(r1)
            r8a r1 = new r8a
            android.content.Context r3 = r0.getContext()
            r1.<init>(r3, r13, r14)
            float r3 = (float) r2
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
            r1.setPadding(r4, r14, r3, r14)
            int r3 = defpackage.xgc.oneme_login_neuro_avatars_tabs_shimmer
            r1.setId(r3)
            r1.setElevation(r6)
            dn r3 = new dn
            r3.<init>(r11, r10)
            r4 = 32
            float r4 = (float) r4
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r4
            int r5 = kotlin.math.MathKt.roundToInt((float) r5)
            r3.topMargin = r5
            r1.setLayoutParams(r3)
            r1.setVisibility(r2)
            r1.setTabs(r9)
            r1.setOverScrollMode(r8)
            r0.addView(r1)
            c2b r1 = new c2b
            android.content.Context r2 = r0.getContext()
            r1.<init>(r2, r13)
            int r2 = defpackage.xgc.oneme_login_neuro_avatars_tabs
            r1.setId(r2)
            r1.setTabMode(r14)
            r1.setElevation(r6)
            dn r2 = new dn
            r2.<init>(r11, r10)
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r4 = r4 * r3
            int r3 = kotlin.math.MathKt.roundToInt((float) r4)
            r2.topMargin = r3
            r1.setLayoutParams(r2)
            r1.setOverScrollMode(r8)
            r0.addView(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x01aa:
            r0 = r17
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            kotlin.reflect.KProperty[] r3 = one.me.login.neuroavatars.NeuroAvatarsScreen.K0
            z7a r3 = new z7a
            r3.<init>(r15, r1)
            r15.getClass()
            com.google.android.material.appbar.AppBarLayout r2 = new com.google.android.material.appbar.AppBarLayout
            android.content.Context r1 = r0.getContext()
            r2.<init>(r1, r13)
            int r1 = defpackage.xgc.oneme_login_neuro_avatars_appbar
            r2.setId(r1)
            wz3 r1 = new wz3
            r1.<init>((int) r11, (int) r10)
            r2.setLayoutParams(r1)
            r2.setElevation(r6)
            e8a r1 = new e8a
            r1.<init>(r9, r13, r14)
            defpackage.b0h.H(r2, r1)
            r3.invoke(r2)
            r0.addView(r2)
            androidx.recyclerview.widget.RecyclerView r1 = new androidx.recyclerview.widget.RecyclerView
            android.content.Context r2 = r0.getContext()
            r1.<init>(r2, r13)
            int r2 = defpackage.xgc.oneme_login_neuro_avatars_recycler_view
            r1.setId(r2)
            wz3 r2 = new wz3
            r2.<init>((int) r11, (int) r11)
            com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r3 = new com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior
            r3.<init>()
            r2.b(r3)
            r1.setLayoutParams(r2)
            r1.setClipToPadding(r14)
            r1.setItemAnimator(r13)
            r1.setOverScrollMode(r8)
            androidx.recyclerview.widget.GridLayoutManager r2 = new androidx.recyclerview.widget.GridLayoutManager
            r1.getContext()
            r2.<init>(r5)
            r1.setLayoutManager(r2)
            t56 r2 = r15.G0
            r1.setAdapter(r2)
            o8a r3 = r15.H0
            r1.m(r3)
            vo3 r3 = new vo3
            z7a r6 = new z7a
            r6.<init>(r15, r14)
            r3.<init>((androidx.recyclerview.widget.RecyclerView) r1, (defpackage.t56) r2, (defpackage.z7a) r6)
            m66 r2 = new m66
            z7a r6 = new z7a
            r6.<init>(r15, r12)
            android.content.Context r8 = r1.getContext()
            r2.<init>((defpackage.z7a) r6, (android.content.Context) r8)
            r1.j(r3)
            r1.j(r2)
            cl2 r2 = new cl2
            float r3 = (float) r4
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r3 = r3 * r4
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            float r4 = (float) r7
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r4 = r4 * r6
            int r4 = kotlin.math.MathKt.roundToInt((float) r4)
            r2.<init>(r3, r4, r5)
            r1.j(r2)
            nn1 r2 = new nn1
            r3 = 7
            r2.<init>(r3, r1, r15)
            r1.addOnLayoutChangeListener(r2)
            r0.addView(r1)
            z7a r1 = new z7a
            r2 = 8
            r1.<init>(r15, r2)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            android.content.Context r3 = r0.getContext()
            r2.<init>(r3)
            int r3 = defpackage.xgc.oneme_login_neuro_avatars_button_background
            r2.setId(r3)
            wz3 r3 = new wz3
            r3.<init>((int) r11, (int) r10)
            r4 = 80
            r3.c = r4
            r2.setLayoutParams(r3)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r4 = android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP
            js9 r5 = defpackage.fu4.k
            android.content.Context r6 = r2.getContext()
            fu4 r5 = r5.e(r6)
            k2b r5 = r5.f()
            au6 r5 = r5.d()
            bu6 r5 = r5.d
            int[] r5 = r5.a
            r3.<init>(r4, r5)
            r2.setBackground(r3)
            yh7 r3 = new yh7
            nr0 r4 = new nr0
            jdb r5 = defpackage.jdb.b
            mr0 r6 = defpackage.mr0.a
            r4.<init>(r5, r6, r14)
            r3.<init>(r13, r4, r12)
            defpackage.h88.f(r2, r3, r13)
            r1.invoke(r2)
            sn2 r1 = new sn2
            r1.<init>(r9, r13, r9)
            defpackage.b0h.H(r2, r1)
            r0.addView(r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02d0:
            r0 = r17
            android.view.View r0 = (android.view.View) r0
            kotlin.reflect.KProperty[] r0 = one.me.login.neuroavatars.NeuroAvatarsScreen.K0
            e9d r0 = r15.getRouter()
            r0.C()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x02e0:
            r0 = r17
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            kotlin.reflect.KProperty[] r1 = one.me.login.neuroavatars.NeuroAvatarsScreen.K0
            r15.getClass()
            android.widget.TextView r1 = new android.widget.TextView
            android.content.Context r2 = r0.getContext()
            r1.<init>(r2)
            int r2 = defpackage.xgc.oneme_login_neuro_avatars_title
            r1.setId(r2)
            ogf r2 = defpackage.puf.c
            r2.b(r1, defpackage.uy4.b)
            x8a r2 = r15.h0()
            jhf r2 = r2.X
            int r2 = r2.a
            r1.setText(r2)
            r1.setGravity(r12)
            f53 r2 = new f53
            r2.<init>(r11, r10)
            float r4 = (float) r7
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r5 = r5 * r4
            int r5 = kotlin.math.MathKt.roundToInt((float) r5)
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r4
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            r2.setMargins(r5, r14, r6, r14)
            r1.setLayoutParams(r2)
            ra r2 = new ra
            r2.<init>(r9, r13, r3)
            defpackage.b0h.H(r1, r2)
            r0.addView(r1)
            android.widget.TextView r1 = new android.widget.TextView
            android.content.Context r2 = r0.getContext()
            r1.<init>(r2)
            int r2 = defpackage.xgc.oneme_login_neuro_avatars_description
            r1.setId(r2)
            ogf r2 = defpackage.puf.l
            r2.b(r1, defpackage.uy4.b)
            x8a r2 = r15.h0()
            jhf r2 = r2.X
            int r2 = r2.b
            r1.setText(r2)
            r1.setGravity(r12)
            f53 r2 = new f53
            r2.<init>(r11, r10)
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = r3 * r4
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
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
            r2.setMargins(r3, r5, r4, r14)
            r1.setLayoutParams(r2)
            ra r2 = new ra
            r3 = 18
            r2.<init>(r9, r13, r3)
            defpackage.b0h.H(r1, r2)
            r0.addView(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x03a8:
            r0 = r17
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            kotlin.reflect.KProperty[] r1 = one.me.login.neuroavatars.NeuroAvatarsScreen.K0
            r15.getClass()
            android.content.Context r1 = r0.getContext()
            h3b r1 = defpackage.o54.d(r1, r13)
            int r2 = defpackage.xgc.oneme_login_neuro_avatars_toolbar
            r1.setId(r2)
            z2b r2 = defpackage.z2b.a
            r1.setForm(r2)
            p2b r2 = new p2b
            z7a r3 = new z7a
            r4 = 5
            r3.<init>(r15, r4)
            r2.<init>(r3)
            r1.setLeftActions(r2)
            x8a r2 = r15.h0()
            jhf r2 = r2.X
            int r2 = r2.a
            r1.setTitle((int) r2)
            r1.setTitleAlpha(r6)
            r0.addView(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x03e5:
            r0 = r17
            i53 r0 = (defpackage.i53) r0
            kotlin.reflect.KProperty[] r1 = one.me.login.neuroavatars.NeuroAvatarsScreen.K0
            z7a r1 = new z7a
            r1.<init>(r15, r9)
            r15.getClass()
            androidx.appcompat.widget.Toolbar r2 = new androidx.appcompat.widget.Toolbar
            android.content.Context r3 = r0.getContext()
            r2.<init>(r3, r13)
            f53 r3 = new f53
            r4 = 52
            float r4 = (float) r4
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r4
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            r3.<init>(r11, r6)
            r3.a = r12
            r2.setLayoutParams(r3)
            r2.setNavigationIcon((android.graphics.drawable.Drawable) r13)
            r2.u(r14, r14)
            r1.invoke(r2)
            r0.addView(r2)
            z7a r1 = new z7a
            r1.<init>(r15, r5)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            android.content.Context r3 = r0.getContext()
            r2.<init>(r3)
            int r3 = defpackage.xgc.oneme_login_neuro_avatars_collapsible
            r2.setId(r3)
            f53 r3 = new f53
            r3.<init>(r11, r10)
            r3.a = r8
            r5 = 24
            float r5 = (float) r5
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r5
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            int r4 = defpackage.g63.b(r4, r7, r6)
            android.content.res.Resources r6 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r5 = r5 * r6
            int r5 = kotlin.math.MathKt.roundToInt((float) r5)
            r3.setMargins(r14, r4, r14, r5)
            r2.setLayoutParams(r3)
            r2.setOrientation(r12)
            r1.invoke(r2)
            r0.addView(r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x047f:
            r0 = r17
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            t56 r1 = r15.G0
            int r1 = r1.j()
            if (r1 > 0) goto L_0x0490
            goto L_0x049f
        L_0x0490:
            t56 r1 = r15.G0
            q7a r0 = r1.L(r0)
            if (r0 == 0) goto L_0x049d
            boolean r0 = r0.o
            if (r0 != r12) goto L_0x049d
            goto L_0x049e
        L_0x049d:
            r12 = r14
        L_0x049e:
            r14 = r12
        L_0x049f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            return r0
        L_0x04a4:
            r0 = r17
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            t56 r1 = r15.G0
            q7a r0 = r1.L(r0)
            if (r0 == 0) goto L_0x04cd
            x8a r1 = r15.h0()
            xme r1 = r1.x0
            java.lang.Object r1 = r1.getValue()
            java.util.Map r1 = (java.util.Map) r1
            int r0 = r0.c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.get(r0)
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
        L_0x04cd:
            if (r13 != 0) goto L_0x04d1
            java.lang.String r13 = ""
        L_0x04d1:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7a.invoke(java.lang.Object):java.lang.Object");
    }
}
