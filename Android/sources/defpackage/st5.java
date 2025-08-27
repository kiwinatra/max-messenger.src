package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* renamed from: st5  reason: default package */
public final class st5 extends SuspendLambda implements Function3 {
    public long a;
    public int b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object o;
    public final /* synthetic */ long v;
    public final /* synthetic */ bs5 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public st5(long j, bs5 bs5, Continuation continuation) {
        super(3, continuation);
        this.v = j;
        this.w = bs5;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        st5 st5 = new st5(this.v, this.w, (Continuation) obj3);
        st5.c = (d14) obj;
        st5.o = (ds5) obj2;
        return st5.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: type inference failed for: r7v10, types: [f12] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.b
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0028
            if (r2 != r4) goto L_0x0020
            long r6 = r0.a
            java.lang.Object r2 = r0.o
            wtc r2 = (defpackage.wtc) r2
            java.lang.Object r8 = r0.c
            ds5 r8 = (defpackage.ds5) r8
            kotlin.ResultKt.throwOnFailure(r20)
            r5 = r20
            goto L_0x00ce
        L_0x0020:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0028:
            kotlin.ResultKt.throwOnFailure(r20)
            java.lang.Object r2 = r0.c
            d14 r2 = (defpackage.d14) r2
            java.lang.Object r6 = r0.o
            ds5 r6 = (defpackage.ds5) r6
            kotlin.time.Duration$Companion r7 = kotlin.time.Duration.Companion
            long r7 = r7.m1456getZEROUwyO8pc()
            long r9 = r0.v
            int r7 = kotlin.time.Duration.m1352compareToLRDsOJo(r9, r7)
            if (r7 <= 0) goto L_0x00db
            r7 = 2
            bs5 r8 = r0.w
            bs5 r15 = defpackage.bs0.j(r8, r3, r7)
            boolean r7 = r15 instanceof defpackage.f12
            if (r7 == 0) goto L_0x0050
            r7 = r15
            f12 r7 = (defpackage.f12) r7
            goto L_0x0051
        L_0x0050:
            r7 = r5
        L_0x0051:
            if (r7 != 0) goto L_0x005f
            n12 r7 = new n12
            r16 = 0
            r13 = 14
            r12 = 0
            r14 = 0
            r11 = r7
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x005f:
            wtc r2 = r7.l(r2)
            r8 = r6
            r6 = r9
        L_0x0065:
            upd r15 = new upd
            kotlin.coroutines.CoroutineContext r9 = r19.getContext()
            r15.<init>(r9)
            m7f r9 = r2.c()
            qt5 r14 = new qt5
            r14.<init>(r8, r5)
            spd r13 = new spd
            java.lang.Object r11 = r9.a
            java.lang.Object r10 = r9.c
            r16 = r10
            kotlin.jvm.functions.Function3 r16 = (kotlin.jvm.functions.Function3) r16
            r17 = 0
            java.lang.Object r10 = r9.b
            r12 = r10
            kotlin.jvm.functions.Function3 r12 = (kotlin.jvm.functions.Function3) r12
            java.lang.Object r9 = r9.o
            r18 = r9
            kotlin.jvm.functions.Function3 r18 = (kotlin.jvm.functions.Function3) r18
            r9 = r13
            r10 = r15
            r4 = r13
            r13 = r16
            r16 = r14
            r14 = r17
            r5 = r15
            r15 = r16
            r16 = r18
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r5.f(r4, r3)
            rt5 r4 = new rt5
            r9 = 0
            r4.<init>(r6, r9)
            long r9 = defpackage.xk4.e(r6)
            defpackage.q8.I(r5, r9, r4)
            r0.c = r8
            r0.o = r2
            r0.a = r6
            r4 = 1
            r0.b = r4
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = defpackage.upd.w
            java.lang.Object r9 = r9.get(r5)
            boolean r9 = r9 instanceof defpackage.spd
            if (r9 == 0) goto L_0x00c7
            java.lang.Object r5 = r5.c(r0)
            goto L_0x00cb
        L_0x00c7:
            java.lang.Object r5 = r5.d(r0)
        L_0x00cb:
            if (r5 != r1) goto L_0x00ce
            return r1
        L_0x00ce:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x00d9
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00d9:
            r5 = 0
            goto L_0x0065
        L_0x00db:
            kotlinx.coroutines.TimeoutCancellationException r0 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r1 = "Timed out immediately"
            r2 = 0
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
