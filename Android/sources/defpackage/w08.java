package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: w08  reason: default package */
public final class w08 implements dla {
    public final AtomicBoolean a = new AtomicBoolean(true);
    public final iha b;
    public final Executor c;

    public w08(Executor executor, iha iha) {
        this.c = executor;
        this.b = iha;
    }

    public final void a(Object obj) {
        this.c.execute(new uo5(21, (Object) this, (Object) (x08) obj));
    }
}
