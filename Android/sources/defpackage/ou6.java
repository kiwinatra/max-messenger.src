package defpackage;

import android.util.Pair;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: ou6  reason: default package */
public final class ou6 extends ArrayList {
    public final Class a;
    public final Class b;

    public ou6(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [o5h, java.lang.Object] */
    public final o5h e() {
        int size = size();
        Object[] objArr = (Object[]) Array.newInstance(this.a, size);
        Object[] objArr2 = (Object[]) Array.newInstance(this.b, size);
        for (int i = 0; i < size; i++) {
            objArr[i] = ((Pair) get(i)).first;
            objArr2[i] = ((Pair) get(i)).second;
        }
        ? obj = new Object();
        int length = objArr.length;
        int[] iArr = new int[length];
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < length; i2++) {
            Object obj2 = objArr[i2];
            Integer num = (Integer) hashMap.get(obj2);
            if (num == null) {
                num = Integer.valueOf(hashMap.size());
                hashMap.put(obj2, num);
            }
            iArr[i2] = num.intValue();
        }
        obj.a = iArr;
        obj.b = o5h.t(iArr, objArr);
        obj.c = o5h.t(iArr, objArr2);
        return obj;
    }
}
