package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: pt3  reason: default package */
public final class pt3 implements lz7 {
    public final int a;
    public final Integer b;
    public final int c = rra.o;

    public pt3(int i, int i2, int i3, Integer num) {
        this.a = i3;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt3)) {
            return false;
        }
        pt3 pt3 = (pt3) obj;
        pt3.getClass();
        int i = cad.a;
        int i2 = sra.a;
        return this.a == pt3.a && Intrinsics.areEqual((Object) this.b, (Object) pt3.b);
    }

    public final boolean f(lz7 lz7) {
        return lz7 instanceof pt3;
    }

    public final long getItemId() {
        return 0;
    }

    public final int hashCode() {
        int h = rae.h(this.a, rae.h(sra.r, Integer.hashCode(cad.M0) * 31, 31), 31);
        Integer num = this.b;
        return h + (num == null ? 0 : num.hashCode());
    }

    public final int i() {
        return this.c;
    }

    public final Object l(Object obj) {
        lz7 lz7 = (lz7) obj;
        pt3 pt3 = lz7 instanceof pt3 ? (pt3) lz7 : null;
        if (pt3 == null) {
            return null;
        }
        Integer num = this.b;
        Integer num2 = pt3.b;
        if (!Intrinsics.areEqual((Object) num2, (Object) num)) {
            return new ot3(num2);
        }
        return null;
    }

    public final String toString() {
        return "ContactsEmptySearchResultItem(iconRes=" + cad.M0 + ", titleRes=" + sra.r + ", descriptionRes=" + this.a + ", buttonTitleRes=" + this.b + ")";
    }
}
