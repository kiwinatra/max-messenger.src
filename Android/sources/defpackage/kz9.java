package defpackage;

import java.util.EnumMap;

/* renamed from: kz9  reason: default package */
public final class kz9 {
    public ft8 a;
    public ft8 b;
    public ft8 c;
    public ft8 d;

    public kz9(ft8 ft8, ft8 ft82, ft8 ft83, ft8 ft84) {
        this.a = ft8;
        this.b = ft82;
        this.c = ft83;
        this.d = ft84;
    }

    public final EnumMap a() {
        EnumMap enumMap = new EnumMap(et8.class);
        enumMap.put(et8.a, this.a);
        enumMap.put(et8.b, this.b);
        enumMap.put(et8.c, this.c);
        enumMap.put(et8.o, this.d);
        return enumMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz9)) {
            return false;
        }
        kz9 kz9 = (kz9) obj;
        return this.a == kz9.a && this.b == kz9.b && this.c == kz9.c && this.d == kz9.d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        ft8 ft8 = this.a;
        ft8 ft82 = this.b;
        ft8 ft83 = this.c;
        ft8 ft84 = this.d;
        return "MutableMediaOptions(audioState=" + ft8 + ", videoState=" + ft82 + ", screenshareState=" + ft83 + ", movieSharingState=" + ft84 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ kz9() {
        /*
            r1 = this;
            ft8 r0 = defpackage.ft8.a
            r1.<init>(r0, r0, r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kz9.<init>():void");
    }
}
