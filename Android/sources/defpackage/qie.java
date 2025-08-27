package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;

/* renamed from: qie  reason: default package */
public final class qie implements Continuation, CoroutineStackFrame {
    public final Continuation a;
    public final CoroutineContext b;

    public qie(Continuation continuation, CoroutineContext coroutineContext) {
        this.a = continuation;
        this.b = coroutineContext;
    }

    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.a;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    public final CoroutineContext getContext() {
        return this.b;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
