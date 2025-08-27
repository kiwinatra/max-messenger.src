package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: zq8  reason: default package */
public final class zq8 {
    public final Uri a;
    public final String b = null;
    public final List c;
    public final String d;
    public final tb7 e;
    public final Object f;

    public zq8(Uri uri, cvg cvg, List list, k0d k0d) {
        this.a = uri;
        this.c = list;
        this.d = null;
        this.e = k0d;
        qb7 o = tb7.o();
        for (int i = 0; i < k0d.size(); i++) {
            o.d(new br8(((br8) k0d.get(i)).a()));
        }
        o.j();
        this.f = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zq8)) {
            return false;
        }
        zq8 zq8 = (zq8) obj;
        if (this.a.equals(zq8.a) && t0g.a(this.b, zq8.b)) {
            zq8.getClass();
            if (t0g.a((Object) null, (Object) null) && t0g.a((Object) null, (Object) null) && this.c.equals(zq8.c) && t0g.a(this.d, zq8.d) && this.e.equals(zq8.e) && t0g.a(this.f, zq8.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + 0) * 961)) * 31;
        String str2 = this.d;
        int hashCode3 = (this.e.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Object obj = this.f;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode3 + i;
    }
}
