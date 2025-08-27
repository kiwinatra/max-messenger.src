package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: uv5  reason: default package */
public final class uv5 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ u08 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uv5(u08 u08, Continuation continuation) {
        super(2, continuation);
        this.c = u08;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        uv5 uv5 = new uv5(this.c, continuation);
        uv5.b = obj;
        return uv5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uv5) create((cwb) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0089 A[Catch:{ all -> 0x0030 }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 1
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r9.a
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 0
            u08 r7 = r9.c
            if (r2 == 0) goto L_0x0042
            if (r2 == r0) goto L_0x003a
            if (r2 == r5) goto L_0x0032
            if (r2 == r4) goto L_0x0028
            if (r2 == r3) goto L_0x001f
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x001f:
            java.lang.Object r9 = r9.b
            java.lang.Throwable r9 = (java.lang.Throwable) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00af
        L_0x0028:
            java.lang.Object r0 = r9.b
            dla r0 = (defpackage.dla) r0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0030 }
            goto L_0x008a
        L_0x0030:
            r10 = move-exception
            goto L_0x0090
        L_0x0032:
            java.lang.Object r0 = r9.b
            dla r0 = (defpackage.dla) r0
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x0030 }
            goto L_0x007f
        L_0x003a:
            java.lang.Object r0 = r9.b
            dla r0 = (defpackage.dla) r0
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0067
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.b
            cwb r10 = (defpackage.cwb) r10
            yr1 r2 = new yr1
            r2.<init>(r0, r10)
            bi4 r10 = defpackage.dq4.a
            gc8 r10 = defpackage.lc8.a
            gc8 r10 = r10.t0()
            rv5 r8 = new rv5
            r8.<init>(r7, r2, r6)
            r9.b = r2
            r9.a = r0
            java.lang.Object r10 = defpackage.ev0.I(r10, r8, r9)
            if (r10 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r0 = r2
        L_0x0067:
            bi4 r10 = defpackage.dq4.a     // Catch:{ all -> 0x0030 }
            gc8 r10 = defpackage.lc8.a     // Catch:{ all -> 0x0030 }
            gc8 r10 = r10.t0()     // Catch:{ all -> 0x0030 }
            sv5 r2 = new sv5     // Catch:{ all -> 0x0030 }
            r2.<init>(r7, r0, r6)     // Catch:{ all -> 0x0030 }
            r9.b = r0     // Catch:{ all -> 0x0030 }
            r9.a = r5     // Catch:{ all -> 0x0030 }
            java.lang.Object r10 = defpackage.ev0.I(r10, r2, r9)     // Catch:{ all -> 0x0030 }
            if (r10 != r1) goto L_0x007f
            return r1
        L_0x007f:
            r9.b = r0     // Catch:{ all -> 0x0030 }
            r9.a = r4     // Catch:{ all -> 0x0030 }
            java.lang.Object r10 = defpackage.xk4.a(r9)     // Catch:{ all -> 0x0030 }
            if (r10 != r1) goto L_0x008a
            return r1
        L_0x008a:
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException     // Catch:{ all -> 0x0030 }
            r10.<init>()     // Catch:{ all -> 0x0030 }
            throw r10     // Catch:{ all -> 0x0030 }
        L_0x0090:
            bi4 r2 = defpackage.dq4.a
            gc8 r2 = defpackage.lc8.a
            gc8 r2 = r2.t0()
            caa r4 = defpackage.caa.a
            kotlin.coroutines.CoroutineContext r2 = r2.plus(r4)
            tv5 r4 = new tv5
            r4.<init>(r7, r0, r6)
            r9.b = r10
            r9.a = r3
            java.lang.Object r9 = defpackage.ev0.I(r2, r4, r9)
            if (r9 != r1) goto L_0x00ae
            return r1
        L_0x00ae:
            r9 = r10
        L_0x00af:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uv5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
