package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j2d  reason: default package */
public final class j2d implements Serializable {
    public final List a;

    public j2d(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2d) && Intrinsics.areEqual((Object) this.a, (Object) ((j2d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tr1.l(new StringBuilder("ReplyKeyboard(buttonAttaches="), this.a, ")");
    }
}
