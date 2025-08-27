package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: zzd  reason: default package */
public final class zzd extends j91 {
    public final ngf b;

    public zzd(igf igf) {
        super(13);
        this.b = igf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzd) && Intrinsics.areEqual((Object) this.b, (Object) ((zzd) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("ShowSuccess(message="), this.b, ")");
    }
}
