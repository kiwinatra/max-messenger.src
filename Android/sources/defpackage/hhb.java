package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: hhb  reason: default package */
public final class hhb implements lz7 {
    public final long X;
    public final long a;
    public final long b;
    public final CharSequence c;
    public final ngf o;
    public final Uri v;
    public final boolean w;
    public final boolean x;
    public final dkb y;
    public final CharSequence z;

    public hhb(long j, long j2, CharSequence charSequence, ngf ngf, Uri uri, boolean z2, boolean z3, dkb dkb, CharSequence charSequence2) {
        this.a = j;
        this.b = j2;
        this.c = charSequence;
        this.o = ngf;
        this.v = uri;
        this.w = z2;
        this.x = z3;
        this.y = dkb;
        this.z = charSequence2;
        this.X = dkb.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhb)) {
            return false;
        }
        hhb hhb = (hhb) obj;
        return this.a == hhb.a && this.b == hhb.b && Intrinsics.areEqual((Object) this.c, (Object) hhb.c) && Intrinsics.areEqual((Object) this.o, (Object) hhb.o) && Intrinsics.areEqual((Object) this.v, (Object) hhb.v) && this.w == hhb.w && this.x == hhb.x && Intrinsics.areEqual((Object) this.y, (Object) hhb.y) && Intrinsics.areEqual((Object) this.z, (Object) hhb.z);
    }

    public final boolean f(lz7 lz7) {
        return this.X == lz7.getItemId();
    }

    public final long getItemId() {
        return this.X;
    }

    public final int hashCode() {
        int e = wj6.e(this.c, wzf.i(Long.hashCode(this.a) * 31, 31, this.b), 31);
        int i = 0;
        ngf ngf = this.o;
        int hashCode = (e + (ngf == null ? 0 : ngf.hashCode())) * 31;
        Uri uri = this.v;
        if (uri != null) {
            i = uri.hashCode();
        }
        return this.z.hashCode() + ((this.y.hashCode() + g63.e(g63.e((hashCode + i) * 31, 31, this.w), 31, this.x)) * 31);
    }

    public final int i() {
        return 0;
    }

    public final Object l(Object obj) {
        boolean z2;
        lz7 lz7 = (lz7) obj;
        hhb hhb = lz7 instanceof hhb ? (hhb) lz7 : null;
        if (hhb == null || this.w == (z2 = hhb.w)) {
            return null;
        }
        return new ghb(z2);
    }

    public final String toString() {
        return "PickerChatListItem(id=" + this.a + ", avatarSourceId=" + this.b + ", name=" + this.c + ", subtitle=" + this.o + ", avatar=" + this.v + ", isOnline=" + this.w + ", isVerified=" + this.x + ", entity=" + this.y + ", abbreviation=" + this.z + ")";
    }
}
