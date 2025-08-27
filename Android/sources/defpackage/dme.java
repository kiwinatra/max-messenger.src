package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;

/* renamed from: dme  reason: default package */
public final class dme implements ds5 {
    public final /* synthetic */ Ref.BooleanRef a;
    public final /* synthetic */ ds5 b;

    public dme(Ref.BooleanRef booleanRef, ds5 ds5) {
        this.a = booleanRef;
        this.b = ds5;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj, Continuation continuation) {
        return e(((Number) obj).intValue(), continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(int r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.cme
            if (r0 == 0) goto L_0x0013
            r0 = r6
            cme r0 = (defpackage.cme) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.c = r1
            goto L_0x0018
        L_0x0013:
            cme r0 = new cme
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004b
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r6)
            if (r5 <= 0) goto L_0x004e
            kotlin.jvm.internal.Ref$BooleanRef r5 = r4.a
            boolean r6 = r5.element
            if (r6 != 0) goto L_0x004e
            r5.element = r3
            y6e r5 = defpackage.y6e.a
            r0.c = r3
            ds5 r4 = r4.b
            java.lang.Object r4 = r4.a(r5, r0)
            if (r4 != r1) goto L_0x004b
            return r1
        L_0x004b:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L_0x004e:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dme.e(int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
