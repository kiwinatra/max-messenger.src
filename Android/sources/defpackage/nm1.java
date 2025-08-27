package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: nm1  reason: default package */
public final /* synthetic */ class nm1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nm1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: org.json.JSONObject} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v8, types: [cx3] */
    /* JADX WARNING: type inference failed for: r6v11, types: [cx3] */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r6v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r45 = this;
            r0 = r45
            r1 = 3
            r2 = 2
            r3 = 0
            r4 = 6
            r5 = 1
            r6 = 0
            int r7 = r0.a
            switch(r7) {
                case 0: goto L_0x05a0;
                case 1: goto L_0x0594;
                case 2: goto L_0x057e;
                case 3: goto L_0x0555;
                case 4: goto L_0x053e;
                case 5: goto L_0x04f9;
                case 6: goto L_0x04c0;
                case 7: goto L_0x0461;
                case 8: goto L_0x040d;
                case 9: goto L_0x03fd;
                case 10: goto L_0x03db;
                case 11: goto L_0x03d2;
                case 12: goto L_0x01e1;
                case 13: goto L_0x015d;
                case 14: goto L_0x0158;
                case 15: goto L_0x0136;
                case 16: goto L_0x0125;
                case 17: goto L_0x011c;
                case 18: goto L_0x0106;
                case 19: goto L_0x00db;
                case 20: goto L_0x00a6;
                case 21: goto L_0x0071;
                case 22: goto L_0x0068;
                case 23: goto L_0x0063;
                case 24: goto L_0x005a;
                case 25: goto L_0x0046;
                case 26: goto L_0x0036;
                case 27: goto L_0x002c;
                case 28: goto L_0x0016;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.Object r0 = r0.b
            one.me.sdk.richvector.EnhancedAnimatedVectorDrawable r0 = (one.me.sdk.richvector.EnhancedAnimatedVectorDrawable) r0
            d75 r0 = one.me.sdk.richvector.EnhancedAnimatedVectorDrawable.animatorListener_delegate$lambda$0(r0)
            return r0
        L_0x0016:
            java.lang.Object r0 = r0.b
            n35 r0 = (defpackage.n35) r0
            float r1 = r0.a()
            float r0 = r0.a()
            r2 = 11
            float r2 = (float) r2
            float r0 = r0 / r2
            float r0 = r0 + r1
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L_0x002c:
            java.lang.Object r0 = r0.b
            nr4 r0 = (defpackage.nr4) r0
            r0.d()
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0036:
            java.lang.Object r0 = r0.b
            fn4 r0 = (defpackage.fn4) r0
            jtb r0 = r0.b
            ltb r0 = (defpackage.ltb) r0
            cud r0 = r0.b
            r0.getClass()
            ej r0 = defpackage.ej.a
            return r0
        L_0x0046:
            java.io.File r1 = new java.io.File
            java.lang.Object r0 = r0.b
            dm4 r0 = (defpackage.dm4) r0
            java.lang.Object r0 = r0.b
            android.content.Context r0 = (android.content.Context) r0
            java.io.File r0 = r0.getCacheDir()
            java.lang.String r2 = "lottie_network_cache"
            r1.<init>(r0, r2)
            return r1
        L_0x005a:
            java.lang.Object r0 = r0.b
            a94 r0 = (defpackage.a94) r0
            r0.b = r5
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0063:
            java.lang.Object r0 = r0.b
            cya r0 = (defpackage.cya) r0
            return r0
        L_0x0068:
            java.lang.Object r0 = r0.b
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore r0 = (ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore) r0
            zwd r0 = r0.getActiveRoomId()
            return r0
        L_0x0071:
            kotlin.reflect.KProperty[] r1 = one.me.sdk.contextmenu.popup.ContextMenuPopupWindow.X
            java.lang.Object r0 = r0.b
            one.me.sdk.contextmenu.popup.ContextMenuPopupWindow r0 = (one.me.sdk.contextmenu.popup.ContextMenuPopupWindow) r0
            r0.getClass()
            kotlin.reflect.KProperty[] r1 = one.me.sdk.contextmenu.popup.ContextMenuPopupWindow.X
            r2 = r1[r4]
            is r2 = r0.x
            java.lang.Object r3 = r2.a(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x00a3
            r1 = r1[r4]
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r2.b(r0, r1)
            zx3 r0 = r0.getTargetController()
            boolean r1 = r0 instanceof defpackage.cx3
            if (r1 == 0) goto L_0x009e
            r6 = r0
            cx3 r6 = (defpackage.cx3) r6
        L_0x009e:
            if (r6 == 0) goto L_0x00a3
            r6.onDismiss()
        L_0x00a3:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00a6:
            kotlin.reflect.KProperty[] r1 = one.me.sdk.contextmenu.bottomsheet.ContextMenuBottomSheet.E0
            java.lang.Object r0 = r0.b
            one.me.sdk.contextmenu.bottomsheet.ContextMenuBottomSheet r0 = (one.me.sdk.contextmenu.bottomsheet.ContextMenuBottomSheet) r0
            r0.getClass()
            kotlin.reflect.KProperty[] r1 = one.me.sdk.contextmenu.bottomsheet.ContextMenuBottomSheet.E0
            r2 = r1[r4]
            is r2 = r0.C0
            java.lang.Object r3 = r2.a(r0)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L_0x00d8
            r1 = r1[r4]
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r2.b(r0, r1)
            zx3 r0 = r0.getTargetController()
            boolean r1 = r0 instanceof defpackage.cx3
            if (r1 == 0) goto L_0x00d3
            r6 = r0
            cx3 r6 = (defpackage.cx3) r6
        L_0x00d3:
            if (r6 == 0) goto L_0x00d8
            r6.onDismiss()
        L_0x00d8:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00db:
            xme r1 = defpackage.f6e.a(r6)
            r2 = 200(0xc8, double:9.9E-322)
            bs5 r2 = defpackage.bs0.v(r1, r2)
            wq0 r11 = new wq0
            java.lang.String r8 = "startSearch(Ljava/lang/String;)V"
            r9 = 4
            r4 = 2
            java.lang.Object r0 = r0.b
            ju3 r0 = (defpackage.ju3) r0
            java.lang.Class<ju3> r6 = defpackage.ju3.class
            java.lang.String r7 = "startSearch"
            r10 = 13
            r3 = r11
            r5 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            ps5 r3 = new ps5
            r4 = 5
            r3.<init>(r2, r11, r4)
            d14 r0 = r0.a
            defpackage.bs0.K(r3, r0)
            return r1
        L_0x0106:
            kotlin.reflect.KProperty[] r1 = one.me.chats.picker.contacts.ContactsPickerScreen.X
            int r1 = defpackage.pq7.a
            int r1 = defpackage.pq7.c
            boolean r1 = defpackage.pq7.b(r1)
            if (r1 == 0) goto L_0x0119
            java.lang.Object r0 = r0.b
            one.me.chats.picker.contacts.ContactsPickerScreen r0 = (one.me.chats.picker.contacts.ContactsPickerScreen) r0
            defpackage.kr7.z(r0)
        L_0x0119:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x011c:
            java.lang.Object r0 = r0.b
            zq3 r0 = (defpackage.zq3) r0
            android.graphics.drawable.ShapeDrawable r0 = defpackage.zq3.c(r0)
            return r0
        L_0x0125:
            java.lang.Object r0 = r0.b
            kp3 r0 = (defpackage.kp3) r0
            kotlin.Lazy r0 = r0.k
            java.lang.Object r0 = r0.getValue()
            q04 r0 = (defpackage.q04) r0
            jx3 r0 = defpackage.e14.a(r0)
            return r0
        L_0x0136:
            android.graphics.drawable.RippleDrawable r1 = new android.graphics.drawable.RippleDrawable
            js9 r2 = defpackage.fu4.k
            java.lang.Object r0 = r0.b
            ol3 r0 = (defpackage.ol3) r0
            k2b r0 = r2.f(r0)
            ene r0 = r0.b()
            dne r0 = r0.a
            int r0 = r0.f
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = -1
            r2.<init>(r3)
            r1.<init>(r0, r6, r2)
            return r1
        L_0x0158:
            java.lang.Object r0 = r0.b
            et0 r0 = (defpackage.et0) r0
            return r0
        L_0x015d:
            java.lang.Object r0 = r0.b
            ni3 r0 = (defpackage.ni3) r0
            java.lang.Object r1 = r0.a
            bud r1 = (defpackage.bud) r1
            akd r1 = (defpackage.akd) r1
            r1.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f25conntimeouts
            java.lang.String r2 = r2.name()
            ls7 r1 = r1.g
            java.lang.String r1 = r1.getString(r2, r6)
            if (r1 != 0) goto L_0x0179
            goto L_0x017f
        L_0x0179:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x017f }
            r2.<init>((java.lang.String) r1)     // Catch:{ JSONException -> 0x017f }
            r6 = r2
        L_0x017f:
            java.lang.Object r0 = r0.c
            kotlin.Lazy r0 = (kotlin.Lazy) r0
            if (r6 == 0) goto L_0x01d9
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            java.util.EnumMap r1 = new java.util.EnumMap
            r1.<init>(r0)
            java.util.Iterator r0 = r6.keys()
        L_0x0194:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01e0
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Integer r4 = kotlin.text.StringsKt.toIntOrNull(r2)
            if (r4 == 0) goto L_0x0194
            int r4 = r4.intValue()
            kotlin.enums.EnumEntries r7 = defpackage.mi3.x
            java.lang.Object r4 = kotlin.collections.CollectionsKt.getOrNull(r7, r4)
            mi3 r4 = (defpackage.mi3) r4
            if (r4 != 0) goto L_0x01b5
            goto L_0x0194
        L_0x01b5:
            org.json.JSONArray r2 = r6.optJSONArray(r2)
            if (r2 != 0) goto L_0x01bc
            goto L_0x0194
        L_0x01bc:
            int r7 = r2.length()
            if (r7 == 0) goto L_0x0194
            int r7 = r2.length()
            long[] r8 = new long[r7]
            r9 = r3
        L_0x01c9:
            if (r9 >= r7) goto L_0x01d5
            r10 = 10000(0x2710, double:4.9407E-320)
            long r10 = r2.optLong(r9, r10)
            r8[r9] = r10
            int r9 = r9 + r5
            goto L_0x01c9
        L_0x01d5:
            r1.put(r4, r8)
            goto L_0x0194
        L_0x01d9:
            java.lang.Object r0 = r0.getValue()
            r1 = r0
            java.util.Map r1 = (java.util.Map) r1
        L_0x01e0:
            return r1
        L_0x01e1:
            rcf r1 = defpackage.rcf.a
            java.lang.Object r0 = r0.b
            x53 r0 = (defpackage.x53) r0
            int r2 = r0.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r3 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.b
            int r2 = r0.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r4 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.c
            int r2 = r0.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r5 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.o
            int r2 = r0.e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r6 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.v
            int r2 = r0.f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r7 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.w
            int r2 = r0.h
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r8 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.x
            int r2 = r0.j
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r9 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.y
            int r2 = r0.k
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r10 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.z
            int r2 = r0.l
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r11 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.X
            int r2 = r0.m
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r12 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.Y
            int r2 = r0.n
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r13 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.Z
            int r2 = r0.o
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r14 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.v0
            int r2 = r0.p
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r15 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.w0
            int r2 = r0.q
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r16 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.x0
            int r2 = r0.r
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r17 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.y0
            int r2 = r0.s
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r18 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.z0
            int r2 = r0.t
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r19 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.A0
            int r2 = r0.u
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r20 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.B0
            int r2 = r0.v
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r21 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.C0
            int r2 = r0.w
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r22 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.D0
            int r2 = r0.x
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r23 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.E0
            int r2 = r0.y
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r24 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.F0
            int r2 = r0.z
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r25 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.G0
            int r2 = r0.A
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r26 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.H0
            int r2 = r0.B
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r27 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.I0
            int r2 = r0.C
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r28 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.J0
            int r2 = r0.D
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r29 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.K0
            int r2 = r0.E
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r30 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.L0
            int r2 = r0.F
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r31 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.M0
            int r2 = r0.G
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r32 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.N0
            int r2 = r0.H
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r33 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.O0
            int r2 = r0.I
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r34 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.P0
            int r2 = r0.J
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r35 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.Q0
            int r2 = r0.K
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r36 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.R0
            java.lang.Integer r2 = r0.L
            kotlin.Pair r37 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.S0
            java.lang.Integer r2 = r0.M
            kotlin.Pair r38 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.T0
            java.lang.Integer r2 = r0.N
            kotlin.Pair r39 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.U0
            java.lang.Integer r2 = r0.O
            kotlin.Pair r40 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.V0
            java.lang.Integer r2 = r0.P
            kotlin.Pair r41 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.W0
            int r2 = r0.Q
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r42 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.X0
            int r2 = r0.R
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r43 = kotlin.TuplesKt.to(r1, r2)
            rcf r1 = defpackage.rcf.Y0
            int r0 = r0.S
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            kotlin.Pair r44 = kotlin.TuplesKt.to(r1, r0)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44}
            java.util.HashMap r0 = kotlin.collections.MapsKt.hashMapOf(r0)
            return r0
        L_0x03d2:
            java.lang.Object r0 = r0.b
            one.me.sdk.richvector.internal.element.ClipPathElement r0 = (one.me.sdk.richvector.internal.element.ClipPathElement) r0
            android.graphics.Path r0 = one.me.sdk.richvector.internal.element.ClipPathElement.path_delegate$lambda$0(r0)
            return r0
        L_0x03db:
            kotlin.reflect.KProperty[] r1 = one.me.chats.tab.ChatsTabWidget.z0
            ox2 r1 = defpackage.ox2.b
            java.lang.Object r0 = r0.b
            woa r0 = (defpackage.woa) r0
            java.lang.String r0 = r0.a
            ta4 r1 = r1.W0()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ":settings/folder/edit?id="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.b(r0, r6)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x03fd:
            kotlin.reflect.KProperty[] r1 = one.me.chats.tab.ChatsTabWidget.z0
            java.lang.Object r0 = r0.b
            one.me.chats.tab.ChatsTabWidget r0 = (one.me.chats.tab.ChatsTabWidget) r0
            c2b r0 = r0.c0()
            r0.requestDisallowInterceptTouchEvent(r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x040d:
            java.lang.Object r0 = r0.b
            dq2 r0 = (defpackage.dq2) r0
            kotlin.time.Duration$Companion r1 = kotlin.time.Duration.Companion
            bud r1 = r0.b
            akd r1 = (defpackage.akd) r1
            r1.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r2 = ru.ok.tamtam.android.prefs.PmsKey.f109subscriptiontimeoutseconds
            r3 = 60
            long r4 = (long) r3
            long r1 = r1.r(r2, r4)
            int r1 = (int) r1
            if (r1 != 0) goto L_0x0427
            goto L_0x0428
        L_0x0427:
            r3 = r1
        L_0x0428:
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.SECONDS
            long r1 = kotlin.time.DurationKt.toDuration((int) r3, (kotlin.time.DurationUnit) r1)
            a67 r3 = defpackage.z68.b
            if (r3 != 0) goto L_0x0433
            goto L_0x045c
        L_0x0433:
            boolean r4 = r3.c()
            if (r4 == 0) goto L_0x045c
            w78 r4 = defpackage.w78.o
            long r7 = r0.a
            java.lang.String r0 = kotlin.time.Duration.m1402toStringimpl(r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r9 = "#"
            r5.<init>(r9)
            r5.append(r7)
            java.lang.String r7 = " timeout = "
            r5.append(r7)
            r5.append(r0)
            java.lang.String r0 = r5.toString()
            java.lang.String r5 = "dq2"
            r3.d(r4, r5, r0, r6)
        L_0x045c:
            kotlin.time.Duration r0 = kotlin.time.Duration.m1351boximpl(r1)
            return r0
        L_0x0461:
            java.lang.Object r0 = r0.b
            gh2 r0 = (defpackage.gh2) r0
            eg2 r0 = r0.c
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x048e
            if (r0 == r5) goto L_0x0487
            if (r0 == r2) goto L_0x0480
            if (r0 != r1) goto L_0x047a
            g20 r0 = defpackage.g20.v
            java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)
            goto L_0x049a
        L_0x047a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0480:
            g20 r0 = defpackage.g20.x
            java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)
            goto L_0x049a
        L_0x0487:
            g20 r0 = defpackage.g20.X
            java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)
            goto L_0x049a
        L_0x048e:
            g20 r0 = defpackage.g20.c
            g20 r1 = defpackage.g20.o
            g20[] r0 = new defpackage.g20[]{r0, r1}
            java.util.Set r0 = kotlin.collections.SetsKt.setOf(r0)
        L_0x049a:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x04a7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x04bb
            java.lang.Object r2 = r0.next()
            g20 r2 = (defpackage.g20) r2
            java.lang.String r2 = r2.toString()
            r1.add(r2)
            goto L_0x04a7
        L_0x04bb:
            java.util.HashSet r0 = kotlin.collections.CollectionsKt.toHashSet(r1)
            return r0
        L_0x04c0:
            kotlin.reflect.KProperty[] r3 = one.me.profile.screens.media.ChatMediaListWidget.y
            yd2 r3 = new yd2
            java.lang.Object r0 = r0.b
            one.me.profile.screens.media.ChatMediaListWidget r0 = (one.me.profile.screens.media.ChatMediaListWidget) r0
            android.content.Context r4 = r0.getContext()
            r3.<init>(r4)
            int r4 = defpackage.lxa.r0
            r3.setTitle(r4)
            eg2 r0 = r0.d0()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L_0x04f3
            if (r0 == r5) goto L_0x04f0
            if (r0 == r2) goto L_0x04ed
            if (r0 != r1) goto L_0x04e7
            int r0 = defpackage.lya.y
            goto L_0x04f5
        L_0x04e7:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04ed:
            int r0 = defpackage.lya.w
            goto L_0x04f5
        L_0x04f0:
            int r0 = defpackage.lya.h
            goto L_0x04f5
        L_0x04f3:
            int r0 = defpackage.lya.x
        L_0x04f5:
            r3.setIcon(r0)
            return r3
        L_0x04f9:
            kotlin.reflect.KProperty[] r1 = one.me.dialogs.share.media.ChatMediaDownloadBottomSheet.C0
            a10 r1 = new a10
            r1.<init>()
            r2 = 52
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.vo4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = kotlin.math.MathKt.roundToInt((float) r2)
            r1.c = r2
            r1.b = r5
            r1.invalidateSelf()
            java.lang.Object r0 = r0.b
            one.me.dialogs.share.media.ChatMediaDownloadBottomSheet r0 = (one.me.dialogs.share.media.ChatMediaDownloadBottomSheet) r0
            l2b r2 = r0.B0
            if (r2 != 0) goto L_0x052f
            js9 r2 = defpackage.fu4.k
            android.content.Context r0 = r0.getContext()
            fu4 r0 = r2.e(r0)
            k2b r2 = r0.f()
        L_0x052f:
            u67 r0 = r2.getIcon()
            int r0 = r0.f
            r1.b(r0)
            r1.e = r5
            r1.invalidateSelf()
            return r1
        L_0x053e:
            java.lang.Object r0 = r0.b
            h32 r0 = (defpackage.h32) r0
            kotlin.Lazy r0 = r0.g
            java.lang.Object r0 = r0.getValue()
            uj5 r0 = (defpackage.uj5) r0
            vj5 r0 = (defpackage.vj5) r0
            boolean r0 = r0.p()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0555:
            kotlin.reflect.KProperty[] r1 = one.me.profile.screens.changeowner.ChangeOwnerScreen.X
            t02 r1 = new t02
            java.lang.Object r0 = r0.b
            one.me.profile.screens.changeowner.ChangeOwnerScreen r0 = (one.me.profile.screens.changeowner.ChangeOwnerScreen) r0
            long r3 = r0.c0()
            jxb r0 = defpackage.jxb.a
            kotlin.Lazy r5 = r0.c()
            kotlin.Lazy r6 = r0.e()
            q4 r2 = r0.getAccessor()
            java.lang.Class<rl> r7 = defpackage.rl.class
            kotlin.Lazy r7 = r2.h(r7)
            kotlin.Lazy r8 = r0.f()
            r2 = r1
            r2.<init>(r3, r5, r6, r7, r8)
            return r1
        L_0x057e:
            java.lang.Object r0 = r0.b
            q01 r0 = (defpackage.q01) r0
            java.lang.Object r0 = r0.b
            wgd r0 = (defpackage.wgd) r0
            boolean r1 = r0.f
            if (r1 != 0) goto L_0x058e
            boolean r0 = r0.e
            if (r0 == 0) goto L_0x058f
        L_0x058e:
            r4 = 4
        L_0x058f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            return r0
        L_0x0594:
            b r1 = new b
            java.lang.Object r0 = r0.b
            on1 r0 = (defpackage.on1) r0
            r2 = 25
            r1.<init>((int) r2, (java.lang.Object) r0)
            return r1
        L_0x05a0:
            java.lang.Object r0 = r0.b
            tm1 r0 = (defpackage.tm1) r0
            kotlin.jvm.functions.Function0 r0 = r0.c1
            if (r0 == 0) goto L_0x05af
            java.lang.Object r0 = r0.invoke()
            r6 = r0
            p6g r6 = (defpackage.p6g) r6
        L_0x05af:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm1.invoke():java.lang.Object");
    }
}
