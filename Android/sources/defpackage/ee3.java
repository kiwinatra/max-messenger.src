package defpackage;

import java.util.Map;
import kotlin.jvm.internal.markers.KMutableMap;

/* renamed from: ee3  reason: default package */
public final class ee3 implements Map.Entry, KMutableMap.Entry {
    public final Object a;
    public final Object b;

    public ee3(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        return this.b;
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("not implemented");
    }
}
