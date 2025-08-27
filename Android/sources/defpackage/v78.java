package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: v78  reason: default package */
public final class v78 implements Comparable {
    public static final v78 b = new v78(e4e.c);
    public static final v78 c = new v78(e4e.o);
    public static final v78 o = new v78(e4e.v);
    public static final v78 v = new v78(e4e.w);
    public static final v78 w = new v78(e4e.x);
    public static final v78 x = new v78(e4e.y);
    public final e4e a;

    public v78(e4e e4e) {
        this.a = e4e;
    }

    public final int compareTo(Object obj) {
        return Intrinsics.compare(this.a.b, ((v78) obj).a.b);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return this.a.a;
    }
}
