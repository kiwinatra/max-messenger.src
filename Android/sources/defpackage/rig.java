package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: rig  reason: default package */
public final class rig implements tig {
    public final String a;
    public final tjg b;

    public rig(String str, tjg tjg) {
        this.a = str;
        this.b = tjg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rig)) {
            return false;
        }
        rig rig = (rig) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) rig.a) && Intrinsics.areEqual((Object) this.b, (Object) rig.b);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        tjg tjg = this.b;
        if (tjg != null) {
            i = tjg.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ShowShareDialog(text=" + this.a + ", fileInfo=" + this.b + ")";
    }
}
