package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.jvm.internal.Boxing;

/* renamed from: tl4  reason: default package */
public final class tl4 {
    public final Lazy a;

    public tl4(Lazy lazy) {
        this.a = lazy;
    }

    public final Unit a(long j, long j2, List list, boolean z) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            rl rlVar = (rl) this.a.getValue();
            ((jna) rlVar).R(z ? -1 : 0, j, j2, CollectionsKt.listOf(Boxing.boxLong(longValue)));
        }
        return Unit.INSTANCE;
    }
}
