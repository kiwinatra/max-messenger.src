package defpackage;

import bolts.Task;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: lp4  reason: default package */
public final class lp4 implements nx3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public lp4(np4 np4, ej7 ej7, yvb yvb, zi0 zi0) {
        this.e = np4;
        this.b = ej7;
        this.c = yvb;
        this.d = zi0;
    }

    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                boolean isCancelled = task.isCancelled();
                zi0 zi0 = (zi0) this.d;
                bwb bwb = (bwb) this.b;
                yvb yvb = (yvb) this.c;
                if (isCancelled || (task.isFaulted() && (task.getError() instanceof CancellationException))) {
                    bwb.k(yvb, "DiskCacheProducer");
                    zi0.c();
                } else {
                    boolean isFaulted = task.isFaulted();
                    np4 np4 = (np4) this.e;
                    if (isFaulted) {
                        bwb.d(yvb, "DiskCacheProducer", task.getError(), (Map) null);
                        np4.d.a(zi0, yvb);
                    } else {
                        j55 j55 = (j55) task.getResult();
                        if (j55 != null) {
                            bwb.a(yvb, "DiskCacheProducer", np4.c((ej7) bwb, yvb, true, j55.o()));
                            bwb.e(yvb, "DiskCacheProducer", true);
                            ((ik0) yvb).h("disk", "default");
                            zi0.i(1.0f);
                            zi0.g(1, j55);
                            j55.close();
                        } else {
                            bwb.a(yvb, "DiskCacheProducer", np4.c((ej7) bwb, yvb, false, 0));
                            np4.d.a(zi0, yvb);
                        }
                    }
                }
                return null;
            default:
                if (!((Boolean) ((Callable) this.b).call()).booleanValue()) {
                    return Task.forResult(null);
                }
                Executor executor = (Executor) this.d;
                return Task.forResult(null).onSuccessTask((nx3) this.c, executor).onSuccessTask((nx3) ((vs6) this.e).b, executor);
        }
    }

    public lp4(Callable callable, nx3 nx3, Executor executor, vs6 vs6) {
        this.b = callable;
        this.c = nx3;
        this.d = executor;
        this.e = vs6;
    }
}
