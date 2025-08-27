package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;

/* renamed from: vu7  reason: default package */
public final class vu7 extends tu7 implements zu7 {
    public final ju7 a;
    public final CoroutineContext b;

    public vu7(ju7 ju7, CoroutineContext coroutineContext) {
        this.a = ju7;
        this.b = coroutineContext;
        if (((lv7) ju7).d == iu7.a) {
            kv0.n(coroutineContext, (CancellationException) null);
        }
    }

    public final CoroutineContext U() {
        return this.b;
    }

    public final void d(jv7 jv7, hu7 hu7) {
        ju7 ju7 = this.a;
        if (((lv7) ju7).d.compareTo(iu7.a) <= 0) {
            ju7.b(this);
            kv0.n(this.b, (CancellationException) null);
        }
    }
}
