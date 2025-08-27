package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: kf0  reason: default package */
public final class kf0 {
    public static final List b = CollectionsKt.listOf("space_light", "gradient_light");
    public static final List c = CollectionsKt.listOf("space_dark", "gradient_dark");
    public final String a;

    public kf0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kf0) && Intrinsics.areEqual((Object) this.a, (Object) ((kf0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wj6.n(new StringBuilder("BackgroundNameId(name="), this.a, ")");
    }
}
