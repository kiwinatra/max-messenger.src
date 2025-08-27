package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: w9e  reason: default package */
public final class w9e implements x9e {
    public final r9e a;

    public w9e(r9e r9e) {
        this.a = r9e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w9e) && Intrinsics.areEqual((Object) this.a, (Object) ((w9e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Replace(command=" + this.a + ")";
    }
}
