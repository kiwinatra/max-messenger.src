package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import kotlin.Lazy;

/* renamed from: b97  reason: default package */
public final class b97 {
    public final ltb a;
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;

    public b97(ltb ltb, Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = ltb;
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
    }

    public static String a(Uri uri) {
        if (!uri.isHierarchical()) {
            return uri.toString();
        }
        String queryParameter = uri.getQueryParameter("bid");
        String queryParameter2 = uri.getQueryParameter("t");
        return (TextUtils.isEmpty(queryParameter) || TextUtils.isEmpty(queryParameter2)) ? uri.toString() : g63.j("ok-image-cache:bid=", queryParameter, "&t=", queryParameter2);
    }
}
