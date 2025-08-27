package defpackage;

import android.net.Uri;
import android.provider.MediaStore;

/* renamed from: nk6  reason: default package */
public final class nk6 extends pk6 {
    public static final nk6 f = new pk6();
    public static final Uri g = MediaStore.Images.Media.getContentUri("external");
    public static final String h = "_id";
    public static final String i = "bucket_id";
    public static final String j = "bucket_display_name";
    public static final String k = "_data";
    public static final String l = "date_modified";
    public static final String m = "mime_type";
    public static final String n = "orientation";
    public static final String o = "image/jpeg";

    /* JADX WARNING: type inference failed for: r0v0, types: [nk6, pk6] */
    static {
        o9a o9a = sq9.b;
    }

    public final String a() {
        return j;
    }

    public final String b() {
        return i;
    }

    public final String c() {
        return k;
    }

    public final String d() {
        return l;
    }

    public final String f() {
        return h;
    }

    public final String g() {
        return m;
    }

    public final String h() {
        return n;
    }

    public final Uri i() {
        return g;
    }

    public final String j() {
        return o;
    }
}
