package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;

/* renamed from: aq4  reason: default package */
public final class aq4 extends dgd {
    public static final /* synthetic */ AtomicIntegerFieldUpdater v = AtomicIntegerFieldUpdater.newUpdater(aq4.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public final void w(Object obj) {
        x(obj);
    }

    public final void x(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = v;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    y7e.U(IntrinsicsKt.intercepted(this.o), lb3.a(obj), (Function1) null);
                    return;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
