package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xg2  reason: default package */
public final class xg2 extends SuspendLambda implements Function2 {
    public Object a;
    public s85 b;
    public int c;
    public final /* synthetic */ gh2 o;
    public final /* synthetic */ m29 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xg2(gh2 gh2, m29 m29, Continuation continuation) {
        super(2, continuation);
        this.o = gh2;
        this.v = m29;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new xg2(this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xg2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: gh2} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.c
            m29 r2 = r8.v
            r3 = 2
            r4 = 1
            gh2 r5 = r8.o
            if (r1 == 0) goto L_0x002d
            if (r1 == r4) goto L_0x0025
            if (r1 != r3) goto L_0x001d
            s85 r0 = r8.b
            java.lang.Object r8 = r8.a
            r5 = r8
            gh2 r5 = (defpackage.gh2) r5
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0069
        L_0x001d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0025:
            java.lang.Object r1 = r8.a
            a32 r1 = (defpackage.a32) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x004a
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.reflect.KProperty[] r9 = defpackage.gh2.P0
            a32 r1 = r5.o()
            if (r1 != 0) goto L_0x003b
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x003b:
            long r6 = r2.m()
            r8.a = r1
            r8.c = r4
            java.lang.Object r9 = r5.t(r6, r8)
            if (r9 != r0) goto L_0x004a
            return r0
        L_0x004a:
            a89 r9 = (defpackage.a89) r9
            if (r9 != 0) goto L_0x0051
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L_0x0051:
            s85 r4 = r5.I0
            kotlin.Lazy r6 = r5.F0
            java.lang.Object r6 = r6.getValue()
            wc2 r6 = (defpackage.wc2) r6
            r8.a = r5
            r8.b = r4
            r8.c = r3
            java.lang.Object r9 = r6.b(r1, r9, r2, r8)
            if (r9 != r0) goto L_0x0068
            return r0
        L_0x0068:
            r0 = r4
        L_0x0069:
            kotlin.reflect.KProperty[] r8 = defpackage.gh2.P0
            r5.getClass()
            defpackage.xag.h(r0, r9)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
