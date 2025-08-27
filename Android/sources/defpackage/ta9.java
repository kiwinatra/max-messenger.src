package defpackage;

import java.util.EnumSet;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ta9  reason: default package */
public final class ta9 {
    public static final EnumSet g = EnumSet.of(sa9.c, new sa9[]{sa9.o, sa9.v, sa9.w, sa9.x, sa9.z, sa9.X, sa9.y});
    public final long a;
    public final String b;
    public final sa9 c;
    public final int d;
    public final int e;
    public final Map f;

    public /* synthetic */ ta9(long j, int i) {
        this(j, (String) null, sa9.a, 0, i, (Map) null);
    }

    public static ta9 a(ta9 ta9, int i, int i2, int i3) {
        long j = ta9.a;
        String str = ta9.b;
        sa9 sa9 = ta9.c;
        if ((i3 & 8) != 0) {
            i = ta9.d;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = ta9.e;
        }
        Map map = ta9.f;
        ta9.getClass();
        return new ta9(j, str, sa9, i4, i2, map);
    }

    public final ta9 b() {
        if (this.e <= 0 || this.d < 0) {
            return null;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta9)) {
            return false;
        }
        ta9 ta9 = (ta9) obj;
        return this.a == ta9.a && Intrinsics.areEqual((Object) this.b, (Object) ta9.b) && this.c == ta9.c && this.d == ta9.d && this.e == ta9.e && Intrinsics.areEqual((Object) this.f, (Object) ta9.f);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = str == null ? 0 : str.hashCode();
        int h = rae.h(this.e, rae.h(this.d, (this.c.hashCode() + ((hashCode + hashCode2) * 31)) * 31, 31), 31);
        Map map = this.f;
        if (map != null) {
            i = map.hashCode();
        }
        return h + i;
    }

    public final String toString() {
        return "MessageElementData(entityId=" + this.a + ", entityName=" + this.b + ", type=" + this.c + ", from=" + this.d + ", length=" + this.e + ", attributes=" + this.f + ")";
    }

    public ta9(long j, String str, sa9 sa9, int i, int i2, Map map) {
        this.a = j;
        this.b = str;
        this.c = sa9;
        this.d = i;
        this.e = i2;
        this.f = map;
    }
}
