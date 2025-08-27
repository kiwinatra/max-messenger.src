package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: y1e  reason: default package */
public final class y1e extends n85 {
    public final String a;
    public final ngf b;

    public y1e(String str, igf igf) {
        this.a = str;
        this.b = igf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1e)) {
            return false;
        }
        y1e y1e = (y1e) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) y1e.a) && Intrinsics.areEqual((Object) this.b, (Object) y1e.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CopyToClipboard(textToCopy=" + this.a + ", snackbarTitle=" + this.b + ")";
    }
}
