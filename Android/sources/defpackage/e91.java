package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e91  reason: default package */
public final class e91 extends v5a {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public e91(String str, boolean z, boolean z2, boolean z3) {
        super(Unit.INSTANCE);
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e91)) {
            return false;
        }
        e91 e91 = (e91) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) e91.b) && this.c == e91.c && this.d == e91.d && this.e == e91.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + g63.e(g63.e(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "OpenLink(link=" + this.b + ", isVideoEnabled=" + this.c + ", isAudioEnabled=" + this.d + ", isFront=" + this.e + ")";
    }
}
