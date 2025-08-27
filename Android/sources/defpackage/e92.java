package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: e92  reason: default package */
public final class e92 extends SuspendLambda implements Function2 {
    public ia2 a;
    public int b;
    public final /* synthetic */ ia2 c;
    public final /* synthetic */ String o;
    public final /* synthetic */ List v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e92(ia2 ia2, String str, List list, Continuation continuation) {
        super(2, continuation);
        this.c = ia2;
        this.o = str;
        this.v = list;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new e92(this.c, this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((e92) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r8.b
            ia2 r3 = r8.c
            r4 = 3
            r5 = 2
            if (r2 == 0) goto L_0x0029
            if (r2 == r0) goto L_0x0025
            if (r2 == r5) goto L_0x001f
            if (r2 != r4) goto L_0x0017
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0068
        L_0x0017:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x001f:
            ia2 r3 = r8.a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x005a
        L_0x0025:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0049
        L_0x0029:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.String r9 = defpackage.ia2.K0
            c6d r9 = r3.g()
            r8.b = r0
            r9.getClass()
            ja5 r2 = new ja5
            java.util.List r6 = r8.v
            java.lang.String r7 = r8.o
            r2.<init>(r0, r9, r7, r6)
            i6d r9 = r9.a
            java.lang.Object r9 = defpackage.i8b.r(r9, r2, r8)
            if (r9 != r1) goto L_0x0049
            return r1
        L_0x0049:
            java.lang.String r9 = defpackage.ia2.K0
            c6d r9 = r3.g()
            r8.a = r3
            r8.b = r5
            java.lang.Object r9 = r9.e(r8)
            if (r9 != r1) goto L_0x005a
            return r1
        L_0x005a:
            java.util.List r9 = (java.util.List) r9
            r2 = 0
            r8.a = r2
            r8.b = r4
            java.lang.Object r8 = defpackage.ia2.n(r3, r9, r0, r8)
            if (r8 != r1) goto L_0x0068
            return r1
        L_0x0068:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e92.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
