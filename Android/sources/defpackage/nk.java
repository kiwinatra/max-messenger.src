package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: nk  reason: default package */
public final class nk {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final List f;

    public nk(long j, String str, String str2, String str3, long j2, List list) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j2;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk)) {
            return false;
        }
        nk nkVar = (nk) obj;
        return this.a == nkVar.a && Intrinsics.areEqual((Object) this.b, (Object) nkVar.b) && Intrinsics.areEqual((Object) this.c, (Object) nkVar.c) && Intrinsics.areEqual((Object) this.d, (Object) nkVar.d) && this.e == nkVar.e && Intrinsics.areEqual((Object) this.f, (Object) nkVar.f);
    }

    public final int hashCode() {
        int d2 = g63.d(g63.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.f.hashCode() + wzf.i((d2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimojiSetEntity(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", iconUrl=");
        sb.append(this.c);
        sb.append(", iconLottieUrl=");
        sb.append(this.d);
        sb.append(", updateTime=");
        sb.append(this.e);
        sb.append(", animojiIds=");
        return tr1.l(sb, this.f, ")");
    }
}
