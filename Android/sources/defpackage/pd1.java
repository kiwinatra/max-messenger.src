package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: pd1  reason: default package */
public final class pd1 extends rd1 {
    public final Integer a;

    public pd1(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pd1) && Intrinsics.areEqual((Object) this.a, (Object) ((pd1) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "Description(description=" + this.a + ")";
    }
}
