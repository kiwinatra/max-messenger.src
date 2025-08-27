package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: zd0  reason: default package */
public final class zd0 {
    public final gd0 a;
    public final String b;

    public zd0(gd0 gd0, String str) {
        this.a = gd0;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zd0)) {
            return false;
        }
        zd0 zd0 = (zd0) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) zd0.a) && Intrinsics.areEqual((Object) this.b, (Object) zd0.b);
    }

    public final int hashCode() {
        int i = 0;
        gd0 gd0 = this.a;
        int hashCode = (gd0 == null ? 0 : gd0.hashCode()) * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AvatarInfo(abbreviationModel=" + this.a + ", url=" + this.b + ")";
    }
}
