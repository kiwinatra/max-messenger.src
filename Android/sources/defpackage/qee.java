package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: qee  reason: default package */
public final class qee implements see {
    public final v88 a;

    public qee(v88 v88) {
        this.a = v88;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qee) && Intrinsics.areEqual((Object) this.a, (Object) ((qee) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.a + ")";
    }
}
