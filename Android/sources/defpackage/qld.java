package defpackage;

import java.util.function.Predicate;

/* renamed from: qld  reason: default package */
public final /* synthetic */ class qld implements Predicate {
    public final /* synthetic */ tld a;
    public final /* synthetic */ String b;

    public /* synthetic */ qld(tld tld, String str) {
        this.a = tld;
        this.b = str;
    }

    public final boolean test(Object obj) {
        String str = (String) obj;
        tld tld = this.a;
        tld.getClass();
        return !cvg.A(str) && tld.h(str, this.b);
    }
}
