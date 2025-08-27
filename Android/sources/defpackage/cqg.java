package defpackage;

/* renamed from: cqg  reason: default package */
public final class cqg implements Runnable {
    public final dqg a;
    public final wog b;

    public cqg(dqg dqg, wog wog) {
        this.a = dqg;
        this.b = wog;
    }

    public final void run() {
        synchronized (this.a.d) {
            try {
                if (((cqg) this.a.b.remove(this.b)) != null) {
                    bqg bqg = (bqg) this.a.c.remove(this.b);
                    if (bqg != null) {
                        wog wog = this.b;
                        zk4 zk4 = (zk4) bqg;
                        h88 x = h88.x();
                        x.p(zk4.v0, "Exceeded time limits on execution for " + wog);
                        zk4.y.execute(new yk4(zk4, 0));
                    }
                } else {
                    h88 x2 = h88.x();
                    wog wog2 = this.b;
                    x2.p("WrkTimerRunnable", "Timer with " + wog2 + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
