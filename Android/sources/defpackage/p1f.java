package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;

/* renamed from: p1f  reason: default package */
public final class p1f {
    public final Lazy a;
    public final Lazy b;
    public final ConcurrentHashMap c = new ConcurrentHashMap();

    public p1f(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }
}
