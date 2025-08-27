package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: w92  reason: default package */
public final class w92 extends SuspendLambda implements Function2 {
    public ia2 a;
    public int b;
    public final /* synthetic */ ia2 c;
    public final /* synthetic */ long o;
    public final /* synthetic */ List v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w92(ia2 ia2, long j, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.c = ia2;
        this.o = j;
        this.v = arrayList;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new w92(this.c, this.o, (ArrayList) this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((w92) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0069 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.b
            r2 = 1
            ia2 r3 = r9.c
            r4 = 3
            r5 = 2
            if (r1 == 0) goto L_0x0029
            if (r1 == r2) goto L_0x0025
            if (r1 == r5) goto L_0x001f
            if (r1 != r4) goto L_0x0017
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x006a
        L_0x0017:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x001f:
            ia2 r3 = r9.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x005c
        L_0x0025:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x004b
        L_0x0029:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.String r10 = defpackage.ia2.K0
            c6d r10 = r3.g()
            r9.b = r2
            r10.getClass()
            s5d r1 = new s5d
            java.util.List r6 = r9.v
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            long r7 = r9.o
            r1.<init>(r10, r7, r6)
            i6d r10 = r10.a
            java.lang.Object r10 = defpackage.n6d.a(r10, r1, r9)
            if (r10 != r0) goto L_0x004b
            return r0
        L_0x004b:
            java.lang.String r10 = defpackage.ia2.K0
            c6d r10 = r3.g()
            r9.a = r3
            r9.b = r5
            java.lang.Object r10 = r10.e(r9)
            if (r10 != r0) goto L_0x005c
            return r0
        L_0x005c:
            java.util.List r10 = (java.util.List) r10
            r1 = 0
            r9.a = r1
            r9.b = r4
            java.lang.Object r9 = defpackage.ia2.n(r3, r10, r2, r9)
            if (r9 != r0) goto L_0x006a
            return r0
        L_0x006a:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w92.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
