package androidx.media3.effect;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class DefaultVideoFrameProcessor$Factory$Builder {
    public int a = 0;
    public ExecutorService b;
    public yr6 c;
    public hs6 d;
    public int e;
    public boolean f = true;

    public fk4 build() {
        int i = this.a;
        boolean z = !this.f;
        yr6 yr6 = this.c;
        if (yr6 == null) {
            yr6 = new npg(10);
        }
        return new fk4(i, z, yr6, (ScheduledExecutorService) this.b, (ud0) this.d, this.e);
    }
}
