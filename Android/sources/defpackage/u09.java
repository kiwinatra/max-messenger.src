package defpackage;

import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: u09  reason: default package */
public final class u09 {
    public final String a;
    public final String b = u09.class.getName();
    public final Lazy c = LazyKt.lazy(new t09(this, 0));
    public final Lazy d = LazyKt.lazy(new t09(this, 1));
    public final Lazy e = LazyKt.lazy(new t09(this, 2));
    public final Lazy f = LazyKt.lazy(new t09(this, 3));

    public u09(String str) {
        this.a = str;
    }
}
