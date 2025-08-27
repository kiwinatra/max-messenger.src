package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fc6  reason: default package */
public final class fc6 extends y8 {
    public final /* synthetic */ AtomicReference a;

    public fc6(AtomicReference atomicReference) {
        this.a = atomicReference;
    }

    public final void a(Object obj) {
        y8 y8Var = (y8) this.a.get();
        if (y8Var != null) {
            y8Var.a(obj);
            return;
        }
        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }
}
