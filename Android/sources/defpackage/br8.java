package defpackage;

import android.net.Uri;

/* renamed from: br8  reason: default package */
public final class br8 {
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    public br8(dr8 dr8) {
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
        if (!(obj instanceof br8)) {
            return false;
        }
        br8 br8 = (br8) obj;
        return this.a.equals(br8.a) && t0g.a(this.b, br8.b) && t0g.a(this.c, br8.c) && this.d == br8.d && this.e == br8.e && t0g.a(this.f, br8.f) && t0g.a(this.g, br8.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }
}
