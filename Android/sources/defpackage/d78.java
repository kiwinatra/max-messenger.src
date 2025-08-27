package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;

/* renamed from: d78  reason: default package */
public final class d78 extends qm implements lcf {
    public final boolean o;
    public final List v;
    public final boolean w;
    public final String x = d78.class.getName();

    public d78(long j, List list, boolean z, boolean z2) {
        super(j);
        this.o = z;
        this.v = list;
        this.w = z2;
    }

    public final void e(ibf ibf) {
        Object unused = ev0.C(EmptyCoroutineContext.INSTANCE, new c78(this, (Continuation) null));
    }

    public final fbf g() {
        return (e78) ev0.C(EmptyCoroutineContext.INSTANCE, new a78(this, (Continuation) null));
    }

    public final void h(qaf qaf) {
        Object unused = ev0.C(EmptyCoroutineContext.INSTANCE, new b78(this, (Continuation) null));
    }
}
