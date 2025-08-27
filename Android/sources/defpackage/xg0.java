package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: xg0  reason: default package */
public final class xg0 {
    public CopyOnWriteArrayList a;

    public static void a(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            rae.w(it.next());
            throw null;
        }
    }
}
