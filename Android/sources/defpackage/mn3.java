package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: mn3  reason: default package */
public final class mn3 extends SuspendLambda implements Function2 {
    public final /* synthetic */ pn3 a;
    public final /* synthetic */ oz4 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mn3(pn3 pn3, oz4 oz4, Continuation continuation) {
        super(2, continuation);
        this.a = pn3;
        this.b = oz4;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new mn3(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mn3) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if ((!(r8 == null || r8.length() == 0)) != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r9)
            pn3 r9 = r8.a
            kotlin.Lazy r0 = r9.A
            java.lang.Object r0 = r0.getValue()
            r1 = r0
            rl r1 = (defpackage.rl) r1
            oz4 r8 = r8.b
            java.lang.String r0 = r8.c
            r2 = 0
            if (r0 == 0) goto L_0x0021
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r0)
            java.lang.String r0 = r0.toString()
            goto L_0x0022
        L_0x0021:
            r0 = r2
        L_0x0022:
            if (r0 != 0) goto L_0x0026
            java.lang.String r0 = ""
        L_0x0026:
            java.lang.String r3 = r8.f
            if (r3 == 0) goto L_0x0033
            java.lang.CharSequence r3 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r3)
            java.lang.String r3 = r3.toString()
            goto L_0x0034
        L_0x0033:
            r3 = r2
        L_0x0034:
            xme r9 = r9.j
            java.lang.Object r4 = r9.getValue()
            oz4 r4 = (defpackage.oz4) r4
            if (r4 == 0) goto L_0x0041
            java.lang.String r4 = r4.h
            goto L_0x0042
        L_0x0041:
            r4 = r2
        L_0x0042:
            java.lang.String r8 = r8.h
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r8)
            r5 = 1
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x005d
            if (r8 == 0) goto L_0x0057
            int r4 = r8.length()
            if (r4 != 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r4 = 0
            goto L_0x0058
        L_0x0057:
            r4 = r5
        L_0x0058:
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x005d
        L_0x005b:
            r6 = r8
            goto L_0x007c
        L_0x005d:
            java.lang.Object r9 = r9.getValue()
            oz4 r9 = (defpackage.oz4) r9
            if (r9 == 0) goto L_0x0068
            java.lang.String r9 = r9.h
            goto L_0x0069
        L_0x0068:
            r9 = r2
        L_0x0069:
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r8)
            r9 = r9 ^ r5
            if (r9 == 0) goto L_0x007b
            if (r8 == 0) goto L_0x0078
            int r8 = r8.length()
            if (r8 != 0) goto L_0x007b
        L_0x0078:
            java.lang.String r8 = "$REMOVE$"
            goto L_0x005b
        L_0x007b:
            r6 = r2
        L_0x007c:
            r5 = 0
            r7 = 0
            r4 = 0
            r2 = r0
            long r8 = ((defpackage.jna) r1).P(r2, r3, r4, r5, r6, r7, 0, defpackage.he0.USER_AVATAR)
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mn3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
