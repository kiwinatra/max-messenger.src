package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: tb1  reason: default package */
public final class tb1 {
    public static final tb1 j = new tb1((String) null, (gd0) null, (CharSequence) null, new qb1(new mgf("")), new igf(lqa.g), new igf(lqa.b), CollectionsKt.listOf(kb1.a, lb1.a, mb1.a), nb1.a, true);
    public final String a;
    public final gd0 b;
    public final CharSequence c;
    public final sb1 d;
    public final ngf e;
    public final ngf f;
    public final List g;
    public final ob1 h;
    public final boolean i;

    public tb1(String str, gd0 gd0, CharSequence charSequence, sb1 sb1, ngf ngf, ngf ngf2, List list, ob1 ob1, boolean z) {
        this.a = str;
        this.b = gd0;
        this.c = charSequence;
        this.d = sb1;
        this.e = ngf;
        this.f = ngf2;
        this.g = list;
        this.h = ob1;
        this.i = z;
    }

    public static tb1 a(tb1 tb1, gd0 gd0, String str, sb1 sb1, ngf ngf, boolean z, int i2) {
        tb1 tb12 = tb1;
        int i3 = i2;
        String str2 = tb12.a;
        gd0 gd02 = (i3 & 2) != 0 ? tb12.b : gd0;
        ngf ngf2 = (i3 & 16) != 0 ? tb12.e : ngf;
        ngf ngf3 = tb12.f;
        List list = tb12.g;
        ob1 ob1 = tb12.h;
        boolean z2 = (i3 & 256) != 0 ? tb12.i : z;
        tb1.getClass();
        return new tb1(str2, gd02, str, sb1, ngf2, ngf3, list, ob1, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb1)) {
            return false;
        }
        tb1 tb1 = (tb1) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) tb1.a) && Intrinsics.areEqual((Object) this.b, (Object) tb1.b) && Intrinsics.areEqual((Object) this.c, (Object) tb1.c) && Intrinsics.areEqual((Object) this.d, (Object) tb1.d) && Intrinsics.areEqual((Object) this.e, (Object) tb1.e) && Intrinsics.areEqual((Object) this.f, (Object) tb1.f) && Intrinsics.areEqual((Object) this.g, (Object) tb1.g) && Intrinsics.areEqual((Object) this.h, (Object) tb1.h) && this.i == tb1.i;
    }

    public final int hashCode() {
        int i2 = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        gd0 gd0 = this.b;
        int hashCode2 = (hashCode + (gd0 == null ? 0 : gd0.hashCode())) * 31;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            i2 = charSequence.hashCode();
        }
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + rae.i(this.g, i2a.g(i2a.g((this.d.hashCode() + ((hashCode2 + i2) * 31)) * 31, 31, this.e), 31, this.f), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallLinkInfo(icon=");
        sb.append(this.a);
        sb.append(", avatarAbbreviationModel=");
        sb.append(this.b);
        sb.append(", callLink=");
        sb.append(this.c);
        sb.append(", linkInfo=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", action=");
        sb.append(this.g);
        sb.append(", button=");
        sb.append(this.h);
        sb.append(", isNew=");
        return tr1.m(sb, this.i, ")");
    }
}
