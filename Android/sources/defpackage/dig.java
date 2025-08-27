package defpackage;

import kotlin.jvm.functions.Function1;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: dig  reason: default package */
public final /* synthetic */ class dig implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WebAppRootScreen b;

    public /* synthetic */ dig(WebAppRootScreen webAppRootScreen, int i) {
        this.a = i;
        this.b = webAppRootScreen;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: n3b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: jid} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = 8
            r2 = 0
            r3 = 3
            one.me.webapp.rootscreen.WebAppRootScreen r4 = r0.b
            int r5 = r0.a
            switch(r5) {
                case 0: goto L_0x0081;
                case 1: goto L_0x0063;
                case 2: goto L_0x004b;
                default: goto L_0x000d;
            }
        L_0x000d:
            r0 = r18
            android.view.View r0 = (android.view.View) r0
            kotlin.reflect.KProperty[] r1 = one.me.webapp.rootscreen.WebAppRootScreen.D0
            r4.getClass()
            ix3 r1 = defpackage.ix3.a
            lw3 r1 = defpackage.m58.b(r1)
            lw3 r0 = r1.o(r0)
            ow3 r1 = new ow3
            int r2 = defpackage.omc.web_app_root_dots_menu_refresh
            igf r7 = new igf
            r7.<init>(r2)
            int r2 = defpackage.nad.n1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            r6 = 1
            r10 = 20
            r9 = 0
            r5 = r1
            r5.<init>((int) r6, (defpackage.ngf) r7, (java.lang.Integer) r8, (java.lang.Integer) r9, (int) r10)
            java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            lw3 r0 = r0.h(r1)
            mw3 r0 = r0.build()
            r0.o(r4)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x004b:
            r0 = r18
            android.view.View r0 = (android.view.View) r0
            kotlin.reflect.KProperty[] r0 = one.me.webapp.rootscreen.WebAppRootScreen.D0
            hjg r0 = r4.p0()
            r0.getClass()
            yig r1 = new yig
            r1.<init>(r0, r2)
            defpackage.xag.g(r0, r2, r2, r1, r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0063:
            r0 = r18
            android.view.View r0 = (android.view.View) r0
            kotlin.reflect.KProperty[] r0 = one.me.webapp.rootscreen.WebAppRootScreen.D0
            hjg r0 = r4.p0()
            tgg r0 = r0.A0
            r0.getClass()
            so7 r1 = new so7
            r1.<init>(r0, r2)
            java.lang.Object r0 = r0.a
            d14 r0 = (defpackage.d14) r0
            defpackage.ev0.v(r0, r2, r2, r1, r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0081:
            r2 = r18
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            kotlin.reflect.KProperty[] r4 = one.me.webapp.rootscreen.WebAppRootScreen.D0
            one.me.webapp.rootscreen.WebAppRootScreen r0 = r0.b
            r0.getClass()
            android.content.Context r4 = r2.getContext()
            r9 = 0
            h3b r4 = defpackage.o54.d(r4, r9)
            int r5 = defpackage.q3b.e
            r4.setId(r5)
            z2b r5 = defpackage.z2b.a
            r4.setForm(r5)
            w2b r5 = new w2b
            dig r6 = new dig
            r6.<init>(r0, r3)
            r5.<init>(r6)
            r4.setRightActions(r5)
            r2.addView(r4)
            android.widget.FrameLayout r3 = new android.widget.FrameLayout
            android.content.Context r4 = r2.getContext()
            r3.<init>(r4)
            int r4 = defpackage.q3b.a
            r3.setId(r4)
            android.view.ViewGroup$LayoutParams r4 = new android.view.ViewGroup$LayoutParams
            r5 = -1
            r4.<init>(r5, r5)
            r3.setLayoutParams(r4)
            android.content.Context r4 = r3.getContext()
            jid r11 = new jid
            r6 = 16842885(0x1010085, float:2.369393E-38)
            r11.<init>(r4, r9, r6, r1)
            int r6 = defpackage.q3b.f
            r11.setId(r6)
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r6.<init>(r5, r5)
            r11.setLayoutParams(r6)
            android.webkit.WebSettings r6 = r11.getSettings()
            r7 = 1
            r6.setJavaScriptEnabled(r7)
            android.webkit.WebSettings r6 = r11.getSettings()
            r6.setDomStorageEnabled(r7)
            android.webkit.WebSettings r6 = r11.getSettings()
            r6.setSupportMultipleWindows(r7)
            u13 r6 = new u13
            r6.<init>(r4)
            p3b r4 = new p3b
            hjg r8 = r0.p0()
            r4.<init>(r8, r6)
            r11.setWebViewClient(r4)
            m3b r4 = new m3b
            hjg r6 = r0.p0()
            r4.<init>(r6)
            r11.setWebChromeClient(r4)
            ulg r4 = new ulg
            hjg r6 = r0.p0()
            r4.<init>(r6)
            java.lang.String r6 = "WebViewHandler"
            r11.addJavascriptInterface(r4, r6)
            android.content.Context r4 = r3.getContext()
            aya r12 = new aya
            r12.<init>(r4)
            int r4 = defpackage.q3b.d
            r12.setId(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r6 = -2
            r8 = 17
            r4.<init>(r6, r6, r8)
            r12.setLayoutParams(r4)
            pxa r4 = defpackage.pxa.a
            r12.setAppearance(r4)
            android.content.Context r4 = r3.getContext()
            android.widget.LinearLayout r13 = new android.widget.LinearLayout
            r13.<init>(r4)
            int r10 = defpackage.q3b.b
            r13.setId(r10)
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r10.<init>(r5, r6, r8)
            r5 = 20
            float r5 = (float) r5
            android.content.res.Resources r8 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r8 = r8 * r5
            int r8 = kotlin.math.MathKt.roundToInt((float) r8)
            r10.setMarginStart(r8)
            android.content.res.Resources r8 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r5 = r5 * r8
            int r5 = kotlin.math.MathKt.roundToInt((float) r5)
            r10.setMarginEnd(r5)
            r13.setLayoutParams(r10)
            r13.setOrientation(r7)
            int r5 = defpackage.cad.x0
            android.content.Context r8 = r13.getContext()
            android.graphics.drawable.Drawable r8 = defpackage.ew3.b(r8, r5)
            android.widget.ImageView r14 = new android.widget.ImageView
            r14.<init>(r4)
            r14.setImageDrawable(r8)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r6, r6)
            r5.gravity = r7
            r14.setLayoutParams(r5)
            android.widget.TextView r15 = new android.widget.TextView
            r15.<init>(r4)
            int r5 = defpackage.omc.web_app_root_error_title
            r15.setText(r5)
            r15.setSingleLine()
            ogf r5 = defpackage.puf.d
            r5.b(r15, defpackage.uy4.b)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r6, r6)
            r5.gravity = r7
            r10 = 16
            float r10 = (float) r10
            android.content.res.Resources r16 = defpackage.vo4.c()
            android.util.DisplayMetrics r1 = r16.getDisplayMetrics()
            float r1 = r1.density
            float r10 = r10 * r1
            int r1 = kotlin.math.MathKt.roundToInt((float) r10)
            r5.topMargin = r1
            r15.setLayoutParams(r5)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r4)
            int r5 = defpackage.omc.web_app_root_error_subtitle
            r1.setText(r5)
            r1.setSingleLine()
            ogf r5 = defpackage.puf.m
            r5.b(r1, defpackage.uy4.b)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r6, r6)
            r10 = 2
            float r10 = (float) r10
            android.content.res.Resources r16 = defpackage.vo4.c()
            android.util.DisplayMetrics r6 = r16.getDisplayMetrics()
            float r6 = r6.density
            float r10 = r10 * r6
            int r6 = kotlin.math.MathKt.roundToInt((float) r10)
            r5.topMargin = r6
            r6 = 24
            float r6 = (float) r6
            android.content.res.Resources r10 = defpackage.vo4.c()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r6 = r6 * r10
            int r6 = kotlin.math.MathKt.roundToInt((float) r6)
            r5.bottomMargin = r6
            r5.gravity = r7
            r1.setLayoutParams(r5)
            one.me.sdk.uikit.common.button.OneMeButton r10 = new one.me.sdk.uikit.common.button.OneMeButton
            r10.<init>(r4, r9)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r4.<init>(r5, r5)
            r4.gravity = r7
            r10.setLayoutParams(r4)
            int r4 = defpackage.omc.web_app_root_error_retry_button
            r10.setText((int) r4)
            zpa r4 = defpackage.zpa.b
            r10.setMode(r4)
            xpa r4 = defpackage.xpa.o
            r10.setAppearance(r4)
            dte r4 = new dte
            r5 = 8
            r4.<init>(r5, r0)
            defpackage.ct.G(r10, 300, r4)
            ce1 r4 = new ce1
            r16 = 8
            r5 = r4
            r6 = r15
            r7 = r1
            r18 = r2
            r2 = r10
            r10 = r16
            r5.<init>(r6, r7, r8, r9, r10)
            defpackage.b0h.H(r13, r4)
            r13.addView(r14)
            r13.addView(r15)
            r13.addView(r1)
            r13.addView(r2)
            r3.addView(r11)
            hjg r1 = r0.p0()
            etc r1 = r1.H0
            fig r2 = new fig
            r4 = 0
            r5 = r2
            r6 = r0
            r7 = r11
            r8 = r3
            r9 = r13
            r10 = r12
            r11 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11)
            ps5 r4 = new ps5
            r5 = 5
            r4.<init>(r1, r2, r5)
            tu7 r0 = r0.getViewLifecycleScope()
            defpackage.o5a.O(r4, r0)
            r0 = r18
            r0.addView(r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dig.invoke(java.lang.Object):java.lang.Object");
    }
}
