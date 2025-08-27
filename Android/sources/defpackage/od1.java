package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: od1  reason: default package */
public final class od1 extends rd1 {
    public final ze1 a;
    public final String b;
    public final String c;

    public od1(ze1 ze1, String str, String str2) {
        this.a = ze1;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od1)) {
            return false;
        }
        od1 od1 = (od1) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) od1.a) && Intrinsics.areEqual((Object) this.b, (Object) od1.b) && Intrinsics.areEqual((Object) this.c, (Object) od1.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + g63.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Avatar(opponentId=");
        sb.append(this.a);
        sb.append(", userName=");
        sb.append(this.b);
        sb.append(", url=");
        return wj6.n(sb, this.c, ")");
    }
}
