package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* renamed from: l6e  reason: default package */
public final class l6e implements pq4 {
    public final n6e a;
    public final long b;
    public final Object c;
    public final Continuation o;

    public l6e(n6e n6e, long j, Object obj, lw1 lw1) {
        this.a = n6e;
        this.b = j;
        this.c = obj;
        this.o = lw1;
    }

    public final void dispose() {
        n6e n6e = this.a;
        synchronized (n6e) {
            if (this.b >= n6e.r()) {
                Object[] objArr = n6e.y;
                if (m5a.c(objArr, this.b) == this) {
                    m5a.d(objArr, this.b, m5a.c);
                    n6e.m();
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }
}
