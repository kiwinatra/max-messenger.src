package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: fk4  reason: default package */
public final class fk4 implements v5g {
    public final int a;
    public final boolean b;
    public final yr6 c;
    public final ExecutorService d;
    public final hs6 e;
    public final int f;
    public final boolean g = false;
    public final boolean h = false;

    public fk4(int i, boolean z, yr6 yr6, ScheduledExecutorService scheduledExecutorService, ud0 ud0, int i2) {
        this.a = i;
        this.b = z;
        this.c = yr6;
        this.d = scheduledExecutorService;
        this.e = ud0;
        this.f = i2;
    }

    public final /* bridge */ /* synthetic */ x5g a(Context context, rx0 rx0, m53 m53, boolean z, jz2 jz2) {
        return b(context, rx0, m53, z, dp4.a, jz2);
    }

    public final gk4 b(Context context, rx0 rx0, m53 m53, boolean z, Executor executor, w5g w5g) {
        ExecutorService executorService = this.d;
        boolean z2 = executorService == null;
        if (executorService == null) {
            int i = v0g.a;
            executorService = Executors.newSingleThreadExecutor(new td3(2, "Effect:DefaultVideoFrameProcessor:GlThread"));
        }
        ExecutorService executorService2 = executorService;
        w5g w5g2 = w5g;
        try {
            return (gk4) executorService2.submit(new ek4(this, context, rx0, m53, z, new gy0(executorService2, z2, (s5g) new ak4(w5g2, 1)), executor, w5g2)).get();
        } catch (ExecutionException e2) {
            throw new Exception(e2);
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            throw new Exception(e3);
        }
    }
}
