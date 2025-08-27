package defpackage;

import bolts.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: jdf  reason: default package */
public final class jdf implements nx3 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ AtomicBoolean c;
    public final /* synthetic */ AtomicInteger d;
    public final /* synthetic */ rdf e;

    public jdf(Object obj, ArrayList arrayList, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, rdf rdf) {
        this.a = obj;
        this.b = arrayList;
        this.c = atomicBoolean;
        this.d = atomicInteger;
        this.e = rdf;
    }

    /* JADX WARNING: type inference failed for: r6v10, types: [bolts.AggregateException, java.lang.Exception] */
    public final Object a(Task task) {
        if (task.isFaulted()) {
            synchronized (this.a) {
                this.b.add(task.getError());
            }
        }
        if (task.isCancelled()) {
            this.c.set(true);
        }
        if (this.d.decrementAndGet() == 0) {
            if (this.b.size() != 0) {
                if (this.b.size() == 1) {
                    this.e.b((Exception) this.b.get(0));
                } else {
                    String format = String.format("There were %d exceptions.", new Object[]{Integer.valueOf(this.b.size())});
                    ArrayList arrayList = this.b;
                    ? exc = new Exception(format, (arrayList == null || arrayList.size() <= 0) ? null : (Throwable) arrayList.get(0));
                    exc.a = Collections.unmodifiableList(arrayList);
                    this.e.b(exc);
                }
            } else if (this.c.get()) {
                this.e.a();
            } else {
                this.e.c((Object) null);
            }
        }
        return null;
    }
}
