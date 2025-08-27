package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: nf6  reason: default package */
public final /* synthetic */ class nf6 implements r2f {
    public final /* synthetic */ AtomicBoolean a;

    public /* synthetic */ nf6(AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
    }

    public final Object get() {
        return Boolean.valueOf(this.a.get());
    }
}
