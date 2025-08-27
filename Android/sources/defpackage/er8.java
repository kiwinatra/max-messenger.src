package defpackage;

import android.net.Uri;

/* renamed from: er8  reason: default package */
public class er8 {
    public static final String h = Integer.toString(0, 36);
    public static final String i = Integer.toString(1, 36);
    public static final String j = Integer.toString(2, 36);
    public static final String k = Integer.toString(3, 36);
    public static final String l = Integer.toString(4, 36);
    public static final String m = Integer.toString(5, 36);
    public static final String n = Integer.toString(6, 36);
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    static {
        int i2 = v0g.a;
    }

    public er8(dr8 dr8) {
        this.a = (Uri) dr8.a;
        this.b = dr8.b;
        this.c = (String) dr8.c;
        this.d = dr8.d;
        this.e = dr8.e;
        this.f = (String) dr8.f;
        this.g = (String) dr8.g;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, dr8] */
    public final dr8 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er8)) {
            return false;
        }
        er8 er8 = (er8) obj;
        return this.a.equals(er8.a) && v0g.a(this.b, er8.b) && v0g.a(this.c, er8.c) && this.d == er8.d && this.e == er8.e && v0g.a(this.f, er8.f) && v0g.a(this.g, er8.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i2 = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode4 + i2;
    }
}
