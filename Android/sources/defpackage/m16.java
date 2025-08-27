package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: m16  reason: default package */
public final class m16 implements lz7 {
    public final long a;
    public final String b;
    public final CharSequence c;
    public final long o;
    public final CharSequence v;
    public final boolean w;
    public final int x;

    public m16(long j, String str, CharSequence charSequence, long j2, CharSequence charSequence2, boolean z, int i) {
        this.a = j;
        this.b = str;
        this.c = charSequence;
        this.o = j2;
        this.v = charSequence2;
        this.w = z;
        this.x = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m16)) {
            return false;
        }
        m16 m16 = (m16) obj;
        return this.a == m16.a && Intrinsics.areEqual((Object) this.b, (Object) m16.b) && Intrinsics.areEqual((Object) this.c, (Object) m16.c) && this.o == m16.o && Intrinsics.areEqual((Object) this.v, (Object) m16.v) && this.w == m16.w && this.x == m16.x;
    }

    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        return Integer.hashCode(this.x) + g63.e(wj6.e(this.v, wzf.i(wj6.e(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.o), 31), 31, this.w);
    }

    public final int i() {
        return this.x;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderMemberItem(itemId=");
        sb.append(this.a);
        sb.append(", avatarUrl=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", avatarSourceId=");
        sb.append(this.o);
        sb.append(", abbreviation=");
        sb.append(this.v);
        sb.append(", isVerified=");
        sb.append(this.w);
        sb.append(", viewType=");
        return wj6.l(sb, this.x, ")");
    }
}
