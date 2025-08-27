package defpackage;

import kotlin.properties.ObservableProperty;
import ru.ok.messages.messages.panels.widgets.MultiImageToggleButton;

/* renamed from: bl  reason: default package */
public final class bl extends ObservableProperty {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bl(int i, Object obj) {
        super(null);
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02da, code lost:
        if (r4 != null) goto L_0x02dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void afterChange(kotlin.reflect.KProperty r17, java.lang.Object r18, java.lang.Object r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = 8
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 1
            int r7 = r0.a
            switch(r7) {
                case 0: goto L_0x065e;
                case 1: goto L_0x063c;
                case 2: goto L_0x05ad;
                case 3: goto L_0x0577;
                case 4: goto L_0x0561;
                case 5: goto L_0x048a;
                case 6: goto L_0x0364;
                case 7: goto L_0x034a;
                case 8: goto L_0x031f;
                case 9: goto L_0x02eb;
                case 10: goto L_0x02c0;
                case 11: goto L_0x02aa;
                case 12: goto L_0x028d;
                case 13: goto L_0x024a;
                case 14: goto L_0x0227;
                case 15: goto L_0x0200;
                case 16: goto L_0x01e4;
                case 17: goto L_0x01c8;
                case 18: goto L_0x01aa;
                case 19: goto L_0x014f;
                case 20: goto L_0x0131;
                case 21: goto L_0x0103;
                case 22: goto L_0x00ea;
                case 23: goto L_0x00cb;
                case 24: goto L_0x00af;
                case 25: goto L_0x0099;
                case 26: goto L_0x0083;
                case 27: goto L_0x0067;
                case 28: goto L_0x0024;
                default: goto L_0x000e;
            }
        L_0x000e:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r18, (java.lang.Object) r19)
            if (r1 != 0) goto L_0x0023
            r1 = r19
            float[] r1 = (float[]) r1
            r1 = r18
            float[] r1 = (float[]) r1
            java.lang.Object r0 = r0.b
            h9g r0 = (defpackage.h9g) r0
            r0.requestLayout()
        L_0x0023:
            return
        L_0x0024:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r18, (java.lang.Object) r19)
            if (r1 != 0) goto L_0x0066
            r1 = r19
            vle r1 = (defpackage.vle) r1
            r2 = r18
            vle r2 = (defpackage.vle) r2
            int r1 = r1.ordinal()
            java.lang.Object r0 = r0.b
            xle r0 = (defpackage.xle) r0
            if (r1 == 0) goto L_0x0048
            if (r1 != r6) goto L_0x0042
            defpackage.xle.a(r0)
            goto L_0x0066
        L_0x0042:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0048:
            kotlin.Lazy r1 = r0.c
            boolean r2 = r1.isInitialized()
            if (r2 == 0) goto L_0x0066
            java.lang.Object r1 = r1.getValue()
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.animation.ValueAnimator r2 = r0.v
            if (r2 == 0) goto L_0x005d
            r2.cancel()
        L_0x005d:
            android.animation.ValueAnimator r1 = defpackage.xle.b(r0, r1, r5)
            r0.v = r1
            r1.start()
        L_0x0066:
            return
        L_0x0067:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r18, (java.lang.Object) r19)
            if (r1 != 0) goto L_0x0082
            r1 = r19
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.getClass()
            r1 = r18
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.getClass()
            java.lang.Object r0 = r0.b
            pee r0 = (defpackage.pee) r0
            r0.m()
        L_0x0082:
            return
        L_0x0083:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r18, (java.lang.Object) r19)
            if (r1 != 0) goto L_0x0098
            r1 = r19
            ede r1 = (defpackage.ede) r1
            r1 = r18
            ede r1 = (defpackage.ede) r1
            java.lang.Object r0 = r0.b
            jde r0 = (defpackage.jde) r0
            defpackage.jde.t(r0)
        L_0x0098:
            return
        L_0x0099:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r18, (java.lang.Object) r19)
            if (r1 != 0) goto L_0x00ae
            r1 = r19
            ede r1 = (defpackage.ede) r1
            r1 = r18
            ede r1 = (defpackage.ede) r1
            java.lang.Object r0 = r0.b
            hde r0 = (defpackage.hde) r0
            defpackage.hde.c(r0)
        L_0x00ae:
            return
        L_0x00af:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r18, (java.lang.Object) r19)
            if (r1 != 0) goto L_0x00ca
            r1 = r19
            d7e r1 = (defpackage.d7e) r1
            r1 = r18
            d7e r1 = (defpackage.d7e) r1
            js9 r1 = defpackage.fu4.k
            java.lang.Object r0 = r0.b
            e7e r0 = (defpackage.e7e) r0
            k2b r1 = r1.f(r0)
            r0.a(r1)
        L_0x00ca:
            return
        L_0x00cb:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r18, (java.lang.Object) r19)
            if (r1 != 0) goto L_0x00e9
            r1 = r19
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.getClass()
            r1 = r18
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.getClass()
            java.lang.Object r0 = r0.b
            pqc r0 = (defpackage.pqc) r0
            r0.requestLayout()
            r0.invalidate()
        L_0x00e9:
            return
        L_0x00ea:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r18, (java.lang.Object) r19)
            if (r1 != 0) goto L_0x0102
            r1 = r19
            epc r1 = (defpackage.epc) r1
            r2 = r18
            epc r2 = (defpackage.epc) r2
            java.lang.Object r0 = r0.b
            fpc r0 = (defpackage.fpc) r0
            defpackage.fpc.a(r0, r1)
            r0.b()
        L_0x0102:
            return
        L_0x0103:
            r1 = r19
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r2 = r18
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            if (r2 == 0) goto L_0x010f
            if (r2 == r1) goto L_0x0130
        L_0x010f:
            java.lang.Object r0 = r0.b
            htb r0 = (defpackage.htb) r0
            boolean r1 = r0.g
            if (r1 == 0) goto L_0x0130
            kotlin.reflect.KProperty[] r1 = defpackage.htb.m
            r1 = r1[r5]
            bl r2 = r0.l
            java.lang.Object r1 = r2.getValue(r0, r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            if (r1 != 0) goto L_0x0126
            goto L_0x0130
        L_0x0126:
            sx8 r2 = new sx8
            r3 = 24
            r2.<init>(r3, r0, r1)
            r1.post(r2)
        L_0x0130:
            return
        L_0x0131:
            r1 = r19
            k2b r1 = (defpackage.k2b) r1
            r2 = r18
            k2b r2 = (defpackage.k2b) r2
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)
            if (r2 != 0) goto L_0x014e
            java.lang.Object r0 = r0.b
            one.me.sdk.uikit.common.emptyview.OneMeEmptyView r0 = (one.me.sdk.uikit.common.emptyview.OneMeEmptyView) r0
            if (r1 != 0) goto L_0x014b
            js9 r1 = defpackage.fu4.k
            k2b r1 = r1.f(r0)
        L_0x014b:
            r0.onThemeChanged(r1)
        L_0x014e:
            return
        L_0x014f:
            r1 = r19
            hta r1 = (defpackage.hta) r1
            r4 = r18
            hta r4 = (defpackage.hta) r4
            if (r4 == r1) goto L_0x01a9
            java.lang.Object r0 = r0.b
            ita r0 = (defpackage.ita) r0
            android.graphics.Paint r4 = r0.c
            js9 r5 = defpackage.fu4.k
            android.content.Context r0 = r0.getContext()
            fu4 r0 = r5.e(r0)
            k2b r0 = r0.f()
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x019a
            if (r1 == r6) goto L_0x0191
            if (r1 == r3) goto L_0x0188
            if (r1 != r2) goto L_0x0182
            df0 r0 = r0.c()
            cf0 r0 = r0.a
            int r0 = r0.e
            goto L_0x01a6
        L_0x0182:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0188:
            df0 r0 = r0.c()
            cf0 r0 = r0.a
            int r0 = r0.g
            goto L_0x01a6
        L_0x0191:
            df0 r0 = r0.c()
            cf0 r0 = r0.a
            int r0 = r0.c
            goto L_0x01a6
        L_0x019a:
            df0 r0 = r0.c()
            cf0 r0 = r0.a
            r0.getClass()
            r0 = -16745729(0xffffffffff007aff, float:-1.7077982E38)
        L_0x01a6:
            r4.setColor(r0)
        L_0x01a9:
            return
        L_0x01aa:
            r1 = r19
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r2 = r18
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)
            if (r2 != 0) goto L_0x01c7
            js9 r2 = defpackage.fu4.k
            java.lang.Object r0 = r0.b
            one.me.common.bottombar.OneMeBottomBarView r0 = (one.me.common.bottombar.OneMeBottomBarView) r0
            k2b r2 = r2.f(r0)
            js9 r3 = one.me.common.bottombar.OneMeBottomBarView.b
            r0.a(r2, r1)
        L_0x01c7:
            return
        L_0x01c8:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r18, (java.lang.Object) r19)
            if (r1 != 0) goto L_0x01e3
            r1 = r19
            gna r1 = (defpackage.gna) r1
            r1 = r18
            gna r1 = (defpackage.gna) r1
            js9 r1 = defpackage.fu4.k
            java.lang.Object r0 = r0.b
            hna r0 = (defpackage.hna) r0
            k2b r1 = r1.f(r0)
            r0.onThemeChanged(r1)
        L_0x01e3:
            return
        L_0x01e4:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r18, (java.lang.Object) r19)
            if (r1 != 0) goto L_0x01ff
            r1 = r19
            java.lang.Number r1 = (java.lang.Number) r1
            r1.floatValue()
            r1 = r18
            java.lang.Number r1 = (java.lang.Number) r1
            r1.floatValue()
            java.lang.Object r0 = r0.b
            m7a r0 = (defpackage.m7a) r0
            r0.invalidateSelf()
        L_0x01ff:
            return
        L_0x0200:
            r1 = r19
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r18
            java.lang.Number r2 = (java.lang.Number) r2
            r2.intValue()
            java.lang.Object r0 = r0.b
            ru.ok.messages.messages.panels.widgets.MultiImageToggleButton r0 = (ru.ok.messages.messages.panels.widgets.MultiImageToggleButton) r0
            java.util.List r2 = r0.v
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0226
            java.util.List r2 = r0.v
            java.lang.Object r1 = r2.get(r1)
            android.graphics.drawable.Drawable r1 = (android.graphics.drawable.Drawable) r1
            defpackage.bl.super.setImageDrawable(r1)
        L_0x0226:
            return
        L_0x0227:
            r1 = r19
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            r2 = r18
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            java.lang.Object r0 = r0.b
            lf9 r0 = (defpackage.lf9) r0
            q23 r0 = r0.getDefaultMovementMethod()
            if (r1 == 0) goto L_0x023a
            r5 = r6
        L_0x023a:
            android.view.GestureDetector r1 = r0.l
            if (r5 == 0) goto L_0x0244
            q00 r2 = r0.k
            r1.setOnDoubleTapListener(r2)
            goto L_0x0247
        L_0x0244:
            r1.setOnDoubleTapListener(r4)
        L_0x0247:
            r0.i = r5
            return
        L_0x024a:
            r2 = r19
            qc9 r2 = (defpackage.qc9) r2
            r2 = r18
            qc9 r2 = (defpackage.qc9) r2
            java.lang.Object r0 = r0.b
            sc9 r0 = (defpackage.sc9) r0
            r0.b = r4
            r0.c = r4
            r0.o = r4
            r0.v = r4
            kotlin.Lazy r2 = r0.w
            boolean r3 = r2.isInitialized()
            if (r3 == 0) goto L_0x026f
            java.lang.Object r2 = r2.getValue()
            one.me.sdk.uikit.common.avatar.OneMeAvatarView r2 = (one.me.sdk.uikit.common.avatar.OneMeAvatarView) r2
            r2.setVisibility(r1)
        L_0x026f:
            r0.v0 = r4
            kotlin.Lazy r2 = r0.w0
            boolean r3 = r2.isInitialized()
            if (r3 == 0) goto L_0x0282
            java.lang.Object r2 = r2.getValue()
            one.me.sdk.uikit.common.views.OneMeDraweeView r2 = (one.me.sdk.uikit.common.views.OneMeDraweeView) r2
            r2.setVisibility(r1)
        L_0x0282:
            r0.y = r4
            r0.x = r4
            r0.requestLayout()
            r0.invalidate()
            return
        L_0x028d:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r18, (java.lang.Object) r19)
            if (r1 != 0) goto L_0x02a9
            r1 = r19
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r2 = r18
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r2.getClass()
            java.lang.Object r0 = r0.b
            dc9 r0 = (defpackage.dc9) r0
            r0.setVideoMsgButtonVisible(r1)
        L_0x02a9:
            return
        L_0x02aa:
            r1 = r19
            woa r1 = (defpackage.woa) r1
            r2 = r18
            woa r2 = (defpackage.woa) r2
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)
            if (r1 != 0) goto L_0x02bf
            java.lang.Object r0 = r0.b
            cr7 r0 = (defpackage.cr7) r0
            defpackage.cr7.a(r0)
        L_0x02bf:
            return
        L_0x02c0:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r18, (java.lang.Object) r19)
            if (r1 != 0) goto L_0x02ea
            r1 = r19
            bl5 r1 = (defpackage.bl5) r1
            r2 = r18
            bl5 r2 = (defpackage.bl5) r2
            if (r1 == 0) goto L_0x02d3
            p87 r2 = r1.k
            goto L_0x02d4
        L_0x02d3:
            r2 = r4
        L_0x02d4:
            if (r2 != 0) goto L_0x02dc
            if (r1 == 0) goto L_0x02da
            b3g r4 = r1.l
        L_0x02da:
            if (r4 == 0) goto L_0x02e1
        L_0x02dc:
            boolean r1 = r1.m
            if (r1 != 0) goto L_0x02e1
            r5 = r6
        L_0x02e1:
            java.lang.Object r0 = r0.b
            zm5 r0 = (defpackage.zm5) r0
            r0.B0 = r5
            r0.z()
        L_0x02ea:
            return
        L_0x02eb:
            r1 = r19
            scf r1 = (defpackage.scf) r1
            r2 = r18
            scf r2 = (defpackage.scf) r2
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)
            if (r2 != 0) goto L_0x031e
            java.lang.Object r0 = r0.b
            hx3 r0 = (defpackage.hx3) r0
            ex3 r2 = r0.a
            r2.setCustomTheme(r1)
            if (r1 != 0) goto L_0x031b
            android.view.View r1 = r0.getContentView()
            boolean r2 = r1.isInEditMode()
            if (r2 == 0) goto L_0x0311
            vi4 r1 = defpackage.vi4.f0
            goto L_0x031b
        L_0x0311:
            android.content.Context r1 = r1.getContext()
            kotlin.Lazy r2 = defpackage.scf.b0
            scf r1 = defpackage.j4b.k0(r1)
        L_0x031b:
            r0.a(r1)
        L_0x031e:
            return
        L_0x031f:
            r1 = r19
            scf r1 = (defpackage.scf) r1
            r2 = r18
            scf r2 = (defpackage.scf) r2
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)
            if (r2 != 0) goto L_0x0349
            java.lang.Object r0 = r0.b
            ex3 r0 = (defpackage.ex3) r0
            if (r1 != 0) goto L_0x0346
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto L_0x033c
            vi4 r1 = defpackage.vi4.f0
            goto L_0x0346
        L_0x033c:
            android.content.Context r1 = r0.getContext()
            kotlin.Lazy r2 = defpackage.scf.b0
            scf r1 = defpackage.j4b.k0(r1)
        L_0x0346:
            r0.L0(r1)
        L_0x0349:
            return
        L_0x034a:
            r1 = r19
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r2 = r18
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 == r1) goto L_0x0363
            java.lang.Object r0 = r0.b
            l83 r0 = (defpackage.l83) r0
            r0.m()
        L_0x0363:
            return
        L_0x0364:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r18, (java.lang.Object) r19)
            if (r1 != 0) goto L_0x0489
            r1 = r19
            java.util.List r1 = (java.util.List) r1
            r2 = r18
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r2 = r5
        L_0x0379:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0489
            java.lang.Object r3 = r1.next()
            int r7 = r2 + 1
            if (r2 >= 0) goto L_0x038a
            kotlin.collections.CollectionsKt.throwIndexOverflow()
        L_0x038a:
            l43 r3 = (defpackage.l43) r3
            java.lang.Object r8 = r0.b
            q43 r8 = (defpackage.q43) r8
            qr0 r9 = r8.e
            java.lang.Object r10 = r9.b
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r10 = r10.size()
            android.content.Context r11 = r8.a
            if (r10 <= r2) goto L_0x03a5
            mv4 r2 = r9.c(r2)
            q87 r2 = (defpackage.q87) r2
            goto L_0x03c7
        L_0x03a5:
            q87 r2 = new q87
            tp6 r10 = new tp6
            android.content.res.Resources r12 = r11.getResources()
            r10.<init>(r12)
            r10.b = r5
            sp6 r10 = r10.a()
            r2.<init>(r10)
            z7d r10 = r2.e()
            if (r10 == 0) goto L_0x03c4
            android.view.View r12 = r8.b
            r10.setCallback(r12)
        L_0x03c4:
            r9.b(r2)
        L_0x03c7:
            boolean r9 = r3 instanceof defpackage.p87
            if (r9 == 0) goto L_0x03e0
            r10 = r3
            p87 r10 = (defpackage.p87) r10
            boolean r12 = r10.e
            if (r12 == 0) goto L_0x03d5
            android.net.Uri r12 = r10.g
            goto L_0x03dd
        L_0x03d5:
            boolean r12 = r10.j
            if (r12 == 0) goto L_0x03db
            r12 = r4
            goto L_0x03dd
        L_0x03db:
            android.net.Uri r12 = r10.b
        L_0x03dd:
            v3d r10 = r10.h
            goto L_0x03eb
        L_0x03e0:
            boolean r10 = r3 instanceof defpackage.b3g
            if (r10 == 0) goto L_0x0483
            r10 = r3
            b3g r10 = (defpackage.b3g) r10
            android.net.Uri r12 = r10.b
            v3d r10 = r10.i
        L_0x03eb:
            lv4 r13 = r2.o
            r13.getClass()
            sp6 r13 = (defpackage.sp6) r13
            ydd r14 = defpackage.ydd.m
            r13.h(r14)
            ts r14 = r8.j
            if (r9 == 0) goto L_0x041a
            r15 = r3
            p87 r15 = (defpackage.p87) r15
            boolean r15 = r15.j
            if (r15 == 0) goto L_0x0418
            java.lang.Object r15 = r14.get(r2)
            if (r15 != 0) goto L_0x0415
            cob r15 = new cob
            r15.<init>(r11)
            int r11 = defpackage.cad.w0
            r15.a(r11)
            r14.put(r2, r15)
        L_0x0415:
            cob r15 = (defpackage.cob) r15
            goto L_0x042e
        L_0x0418:
            r15 = r4
            goto L_0x042e
        L_0x041a:
            boolean r15 = r3 instanceof defpackage.b3g
            if (r15 == 0) goto L_0x047d
            java.lang.Object r15 = r14.get(r2)
            if (r15 != 0) goto L_0x042c
            cob r15 = new cob
            r15.<init>(r11)
            r14.put(r2, r15)
        L_0x042c:
            cob r15 = (defpackage.cob) r15
        L_0x042e:
            r13.k(r15)
            gv4 r11 = r2.v
            lnb r13 = defpackage.ld9.p
            knb r13 = r13.get()
            r13.l = r11
            r13.k = r6
            p43 r11 = new p43
            r11.<init>(r8, r3)
            r13.h = r11
            if (r12 == 0) goto L_0x0452
            ra7 r8 = defpackage.ra7.d(r12)
            r8.d = r10
            qa7 r8 = r8.a()
            r13.e = r8
        L_0x0452:
            if (r9 == 0) goto L_0x0459
            p87 r3 = (defpackage.p87) r3
            android.net.Uri r3 = r3.g
            goto L_0x0461
        L_0x0459:
            boolean r8 = r3 instanceof defpackage.b3g
            if (r8 == 0) goto L_0x0477
            b3g r3 = (defpackage.b3g) r3
            android.net.Uri r3 = r3.h
        L_0x0461:
            if (r3 == 0) goto L_0x046d
            ra7 r3 = defpackage.ra7.d(r3)
            qa7 r3 = r3.a()
            r13.f = r3
        L_0x046d:
            jnb r3 = r13.a()
            r2.i(r3)
            r2 = r7
            goto L_0x0379
        L_0x0477:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x047d:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0483:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0489:
            return
        L_0x048a:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r18, (java.lang.Object) r19)
            if (r1 != 0) goto L_0x0560
            r1 = r19
            ot1 r1 = (defpackage.ot1) r1
            r1 = r18
            ot1 r1 = (defpackage.ot1) r1
            java.lang.Object r0 = r0.b
            pt1 r0 = (defpackage.pt1) r0
            android.animation.ValueAnimator r1 = r0.o
            if (r1 == 0) goto L_0x04a3
            r1.cancel()
        L_0x04a3:
            android.graphics.Paint r1 = r0.w
            int r9 = r1.getColor()
            ot1 r1 = r0.getType()
            int r1 = r1.ordinal()
            js9 r4 = defpackage.fu4.k
            if (r1 == 0) goto L_0x04e9
            if (r1 == r6) goto L_0x04d6
            if (r1 == r3) goto L_0x04c2
            if (r1 != r2) goto L_0x04bc
            goto L_0x04c2
        L_0x04bc:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04c2:
            android.content.Context r1 = r0.getContext()
            fu4 r1 = r4.e(r1)
            k2b r1 = r1.f()
            s3 r1 = r1.e()
            int r1 = r1.a
        L_0x04d4:
            r10 = r1
            goto L_0x0500
        L_0x04d6:
            android.content.Context r1 = r0.getContext()
            fu4 r1 = r4.e(r1)
            k2b r1 = r1.f()
            fye r1 = r1.h()
            int r1 = r1.a
            goto L_0x04d4
        L_0x04e9:
            android.content.Context r1 = r0.getContext()
            fu4 r1 = r4.e(r1)
            k2b r1 = r1.f()
            fye r1 = r1.h()
            r1.getClass()
            r1 = 1308622847(0x4dffffff, float:5.3687088E8)
            goto L_0x04d4
        L_0x0500:
            float r11 = r0.x
            ot1 r1 = r0.getType()
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x0522
            if (r1 == r6) goto L_0x051f
            if (r1 == r3) goto L_0x051c
            if (r1 != r2) goto L_0x0516
            float r1 = defpackage.pt1.A0
        L_0x0514:
            r12 = r1
            goto L_0x0525
        L_0x0516:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x051c:
            float r1 = defpackage.pt1.z0
            goto L_0x0514
        L_0x051f:
            float r1 = defpackage.pt1.y0
            goto L_0x0514
        L_0x0522:
            float r1 = defpackage.pt1.x0
            goto L_0x0514
        L_0x0525:
            float r13 = r0.y
            ot1 r1 = r0.getType()
            int r1 = r1.ordinal()
            r4 = 0
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L_0x0542
            if (r1 == r6) goto L_0x0542
            if (r1 == r3) goto L_0x0542
            if (r1 != r2) goto L_0x053c
            r14 = r5
            goto L_0x0543
        L_0x053c:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0542:
            r14 = r4
        L_0x0543:
            float[] r1 = new float[r3]
            r1 = {0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = android.animation.ValueAnimator.ofFloat(r1)
            nt1 r2 = new nt1
            r7 = r2
            r8 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r1.addUpdateListener(r2)
            r2 = 200(0xc8, double:9.9E-322)
            r1.setDuration(r2)
            r1.start()
            r0.o = r1
        L_0x0560:
            return
        L_0x0561:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r18, (java.lang.Object) r19)
            if (r1 != 0) goto L_0x0576
            r1 = r19
            u81 r1 = (defpackage.u81) r1
            r1 = r18
            u81 r1 = (defpackage.u81) r1
            java.lang.Object r0 = r0.b
            v81 r0 = (defpackage.v81) r0
            r0.invalidateSelf()
        L_0x0576:
            return
        L_0x0577:
            r1 = r19
            q81 r1 = (defpackage.q81) r1
            r2 = r18
            q81 r2 = (defpackage.q81) r2
            if (r2 == r1) goto L_0x05ac
            java.lang.Object r0 = r0.b
            r81 r0 = (defpackage.r81) r0
            v81 r0 = r0.getBackground()
            if (r0 == 0) goto L_0x05ac
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x059c
            if (r1 != r6) goto L_0x0596
            l7e r1 = defpackage.l7e.c
            goto L_0x059e
        L_0x0596:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x059c:
            l7e r1 = defpackage.l7e.b
        L_0x059e:
            o7e r0 = r0.w
            r0.getClass()
            kotlin.reflect.KProperty[] r2 = defpackage.o7e.y0
            r2 = r2[r5]
            n7e r3 = r0.y
            r3.setValue(r0, r2, r1)
        L_0x05ac:
            return
        L_0x05ad:
            r2 = r19
            og0 r2 = (defpackage.og0) r2
            r4 = r18
            og0 r4 = (defpackage.og0) r4
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r2)
            if (r4 != 0) goto L_0x063b
            java.lang.Object r0 = r0.b
            ru.ok.utils.widgets.BadgeCountView r0 = (ru.ok.utils.widgets.BadgeCountView) r0
            if (r2 != 0) goto L_0x05c5
            r0.setVisibility(r1)
            goto L_0x063b
        L_0x05c5:
            kotlin.reflect.KProperty[] r1 = ru.ok.utils.widgets.BadgeCountView.x0
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            if (r1 == 0) goto L_0x0633
            boolean r4 = r0.x
            int r5 = r2.b
            if (r4 != 0) goto L_0x05e8
            android.content.Context r3 = r0.getContext()
            android.content.res.Resources r3 = r3.getResources()
            float r4 = (float) r5
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r4 = r4 * r3
            int r3 = kotlin.math.MathKt.roundToInt((float) r4)
            goto L_0x060b
        L_0x05e8:
            float r3 = (float) r3
            android.content.res.Resources r4 = defpackage.vo4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            int r3 = defpackage.g63.b(r3, r4, r5)
            android.content.Context r4 = r0.getContext()
            android.content.res.Resources r4 = r4.getResources()
            float r3 = (float) r3
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r3 = r3 * r4
            int r3 = kotlin.math.MathKt.roundToInt((float) r3)
        L_0x060b:
            r1.width = r3
            android.content.Context r3 = r0.getContext()
            android.content.res.Resources r3 = r3.getResources()
            int r4 = r2.c
            float r4 = (float) r4
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r4 = r4 * r3
            int r3 = kotlin.math.MathKt.roundToInt((float) r4)
            r1.height = r3
            r0.setLayoutParams(r1)
            android.graphics.drawable.Drawable r1 = r2.a
            r0.setBackground(r1)
            float r1 = r2.d
            r0.setTextSize(r1)
            goto L_0x063b
        L_0x0633:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            r0.<init>(r1)
            throw r0
        L_0x063b:
            return
        L_0x063c:
            r1 = r19
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            r3 = r18
            java.lang.Number r3 = (java.lang.Number) r3
            long r5 = r3.longValue()
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x065d
            java.lang.Object r0 = r0.b
            d60 r0 = (defpackage.d60) r0
            pm7 r1 = r0.w
            if (r1 == 0) goto L_0x065b
            r1.b(r4)
        L_0x065b:
            r0.w = r4
        L_0x065d:
            return
        L_0x065e:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r18, (java.lang.Object) r19)
            if (r1 != 0) goto L_0x06a7
            r1 = r19
            xk r1 = (defpackage.xk) r1
            r2 = r18
            xk r2 = (defpackage.xk) r2
            java.lang.Object r2 = r0.b
            cl r2 = (defpackage.cl) r2
            java.lang.String r2 = r2.y
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x0677
            goto L_0x0690
        L_0x0677:
            boolean r5 = r3.c()
            if (r5 == 0) goto L_0x0690
            w78 r5 = defpackage.w78.o
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "state = "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            r3.d(r5, r2, r1, r4)
        L_0x0690:
            java.lang.Object r1 = r0.b
            cl r1 = (defpackage.cl) r1
            r1.d()
            java.lang.Object r1 = r0.b
            cl r1 = (defpackage.cl) r1
            r1.d()
            java.lang.Object r0 = r0.b
            cl r0 = (defpackage.cl) r0
            xf r1 = r0.z
            r1.invalidateDrawable(r0)
        L_0x06a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.afterChange(kotlin.reflect.KProperty, java.lang.Object, java.lang.Object):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bl(int i, Object obj, Object obj2) {
        super(obj);
        this.a = i;
        this.b = obj2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bl(defpackage.cl r2) {
        /*
            r1 = this;
            r0 = 0
            r1.a = r0
            xk r0 = defpackage.xk.a
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.<init>(cl):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bl(defpackage.r81 r2) {
        /*
            r1 = this;
            r0 = 3
            r1.a = r0
            q81 r0 = defpackage.q81.a
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.<init>(r81):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bl(defpackage.v81 r2) {
        /*
            r1 = this;
            r0 = 4
            r1.a = r0
            u81 r0 = defpackage.u81.b
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.<init>(v81):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bl(defpackage.pt1 r2) {
        /*
            r1 = this;
            r0 = 5
            r1.a = r0
            ot1 r0 = defpackage.ot1.a
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.<init>(pt1):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bl(l83 l83) {
        super(0);
        this.a = 7;
        this.b = l83;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bl(defpackage.dc9 r2) {
        /*
            r1 = this;
            r0 = 12
            r1.a = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.<init>(dc9):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bl(defpackage.sc9 r2) {
        /*
            r1 = this;
            r0 = 13
            r1.a = r0
            qc9 r0 = defpackage.qc9.a
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.<init>(sc9):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bl(defpackage.m7a r2) {
        /*
            r1 = this;
            r0 = 16
            r1.a = r0
            r0 = 0
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.<init>(m7a):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bl(defpackage.hna r2) {
        /*
            r1 = this;
            r0 = 17
            r1.a = r0
            gna r0 = defpackage.gna.a
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.<init>(hna):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bl(defpackage.ita r2) {
        /*
            r1 = this;
            r0 = 19
            r1.a = r0
            hta r0 = defpackage.hta.a
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.<init>(ita):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bl(defpackage.fpc r2) {
        /*
            r1 = this;
            r0 = 22
            r1.a = r0
            epc r0 = defpackage.epc.a
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.<init>(fpc):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bl(defpackage.pqc r2) {
        /*
            r1 = this;
            r0 = 23
            r1.a = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.<init>(pqc):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bl(defpackage.e7e r2) {
        /*
            r1 = this;
            r0 = 24
            r1.a = r0
            d7e r0 = defpackage.d7e.b
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.<init>(e7e):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bl(defpackage.pee r2) {
        /*
            r1 = this;
            r0 = 27
            r1.a = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.<init>(pee):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bl(defpackage.xle r2) {
        /*
            r1 = this;
            r0 = 28
            r1.a = r0
            vle r0 = defpackage.vle.a
            r1.b = r2
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bl.<init>(xle):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bl(MultiImageToggleButton multiImageToggleButton) {
        super(0);
        this.a = 15;
        this.b = multiImageToggleButton;
    }
}
