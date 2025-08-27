package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: a3c  reason: default package */
public final class a3c extends t3c {
    public final List a;

    public a3c(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a3c) && Intrinsics.areEqual((Object) this.a, (Object) ((a3c) obj).a);
    }

    public final long getItemId() {
        return (long) 1;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int i() {
        return 1;
    }

    public final String toString() {
        return tr1.l(new StringBuilder("ButtonsStack(buttons="), this.a, ")");
    }
}
