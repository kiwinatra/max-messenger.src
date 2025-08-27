package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: qt5  reason: default package */
public final class qt5 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ds5 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qt5(ds5 ds5, Continuation continuation) {
        super(2, continuation);
        this.c = ds5;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        qt5 qt5 = new qt5(this.c, continuation);
        qt5.b = obj;
        return qt5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((qt5) create(new e22(((e22) obj).a), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r3.a
            r2 = 1
            if (r1 == 0) goto L_0x0019
            if (r1 != r2) goto L_0x0011
            java.lang.Object r3 = r3.b
            kotlin.ResultKt.throwOnFailure(r4)
            goto L_0x0034
        L_0x0011:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L_0x0019:
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.Object r4 = r3.b
            e22 r4 = (defpackage.e22) r4
            java.lang.Object r4 = r4.a
            boolean r1 = r4 instanceof defpackage.d22
            if (r1 != 0) goto L_0x0035
            r3.b = r4
            r3.a = r2
            ds5 r1 = r3.c
            java.lang.Object r3 = r1.a(r4, r3)
            if (r3 != r0) goto L_0x0033
            return r0
        L_0x0033:
            r3 = r4
        L_0x0034:
            r4 = r3
        L_0x0035:
            boolean r3 = r4 instanceof defpackage.c22
            if (r3 == 0) goto L_0x0046
            java.lang.Throwable r3 = defpackage.e22.a(r4)
            if (r3 != 0) goto L_0x0045
            r3 = 0
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            return r3
        L_0x0045:
            throw r3
        L_0x0046:
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qt5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
