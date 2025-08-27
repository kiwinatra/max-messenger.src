package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: yzd  reason: default package */
public final class yzd extends j91 {
    public final ngf b;

    public yzd(igf igf) {
        super(13);
        this.b = igf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yzd) && Intrinsics.areEqual((Object) this.b, (Object) ((yzd) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("ShowError(message="), this.b, ")");
    }
}
