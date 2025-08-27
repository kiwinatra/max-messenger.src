package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: zm1  reason: default package */
public final class zm1 {
    public static final zm1 f = new zm1((ze1) null, (ze1) null, (ze1) null, true, vag.b);
    public final ze1 a;
    public final ze1 b;
    public final ze1 c;
    public final boolean d;
    public final vag e;

    public zm1(ze1 ze1, ze1 ze12, ze1 ze13, boolean z, vag vag) {
        this.a = ze1;
        this.b = ze12;
        this.c = ze13;
        this.d = z;
        this.e = vag;
    }

    public static zm1 a(zm1 zm1, ze1 ze1, ze1 ze12, ze1 ze13, vag vag, int i) {
        if ((i & 1) != 0) {
            ze1 = zm1.a;
        }
        ze1 ze14 = ze1;
        if ((i & 2) != 0) {
            ze12 = zm1.b;
        }
        ze1 ze15 = ze12;
        if ((i & 4) != 0) {
            ze13 = zm1.c;
        }
        ze1 ze16 = ze13;
        boolean z = (i & 8) != 0 ? zm1.d : false;
        if ((i & 16) != 0) {
            vag = zm1.e;
        }
        zm1.getClass();
        return new zm1(ze14, ze15, ze16, z, vag);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm1)) {
            return false;
        }
        zm1 zm1 = (zm1) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) zm1.a) && Intrinsics.areEqual((Object) this.b, (Object) zm1.b) && Intrinsics.areEqual((Object) this.c, (Object) zm1.c) && this.d == zm1.d && this.e == zm1.e;
    }

    public final int hashCode() {
        int i = 0;
        ze1 ze1 = this.a;
        int hashCode = (ze1 == null ? 0 : ze1.hashCode()) * 31;
        ze1 ze12 = this.b;
        int hashCode2 = (hashCode + (ze12 == null ? 0 : ze12.hashCode())) * 31;
        ze1 ze13 = this.c;
        if (ze13 != null) {
            i = ze13.hashCode();
        }
        return this.e.hashCode() + g63.e((hashCode2 + i) * 31, 31, this.d);
    }

    public final String toString() {
        return "CallUserState(pinnedOpponentId=" + this.a + ", pipOpponentIdState=" + this.b + ", selectedOpponentId=" + this.c + ", canShowInviteBanner=" + this.d + ", modeView=" + this.e + ")";
    }
}
