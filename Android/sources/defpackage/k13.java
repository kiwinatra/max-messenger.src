package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: k13  reason: default package */
public final class k13 {
    public final HashMap a = new HashMap();
    public final Map b;

    public k13(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            hu7 hu7 = (hu7) entry.getValue();
            List list = (List) this.a.get(hu7);
            if (list == null) {
                list = new ArrayList();
                this.a.put(hu7, list);
            }
            list.add((l13) entry.getKey());
        }
    }

    public static void a(List list, jv7 jv7, hu7 hu7, Object obj) {
        if (list != null) {
            int size = list.size() - 1;
            while (size >= 0) {
                l13 l13 = (l13) list.get(size);
                l13.getClass();
                try {
                    int i = l13.a;
                    Method method = l13.b;
                    if (i == 0) {
                        method.invoke(obj, (Object[]) null);
                    } else if (i == 1) {
                        method.invoke(obj, new Object[]{jv7});
                    } else if (i == 2) {
                        method.invoke(obj, new Object[]{jv7, hu7});
                    }
                    size--;
                } catch (InvocationTargetException e) {
                    throw new RuntimeException("Failed to call observer method", e.getCause());
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
    }
}
