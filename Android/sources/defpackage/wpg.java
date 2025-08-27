package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wpg  reason: default package */
public final class wpg {
    public final String a;
    public final xog b;
    public final t64 c;
    public final int d;
    public final int e;
    public final List f;
    public final List g;

    public wpg(String str, xog xog, t64 t64, int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = xog;
        this.c = t64;
        this.d = i;
        this.e = i2;
        this.f = arrayList;
        this.g = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpg)) {
            return false;
        }
        wpg wpg = (wpg) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) wpg.a) && this.b == wpg.b && Intrinsics.areEqual((Object) this.c, (Object) wpg.c) && this.d == wpg.d && this.e == wpg.e && Intrinsics.areEqual((Object) this.f, (Object) wpg.f) && Intrinsics.areEqual((Object) this.g, (Object) wpg.g);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.g.hashCode() + rae.i(this.f, rae.h(this.e, rae.h(this.d, (hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", runAttemptCount=" + this.d + ", generation=" + this.e + ", tags=" + this.f + ", progress=" + this.g + ')';
    }
}
