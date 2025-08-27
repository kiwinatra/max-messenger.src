package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: af1  reason: default package */
public final class af1 implements cf1 {
    public final ze1 a;
    public final ft8 b;
    public final ft8 c;
    public final ft8 d;
    public final boolean e;
    public final boolean f;
    public final x8g g;
    public final x8g h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final List t;
    public final bf1 u;

    public af1(ze1 ze1, ft8 ft8, ft8 ft82, ft8 ft83, boolean z, boolean z2, x8g x8g, x8g x8g2, boolean z3, boolean z4, boolean z5, boolean z6, long j2, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, List list, bf1 bf1) {
        this.a = ze1;
        this.b = ft8;
        this.c = ft82;
        this.d = ft83;
        this.e = z;
        this.f = z2;
        this.g = x8g;
        this.h = x8g2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = j2;
        this.n = z7;
        this.o = z8;
        this.p = z9;
        this.q = z10;
        this.r = z11;
        this.s = z12;
        this.t = list;
        this.u = bf1;
    }

    public final boolean c() {
        return this.e;
    }

    public final boolean e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af1)) {
            return false;
        }
        af1 af1 = (af1) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) af1.a) && this.b == af1.b && this.c == af1.c && this.d == af1.d && this.e == af1.e && this.f == af1.f && Intrinsics.areEqual((Object) this.g, (Object) af1.g) && Intrinsics.areEqual((Object) this.h, (Object) af1.h) && this.i == af1.i && this.j == af1.j && this.k == af1.k && this.l == af1.l && this.m == af1.m && this.n == af1.n && this.o == af1.o && this.p == af1.p && this.q == af1.q && this.r == af1.r && this.s == af1.s && Intrinsics.areEqual((Object) this.t, (Object) af1.t) && this.u == af1.u;
    }

    public final boolean f() {
        return this.f;
    }

    public final boolean g() {
        return this.o;
    }

    public final ze1 getId() {
        return this.a;
    }

    public final boolean h() {
        return this.j;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int e2 = g63.e(g63.e((this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f);
        return this.u.hashCode() + rae.i(this.t, g63.e(g63.e(g63.e(g63.e(g63.e(g63.e(wzf.i(g63.e(g63.e(g63.e(g63.e((this.h.hashCode() + ((this.g.hashCode() + e2) * 31)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31);
    }

    public final boolean isConnected() {
        return this.k;
    }

    public final boolean j() {
        return this.p;
    }

    public final boolean m() {
        return this.n;
    }

    public final x8g n() {
        return this.h;
    }

    public final bf1 p() {
        return this.u;
    }

    public final x8g q() {
        return this.g;
    }

    public final boolean r() {
        return this.l;
    }

    public final String toString() {
        return "CallParticipantImpl(id=" + this.a + ", audioOptionState=" + this.b + ", videoOptionState=" + this.c + ", screenShareOptionState=" + this.d + ", isAudioEnabled=" + this.e + ", isShareAudioEnabled=" + this.f + ", videoState=" + this.g + ", screenCaptureState=" + this.h + ", isCreator=" + this.i + ", isAdmin=" + this.j + ", isConnected=" + this.k + ", isAccepted=" + this.l + ", acceptCallEpochMs=" + this.m + ", isSelf=" + this.n + ", isPrimarySpeaker=" + this.o + ", isTalking=" + this.p + ", isRaiseHand=" + this.q + ", hasRegisteredPeers=" + this.r + ", hasMediaBytes=" + this.s + ", movies=" + this.t + ", networkStatus=" + this.u + ")";
    }
}
