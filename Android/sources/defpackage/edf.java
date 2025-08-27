package defpackage;

import bolts.Task;

/* renamed from: edf  reason: default package */
public final class edf implements nx3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nx3 b;

    public /* synthetic */ edf(nx3 nx3, int i) {
        this.a = i;
        this.b = nx3;
    }

    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                return task.isFaulted() ? Task.forError(task.getError()) : task.isCancelled() ? Task.cancelled() : task.continueWith(this.b);
            default:
                return task.isFaulted() ? Task.forError(task.getError()) : task.isCancelled() ? Task.cancelled() : task.continueWithTask(this.b);
        }
    }
}
