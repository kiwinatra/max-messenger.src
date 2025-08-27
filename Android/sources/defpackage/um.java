package defpackage;

import android.net.Uri;

/* renamed from: um  reason: default package */
public abstract class um {
    public static final Uri a = Uri.parse("https://api.ok.ru");

    public static final Uri a(String str) {
        return Uri.parse("ok://api/api/" + StringsKt__StringsJVMKt.replace$default(str, '.', '/', false, 4, (Object) null));
    }

    public static final String b(Uri uri) {
        String uri2 = uri.toString();
        if (StringsKt__StringsJVMKt.startsWith$default(uri2, "ok://api/api/", false, 2, (Object) null)) {
            return StringsKt__StringsJVMKt.replace$default(uri2.substring(13), '/', '.', false, 4, (Object) null);
        }
        throw new IllegalArgumentException("Unknown uri " + uri);
    }
}
