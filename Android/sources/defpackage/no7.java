package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: no7  reason: default package */
public final class no7 implements oo7 {
    public final wjg a;
    public final tjg b;

    public no7(wjg wjg, tjg tjg) {
        this.a = wjg;
        this.b = tjg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no7)) {
            return false;
        }
        no7 no7 = (no7) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) no7.a) && Intrinsics.areEqual((Object) this.b, (Object) no7.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        tjg tjg = this.b;
        return hashCode + (tjg == null ? 0 : tjg.hashCode());
    }

    public final String toString() {
        return "RequestShare(data=" + this.a + ", fileInfo=" + this.b + ")";
    }
}
