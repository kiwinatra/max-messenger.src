package defpackage;

import java.io.IOException;

/* renamed from: dt4  reason: default package */
public final class dt4 extends Thread implements kt4 {
    public final ht4 a;
    public final lt4 b;
    public final gt4 c;
    public final boolean o;
    public final int v;
    public volatile bt4 w;
    public volatile boolean x;
    public Exception y;
    public long z = -1;

    public dt4(ht4 ht4, lt4 lt4, gt4 gt4, boolean z2, int i, bt4 bt4) {
        this.a = ht4;
        this.b = lt4;
        this.c = gt4;
        this.o = z2;
        this.v = i;
        this.w = bt4;
    }

    public final void a(boolean z2) {
        if (z2) {
            this.w = null;
        }
        if (!this.x) {
            this.x = true;
            this.b.cancel();
            interrupt();
        }
    }

    public final void b(float f, long j, long j2) {
        this.c.a = j2;
        this.c.b = f;
        if (j != this.z) {
            this.z = j;
            bt4 bt4 = this.w;
            if (bt4 != null) {
                bt4.obtainMessage(11, (int) (j >> 32), (int) j, this).sendToTarget();
            }
        }
    }

    public final void run() {
        long j;
        int i;
        try {
            if (this.o) {
                this.b.remove();
            } else {
                j = -1;
                i = 0;
                while (!this.x) {
                    this.b.a(this);
                }
            }
        } catch (IOException e) {
            if (!this.x) {
                long j2 = this.c.a;
                if (j2 != j) {
                    i = 0;
                    j = j2;
                }
                int i2 = i + 1;
                if (i2 <= this.v) {
                    Thread.sleep((long) Math.min(i * 1000, 5000));
                    i = i2;
                } else {
                    throw e;
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e2) {
            this.y = e2;
        }
        bt4 bt4 = this.w;
        if (bt4 != null) {
            bt4.obtainMessage(10, this).sendToTarget();
        }
    }
}
