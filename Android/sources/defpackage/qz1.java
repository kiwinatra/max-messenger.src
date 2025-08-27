package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: qz1  reason: default package */
public final class qz1 {
    public final e02 a;
    public final List b;

    public qz1(e02 e02, List list) {
        this.a = e02;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz1)) {
            return false;
        }
        qz1 qz1 = (qz1) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) qz1.a) && Intrinsics.areEqual((Object) this.b, (Object) qz1.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "State(screenState=" + this.a + ", items=" + this.b + ")";
    }
}
