package defpackage;

import android.net.Uri;
import java.util.BitSet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: rg5  reason: default package */
public final class rg5 implements lz7 {
    public final long a;
    public final Uri b;
    public final boolean c;
    public final boolean o;
    public final CharSequence v;
    public final CharSequence w;
    public final boolean x;
    public final CharSequence y;

    public rg5(long j, Uri uri, boolean z, boolean z2, CharSequence charSequence, CharSequence charSequence2, boolean z3, CharSequence charSequence3) {
        this.a = j;
        this.b = uri;
        this.c = z;
        this.o = z2;
        this.v = charSequence;
        this.w = charSequence2;
        this.x = z3;
        this.y = charSequence3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rg5)) {
            return false;
        }
        rg5 rg5 = (rg5) obj;
        return this.a == rg5.a && Intrinsics.areEqual((Object) this.b, (Object) rg5.b) && this.c == rg5.c && this.o == rg5.o && Intrinsics.areEqual((Object) this.v, (Object) rg5.v) && Intrinsics.areEqual((Object) this.w, (Object) rg5.w) && this.x == rg5.x && Intrinsics.areEqual((Object) this.y, (Object) rg5.y);
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        Uri uri = this.b;
        int e = wj6.e(this.v, g63.e(g63.e((hashCode + (uri == null ? 0 : uri.hashCode())) * 31, 31, this.c), 31, this.o), 31);
        CharSequence charSequence = this.w;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return this.y.hashCode() + g63.e((e + i) * 31, 31, this.x);
    }

    public final int i() {
        int i = this.x ? hra.u : hra.v;
        int i2 = as2.a;
        return i;
    }

    public final Object l(Object obj) {
        lz7 lz7 = (lz7) obj;
        j3h j3h = null;
        rg5 rg5 = lz7 instanceof rg5 ? (rg5) lz7 : null;
        if (rg5 != null) {
            j3h = new j3h(7);
            boolean areEqual = Intrinsics.areEqual((Object) this.b, (Object) rg5.b);
            boolean z = true;
            BitSet bitSet = (BitSet) j3h.a;
            bitSet.set(0, !areEqual);
            bitSet.set(1, this.c != rg5.c);
            bitSet.set(2, !Intrinsics.areEqual((Object) this.v, (Object) rg5.v));
            bitSet.set(3, !Intrinsics.areEqual((Object) this.w, (Object) rg5.w));
            bitSet.set(4, this.x != rg5.x);
            bitSet.set(5, !Intrinsics.areEqual((Object) this.y, (Object) rg5.y));
            if (this.o == rg5.o) {
                z = false;
            }
            bitSet.set(6, z);
        }
        return j3h;
    }

    public final String toString() {
        return "FakeChatModel(contactId=" + this.a + ", avatar=" + this.b + ", isOnline=" + this.c + ", isVerified=" + this.o + ", title=" + this.v + ", subtitle=" + this.w + ", isRegistered=" + this.x + ", abbreviation=" + this.y + ")";
    }
}
