package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: rf3  reason: default package */
public final class rf3 extends SuspendLambda implements Function2 {
    public Object a;
    public int b;
    public final /* synthetic */ wf3 c;
    public final /* synthetic */ String o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rf3(wf3 wf3, String str, Continuation continuation) {
        super(2, continuation);
        this.c = wf3;
        this.o = str;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new rf3(this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rf3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0091 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cd A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.b
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 1
            r6 = 0
            r7 = 2
            wf3 r8 = r11.c
            if (r1 == 0) goto L_0x0040
            if (r1 == r5) goto L_0x003c
            if (r1 == r7) goto L_0x0034
            if (r1 == r4) goto L_0x0030
            if (r1 == r3) goto L_0x0027
            if (r1 != r2) goto L_0x001f
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00ce
        L_0x001f:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0027:
            java.lang.Object r1 = r11.a
            j80 r1 = (defpackage.j80) r1
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00af
        L_0x0030:
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0092
        L_0x0034:
            java.lang.Object r1 = r11.a
            java.lang.String r1 = (java.lang.String) r1
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x007d
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0058
        L_0x0040:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlin.Lazy r12 = r8.x
            java.lang.Object r12 = r12.getValue()
            t80 r12 = (defpackage.t80) r12
            java.lang.String r1 = r8.o
            r11.b = r5
            java.lang.String r5 = r11.o
            java.lang.Object r12 = r12.a(r5, r1, r11)
            if (r12 != r0) goto L_0x0058
            return r0
        L_0x0058:
            r1 = r12
            j80 r1 = (defpackage.j80) r1
            java.util.Map r12 = r1.c
            java.lang.String r5 = "LOGIN"
            boolean r12 = r12.containsKey(r5)
            ree r9 = defpackage.ree.a
            java.util.Map r10 = r1.c
            if (r12 == 0) goto L_0x009a
            java.lang.Object r12 = kotlin.collections.MapsKt.getValue(r10, r5)
            r1 = r12
            java.lang.String r1 = (java.lang.String) r1
            n6e r12 = r8.Z
            r11.a = r1
            r11.b = r7
            java.lang.Object r12 = r12.a(r9, r11)
            if (r12 != r0) goto L_0x007d
            return r0
        L_0x007d:
            kotlin.Lazy r12 = r8.w
            java.lang.Object r12 = r12.getValue()
            j98 r12 = (defpackage.j98) r12
            r11.a = r6
            r11.b = r4
            java.lang.String r2 = r8.v
            java.lang.Object r11 = r12.a(r1, r2, r11)
            if (r11 != r0) goto L_0x0092
            return r0
        L_0x0092:
            s85 r11 = r8.w0
            df3 r12 = defpackage.df3.b
            defpackage.xag.h(r11, r12)
            goto L_0x00ce
        L_0x009a:
            java.lang.String r12 = "REGISTER"
            boolean r12 = r10.containsKey(r12)
            if (r12 == 0) goto L_0x00ce
            n6e r12 = r8.Z
            r11.a = r1
            r11.b = r3
            java.lang.Object r12 = r12.a(r9, r11)
            if (r12 != r0) goto L_0x00af
            return r0
        L_0x00af:
            xme r12 = r8.A0
            qf3 r3 = new qf3
            r3.<init>(r7, r6)
            r4 = 2000(0x7d0, double:9.88E-321)
            wb r12 = defpackage.gt5.c(r12, r4, r3)
            vb r3 = new vb
            r4 = 13
            r3.<init>(r4, r8, r1)
            r11.a = r6
            r11.b = r2
            java.lang.Object r11 = r12.e(r3, r11)
            if (r11 != r0) goto L_0x00ce
            return r0
        L_0x00ce:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rf3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
