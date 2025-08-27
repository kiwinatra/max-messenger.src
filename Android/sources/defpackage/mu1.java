package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mu1  reason: default package */
public final class mu1 extends ou1 {
    public final String b;
    public final List c;

    public mu1(String str, List list) {
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
        if (!(obj instanceof mu1)) {
            return false;
        }
        mu1 mu1 = (mu1) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) mu1.b) && Intrinsics.areEqual((Object) this.c, (Object) mu1.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "Front(cameraId=" + this.b + ", cameraParameterList=" + this.c + ")";
    }
}
