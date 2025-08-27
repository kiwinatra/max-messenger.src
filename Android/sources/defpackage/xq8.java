package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: xq8  reason: default package */
public final class xq8 {
    public static final String j = Integer.toString(0, 36);
    public static final String k = Integer.toString(1, 36);
    public static final String l = Integer.toString(2, 36);
    public static final String m = Integer.toString(3, 36);
    public static final String n = Integer.toString(4, 36);
    public static final String o = Integer.toString(5, 36);
    public static final String p = Integer.toString(6, 36);
    public static final String q = Integer.toString(7, 36);
    public final Uri a;
    public final String b;
    public final tq8 c;
    public final mq8 d;
    public final List e;
    public final String f;
    public final tb7 g;
    public final Object h;
    public final long i;

    static {
        int i2 = v0g.a;
    }

    public xq8(Uri uri, String str, tq8 tq8, mq8 mq8, List list, String str2, tb7 tb7, Object obj, long j2) {
        this.a = uri;
        this.b = vq9.l(str);
        this.c = tq8;
        this.d = mq8;
        this.e = list;
        this.f = str2;
        this.g = tb7;
        qb7 o2 = tb7.o();
        for (int i2 = 0; i2 < tb7.size(); i2++) {
            o2.d(new er8(((er8) tb7.get(i2)).a()));
        }
        o2.j();
        this.h = obj;
        this.i = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq8)) {
            return false;
        }
        xq8 xq8 = (xq8) obj;
        return this.a.equals(xq8.a) && v0g.a(this.b, xq8.b) && v0g.a(this.c, xq8.c) && v0g.a(this.d, xq8.d) && this.e.equals(xq8.e) && v0g.a(this.f, xq8.f) && this.g.equals(xq8.g) && v0g.a(this.h, xq8.h) && Long.valueOf(this.i).equals(Long.valueOf(xq8.i));
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i2 = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        tq8 tq8 = this.c;
        int hashCode3 = (hashCode2 + (tq8 == null ? 0 : tq8.hashCode())) * 31;
        mq8 mq8 = this.d;
        int hashCode4 = (this.e.hashCode() + ((hashCode3 + (mq8 == null ? 0 : mq8.hashCode())) * 31)) * 31;
        String str2 = this.f;
        int hashCode5 = (this.g.hashCode() + ((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Object obj = this.h;
        if (obj != null) {
            i2 = obj.hashCode();
        }
        return (int) ((((long) (hashCode5 + i2)) * 31) + this.i);
    }
}
