package defpackage;

import bolts.Task;

/* renamed from: rdf  reason: default package */
public class rdf {
    public final Task a = new Task();

    public final void a() {
        if (!this.a.trySetCancelled()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    public final void b(Exception exc) {
        if (!this.a.trySetError(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public final void c(Object obj) {
        if (!this.a.trySetResult(obj)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }
}
