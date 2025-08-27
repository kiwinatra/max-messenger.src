package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: hu9  reason: default package */
public final class hu9 {
    public final List a;

    public hu9(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hu9) && Intrinsics.areEqual((Object) this.a, (Object) ((hu9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr1.l(new StringBuilder("MovieThumbnail(qualities="), this.a, ")");
    }
}
