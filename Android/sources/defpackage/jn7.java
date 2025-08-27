package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* renamed from: jn7  reason: default package */
public final class jn7 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ q40 c;
    public final /* synthetic */ Function1 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jn7(q40 q40, et2 et2, Continuation continuation) {
        super(2, continuation);
        this.c = q40;
        this.o = et2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        jn7 jn7 = new jn7(this.c, (et2) this.o, continuation);
        jn7.b = obj;
        return jn7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jn7) create((hn7) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a1 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.a
            r2 = 2
            r3 = 1
            q40 r4 = r9.c
            if (r1 == 0) goto L_0x0025
            if (r1 == r3) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00a2
        L_0x0015:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x001d:
            java.lang.Object r1 = r9.b
            java.lang.String r1 = (java.lang.String) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x005a
        L_0x0025:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.b
            hn7 r10 = (defpackage.hn7) r10
            java.lang.String r1 = r10.a
            java.lang.Object r5 = r4.b
            kotlin.jvm.functions.Function2 r5 = (kotlin.jvm.functions.Function2) r5
            java.lang.Object r6 = r4.c
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Peek from queue job="
            r7.<init>(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            r5.invoke(r6, r7)
            pm7 r10 = r10.b
            boolean r5 = r10.isCancelled()
            if (r5 != 0) goto L_0x0074
            r9.b = r1
            r9.a = r3
            java.lang.Object r10 = r10.d(r9)
            if (r10 != r0) goto L_0x005a
            return r0
        L_0x005a:
            java.lang.Object r10 = r4.b
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            java.lang.Object r3 = r4.c
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Executed job="
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            r10.invoke(r3, r5)
            goto L_0x008d
        L_0x0074:
            java.lang.Object r10 = r4.b
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            java.lang.Object r3 = r4.c
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Cancelled job="
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            r10.invoke(r3, r5)
        L_0x008d:
            java.lang.Object r10 = r4.v
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10
            r10.remove(r1)
            r10 = 0
            r9.b = r10
            r9.a = r2
            kotlin.jvm.functions.Function1 r10 = r9.o
            java.lang.Object r9 = r10.invoke(r9)
            if (r9 != r0) goto L_0x00a2
            return r0
        L_0x00a2:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jn7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
