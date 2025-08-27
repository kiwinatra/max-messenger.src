package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ku4  reason: default package */
public final class ku4 {
    public final zt4 a;
    public final zt4 b;

    public ku4(zt4 zt4, zt4 zt42) {
        this.a = zt4;
        this.b = zt42;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku4)) {
            return false;
        }
        ku4 ku4 = (ku4) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ku4.a) && Intrinsics.areEqual((Object) this.b, (Object) ku4.b);
    }

    public final int hashCode() {
        int i = 0;
        zt4 zt4 = this.a;
        int hashCode = (zt4 == null ? 0 : zt4.hashCode()) * 31;
        zt4 zt42 = this.b;
        if (zt42 != null) {
            i = zt42.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "DraftsNews(chats=" + this.a + ", users=" + this.b + ")";
    }
}
