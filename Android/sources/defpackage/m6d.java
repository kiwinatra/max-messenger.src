package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: m6d  reason: default package */
public final class m6d extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ i6d c;
    public final /* synthetic */ Function1 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m6d(i6d i6d, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.c = i6d;
        this.o = function1;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        m6d m6d = new m6d(this.c, this.o, continuation);
        m6d.b = obj;
        return m6d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m6d) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.a
            java.lang.String r2 = "Transaction was never started or was already released."
            r3 = 1
            i6d r4 = r6.c
            if (r1 == 0) goto L_0x0021
            if (r1 != r3) goto L_0x0019
            java.lang.Object r6 = r6.b
            xqf r6 = (defpackage.xqf) r6
            kotlin.ResultKt.throwOnFailure(r7)     // Catch:{ all -> 0x0017 }
            goto L_0x004c
        L_0x0017:
            r7 = move-exception
            goto L_0x0065
        L_0x0019:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0021:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.b
            d14 r7 = (defpackage.d14) r7
            kotlin.coroutines.CoroutineContext r7 = r7.U()
            wqf r1 = defpackage.xqf.c
            kotlin.coroutines.CoroutineContext$Element r7 = r7.get(r1)
            xqf r7 = (defpackage.xqf) r7
            java.util.concurrent.atomic.AtomicInteger r1 = r7.b
            r1.incrementAndGet()
            r4.c()     // Catch:{ all -> 0x006b }
            kotlin.jvm.functions.Function1 r1 = r6.o     // Catch:{ all -> 0x0061 }
            r6.b = r7     // Catch:{ all -> 0x0061 }
            r6.a = r3     // Catch:{ all -> 0x0061 }
            java.lang.Object r6 = r1.invoke(r6)     // Catch:{ all -> 0x0061 }
            if (r6 != r0) goto L_0x0049
            return r0
        L_0x0049:
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x004c:
            r4.r()     // Catch:{ all -> 0x0017 }
            r4.l()     // Catch:{ all -> 0x0069 }
            java.util.concurrent.atomic.AtomicInteger r6 = r6.b
            int r6 = r6.decrementAndGet()
            if (r6 < 0) goto L_0x005b
            return r7
        L_0x005b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r2)
            throw r6
        L_0x0061:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0065:
            r4.l()     // Catch:{ all -> 0x0069 }
            throw r7     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r7 = move-exception
            goto L_0x006f
        L_0x006b:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x006f:
            java.util.concurrent.atomic.AtomicInteger r6 = r6.b
            int r6 = r6.decrementAndGet()
            if (r6 < 0) goto L_0x0078
            throw r7
        L_0x0078:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
