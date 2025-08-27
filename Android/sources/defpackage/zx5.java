package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: zx5  reason: default package */
public final class zx5 implements Comparable {
    public final Set A0;
    public final boolean X;
    public final Set Y;
    public final Set Z;
    public final String a;
    public final CharSequence b;
    public final String c;
    public final int o;
    public final List v;
    public final Set v0;
    public final Set w;
    public final List w0;
    public final boolean x;
    public final Long x0;
    public final boolean y;
    public final Map y0;
    public final List z;
    public final List z0;

    public zx5(String str, CharSequence charSequence, String str2, int i, List list, Set set, boolean z2, boolean z3, List list2, boolean z4, Set set2, Set set3, Set set4, List list3, Long l, Map map, List list4, Set set5) {
        this.a = str;
        this.b = charSequence;
        this.c = str2;
        this.o = i;
        this.v = list;
        this.w = set;
        this.x = z2;
        this.y = z3;
        this.z = list2;
        this.X = z4;
        this.Y = set2;
        this.Z = set3;
        this.v0 = set4;
        this.w0 = list3;
        this.x0 = l;
        this.y0 = map;
        this.z0 = list4;
        this.A0 = set5;
    }

    public static zx5 a(zx5 zx5, String str, int i, List list, int i2) {
        zx5 zx52 = zx5;
        String str2 = (i2 & 1) != 0 ? zx52.a : str;
        CharSequence charSequence = zx52.b;
        String str3 = zx52.c;
        int i3 = (i2 & 8) != 0 ? zx52.o : i;
        List list2 = (i2 & 16) != 0 ? zx52.v : list;
        Set set = zx52.w;
        boolean z2 = zx52.x;
        boolean z3 = zx52.y;
        List list3 = zx52.z;
        boolean z4 = zx52.X;
        Set set2 = zx52.Y;
        Set set3 = zx52.Z;
        Set set4 = zx52.v0;
        List list4 = zx52.w0;
        Long l = zx52.x0;
        List list5 = list4;
        Map map = zx52.y0;
        List list6 = zx52.z0;
        Set set5 = zx52.A0;
        zx5.getClass();
        return new zx5(str2, charSequence, str3, i3, list2, set, z2, z3, list3, z4, set2, set3, set4, list5, l, map, list6, set5);
    }

    public final boolean b() {
        return Intrinsics.areEqual((Object) this.a, (Object) "all.chat.folder");
    }

    public final int compareTo(Object obj) {
        return Intrinsics.compare(this.o, ((zx5) obj).o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx5)) {
            return false;
        }
        zx5 zx5 = (zx5) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) zx5.a) && Intrinsics.areEqual((Object) this.b, (Object) zx5.b) && Intrinsics.areEqual((Object) this.c, (Object) zx5.c) && this.o == zx5.o && Intrinsics.areEqual((Object) this.v, (Object) zx5.v) && Intrinsics.areEqual((Object) this.w, (Object) zx5.w) && this.x == zx5.x && this.y == zx5.y && Intrinsics.areEqual((Object) this.z, (Object) zx5.z) && this.X == zx5.X && Intrinsics.areEqual((Object) this.Y, (Object) zx5.Y) && Intrinsics.areEqual((Object) this.Z, (Object) zx5.Z) && Intrinsics.areEqual((Object) this.v0, (Object) zx5.v0) && Intrinsics.areEqual((Object) this.w0, (Object) zx5.w0) && Intrinsics.areEqual((Object) this.x0, (Object) zx5.x0) && Intrinsics.areEqual((Object) this.y0, (Object) zx5.y0) && Intrinsics.areEqual((Object) this.z0, (Object) zx5.z0) && Intrinsics.areEqual((Object) this.A0, (Object) zx5.A0);
    }

    public final int hashCode() {
        int e = wj6.e(this.b, this.a.hashCode() * 31, 31);
        int i = 0;
        String str = this.c;
        int e2 = g63.e(rae.i(this.z, g63.e(g63.e((this.w.hashCode() + rae.i(this.v, rae.h(this.o, (e + (str == null ? 0 : str.hashCode())) * 31, 31), 31)) * 31, 31, this.x), 31, this.y), 31), 31, this.X);
        int hashCode = this.Z.hashCode();
        int i2 = rae.i(this.w0, (this.v0.hashCode() + ((hashCode + ((this.Y.hashCode() + e2) * 31)) * 31)) * 31, 31);
        Long l = this.x0;
        if (l != null) {
            i = l.hashCode();
        }
        return this.A0.hashCode() + rae.i(this.z0, (this.y0.hashCode() + ((i2 + i) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Folder(id='");
        sb.append(this.a);
        sb.append("', includedChats=");
        sb.append(this.Y.size());
        sb.append(", title='");
        sb.append(this.b);
        sb.append("', emoji=");
        sb.append(this.c);
        sb.append(", order=");
        sb.append(this.o);
        sb.append(", chats=");
        sb.append(this.v.size());
        sb.append(", filters=");
        sb.append(this.w);
        sb.append(", isEnabled=");
        sb.append(this.x);
        sb.append(", isHiddenForAllFolder=");
        sb.append(this.y);
        sb.append(", manuallyAddedChatIds=");
        sb.append(this.z.size());
        sb.append(", hideIfEmpty=");
        sb.append(this.X);
        sb.append(", creatorId=");
        sb.append(this.x0);
        sb.append(", elements=");
        sb.append(this.w0.size());
        sb.append(", filterSubjects=");
        sb.append(this.y0.size());
        sb.append(", widgets=");
        sb.append(CollectionsKt___CollectionsKt.joinToString$default(this.z0, "[", "]", (CharSequence) null, 0, (CharSequence) null, (Function1) null, 60, (Object) null));
        sb.append(", options=");
        return wj6.n(sb, CollectionsKt___CollectionsKt.joinToString$default(this.A0, "[", "]", (CharSequence) null, 0, (CharSequence) null, (Function1) null, 60, (Object) null), ")");
    }
}
