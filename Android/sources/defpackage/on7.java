package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

/* renamed from: on7  reason: default package */
public final class on7 extends RestrictedSuspendLambda implements Function2 {
    public s68 a;
    public iz2 b;
    public int c;
    public /* synthetic */ Object o;
    public final /* synthetic */ qn7 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public on7(qm7 qm7, Continuation continuation) {
        super(2, continuation);
        this.v = qm7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        on7 on7 = new on7((qm7) this.v, continuation);
        on7.o = obj;
        return on7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((on7) create((SequenceScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0026
            if (r1 == r3) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            iz2 r1 = r7.b
            s68 r3 = r7.a
            java.lang.Object r4 = r7.o
            kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0082
        L_0x001a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0022:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0087
        L_0x0026:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.o
            kotlin.sequences.SequenceScope r8 = (kotlin.sequences.SequenceScope) r8
            qn7 r1 = r7.v
            r1.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = defpackage.qn7.a
            java.lang.Object r1 = r4.get(r1)
            boolean r4 = r1 instanceof defpackage.iz2
            if (r4 == 0) goto L_0x0049
            iz2 r1 = (defpackage.iz2) r1
            kz2 r1 = r1.v
            r7.c = r3
            java.lang.Object r7 = r8.yield(r1, r7)
            if (r7 != r0) goto L_0x0087
            return r0
        L_0x0049:
            boolean r3 = r1 instanceof defpackage.oe7
            if (r3 == 0) goto L_0x0087
            oe7 r1 = (defpackage.oe7) r1
            x9a r1 = r1.b()
            if (r1 == 0) goto L_0x0087
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.u68.a
            java.lang.Object r3 = r3.get(r1)
            u68 r3 = (defpackage.u68) r3
            r4 = r8
            r6 = r3
            r3 = r1
            r1 = r6
        L_0x0061:
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r3)
            if (r8 != 0) goto L_0x0087
            boolean r8 = r1 instanceof defpackage.iz2
            if (r8 == 0) goto L_0x0082
            r8 = r1
            iz2 r8 = (defpackage.iz2) r8
            kz2 r8 = r8.v
            r7.o = r4
            r7.a = r3
            r5 = r1
            iz2 r5 = (defpackage.iz2) r5
            r7.b = r5
            r7.c = r2
            java.lang.Object r8 = r4.yield(r8, r7)
            if (r8 != r0) goto L_0x0082
            return r0
        L_0x0082:
            u68 r1 = r1.f()
            goto L_0x0061
        L_0x0087:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.on7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
