package defpackage;

import java.net.HttpCookie;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import org.apache.http.cookie.SM;

/* renamed from: rz3  reason: default package */
public final class rz3 {
    public static final dbe a = new dbe(9);

    public static void a(dbe dbe, c57 c57) {
        Object obj;
        List<HttpCookie> list;
        ArrayList arrayList = new ArrayList();
        Iterator it = ArrayIteratorKt.iterator((b57[]) c57.b);
        while (it.hasNext()) {
            Object next = it.next();
            if (SM.SET_COOKIE.equals(((b57) next).a)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            try {
                list = HttpCookie.parse(((b57) it2.next()).b);
            } catch (Exception unused) {
                dbe.getClass();
                list = CollectionsKt.emptyList();
            }
            arrayList2.add(list);
        }
        Iterable<HttpCookie> flatten = CollectionsKt.flatten(arrayList2);
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(flatten, 10));
        for (HttpCookie httpCookie : flatten) {
            httpCookie.toString();
            dbe.getClass();
            arrayList3.add(httpCookie);
        }
        Iterator it3 = arrayList3.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            if ("vdt".equals(((HttpCookie) obj).getName())) {
                break;
            }
        }
        HttpCookie httpCookie2 = (HttpCookie) obj;
        if (httpCookie2 != null) {
            httpCookie2.getName();
            httpCookie2.getValue();
        }
    }
}
