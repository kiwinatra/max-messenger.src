package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;

/* renamed from: dt5  reason: default package */
public final class dt5 implements ds5 {
    public final /* synthetic */ Ref.LongRef a;
    public final /* synthetic */ long b;
    public final /* synthetic */ cwb c;
    public final /* synthetic */ Ref.ObjectRef o;
    public final /* synthetic */ d14 v;
    public final /* synthetic */ CoroutineContext w;

    public dt5(Ref.LongRef longRef, long j, cwb cwb, Ref.ObjectRef objectRef, d14 d14, CoroutineContext coroutineContext) {
        this.a = longRef;
        this.b = j;
        this.c = cwb;
        this.o = objectRef;
        this.v = d14;
        this.w = coroutineContext;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(java.lang.Object r22, kotlin.coroutines.Continuation r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            boolean r2 = r1 instanceof defpackage.ct5
            if (r2 == 0) goto L_0x0017
            r2 = r1
            ct5 r2 = (defpackage.ct5) r2
            int r3 = r2.o
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.o = r3
            goto L_0x001c
        L_0x0017:
            ct5 r2 = new ct5
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.b
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r2.o
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L_0x0038
            if (r4 != r6) goto L_0x0030
            dt5 r0 = r2.a
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x006b
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r1)
            kotlin.time.Duration$Companion r1 = kotlin.time.Duration.Companion
            long r7 = java.lang.System.nanoTime()
            kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.NANOSECONDS
            long r7 = kotlin.time.DurationKt.toDuration((long) r7, (kotlin.time.DurationUnit) r1)
            long r11 = kotlin.time.Duration.m1371getInWholeMillisecondsimpl(r7)
            kotlin.jvm.internal.Ref$LongRef r1 = r0.a
            long r13 = r1.element
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 >= 0) goto L_0x0079
            long r7 = r0.b
            long r11 = r11 + r7
            r1.element = r11
            r2.a = r0
            r2.o = r6
            cwb r1 = r0.c
            zvb r1 = (defpackage.zvb) r1
            x02 r1 = r1.o
            r4 = r22
            java.lang.Object r1 = r1.t(r4, r2)
            if (r1 != r3) goto L_0x006b
            return r3
        L_0x006b:
            kotlin.jvm.internal.Ref$ObjectRef r0 = r0.o
            T r0 = r0.element
            mk4 r0 = (defpackage.mk4) r0
            if (r0 == 0) goto L_0x00a8
            qn7 r0 = (defpackage.qn7) r0
            r0.b(r5)
            goto L_0x00a8
        L_0x0079:
            r4 = r22
            kotlin.jvm.internal.Ref$ObjectRef r1 = r0.o
            T r2 = r1.element
            mk4 r2 = (defpackage.mk4) r2
            if (r2 == 0) goto L_0x0088
            qn7 r2 = (defpackage.qn7) r2
            r2.b(r5)
        L_0x0088:
            bt5 r2 = new bt5
            long r6 = r0.b
            kotlin.coroutines.CoroutineContext r3 = r0.w
            kotlin.jvm.internal.Ref$LongRef r10 = r0.a
            cwb r8 = r0.c
            r20 = 0
            r9 = r2
            r15 = r6
            r17 = r3
            r18 = r8
            r19 = r22
            r9.<init>(r10, r11, r13, r15, r17, r18, r19, r20)
            r3 = 3
            d14 r0 = r0.v
            nk4 r0 = defpackage.ev0.d(r0, r5, r2, r3)
            r1.element = r0
        L_0x00a8:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dt5.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
