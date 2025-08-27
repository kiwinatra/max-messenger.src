package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* renamed from: m57  reason: default package */
public final class m57 {
    public static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final List g;
    public final List h;
    public final String i;
    public final String j;

    public m57(String str, String str2, String str3, String str4, int i2, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.h = arrayList2;
        this.i = str5;
        this.j = str6;
        this.a = Intrinsics.areEqual((Object) str, (Object) "https");
    }

    public final String a() {
        if (this.d.length() == 0) {
            return "";
        }
        String str = this.j;
        int k2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, ':', this.b.length() + 3, false, 4, (Object) null) + 1;
        int k3 = StringsKt__StringsKt.indexOf$default((CharSequence) str, '@', 0, false, 6, (Object) null);
        if (str != null) {
            return str.substring(k2, k3);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final String b() {
        String str = this.j;
        int k2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, '/', this.b.length() + 3, false, 4, (Object) null);
        return str.substring(k2, u0g.f(str, k2, str.length(), "?#"));
    }

    public final ArrayList c() {
        String str = this.j;
        int k2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, '/', this.b.length() + 3, false, 4, (Object) null);
        int f2 = u0g.f(str, k2, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (k2 < f2) {
            int i2 = k2 + 1;
            int e2 = u0g.e('/', i2, f2, str);
            arrayList.add(str.substring(i2, e2));
            k2 = e2;
        }
        return arrayList;
    }

    public final String d() {
        if (this.h == null) {
            return null;
        }
        String str = this.j;
        int k2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, '?', 0, false, 6, (Object) null) + 1;
        return str.substring(k2, u0g.e('#', k2, str.length(), str));
    }

    public final String e() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.b.length() + 3;
        String str = this.j;
        int f2 = u0g.f(str, length, str.length(), ":@");
        if (str != null) {
            return str.substring(length, f2);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    public final boolean equals(Object obj) {
        return (obj instanceof m57) && Intrinsics.areEqual((Object) ((m57) obj).j, (Object) this.j);
    }

    public final sd3 f() {
        String str;
        sd3 sd3 = new sd3();
        String str2 = this.b;
        sd3.e = str2;
        sd3.f = e();
        sd3.g = a();
        sd3.h = this.e;
        int u = sq6.u(str2);
        int i2 = this.f;
        if (i2 == u) {
            i2 = -1;
        }
        sd3.b = i2;
        ArrayList arrayList = (ArrayList) sd3.c;
        arrayList.clear();
        arrayList.addAll(c());
        sd3.g(d());
        if (this.i == null) {
            str = null;
        } else {
            String str3 = this.j;
            int k2 = StringsKt__StringsKt.indexOf$default((CharSequence) str3, '#', 0, false, 6, (Object) null) + 1;
            if (str3 != null) {
                str = str3.substring(k2);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
        }
        sd3.i = str;
        return sd3;
    }

    public final String g() {
        sd3 sd3;
        try {
            sd3 = new sd3();
            sd3.n(this, "/...");
        } catch (IllegalArgumentException unused) {
            sd3 = null;
        }
        sd3.getClass();
        sd3.f = sq6.q("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        sd3.g = sq6.q("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
        return sd3.c().j;
    }

    public final URI h() {
        sd3 f2 = f();
        String str = (String) f2.h;
        String str2 = null;
        f2.h = str != null ? new Regex("[\"<>^`{|}]").replace((CharSequence) str, "") : null;
        ArrayList arrayList = (ArrayList) f2.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.set(i2, sq6.q((String) arrayList.get(i2), 0, 0, "[]", true, true, false, false, 227));
        }
        ArrayList arrayList2 = (ArrayList) f2.d;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str3 = (String) arrayList2.get(i3);
                arrayList2.set(i3, str3 != null ? sq6.q(str3, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
            }
        }
        String str4 = (String) f2.i;
        if (str4 != null) {
            str2 = sq6.q(str4, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163);
        }
        f2.i = str2;
        String sd3 = f2.toString();
        try {
            return new URI(sd3);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace((CharSequence) sd3, ""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    public final String toString() {
        return this.j;
    }
}
