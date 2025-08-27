package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: lu1  reason: default package */
public final class lu1 extends ou1 {
    public final String b;
    public final List c;

    public lu1(String str, List list) {
        super(list);
        this.b = str;
        this.c = list;
    }

    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu1)) {
            return false;
        }
        lu1 lu1 = (lu1) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) lu1.b) && Intrinsics.areEqual((Object) this.c, (Object) lu1.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "Back(cameraId=" + this.b + ", cameraParameterList=" + this.c + ")";
    }
}
