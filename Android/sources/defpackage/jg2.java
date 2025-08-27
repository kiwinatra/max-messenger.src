package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: jg2  reason: default package */
public final class jg2 {
    public static final jg2 d = new jg2(CollectionsKt.emptyList(), false, false);
    public final List a;
    public final boolean b;
    public final boolean c;

    public jg2(List list, boolean z, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg2)) {
            return false;
        }
        jg2 jg2 = (jg2) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) jg2.a) && this.b == jg2.b && this.c == jg2.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + g63.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachesViewState(messages=");
        sb.append(this.a);
        sb.append(", hasMoreNext=");
        sb.append(this.b);
        sb.append(", hasMorePrev=");
        return tr1.m(sb, this.c, ")");
    }
}
