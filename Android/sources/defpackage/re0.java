package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;

/* renamed from: re0  reason: default package */
public final class re0 extends dn7 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater y = AtomicReferenceFieldUpdater.newUpdater(re0.class, Object.class, "_disposer$volatile");
    private volatile /* synthetic */ Object _disposer$volatile;
    public final kw1 v;
    public pq4 w;
    public final /* synthetic */ te0 x;

    public re0(te0 te0, lw1 lw1) {
        this.x = te0;
        this.v = lw1;
    }

    public final boolean h() {
        return false;
    }

    public final void i(Throwable th) {
        kw1 kw1 = this.v;
        if (th != null) {
            bpa o = kw1.o(th);
            if (o != null) {
                kw1.v(o);
                se0 se0 = (se0) y.get(this);
                if (se0 != null) {
                    se0.a();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = te0.b;
        te0 te0 = this.x;
        if (atomicIntegerFieldUpdater.decrementAndGet(te0) == 0) {
            mk4[] mk4Arr = te0.a;
            ArrayList arrayList = new ArrayList(mk4Arr.length);
            for (mk4 m : mk4Arr) {
                arrayList.add(m.m());
            }
            kw1.resumeWith(Result.m23constructorimpl(arrayList));
        }
    }
}
