package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: wt3  reason: default package */
public final class wt3 {
    public final gr3 a;

    public wt3(gr3 gr3) {
        this.a = gr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wt3) && Intrinsics.areEqual((Object) this.a, (Object) ((wt3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnResult(contactsResult=" + this.a + ")";
    }
}
