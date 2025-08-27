package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: mta  reason: default package */
public final class mta implements pt4 {
    public final long a;
    public final ur7 b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final boolean f;
    public final w28 g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mta(long j, ur7 ur7, Long l, Long l2, Long l3, boolean z, int i) {
        this((i & 1) != 0 ? 0 : j, (i & 2) != 0 ? null : ur7, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) == 0 ? l3 : null, (i & 32) != 0 ? false : z, (w28) null);
    }

    public final Long a() {
        return this.e;
    }

    public final List b() {
        return CollectionsKt.emptyList();
    }

    public final w28 c() {
        return this.g;
    }

    public final boolean d() {
        return ev0.t(this.b) && this.d == null && this.c == null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mta)) {
            return false;
        }
        mta mta = (mta) obj;
        if (this.a != mta.a) {
            return false;
        }
        ur7 ur7 = this.b;
        return ((ev0.t(ur7) && ev0.t(mta.b)) || Intrinsics.areEqual((Object) ur7, (Object) mta.b)) && Intrinsics.areEqual((Object) this.c, (Object) mta.c) && Intrinsics.areEqual((Object) this.d, (Object) mta.d);
    }

    public final CharSequence getText() {
        ur7 ur7 = this.b;
        if (ur7 != null) {
            return ur7.a;
        }
        return null;
    }

    public final int hashCode() {
        int i = 0;
        ur7 ur7 = this.b;
        int i2 = wzf.i((ur7 != null ? ur7.hashCode() : 0) * 31, 31, this.a);
        Long l = this.c;
        int hashCode = (i2 + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.d;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "OneMeDraft(cid=" + this.a + ", lastInputText=" + this.b + ", replyMessageId=" + this.c + ", editMessageId=" + this.d + ", serverTime=" + this.e + ", fromServer=" + this.f + ", attaches=" + this.g + ")";
    }

    public mta(long j, ur7 ur7, Long l, Long l2, Long l3, boolean z, w28 w28) {
        this.a = j;
        this.b = ur7;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = z;
        this.g = w28;
    }
}
