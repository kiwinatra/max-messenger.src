package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: eqd  reason: default package */
public final class eqd extends fqd {
    public final String b;
    public final String c;
    public final a20 d;
    public final sd0 e;

    public eqd(String str, String str2, a20 a20, sd0 sd0) {
        super(str);
        this.b = str;
        this.c = str2;
        this.d = a20;
        this.e = sd0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqd)) {
            return false;
        }
        eqd eqd = (eqd) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) eqd.b) && Intrinsics.areEqual((Object) this.c, (Object) eqd.c) && Intrinsics.areEqual((Object) this.d, (Object) eqd.d) && this.e == eqd.e;
    }

    public final int hashCode() {
        int d2 = g63.d(this.b.hashCode() * 31, 31, this.c);
        return this.e.hashCode() + ((this.d.hashCode() + d2) * 31);
    }

    public final String toString() {
        return "Photo(localCroppedUri=" + this.b + ", originalUri=" + this.c + ", relativeCrop=" + this.d + ", source=" + this.e + ")";
    }
}
