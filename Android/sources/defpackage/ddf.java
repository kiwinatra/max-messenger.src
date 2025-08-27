package defpackage;

import bolts.Task;
import java.util.concurrent.Executor;

/* renamed from: ddf  reason: default package */
public final class ddf implements nx3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rdf b;
    public final /* synthetic */ nx3 c;
    public final /* synthetic */ Executor d;

    public /* synthetic */ ddf(rdf rdf, nx3 nx3, Executor executor, int i) {
        this.a = i;
        this.b = rdf;
        this.c = nx3;
        this.d = executor;
    }

    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                Task.completeImmediately(this.b, this.c, task, this.d, (sw1) null);
                return null;
            default:
                Task.completeAfterTask(this.b, this.c, task, this.d, (sw1) null);
                return null;
        }
    }
}
