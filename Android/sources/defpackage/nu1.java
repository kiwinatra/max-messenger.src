package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: nu1  reason: default package */
public final class nu1 extends ou1 {
    public final String b;
    public final List c;

    public nu1(String str, List list) {
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
        if (!(obj instanceof nu1)) {
            return false;
        }
        nu1 nu1 = (nu1) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) nu1.b) && Intrinsics.areEqual((Object) this.c, (Object) nu1.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "Unknown(cameraId=" + this.b + ", cameraParameterList=" + this.c + ")";
    }
}
