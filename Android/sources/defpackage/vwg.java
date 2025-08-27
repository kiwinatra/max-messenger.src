package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.concurrent.TimeUnit;

/* renamed from: vwg  reason: default package */
public final class vwg implements obb {
    public final /* synthetic */ m5a a;
    public final /* synthetic */ qdf b;
    public final /* synthetic */ cd4 c;

    public vwg(BasePendingResult basePendingResult, qdf qdf, cd4 cd4) {
        this.a = basePendingResult;
        this.b = qdf;
        this.c = cd4;
    }

    public final void a(Status status) {
        u4d u4d;
        if (status.a <= 0) {
            m5a m5a = this.a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            BasePendingResult basePendingResult = (BasePendingResult) m5a;
            vzg.o("Result has already been consumed.", !basePendingResult.l);
            try {
                if (!basePendingResult.g.await(0, timeUnit)) {
                    basePendingResult.V(Status.y);
                }
            } catch (InterruptedException unused) {
                basePendingResult.V(Status.w);
            }
            vzg.o("Result is not ready.", basePendingResult.W());
            synchronized (basePendingResult.f) {
                vzg.o("Result has already been consumed.", !basePendingResult.l);
                vzg.o("Result is not ready.", basePendingResult.W());
                u4d = basePendingResult.j;
                basePendingResult.j = null;
                basePendingResult.l = true;
            }
            rae.w(basePendingResult.i.getAndSet((Object) null));
            vzg.m(u4d);
            this.b.b(this.c.b(u4d));
            return;
        }
        this.b.a(b0h.r(status));
    }
}
