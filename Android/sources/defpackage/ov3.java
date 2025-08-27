package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ov3  reason: default package */
public final class ov3 implements rv3 {
    public final ngf a;

    public ov3(ngf ngf) {
        this.a = ngf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ov3) && Intrinsics.areEqual((Object) this.a, (Object) ((ov3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g63.k(new StringBuilder("Gallery(toolbarTitle="), this.a, ")");
    }
}
