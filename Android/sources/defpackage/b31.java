package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.externcalls.sdk.Conversation;

/* renamed from: b31  reason: default package */
public final class b31 {
    public final Conversation a;
    public final ld9 b;
    public final boolean c;
    public final boolean d;

    public b31(Conversation conversation, ld9 ld9, boolean z, boolean z2) {
        this.a = conversation;
        this.b = ld9;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b31)) {
            return false;
        }
        b31 b31 = (b31) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) b31.a) && Intrinsics.areEqual((Object) this.b, (Object) b31.b) && this.c == b31.c && this.d == b31.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + g63.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Result(conversation=" + this.a + ", callTarget=" + this.b + ", isNewCall=" + this.c + ", isIncoming=" + this.d + ")";
    }
}
