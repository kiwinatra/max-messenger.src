package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: h0d  reason: default package */
public final class h0d extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ fqd b;
    public final /* synthetic */ i0d c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h0d(fqd fqd, i0d i0d, Continuation continuation) {
        super(2, continuation);
        this.b = fqd;
        this.c = i0d;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new h0d(this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h0d) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            r0 = 3
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r12.a
            r3 = 0
            r4 = 2
            r5 = 1
            fqd r6 = r12.b
            i0d r7 = r12.c
            if (r2 == 0) goto L_0x0025
            if (r2 == r5) goto L_0x0021
            if (r2 != r4) goto L_0x0019
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00a0
        L_0x0019:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0021:
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0059
        L_0x0025:
            kotlin.ResultKt.throwOnFailure(r13)
            boolean r13 = r6 instanceof defpackage.dqd
            if (r13 == 0) goto L_0x003e
            f0d r13 = r7.b
            r2 = r6
            dqd r2 = (defpackage.dqd) r2
            long r8 = r2.c
            java.lang.Long r2 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r8)
            f0d r13 = defpackage.f0d.a(r13, r2)
            r7.b = r13
            goto L_0x0046
        L_0x003e:
            f0d r13 = r7.b
            f0d r13 = defpackage.f0d.a(r13, r3)
            r7.b = r13
        L_0x0046:
            kotlin.Lazy r13 = r7.w
            java.lang.Object r13 = r13.getValue()
            n80 r13 = (defpackage.n80) r13
            f0d r2 = r7.b
            r12.a = r5
            java.lang.Object r13 = r13.a(r2, r12)
            if (r13 != r1) goto L_0x0059
            return r1
        L_0x0059:
            l80 r13 = (defpackage.l80) r13
            kotlin.Lazy r2 = r7.X
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0069:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x0089
            java.lang.Object r8 = r2.next()
            wla r8 = (defpackage.wla) r8
            fo3 r9 = r13.w
            long r9 = r9.a
            u4a r8 = (defpackage.u4a) r8
            r8.getClass()
            jx3 r8 = defpackage.u4a.b
            t4a r11 = new t4a
            r11.<init>(r9, r3)
            defpackage.ev0.v(r8, r3, r3, r11, r0)
            goto L_0x0069
        L_0x0089:
            kotlin.Lazy r2 = r7.x
            java.lang.Object r2 = r2.getValue()
            j98 r2 = (defpackage.j98) r2
            java.lang.String r13 = r13.c
            f0d r8 = r7.b
            java.lang.String r8 = r8.b
            r12.a = r4
            java.lang.Object r12 = r2.a(r13, r8, r12)
            if (r12 != r1) goto L_0x00a0
            return r1
        L_0x00a0:
            boolean r12 = r6 instanceof defpackage.eqd
            if (r12 == 0) goto L_0x00b8
            kotlin.Lazy r12 = r7.y
            java.lang.Object r12 = r12.getValue()
            rl r12 = (defpackage.rl) r12
            r13 = r6
            eqd r13 = (defpackage.eqd) r13
            java.lang.String r1 = r13.c
            a20 r13 = r13.d
            jna r12 = (defpackage.jna) r12
            r12.N(r1, r13)
        L_0x00b8:
            kotlin.reflect.KProperty[] r12 = defpackage.i0d.x0
            r7.getClass()
            if (r6 != 0) goto L_0x00c0
            goto L_0x011e
        L_0x00c0:
            boolean r12 = r6 instanceof defpackage.dqd
            if (r12 == 0) goto L_0x00c7
            r3 = r6
            dqd r3 = (defpackage.dqd) r3
        L_0x00c7:
            if (r3 == 0) goto L_0x00cc
            long r1 = r3.c
            goto L_0x00ce
        L_0x00cc:
            r1 = 0
        L_0x00ce:
            if (r12 == 0) goto L_0x00d3
            o80 r12 = defpackage.o80.PRESET
            goto L_0x00ee
        L_0x00d3:
            boolean r12 = r6 instanceof defpackage.eqd
            if (r12 == 0) goto L_0x0126
            eqd r6 = (defpackage.eqd) r6
            sd0 r12 = r6.e
            int r12 = r12.ordinal()
            if (r12 == 0) goto L_0x00ec
            if (r12 != r5) goto L_0x00e6
            o80 r12 = defpackage.o80.GALLERY
            goto L_0x00ee
        L_0x00e6:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L_0x00ec:
            o80 r12 = defpackage.o80.CAMERA
        L_0x00ee:
            kotlin.Lazy r13 = r7.z
            java.lang.Object r13 = r13.getValue()
            r80 r13 = (defpackage.r80) r13
            p80 r3 = new p80
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r2 = "value"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r2, r1)
            short r12 = r12.a
            java.lang.Short r12 = java.lang.Short.valueOf(r12)
            java.lang.String r2 = "source"
            kotlin.Pair r12 = kotlin.TuplesKt.to(r2, r12)
            kotlin.Pair[] r12 = new kotlin.Pair[]{r1, r12}
            qz9 r12 = defpackage.bed.b(r12)
            java.lang.String r1 = "choose_avatar"
            r3.<init>(r0, r1, r12)
            r13.a(r3)
        L_0x011e:
            kotlin.jvm.functions.Function0 r12 = r7.o
            r12.invoke()
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        L_0x0126:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h0d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
