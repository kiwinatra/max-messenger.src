package androidx.work;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/work/ArrayCreatingInputMerger;", "Log7;", "<init>", "()V", "work-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class ArrayCreatingInputMerger extends og7 {
    public final t64 a(ArrayList arrayList) {
        Object newInstance;
        xv1 xv1 = new xv1(15);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterator it2 = Collections.unmodifiableMap(((t64) it.next()).a).entrySet().iterator();
            while (true) {
                if (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    Class cls = value != null ? value.getClass() : String.class;
                    Object obj = hashMap.get(str);
                    if (obj != null) {
                        Class<?> cls2 = obj.getClass();
                        if (Intrinsics.areEqual((Object) cls2, (Object) cls)) {
                            int length = Array.getLength(obj);
                            int length2 = Array.getLength(value);
                            Object newInstance2 = Array.newInstance(obj.getClass().getComponentType(), length + length2);
                            System.arraycopy(obj, 0, newInstance2, 0, length);
                            System.arraycopy(value, 0, newInstance2, length, length2);
                            value = newInstance2;
                            hashMap.put(str, value);
                        } else if (Intrinsics.areEqual((Object) cls2.getComponentType(), (Object) cls)) {
                            int length3 = Array.getLength(obj);
                            newInstance = Array.newInstance(cls, length3 + 1);
                            System.arraycopy(obj, 0, newInstance, 0, length3);
                            Array.set(newInstance, length3, value);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else if (cls.isArray()) {
                        hashMap.put(str, value);
                    } else {
                        newInstance = Array.newInstance(cls, 1);
                        Array.set(newInstance, 0, value);
                    }
                    value = newInstance;
                    hashMap.put(str, value);
                }
            }
        }
        xv1.x(hashMap);
        return xv1.m();
    }
}
