package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: b65  reason: default package */
public final /* synthetic */ class b65 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c65 b;
    public final /* synthetic */ zz7 c;

    public /* synthetic */ b65(c65 c65, zz7 zz7, int i) {
        this.a = i;
        this.b = c65;
        this.c = zz7;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                c65 c65 = this.b;
                c65.getClass();
                zz7 zz7 = this.c;
                if (!zz7.cancel(true)) {
                    bs0.r((String) null, zz7.isDone());
                    try {
                        ((eg7) zz7.get()).a();
                        return;
                    } catch (InterruptedException | CancellationException | ExecutionException e) {
                        String str = c65.o.a;
                        e.toString();
                        return;
                    }
                } else {
                    return;
                }
            default:
                this.b.c.remove(this.c);
                return;
        }
    }
}
