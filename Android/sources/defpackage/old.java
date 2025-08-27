package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: old  reason: default package */
public final class old implements pld {
    public final String[] a;
    public final r62 b;
    public final tld c;

    public old(String[] strArr, r62 r62, tld tld) {
        this.a = strArr;
        this.b = r62;
        this.c = tld;
    }

    public final List a(String str) {
        tld tld = this.c;
        r62 r62 = this.b;
        r62.getClass();
        a32 a32 = (a32) r62.o0((String) null, new b62(r62, 2));
        if (a32 == null) {
            return CollectionsKt.emptyList();
        }
        try {
            if (tld.f(a32, str)) {
                return CollectionsKt.listOf(tld.a(a32, str));
            }
            for (String str2 : this.a) {
                if (tld.h(str2, str)) {
                    return CollectionsKt.listOf(tld.a(a32, str2));
                }
            }
            return CollectionsKt.emptyList();
        } catch (Throwable th) {
            z68.o(old.class.getName(), "fail to search saved messages chat", th);
            return CollectionsKt.emptyList();
        }
    }
}
