package defpackage;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: zi2  reason: default package */
public final class zi2 extends SuspendLambda implements Function2 {
    public ai2 a;
    public int b;
    public int c;
    public /* synthetic */ Object o;
    public final /* synthetic */ aj2 v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zi2(aj2 aj2, Continuation continuation) {
        super(2, continuation);
        this.v = aj2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        zi2 zi2 = new zi2(this.v, continuation);
        zi2.o = obj;
        return zi2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zi2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0130 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x00fa A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.c
            r4 = 0
            r5 = 0
            r6 = 3
            r7 = 2
            r9 = 4
            if (r3 == 0) goto L_0x0052
            if (r3 == r1) goto L_0x0046
            if (r3 == r7) goto L_0x003b
            if (r3 == r6) goto L_0x002b
            if (r3 != r9) goto L_0x0023
            int r2 = r0.b
            java.lang.Object r3 = r0.o
            java.util.List r3 = (java.util.List) r3
            kotlin.ResultKt.throwOnFailure(r18)
            goto L_0x019e
        L_0x0023:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002b:
            int r3 = r0.b
            ai2 r6 = r0.a
            java.lang.Object r7 = r0.o
            java.util.List r7 = (java.util.List) r7
            kotlin.ResultKt.throwOnFailure(r18)
            r10 = r6
        L_0x0037:
            r6 = r3
            r3 = r7
            goto L_0x0131
        L_0x003b:
            ai2 r3 = r0.a
            java.lang.Object r7 = r0.o
            java.util.List r7 = (java.util.List) r7
            kotlin.ResultKt.throwOnFailure(r18)
            goto L_0x00c5
        L_0x0046:
            ai2 r3 = r0.a
            java.lang.Object r10 = r0.o
            java.util.List r10 = (java.util.List) r10
            kotlin.ResultKt.throwOnFailure(r18)
            r11 = r18
            goto L_0x00af
        L_0x0052:
            kotlin.ResultKt.throwOnFailure(r18)
            java.lang.Object r3 = r0.o
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.lang.Object r3 = r3.component1()
            java.util.List r3 = (java.util.List) r3
            aj2 r10 = r0.v
            java.lang.String r10 = r10.Z
            a67 r11 = defpackage.z68.b
            if (r11 != 0) goto L_0x0068
            goto L_0x007d
        L_0x0068:
            boolean r12 = r11.c()
            if (r12 == 0) goto L_0x007d
            w78 r12 = defpackage.w78.o
            int r13 = r3.size()
            java.lang.String r14 = "Media viewer. Get result from loader size:"
            java.lang.String r13 = defpackage.wj6.h(r13, r14)
            r11.d(r12, r10, r13, r4)
        L_0x007d:
            boolean r10 = r3.isEmpty()
            if (r10 == 0) goto L_0x0086
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0086:
            aj2 r10 = r0.v
            xme r10 = r10.N0
            java.lang.Object r10 = r10.getValue()
            ai2 r10 = (defpackage.ai2) r10
            r10.getClass()
            ai2 r11 = defpackage.ai2.c
            if (r10 != r11) goto L_0x0119
            aj2 r11 = r0.v
            to9 r12 = r11.y
            long r13 = r11.o
            r0.o = r3
            r0.a = r10
            r0.c = r1
            java.lang.Object r11 = r12.a(r13, r0)
            if (r11 != r2) goto L_0x00aa
            return r2
        L_0x00aa:
            r16 = r10
            r10 = r3
            r3 = r16
        L_0x00af:
            ha9 r11 = (defpackage.ha9) r11
            if (r11 == 0) goto L_0x00cb
            aj2 r12 = r0.v
            r0.o = r10
            r0.a = r3
            r0.c = r7
            kotlin.reflect.KProperty[] r7 = defpackage.aj2.b1
            java.lang.Object r7 = r12.A(r11, r0)
            if (r7 != r2) goto L_0x00c4
            return r2
        L_0x00c4:
            r7 = r10
        L_0x00c5:
            r16 = r7
            r7 = r3
            r3 = r16
            goto L_0x00cd
        L_0x00cb:
            r7 = r3
            r3 = r10
        L_0x00cd:
            aj2 r10 = r0.v
            java.util.Iterator r11 = r3.iterator()
            r12 = r5
        L_0x00d4:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x00fa
            java.lang.Object r13 = r11.next()
            hr8 r13 = (defpackage.hr8) r13
            long r14 = r13.m()
            long r8 = r10.o
            int r8 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r8 != 0) goto L_0x00f7
            java.lang.String r8 = r13.v()
            java.lang.String r9 = r10.c
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r8 == 0) goto L_0x00f7
            goto L_0x00fb
        L_0x00f7:
            int r12 = r12 + r1
            r9 = 4
            goto L_0x00d4
        L_0x00fa:
            r12 = -1
        L_0x00fb:
            aj2 r8 = r0.v
            java.lang.String r8 = r8.Z
            a67 r9 = defpackage.z68.b
            if (r9 != 0) goto L_0x0104
            goto L_0x0115
        L_0x0104:
            boolean r10 = r9.c()
            if (r10 == 0) goto L_0x0115
            w78 r10 = defpackage.w78.o
            java.lang.String r11 = "Media viewer. Found initialPos: "
            java.lang.String r11 = defpackage.wj6.h(r12, r11)
            r9.d(r10, r8, r11, r4)
        L_0x0115:
            r10 = r7
            r7 = r3
            r3 = r12
            goto L_0x0120
        L_0x0119:
            int r7 = r10.b
            r16 = r7
            r7 = r3
            r3 = r16
        L_0x0120:
            aj2 r8 = r0.v
            r0.o = r7
            r0.a = r10
            r0.b = r3
            r0.c = r6
            java.lang.Object r6 = defpackage.aj2.j(r8, r7, r0)
            if (r6 != r2) goto L_0x0037
            return r2
        L_0x0131:
            aj2 r7 = r0.v
            xme r7 = r7.N0
            java.lang.Object r7 = r7.getValue()
            ai2 r7 = (defpackage.ai2) r7
            int r7 = r7.b
            r10.getClass()
            ai2 r8 = defpackage.ai2.c
            if (r10 != r8) goto L_0x0146
            r5 = r7
            goto L_0x0172
        L_0x0146:
            aj2 r8 = r0.v
            java.util.Iterator r9 = r3.iterator()
        L_0x014c:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0171
            java.lang.Object r10 = r9.next()
            hr8 r10 = (defpackage.hr8) r10
            long r11 = r10.m()
            long r13 = r8.o
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto L_0x016f
            java.lang.String r10 = r10.v()
            java.lang.String r11 = r8.c
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)
            if (r10 == 0) goto L_0x016f
            goto L_0x0172
        L_0x016f:
            int r5 = r5 + r1
            goto L_0x014c
        L_0x0171:
            r5 = -1
        L_0x0172:
            if (r7 < 0) goto L_0x0189
            if (r7 == r5) goto L_0x0189
            aj2 r6 = r0.v
            java.lang.String r6 = r6.Z
            java.lang.String r8 = "Media viewer. Initial position changed, prev:"
            java.lang.String r9 = ", new:"
            java.lang.String r10 = ". Recalculate counter."
            java.lang.String r7 = defpackage.a81.l(r8, r7, r9, r5, r10)
            defpackage.z68.c(r6, r7, new java.lang.Object[0])
            r8 = -1
            goto L_0x018b
        L_0x0189:
            r5 = r6
            r8 = r5
        L_0x018b:
            aj2 r6 = r0.v
            r0.o = r3
            r0.a = r4
            r0.b = r5
            r7 = 4
            r0.c = r7
            java.lang.Object r6 = defpackage.aj2.l(r6, r8, r3, r0)
            if (r6 != r2) goto L_0x019d
            return r2
        L_0x019d:
            r2 = r5
        L_0x019e:
            aj2 r5 = r0.v
            xme r5 = r5.N0
            ai2 r6 = new ai2
            r6.<init>(r2, r3)
            r5.getClass()
            r5.m(r4, r6)
            aj2 r2 = r0.v
            java.util.concurrent.atomic.AtomicReference r2 = r2.H0
            java.lang.Object r2 = r2.get()
            zh2 r2 = (defpackage.zh2) r2
            boolean r2 = r2.b
            if (r2 == 0) goto L_0x01e5
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r2 = r3.isEmpty()
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x01e5
            aj2 r1 = r0.v
            java.lang.String r1 = r1.Z
            a67 r2 = defpackage.z68.b
            if (r2 != 0) goto L_0x01cd
            goto L_0x01da
        L_0x01cd:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x01da
            w78 r3 = defpackage.w78.o
            java.lang.String r5 = "Media viewer. Call load next after get result."
            r2.d(r3, r1, r5, r4)
        L_0x01da:
            aj2 r0 = r0.v
            ek9 r0 = r0.D0
            if (r0 == 0) goto L_0x01e5
            gx r0 = (defpackage.gx) r0
            r0.w()
        L_0x01e5:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zi2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
