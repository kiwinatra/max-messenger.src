package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: kb  reason: default package */
public final class kb extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ lb b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kb(lb lbVar, Continuation continuation) {
        super(2, continuation);
        this.b = lbVar;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new kb(this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kb) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.a
            r2 = 3
            r3 = 2
            r4 = 1
            lb r5 = r6.b
            if (r1 == 0) goto L_0x0027
            if (r1 == r4) goto L_0x0023
            if (r1 == r3) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0068
        L_0x0017:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x001f:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0044
        L_0x0023:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0033
        L_0x0027:
            kotlin.ResultKt.throwOnFailure(r7)
            r6.a = r4
            java.lang.Object r7 = defpackage.lb.a(r5, r6)
            if (r7 != r0) goto L_0x0033
            return r0
        L_0x0033:
            kotlin.sequences.Sequence r7 = (kotlin.sequences.Sequence) r7
            java.util.List r7 = kotlin.sequences.SequencesKt.toList(r7)
            java.util.Collection r7 = (java.util.Collection) r7
            r6.a = r3
            java.lang.Object r7 = defpackage.j4b.g(r7, r6)
            if (r7 != r0) goto L_0x0044
            return r0
        L_0x0044:
            java.util.Collection r7 = (java.util.Collection) r7
            java.util.List r7 = kotlin.collections.CollectionsKt.toMutableList(r7)
            kotlin.Lazy r1 = r5.b
            java.lang.Object r1 = r1.getValue()
            ns3 r1 = (defpackage.ns3) r1
            h9 r3 = new h9
            r4 = 8
            r3.<init>(r4)
            r1.c(r7, r3)
            r6.a = r2
            xme r6 = r5.i
            r6.setValue(r7)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            if (r6 != r0) goto L_0x0068
            return r0
        L_0x0068:
            java.util.concurrent.atomic.AtomicBoolean r6 = r5.g
            r7 = 0
            r6.set(r7)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
