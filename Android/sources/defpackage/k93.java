package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: k93  reason: default package */
public final class k93 {
    public final j93 a;
    public final l93 b;
    public final m93 c;

    public k93(j93 j93, l93 l93, m93 m93) {
        this.a = j93;
        this.b = l93;
        this.c = m93;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k93)) {
            return false;
        }
        k93 k93 = (k93) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) k93.a) && Intrinsics.areEqual((Object) this.b, (Object) k93.b) && Intrinsics.areEqual((Object) this.c, (Object) k93.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CommonStatesColors(backgroundActive=" + this.a + ", iconDisabled=" + this.b + ", textDisabled=" + this.c + ")";
    }
}
