package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: g21  reason: default package */
public final class g21 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ k21 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g21(k21 k21, Continuation continuation) {
        super(2, continuation);
        this.b = k21;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        g21 g21 = new g21(this.b, continuation);
        g21.a = obj;
        return g21;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g21) create((a51) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.a
            a51 r13 = (defpackage.a51) r13
            boolean r0 = r13 instanceof defpackage.v41
            r1 = 0
            k21 r12 = r12.b
            if (r0 == 0) goto L_0x0042
            v41 r13 = (defpackage.v41) r13
            long r2 = r13.a
            java.lang.Long r13 = r12.o
            if (r13 != 0) goto L_0x001b
            goto L_0x00a3
        L_0x001b:
            long r4 = r13.longValue()
            int r13 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r13 != 0) goto L_0x00a3
            r12.o = r1
        L_0x0025:
            xme r13 = r12.j
            java.lang.Object r0 = r13.getValue()
            r1 = r0
            y11 r1 = (defpackage.y11) r1
            y11 r1 = new y11
            r5 = 0
            r6 = 0
            r3 = 0
            r4 = 0
            r7 = 30
            r2 = r1
            r2.<init>((java.lang.Long) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.Long) r6, (int) r7)
            boolean r13 = r13.b(r0, r1)
            if (r13 == 0) goto L_0x0025
            goto L_0x00a3
        L_0x0042:
            boolean r0 = r13 instanceof defpackage.w41
            if (r0 == 0) goto L_0x00a3
            w41 r13 = (defpackage.w41) r13
            nw7 r0 = r13.a
            long r2 = r0.a
            java.lang.Long r0 = r12.o
            if (r0 != 0) goto L_0x0051
            goto L_0x00a3
        L_0x0051:
            long r4 = r0.longValue()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00a3
            r12.o = r1
        L_0x005b:
            xme r0 = r12.j
            java.lang.Object r2 = r0.getValue()
            r3 = r2
            y11 r3 = (defpackage.y11) r3
            nw7 r3 = r13.a
            gv6 r4 = r3.v
            if (r4 == 0) goto L_0x0071
            java.lang.String r5 = r4.v
            if (r5 != 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r8 = r5
            goto L_0x0079
        L_0x0071:
            d4g r5 = r3.w
            if (r5 == 0) goto L_0x0078
            java.lang.String r5 = r5.o
            goto L_0x006f
        L_0x0078:
            r8 = r1
        L_0x0079:
            if (r4 == 0) goto L_0x007f
            java.lang.String r4 = r4.w
            r9 = r4
            goto L_0x0080
        L_0x007f:
            r9 = r1
        L_0x0080:
            java.util.regex.Pattern r4 = defpackage.vua.a
            if (r8 != 0) goto L_0x0087
            java.lang.String r4 = ""
            goto L_0x0088
        L_0x0087:
            r4 = r8
        L_0x0088:
            kotlin.Lazy r5 = r12.e
            java.lang.Object r5 = r5.getValue()
            yva r5 = (defpackage.yva) r5
            java.lang.CharSequence r11 = defpackage.vua.a(r4, r5)
            y11 r4 = new y11
            java.lang.Long r10 = r3.b
            r6 = r4
            r7 = r10
            r6.<init>((java.lang.Long) r7, (java.lang.CharSequence) r8, (java.lang.String) r9, (java.lang.Long) r10, (java.lang.CharSequence) r11)
            boolean r0 = r0.b(r2, r4)
            if (r0 == 0) goto L_0x005b
        L_0x00a3:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g21.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
