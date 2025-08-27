package defpackage;

import android.util.Pair;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: wif  reason: default package */
public final class wif implements xvb {
    public final xvb a;
    public int b = 0;
    public final ConcurrentLinkedQueue c = new ConcurrentLinkedQueue();
    public final Executor d;

    public wif(Executor executor, u3d u3d) {
        executor.getClass();
        this.d = executor;
        this.a = u3d;
    }

    public final void a(zi0 zi0, yvb yvb) {
        boolean z;
        ik0 ik0 = (ik0) yvb;
        ik0.c.j(yvb, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i = this.b;
                z = true;
                if (i >= 5) {
                    this.c.add(Pair.create(zi0, yvb));
                } else {
                    this.b = i + 1;
                    z = false;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (!z) {
            ik0.c.a(yvb, "ThrottlingProducer", (Map) null);
            this.a.a(new vif(this, zi0), yvb);
        }
    }
}
