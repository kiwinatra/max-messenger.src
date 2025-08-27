package defpackage;

import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ra9  reason: default package */
public final class ra9 implements Serializable {
    public final long a;
    public final String b;
    public final va9 c;
    public final short o;
    public final short v;
    public final Map w;

    public ra9(long j, String str, va9 va9, short s, short s2, Map map) {
        this.a = j;
        this.b = str;
        this.c = va9;
        this.o = s;
        this.v = s2;
        this.w = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra9)) {
            return false;
        }
        ra9 ra9 = (ra9) obj;
        return this.a == ra9.a && Intrinsics.areEqual((Object) this.b, (Object) ra9.b) && this.c == ra9.c && this.o == ra9.o && this.v == ra9.v && Intrinsics.areEqual((Object) this.w, (Object) ra9.w);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int hashCode3 = this.c.hashCode();
        int hashCode4 = (Short.hashCode(this.v) + ((Short.hashCode(this.o) + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31)) * 31;
        Map map = this.w;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "MessageElement(entityId=" + this.a + ", entityName=" + this.b + ", type=" + this.c + ", from=" + this.o + ", length=" + this.v + ", attributes=" + this.w + ")";
    }
}
