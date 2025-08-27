package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: la6  reason: default package */
public final class la6 extends SuspendLambda implements Function2 {
    public qx2 a;
    public int b;
    public final /* synthetic */ qa6 c;
    public final /* synthetic */ ra3 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public la6(qa6 qa6, sa3 sa3, Continuation continuation) {
        super(2, continuation);
        this.c = qa6;
        this.o = sa3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new la6(this.c, (sa3) this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((la6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: qx2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004f
        L_0x0012:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x001a:
            qx2 r1 = r5.a
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x003d
        L_0x0020:
            kotlin.ResultKt.throwOnFailure(r6)
            qa6 r6 = r5.c
            kotlin.Lazy r6 = r6.c
            java.lang.Object r6 = r6.getValue()
            r1 = r6
            qx2 r1 = (defpackage.qx2) r1
            r5.a = r1
            r5.b = r3
            ra3 r6 = r5.o
            sa3 r6 = (defpackage.sa3) r6
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r0) goto L_0x003d
            return r0
        L_0x003d:
            java.lang.Number r6 = (java.lang.Number) r6
            long r3 = r6.longValue()
            r6 = 0
            r5.a = r6
            r5.b = r2
            java.lang.Object r6 = r1.d(r3, r5)
            if (r6 != r0) goto L_0x004f
            return r0
        L_0x004f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.la6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
