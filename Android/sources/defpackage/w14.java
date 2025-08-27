package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: w14  reason: default package */
public final class w14 {
    public final ysa a;
    public final int b;
    public final ngf c;

    public w14(ysa ysa, int i, ngf ngf) {
        this.a = ysa;
        this.b = i;
        this.c = ngf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w14)) {
            return false;
        }
        w14 w14 = (w14) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) w14.a) && this.b == w14.b && Intrinsics.areEqual((Object) this.c, (Object) w14.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rae.h(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CountryInfoModel(country=" + this.a + ", maxNumbersSize=" + this.b + ", hint=" + this.c + ")";
    }
}
