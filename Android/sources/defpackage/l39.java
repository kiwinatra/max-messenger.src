package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l39  reason: default package */
public final class l39 implements n39 {
    public final List a;

    public l39(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l39) && Intrinsics.areEqual((Object) this.a, (Object) ((l39) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr1.l(new StringBuilder("ContactsUpdate(ids="), this.a, ")");
    }
}
