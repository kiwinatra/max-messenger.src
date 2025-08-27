package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: pl3  reason: default package */
public final class pl3 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ cm3 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pl3(cm3 cm3, Continuation continuation) {
        super(2, continuation);
        this.b = cm3;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        pl3 pl3 = new pl3(this.b, continuation);
        pl3.a = obj;
        return pl3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((pl3) create((h02) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [e02] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if ((r8 != null && !r8.e) != false) goto L_0x0055;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0048  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.a
            h02 r8 = (defpackage.h02) r8
            cm3 r7 = r7.b
            xme r0 = r7.c
            java.lang.Object r1 = r0.getValue()
            e02 r1 = (defpackage.e02) r1
            r2 = 0
            if (r1 == 0) goto L_0x005b
            xme r3 = r7.h
            java.lang.Object r3 = r3.getValue()
            h02 r3 = (defpackage.h02) r3
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x0034
            if (r8 == 0) goto L_0x002f
            java.lang.String r6 = r8.b
            java.lang.String r3 = r3.b
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r6)
            r3 = r3 ^ r5
            goto L_0x0030
        L_0x002f:
            r3 = r4
        L_0x0030:
            if (r3 != r5) goto L_0x0034
            r3 = r5
            goto L_0x0035
        L_0x0034:
            r3 = r4
        L_0x0035:
            if (r8 == 0) goto L_0x0039
            java.lang.String r2 = r8.b
        L_0x0039:
            if (r2 == 0) goto L_0x0044
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r2 = r4
            goto L_0x0045
        L_0x0044:
            r2 = r5
        L_0x0045:
            r2 = r2 ^ r5
            if (r2 == 0) goto L_0x0054
            if (r8 == 0) goto L_0x0050
            boolean r8 = r8.e
            if (r8 != 0) goto L_0x0050
            r8 = r5
            goto L_0x0051
        L_0x0050:
            r8 = r4
        L_0x0051:
            if (r8 == 0) goto L_0x0054
            goto L_0x0055
        L_0x0054:
            r5 = r4
        L_0x0055:
            r8 = 9
            e02 r2 = defpackage.e02.a(r1, r3, r5, r4, r8)
        L_0x005b:
            r0.setValue(r2)
            kotlin.Lazy r8 = r7.g
            java.lang.Object r8 = r8.getValue()
            xz1 r8 = (defpackage.xz1) r8
            java.util.List r8 = r8.a(r7)
            xme r7 = r7.d
            r7.setValue(r8)
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pl3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
