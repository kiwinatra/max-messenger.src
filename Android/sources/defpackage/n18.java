package defpackage;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: n18  reason: default package */
public final class n18 {
    public static final Set k = SetsKt.setOf(dnf.v, dnf.a, dnf.o, dnf.b);
    public final long a;
    public final dnf b;
    public final CharSequence c;
    public final CharSequence d = null;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final long i;
    public final boolean j;

    public n18(CharSequence charSequence, boolean z, boolean z2, long j2, long j3, long j4, boolean z3) {
        int i2 = lic.chat_top_panel_live_location;
        dnf dnf = dnf.a;
        dnf dnf2 = dnf.o;
        this.a = (long) i2;
        this.b = dnf2;
        this.c = charSequence;
        this.f = z;
        this.e = z2;
        this.g = j2;
        this.h = j3;
        this.i = j4;
        this.j = z3;
    }

    public final boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.areEqual((Object) getClass(), (Object) obj.getClass())) {
            return false;
        }
        n18 n18 = (n18) obj;
        return this.a == n18.a && this.b == n18.b;
    }

    public final int b() {
        long j2 = this.a;
        return this.b.hashCode() + (((int) (j2 ^ (j2 >>> 32))) * 31);
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n18.class != obj.getClass() || !a(obj)) {
            return false;
        }
        n18 n18 = (n18) obj;
        if (this.e != n18.e || this.f != n18.f || this.g != n18.g || this.h != n18.h || this.i != n18.i || this.j != n18.j) {
            return false;
        }
        CharSequence charSequence = n18.c;
        CharSequence charSequence2 = this.c;
        if (charSequence2 == null ? charSequence != null : !charSequence2.equals(charSequence)) {
            return false;
        }
        CharSequence charSequence3 = n18.d;
        CharSequence charSequence4 = this.d;
        return charSequence4 != null ? charSequence4.equals(charSequence3) : charSequence3 == null;
    }

    public final int hashCode() {
        int b2 = b() * 31;
        int i2 = 0;
        CharSequence charSequence = this.c;
        int hashCode = (b2 + (charSequence != null ? charSequence.hashCode() : 0)) * 31;
        CharSequence charSequence2 = this.d;
        if (charSequence2 != null) {
            i2 = charSequence2.hashCode();
        }
        long j2 = this.g;
        long j3 = this.h;
        long j4 = this.i;
        return ((((((((((((hashCode + i2) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.j ? 1 : 0);
    }
}
