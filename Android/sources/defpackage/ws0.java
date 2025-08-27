package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ws0  reason: default package */
public final class ws0 {
    public final qs0 a;
    public final zs0 b;
    public final xs0 c;
    public final ys0 d;

    public ws0(qs0 qs0, zs0 zs0, xs0 xs0, ys0 ys0) {
        this.a = qs0;
        this.b = zs0;
        this.c = xs0;
        this.d = ys0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ws0)) {
            return false;
        }
        ws0 ws0 = (ws0) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ws0.a) && Intrinsics.areEqual((Object) this.b, (Object) ws0.b) && Intrinsics.areEqual((Object) this.c, (Object) ws0.c) && Intrinsics.areEqual((Object) this.d, (Object) ws0.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BubbleColors(background=" + this.a + ", text=" + this.b + ", icon=" + this.c + ", stroke=" + this.d + ")";
    }
}
