package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: r02  reason: default package */
public final class r02 extends v5a {
    public final ngf b;
    public final ngf c;
    public final long d;

    public r02(igf igf, kgf kgf, long j) {
        super(Unit.INSTANCE);
        this.b = igf;
        this.c = kgf;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r02)) {
            return false;
        }
        r02 r02 = (r02) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) r02.b) && Intrinsics.areEqual((Object) this.c, (Object) r02.c) && this.d == r02.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + i2a.g(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShowChangeOwnerBottomSheetEvent(title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append(", contactId=");
        return wj6.m(sb, this.d, ")");
    }
}
