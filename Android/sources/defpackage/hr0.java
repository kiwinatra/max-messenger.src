package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: hr0  reason: default package */
public final class hr0 {
    public final fu2 a;
    public final x23 b;
    public final on2 c;

    public hr0(fu2 fu2, x23 x23, fs2 fs2, gaf gaf) {
        this.a = fu2;
        this.b = x23;
        jx3 a2 = e14.a(((osa) gaf).a().s0(1, "bottom-bar-counters"));
        dtc dtc = new dtc(fs2.a);
        Duration.Companion companion = Duration.Companion;
        this.c = new on2(bs0.X(new ps5(bs0.L(vme.a(dtc, DurationKt.toDuration(1, DurationUnit.SECONDS)), new er0(this, (Continuation) null)), new fr0(this, (Continuation) null)), a2, z6e.b, (Object) null), 28);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.hr0 r6, kotlin.coroutines.Continuation r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof defpackage.gr0
            if (r0 == 0) goto L_0x0016
            r0 = r7
            gr0 r0 = (defpackage.gr0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.v = r1
            goto L_0x001b
        L_0x0016:
            gr0 r0 = new gr0
            r0.<init>(r6, r7)
        L_0x001b:
            java.lang.Object r7 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            yt2 r6 = r0.b
            hr0 r0 = r0.a
            kotlin.ResultKt.throwOnFailure(r7)
            r1 = r6
            r6 = r0
            goto L_0x0052
        L_0x0032:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r7)
            yt2 r7 = defpackage.yt2.a
            r0.a = r6
            r0.b = r7
            r0.v = r3
            fu2 r0 = r6.a
            my2 r0 = (defpackage.my2) r0
            java.util.List r0 = r0.r(r7)
            if (r0 != r1) goto L_0x0050
            goto L_0x00aa
        L_0x0050:
            r1 = r7
            r7 = r0
        L_0x0052:
            java.util.List r7 = (java.util.List) r7
            java.util.Collection r7 = (java.util.Collection) r7
            fu2 r0 = r6.a
            my2 r0 = (defpackage.my2) r0
            r4 = 0
            r5 = 2147483647(0x7fffffff, float:NaN)
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.List r0 = r0.s(r1, r2, r4, r5)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r7 = kotlin.collections.CollectionsKt.plus(r7, r0)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r0 = r7 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L_0x007e
            r0 = r7
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x007e
            goto L_0x00a4
        L_0x007e:
            java.util.Iterator r7 = r7.iterator()
        L_0x0082:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r7.next()
            a32 r0 = (defpackage.a32) r0
            m72 r2 = r0.b
            int r2 = r2.m
            if (r2 <= 0) goto L_0x0082
            x23 r2 = r6.b
            boolean r0 = r0.X(r2)
            if (r0 != 0) goto L_0x0082
            int r1 = r1 + 1
            if (r1 >= 0) goto L_0x0082
            kotlin.collections.CollectionsKt.throwCountOverflow()
            goto L_0x0082
        L_0x00a4:
            r14 r6 = new r14
            r6.<init>(r1)
            r1 = r6
        L_0x00aa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hr0.a(hr0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
