package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* renamed from: hdd  reason: default package */
public final class hdd {
    public static final Class[] f = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final ldd e;

    public hdd(HashMap hashMap) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new pb3(3, this);
        linkedHashMap.putAll(hashMap);
    }

    public static Bundle a(hdd hdd) {
        for (Map.Entry entry : MapsKt.toMap(hdd.b).entrySet()) {
            hdd.c(((ldd) entry.getValue()).a(), (String) entry.getKey());
        }
        LinkedHashMap linkedHashMap = hdd.a;
        Set<String> keySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(linkedHashMap.get(str));
        }
        return o54.f(TuplesKt.to("keys", arrayList), TuplesKt.to("values", arrayList2));
    }

    public final Object b(String str) {
        LinkedHashMap linkedHashMap = this.a;
        try {
            return linkedHashMap.get(str);
        } catch (ClassCastException unused) {
            linkedHashMap.remove(str);
            rae.w(this.c.remove(str));
            this.d.remove(str);
            return null;
        }
    }

    public final void c(Object obj, String str) {
        if (obj != null) {
            Class[] clsArr = f;
            int i = 0;
            while (i < 29) {
                if (!clsArr[i].isInstance(obj)) {
                    i++;
                }
            }
            throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
        Object obj2 = this.c.get(str);
        fz9 fz9 = obj2 instanceof fz9 ? (fz9) obj2 : null;
        if (fz9 != null) {
            fz9.k(obj);
        } else {
            this.a.put(str, obj);
        }
        tz9 tz9 = (tz9) this.d.get(str);
        if (tz9 != null) {
            tz9.setValue(obj);
        }
    }

    public hdd() {
        this.a = new LinkedHashMap();
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new pb3(3, this);
    }
}
