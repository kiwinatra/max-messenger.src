package defpackage;

import android.graphics.Bitmap;
import androidx.media3.transformer.ExportException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: o87  reason: default package */
public final class o87 implements vt {
    public final boolean a;
    public final e05 b;
    public final fo0 c;
    public final ut d;
    public final ScheduledExecutorService e;
    public bcd f;
    public int g;
    public volatile int h;

    public o87(e05 e05, ut utVar, k74 k74, boolean z) {
        this.a = z;
        boolean z2 = true;
        n79.n(e05.e != -9223372036854775807L);
        n79.n(e05.f == -2147483647 ? false : z2);
        this.b = e05;
        this.d = utVar;
        this.c = k74;
        this.e = Executors.newSingleThreadScheduledExecutor();
        this.g = 0;
    }

    public final int a(jq5 jq5) {
        if (this.g == 2) {
            jq5.b = this.h;
        }
        return this.g;
    }

    public final void b(Bitmap bitmap, ea6 ea6) {
        try {
            bcd bcd = this.f;
            if (bcd == null) {
                this.f = this.d.c(ea6);
                this.e.schedule(new n87(this, bitmap, ea6, 0), 10, TimeUnit.MILLISECONDS);
                return;
            }
            e05 e05 = this.b;
            int g2 = bcd.g(bitmap, new yi3((float) e05.f, 0, e05.e));
            if (g2 == 1) {
                this.h = 100;
                this.f.e();
            } else if (g2 == 2) {
                this.e.schedule(new n87(this, bitmap, ea6, 1), 10, TimeUnit.MILLISECONDS);
            } else if (g2 == 3) {
                this.h = 100;
            } else {
                throw new IllegalStateException();
            }
        } catch (ExportException e2) {
            this.d.d(e2);
        } catch (RuntimeException e3) {
            this.d.d(ExportException.a(e3, 1000));
        }
    }

    public final wb7 e() {
        return p0d.y;
    }

    public final void release() {
        this.g = 0;
        this.e.shutdownNow();
    }

    public final void start() {
        this.g = 2;
        e05 e05 = this.b;
        long j = e05.e;
        ut utVar = this.d;
        utVar.f(j);
        utVar.b(1);
        xq8 xq8 = e05.a.b;
        xq8.getClass();
        o5a.b(this.c.d(xq8.a), new grg(23, this), this.e);
    }
}
