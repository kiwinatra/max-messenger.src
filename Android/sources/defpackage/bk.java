package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: bk  reason: default package */
public final class bk extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gk c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bk(gk gkVar, Continuation continuation) {
        super(2, continuation);
        this.c = gkVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        bk bkVar = new bk(this.c, continuation);
        bkVar.b = obj;
        return bkVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bk) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0063, code lost:
        r15 = r14.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = kotlin.Result.Companion;
        r1 = r15.a;
        r4 = new defpackage.yt(8, ((defpackage.qjd) r15.c).g.getLong("user.animojiSetsLastSync", 0), 0, 0);
        r14.b = null;
        r14.a = 2;
        r15 = ((defpackage.jna) r1).T(r4, r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008e, code lost:
        if (r15 != r0) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0090, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0091, code lost:
        r15 = kotlin.Result.m23constructorimpl((defpackage.qu) r15);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.a
            r2 = 0
            r3 = 1
            switch(r1) {
                case 0: goto L_0x0041;
                case 1: goto L_0x0039;
                case 2: goto L_0x0033;
                case 3: goto L_0x002a;
                case 4: goto L_0x0021;
                case 5: goto L_0x0018;
                case 6: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0013:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0138
        L_0x0018:
            java.lang.Object r1 = r14.b
            java.util.List r1 = (java.util.List) r1
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0107
        L_0x0021:
            java.lang.Object r1 = r14.b
            java.util.List r1 = (java.util.List) r1
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00ea
        L_0x002a:
            java.lang.Object r1 = r14.b
            qu r1 = (defpackage.qu) r1
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x00d5
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r15)     // Catch:{ all -> 0x0037 }
            goto L_0x0091
        L_0x0037:
            r15 = move-exception
            goto L_0x0098
        L_0x0039:
            java.lang.Object r1 = r14.b
            d14 r1 = (defpackage.d14) r1
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0063
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.Object r15 = r14.b
            d14 r15 = (defpackage.d14) r15
            gk r1 = r14.c
            wie r4 = r1.l
            kotlin.reflect.KProperty[] r5 = defpackage.gk.p
            r5 = r5[r3]
            java.lang.Object r1 = r4.getValue(r1, r5)
            pm7 r1 = (defpackage.pm7) r1
            if (r1 == 0) goto L_0x0063
            r14.b = r15
            r14.a = r3
            java.lang.Object r15 = r1.d(r14)
            if (r15 != r0) goto L_0x0063
            return r0
        L_0x0063:
            gk r15 = r14.c
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch:{ all -> 0x0037 }
            rl r1 = r15.a     // Catch:{ all -> 0x0037 }
            yt r12 = new yt     // Catch:{ all -> 0x0037 }
            x23 r15 = r15.c     // Catch:{ all -> 0x0037 }
            qjd r15 = (defpackage.qjd) r15     // Catch:{ all -> 0x0037 }
            java.lang.String r4 = "user.animojiSetsLastSync"
            ls7 r15 = r15.g     // Catch:{ all -> 0x0037 }
            r5 = 0
            long r6 = r15.getLong(r4, r5)     // Catch:{ all -> 0x0037 }
            r8 = 0
            r10 = 0
            r5 = 8
            r4 = r12
            r4.<init>(r5, r6, r8, r10)     // Catch:{ all -> 0x0037 }
            r14.b = r2     // Catch:{ all -> 0x0037 }
            r15 = 2
            r14.a = r15     // Catch:{ all -> 0x0037 }
            jna r1 = (defpackage.jna) r1     // Catch:{ all -> 0x0037 }
            java.lang.Object r15 = r1.T(r12, r14)     // Catch:{ all -> 0x0037 }
            if (r15 != r0) goto L_0x0091
            return r0
        L_0x0091:
            qu r15 = (defpackage.qu) r15     // Catch:{ all -> 0x0037 }
            java.lang.Object r15 = kotlin.Result.m23constructorimpl(r15)     // Catch:{ all -> 0x0037 }
            goto L_0x00a2
        L_0x0098:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r15 = kotlin.ResultKt.createFailure(r15)
            java.lang.Object r15 = kotlin.Result.m23constructorimpl(r15)
        L_0x00a2:
            boolean r1 = kotlin.Result.m29isFailureimpl(r15)
            if (r1 == 0) goto L_0x00a9
            r15 = r2
        L_0x00a9:
            r1 = r15
            qu r1 = (defpackage.qu) r1
            if (r1 != 0) goto L_0x00c7
            gk r14 = r14.c
            java.lang.String r14 = r14.f
            a67 r15 = defpackage.z68.b
            if (r15 != 0) goto L_0x00b7
            goto L_0x00c4
        L_0x00b7:
            boolean r0 = r15.c()
            if (r0 == 0) goto L_0x00c4
            w78 r0 = defpackage.w78.w
            java.lang.String r1 = "response is null"
            r15.d(r0, r14, r1, r2)
        L_0x00c4:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        L_0x00c7:
            gk r15 = r14.c
            r14.b = r1
            r4 = 3
            r14.a = r4
            java.lang.Object r15 = defpackage.gk.b(r15, r1, r14)
            if (r15 != r0) goto L_0x00d5
            return r0
        L_0x00d5:
            java.util.List r15 = (java.util.List) r15
            gk r4 = r14.c
            java.util.Map r1 = r1.y
            r14.b = r15
            r5 = 4
            r14.a = r5
            java.lang.Object r1 = defpackage.gk.a(r4, r1, r14)
            if (r1 != r0) goto L_0x00e7
            return r0
        L_0x00e7:
            r13 = r1
            r1 = r15
            r15 = r13
        L_0x00ea:
            java.util.List r15 = (java.util.List) r15
            java.util.Collection r15 = (java.util.Collection) r15
            boolean r4 = r15.isEmpty()
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x0107
            gk r4 = r14.c
            jz9 r15 = defpackage.wa8.d(r15)
            r14.b = r1
            r5 = 5
            r14.a = r5
            java.lang.Object r15 = r4.e(r15, r14)
            if (r15 != r0) goto L_0x0107
            return r0
        L_0x0107:
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r15 = r1.isEmpty()
            r15 = r15 ^ r3
            if (r15 == 0) goto L_0x0138
            gk r15 = r14.c
            jz9 r1 = defpackage.wa8.d(r1)
            r14.b = r2
            r3 = 6
            r14.a = r3
            gaf r3 = r15.d
            osa r3 = (defpackage.osa) r3
            q04 r3 = r3.a()
            sj r4 = new sj
            r4.<init>(r15, r1, r2)
            java.lang.Object r14 = defpackage.ev0.I(r3, r4, r14)
            java.lang.Object r15 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r14 != r15) goto L_0x0133
            goto L_0x0135
        L_0x0133:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
        L_0x0135:
            if (r14 != r0) goto L_0x0138
            return r0
        L_0x0138:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
