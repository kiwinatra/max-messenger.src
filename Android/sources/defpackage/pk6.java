package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: pk6  reason: default package */
public abstract class pk6 {
    public static final List e = CollectionsKt.listOf(nk6.f, ok6.f);
    public final String a = "_size > 0";
    public final String[] b = null;
    public final String c = tr1.j(d(), " DESC");
    public final String[] d = ((String[]) CollectionsKt.listOfNotNull((T[]) new String[]{f(), b(), a(), c(), d(), g(), h(), e()}).toArray(new String[0]));

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public String e() {
        return null;
    }

    public abstract String f();

    public abstract String g();

    public String h() {
        return null;
    }

    public abstract Uri i();

    public abstract String j();

    public final String toString() {
        return "QueryParams(name='" + '*' + "')";
    }
}
