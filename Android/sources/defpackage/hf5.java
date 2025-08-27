package defpackage;

import android.graphics.SurfaceTexture;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: hf5  reason: default package */
public final /* synthetic */ class hf5 implements t5g {
    public final /* synthetic */ int a;
    public final /* synthetic */ kf5 b;

    public /* synthetic */ hf5(kf5 kf5, int i) {
        this.a = i;
        this.b = kf5;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.C0 = false;
                return;
            case 1:
                kf5 kf5 = this.b;
                kf5.z0 = null;
                if (!kf5.y0 || !kf5.X.isEmpty()) {
                    kf5.a0();
                    return;
                }
                kf5.y0 = false;
                gf5 gf5 = kf5.v;
                gf5.getClass();
                ((kj0) gf5).c();
                p94.a();
                ScheduledFuture scheduledFuture = kf5.B0;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                kf5.B0 = null;
                return;
            case 2:
                kf5 kf52 = this.b;
                ConcurrentLinkedQueue concurrentLinkedQueue = kf52.X;
                int size = concurrentLinkedQueue.size();
                int i = kf52.x0;
                Locale locale = Locale.US;
                StringBuilder o = wj6.o(size, "Forcing EOS after missing ", " frames for ");
                o.append(kf5.F0);
                o.append(" ms, with available frame count: ");
                o.append(i);
                i8b.V(o.toString());
                kf52.y0 = false;
                kf52.z0 = null;
                kf52.C0 = true;
                while (true) {
                    int i2 = kf52.x0;
                    if (i2 > 0) {
                        kf52.x0 = i2 - 1;
                        kf52.y.updateTexImage();
                        kf52.X.remove();
                    } else {
                        concurrentLinkedQueue.clear();
                        kf52.Y();
                        return;
                    }
                }
            case 3:
                kf5 kf53 = this.b;
                if (!kf53.X.isEmpty() || kf53.z0 != null) {
                    kf53.y0 = true;
                    ScheduledFuture scheduledFuture2 = kf53.B0;
                    if (scheduledFuture2 != null) {
                        scheduledFuture2.cancel(false);
                    }
                    kf53.B0 = null;
                    kf53.B0 = kf53.Y.schedule(new ne4(22, kf53), kf5.F0, TimeUnit.MILLISECONDS);
                    return;
                }
                gf5 gf52 = kf53.v;
                gf52.getClass();
                ((kj0) gf52).c();
                p94.a();
                ScheduledFuture scheduledFuture3 = kf53.B0;
                if (scheduledFuture3 != null) {
                    scheduledFuture3.cancel(false);
                }
                kf53.B0 = null;
                return;
            case 4:
                kf5 kf54 = this.b;
                kf54.getClass();
                p94.a();
                if (kf54.C0) {
                    SurfaceTexture surfaceTexture = kf54.y;
                    surfaceTexture.updateTexImage();
                    i8b.V("Dropping frame received on SurfaceTexture after forcing EOS: " + (surfaceTexture.getTimestamp() / 1000));
                    return;
                }
                if (kf54.y0) {
                    ScheduledFuture scheduledFuture4 = kf54.B0;
                    if (scheduledFuture4 != null) {
                        scheduledFuture4.cancel(false);
                    }
                    kf54.B0 = null;
                    kf54.B0 = kf54.Y.schedule(new ne4(22, kf54), kf5.F0, TimeUnit.MILLISECONDS);
                }
                kf54.x0++;
                kf54.a0();
                return;
            default:
                kf5 kf55 = this.b;
                kf55.w0++;
                kf55.a0();
                return;
        }
    }
}
