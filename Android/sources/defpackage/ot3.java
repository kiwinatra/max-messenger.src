package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ot3  reason: default package */
public final class ot3 {
    public final Integer a;

    public ot3(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ot3) && Intrinsics.areEqual((Object) this.a, (Object) ((ot3) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "ButtonTitle(buttonTitleRes=" + this.a + ")";
    }
}
