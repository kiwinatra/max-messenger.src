package defpackage;

import bolts.Task;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: idf  reason: default package */
public final class idf implements nx3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ rdf c;

    public /* synthetic */ idf(AtomicBoolean atomicBoolean, rdf rdf, int i) {
        this.a = i;
        this.b = atomicBoolean;
        this.c = rdf;
    }

    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                if (this.b.compareAndSet(false, true)) {
                    this.c.c(task);
                    return null;
                }
                task.getError();
                return null;
            default:
                if (this.b.compareAndSet(false, true)) {
                    this.c.c(task);
                    return null;
                }
                task.getError();
                return null;
        }
    }
}
