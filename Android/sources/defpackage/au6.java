package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: au6  reason: default package */
public final class au6 {
    public final yt6 a;
    public final eu6 b;
    public final zt6 c;
    public final bu6 d;
    public final cu6 e;
    public final du6 f;
    public final fu6 g;

    public au6(yt6 yt6, eu6 eu6, zt6 zt6, bu6 bu6, cu6 cu6, du6 du6, fu6 fu6) {
        this.a = yt6;
        this.b = eu6;
        this.c = zt6;
        this.d = bu6;
        this.e = cu6;
        this.f = du6;
        this.g = fu6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au6)) {
            return false;
        }
        au6 au6 = (au6) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) au6.a) && Intrinsics.areEqual((Object) this.b, (Object) au6.b) && Intrinsics.areEqual((Object) this.c, (Object) au6.c) && Intrinsics.areEqual((Object) this.d, (Object) au6.d) && Intrinsics.areEqual((Object) this.e, (Object) au6.e) && Intrinsics.areEqual((Object) this.f, (Object) au6.f) && Intrinsics.areEqual((Object) this.g, (Object) au6.g);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = Arrays.hashCode(this.d.a);
        int hashCode4 = this.e.hashCode();
        int hashCode5 = this.f.hashCode();
        return this.g.hashCode() + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GradientsColors(bannerDk=" + this.a + ", overlay=" + this.b + ", buttonTextPromo=" + this.c + ", complex=" + this.d + ", emptyBlockIconWrapper=" + this.e + ", loadingIcon=" + this.f + ", skeleton=" + this.g + ")";
    }
}
