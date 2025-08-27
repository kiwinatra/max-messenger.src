package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: oub  reason: default package */
public final class oub {
    public static final oub e = new oub((String) null, (ld9) null, ie5.b, y11.f);
    public final String a;
    public final ld9 b;
    public final me5 c;
    public final y11 d;

    public oub(String str, ld9 ld9, me5 me5, y11 y11) {
        this.a = str;
        this.b = ld9;
        this.c = me5;
        this.d = y11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oub)) {
            return false;
        }
        oub oub = (oub) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) oub.a) && Intrinsics.areEqual((Object) this.b, (Object) oub.b) && Intrinsics.areEqual((Object) this.c, (Object) oub.c) && Intrinsics.areEqual((Object) this.d, (Object) oub.d);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ld9 ld9 = this.b;
        if (ld9 != null) {
            i = ld9.hashCode();
        }
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + i) * 31)) * 31);
    }

    public final String toString() {
        return "PreviousCallState(callId=" + this.a + ", recallTarget=" + this.b + ", state=" + this.c + ", chatInfo=" + this.d + ")";
    }
}
