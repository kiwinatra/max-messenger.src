package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x72  reason: default package */
public final class x72 implements lz7 {
    public final ngf a;
    public final ngf b;
    public final String c;
    public final CharSequence o;
    public final long v;
    public final List w;
    public final int x = cwa.e;
    public final long y = ((long) Integer.hashCode(cwa.d));

    public x72(ngf ngf, igf igf, String str, CharSequence charSequence, long j, List list) {
        this.a = ngf;
        this.b = igf;
        this.c = str;
        this.o = charSequence;
        this.v = j;
        this.w = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x72)) {
            return false;
        }
        x72 x72 = (x72) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) x72.a) && Intrinsics.areEqual((Object) this.b, (Object) x72.b) && Intrinsics.areEqual((Object) this.c, (Object) x72.c) && Intrinsics.areEqual((Object) this.o, (Object) x72.o) && this.v == x72.v && Intrinsics.areEqual((Object) this.w, (Object) x72.w);
    }

    public final long getItemId() {
        return this.y;
    }

    public final int hashCode() {
        int g = i2a.g(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        int hashCode = (g + (str == null ? 0 : str.hashCode())) * 31;
        CharSequence charSequence = this.o;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return this.w.hashCode() + wzf.i((hashCode + i) * 31, 31, this.v);
    }

    public final int i() {
        return this.x;
    }

    public final String toString() {
        return "ChatDescriptionViewListItem(title=" + this.a + ", subtitle=" + this.b + ", avatarUrl=" + this.c + ", avatarPlaceholder=" + this.o + ", avatarPlaceholderId=" + this.v + ", descriptionList=" + this.w + ")";
    }
}
