package defpackage;

import bolts.Task;
import java.util.concurrent.CancellationException;

/* renamed from: fdf  reason: default package */
public final class fdf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rdf b;
    public final /* synthetic */ nx3 c;
    public final /* synthetic */ Task o;

    public /* synthetic */ fdf(rdf rdf, nx3 nx3, Task task, int i) {
        this.a = i;
        this.b = rdf;
        this.c = nx3;
        this.o = task;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                rdf rdf = this.b;
                try {
                    rdf.c(this.c.a(this.o));
                    return;
                } catch (CancellationException unused) {
                    rdf.a();
                    return;
                } catch (Exception e) {
                    rdf.b(e);
                    return;
                }
            default:
                rdf rdf2 = this.b;
                try {
                    Task task = (Task) this.c.a(this.o);
                    if (task == null) {
                        rdf2.c((Object) null);
                        return;
                    } else {
                        task.continueWith(new gdf(0, this));
                        return;
                    }
                } catch (CancellationException unused2) {
                    rdf2.a();
                    return;
                } catch (Exception e2) {
                    rdf2.b(e2);
                    return;
                }
        }
    }
}
