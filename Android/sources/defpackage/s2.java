package defpackage;

import android.os.Bundle;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import one.me.sdk.arch.Widget;

/* renamed from: s2  reason: default package */
public final /* synthetic */ class s2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: u21} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v91, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: eq3} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v1, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r11v2 */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v8 */
    /* JADX WARNING: type inference failed for: r11v9 */
    /* JADX WARNING: type inference failed for: r11v12 */
    /* JADX WARNING: type inference failed for: r11v13 */
    /* JADX WARNING: type inference failed for: r11v15 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r26 = this;
            r0 = r26
            r1 = 4
            r2 = -2
            r3 = 6
            r4 = 3
            java.lang.String r5 = ":call-join-preview?link="
            r6 = 14
            java.lang.String r7 = ""
            r8 = 2
            r9 = 0
            r10 = 1
            r11 = 0
            java.lang.Object r12 = r0.c
            java.lang.Object r13 = r0.b
            int r0 = r0.a
            switch(r0) {
                case 0: goto L_0x05eb;
                case 1: goto L_0x05dc;
                case 2: goto L_0x05ca;
                case 3: goto L_0x0577;
                case 4: goto L_0x055e;
                case 5: goto L_0x0554;
                case 6: goto L_0x04fc;
                case 7: goto L_0x048c;
                case 8: goto L_0x0416;
                case 9: goto L_0x03ab;
                case 10: goto L_0x0363;
                case 11: goto L_0x032d;
                case 12: goto L_0x0272;
                case 13: goto L_0x0250;
                case 14: goto L_0x0247;
                case 15: goto L_0x023e;
                case 16: goto L_0x021f;
                case 17: goto L_0x01dc;
                case 18: goto L_0x01ce;
                case 19: goto L_0x015d;
                case 20: goto L_0x0134;
                case 21: goto L_0x00f5;
                case 22: goto L_0x00d4;
                case 23: goto L_0x00b3;
                case 24: goto L_0x0095;
                case 25: goto L_0x0085;
                case 26: goto L_0x004d;
                case 27: goto L_0x0033;
                default: goto L_0x0019;
            }
        L_0x0019:
            su3 r13 = (defpackage.su3) r13
            km3 r0 = r13.b
            java.util.List r0 = r0.s()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toMutableList(r0)
            kotlin.Lazy r12 = (kotlin.Lazy) r12
            java.lang.Object r1 = r12.getValue()
            ns3 r1 = (defpackage.ns3) r1
            r1.b(r0)
            return r0
        L_0x0033:
            su3 r13 = (defpackage.su3) r13
            km3 r0 = r13.b
            java.util.List r0 = r0.s()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r0 = kotlin.collections.CollectionsKt.toMutableList(r0)
            kotlin.Lazy r12 = (kotlin.Lazy) r12
            java.lang.Object r1 = r12.getValue()
            ns3 r1 = (defpackage.ns3) r1
            r1.b(r0)
            return r0
        L_0x004d:
            kotlin.reflect.KProperty[] r0 = one.me.contactlist.ContactListWidget.N0
            yh0 r0 = defpackage.yh0.a
            q4 r0 = r0.getAccessor()
            java.lang.Class<wu3> r1 = defpackage.wu3.class
            kotlin.Lazy r0 = r0.h(r1)
            android.os.Bundle r12 = (android.os.Bundle) r12
            if (r12 == 0) goto L_0x0066
            java.lang.String r1 = "contact_screen_open_mode"
            java.lang.String r1 = r12.getString(r1)
            goto L_0x0067
        L_0x0066:
            r1 = r11
        L_0x0067:
            if (r1 != 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r7 = r1
        L_0x006b:
            eq3 r11 = defpackage.eq3.valueOf(r7)     // Catch:{ IllegalArgumentException -> 0x006f }
        L_0x006f:
            if (r11 != 0) goto L_0x0073
            eq3 r11 = defpackage.eq3.b
        L_0x0073:
            eq3 r1 = defpackage.eq3.a
            if (r11 != r1) goto L_0x0078
            r9 = r10
        L_0x0078:
            wh0 r1 = new wh0
            zp3 r2 = new zp3
            one.me.contactlist.ContactListWidget r13 = (one.me.contactlist.ContactListWidget) r13
            r2.<init>(r13, r10)
            r1.<init>(r0, r9, r2, r6)
            return r1
        L_0x0085:
            zo3 r12 = (defpackage.zo3) r12
            long r0 = r12.a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            r13.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0095:
            j2b r0 = new j2b
            nm1 r1 = new nm1
            et0 r13 = (defpackage.et0) r13
            r1.<init>(r6, r13)
            kotlin.Lazy r1 = kotlin.LazyKt.lazy(r1)
            oq2 r2 = new oq2
            r3 = 25
            r2.<init>(r3)
            kotlin.Lazy r2 = kotlin.LazyKt.lazy(r2)
            android.content.Context r12 = (android.content.Context) r12
            r0.<init>(r1, r12, r11, r2)
            return r0
        L_0x00b3:
            kotlin.reflect.KProperty[] r0 = one.me.chats.tab.ChatsTabWidget.z0
            one.me.chats.tab.ChatsTabWidget r13 = (one.me.chats.tab.ChatsTabWidget) r13
            w86 r0 = r13.f0()
            woa r12 = (defpackage.woa) r12
            java.lang.String r1 = r12.a
            jx3 r2 = r0.a
            gaf r3 = r0.b
            osa r3 = (defpackage.osa) r3
            q04 r3 = r3.a()
            q86 r4 = new q86
            r4.<init>(r0, r1, r11)
            defpackage.ev0.v(r2, r3, r11, r4, r8)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00d4:
            tw2 r13 = (defpackage.tw2) r13
            s85 r0 = r13.K0
            ox2 r1 = defpackage.ox2.b
            kx7 r12 = (defpackage.kx7) r12
            gx7 r12 = (defpackage.gx7) r12
            java.lang.String r2 = r12.a
            r1.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.a81.r(r1, r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00f5:
            kotlin.reflect.KProperty[] r0 = one.me.startconversation.chattitleicon.ChatTitleIconScreen.x0
            fr2 r0 = new fr2
            one.me.startconversation.chattitleicon.ChatTitleIconScreen r13 = (one.me.startconversation.chattitleicon.ChatTitleIconScreen) r13
            r13.getClass()
            kotlin.reflect.KProperty[] r1 = one.me.startconversation.chattitleicon.ChatTitleIconScreen.x0
            r1 = r1[r9]
            is r1 = r13.c
            java.lang.Object r1 = r1.a(r13)
            long[] r1 = (long[]) r1
            android.os.Bundle r12 = (android.os.Bundle) r12
            java.lang.String r2 = "create_type"
            java.lang.Class<zke> r3 = defpackage.zke.class
            java.lang.Object r2 = defpackage.n54.k(r12, r2, r3)
            if (r2 == 0) goto L_0x011e
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            zke r2 = (defpackage.zke) r2
            r0.<init>(r1, r2)
            return r0
        L_0x011e:
            java.lang.String r0 = r3.getSimpleName()
            java.lang.String r1 = "No value passed for key create_type of type "
            java.lang.String r2 = " in bundle"
            java.lang.String r0 = defpackage.wj6.k(r1, r0, r2)
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x0134:
            kotlin.reflect.KProperty[] r0 = one.me.chatscreen.ChatScreen.d1
            mg9 r13 = (defpackage.mg9) r13
            lg9 r0 = r13.b
            int r0 = r0.ordinal()
            one.me.chatscreen.ChatScreen r12 = (one.me.chatscreen.ChatScreen) r12
            if (r0 == r10) goto L_0x014d
            if (r0 == r8) goto L_0x0145
            goto L_0x015a
        L_0x0145:
            mh9 r0 = r12.q0()
            defpackage.mh9.n(r0, r9, r9, r4)
            goto L_0x015a
        L_0x014d:
            one.me.sdk.messagewrite.MessageWriteWidget r0 = r12.r0()
            if (r0 == 0) goto L_0x015a
            dc9 r0 = r0.d0()
            r0.e(r10)
        L_0x015a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x015d:
            dl2 r13 = (defpackage.dl2) r13
            r13.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getFcmHistory: chats="
            r0.<init>(r1)
            java.util.Set r12 = (java.util.Set) r12
            r0.append(r12)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = defpackage.dl2.i
            defpackage.z68.c(r1, r0, new java.lang.Object[0])
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x0182
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x01cd
        L_0x0182:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x01b5 }
            kotlin.reflect.KProperty[] r0 = defpackage.dl2.h     // Catch:{ all -> 0x01b5 }
            r0 = r0[r8]     // Catch:{ all -> 0x01b5 }
            hs7 r0 = r13.c     // Catch:{ all -> 0x01b5 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01b5 }
            qj5 r0 = (defpackage.qj5) r0     // Catch:{ all -> 0x01b5 }
            java.util.List r1 = kotlin.collections.CollectionsKt.toList(r12)     // Catch:{ all -> 0x01b5 }
            j6d r0 = r0.a     // Catch:{ all -> 0x01b5 }
            mka r0 = r0.n()     // Catch:{ all -> 0x01b5 }
            v02 r2 = defpackage.v02.c     // Catch:{ all -> 0x01b5 }
            wbe r0 = r0.i(r2)     // Catch:{ all -> 0x01b5 }
            ej5 r2 = new ej5     // Catch:{ all -> 0x01b5 }
            r2.<init>(r10, r1)     // Catch:{ all -> 0x01b5 }
            wbe r1 = new wbe     // Catch:{ all -> 0x01b5 }
            r1.<init>(r0, r2, r9)     // Catch:{ all -> 0x01b5 }
            java.lang.Object r0 = r1.f()     // Catch:{ all -> 0x01b5 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x01b5 }
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)     // Catch:{ all -> 0x01b5 }
            goto L_0x01c0
        L_0x01b5:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m23constructorimpl(r0)
        L_0x01c0:
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            boolean r2 = kotlin.Result.m29isFailureimpl(r0)
            if (r2 == 0) goto L_0x01cb
            r0 = r1
        L_0x01cb:
            java.util.List r0 = (java.util.List) r0
        L_0x01cd:
            return r0
        L_0x01ce:
            wc2 r0 = new wc2
            jtb r12 = (defpackage.jtb) r12
            ltb r12 = (defpackage.ltb) r12
            vj5 r1 = r12.e
            j89 r13 = (defpackage.j89) r13
            r0.<init>(r13, r1)
            return r0
        L_0x01dc:
            ru.ok.messages.views.widgets.VideoInfoTextView r0 = new ru.ok.messages.views.widgets.VideoInfoTextView
            android.content.Context r13 = (android.content.Context) r13
            r0.<init>(r13, r11, r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r3.<init>(r2, r2)
            r2 = 8388693(0x800055, float:1.1755063E-38)
            r3.gravity = r2
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            r3.setMarginEnd(r2)
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            r3.bottomMargin = r1
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            android.view.ViewParent r1 = r0.getParent()
            if (r1 != 0) goto L_0x021e
            pf2 r12 = (defpackage.pf2) r12
            r12.addView(r0, r3)
        L_0x021e:
            return r0
        L_0x021f:
            one.me.sdk.richvector.EnhancedVectorDrawable r0 = new one.me.sdk.richvector.EnhancedVectorDrawable
            int r1 = defpackage.cad.I
            android.content.Context r13 = (android.content.Context) r13
            r0.<init>((android.content.Context) r13, (int) r1)
            js9 r1 = defpackage.fu4.k
            i42 r12 = (defpackage.i42) r12
            k2b r1 = r1.f(r12)
            ene r1 = r1.b()
            fne r1 = r1.b
            int r1 = r1.c
            java.lang.String r2 = "error"
            defpackage.hi7.Y(r0, r2, r1)
            return r0
        L_0x023e:
            android.content.Context r13 = (android.content.Context) r13
            tl1 r12 = (defpackage.tl1) r12
            android.view.View r0 = defpackage.tl1.L(r13, r12)
            return r0
        L_0x0247:
            rk1 r13 = (defpackage.rk1) r13
            gd8 r12 = (defpackage.gd8) r12
            kotlin.Unit r0 = defpackage.rk1.L(r13, r12)
            return r0
        L_0x0250:
            gn1 r0 = new gn1
            android.content.Context r13 = (android.content.Context) r13
            r0.<init>(r13, r11)
            android.view.ViewGroup$LayoutParams r1 = new android.view.ViewGroup$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            en1 r1 = defpackage.en1.c
            r0.setMode(r1)
            j6 r1 = new j6
            rf1 r12 = (defpackage.rf1) r12
            r2 = 26
            r1.<init>(r2, r12)
            r0.setVideoLayoutUpdatesControllerProvider(r1)
            return r0
        L_0x0272:
            xd1 r13 = (defpackage.xd1) r13
            u6h r0 = r13.D0
            if (r0 == 0) goto L_0x032a
            sd1 r12 = (defpackage.sd1) r12
            ze1 r1 = r12.a
            r13.q()
            kotlin.reflect.KProperty[] r2 = one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget.B0
            java.lang.Object r0 = r0.b
            one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget r0 = (one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget) r0
            he1 r2 = r0.f0()
            kotlin.reflect.KProperty[] r3 = defpackage.he1.x0
            r2.getClass()
            ze1 r3 = defpackage.ze1.c
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r3 != 0) goto L_0x02c5
            ap1 r2 = r2.o
            dp1 r3 = r2.a
            mp1 r3 = (defpackage.mp1) r3
            xme r3 = r3.K
            java.lang.Object r3 = r3.getValue()
            s44 r3 = (defpackage.s44) r3
            boolean r3 = r3.h
            if (r3 != 0) goto L_0x02a9
            goto L_0x02c5
        L_0x02a9:
            etc r3 = r2.m
            ome r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            zm1 r3 = (defpackage.zm1) r3
            ze1 r3 = r3.a
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r1)
            h9b r2 = r2.d
            v9b r2 = (defpackage.v9b) r2
            y8b r2 = r2.c()
            u21 r11 = defpackage.ld8.j0(r1, r3, r2, r11)
        L_0x02c5:
            if (r11 == 0) goto L_0x032a
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>(r9, r9)
            android.view.View r2 = r13.a
            if (r2 == 0) goto L_0x02fd
            int[] r3 = new int[r8]
            r2.getLocationOnScreen(r3)
            android.content.Context r4 = r0.getContext()
            int r4 = defpackage.hi7.v(r4)
            r5 = r3[r9]
            int r4 = r4 - r5
            int r2 = r2.getWidth()
            int r2 = r2 / r8
            int r4 = r4 - r2
            r2 = 18
            float r2 = (float) r2
            android.content.res.Resources r5 = defpackage.vo4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            int r2 = defpackage.a81.e(r2, r5, r4)
            r3 = r3[r10]
            r1.x = r2
            r1.y = r3
        L_0x02fd:
            ix3 r2 = defpackage.ix3.a
            lw3 r2 = defpackage.m58.b(r2)
            lw3 r2 = r2.f()
            android.os.Bundle r3 = r11.a
            lw3 r2 = r2.m(r3)
            lw3 r2 = r2.d()
            int r3 = r1.x
            float r3 = (float) r3
            int r1 = r1.y
            float r1 = (float) r1
            lw3 r1 = r2.i(r3, r1)
            java.util.List r2 = r11.b
            java.util.Collection r2 = (java.util.Collection) r2
            lw3 r1 = r1.h(r2)
            mw3 r1 = r1.build()
            r1.o(r0)
        L_0x032a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x032d:
            kotlin.reflect.KProperty[] r0 = one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet.v0
            java.lang.String r0 = "open_type"
            java.lang.String r1 = "UNDEFINE"
            android.os.Bundle r12 = (android.os.Bundle) r12
            java.lang.String r0 = r12.getString(r0, r1)
            cd1 r0 = defpackage.cd1.valueOf(r0)
            one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet r13 = (one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet) r13
            kotlin.Lazy r1 = r13.y
            java.lang.Object r1 = r1.getValue()
            ph1 r1 = (defpackage.ph1) r1
            oh1 r2 = defpackage.oh1.a
            q4 r3 = r2.getAccessor()
            java.lang.Class<ahd> r4 = defpackage.ahd.class
            kotlin.Lazy r3 = r3.h(r4)
            q4 r2 = r2.getAccessor()
            java.lang.Class<hl1> r4 = defpackage.hl1.class
            kotlin.Lazy r2 = r2.h(r4)
            gd1 r4 = new gd1
            r4.<init>(r0, r1, r2, r3)
            return r4
        L_0x0363:
            dc1 r13 = (defpackage.dc1) r13
            etc r0 = r13.y
            ome r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            tb1 r0 = (defpackage.tb1) r0
            boolean r0 = r0.i
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            s85 r1 = r13.z
            if (r0 == 0) goto L_0x0392
            b71 r0 = defpackage.b71.b
            java.lang.String r2 = r12.toString()
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = ":call-join-link?link="
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
        L_0x038e:
            defpackage.a81.r(r0, r1)
            goto L_0x03a8
        L_0x0392:
            b71 r0 = defpackage.b71.b
            java.lang.String r2 = r12.toString()
            r0.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L_0x038e
        L_0x03a8:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x03ab:
            kotlin.reflect.KProperty[] r0 = one.me.calllist.ui.callinfo.CallLinkInfoScreen.z0
            android.os.Bundle r12 = (android.os.Bundle) r12
            if (r12 == 0) goto L_0x03c4
            java.lang.String r0 = "id_param"
            boolean r2 = r12.containsKey(r0)
            if (r2 != r10) goto L_0x03c4
            long r2 = r12.getLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r16 = r0
            goto L_0x03c6
        L_0x03c4:
            r16 = r11
        L_0x03c6:
            if (r12 == 0) goto L_0x03ce
            java.lang.String r0 = "is_link_call"
            boolean r9 = r12.getBoolean(r0)
        L_0x03ce:
            r15 = r9
            if (r12 == 0) goto L_0x03da
            java.lang.String r0 = "link_param"
            java.lang.String r0 = r12.getString(r0, r11)
            r17 = r0
            goto L_0x03dc
        L_0x03da:
            r17 = r11
        L_0x03dc:
            if (r12 == 0) goto L_0x03e4
            java.lang.String r0 = "title_param"
            java.lang.String r11 = r12.getString(r0, r11)
        L_0x03e4:
            r18 = r11
            npg r0 = new npg
            one.me.calllist.ui.callinfo.CallLinkInfoScreen r13 = (one.me.calllist.ui.callinfo.CallLinkInfoScreen) r13
            android.content.Context r2 = r13.getContext()
            r0.<init>((android.content.Context) r2, (int) r1)
            kotlin.Lazy r1 = defpackage.rjd.a
            qpg r1 = new qpg
            kotlin.Lazy r2 = r13.a
            r1.<init>((kotlin.Lazy) r2)
            wp1 r3 = new wp1
            r3.<init>(r2)
            kotlin.Lazy r2 = r13.w
            java.lang.Object r2 = r2.getValue()
            r22 = r2
            lf1 r22 = (defpackage.lf1) r22
            dc1 r2 = new dc1
            r14 = r2
            r19 = r0
            r20 = r1
            r21 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            return r2
        L_0x0416:
            kotlin.reflect.KProperty[] r0 = one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget.z0
            java.lang.String r0 = "call_join_link"
            android.os.Bundle r12 = (android.os.Bundle) r12
            java.lang.String r2 = r12.getString(r0)
            if (r2 == 0) goto L_0x0480
            one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget r13 = (one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget) r13
            qcb r5 = r13.b
            tvb r3 = new tvb
            kotlin.Lazy r0 = defpackage.rjd.a
            sjd r0 = defpackage.sjd.a
            q4 r0 = r0.getAccessor()
            java.lang.Class<x23> r1 = defpackage.x23.class
            kotlin.Lazy r0 = r0.h(r1)
            r3.<init>(r0)
            oh1 r0 = defpackage.oh1.a
            q4 r1 = r0.getAccessor()
            java.lang.Class<rp1> r4 = defpackage.rp1.class
            kotlin.Lazy r7 = r1.h(r4)
            q4 r1 = r0.getAccessor()
            java.lang.Class<rl> r4 = defpackage.rl.class
            kotlin.Lazy r6 = r1.h(r4)
            q4 r1 = r0.getAccessor()
            java.lang.Class<gaf> r4 = defpackage.gaf.class
            kotlin.Lazy r8 = r1.h(r4)
            q4 r1 = r0.getAccessor()
            java.lang.Class<tq1> r4 = defpackage.tq1.class
            kotlin.Lazy r9 = r1.h(r4)
            q4 r1 = r0.getAccessor()
            java.lang.Class<eu3> r4 = defpackage.eu3.class
            kotlin.Lazy r10 = r1.h(r4)
            q4 r0 = r0.getAccessor()
            java.lang.Class<is9> r1 = defpackage.is9.class
            kotlin.Lazy r11 = r0.h(r1)
            ya1 r0 = new ya1
            eng r4 = r13.a
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0480:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x048c:
            u9a r0 = one.me.calls.ui.ui.incoming.CallIncomingScreen.x
            android.os.Bundle r12 = (android.os.Bundle) r12
            java.lang.String r0 = "call_incoming_chat_id"
            long r16 = r12.getLong(r0)
            java.lang.String r0 = "call_incoming_name"
            java.lang.String r18 = r12.getString(r0, r7)
            java.lang.String r0 = "call_incoming_avatar"
            java.lang.String r19 = r12.getString(r0)
            java.lang.String r0 = "call_incoming_video"
            boolean r15 = r12.getBoolean(r0)
            m21 r0 = defpackage.m21.a
            q4 r1 = r0.getAccessor()
            java.lang.Class<a21> r2 = defpackage.a21.class
            java.lang.Object r1 = r1.g(r2)
            r20 = r1
            a21 r20 = (defpackage.a21) r20
            one.me.calls.ui.ui.incoming.CallIncomingScreen r13 = (one.me.calls.ui.ui.incoming.CallIncomingScreen) r13
            dp1 r1 = r13.a
            q4 r2 = r0.getAccessor()
            java.lang.Class<dq1> r3 = defpackage.dq1.class
            java.lang.Object r2 = r2.g(r3)
            r22 = r2
            dq1 r22 = (defpackage.dq1) r22
            oh1 r2 = defpackage.oh1.a
            q4 r2 = r2.getAccessor()
            java.lang.Class<yva> r3 = defpackage.yva.class
            java.lang.Object r2 = r2.g(r3)
            r23 = r2
            yva r23 = (defpackage.yva) r23
            hl1 r2 = new hl1
            android.content.Context r3 = r13.getContext()
            r2.<init>(r3)
            q4 r0 = r0.getAccessor()
            java.lang.Class<m01> r3 = defpackage.m01.class
            java.lang.Object r0 = r0.g(r3)
            r25 = r0
            m01 r25 = (defpackage.m01) r25
            h81 r0 = new h81
            r14 = r0
            r21 = r1
            r24 = r2
            r14.<init>(r15, r16, r18, r19, r20, r21, r22, r23, r24, r25)
            return r0
        L_0x04fc:
            android.widget.TextView r0 = new android.widget.TextView
            android.content.Context r13 = (android.content.Context) r13
            r0.<init>(r13)
            fj3 r1 = new fj3
            r1.<init>(r2, r2)
            r0.setLayoutParams(r1)
            ogf r1 = defpackage.puf.u
            r1.b(r0, defpackage.uy4.b)
            xef r1 = defpackage.l2b.i
            int r1 = r1.f
            r0.setTextColor(r1)
            r0.setMaxLines(r10)
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r0.setEllipsize(r1)
            int r1 = defpackage.sqa.H
            r0.setText(r1)
            int r1 = defpackage.pqa.l
            android.graphics.drawable.Drawable r1 = defpackage.ew3.b(r13, r1)
            java.util.ArrayList r2 = defpackage.wgf.a
            r0.setCompoundDrawablesRelativeWithIntrinsicBounds(r1, r11, r11, r11)
            r1 = 8
            r0.setVisibility(r1)
            float r1 = (float) r3
            android.content.res.Resources r2 = defpackage.vo4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = kotlin.math.MathKt.roundToInt((float) r1)
            r0.setPadding(r1, r1, r1, r1)
            x4 r1 = new x4
            a61 r12 = (defpackage.a61) r12
            r2 = 12
            r1.<init>((int) r2, (java.lang.Object) r12)
            defpackage.ct.G(r0, 300, r1)
            return r0
        L_0x0554:
            s21 r13 = (defpackage.s21) r13
            d8 r12 = (defpackage.d8) r12
            r13.i(r12)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x055e:
            fbf r12 = (defpackage.fbf) r12
            java.lang.Object r0 = r12.b
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L_0x0567
            r11 = r0
        L_0x0567:
            android.content.Context r0 = r11.getContext()
            kotlin.jvm.functions.Function1 r13 = (kotlin.jvm.functions.Function1) r13
            java.lang.Object r0 = r13.invoke(r0)
            android.view.View r0 = (android.view.View) r0
            r12.X(r0)
            return r0
        L_0x0577:
            h90 r12 = (defpackage.h90) r12
            kotlin.Lazy r0 = r12.b
            java.lang.Object r0 = r0.getValue()
            jtb r0 = (defpackage.jtb) r0
            ltb r0 = (defpackage.ltb) r0
            cud r0 = r0.b
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r1 = ru.ok.tamtam.android.prefs.PmsKey.f22chatvideoautoplayparallelcount
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            java.util.List r0 = r0.o(r1, r2)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x059b
            int[] r0 = defpackage.bud.d
            goto L_0x05a1
        L_0x059b:
            java.util.Collection r0 = (java.util.Collection) r0
            int[] r0 = kotlin.collections.CollectionsKt.toIntArray(r0)
        L_0x05a1:
            ccb r13 = (defpackage.ccb) r13
            r13.getClass()
            int r1 = r0.length
            if (r1 >= r4) goto L_0x05ab
            int[] r0 = defpackage.bud.d
        L_0x05ab:
            kn4 r1 = r13.a
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x05c3
            if (r1 == r10) goto L_0x05c0
            if (r1 != r8) goto L_0x05ba
            r0 = r0[r8]
            goto L_0x05c5
        L_0x05ba:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x05c0:
            r0 = r0[r10]
            goto L_0x05c5
        L_0x05c3:
            r0 = r0[r9]
        L_0x05c5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x05ca:
            a28 r0 = new a28
            as r12 = (defpackage.as) r12
            kotlin.Lazy r1 = r12.z0
            java.lang.Object r1 = r1.getValue()
            n28 r1 = (defpackage.n28) r1
            kotlin.Lazy r13 = (kotlin.Lazy) r13
            r0.<init>(r13, r1)
            return r0
        L_0x05dc:
            nzf r0 = new nzf
            android.content.Context r13 = (android.content.Context) r13
            r0.<init>(r13)
            cl r12 = (defpackage.cl) r12
            xf r1 = r12.z
            r0.setCallback(r1)
            return r0
        L_0x05eb:
            kotlin.reflect.KProperty[] r0 = one.me.chats.picker.AbstractPickerScreen.x
            vhb r0 = new vhb
            android.os.Bundle r12 = (android.os.Bundle) r12
            one.me.chats.picker.AbstractPickerScreen r13 = (one.me.chats.picker.AbstractPickerScreen) r13
            java.util.Set r1 = r13.m0(r12)
            ojb r2 = r13.d0()
            ukb r3 = r13.g0()
            cs2 r4 = defpackage.cs2.a
            gaf r4 = r4.e()
            r0.<init>(r1, r2, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s2.invoke():java.lang.Object");
    }

    public /* synthetic */ s2(su3 su3) {
        this.a = 28;
        Lazy lazy = rjd.i0;
        this.b = su3;
        this.c = lazy;
    }

    public /* synthetic */ s2(Bundle bundle, Widget widget, int i) {
        this.a = i;
        this.c = bundle;
        this.b = widget;
    }
}
