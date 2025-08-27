package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: sd1  reason: default package */
public final class sd1 implements lz7 {
    public final ze1 a;
    public final String b;
    public final CharSequence c;
    public final String o;
    public final boolean v;
    public final boolean w;
    public final Integer x;
    public final long y;

    public sd1(ze1 ze1, String str, CharSequence charSequence, String str2, boolean z, boolean z2, Integer num) {
        this.a = ze1;
        this.b = str;
        this.c = charSequence;
        this.o = str2;
        this.v = z;
        this.w = z2;
        this.x = num;
        this.y = ze1.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd1)) {
            return false;
        }
        sd1 sd1 = (sd1) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) sd1.a) && Intrinsics.areEqual((Object) this.b, (Object) sd1.b) && Intrinsics.areEqual((Object) this.c, (Object) sd1.c) && Intrinsics.areEqual((Object) this.o, (Object) sd1.o) && this.v == sd1.v && this.w == sd1.w && Intrinsics.areEqual((Object) this.x, (Object) sd1.x);
    }

    public final boolean f(lz7 lz7) {
        return this.y == lz7.getItemId();
    }

    public final long getItemId() {
        return this.y;
    }

    public final int hashCode() {
        int e = g63.e(g63.e(g63.d(wj6.e(this.c, g63.d(this.a.hashCode() * 31, 31, this.b), 31), 31, this.o), 31, this.v), 31, this.w);
        Integer num = this.x;
        return e + (num == null ? 0 : num.hashCode());
    }

    public final int i() {
        return 1;
    }

    public final Object l(Object obj) {
        sd1 sd1 = (sd1) ((lz7) obj);
        List createListBuilder = CollectionsKt.createListBuilder();
        String str = this.b;
        String str2 = sd1.b;
        if (!Intrinsics.areEqual((Object) str, (Object) str2)) {
            createListBuilder.add(new qd1(str2));
        }
        Integer num = this.x;
        Integer num2 = sd1.x;
        if (!Intrinsics.areEqual((Object) num, (Object) num2)) {
            createListBuilder.add(new pd1(num2));
        }
        String str3 = this.o;
        String str4 = sd1.o;
        boolean areEqual = Intrinsics.areEqual((Object) str3, (Object) str4);
        ze1 ze1 = sd1.a;
        if (!areEqual || !Intrinsics.areEqual((Object) this.a, (Object) ze1) || !Intrinsics.areEqual((Object) str, (Object) str2)) {
            createListBuilder.add(new od1(ze1, str2, str4));
        }
        return CollectionsKt.build(createListBuilder);
    }

    public final String toString() {
        return "CallOpponentInfoState(opponentId=" + this.a + ", userName=" + this.b + ", abbreviation=" + this.c + ", avatar=" + this.o + ", isMe=" + this.v + ", isAdmin=" + this.w + ", description=" + this.x + ")";
    }
}
