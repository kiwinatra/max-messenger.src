package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: qd1  reason: default package */
public final class qd1 extends rd1 {
    public final String a;

    public qd1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qd1) && Intrinsics.areEqual((Object) this.a, (Object) ((qd1) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("Name(name="), this.a, ")");
    }
}
