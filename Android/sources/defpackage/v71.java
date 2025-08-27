package defpackage;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;

/* renamed from: v71  reason: default package */
public final class v71 extends xag {
    public final xme X;
    public final Lazy b;
    public final qpg c;
    public final lf1 o;
    public final Lazy v = LazyKt.lazy(LazyThreadSafetyMode.NONE, new j6(20, this));
    public final xme w;
    public final xme x;
    public final xme y;
    public final xme z;

    public v71(Lazy lazy, qpg qpg, lf1 lf1) {
        this.b = lazy;
        this.c = qpg;
        this.o = lf1;
        xme a = f6e.a(new t71());
        this.w = a;
        this.x = a;
        xme a2 = f6e.a(new aq1(CollectionsKt.emptyList(), false));
        this.y = a2;
        this.z = a2;
        xme a3 = f6e.a(Boolean.FALSE);
        this.X = a3;
        bs0.K(new ps5(a3, new s71(this, (Continuation) null), 5), this.a);
    }

    public final void j(long j, mz6 mz6) {
        xme xme;
        Object value;
        t71 t71;
        Map mutableMap;
        do {
            xme = this.w;
            value = xme.getValue();
            t71 = (t71) value;
            mutableMap = MapsKt.toMutableMap(t71.b);
            if (mutableMap.containsKey(Long.valueOf(j))) {
                mz6 mz62 = (mz6) mutableMap.remove(Long.valueOf(j));
            } else {
                mz6 mz63 = (mz6) mutableMap.put(Long.valueOf(j), mz6);
            }
            Unit unit = Unit.INSTANCE;
        } while (!xme.b(value, new t71(mutableMap, t71.a)));
    }
}
