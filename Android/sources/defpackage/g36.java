package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;

/* renamed from: g36  reason: default package */
public final class g36 {
    public final String a;
    public final m58 b;
    public final CharSequence c;
    public final CharSequence d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final List h;
    public final List i;
    public final boolean j;
    public final List k;

    public g36(String str, m58 m58, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, boolean z3, List list, List list2, boolean z4, List list3) {
        this.a = str;
        this.b = m58;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = list;
        this.i = list2;
        this.j = z4;
        this.k = list3;
    }

    public static g36 a(g36 g36, List list, List list2, List list3, int i2) {
        g36 g362 = g36;
        int i3 = i2;
        String str = g362.a;
        m58 m58 = g362.b;
        CharSequence charSequence = g362.c;
        CharSequence charSequence2 = g362.d;
        boolean z = g362.e;
        boolean z2 = g362.f;
        boolean z3 = g362.g;
        List list4 = (i3 & Uuid.SIZE_BITS) != 0 ? g362.h : list;
        List list5 = (i3 & 256) != 0 ? g362.i : list2;
        boolean z4 = g362.j;
        List list6 = (i3 & 1024) != 0 ? g362.k : list3;
        g36.getClass();
        return new g36(str, m58, charSequence, charSequence2, z, z2, z3, list4, list5, z4, list6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g36)) {
            return false;
        }
        g36 g36 = (g36) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) g36.a) && Intrinsics.areEqual((Object) this.b, (Object) g36.b) && Intrinsics.areEqual((Object) this.c, (Object) g36.c) && Intrinsics.areEqual((Object) this.d, (Object) g36.d) && this.e == g36.e && this.f == g36.f && this.g == g36.g && Intrinsics.areEqual((Object) this.h, (Object) g36.h) && Intrinsics.areEqual((Object) this.i, (Object) g36.i) && this.j == g36.j && Intrinsics.areEqual((Object) this.k, (Object) g36.k);
    }

    public final int hashCode() {
        int e2 = wj6.e(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
        int i2 = 0;
        CharSequence charSequence = this.d;
        int e3 = g63.e(g63.e(g63.e((e2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        List list = this.h;
        int hashCode = (e3 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.i;
        if (list2 != null) {
            i2 = list2.hashCode();
        }
        return this.k.hashCode() + g63.e((hashCode + i2) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(id=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", canChatsEditEnabled=");
        sb.append(this.e);
        sb.append(", canFilterEditEnabled=");
        sb.append(this.f);
        sb.append(", canFolderDelete=");
        sb.append(this.g);
        sb.append(", chats=");
        sb.append(this.h);
        sb.append(", folders=");
        sb.append(this.i);
        sb.append(", isAddedFromTemplates=");
        sb.append(this.j);
        sb.append(", uiItems=");
        return tr1.l(sb, this.k, ")");
    }
}
