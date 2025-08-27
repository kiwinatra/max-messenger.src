package defpackage;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: v8f  reason: default package */
public final class v8f {
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public v8f(String str, int i, int i2, String str2, boolean z, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        int i3 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "INT", false, 2, (Object) null)) {
                i3 = 3;
            } else if (StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "CHAR", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "CLOB", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "TEXT", false, 2, (Object) null)) {
                i3 = 2;
            } else if (!StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "BLOB", false, 2, (Object) null)) {
                i3 = (StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "REAL", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "FLOA", false, 2, (Object) null) || StringsKt__StringsKt.contains$default((CharSequence) upperCase, (CharSequence) "DOUB", false, 2, (Object) null)) ? 4 : 1;
            }
        }
        this.g = i3;
    }

    public final boolean equals(Object obj) {
        v8f v8f;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8f) || this.d != (v8f = (v8f) obj).d) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.a, (Object) v8f.a) || this.c != v8f.c) {
            return false;
        }
        int i = v8f.f;
        String str = v8f.e;
        String str2 = this.e;
        int i2 = this.f;
        if (i2 == 1 && i == 2 && str2 != null && !u8f.a(str2, str)) {
            return false;
        }
        if (i2 == 2 && i == 1 && str != null && !u8f.a(str, str2)) {
            return false;
        }
        if (i2 == 0 || i2 != i || (str2 == null ? str == null : u8f.a(str2, str))) {
            return this.g == v8f.g;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Column{name='");
        sb.append(this.a);
        sb.append("', type='");
        sb.append(this.b);
        sb.append("', affinity='");
        sb.append(this.g);
        sb.append("', notNull=");
        sb.append(this.c);
        sb.append(", primaryKeyPosition=");
        sb.append(this.d);
        sb.append(", defaultValue='");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        return wj6.n(sb, str, "'}");
    }
}
