package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: qj1  reason: default package */
public final class qj1 {
    public final ywd a;
    public final String b;
    public final boolean c;
    public final List d;
    public final int e;
    public final ue1 f;
    public final Long g;

    public qj1(int i, ue1 ue1, ywd ywd, Long l, String str, List list, boolean z) {
        this.a = ywd;
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = i;
        this.f = ue1;
        this.g = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj1)) {
            return false;
        }
        qj1 qj1 = (qj1) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) qj1.a) && Intrinsics.areEqual((Object) this.b, (Object) qj1.b) && this.c == qj1.c && Intrinsics.areEqual((Object) this.d, (Object) qj1.d) && this.e == qj1.e && Intrinsics.areEqual((Object) this.f, (Object) qj1.f) && Intrinsics.areEqual((Object) this.g, (Object) qj1.g);
    }

    public final int hashCode() {
        int e2 = g63.e(g63.d(Integer.hashCode(this.a.a) * 31, 31, this.b), 31, this.c);
        int i = 0;
        List list = this.d;
        int a2 = ryg.a(this.e, (e2 + (list == null ? 0 : list.hashCode())) * 31);
        ue1 ue1 = this.f;
        int hashCode = (a2 + (ue1 == null ? 0 : ue1.hashCode())) * 31;
        Long l = this.g;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "CallSessionRoom(id=" + this.a + ", name=" + this.b + ", isActive=" + this.c + ", participantIds=" + this.d + ", participantCount=" + this.e + ", pinnedParticipantId=" + this.f + ", timeoutMs=" + this.g + ")";
    }
}
