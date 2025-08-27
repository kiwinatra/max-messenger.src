package defpackage;

import kotlin.Lazy;

/* renamed from: g11  reason: default package */
public final class g11 implements ds5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ds5 b;
    public final /* synthetic */ Lazy c;

    public /* synthetic */ g11(ds5 ds5, Lazy lazy, int i) {
        this.a = i;
        this.b = ds5;
        this.c = lazy;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0103  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0111  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            int r0 = r5.a
            switch(r0) {
                case 0: goto L_0x00e0;
                case 1: goto L_0x0079;
                default: goto L_0x0005;
            }
        L_0x0005:
            boolean r0 = r7 instanceof defpackage.qh7
            if (r0 == 0) goto L_0x0018
            r0 = r7
            qh7 r0 = (defpackage.qh7) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0018
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x001d
        L_0x0018:
            qh7 r0 = new qh7
            r0.<init>(r5, r7)
        L_0x001d:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0076
        L_0x002e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r7)
            ysa r6 = (defpackage.ysa) r6
            java.lang.String r7 = r6.a
            java.lang.String r2 = ""
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x0047
            r6 = -1
            goto L_0x0067
        L_0x0047:
            kotlin.Lazy r7 = r5.c
            java.lang.Object r7 = r7.getValue()
            aeb r7 = (defpackage.aeb) r7
            java.lang.String r6 = r6.a
            teb r6 = r7.e(r6)
            boolean r2 = r7.m(r6)
            if (r2 != 0) goto L_0x005f
            r6 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0067
        L_0x005f:
            java.lang.String r6 = r7.d(r6, r3)
            int r6 = r6.length()
        L_0x0067:
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
            r0.b = r3
            ds5 r5 = r5.b
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x0078:
            return r1
        L_0x0079:
            boolean r0 = r7 instanceof defpackage.ge1
            if (r0 == 0) goto L_0x008c
            r0 = r7
            ge1 r0 = (defpackage.ge1) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x008c
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x0091
        L_0x008c:
            ge1 r0 = new ge1
            r0.<init>(r5, r7)
        L_0x0091:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x00aa
            if (r2 != r3) goto L_0x00a2
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x00dd
        L_0x00a2:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x00aa:
            kotlin.ResultKt.throwOnFailure(r7)
            i9b r6 = (defpackage.i9b) r6
            kotlin.Lazy r7 = r5.c
            java.lang.Object r7 = r7.getValue()
            hl1 r7 = (defpackage.hl1) r7
            java.util.Map r6 = r6.c
            int r6 = r6.size()
            int r6 = r6 + r3
            android.content.Context r7 = r7.a
            android.content.res.Resources r7 = r7.getResources()
            int r2 = defpackage.bkc.call_users_info_count
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r6 = r7.getQuantityString(r2, r6, r4)
            r0.b = r3
            ds5 r5 = r5.b
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L_0x00dd
            goto L_0x00df
        L_0x00dd:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x00df:
            return r1
        L_0x00e0:
            boolean r0 = r7 instanceof defpackage.f11
            if (r0 == 0) goto L_0x00f3
            r0 = r7
            f11 r0 = (defpackage.f11) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x00f3
            int r1 = r1 - r2
            r0.b = r1
            goto L_0x00f8
        L_0x00f3:
            f11 r0 = new f11
            r0.<init>(r5, r7)
        L_0x00f8:
            java.lang.Object r7 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L_0x0111
            if (r2 != r3) goto L_0x0109
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x014c
        L_0x0109:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0111:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Number r6 = (java.lang.Number) r6
            r6.longValue()
            kotlin.Lazy r6 = r5.c
            java.lang.Object r6 = r6.getValue()
            ap1 r6 = (defpackage.ap1) r6
            dp1 r6 = r6.a
            mp1 r6 = (defpackage.mp1) r6
            ru.ok.android.externcalls.sdk.Conversation r7 = r6.n()
            r2 = 0
            if (r7 == 0) goto L_0x013d
            ru.ok.android.externcalls.sdk.ConversationParticipant r7 = r7.getMe()
            if (r7 != 0) goto L_0x0133
            goto L_0x013d
        L_0x0133:
            ru.ok.android.externcalls.sdk.Conversation r6 = r6.n()
            if (r6 == 0) goto L_0x013d
            float r2 = r6.getAdjustedAudioLevel(r7)
        L_0x013d:
            java.lang.Float r6 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r2)
            r0.b = r3
            ds5 r5 = r5.b
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L_0x014c
            goto L_0x014e
        L_0x014c:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L_0x014e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g11.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
