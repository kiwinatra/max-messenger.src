package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: ar8  reason: default package */
public final class ar8 {
    public static final ar8 d = new ar8(new Object());
    public static final String e = Integer.toString(0, 36);
    public static final String f = Integer.toString(1, 36);
    public static final String g = Integer.toString(2, 36);
    public final Uri a;
    public final String b;
    public final Bundle c;

    /* JADX WARNING: type inference failed for: r0v0, types: [jk3, java.lang.Object] */
    static {
        int i = v0g.a;
    }

    public ar8(jk3 jk3) {
        this.a = (Uri) jk3.a;
        this.b = (String) jk3.b;
        this.c = (Bundle) jk3.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar8)) {
            return false;
        }
        ar8 ar8 = (ar8) obj;
        if (v0g.a(this.a, ar8.a) && v0g.a(this.b, ar8.b)) {
            if ((this.c == null) == (ar8.c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        Uri uri = this.a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        if (this.c != null) {
            i = 1;
        }
        return hashCode2 + i;
    }
}
