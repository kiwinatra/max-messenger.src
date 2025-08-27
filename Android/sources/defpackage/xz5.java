package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: xz5  reason: default package */
public final class xz5 extends yz5 {
    public final z26 a;

    public xz5(z26 z26) {
        this.a = z26;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xz5) && Intrinsics.areEqual((Object) this.a, (Object) ((xz5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenFolderPage(mode=" + this.a + ")";
    }
}
