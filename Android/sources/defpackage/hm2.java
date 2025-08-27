package defpackage;

import kotlin.jvm.functions.Function1;
import one.me.chatscreen.ChatScreen;

/* renamed from: hm2  reason: default package */
public final /* synthetic */ class hm2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatScreen b;

    public /* synthetic */ hm2(ChatScreen chatScreen, int i) {
        this.a = i;
        this.b = chatScreen;
    }

    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1, types: [android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARNING: type inference failed for: r6v4, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 8
            r1 = -2
            r2 = 1
            r3 = 3
            r4 = -1
            r5 = 0
            r6 = 0
            one.me.chatscreen.ChatScreen r7 = r11.b
            int r11 = r11.a
            switch(r11) {
                case 0: goto L_0x0381;
                case 1: goto L_0x0365;
                case 2: goto L_0x021a;
                case 3: goto L_0x018d;
                case 4: goto L_0x013f;
                case 5: goto L_0x00a0;
                default: goto L_0x000f;
            }
        L_0x000f:
            android.view.View r12 = (android.view.View) r12
            kotlin.reflect.KProperty[] r11 = one.me.chatscreen.ChatScreen.d1
            int r11 = defpackage.pq7.a
            int r11 = defpackage.pq7.c
            boolean r11 = defpackage.pq7.b(r11)
            if (r11 == 0) goto L_0x0026
            one.me.sdk.messagewrite.MessageWriteWidget r11 = r7.r0()
            if (r11 == 0) goto L_0x0026
            r11.k()
        L_0x0026:
            lp2 r11 = r7.B0()
            one.me.sdk.messagewrite.MessageWriteWidget r12 = r7.r0()
            if (r12 == 0) goto L_0x0038
            dc9 r12 = r12.d0()
            java.lang.CharSequence r6 = r12.getText()
        L_0x0038:
            mh9 r12 = r7.q0()
            java.lang.Long r12 = r12.l()
            mh9 r0 = r7.q0()
            java.lang.Long r0 = r0.k()
            r11.r(r6, r12, r0)
            lp2 r11 = r7.B0()
            cf5 r11 = r11.b
            sv0 r12 = r11.a
            r12.f(r11)
            kotlin.Lazy r11 = r7.E0
            java.lang.Object r11 = r11.getValue()
            yvc r11 = (defpackage.yvc) r11
            xme r12 = r11.w
            java.lang.Object r12 = r12.getValue()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x0076
            rvc r12 = defpackage.rvc.a
            s85 r11 = r11.c
            defpackage.xag.h(r11, r12)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            goto L_0x009f
        L_0x0076:
            wn2 r11 = defpackage.wn2.b
            ta4 r12 = r11.W0()
            boolean r12 = r12.d()
            if (r12 != 0) goto L_0x009d
            ta4 r11 = r11.W0()
            ja4 r11 = r11.a()
            bta r11 = (defpackage.bta) r11
            l9d r11 = r11.e()
            e9d r11 = r11.x()
            android.app.Activity r11 = r11.d()
            if (r11 == 0) goto L_0x009d
            r11.finish()
        L_0x009d:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
        L_0x009f:
            return r11
        L_0x00a0:
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            kotlin.reflect.KProperty[] r11 = one.me.chatscreen.ChatScreen.d1
            r7.getClass()
            android.content.Context r11 = r12.getContext()
            h3b r11 = defpackage.o54.d(r11, r6)
            int r0 = defpackage.lra.o
            r11.setId(r0)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r4, r1)
            r11.setLayoutParams(r0)
            z2b r0 = defpackage.z2b.c
            r11.setForm(r0)
            java.lang.String r0 = ""
            r11.setTitle((java.lang.CharSequence) r0)
            r11.setSubtitle((java.lang.CharSequence) r0)
            p2b r0 = new p2b
            hm2 r2 = new hm2
            r3 = 6
            r2.<init>(r7, r3)
            r0.<init>(r2)
            r11.setLeftActions(r0)
            gm2 r0 = new gm2
            r2 = 10
            r0.<init>(r7, r2)
            r11.setTitleClickListener(r0)
            r12.addView(r11)
            pza r11 = new pza
            android.content.Context r0 = r12.getContext()
            r11.<init>(r0)
            int r0 = defpackage.lra.m
            r11.setId(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r4, r1)
            r1 = 12
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            r0.setMarginEnd(r1)
            r1 = 8388629(0x800015, float:1.1754973E-38)
            r0.gravity = r1
            r11.setLayoutParams(r0)
            r11.setShouldShowSearchIcon(r5)
            pn2 r0 = new pn2
            r0.<init>(r7)
            r11.setListener(r0)
            lp2 r0 = r7.B0()
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x012c
            int r0 = defpackage.mra.k
            goto L_0x012e
        L_0x012c:
            int r0 = defpackage.mra.r
        L_0x012e:
            android.content.Context r1 = r7.getContext()
            java.lang.String r0 = defpackage.q8.p(r0, r1)
            r11.setSearchHint(r0)
            r12.addView(r11)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x013f:
            iog r12 = (defpackage.iog) r12
            xr8 r11 = r7.O0
            if (r11 == 0) goto L_0x018a
            boolean r12 = r11.l
            if (r12 == 0) goto L_0x018a
            boolean r12 = r11.g
            if (r12 != 0) goto L_0x014e
            goto L_0x018a
        L_0x014e:
            int r12 = r11.c()
            android.view.View r0 = r11.b
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L_0x015f
            r6 = r1
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
        L_0x015f:
            if (r6 == 0) goto L_0x0164
            int r1 = r6.bottomMargin
            goto L_0x0165
        L_0x0164:
            r1 = r5
        L_0x0165:
            int r12 = r12 + r1
            android.view.View r1 = r11.c
            int r2 = r1.getPaddingBottom()
            if (r2 == r12) goto L_0x018a
            r11.g = r5
            android.animation.AnimatorSet r11 = r11.i
            if (r11 == 0) goto L_0x0177
            r11.cancel()
        L_0x0177:
            r11 = 0
            r0.setTranslationY(r11)
            int r11 = r1.getPaddingLeft()
            int r0 = r1.getPaddingTop()
            int r2 = r1.getPaddingRight()
            r1.setPadding(r11, r0, r2, r12)
        L_0x018a:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x018d:
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            kotlin.reflect.KProperty[] r11 = one.me.chatscreen.ChatScreen.d1
            hm2 r11 = new hm2
            r0 = 5
            r11.<init>(r7, r0)
            r7.getClass()
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r8 = r12.getContext()
            r0.<init>(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r4, r1)
            r0.setLayoutParams(r8)
            defpackage.h88.g(r0)
            r8 = 1092616192(0x41200000, float:10.0)
            r0.setElevation(r8)
            sn2 r9 = new sn2
            r9.<init>(r3, r6, r5)
            defpackage.b0h.H(r0, r9)
            r11.invoke(r0)
            r12.addView(r0)
            android.content.Context r11 = r12.getContext()
            oz1 r11 = defpackage.kv0.a(r11)
            int r0 = defpackage.lra.l
            r11.setId(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r4, r1)
            r11.setLayoutParams(r0)
            ln2 r0 = new ln2
            r0.<init>(r3, r6, r5)
            defpackage.b0h.H(r11, r0)
            r11.setElevation(r8)
            r12.addView(r11)
            oz1 r11 = new oz1
            android.content.Context r0 = r12.getContext()
            r11.<init>(r0)
            int r0 = defpackage.lra.k
            r11.setId(r0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r4, r5, r1)
            r11.setLayoutParams(r0)
            boolean r0 = r7.E0()
            if (r0 != 0) goto L_0x0203
            goto L_0x0214
        L_0x0203:
            yh7 r0 = new yh7
            nr0 r1 = new nr0
            jdb r3 = defpackage.jdb.a
            mr0 r4 = defpackage.mr0.b
            r1.<init>(r3, r4, r2)
            r0.<init>(r6, r1, r2)
            defpackage.h88.f(r11, r0, r6)
        L_0x0214:
            r12.addView(r11)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x021a:
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            kotlin.reflect.KProperty[] r11 = one.me.chatscreen.ChatScreen.d1
            hm2 r11 = new hm2
            r11.<init>(r7, r3)
            r7.getClass()
            android.widget.LinearLayout r5 = new android.widget.LinearLayout
            android.content.Context r8 = r12.getContext()
            r5.<init>(r8)
            int r8 = defpackage.lra.h
            r5.setId(r8)
            r5.setOrientation(r2)
            android.view.ViewGroup$LayoutParams r8 = new android.view.ViewGroup$LayoutParams
            r8.<init>(r4, r4)
            r5.setLayoutParams(r8)
            r11.invoke(r5)
            r12.addView(r5)
            oz1 r11 = new oz1
            android.content.Context r5 = r12.getContext()
            r11.<init>(r5)
            int r5 = defpackage.lra.p
            r11.setId(r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r4, r4)
            r11.setLayoutParams(r5)
            r11.setVisibility(r0)
            boolean r0 = r7.E0()
            if (r0 != 0) goto L_0x0265
            goto L_0x0276
        L_0x0265:
            yh7 r0 = new yh7
            nr0 r5 = new nr0
            jdb r8 = defpackage.jdb.c
            mr0 r9 = defpackage.mr0.b
            r5.<init>(r8, r9, r2)
            r0.<init>(r6, r5, r2)
            defpackage.h88.f(r11, r0, r6)
        L_0x0276:
            r12.addView(r11)
            oz1 r11 = new oz1
            android.content.Context r0 = r12.getContext()
            r11.<init>(r0)
            int r0 = defpackage.lra.b
            r11.setId(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r4, r1)
            r5 = 80
            r0.gravity = r5
            r11.setLayoutParams(r0)
            boolean r0 = r7.E0()
            if (r0 != 0) goto L_0x029a
            goto L_0x02ab
        L_0x029a:
            yh7 r0 = new yh7
            nr0 r8 = new nr0
            jdb r9 = defpackage.jdb.c
            mr0 r10 = defpackage.mr0.b
            r8.<init>(r9, r10, r2)
            r0.<init>(r6, r8, r2)
            defpackage.h88.f(r11, r0, r6)
        L_0x02ab:
            mx1 r0 = new mx1
            r0.<init>(r2, r7)
            r11.addOnLayoutChangeListener(r0)
            mh0 r0 = new mh0
            r0.<init>((int) r3, (kotlin.coroutines.Continuation) r6, (int) r3)
            defpackage.b0h.H(r11, r0)
            r12.addView(r11)
            oz1 r11 = new oz1
            android.content.Context r0 = r12.getContext()
            r11.<init>(r0)
            int r0 = defpackage.lra.n
            r11.setId(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r4, r4)
            r0.gravity = r5
            r3 = 48
            float r3 = (float) r3
            android.content.res.Resources r8 = defpackage.vo4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r3 = r3 * r8
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
            r0.bottomMargin = r3
            r11.setLayoutParams(r0)
            boolean r0 = r7.E0()
            if (r0 != 0) goto L_0x02f1
            goto L_0x0302
        L_0x02f1:
            yh7 r0 = new yh7
            nr0 r3 = new nr0
            jdb r8 = defpackage.jdb.c
            mr0 r9 = defpackage.mr0.b
            r3.<init>(r8, r9, r2)
            r0.<init>(r6, r3, r2)
            defpackage.h88.f(r11, r0, r6)
        L_0x0302:
            r12.addView(r11)
            oz1 r11 = new oz1
            android.content.Context r0 = r12.getContext()
            r11.<init>(r0)
            int r0 = defpackage.lra.j
            r11.setId(r0)
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r4, r1)
            r0.gravity = r5
            r11.setLayoutParams(r0)
            int r0 = defpackage.pq7.a
            android.content.Context r0 = r11.getContext()
            int r0 = defpackage.pq7.a(r0)
            float r0 = (float) r0
            r11.setTranslationY(r0)
            boolean r0 = r7.E0()
            if (r0 != 0) goto L_0x0332
            goto L_0x0349
        L_0x0332:
            yh7 r0 = new yh7
            nr0 r1 = new nr0
            jdb r3 = defpackage.jdb.o
            mr0 r4 = defpackage.mr0.a
            r1.<init>(r3, r4, r2)
            r0.<init>(r6, r1, r2)
            hm2 r1 = new hm2
            r2 = 4
            r1.<init>(r7, r2)
            defpackage.h88.f(r11, r0, r1)
        L_0x0349:
            r12.addView(r11)
            boolean r11 = r7.E0()
            if (r11 == 0) goto L_0x0355
            yh7 r11 = defpackage.yh7.c
            goto L_0x035f
        L_0x0355:
            yh7 r11 = defpackage.yh7.d
            nr0 r11 = r11.b
            yh7 r0 = new yh7
            r0.<init>(r6, r11)
            r11 = r0
        L_0x035f:
            defpackage.h88.f(r12, r11, r6)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x0365:
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r11 = r12.intValue()
            kotlin.reflect.KProperty[] r12 = one.me.chatscreen.ChatScreen.d1
            rk9 r12 = r7.s0()
            r12.getClass()
            jk9 r0 = new jk9
            r0.<init>(r11)
            s85 r11 = r12.y
            defpackage.xag.h(r11, r0)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x0381:
            android.view.ViewGroup r12 = (android.view.ViewGroup) r12
            kotlin.reflect.KProperty[] r11 = one.me.chatscreen.ChatScreen.d1
            int r11 = defpackage.ogc.chat__root_container
            r12.setId(r11)
            r7.getClass()
            android.view.View r11 = new android.view.View
            android.content.Context r1 = r12.getContext()
            r11.<init>(r1)
            int r1 = defpackage.lra.a
            r11.setId(r1)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r1.<init>(r4, r4)
            r11.setLayoutParams(r1)
            yh7 r1 = new yh7
            jdb r3 = defpackage.jdb.o
            jdb r5 = defpackage.anf.a
            nr0 r5 = new nr0
            mr0 r8 = defpackage.mr0.a
            r5.<init>(r3, r8, r2)
            r1.<init>(r3, r5)
            defpackage.h88.f(r11, r1, r6)
            r12.addView(r11)
            hm2 r11 = new hm2
            r1 = 2
            r11.<init>(r7, r1)
            vn2 r1 = new vn2
            android.content.Context r2 = r12.getContext()
            r1.<init>(r2)
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r4, r4)
            r1.setLayoutParams(r2)
            r11.invoke(r1)
            r12.addView(r1)
            oz1 r11 = new oz1
            android.content.Context r1 = r12.getContext()
            r11.<init>(r1)
            int r1 = defpackage.lra.i
            r11.setId(r1)
            r11.setVisibility(r0)
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r0.<init>(r4, r4)
            r11.setLayoutParams(r0)
            r12.addView(r11)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm2.invoke(java.lang.Object):java.lang.Object");
    }
}
