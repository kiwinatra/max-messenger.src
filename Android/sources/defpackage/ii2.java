package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: ii2  reason: default package */
public final class ii2 extends SuspendLambda implements Function2 {
    public hr8 a;
    public int b;
    public int c;
    public int o;
    public final /* synthetic */ aj2 v;
    public final /* synthetic */ int w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ii2(aj2 aj2, int i, Continuation continuation) {
        super(2, continuation);
        this.v = aj2;
        this.w = i;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new ii2(this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ii2) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            r0 = 2
            r1 = 1
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r11.o
            r4 = 0
            if (r3 == 0) goto L_0x002e
            if (r3 == r1) goto L_0x0022
            if (r3 != r0) goto L_0x001a
            int r0 = r11.c
            int r2 = r11.b
            hr8 r3 = r11.a
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00e4
        L_0x001a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0022:
            int r3 = r11.c
            int r5 = r11.b
            hr8 r6 = r11.a
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = r6
            goto L_0x00ce
        L_0x002e:
            kotlin.ResultKt.throwOnFailure(r12)
            aj2 r12 = r11.v
            xme r12 = r12.N0
            java.lang.Object r12 = r12.getValue()
            ai2 r12 = (defpackage.ai2) r12
            java.util.List r12 = r12.a
            int r3 = r11.w
            java.lang.Object r12 = r12.get(r3)
            hr8 r12 = (defpackage.hr8) r12
            aj2 r3 = r11.v
            java.util.concurrent.atomic.AtomicReference r3 = r3.I0
            n01 r5 = new n01
            r5.<init>(r0, r12)
            java.lang.Object r3 = r3.getAndUpdate(r5)
            java.lang.String r3 = (java.lang.String) r3
            aj2 r5 = r11.v
            xme r5 = r5.N0
            java.lang.Object r5 = r5.getValue()
            ai2 r5 = (defpackage.ai2) r5
            java.util.List r5 = r5.a
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
        L_0x0065:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x007e
            java.lang.Object r7 = r5.next()
            hr8 r7 = (defpackage.hr8) r7
            java.lang.String r7 = r7.v()
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r3)
            if (r7 == 0) goto L_0x007c
            goto L_0x007f
        L_0x007c:
            int r6 = r6 + r1
            goto L_0x0065
        L_0x007e:
            r6 = -1
        L_0x007f:
            java.lang.String r5 = r12.v()
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r5)
            if (r3 == 0) goto L_0x008c
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x008c:
            aj2 r3 = r11.v
            java.lang.String r3 = r3.Z
            int r5 = r11.w
            a67 r7 = defpackage.z68.b
            if (r7 != 0) goto L_0x0097
            goto L_0x00aa
        L_0x0097:
            boolean r8 = r7.c()
            if (r8 == 0) goto L_0x00aa
            w78 r8 = defpackage.w78.o
            java.lang.String r9 = "Media viewer. On new page selected newPos:"
            java.lang.String r10 = ", prev:"
            java.lang.String r5 = defpackage.g63.h(r9, r5, r6, r10)
            r7.d(r8, r3, r5, r4)
        L_0x00aa:
            aj2 r3 = r11.v
            xme r3 = r3.N0
            java.lang.Object r3 = r3.getValue()
            ai2 r3 = (defpackage.ai2) r3
            java.util.List r3 = r3.a
            int r3 = r3.size()
            aj2 r5 = r11.v
            int r7 = r11.w
            r11.a = r12
            r11.b = r6
            r11.c = r3
            r11.o = r1
            java.lang.Object r5 = r5.y(r7, r12, r3, r11)
            if (r5 != r2) goto L_0x00cd
            return r2
        L_0x00cd:
            r5 = r6
        L_0x00ce:
            aj2 r6 = r11.v
            r11.a = r12
            r11.b = r5
            r11.c = r3
            r11.o = r0
            kotlin.reflect.KProperty[] r0 = defpackage.aj2.b1
            java.lang.Object r0 = r6.x(r12, r11)
            if (r0 != r2) goto L_0x00e1
            return r2
        L_0x00e1:
            r0 = r3
            r2 = r5
            r3 = r12
        L_0x00e4:
            aj2 r12 = r11.v
            java.util.concurrent.atomic.AtomicReference r12 = r12.H0
            java.lang.Object r12 = r12.get()
            zh2 r12 = (defpackage.zh2) r12
            aj2 r5 = r11.v
            boolean r6 = r5.v
            r7 = 5
            if (r6 == 0) goto L_0x0130
            boolean r6 = r12.b
            if (r6 == 0) goto L_0x0112
            int r6 = r11.w
            if (r2 <= r6) goto L_0x0112
            if (r6 > r7) goto L_0x0112
            java.lang.String r12 = r5.Z
            java.lang.String r0 = "Media viewer. Call load next, desc order"
            defpackage.z68.c(r12, r0, new java.lang.Object[0])
            aj2 r12 = r11.v
            ek9 r12 = r12.D0
            if (r12 == 0) goto L_0x016a
            gx r12 = (defpackage.gx) r12
            r12.w()
            goto L_0x016a
        L_0x0112:
            boolean r12 = r12.a
            if (r12 == 0) goto L_0x016a
            int r12 = r11.w
            if (r2 >= r12) goto L_0x016a
            int r0 = r0 - r12
            if (r0 > r7) goto L_0x016a
            java.lang.String r12 = r5.Z
            java.lang.String r0 = "Media viewer. Call load prev, desc order"
            defpackage.z68.c(r12, r0, new java.lang.Object[0])
            aj2 r12 = r11.v
            ek9 r12 = r12.D0
            if (r12 == 0) goto L_0x016a
            gx r12 = (defpackage.gx) r12
            r12.y()
            goto L_0x016a
        L_0x0130:
            boolean r6 = r12.b
            if (r6 == 0) goto L_0x014e
            int r6 = r11.w
            if (r2 >= r6) goto L_0x014e
            int r0 = r0 - r6
            if (r0 > r7) goto L_0x014e
            java.lang.String r12 = r5.Z
            java.lang.String r0 = "Media viewer. Call load next"
            defpackage.z68.c(r12, r0, new java.lang.Object[0])
            aj2 r12 = r11.v
            ek9 r12 = r12.D0
            if (r12 == 0) goto L_0x016a
            gx r12 = (defpackage.gx) r12
            r12.w()
            goto L_0x016a
        L_0x014e:
            boolean r12 = r12.a
            if (r12 == 0) goto L_0x016a
            int r12 = r11.w
            if (r2 <= r12) goto L_0x016a
            if (r12 > r7) goto L_0x016a
            java.lang.String r12 = r5.Z
            java.lang.String r0 = "Media viewer. Call load prev"
            defpackage.z68.c(r12, r0, new java.lang.Object[0])
            aj2 r12 = r11.v
            ek9 r12 = r12.D0
            if (r12 == 0) goto L_0x016a
            gx r12 = (defpackage.gx) r12
            r12.y()
        L_0x016a:
            aj2 r12 = r11.v
            xme r12 = r12.N0
            java.lang.Object r12 = r12.getValue()
            ai2 r12 = (defpackage.ai2) r12
            java.util.List r12 = r12.a
            java.lang.Object r12 = kotlin.collections.CollectionsKt.getOrNull(r12, r2)
            hr8 r12 = (defpackage.hr8) r12
            if (r12 == 0) goto L_0x018a
            aj2 r0 = r11.v
            s85 r0 = r0.L0
            k85 r2 = new k85
            r2.<init>(r12)
            defpackage.xag.h(r0, r2)
        L_0x018a:
            boolean r12 = r3 instanceof defpackage.fr8
            if (r12 == 0) goto L_0x01a9
            aj2 r12 = r11.v
            s85 r12 = r12.L0
            i85 r0 = new i85
            m09 r2 = defpackage.m09.o
            r0.<init>(r2, r1)
            defpackage.xag.h(r12, r0)
            aj2 r12 = r11.v
            r0 = r3
            fr8 r0 = (defpackage.fr8) r0
            long r1 = r0.a
            java.lang.String r0 = r0.v
            r12.o(r1, r0)
            goto L_0x01e5
        L_0x01a9:
            boolean r12 = r3 instanceof defpackage.yq8
            if (r12 == 0) goto L_0x01d5
            r12 = r3
            yq8 r12 = (defpackage.yq8) r12
            boolean r0 = r12.v
            if (r0 == 0) goto L_0x01d5
            p87 r12 = r12.o
            android.net.Uri r0 = r12.l
            if (r0 == 0) goto L_0x01c4
            tr6 r1 = new tr6
            int r2 = r12.c
            int r12 = r12.d
            r1.<init>(r0, r2, r12)
            goto L_0x01c5
        L_0x01c4:
            r1 = r4
        L_0x01c5:
            aj2 r12 = r11.v
            xme r12 = r12.T0
            ci2 r0 = new ci2
            r0.<init>((defpackage.hr8) r3, (defpackage.g4g) r1)
            r12.getClass()
            r12.m(r4, r0)
            goto L_0x01e5
        L_0x01d5:
            aj2 r12 = r11.v
            xme r12 = r12.T0
            ci2 r0 = new ci2
            r1 = 3
            r0.<init>((defpackage.fr8) r4, (int) r1)
            r12.getClass()
            r12.m(r4, r0)
        L_0x01e5:
            aj2 r11 = r11.v
            s85 r11 = r11.L0
            j85 r12 = new j85
            r12.<init>(r3)
            defpackage.xag.h(r11, r12)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ii2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
