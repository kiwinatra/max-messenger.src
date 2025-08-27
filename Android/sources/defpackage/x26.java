package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: x26  reason: default package */
public final class x26 extends y26 {
    public final c05 a;

    public x26(c05 c05) {
        this.a = c05;
    }

    public final long a() {
        return (long) this.a.a.hashCode();
    }

    public final int b() {
        return 31291;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x26) && Intrinsics.areEqual((Object) this.a, (Object) ((x26) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FolderItem(folderModel=" + this.a + ")";
    }
}
