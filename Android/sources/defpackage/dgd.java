package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function1;

/* renamed from: dgd  reason: default package */
public class dgd extends g0 implements CoroutineStackFrame {
    public final Continuation o;

    public dgd(Continuation continuation, CoroutineContext coroutineContext) {
        super(coroutineContext, true, true);
        this.o = continuation;
    }

    public final boolean Q() {
        return true;
    }

    public final CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.o;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public void w(Object obj) {
        y7e.U(IntrinsicsKt.intercepted(this.o), lb3.a(obj), (Function1) null);
    }

    public void x(Object obj) {
        this.o.resumeWith(lb3.a(obj));
    }
}
