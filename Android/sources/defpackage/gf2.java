package defpackage;

import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: gf2  reason: default package */
public final class gf2 extends mf2 {
    public final Parcelable b;
    public final String c;
    public final boolean d;

    public gf2(hd9 hd9, String str, boolean z) {
        this.b = hd9;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf2)) {
            return false;
        }
        gf2 gf2 = (gf2) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) gf2.b) && Intrinsics.areEqual((Object) this.c, (Object) gf2.c) && this.d == gf2.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + g63.d(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenImageLegacy(message=");
        sb.append(this.b);
        sb.append(", attachLocalId=");
        sb.append(this.c);
        sb.append(", isSingleAttach=");
        return tr1.m(sb, this.d, ")");
    }
}
