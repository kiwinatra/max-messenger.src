package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: w50  reason: default package */
public final class w50 {
    public final Long a;
    public final float b;
    public final m30 c;

    public w50(Long l, float f, m30 m30) {
        this.a = l;
        this.b = f;
        this.c = m30;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w50)) {
            return false;
        }
        w50 w50 = (w50) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) w50.a) && Float.compare(this.b, w50.b) == 0 && Intrinsics.areEqual((Object) this.c, (Object) w50.c);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.c.hashCode() + g63.c((l == null ? 0 : l.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        return "AudioMessageState(messageId=" + this.a + ", currentPosition=" + this.b + ", audioButtonState=" + this.c + ")";
    }
}
