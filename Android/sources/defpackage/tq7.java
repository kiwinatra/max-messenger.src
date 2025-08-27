package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: tq7  reason: default package */
public final class tq7 {
    public List a = CollectionsKt.emptyList();
    public String b;

    public final boe a(qq7 qq7) {
        Object obj;
        Iterator it = this.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (cvg.c(((boe) obj).a(), qq7.a)) {
                break;
            }
        }
        return (boe) obj;
    }

    public final oha b(List list) {
        return new yia(new mha(jha.n(list), cd4.v, 1), new ch2(14, this), 3).B();
    }
}
