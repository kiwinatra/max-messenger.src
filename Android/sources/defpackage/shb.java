package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: shb  reason: default package */
public final class shb {
    public final String a;
    public final List b;

    public shb(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shb)) {
            return false;
        }
        shb shb = (shb) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) shb.a) && Intrinsics.areEqual((Object) this.b, (Object) shb.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "SearchState(query=" + this.a + ", chats=" + this.b + ")";
    }
}
