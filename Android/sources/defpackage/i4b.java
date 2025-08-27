package defpackage;

import android.os.Parcelable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: i4b  reason: default package */
public final class i4b extends v5a {
    public final Parcelable b;
    public final String c;

    public i4b(hd9 hd9, String str) {
        super(Unit.INSTANCE);
        this.b = hd9;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4b)) {
            return false;
        }
        i4b i4b = (i4b) obj;
        return Intrinsics.areEqual((Object) this.b, (Object) i4b.b) && Intrinsics.areEqual((Object) this.c, (Object) i4b.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OpenImageLegacy(message=" + this.b + ", attachLocalId=" + this.c + ")";
    }
}
