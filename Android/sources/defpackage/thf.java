package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: thf  reason: default package */
public final class thf {
    public final shf a;
    public final rhf b;
    public final List c;

    public thf(shf shf, rhf rhf, List list) {
        this.a = shf;
        this.b = rhf;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof thf)) {
            return false;
        }
        thf thf = (thf) obj;
        if (!Intrinsics.areEqual((Object) this.a, (Object) thf.a) || !Intrinsics.areEqual((Object) this.b, (Object) thf.b)) {
            return false;
        }
        thf.getClass();
        return Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) this.c, (Object) thf.c);
    }

    public final int hashCode() {
        shf shf = this.a;
        int hashCode = (shf == null ? 0 : shf.a.hashCode()) * 31;
        rhf rhf = this.b;
        return this.c.hashCode() + ((((hashCode + (rhf == null ? 0 : rhf.hashCode())) * 31) + 0) * 31);
    }

    public final String toString() {
        return "ThemeBackgroundDrawModel(pattern=" + this.a + ", gradient=" + this.b + ", blur=" + null + ", colorEllipse=" + this.c + ")";
    }
}
