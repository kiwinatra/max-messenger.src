package defpackage;

import kotlin.reflect.KProperty;

/* renamed from: dw1  reason: default package */
public final class dw1 {
    public static final /* synthetic */ KProperty[] e;
    public static final String f;
    public final hs7 a;
    public final hs7 b;
    public final hs7 c;
    public final hs7 d;

    static {
        Class<dw1> cls = dw1.class;
        e = new KProperty[]{wj6.p(cls, "api", "getApi()Lru/ok/tamtam/api/Api;", 0), wj6.p(cls, "serverPrefs", "getServerPrefs()Lru/ok/tamtam/prefs/ServerPrefs;", 0), wj6.p(cls, "messageReactionsUpdateLogic", "getMessageReactionsUpdateLogic()Lru/ok/tamtam/messages/reactions/MessageReactionsUpdateLogic;", 0), wj6.p(cls, "exceptionHandler", "getExceptionHandler()Lru/ok/tamtam/ExceptionHandler;", 0)};
        f = cls.getName();
    }

    public dw1(hs7 hs7, hs7 hs72, hs7 hs73, hs7 hs74) {
        this.a = hs7;
        this.b = hs72;
        this.c = hs73;
        this.d = hs74;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b5 A[Catch:{ all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b6 A[Catch:{ all -> 0x00dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(long r24, long r26, long r28, long r30, defpackage.qqc r32, kotlin.coroutines.Continuation r33) {
        /*
            r23 = this;
            r1 = r23
            r0 = r33
            boolean r2 = r0 instanceof defpackage.cw1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            cw1 r2 = (defpackage.cw1) r2
            int r3 = r2.y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.y = r3
            goto L_0x001c
        L_0x0017:
            cw1 r2 = new cw1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.w
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.y
            java.lang.String r6 = f
            kotlin.reflect.KProperty[] r7 = e
            r8 = 1
            if (r4 == 0) goto L_0x0052
            if (r4 != r8) goto L_0x004a
            long r3 = r2.v
            long r8 = r2.o
            long r10 = r2.c
            long r12 = r2.b
            dw1 r1 = r2.a
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x0046 }
            r15 = r8
            r19 = r3
            r4 = r6
            r5 = r19
            r21 = r10
            r11 = r12
            r13 = r21
            goto L_0x009f
        L_0x0046:
            r0 = move-exception
            r4 = r6
            goto L_0x00dd
        L_0x004a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0052:
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7[r8]
            hs7 r0 = r1.b
            java.lang.Object r0 = r0.get()
            bud r0 = (defpackage.bud) r0
            r0.getClass()
            gqc r0 = defpackage.gqc.a
            gqc r0 = defpackage.gqc.a
            java.lang.String r0 = "reactions, msgCancelReaction"
            defpackage.z68.c(r6, r0, new java.lang.Object[0])
            r0 = 2
            r0 = r7[r0]     // Catch:{ all -> 0x0046 }
            hs7 r0 = r1.c     // Catch:{ all -> 0x0046 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0046 }
            r9 = r0
            ae9 r9 = (defpackage.ae9) r9     // Catch:{ all -> 0x0046 }
            r2.a = r1     // Catch:{ all -> 0x0046 }
            r14 = r24
            r2.b = r14     // Catch:{ all -> 0x0046 }
            r12 = r26
            r2.c = r12     // Catch:{ all -> 0x0046 }
            r10 = r28
            r2.o = r10     // Catch:{ all -> 0x0046 }
            r4 = r6
            r5 = r30
            r2.v = r5     // Catch:{ all -> 0x00dc }
            r2.y = r8     // Catch:{ all -> 0x00dc }
            r10 = r24
            r12 = r26
            r14 = r32
            kotlin.Unit r0 = r9.e(r10, r12, r14)     // Catch:{ all -> 0x00dc }
            if (r0 != r3) goto L_0x0099
            return r3
        L_0x0099:
            r11 = r24
            r13 = r26
            r15 = r28
        L_0x009f:
            r1.getClass()     // Catch:{ all -> 0x00dc }
            r2 = 0
            r0 = r7[r2]     // Catch:{ all -> 0x00dc }
            hs7 r0 = r1.a     // Catch:{ all -> 0x00dc }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00dc }
            rl r0 = (defpackage.rl) r0     // Catch:{ all -> 0x00dc }
            jna r0 = (defpackage.jna) r0     // Catch:{ all -> 0x00dc }
            boolean r2 = r0.r(r11)     // Catch:{ all -> 0x00dc }
            if (r2 != 0) goto L_0x00b6
            goto L_0x00f6
        L_0x00b6:
            boolean r2 = r0.s(r13)     // Catch:{ all -> 0x00dc }
            if (r2 != 0) goto L_0x00bd
            goto L_0x00f6
        L_0x00bd:
            boolean r2 = r0.t(r5)     // Catch:{ all -> 0x00dc }
            if (r2 != 0) goto L_0x00c4
            goto L_0x00f6
        L_0x00c4:
            fv9 r2 = new fv9     // Catch:{ all -> 0x00dc }
            jtb r3 = r0.D()     // Catch:{ all -> 0x00dc }
            ltb r3 = (defpackage.ltb) r3     // Catch:{ all -> 0x00dc }
            a33 r3 = r3.a     // Catch:{ all -> 0x00dc }
            long r9 = r3.n()     // Catch:{ all -> 0x00dc }
            r8 = r2
            r17 = r5
            r8.<init>(r9, r11, r13, r15, r17)     // Catch:{ all -> 0x00dc }
            defpackage.jna.A(r0, r2)     // Catch:{ all -> 0x00dc }
            goto L_0x00f6
        L_0x00dc:
            r0 = move-exception
        L_0x00dd:
            java.lang.String r2 = "reactions, cancelReaction async query failed"
            defpackage.z68.f(r4, r2, r0)
            r1.getClass()
            r2 = 3
            r2 = r7[r2]
            hs7 r1 = r1.d
            java.lang.Object r1 = r1.get()
            m95 r1 = (defpackage.m95) r1
            uta r1 = (defpackage.uta) r1
            r2 = 0
            r1.c(r0, r2)
        L_0x00f6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dw1.a(long, long, long, long, qqc, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
