package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: tn1  reason: default package */
public final class tn1 {
    public final q51 a;

    public tn1(q51 q51) {
        this.a = q51;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tn1) && Intrinsics.areEqual((Object) this.a, (Object) ((tn1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Feedback(feedback=" + this.a + ")";
    }
}
