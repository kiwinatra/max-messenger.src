package defpackage;

import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: uj1  reason: default package */
public final class uj1 {
    public final ye1 a;
    public final zwd b;
    public final twd c;

    public uj1(ye1 ye1, zwd zwd, twd twd) {
        this.a = ye1;
        this.b = zwd;
        this.c = twd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj1)) {
            return false;
        }
        uj1 uj1 = (uj1) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) uj1.a) && Intrinsics.areEqual((Object) this.b, (Object) uj1.b) && Intrinsics.areEqual((Object) this.c, (Object) uj1.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Objects.hashCode(this.a.a) * 31)) * 31;
        twd twd = this.c;
        return hashCode + (twd == null ? 0 : twd.hashCode());
    }

    public final String toString() {
        return "InvitedParams(me=" + this.a + ", roomId=" + this.b + ", room=" + this.c + ")";
    }
}
