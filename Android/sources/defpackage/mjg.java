package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: mjg  reason: default package */
public final class mjg {
    public final String a;
    public final boolean b;
    public final ijg c;

    public mjg(String str, boolean z, ijg ijg) {
        this.a = str;
        this.b = z;
        this.c = ijg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjg)) {
            return false;
        }
        mjg mjg = (mjg) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) mjg.a) && this.b == mjg.b && Intrinsics.areEqual((Object) this.c, (Object) mjg.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + g63.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "WebAppRootViewState(title=" + this.a + ", isVerified=" + this.b + ", loadingState=" + this.c + ")";
    }
}
