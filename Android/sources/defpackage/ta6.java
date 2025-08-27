package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ta6  reason: default package */
public final class ta6 {
    public final Set a;
    public final jgd b;

    public ta6(LinkedHashSet linkedHashSet, jgd jgd) {
        this.a = linkedHashSet;
        this.b = jgd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta6)) {
            return false;
        }
        ta6 ta6 = (ta6) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ta6.a) && this.b == ta6.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ForwardInAppReviewData(triggeredConditions=" + this.a + ", screen=" + this.b + ")";
    }
}
