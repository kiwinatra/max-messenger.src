package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: y8b  reason: default package */
public final class y8b implements cf1, jm1 {
    public static final y8b c = new y8b(f9b.a(), new j0g(0, "", "", true, (String) null));
    public final cf1 a;
    public final jm1 b;

    public y8b(cf1 cf1, jm1 jm1) {
        this.a = cf1;
        this.b = jm1;
    }

    public final long a() {
        return this.b.a();
    }

    public final boolean b() {
        return this.a.b();
    }

    public final boolean c() {
        return this.a.c();
    }

    public final boolean d() {
        return this.b.d();
    }

    public final boolean e() {
        return this.a.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8b)) {
            return false;
        }
        y8b y8b = (y8b) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) y8b.a) && Intrinsics.areEqual((Object) this.b, (Object) y8b.b);
    }

    public final boolean f() {
        return this.a.f();
    }

    public final boolean g() {
        return this.a.g();
    }

    public final ze1 getId() {
        return this.a.getId();
    }

    public final String getName() {
        return this.b.getName();
    }

    public final boolean h() {
        return this.a.h();
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final CharSequence i() {
        return this.b.i();
    }

    public final boolean isConnected() {
        return this.a.isConnected();
    }

    public final boolean isScreenCaptureEnabled() {
        return this.a.isScreenCaptureEnabled();
    }

    public final boolean j() {
        return this.a.j();
    }

    public final boolean k() {
        return this.a.k();
    }

    public final boolean l() {
        return this.a.l();
    }

    public final boolean m() {
        return this.a.m();
    }

    public final x8g n() {
        return this.a.n();
    }

    public final String o() {
        return this.b.o();
    }

    public final bf1 p() {
        return this.a.p();
    }

    public final x8g q() {
        return this.a.q();
    }

    public final boolean r() {
        return this.a.r();
    }

    public final String toString() {
        return "ParticipantPair(member=" + this.a + ", user=" + this.b + ")";
    }
}
