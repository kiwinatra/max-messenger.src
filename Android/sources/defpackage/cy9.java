package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: cy9  reason: default package */
public final class cy9 {
    public final CharSequence a;
    public final CharSequence b;
    public final Map c;

    public cy9(CharSequence charSequence, CharSequence charSequence2, Map map) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy9)) {
            return false;
        }
        cy9 cy9 = (cy9) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) cy9.a) && Intrinsics.areEqual((Object) this.b, (Object) cy9.b) && Intrinsics.areEqual((Object) this.c, (Object) cy9.c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return this.c.hashCode() + wj6.e(this.b, (charSequence == null ? 0 : charSequence.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "MediaMetadata(artist=" + this.a + ", track=" + this.b + ", extras=" + this.c + ")";
    }
}
