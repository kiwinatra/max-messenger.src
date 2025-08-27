package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: jp3  reason: default package */
public final class jp3 extends SuspendLambda implements Function2 {
    public Collection a;
    public List b;
    public int c;
    public final /* synthetic */ kp3 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jp3(kp3 kp3, Continuation continuation) {
        super(2, continuation);
        this.o = kp3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new jp3(this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jp3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.c
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            kp3 r7 = r9.o
            if (r1 == 0) goto L_0x0046
            if (r1 == r6) goto L_0x0042
            if (r1 == r5) goto L_0x003a
            if (r1 == r4) goto L_0x0032
            if (r1 == r3) goto L_0x0026
            if (r1 != r2) goto L_0x001e
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00ad
        L_0x001e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0026:
            java.util.List r1 = r9.b
            java.util.List r1 = (java.util.List) r1
            java.util.Collection r3 = r9.a
            java.util.List r3 = (java.util.List) r3
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0092
        L_0x0032:
            java.util.Collection r1 = r9.a
            java.util.Collection r1 = (java.util.Collection) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0076
        L_0x003a:
            java.util.Collection r1 = r9.a
            java.util.Collection r1 = (java.util.Collection) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0063
        L_0x0042:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0052
        L_0x0046:
            kotlin.ResultKt.throwOnFailure(r10)
            r9.c = r6
            java.lang.Object r10 = defpackage.kp3.a(r7, r9)
            if (r10 != r0) goto L_0x0052
            return r0
        L_0x0052:
            r1 = r10
            java.util.Collection r1 = (java.util.Collection) r1
            r10 = r1
            java.util.Collection r10 = (java.util.Collection) r10
            r9.a = r10
            r9.c = r5
            java.lang.Object r10 = defpackage.kp3.b(r7, r9)
            if (r10 != r0) goto L_0x0063
            return r0
        L_0x0063:
            java.util.Collection r10 = (java.util.Collection) r10
            r5 = r10
            java.util.Collection r5 = (java.util.Collection) r5
            r9.a = r5
            r9.c = r4
            java.lang.Object r1 = defpackage.j4b.g(r1, r9)
            if (r1 != r0) goto L_0x0073
            return r0
        L_0x0073:
            r8 = r1
            r1 = r10
            r10 = r8
        L_0x0076:
            java.util.List r10 = (java.util.List) r10
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            r5 = r10
            java.util.Collection r5 = (java.util.Collection) r5
            r9.a = r5
            r5 = r4
            java.util.List r5 = (java.util.List) r5
            r9.b = r5
            r9.c = r3
            java.lang.Object r1 = defpackage.j4b.g(r1, r9)
            if (r1 != r0) goto L_0x008f
            return r0
        L_0x008f:
            r3 = r10
            r10 = r1
            r1 = r4
        L_0x0092:
            java.util.List r10 = (java.util.List) r10
            po3 r4 = new po3
            r4.<init>(r3, r1, r10)
            xme r10 = r7.i
            r1 = 0
            r9.a = r1
            r9.b = r1
            r9.c = r2
            r10.getClass()
            r10.m(r1, r4)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            if (r9 != r0) goto L_0x00ad
            return r0
        L_0x00ad:
            java.util.concurrent.atomic.AtomicBoolean r9 = r7.m
            r10 = 0
            r9.set(r10)
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
