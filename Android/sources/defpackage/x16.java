package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: x16  reason: default package */
public final class x16 {
    public final String a;
    public final m58 b;
    public final String c;
    public final List d;
    public final boolean e;
    public final Set f;
    public final boolean g;

    public x16(String str, m58 m58, String str2, List list, boolean z, Set set, boolean z2) {
        this.a = str;
        this.b = m58;
        this.c = str2;
        this.d = list;
        this.e = z;
        this.f = set;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x16)) {
            return false;
        }
        x16 x16 = (x16) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) x16.a) && Intrinsics.areEqual((Object) this.b, (Object) x16.b) && Intrinsics.areEqual((Object) this.c, (Object) x16.c) && Intrinsics.areEqual((Object) this.d, (Object) x16.d) && this.e == x16.e && Intrinsics.areEqual((Object) this.f, (Object) x16.f) && this.g == x16.g;
    }

    public final int hashCode() {
        int e2 = g63.e(rae.i(this.d, g63.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31, this.e);
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + e2) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FolderModel(id=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", chats=");
        sb.append(this.d);
        sb.append(", isEnabled=");
        sb.append(this.e);
        sb.append(", filters=");
        sb.append(this.f);
        sb.append(", isHiddenForAllFolder=");
        return tr1.m(sb, this.g, ")");
    }
}
