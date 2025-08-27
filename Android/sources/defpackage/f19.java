package defpackage;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: f19  reason: default package */
public final class f19 {
    public static final Pattern d = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern e = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String a;
    public final String b;
    public final String[] c;

    public f19(String str, String str2, String[] strArr) {
        this.a = str;
        this.b = str2;
        this.c = strArr;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f19) && Intrinsics.areEqual((Object) ((f19) obj).a, (Object) this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
