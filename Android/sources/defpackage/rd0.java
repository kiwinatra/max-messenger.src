package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: rd0  reason: default package */
public final class rd0 {
    public final String a;
    public final String b;
    public final a20 c;
    public final sd0 d;

    public rd0(String str, String str2, a20 a20, sd0 sd0) {
        this.a = str;
        this.b = str2;
        this.c = a20;
        this.d = sd0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rd0)) {
            return false;
        }
        rd0 rd0 = (rd0) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) rd0.a) && Intrinsics.areEqual((Object) this.b, (Object) rd0.b) && Intrinsics.areEqual((Object) this.c, (Object) rd0.c) && this.d == rd0.d;
    }

    public final int hashCode() {
        int d2 = g63.d(this.a.hashCode() * 31, 31, this.b);
        return this.d.hashCode() + ((this.c.hashCode() + d2) * 31);
    }

    public final String toString() {
        return "PhotoAvatar(localCroppedUri=" + this.a + ", originalUri=" + this.b + ", relativeCrop=" + this.c + ", source=" + this.d + ")";
    }
}
