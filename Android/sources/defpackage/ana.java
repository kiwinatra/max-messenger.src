package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

/* renamed from: ana  reason: default package */
public abstract class ana {
    public static final ArrayList a = new ArrayList();

    static {
        Class<bna> cls = bna.class;
        Iterator<S> it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
        while (it.hasNext()) {
            ArrayList arrayList = a;
            rae.w(it.next());
            arrayList.add((Object) null);
        }
    }
}
