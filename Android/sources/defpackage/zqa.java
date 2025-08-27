package defpackage;

import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.tamtam.nano.Protos;

/* renamed from: zqa  reason: default package */
public final /* synthetic */ class zqa extends FunctionReferenceImpl implements Function2, SuspendFunction {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zqa(int i, Object obj) {
        super(2, obj, ara.class, "internalVerify", "internalVerify(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
        switch (i) {
            case 1:
                super(2, obj, tz9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                return;
            case 2:
                super(2, obj, ehb.class, "onItemClick", "onItemClick(JLone/me/chats/picker/PickerEntity$Type;)V", 0);
                return;
            case 3:
                super(2, obj, tz9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                return;
            case 5:
                super(2, obj, tz9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                return;
            case 9:
                super(2, obj, zxb.class, "onChecked", "onChecked(JZ)V", 0);
                return;
            case 10:
                super(2, obj, a4c.class, "onChecked", "onChecked(JZ)V", 0);
                return;
            case 11:
                super(2, obj, w5c.class, "onLinkClick", "onLinkClick(Ljava/lang/String;Lru/ok/tamtam/android/messages/LinkType;)V", 0);
                return;
            case 13:
                super(2, obj, h5f.class, "putInRepository", "putInRepository(Lone/me/sdk/transfer/domain/Upload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                super(2, obj, h5f.class, "putInRepository", "putInRepository(Lone/me/sdk/transfer/domain/Upload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                super(2, obj, h8.class, "onVideoCodec", "onVideoCodec(Lru/ok/android/webrtc/stat/codec/ActiveEncodersStats$NamedCodecInfo;J)V", 0);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x0539 A[LOOP:14: B:156:0x04dd->B:170:0x0539, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x056a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r37, java.lang.Object r38) {
        /*
            r36 = this;
            r0 = r36
            int r1 = r0.a
            switch(r1) {
                case 0: goto L_0x05fa;
                case 1: goto L_0x05e9;
                case 2: goto L_0x05d3;
                case 3: goto L_0x05c2;
                case 4: goto L_0x05b1;
                case 5: goto L_0x05a0;
                case 6: goto L_0x058f;
                case 7: goto L_0x057e;
                case 8: goto L_0x056d;
                case 9: goto L_0x020c;
                case 10: goto L_0x0097;
                case 11: goto L_0x0072;
                case 12: goto L_0x0061;
                case 13: goto L_0x0050;
                case 14: goto L_0x003f;
                default: goto L_0x0007;
            }
        L_0x0007:
            r1 = r37
            g8 r1 = (defpackage.g8) r1
            r2 = r38
            java.lang.Number r2 = (java.lang.Number) r2
            long r2 = r2.longValue()
            java.lang.Object r0 = r0.receiver
            h8 r0 = (defpackage.h8) r0
            r0.getClass()
            java.lang.String r1 = r1.b
            ru.ok.android.externcalls.analytics.events.EventItemValue r1 = ru.ok.android.externcalls.analytics.events.EventItemValueKt.toEventItemValue((java.lang.String) r1)
            ru.ok.android.externcalls.analytics.events.EventItemValue r2 = ru.ok.android.externcalls.analytics.events.EventItemValueKt.toEventItemValue((long) r2)
            ru.ok.android.externcalls.analytics.events.EventItemsMap r3 = new ru.ok.android.externcalls.analytics.events.EventItemsMap
            java.lang.String r4 = "codec_implementation"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r4, r1)
            java.util.Map r1 = kotlin.collections.MapsKt.mapOf(r1)
            r3.<init>(r1)
            c51 r0 = r0.a
            d51 r0 = (defpackage.d51) r0
            java.lang.String r1 = "codec_usage"
            r0.c(r1, r2, r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x003f:
            r1 = r37
            bxf r1 = (defpackage.bxf) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            h5f r0 = (defpackage.h5f) r0
            java.lang.Object r0 = r0.f(r1, r2)
            return r0
        L_0x0050:
            r1 = r37
            bxf r1 = (defpackage.bxf) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            h5f r0 = (defpackage.h5f) r0
            java.lang.Object r0 = r0.f(r1, r2)
            return r0
        L_0x0061:
            r1 = r37
            java.util.List r1 = (java.util.List) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            tz9 r0 = (defpackage.tz9) r0
            java.lang.Object r0 = r0.a(r1, r2)
            return r0
        L_0x0072:
            r1 = r37
            java.lang.String r1 = (java.lang.String) r1
            r2 = r38
            sy7 r2 = (defpackage.sy7) r2
            java.lang.Object r0 = r0.receiver
            w5c r0 = (defpackage.w5c) r0
            one.me.profile.ProfileScreen r0 = (one.me.profile.ProfileScreen) r0
            r0.getClass()
            int r2 = r2.ordinal()
            if (r2 == 0) goto L_0x008d
            r3 = 6
            if (r2 == r3) goto L_0x008d
            goto L_0x0094
        L_0x008d:
            android.content.Context r0 = r0.getContext()
            defpackage.kw3.b(r0, r1)
        L_0x0094:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0097:
            r1 = r37
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            r3 = r38
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r11 = r3.booleanValue()
            java.lang.Object r0 = r0.receiver
            a4c r0 = (defpackage.a4c) r0
            one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen r0 = (one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen) r0
            q4c r0 = r0.c0()
            r0.getClass()
            int r4 = defpackage.fxa.n0
            long r4 = (long) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r12 = 0
            xme r13 = r0.y0
            if (r4 != 0) goto L_0x00ec
            java.lang.Object r1 = r13.getValue()
            r4 = r1
            c4c r4 = (defpackage.c4c) r4
            r7 = 0
            r10 = 30
            r6 = 0
            r8 = 0
            r9 = 0
            r5 = r11
            c4c r1 = defpackage.c4c.a(r4, r5, r6, r7, r8, r9, r10)
            r13.m(r12, r1)
            r1 = r11 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "ONLY_OWNER_CAN_CHANGE_ICON_TITLE"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r2, r1)
            kotlin.Pair[] r1 = new kotlin.Pair[]{r1}
            java.util.HashMap r1 = kotlin.collections.MapsKt.hashMapOf(r1)
            r0.l(r1)
            goto L_0x0209
        L_0x00ec:
            int r4 = defpackage.fxa.l0
            long r4 = (long) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            java.lang.String r14 = "MEMBERS_CAN_SEE_PRIVATE_LINK"
            if (r4 != 0) goto L_0x017c
            kotlin.Lazy r1 = r0.z
            java.lang.Object r1 = r1.getValue()
            uj5 r1 = (defpackage.uj5) r1
            vj5 r1 = (defpackage.vj5) r1
            boolean r1 = r1.n()
            java.lang.String r15 = "ONLY_ADMIN_CAN_ADD_MEMBER"
            if (r1 == 0) goto L_0x014d
        L_0x0107:
            java.lang.Object r1 = r13.getValue()
            r4 = r1
            c4c r4 = (defpackage.c4c) r4
            if (r11 != 0) goto L_0x0113
            r2 = 0
        L_0x0111:
            r9 = r2
            goto L_0x0116
        L_0x0113:
            boolean r2 = r4.e
            goto L_0x0111
        L_0x0116:
            r5 = 0
            r10 = 13
            r7 = 0
            r8 = 0
            r6 = r11
            c4c r2 = defpackage.c4c.a(r4, r5, r6, r7, r8, r9, r10)
            boolean r1 = r13.b(r1, r2)
            if (r1 == 0) goto L_0x0107
            r1 = r11 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            kotlin.Pair r1 = kotlin.TuplesKt.to(r15, r1)
            kotlin.Pair[] r1 = new kotlin.Pair[]{r1}
            java.util.HashMap r1 = kotlin.collections.MapsKt.hashMapOf(r1)
            if (r11 != 0) goto L_0x013f
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.put(r14, r2)
        L_0x013f:
            r0.l(r1)
            i4c r1 = new i4c
            r1.<init>(r0, r12)
            r2 = 3
            defpackage.xag.g(r0, r12, r12, r1, r2)
            goto L_0x0209
        L_0x014d:
            java.lang.Object r1 = r13.getValue()
            r4 = r1
            c4c r4 = (defpackage.c4c) r4
            r7 = 0
            r10 = 29
            r5 = 0
            r8 = 0
            r9 = 0
            r6 = r11
            c4c r2 = defpackage.c4c.a(r4, r5, r6, r7, r8, r9, r10)
            boolean r1 = r13.b(r1, r2)
            if (r1 == 0) goto L_0x014d
            r1 = r11 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            kotlin.Pair r1 = kotlin.TuplesKt.to(r15, r1)
            kotlin.Pair[] r1 = new kotlin.Pair[]{r1}
            java.util.HashMap r1 = kotlin.collections.MapsKt.hashMapOf(r1)
            r0.l(r1)
            goto L_0x0209
        L_0x017c:
            int r4 = defpackage.fxa.o0
            long r4 = (long) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x01aa
            java.lang.Object r1 = r13.getValue()
            r4 = r1
            c4c r4 = (defpackage.c4c) r4
            r6 = 0
            r10 = 27
            r5 = 0
            r8 = 0
            r9 = 0
            r7 = r11
            c4c r1 = defpackage.c4c.a(r4, r5, r6, r7, r8, r9, r10)
            r13.m(r12, r1)
            java.lang.String r1 = "ALL_CAN_PIN_MESSAGE"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r1, r3)
            kotlin.Pair[] r1 = new kotlin.Pair[]{r1}
            java.util.HashMap r1 = kotlin.collections.MapsKt.hashMapOf(r1)
            r0.l(r1)
            goto L_0x0209
        L_0x01aa:
            int r4 = defpackage.fxa.m0
            long r4 = (long) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x01de
            java.lang.Object r1 = r13.getValue()
            r4 = r1
            c4c r4 = (defpackage.c4c) r4
            r6 = 0
            r10 = 23
            r5 = 0
            r7 = 0
            r9 = 0
            r8 = r11
            c4c r1 = defpackage.c4c.a(r4, r5, r6, r7, r8, r9, r10)
            r13.m(r12, r1)
            r1 = r11 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "ONLY_ADMIN_CAN_CALL"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r2, r1)
            kotlin.Pair[] r1 = new kotlin.Pair[]{r1}
            java.util.HashMap r1 = kotlin.collections.MapsKt.hashMapOf(r1)
            r0.l(r1)
            goto L_0x0209
        L_0x01de:
            int r4 = defpackage.fxa.p0
            long r4 = (long) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x0209
            java.lang.Object r1 = r13.getValue()
            r4 = r1
            c4c r4 = (defpackage.c4c) r4
            r6 = 0
            r10 = 15
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = r11
            c4c r1 = defpackage.c4c.a(r4, r5, r6, r7, r8, r9, r10)
            r13.m(r12, r1)
            kotlin.Pair r1 = kotlin.TuplesKt.to(r14, r3)
            kotlin.Pair[] r1 = new kotlin.Pair[]{r1}
            java.util.HashMap r1 = kotlin.collections.MapsKt.hashMapOf(r1)
            r0.l(r1)
        L_0x0209:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x020c:
            r1 = r37
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            r3 = r38
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.Object r0 = r0.receiver
            zxb r0 = (defpackage.zxb) r0
            one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget r0 = (one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget) r0
            syb r0 = r0.e0()
            boolean r4 = r0.v
            kotlin.Lazy r15 = r0.Y
            xme r0 = r0.Z
            r19 = 0
            r20 = 0
            if (r4 == 0) goto L_0x0416
            long r4 = defpackage.gxa.i
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0266
        L_0x0238:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            cyb r4 = (defpackage.cyb) r4
            if (r4 == 0) goto L_0x025c
            byb r2 = r4.g
            byb r11 = defpackage.byb.a(r2, r3)
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 8127(0x1fbf, float:1.1388E-41)
            cyb r2 = defpackage.cyb.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x025e
        L_0x025c:
            r2 = r19
        L_0x025e:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x0238
            goto L_0x056a
        L_0x0266:
            long r4 = defpackage.gxa.g
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x029a
        L_0x026c:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            cyb r4 = (defpackage.cyb) r4
            if (r4 == 0) goto L_0x0290
            byb r2 = r4.h
            byb r12 = defpackage.byb.a(r2, r3)
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 8063(0x1f7f, float:1.1299E-41)
            cyb r2 = defpackage.cyb.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0292
        L_0x0290:
            r2 = r19
        L_0x0292:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x026c
            goto L_0x056a
        L_0x029a:
            long r4 = defpackage.gxa.d
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x02ce
        L_0x02a0:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            cyb r4 = (defpackage.cyb) r4
            if (r4 == 0) goto L_0x02c4
            byb r2 = r4.i
            byb r13 = defpackage.byb.a(r2, r3)
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r18 = 7935(0x1eff, float:1.112E-41)
            cyb r2 = defpackage.cyb.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x02c6
        L_0x02c4:
            r2 = r19
        L_0x02c6:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x02a0
            goto L_0x056a
        L_0x02ce:
            long r4 = defpackage.gxa.h
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0302
        L_0x02d4:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            cyb r4 = (defpackage.cyb) r4
            if (r4 == 0) goto L_0x02f8
            byb r2 = r4.j
            byb r14 = defpackage.byb.a(r2, r3)
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r18 = 7679(0x1dff, float:1.076E-41)
            cyb r2 = defpackage.cyb.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x02fa
        L_0x02f8:
            r2 = r19
        L_0x02fa:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x02d4
            goto L_0x056a
        L_0x0302:
            long r4 = defpackage.gxa.b
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0336
        L_0x0308:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            cyb r4 = (defpackage.cyb) r4
            if (r4 == 0) goto L_0x032c
            byb r2 = r4.k
            byb r15 = defpackage.byb.a(r2, r3)
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r18 = 7167(0x1bff, float:1.0043E-41)
            cyb r2 = defpackage.cyb.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x032e
        L_0x032c:
            r2 = r19
        L_0x032e:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x0308
            goto L_0x056a
        L_0x0336:
            long r4 = defpackage.gxa.f
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x03b4
        L_0x033c:
            java.lang.Object r1 = r0.getValue()
            r2 = r1
            cyb r2 = (defpackage.cyb) r2
            java.lang.Object r4 = r15.getValue()
            uj5 r4 = (defpackage.uj5) r4
            vj5 r4 = (defpackage.vj5) r4
            boolean r4 = r4.n()
            if (r4 == 0) goto L_0x0384
            if (r2 == 0) goto L_0x0381
            byb r4 = r2.l
            byb r33 = defpackage.byb.a(r4, r3)
            if (r3 != 0) goto L_0x035e
            r27 = r20
            goto L_0x0362
        L_0x035e:
            boolean r4 = r2.f
            r27 = r4
        L_0x0362:
            r32 = 0
            r34 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r35 = 6111(0x17df, float:8.563E-42)
            r21 = r2
            cyb r2 = defpackage.cyb.a(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x03ac
        L_0x0381:
            r2 = r19
            goto L_0x03ac
        L_0x0384:
            if (r2 == 0) goto L_0x0381
            byb r4 = r2.l
            byb r33 = defpackage.byb.a(r4, r3)
            r32 = 0
            r34 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r35 = 6143(0x17ff, float:8.608E-42)
            r21 = r2
            cyb r2 = defpackage.cyb.a(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
        L_0x03ac:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x033c
            goto L_0x056a
        L_0x03b4:
            long r4 = defpackage.gxa.c
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x03e7
        L_0x03ba:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            cyb r4 = (defpackage.cyb) r4
            if (r4 == 0) goto L_0x03dd
            byb r2 = r4.m
            byb r17 = defpackage.byb.a(r2, r3)
            r15 = 0
            r16 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r18 = 4095(0xfff, float:5.738E-42)
            cyb r2 = defpackage.cyb.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x03df
        L_0x03dd:
            r2 = r19
        L_0x03df:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x03ba
            goto L_0x056a
        L_0x03e7:
            long r4 = defpackage.gxa.e
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x056a
        L_0x03ed:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            cyb r4 = (defpackage.cyb) r4
            if (r4 == 0) goto L_0x040c
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 8159(0x1fdf, float:1.1433E-41)
            r10 = r3
            cyb r2 = defpackage.cyb.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x040e
        L_0x040c:
            r2 = r19
        L_0x040e:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x03ed
            goto L_0x056a
        L_0x0416:
            int r4 = defpackage.fxa.S
            long r4 = (long) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0446
        L_0x041d:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            cyb r4 = (defpackage.cyb) r4
            if (r4 == 0) goto L_0x043c
            r16 = 0
            r17 = 0
            r6 = 1
            r7 = 1
            r8 = 1
            r9 = 1
            r10 = 1
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 8128(0x1fc0, float:1.139E-41)
            r5 = r3
            cyb r2 = defpackage.cyb.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x043e
        L_0x043c:
            r2 = r19
        L_0x043e:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x041d
            goto L_0x056a
        L_0x0446:
            int r4 = defpackage.fxa.O
            long r4 = (long) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x0476
        L_0x044d:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            cyb r4 = (defpackage.cyb) r4
            if (r4 == 0) goto L_0x046c
            r16 = 0
            r17 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 8189(0x1ffd, float:1.1475E-41)
            r6 = r3
            cyb r2 = defpackage.cyb.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x046e
        L_0x046c:
            r2 = r19
        L_0x046e:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x044d
            goto L_0x056a
        L_0x0476:
            int r4 = defpackage.fxa.P
            long r4 = (long) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x04a6
        L_0x047d:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            cyb r4 = (defpackage.cyb) r4
            if (r4 == 0) goto L_0x049c
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 8187(0x1ffb, float:1.1472E-41)
            r7 = r3
            cyb r2 = defpackage.cyb.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x049e
        L_0x049c:
            r2 = r19
        L_0x049e:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x047d
            goto L_0x056a
        L_0x04a6:
            int r4 = defpackage.fxa.F
            long r4 = (long) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x04d6
        L_0x04ad:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            cyb r4 = (defpackage.cyb) r4
            if (r4 == 0) goto L_0x04cc
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 8183(0x1ff7, float:1.1467E-41)
            r8 = r3
            cyb r2 = defpackage.cyb.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x04ce
        L_0x04cc:
            r2 = r19
        L_0x04ce:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x04ad
            goto L_0x056a
        L_0x04d6:
            int r4 = defpackage.fxa.N
            long r4 = (long) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x053c
        L_0x04dd:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            cyb r4 = (defpackage.cyb) r4
            java.lang.Object r2 = r15.getValue()
            uj5 r2 = (defpackage.uj5) r2
            vj5 r2 = (defpackage.vj5) r2
            boolean r2 = r2.n()
            if (r2 == 0) goto L_0x0519
            if (r4 == 0) goto L_0x0514
            if (r3 != 0) goto L_0x04f9
            r10 = r20
            goto L_0x04fc
        L_0x04f9:
            boolean r2 = r4.f
            r10 = r2
        L_0x04fc:
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r2 = 0
            r18 = 8143(0x1fcf, float:1.1411E-41)
            r9 = r3
            r21 = r15
            r15 = r2
            cyb r2 = defpackage.cyb.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0532
        L_0x0514:
            r21 = r15
        L_0x0516:
            r2 = r19
            goto L_0x0532
        L_0x0519:
            r21 = r15
            if (r4 == 0) goto L_0x0516
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 8175(0x1fef, float:1.1456E-41)
            r9 = r3
            cyb r2 = defpackage.cyb.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x0532:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x0539
            goto L_0x056a
        L_0x0539:
            r15 = r21
            goto L_0x04dd
        L_0x053c:
            int r4 = defpackage.fxa.M
            long r4 = (long) r4
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x056a
        L_0x0543:
            java.lang.Object r1 = r0.getValue()
            r4 = r1
            cyb r4 = (defpackage.cyb) r4
            if (r4 == 0) goto L_0x0562
            r16 = 0
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r18 = 8159(0x1fdf, float:1.1433E-41)
            r10 = r3
            cyb r2 = defpackage.cyb.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0564
        L_0x0562:
            r2 = r19
        L_0x0564:
            boolean r1 = r0.b(r1, r2)
            if (r1 == 0) goto L_0x0543
        L_0x056a:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x056d:
            r1 = r37
            java.util.List r1 = (java.util.List) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            tz9 r0 = (defpackage.tz9) r0
            java.lang.Object r0 = r0.a(r1, r2)
            return r0
        L_0x057e:
            r1 = r37
            java.util.List r1 = (java.util.List) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            tz9 r0 = (defpackage.tz9) r0
            java.lang.Object r0 = r0.a(r1, r2)
            return r0
        L_0x058f:
            r1 = r37
            java.util.List r1 = (java.util.List) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            tz9 r0 = (defpackage.tz9) r0
            java.lang.Object r0 = r0.a(r1, r2)
            return r0
        L_0x05a0:
            r1 = r37
            java.util.List r1 = (java.util.List) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            tz9 r0 = (defpackage.tz9) r0
            java.lang.Object r0 = r0.a(r1, r2)
            return r0
        L_0x05b1:
            r1 = r37
            ss2 r1 = (defpackage.ss2) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            tz9 r0 = (defpackage.tz9) r0
            java.lang.Object r0 = r0.a(r1, r2)
            return r0
        L_0x05c2:
            r1 = r37
            java.util.Map r1 = (java.util.Map) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            tz9 r0 = (defpackage.tz9) r0
            java.lang.Object r0 = r0.a(r1, r2)
            return r0
        L_0x05d3:
            r1 = r37
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            r3 = r38
            ckb r3 = (defpackage.ckb) r3
            java.lang.Object r0 = r0.receiver
            ehb r0 = (defpackage.ehb) r0
            r0.t(r1, r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x05e9:
            r1 = r37
            j66 r1 = (defpackage.j66) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            tz9 r0 = (defpackage.tz9) r0
            java.lang.Object r0 = r0.a(r1, r2)
            return r0
        L_0x05fa:
            r1 = r37
            java.util.Collection r1 = (java.util.Collection) r1
            r2 = r38
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r0 = r0.receiver
            ara r0 = (defpackage.ara) r0
            r0.getClass()
            jz9 r3 = new jz9
            int r4 = r1.size()
            r3.<init>((int) r4)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x0618:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x065b
            java.lang.Object r4 = r1.next()
            zx5 r4 = (defpackage.zx5) r4
            java.util.List r4 = r4.w0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x062c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0618
            java.lang.Object r5 = r4.next()
            ta9 r5 = (defpackage.ta9) r5
            sa9 r6 = r5.c
            sa9 r7 = defpackage.sa9.Y
            if (r6 != r7) goto L_0x062c
            kotlin.Lazy r6 = r0.a
            java.lang.Object r6 = r6.getValue()
            gk r6 = (defpackage.gk) r6
            long r7 = r5.a
            tz9 r6 = r6.i(r7)
            java.lang.Object r6 = r6.getValue()
            hi r6 = (defpackage.hi) r6
            if (r6 == 0) goto L_0x0655
            goto L_0x062c
        L_0x0655:
            long r5 = r5.a
            r3.e(r5)
            goto L_0x062c
        L_0x065b:
            java.lang.Class<ara> r1 = defpackage.ara.class
            java.lang.String r1 = r1.getName()
            a67 r4 = defpackage.z68.b
            if (r4 != 0) goto L_0x0666
            goto L_0x067e
        L_0x0666:
            boolean r5 = r4.c()
            if (r5 == 0) goto L_0x067e
            w78 r5 = defpackage.w78.o
            r6 = 31
            r7 = 0
            java.lang.String r6 = defpackage.va8.d(r3, r7, r7, r6)
            java.lang.String r8 = "internalVerify "
            java.lang.String r6 = defpackage.a81.m(r8, r6)
            r4.d(r5, r1, r6, r7)
        L_0x067e:
            kotlin.Lazy r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            gk r0 = (defpackage.gk) r0
            java.lang.Object r0 = r0.e(r3, r2)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L_0x0691
            goto L_0x0693
        L_0x0691:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0693:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zqa.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zqa(xme xme, int i) {
        super(2, xme, tz9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        this.a = i;
        switch (i) {
            case 6:
                super(2, xme, tz9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                return;
            case 7:
                super(2, xme, tz9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                return;
            case 8:
                super(2, xme, tz9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                return;
            case 12:
                super(2, xme, tz9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                return;
            default:
                return;
        }
    }
}
