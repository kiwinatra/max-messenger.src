package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: da1  reason: default package */
public final class da1 extends ka1 {
    public final zd0 a;

    public da1(zd0 zd0) {
        this.a = zd0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof da1) && Intrinsics.areEqual((Object) this.a, (Object) ((da1) obj).a);
    }

    public final int hashCode() {
        zd0 zd0 = this.a;
        if (zd0 == null) {
            return 0;
        }
        return zd0.hashCode();
    }

    public final String toString() {
        return "Avatar(avatarInfo=" + this.a + ")";
    }
}
