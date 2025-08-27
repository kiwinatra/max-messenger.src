package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: xeg  reason: default package */
public final class xeg implements t9d {
    public final eu9 a;

    public xeg(eu9 eu9) {
        this.a = eu9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xeg) && Intrinsics.areEqual((Object) this.a, (Object) ((xeg) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "WatchTogetherUpdateNotification(updates=" + this.a + ")";
    }
}
