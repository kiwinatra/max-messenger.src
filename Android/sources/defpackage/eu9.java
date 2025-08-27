package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: eu9  reason: default package */
public final class eu9 {
    public final List a;

    public eu9(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eu9) && Intrinsics.areEqual((Object) this.a, (Object) ((eu9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr1.l(new StringBuilder("MovieStateUpdates(updates="), this.a, ")");
    }
}
