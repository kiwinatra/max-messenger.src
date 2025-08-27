package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: o0g  reason: default package */
public final class o0g {
    public final long a;
    public final boolean b;
    public final boolean c;
    public final x8g d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final x8g h;

    public o0g(long j, boolean z, boolean z2, x8g x8g, boolean z3, boolean z4, boolean z5, x8g x8g2) {
        this.a = j;
        this.b = z;
        this.c = z2;
        this.d = x8g;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = x8g2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0g)) {
            return false;
        }
        o0g o0g = (o0g) obj;
        return this.a == o0g.a && this.b == o0g.b && this.c == o0g.c && Intrinsics.areEqual((Object) this.d, (Object) o0g.d) && this.e == o0g.e && this.f == o0g.f && this.g == o0g.g && Intrinsics.areEqual((Object) this.h, (Object) o0g.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + g63.e(g63.e(g63.e((this.d.hashCode() + g63.e(g63.e(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        return "UserVideoState(id=" + this.a + ", isMe=" + this.b + ", isVideoEnabled=" + this.c + ", videoState=" + this.d + ", isConnected=" + this.e + ", isAccepted=" + this.f + ", isScreenCaptureEnabled=" + this.g + ", screenCaptureState=" + this.h + ")";
    }
}
