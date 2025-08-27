package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: a93  reason: default package */
public final class a93 {
    public final n63 a;
    public final o93 b;
    public final b93 c;
    public final n93 d;
    public final l63 e;
    public final h93 f;
    public final k93 g;

    public a93(n63 n63, o93 o93, b93 b93, n93 n93, l63 l63, h93 h93, k93 k93) {
        this.a = n63;
        this.b = o93;
        this.c = b93;
        this.d = n93;
        this.e = l63;
        this.f = h93;
        this.g = k93;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a93)) {
            return false;
        }
        a93 a93 = (a93) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) a93.a) && Intrinsics.areEqual((Object) this.b, (Object) a93.b) && Intrinsics.areEqual((Object) this.c, (Object) a93.c) && Intrinsics.areEqual((Object) this.d, (Object) a93.d) && Intrinsics.areEqual((Object) this.e, (Object) a93.e) && Intrinsics.areEqual((Object) this.f, (Object) a93.f) && Intrinsics.areEqual((Object) this.g, (Object) a93.g);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        int hashCode5 = this.f.hashCode();
        return this.g.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CommonColors(background=" + this.a + ", text=" + this.b + ", icon=" + this.c + ", stroke=" + this.d + ", action=" + this.e + ", shadows=" + this.f + ", states=" + this.g + ")";
    }
}
