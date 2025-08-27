package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: nge  reason: default package */
public final class nge {
    public final List a;
    public final gd8 b;
    public final v4b c;

    public nge(List list, gd8 gd8, v4b v4b) {
        this.a = list;
        this.b = gd8;
        this.c = v4b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nge)) {
            return false;
        }
        nge nge = (nge) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) nge.a) && Intrinsics.areEqual((Object) this.b, (Object) nge.b) && Intrinsics.areEqual((Object) this.c, (Object) nge.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        gd8 gd8 = this.b;
        int hashCode2 = (hashCode + (gd8 == null ? 0 : gd8.hashCode())) * 31;
        v4b v4b = this.c;
        if (v4b != null) {
            i = v4b.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "SpeakerModeState(opponentsPages=" + this.a + ", mainOpponentState=" + this.b + ", opponentPipState=" + this.c + ")";
    }
}
