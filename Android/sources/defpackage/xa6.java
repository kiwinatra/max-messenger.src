package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: xa6  reason: default package */
public final class xa6 extends SuspendLambda implements Function2 {
    public Object a;
    public int b;
    public final /* synthetic */ ya6 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xa6(ya6 ya6, Continuation continuation) {
        super(2, continuation);
        this.c = ya6;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new xa6(this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xa6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: ua6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: ua6} */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 3
            r4 = 2
            r5 = 1
            ya6 r6 = r0.c
            if (r2 == 0) goto L_0x003f
            if (r2 == r5) goto L_0x0034
            if (r2 == r4) goto L_0x0029
            if (r2 != r3) goto L_0x0021
            java.lang.Object r0 = r0.a
            tz9 r0 = (defpackage.tz9) r0
            kotlin.ResultKt.throwOnFailure(r17)
            r2 = r0
            r0 = r17
            goto L_0x00b6
        L_0x0021:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0029:
            java.lang.Object r0 = r0.a
            tz9 r0 = (defpackage.tz9) r0
            kotlin.ResultKt.throwOnFailure(r17)
            r2 = r0
            r0 = r17
            goto L_0x0099
        L_0x0034:
            java.lang.Object r2 = r0.a
            ya6 r2 = (defpackage.ya6) r2
            kotlin.ResultKt.throwOnFailure(r17)
            r7 = r2
            r2 = r17
            goto L_0x005e
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r17)
            ia6 r2 = defpackage.ia6.a
            q4 r2 = r2.getAccessor()
            java.lang.Class<to9> r7 = defpackage.to9.class
            java.lang.Object r2 = r2.g(r7)
            to9 r2 = (defpackage.to9) r2
            java.util.Set r7 = r6.a
            r0.a = r6
            r0.b = r5
            java.lang.Object r2 = r2.b(r7, r0)
            if (r2 != r1) goto L_0x005d
            return r1
        L_0x005d:
            r7 = r6
        L_0x005e:
            java.util.List r2 = (java.util.List) r2
            r7.n = r2
            xme r2 = r6.l
            java.util.Set r7 = r6.a
            int r8 = r7.size()
            nb6 r9 = r6.b
            if (r8 <= r5) goto L_0x009c
            int r3 = r7.size()
            r0.a = r2
            r0.b = r4
            r9.getClass()
            ua6 r0 = new ua6
            int r4 = defpackage.ira.a
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r3)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            ggf r11 = new ggf
            java.util.List r5 = kotlin.collections.ArraysKt.toList((T[]) r5)
            r11.<init>(r5, r4, r3)
            r14 = 0
            r15 = 0
            r12 = 0
            r13 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            if (r0 != r1) goto L_0x0099
            return r1
        L_0x0099:
            ua6 r0 = (defpackage.ua6) r0
            goto L_0x00b8
        L_0x009c:
            java.util.List r4 = r6.n
            java.lang.Object r4 = kotlin.collections.CollectionsKt.firstOrNull(r4)
            ha9 r4 = (defpackage.ha9) r4
            if (r4 != 0) goto L_0x00a9
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00a9:
            r0.a = r2
            r0.b = r3
            java.lang.Long r3 = r6.e
            java.lang.Object r0 = r9.a(r4, r3, r0)
            if (r0 != r1) goto L_0x00b6
            return r1
        L_0x00b6:
            ua6 r0 = (defpackage.ua6) r0
        L_0x00b8:
            r2.setValue(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xa6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
