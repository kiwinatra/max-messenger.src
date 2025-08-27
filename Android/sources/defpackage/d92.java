package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: d92  reason: default package */
public final class d92 extends SuspendLambda implements Function2 {
    public ia2 a;
    public int b;
    public final /* synthetic */ ia2 c;
    public final /* synthetic */ Collection o;
    public final /* synthetic */ long v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d92(ia2 ia2, LinkedHashSet linkedHashSet, long j, Continuation continuation) {
        super(2, continuation);
        this.c = ia2;
        this.o = linkedHashSet;
        this.v = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new d92(this.c, (LinkedHashSet) this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d92) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.b
            r2 = 1
            ia2 r3 = r12.c
            r4 = 3
            r5 = 2
            if (r1 == 0) goto L_0x0029
            if (r1 == r2) goto L_0x0025
            if (r1 == r5) goto L_0x001f
            if (r1 != r4) goto L_0x0017
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x006e
        L_0x0017:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x001f:
            ia2 r3 = r12.a
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0060
        L_0x0025:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x004f
        L_0x0029:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.String r13 = defpackage.ia2.K0
            c6d r13 = r3.g()
            r12.b = r2
            r13.getClass()
            gu4 r1 = new gu4
            long r9 = r12.v
            java.util.Collection r6 = r12.o
            r8 = r6
            java.util.LinkedHashSet r8 = (java.util.LinkedHashSet) r8
            r11 = 2
            r6 = r1
            r7 = r13
            r6.<init>(r7, r8, r9, r11)
            i6d r13 = r13.a
            java.lang.Object r13 = defpackage.i8b.r(r13, r1, r12)
            if (r13 != r0) goto L_0x004f
            return r0
        L_0x004f:
            java.lang.String r13 = defpackage.ia2.K0
            c6d r13 = r3.g()
            r12.a = r3
            r12.b = r5
            java.lang.Object r13 = r13.e(r12)
            if (r13 != r0) goto L_0x0060
            return r0
        L_0x0060:
            java.util.List r13 = (java.util.List) r13
            r1 = 0
            r12.a = r1
            r12.b = r4
            java.lang.Object r12 = defpackage.ia2.n(r3, r13, r2, r12)
            if (r12 != r0) goto L_0x006e
            return r0
        L_0x006e:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d92.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
