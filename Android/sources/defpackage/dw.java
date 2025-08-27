package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: dw  reason: default package */
public final class dw extends SuspendLambda implements Function2 {
    public int a;
    public int b;
    public final /* synthetic */ mk4 c;
    public final /* synthetic */ mk4 o;
    public final /* synthetic */ gx v;
    public final /* synthetic */ long w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dw(nk4 nk4, nk4 nk42, gx gxVar, long j, Continuation continuation) {
        super(2, continuation);
        this.c = nk4;
        this.o = nk42;
        this.v = gxVar;
        this.w = j;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new dw((nk4) this.c, (nk4) this.o, this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dw) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.b
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0027
            if (r1 == r4) goto L_0x0023
            if (r1 == r3) goto L_0x001d
            if (r1 != r2) goto L_0x0015
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0069
        L_0x0015:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x001d:
            int r1 = r7.a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0048
        L_0x0023:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0035
        L_0x0027:
            kotlin.ResultKt.throwOnFailure(r8)
            r7.b = r4
            mk4 r8 = r7.c
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L_0x0035
            return r0
        L_0x0035:
            java.lang.Number r8 = (java.lang.Number) r8
            int r1 = r8.intValue()
            r7.a = r1
            r7.b = r3
            mk4 r8 = r7.o
            java.lang.Object r8 = r8.a(r7)
            if (r8 != r0) goto L_0x0048
            return r0
        L_0x0048:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r1 >= 0) goto L_0x0052
            if (r8 < 0) goto L_0x0069
        L_0x0052:
            kotlin.reflect.KProperty[] r8 = defpackage.gx.F
            gx r8 = r7.v
            long r3 = r8.i()
            long r5 = r7.w
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0069
            r7.b = r2
            java.lang.Object r7 = r8.s(r5, r7)
            if (r7 != r0) goto L_0x0069
            return r0
        L_0x0069:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
