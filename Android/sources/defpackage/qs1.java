package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: qs1  reason: default package */
public final class qs1 implements ls1 {
    public static final long f = TimeUnit.SECONDS.toNanos(2);
    public static final /* synthetic */ int g = 0;
    public final lr1 a;
    public final Executor b;
    public final ScheduledExecutorService c;
    public final x87 d;
    public final p1e e;

    public qs1(lr1 lr1, Executor executor, ScheduledExecutorService scheduledExecutorService, p1e p1e) {
        this.a = lr1;
        this.b = executor;
        this.c = scheduledExecutorService;
        this.e = p1e;
        x87 x87 = lr1.q;
        Objects.requireNonNull(x87);
        this.d = x87;
    }

    public final zz7 a(TotalCaptureResult totalCaptureResult) {
        AtomicReference atomicReference = new AtomicReference();
        go1 F = m5a.F(new ut0(atomicReference, 1));
        oj6 a2 = oj6.a(m5a.F(new ba(12, this, atomicReference)));
        os1 os1 = new os1(this, 1);
        a2.getClass();
        Executor executor = this.b;
        cz1 b0 = hd8.b0(hd8.b0(hd8.b0(hd8.b0(hd8.b0(a2, os1, executor), new os1(this, 2), executor), new ba(13, this, F), executor), new os1(this, 3), executor), new os1(this, 4), executor);
        es1 es1 = new es1(3);
        return hd8.b0(b0, new xv1(22, (Object) es1), ryg.j());
    }

    public final boolean b() {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r6 = this;
            p1e r0 = r6.e
            java.lang.Object r0 = r0.a
            androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk r0 = (androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk) r0
            r1 = 1
            r2 = 5
            r3 = 0
            if (r0 == 0) goto L_0x001b
            qt1 r0 = r0.a
            int r0 = defpackage.lr1.t(r0, r2)
            if (r0 != r2) goto L_0x0015
            r0 = r1
            goto L_0x0016
        L_0x0015:
            r0 = r3
        L_0x0016:
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x001b
            r0 = r1
            goto L_0x001c
        L_0x001b:
            r0 = r3
        L_0x001c:
            lr1 r4 = r6.a
            if (r0 == 0) goto L_0x0023
            r4.r(r3)
        L_0x0023:
            wx5 r0 = r4.h
            lr1 r5 = r0.a
            qt1 r5 = r5.e
            int r5 = defpackage.lr1.t(r5, r2)
            if (r5 == r2) goto L_0x0032
            xa7 r0 = defpackage.xa7.c
            goto L_0x003c
        L_0x0032:
            h62 r2 = new h62
            r5 = 2
            r2.<init>(r0, r3, r5)
            go1 r0 = defpackage.m5a.F(r2)
        L_0x003c:
            gc r2 = new gc
            r5 = 6
            r2.<init>(r5)
            java.util.concurrent.Executor r5 = r6.b
            r0.d(r2, r5)
            wx5 r0 = r4.h
            r0.a(r3, r1)
            ew6 r0 = defpackage.ryg.G()
            x87 r6 = r6.d
            java.util.Objects.requireNonNull(r6)
            pr1 r1 = new pr1
            r2 = 3
            r1.<init>(r2, r6)
            r0.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qs1.c():void");
    }
}
