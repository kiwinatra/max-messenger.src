package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ss2  reason: default package */
public final class ss2 {
    public static final ss2 c = new ss2(CollectionsKt.emptyList(), true);
    public final List a;
    public final boolean b;

    public ss2(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss2)) {
            return false;
        }
        ss2 ss2 = (ss2) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ss2.a) && this.b == ss2.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatsList(chats=" + this.a + ", hasMore=" + this.b + ")";
    }
}
