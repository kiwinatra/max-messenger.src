package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: za6  reason: default package */
public final class za6 implements bb6 {
    public final Long a;
    public final ta6 b;

    public za6(Long l, ta6 ta6) {
        this.a = l;
        this.b = ta6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za6)) {
            return false;
        }
        za6 za6 = (za6) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) za6.a) && Intrinsics.areEqual((Object) this.b, (Object) za6.b);
    }

    public final int hashCode() {
        Long l = this.a;
        return this.b.hashCode() + ((l == null ? 0 : l.hashCode()) * 31);
    }

    public final String toString() {
        return "ClosePicker(destinationId=" + this.a + ", inAppReviewData=" + this.b + ")";
    }
}
