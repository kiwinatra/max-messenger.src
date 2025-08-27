package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: cuc  reason: default package */
public final class cuc implements lz7 {
    public final long a;
    public final CharSequence b;
    public final String c;
    public final CharSequence o;
    public final boolean v;
    public final boolean w;
    public final boolean x = false;
    public final long y;

    public cuc(long j, String str, String str2, CharSequence charSequence, boolean z, boolean z2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.o = charSequence;
        this.v = z;
        this.w = z2;
        this.y = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuc)) {
            return false;
        }
        cuc cuc = (cuc) obj;
        return this.a == cuc.a && Intrinsics.areEqual((Object) this.b, (Object) cuc.b) && Intrinsics.areEqual((Object) this.c, (Object) cuc.c) && Intrinsics.areEqual((Object) this.o, (Object) cuc.o) && this.v == cuc.v && this.w == cuc.w && this.x == cuc.x;
    }

    public final boolean f(lz7 lz7) {
        return this.a == lz7.getItemId();
    }

    public final long getItemId() {
        return this.y;
    }

    public final int hashCode() {
        int e = wj6.e(this.b, Long.hashCode(this.a) * 31, 31);
        String str = this.c;
        return Boolean.hashCode(this.x) + g63.e(g63.e(wj6.e(this.o, (e + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.v), 31, this.w);
    }

    public final int i() {
        return 0;
    }

    public final Object l(Object obj) {
        cuc cuc = (cuc) ((lz7) obj);
        ArrayList arrayList = new ArrayList();
        CharSequence charSequence = this.b;
        CharSequence charSequence2 = cuc.b;
        if (!Intrinsics.areEqual((Object) charSequence, (Object) charSequence2)) {
            arrayList.add(new ztc((String) charSequence2));
        }
        boolean z = this.w;
        boolean z2 = cuc.w;
        if (z != z2) {
            arrayList.add(new buc(z2));
        }
        String str = this.c;
        String str2 = cuc.c;
        if (!Intrinsics.areEqual((Object) str, (Object) str2)) {
            arrayList.add(new ytc(str2));
        }
        CharSequence charSequence3 = this.o;
        CharSequence charSequence4 = cuc.o;
        if (!Intrinsics.areEqual((Object) charSequence3, (Object) charSequence4)) {
            arrayList.add(new xtc(charSequence4));
        }
        boolean z3 = this.v;
        boolean z4 = cuc.v;
        if (z3 != z4) {
            arrayList.add(new auc(z4));
        }
        return arrayList;
    }

    public final boolean r(Object obj) {
        return Intrinsics.areEqual((Object) this, (Object) (lz7) obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentContactModel(id=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", abbreviation=");
        sb.append(this.o);
        sb.append(", isOnline=");
        sb.append(this.v);
        sb.append(", isVerified=");
        sb.append(this.w);
        sb.append(", isSavedMessages=");
        return tr1.m(sb, this.x, ")");
    }
}
