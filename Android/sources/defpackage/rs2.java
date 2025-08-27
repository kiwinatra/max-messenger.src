package defpackage;

import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;

/* renamed from: rs2  reason: default package */
public final class rs2 implements dz6 {
    public static final List f = CollectionsKt.listOf(new Object());
    public final Lazy b;
    public final Lazy c;
    public final v00 d = new v00(14);
    public final v00 e = new v00(15);

    public rs2(Lazy lazy, Lazy lazy2) {
        this.b = LazyKt.lazy(new ps2(lazy, lazy2, this, 0));
        this.c = LazyKt.lazy(new ps2(lazy, lazy2, this, 1));
    }

    public final boolean a() {
        return false;
    }

    public final Comparator c() {
        return this.d;
    }

    public final Comparator e() {
        return this.e;
    }

    public final long g() {
        return ((Number) this.b.getValue()).longValue();
    }

    public final long h() {
        return ((Number) this.c.getValue()).longValue();
    }

    public final List i() {
        return f;
    }
}
