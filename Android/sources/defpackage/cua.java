package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: cua  reason: default package */
public final class cua {
    public final String a;
    public final r14 b;

    public cua(String str, r14 r14) {
        this.a = str;
        this.b = r14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cua)) {
            return false;
        }
        cua cua = (cua) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) cua.a) && Intrinsics.areEqual((Object) this.b, (Object) cua.b);
    }

    public final int hashCode() {
        return Integer.hashCode(this.b.a) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FolderCounter(folderId=" + this.a + ", counter=" + this.b + ")";
    }
}
