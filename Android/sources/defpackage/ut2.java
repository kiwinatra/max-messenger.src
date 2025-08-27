package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.reflect.KProperty;

/* renamed from: ut2  reason: default package */
public final class ut2 implements bs5 {
    public static final /* synthetic */ KProperty[] o = {rae.s(ut2.class, "job", "getJob()Lkotlinx/coroutines/Job;", 0)};
    public final AtomicInteger a = new AtomicInteger(0);
    public final wie b = o5a.U();
    public final /* synthetic */ wt2 c;

    public ut2(wt2 wt2) {
        this.c = wt2;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.ds5 r17, kotlin.coroutines.Continuation r18) {
        /*
            r16 = this;
            r1 = r16
            r0 = r18
            r2 = 3
            r3 = 5
            r4 = 0
            boolean r5 = r0 instanceof defpackage.st2
            if (r5 == 0) goto L_0x001a
            r5 = r0
            st2 r5 = (defpackage.st2) r5
            int r6 = r5.o
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x001a
            int r6 = r6 - r7
            r5.o = r6
            goto L_0x001f
        L_0x001a:
            st2 r5 = new st2
            r5.<init>(r1, r0)
        L_0x001f:
            java.lang.Object r0 = r5.b
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r7 = r5.o
            r8 = 0
            r9 = 1
            if (r7 == 0) goto L_0x003f
            if (r7 == r9) goto L_0x0035
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0035:
            ut2 r1 = r5.a
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x003c }
            goto L_0x0131
        L_0x003c:
            r0 = move-exception
            goto L_0x0137
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r0)
            java.util.concurrent.atomic.AtomicInteger r0 = r1.a
            int r0 = r0.incrementAndGet()
            if (r0 != r9) goto L_0x011b
            kotlin.reflect.KProperty[] r0 = o
            r7 = r0[r4]
            wie r10 = r1.b
            java.lang.Object r7 = r10.getValue(r1, r7)
            pm7 r7 = (defpackage.pm7) r7
            if (r7 == 0) goto L_0x0060
            boolean r7 = r7.isActive()
            if (r7 != r9) goto L_0x0060
            goto L_0x011b
        L_0x0060:
            wt2 r7 = r1.c
            r7.getClass()
            qm7 r10 = defpackage.kv0.b()
            zz6 r11 = r7.a
            r11.j = r7
            ns2 r11 = r7.o
            wi0 r11 = (defpackage.wi0) r11
            ps5 r11 = r11.b()
            qt2 r12 = new qt2
            r13 = 2
            r12.<init>(r13, r8)
            ps5 r14 = new ps5
            r14.<init>(r11, r12)
            zw r11 = new zw
            r12 = 9
            r11.<init>((int) r12, (java.lang.Object) r7)
            ps5 r12 = new ps5
            r12.<init>(r14, r11, r3)
            boolean r11 = r12 instanceof defpackage.nw1
            if (r11 == 0) goto L_0x0091
            goto L_0x0097
        L_0x0091:
            pw1 r11 = new pw1
            r11.<init>(r12)
            r12 = r11
        L_0x0097:
            nw1 r12 = (defpackage.nw1) r12
            jx3 r11 = r7.y0
            jx3 r11 = defpackage.e14.g(r11, r10)
            defpackage.bs0.K(r12, r11)
            bo3 r11 = r7.v
            bs5 r11 = r11.a()
            on2 r12 = new on2
            r14 = 4
            r12.<init>(r11, r14)
            on2 r11 = new on2
            r11.<init>(r12, r2)
            kotlin.time.Duration$Companion r12 = kotlin.time.Duration.Companion
            r12 = 300(0x12c, float:4.2E-43)
            kotlin.time.DurationUnit r14 = kotlin.time.DurationUnit.MILLISECONDS
            long r14 = kotlin.time.DurationKt.toDuration((int) r12, (kotlin.time.DurationUnit) r14)
            ui0 r12 = new ui0
            r12.<init>(r2)
            ps5 r2 = defpackage.gt5.a(r11, r14, r12)
            bs5 r2 = defpackage.bs0.w(r2)
            zw r11 = new zw
            r12 = 10
            r11.<init>((int) r12, (java.lang.Object) r7)
            ps5 r12 = new ps5
            r12.<init>(r2, r11, r3)
            gaf r2 = r7.b
            osa r2 = (defpackage.osa) r2
            q04 r2 = r2.a()
            java.lang.String r3 = "contactEvents-stream"
            q04 r2 = r2.s0(r9, r3)
            bs5 r2 = defpackage.bs0.F(r12, r2)
            boolean r3 = r2 instanceof defpackage.nw1
            if (r3 == 0) goto L_0x00ed
            goto L_0x00f3
        L_0x00ed:
            pw1 r3 = new pw1
            r3.<init>(r2)
            r2 = r3
        L_0x00f3:
            nw1 r2 = (defpackage.nw1) r2
            jx3 r3 = r7.y0
            jx3 r3 = defpackage.e14.g(r3, r10)
            defpackage.bs0.K(r2, r3)
            jx3 r2 = r7.y0
            gaf r3 = r7.b
            osa r3 = (defpackage.osa) r3
            q04 r3 = r3.a()
            kotlin.coroutines.CoroutineContext r3 = r3.plus(r10)
            rt2 r11 = new rt2
            r11.<init>(r7, r8)
            defpackage.ev0.v(r2, r3, r8, r11, r13)
            r0 = r0[r4]
            wie r2 = r1.b
            r2.setValue(r1, r0, r10)
        L_0x011b:
            wt2 r0 = r1.c     // Catch:{ all -> 0x003c }
            xme r0 = r0.v0     // Catch:{ all -> 0x003c }
            tt2 r2 = new tt2     // Catch:{ all -> 0x003c }
            r3 = r17
            r2.<init>(r4, r3)     // Catch:{ all -> 0x003c }
            r5.a = r1     // Catch:{ all -> 0x003c }
            r5.o = r9     // Catch:{ all -> 0x003c }
            java.lang.Object r0 = r0.e(r2, r5)     // Catch:{ all -> 0x003c }
            if (r0 != r6) goto L_0x0131
            return r6
        L_0x0131:
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException     // Catch:{ all -> 0x003c }
            r0.<init>()     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x0137:
            java.util.concurrent.atomic.AtomicInteger r2 = r1.a
            int r2 = r2.decrementAndGet()
            if (r2 != 0) goto L_0x015a
            kotlin.reflect.KProperty[] r2 = o
            r3 = r2[r4]
            wie r5 = r1.b
            java.lang.Object r3 = r5.getValue(r1, r3)
            pm7 r3 = (defpackage.pm7) r3
            if (r3 == 0) goto L_0x015a
            boolean r3 = r3.isActive()
            if (r3 != r9) goto L_0x015a
            r2 = r2[r4]
            wie r3 = r1.b
            r3.setValue(r1, r2, r8)
        L_0x015a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ut2.e(ds5, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
