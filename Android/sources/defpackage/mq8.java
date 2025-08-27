package defpackage;

import android.net.Uri;

/* renamed from: mq8  reason: default package */
public final class mq8 {
    public static final String b = Integer.toString(0, 36);
    public final Uri a;

    static {
        int i = v0g.a;
    }

    public mq8(u6h u6h) {
        this.a = (Uri) u6h.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq8)) {
            return false;
        }
        return this.a.equals(((mq8) obj).a) && v0g.a((Object) null, (Object) null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
