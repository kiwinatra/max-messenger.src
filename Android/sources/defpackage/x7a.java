package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x7a  reason: default package */
public final class x7a {
    public final String a;
    public final List b;

    public x7a(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7a)) {
            return false;
        }
        x7a x7a = (x7a) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) x7a.a) && Intrinsics.areEqual((Object) this.b, (Object) x7a.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NeuroAvatarsPresetInfo(name=" + this.a + ", avatars=" + this.b + ")";
    }
}
