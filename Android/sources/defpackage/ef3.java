package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ef3  reason: default package */
public final class ef3 extends j91 {
    public final String b;
    public final ytb c;

    public ef3(String str, ytb ytb) {
        super(3);
        this.b = str;
        this.c = ytb;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef3)) {
            return false;
        }
        ef3 ef3 = (ef3) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) ef3.b) && Intrinsics.areEqual((Object) this.c, (Object) ef3.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "NameInputScreen(token=" + this.b + ", presetAvatars=" + this.c + ")";
    }
}
