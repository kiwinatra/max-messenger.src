package defpackage;

import bolts.Task;

/* renamed from: hdf  reason: default package */
public final class hdf implements nx3 {
    public final Object a(Task task) {
        return task.isCancelled() ? Task.cancelled() : task.isFaulted() ? Task.forError(task.getError()) : Task.forResult(null);
    }
}
