package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: edd  reason: default package */
public final class edd implements ome {
    public final /* synthetic */ ome a;

    public edd(qx2 qx2) {
        ay2 ay2 = ((my2) qx2).b;
        this.a = (ome) ((ConcurrentHashMap) ay2.y).computeIfAbsent(0L, new yi(4, new rx2(0, ay2)));
    }

    public final Object e(ds5 ds5, Continuation continuation) {
        return this.a.e(ds5, continuation);
    }

    public final Object getValue() {
        return (a32) this.a.getValue();
    }
}
