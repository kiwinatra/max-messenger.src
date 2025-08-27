package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;

/* renamed from: abe  reason: default package */
public final class abe {
    public final Function0 a;
    public final Lazy b;

    public abe(Function0 function0) {
        this.a = function0;
        this.b = LazyKt.lazy(new ve(8, (Object) this));
    }

    public void a(Object obj, String str) {
        AtomicReference atomicReference = (AtomicReference) this.b.getValue();
        while (true) {
            Map map = (Map) atomicReference.get();
            Map mutableMap = MapsKt.toMutableMap(map);
            if (obj == null) {
                mutableMap.remove(str);
            } else {
                mutableMap.put(str, obj);
            }
            while (true) {
                if (!atomicReference.compareAndSet(map, mutableMap)) {
                    if (atomicReference.get() != map) {
                    }
                } else {
                    return;
                }
            }
        }
    }

    public void b() {
        ipf.a(new mgd(10, this));
    }

    public abe(Lazy lazy, j3e j3e) {
        this.a = j3e;
        this.b = lazy;
    }
}
