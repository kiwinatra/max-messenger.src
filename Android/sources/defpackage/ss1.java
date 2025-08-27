package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: ss1  reason: default package */
public final class ss1 implements ls1 {
    public static final long g = TimeUnit.SECONDS.toNanos(2);
    public static final /* synthetic */ int h = 0;
    public final lr1 a;
    public final int b;
    public boolean c = false;
    public final Executor d;
    public final ScheduledExecutorService e;
    public final boolean f;

    public ss1(lr1 lr1, int i, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this.a = lr1;
        this.b = i;
        this.d = executor;
        this.e = scheduledExecutorService;
        this.f = z;
    }

    public final zz7 a(TotalCaptureResult totalCaptureResult) {
        u40.g(this.b, totalCaptureResult);
        if (!u40.g(this.b, totalCaptureResult) || this.a.r) {
            return hd8.E(Boolean.FALSE);
        }
        this.c = true;
        oj6 a2 = oj6.a(m5a.F(new rs1(this, 0)));
        rs1 rs1 = new rs1(this, 1);
        Executor executor = this.d;
        a2.getClass();
        cz1 b0 = hd8.b0(hd8.b0(a2, rs1, executor), new rs1(this, 2), this.d);
        es1 es1 = new es1(4);
        return hd8.b0(b0, new xv1(22, (Object) es1), ryg.j());
    }

    public final boolean b() {
        return this.b == 0;
    }

    public final void c() {
        if (this.c) {
            lr1 lr1 = this.a;
            lr1.j.a((do1) null, false);
            if (this.f) {
                lr1.h.a(false, true);
            }
        }
    }
}
