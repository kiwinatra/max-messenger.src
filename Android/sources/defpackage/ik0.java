package defpackage;

import com.facebook.fresco.middleware.HasExtraData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ik0  reason: default package */
public class ik0 implements yvb {
    public static final ec7 v0;
    public static final Object w0 = new Object();
    public boolean X;
    public final ArrayList Y;
    public final da7 Z;
    public final qa7 a;
    public final String b;
    public final bwb c;
    public final Object o;
    public final pa7 v;
    public final HashMap w;
    public boolean x;
    public uub y;
    public boolean z;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.HashSet, ec7] */
    static {
        String[] strArr = {"id", HasExtraData.KEY_URI_SOURCE};
        int i = ec7.a;
        HashSet hashSet = new HashSet(2);
        Collections.addAll(hashSet, strArr);
        v0 = new HashSet(hashSet);
    }

    public ik0(qa7 qa7, String str, String str2, ej7 ej7, Object obj, pa7 pa7, boolean z2, boolean z3, uub uub, da7 da7) {
        this.a = qa7;
        this.b = str;
        HashMap hashMap = new HashMap();
        this.w = hashMap;
        hashMap.put("id", str);
        hashMap.put(HasExtraData.KEY_URI_SOURCE, qa7 == null ? "null-request" : qa7.b);
        this.c = ej7;
        this.o = obj == null ? w0 : obj;
        this.v = pa7;
        this.x = z2;
        this.y = uub;
        this.z = z3;
        this.X = false;
        this.Y = new ArrayList();
        this.Z = da7;
    }

    public static void b(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((jk0) it.next()).b();
            }
        }
    }

    public static void c(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((jk0) it.next()).c();
            }
        }
    }

    public static void d(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((jk0) it.next()).d();
            }
        }
    }

    public final void a(jk0 jk0) {
        boolean z2;
        synchronized (this) {
            this.Y.add(jk0);
            z2 = this.X;
        }
        if (z2) {
            jk0.a();
        }
    }

    public final void e() {
        ArrayList<jk0> arrayList;
        synchronized (this) {
            if (this.X) {
                arrayList = null;
            } else {
                this.X = true;
                ArrayList arrayList2 = new ArrayList(this.Y);
                arrayList = arrayList2;
            }
        }
        if (arrayList != null) {
            for (jk0 a2 : arrayList) {
                a2.a();
            }
        }
    }

    public final synchronized boolean f() {
        return this.z;
    }

    public final synchronized boolean g() {
        return this.x;
    }

    public final Object getExtra(String str) {
        return this.w.get(str);
    }

    public final Map getExtras() {
        return this.w;
    }

    public final void h(String str, String str2) {
        HashMap hashMap = this.w;
        hashMap.put(HasExtraData.KEY_ORIGIN, str);
        hashMap.put(HasExtraData.KEY_ORIGIN_SUBCATEGORY, str2);
    }

    public final synchronized ArrayList i(uub uub) {
        if (uub == this.y) {
            return null;
        }
        this.y = uub;
        return new ArrayList(this.Y);
    }

    public final void putExtra(String str, Object obj) {
        if (!v0.contains(str)) {
            this.w.put(str, obj);
        }
    }

    public final void putExtras(Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                putExtra((String) entry.getKey(), entry.getValue());
            }
        }
    }

    public final Object getExtra(String str, Object obj) {
        Object obj2 = this.w.get(str);
        return obj2 == null ? obj : obj2;
    }
}
