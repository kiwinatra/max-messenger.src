package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: twd  reason: default package */
public final class twd {
    public final ywd a;
    public final String b;
    public final boolean c;
    public final int d;
    public final List e;
    public final ue1 f;
    public final Long g;

    public twd(int i, ue1 ue1, ywd ywd, Long l, String str, List list, boolean z) {
        this.a = ywd;
        this.b = str;
        this.c = z;
        this.d = i;
        this.e = list;
        this.f = ue1;
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof twd)) {
            return false;
        }
        twd twd = (twd) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) twd.a) && Intrinsics.areEqual((Object) this.b, (Object) twd.b) && this.c == twd.c && this.d == twd.d && Intrinsics.areEqual((Object) this.e, (Object) twd.e) && Intrinsics.areEqual((Object) this.f, (Object) twd.f) && Intrinsics.areEqual((Object) this.g, (Object) twd.g);
    }

    public final int hashCode() {
        int a2 = ryg.a(this.d, g63.e(g63.d(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c));
        int i = 0;
        List list = this.e;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        ue1 ue1 = this.f;
        int hashCode2 = (hashCode + (ue1 == null ? 0 : ue1.hashCode())) * 31;
        Long l = this.g;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "SessionRoom(id=" + this.a + ", name=" + this.b + ", isActive=" + this.c + ", participantCount=" + this.d + ", participantIds=" + this.e + ", pinnedParticipantId=" + this.f + ", timeoutMs=" + this.g + ")";
    }
}
