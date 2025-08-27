package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v1f  reason: default package */
public final class v1f {
    public static final v1f g = new v1f((String) null, 0, 0, CollectionsKt.emptyList());
    public final String a;
    public final int b;
    public final int c;
    public final List d;
    public final int e;
    public final boolean f;

    public v1f(String str, int i, int i2, List list) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = list;
        this.e = list.size();
        this.f = list.size() < i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1f)) {
            return false;
        }
        v1f v1f = (v1f) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) v1f.a) && this.b == v1f.b && this.c == v1f.c && Intrinsics.areEqual((Object) this.d, (Object) v1f.d);
    }

    public final int hashCode() {
        String str = this.a;
        return this.d.hashCode() + rae.h(this.c, rae.h(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuggestsResult(query=");
        sb.append(this.a);
        sb.append(", cursorPosition=");
        sb.append(this.b);
        sb.append(", totalCount=");
        sb.append(this.c);
        sb.append(", result=");
        return tr1.l(sb, this.d, ")");
    }
}
