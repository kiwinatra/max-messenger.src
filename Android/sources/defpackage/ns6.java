package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ns6  reason: default package */
public final class ns6 extends ykd {
    public final CharSequence X;
    public final boolean Y;
    public final int Z = hra.o;
    public final long c;
    public final CharSequence o;
    public final Uri v;
    public final long v0;
    public final isb w;
    public final isb x;
    public final List y;
    public final boolean z;

    public ns6(long j, String str, Uri uri, isb isb, isb isb2, List list, boolean z2, CharSequence charSequence, boolean z3) {
        super(xkd.b, list);
        this.c = j;
        this.o = str;
        this.v = uri;
        this.w = isb;
        this.x = isb2;
        this.y = list;
        this.z = z2;
        this.X = charSequence;
        this.Y = z3;
        this.v0 = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ns6)) {
            return false;
        }
        ns6 ns6 = (ns6) obj;
        return this.c == ns6.c && Intrinsics.areEqual((Object) this.o, (Object) ns6.o) && Intrinsics.areEqual((Object) this.v, (Object) ns6.v) && Intrinsics.areEqual((Object) this.w, (Object) ns6.w) && Intrinsics.areEqual((Object) this.x, (Object) ns6.x) && Intrinsics.areEqual((Object) this.y, (Object) ns6.y) && this.z == ns6.z && Intrinsics.areEqual((Object) this.X, (Object) ns6.X) && this.Y == ns6.Y;
    }

    public final long getItemId() {
        return this.v0;
    }

    public final boolean h(ykd ykd) {
        return Intrinsics.areEqual((Object) this, (Object) (ns6) ykd);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.c) * 31;
        int i = 0;
        CharSequence charSequence = this.o;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        Uri uri = this.v;
        if (uri != null) {
            i = uri.hashCode();
        }
        int hashCode3 = this.w.hashCode();
        return Boolean.hashCode(this.Y) + wj6.e(this.X, g63.e(rae.i(this.y, (this.x.hashCode() + ((hashCode3 + ((hashCode2 + i) * 31)) * 31)) * 31, 31), 31, this.z), 31);
    }

    public final int i() {
        return this.Z;
    }

    public final boolean n(ykd ykd) {
        return ykd.getItemId() == this.v0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GlobalChatSearchModel(id=");
        sb.append(this.c);
        sb.append(", lastMessageTime=");
        sb.append(this.o);
        sb.append(", avatar=");
        sb.append(this.v);
        sb.append(", preProcessedTitle=");
        sb.append(this.w);
        sb.append(", preProcessedSubtitle=");
        sb.append(this.x);
        sb.append(", titleHighlights=");
        sb.append(this.y);
        sb.append(", isChannel=");
        sb.append(this.z);
        sb.append(", abbreviation=");
        sb.append(this.X);
        sb.append(", isVerified=");
        return tr1.m(sb, this.Y, ")");
    }
}
