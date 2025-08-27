package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: jd7  reason: default package */
public final class jd7 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ yd7 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jd7(yd7 yd7, Continuation continuation) {
        super(2, continuation);
        this.c = yd7;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        jd7 jd7 = new jd7(this.c, continuation);
        jd7.b = obj;
        return jd7;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jd7) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: d14} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.a
            r2 = 2
            r3 = 1
            r4 = 0
            yd7 r5 = r9.c
            if (r1 == 0) goto L_0x0025
            if (r1 == r3) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0080
        L_0x0015:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x001d:
            java.lang.Object r1 = r9.b
            d14 r1 = (defpackage.d14) r1
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0045
        L_0x0025:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.b
            r1 = r10
            d14 r1 = (defpackage.d14) r1
            r9.b = r1
            r9.a = r3
            gaf r10 = r5.c
            osa r10 = (defpackage.osa) r10
            q04 r10 = r10.b()
            bd7 r3 = new bd7
            r3.<init>(r5, r4)
            java.lang.Object r10 = defpackage.ev0.I(r10, r3, r9)
            if (r10 != r0) goto L_0x0045
            return r0
        L_0x0045:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r3 = new java.util.ArrayList
            int r6 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r10, 10)
            r3.<init>(r6)
            java.util.Iterator r10 = r10.iterator()
        L_0x0054:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L_0x0075
            java.lang.Object r6 = r10.next()
            wk6 r6 = (defpackage.wk6) r6
            gaf r7 = r5.c
            osa r7 = (defpackage.osa) r7
            q04 r7 = r7.b()
            id7 r8 = new id7
            r8.<init>(r5, r6, r4)
            nk4 r6 = defpackage.ev0.d(r1, r7, r8, r2)
            r3.add(r6)
            goto L_0x0054
        L_0x0075:
            r9.b = r4
            r9.a = r2
            java.lang.Object r10 = defpackage.j4b.g(r3, r9)
            if (r10 != r0) goto L_0x0080
            return r0
        L_0x0080:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            j95 r9 = new j95
            r0 = 1
            r9.<init>(r0, r5)
            java.util.List r9 = kotlin.collections.CollectionsKt.sortedWith(r10, r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jd7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
