package defpackage;

import java.util.concurrent.locks.LockSupport;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: rp0  reason: default package */
public final class rp0 extends g0 {
    public final Thread o;
    public final a95 v;

    public rp0(CoroutineContext coroutineContext, Thread thread, a95 a95) {
        super(coroutineContext, true, true);
        this.o = thread;
        this.v = a95;
    }

    public final void w(Object obj) {
        Thread currentThread = Thread.currentThread();
        Thread thread = this.o;
        if (!Intrinsics.areEqual((Object) currentThread, (Object) thread)) {
            LockSupport.unpark(thread);
        }
    }
}
