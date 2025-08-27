package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f6c  reason: default package */
public final class f6c extends h6c {
    public final List a;

    public f6c(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f6c) && Intrinsics.areEqual((Object) this.a, (Object) ((f6c) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr1.l(new StringBuilder("ShowPhoneActionsMenu(actions="), this.a, ")");
    }
}
