package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: no3  reason: default package */
public final class no3 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public no3(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
    }

    public final void a(qaf qaf, long[] jArr, long j) {
        if (Intrinsics.areEqual((Object) "not.found", (Object) qaf.b)) {
            km3 km3 = (km3) this.b.getValue();
            for (long w : jArr) {
                km3.w(w);
            }
        }
        ((sv0) this.a.getValue()).c(new hj0(j, qaf));
    }

    public final void b(jo3 jo3, long[] jArr, long j) {
        ((km3) this.b.getValue()).B(jo3.d(), jArr);
        List d = jo3.d();
        ws wsVar = new ws(0);
        Iterator it = ((ArrayList) d).iterator();
        while (it.hasNext()) {
            wsVar.add(Long.valueOf(((fo3) it.next()).a));
        }
        for (long valueOf : jArr) {
            wsVar.add(Long.valueOf(valueOf));
        }
        if (!wsVar.isEmpty()) {
            ((oj7) this.c.getValue()).a(wsVar);
            ((sv0) this.a.getValue()).c(new zu3(j, wsVar));
        }
    }
}
