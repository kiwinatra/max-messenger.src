package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* renamed from: r9c  reason: default package */
public final class r9c implements aud {
    public final Lazy a;
    public final Lazy b;

    public r9c(Lazy lazy, Lazy lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    public final void a(String str, String str2) {
        z68.c("r9c", "onProxyEnableChange: oldValue=" + str + ", newValue=" + str2, new Object[0]);
        ((vaf) this.a.getValue()).f(str2);
        if (str2 != null && str2.length() != 0) {
            ((e24) this.b.getValue()).b("proxy", str2);
        }
    }

    public final void b(List list, List list2) {
        z68.c("r9c", "onProxyDomainsChanged: oldValue=" + list + ", newValue=" + list2, new Object[0]);
        vaf vaf = (vaf) this.a.getValue();
        synchronized (vaf) {
            vaf.g = list2;
        }
        if (!list2.isEmpty()) {
            ((e24) this.b.getValue()).b("proxyDomains", CollectionsKt___CollectionsKt.joinToString$default(list2, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null));
        }
    }
}
