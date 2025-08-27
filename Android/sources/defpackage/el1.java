package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: el1  reason: default package */
public final class el1 extends ld9 {
    public final String r;
    public final boolean s;

    public el1(String str, boolean z) {
        this.r = str;
        this.s = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el1)) {
            return false;
        }
        el1 el1 = (el1) obj;
        return Intrinsics.areEqual((Object) this.r, (Object) el1.r) && this.s == el1.s;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.s) + (this.r.hashCode() * 31);
    }

    public final String toString() {
        return "Link(link=" + this.r + ", isJoinByExistLink=" + this.s + ")";
    }
}
