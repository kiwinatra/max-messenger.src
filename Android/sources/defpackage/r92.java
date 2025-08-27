package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: r92  reason: default package */
public final class r92 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ia2 c;
    public final /* synthetic */ long o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r92(ia2 ia2, long j, Continuation continuation) {
        super(2, continuation);
        this.c = ia2;
        this.o = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        r92 r92 = new r92(this.c, this.o, continuation);
        r92.b = obj;
        return r92;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r92) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: ia2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0080 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.a
            r2 = 1
            ia2 r3 = r9.c
            r4 = 3
            r5 = 2
            if (r1 == 0) goto L_0x002e
            if (r1 == r2) goto L_0x0028
            if (r1 == r5) goto L_0x001f
            if (r1 != r4) goto L_0x0017
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0081
        L_0x0017:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x001f:
            java.lang.Object r1 = r9.b
            r3 = r1
            ia2 r3 = (defpackage.ia2) r3
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0073
        L_0x0028:
            kotlin.ResultKt.throwOnFailure(r10)     // Catch:{ all -> 0x002c }
            goto L_0x0053
        L_0x002c:
            r10 = move-exception
            goto L_0x0059
        L_0x002e:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.b
            d14 r10 = (defpackage.d14) r10
            long r6 = r9.o
            kotlin.Result$Companion r10 = kotlin.Result.Companion     // Catch:{ all -> 0x002c }
            java.lang.String r10 = defpackage.ia2.K0     // Catch:{ all -> 0x002c }
            c6d r10 = r3.g()     // Catch:{ all -> 0x002c }
            r9.a = r2     // Catch:{ all -> 0x002c }
            r10.getClass()     // Catch:{ all -> 0x002c }
            a6d r1 = new a6d     // Catch:{ all -> 0x002c }
            r8 = 0
            r1.<init>(r10, r6, r8)     // Catch:{ all -> 0x002c }
            i6d r10 = r10.a     // Catch:{ all -> 0x002c }
            java.lang.Object r10 = defpackage.i8b.r(r10, r1, r9)     // Catch:{ all -> 0x002c }
            if (r10 != r0) goto L_0x0053
            return r0
        L_0x0053:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x002c }
            kotlin.Result.m23constructorimpl(r10)     // Catch:{ all -> 0x002c }
            goto L_0x0062
        L_0x0059:
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r10)
            kotlin.Result.m23constructorimpl(r10)
        L_0x0062:
            java.lang.String r10 = defpackage.ia2.K0
            c6d r10 = r3.g()
            r9.b = r3
            r9.a = r5
            java.lang.Object r10 = r10.e(r9)
            if (r10 != r0) goto L_0x0073
            return r0
        L_0x0073:
            java.util.List r10 = (java.util.List) r10
            r1 = 0
            r9.b = r1
            r9.a = r4
            java.lang.Object r9 = defpackage.ia2.n(r3, r10, r2, r9)
            if (r9 != r0) goto L_0x0081
            return r0
        L_0x0081:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r92.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
