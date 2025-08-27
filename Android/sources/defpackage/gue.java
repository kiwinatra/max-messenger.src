package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: gue  reason: default package */
public final class gue extends SuspendLambda implements Function2 {
    public xse a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ iue o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gue(iue iue, Continuation continuation) {
        super(2, continuation);
        this.o = iue;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        gue gue = new gue(this.o, continuation);
        gue.c = obj;
        return gue;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gue) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.b
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x0028
            if (r1 == r2) goto L_0x0020
            if (r1 != r3) goto L_0x0018
            xse r0 = r12.a
            java.lang.Object r1 = r12.c
            d14 r1 = (defpackage.d14) r1
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0079
        L_0x0018:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0020:
            java.lang.Object r1 = r12.c
            d14 r1 = (defpackage.d14) r1
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0058
        L_0x0028:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.c
            d14 r13 = (defpackage.d14) r13
            iue r1 = r12.o
            java.util.concurrent.atomic.AtomicReference r1 = r1.g
            java.lang.Object r1 = r1.get()
            eue r1 = (defpackage.eue) r1
            iue r4 = r12.o
            kotlin.Lazy r4 = r4.b
            java.lang.Object r4 = r4.getValue()
            r5 = r4
            bte r5 = (defpackage.bte) r5
            java.lang.String r6 = r1.b
            long r7 = r1.a
            r12.c = r13
            r12.b = r2
            r10 = 4
            r9 = r12
            java.lang.Object r1 = defpackage.bte.d(r5, r6, r7, r9, r10)
            if (r1 != r0) goto L_0x0055
            return r0
        L_0x0055:
            r11 = r1
            r1 = r13
            r13 = r11
        L_0x0058:
            xse r13 = (defpackage.xse) r13
            iue r2 = r12.o
            kotlin.Lazy r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            vqe r2 = (defpackage.vqe) r2
            java.util.List r4 = r13.a
            wbe r2 = r2.c(r4)
            r12.c = r1
            r12.a = r13
            r12.b = r3
            java.lang.Object r2 = defpackage.bs0.f(r2, r12)
            if (r2 != r0) goto L_0x0077
            return r0
        L_0x0077:
            r0 = r13
            r13 = r2
        L_0x0079:
            java.util.List r13 = (java.util.List) r13
            iue r2 = r12.o
            java.util.concurrent.atomic.AtomicReference r2 = r2.g
            aue r4 = new aue
            r5 = 1
            r4.<init>(r0, r5)
            r2.updateAndGet(r4)
            iue r2 = r12.o
            xme r2 = r2.d
            java.lang.Object r2 = r2.getValue()
            fue r2 = (defpackage.fue) r2
            java.util.List r2 = r2.a
            if (r2 != 0) goto L_0x009a
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L_0x009a:
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.List r13 = kotlin.collections.CollectionsKt.plus(r2, r13)
            iue r12 = r12.o
            xme r12 = r12.d
            fue r2 = new fue
            r4 = 0
            r2.<init>(r3, r4, r13)
            r12.getClass()
            r13 = 0
            r12.m(r13, r2)
            java.lang.Class r12 = r1.getClass()
            java.lang.String r12 = r12.getName()
            a67 r1 = defpackage.z68.b
            if (r1 != 0) goto L_0x00c0
            goto L_0x00e9
        L_0x00c0:
            boolean r2 = r1.c()
            if (r2 == 0) goto L_0x00e9
            w78 r2 = defpackage.w78.o
            java.util.List r3 = r0.a
            int r3 = r3.size()
            long r4 = r0.b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r6 = "Stickers sets search. LoadNext. finish, size:"
            r0.<init>(r6)
            r0.append(r3)
            java.lang.String r3 = "|marker:"
            r0.append(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r1.d(r2, r12, r0, r13)
        L_0x00e9:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gue.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
