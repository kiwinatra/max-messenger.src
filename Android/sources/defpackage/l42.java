package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: l42  reason: default package */
public final class l42 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ h52 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l42(h52 h52, Continuation continuation) {
        super(2, continuation);
        this.b = h52;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        l42 l42 = new l42(this.b, continuation);
        l42.a = obj;
        return l42;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l42) create((g02) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [e02] */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x005f, code lost:
        if (r9.f == false) goto L_0x0044;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.a
            g02 r9 = (defpackage.g02) r9
            h52 r8 = r8.b
            xme r0 = r8.c
            java.lang.Object r1 = r0.getValue()
            e02 r1 = (defpackage.e02) r1
            r2 = 0
            if (r1 == 0) goto L_0x006c
            xme r3 = r8.h
            java.lang.Object r3 = r3.getValue()
            g02 r3 = (defpackage.g02) r3
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x002b
            boolean r3 = r3.b(r9)
            if (r3 != r4) goto L_0x002b
            r3 = r4
            goto L_0x002c
        L_0x002b:
            r3 = r5
        L_0x002c:
            if (r9 == 0) goto L_0x0030
            f02 r2 = r9.b
        L_0x0030:
            r6 = -1
            if (r2 != 0) goto L_0x0035
            r2 = r6
            goto L_0x003d
        L_0x0035:
            int[] r7 = defpackage.k42.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r7[r2]
        L_0x003d:
            if (r2 == r6) goto L_0x0062
            if (r2 == r4) goto L_0x004c
            r9 = 2
            if (r2 != r9) goto L_0x0046
        L_0x0044:
            r5 = r4
            goto L_0x0062
        L_0x0046:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L_0x004c:
            java.lang.String r2 = r9.c
            if (r2 == 0) goto L_0x0059
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r2 = r5
            goto L_0x005a
        L_0x0059:
            r2 = r4
        L_0x005a:
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x0062
            boolean r9 = r9.f
            if (r9 != 0) goto L_0x0062
            goto L_0x0044
        L_0x0062:
            java.util.concurrent.atomic.AtomicBoolean r9 = r8.x
            boolean r9 = r9.get()
            e02 r2 = defpackage.e02.a(r1, r3, r5, r9, r4)
        L_0x006c:
            r0.setValue(r2)
            kotlin.Lazy r9 = r8.g
            java.lang.Object r9 = r9.getValue()
            xz1 r9 = (defpackage.xz1) r9
            java.util.List r9 = r9.a(r8)
            xme r8 = r8.d
            r8.setValue(r9)
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l42.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
