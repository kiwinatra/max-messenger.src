package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: mb3  reason: default package */
public final class mb3 {
    public final String a;
    public final Set b;
    public final Set c;
    public final int d;
    public final int e;
    public final fc3 f;
    public final Set g;

    public mb3(String str, Set set, Set set2, int i, int i2, fc3 fc3, Set set3) {
        this.a = str;
        this.b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i;
        this.e = i2;
        this.f = fc3;
        this.g = Collections.unmodifiableSet(set3);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, dr8] */
    public static dr8 a(pac pac) {
        pac[] pacArr = new pac[0];
        ? obj = new Object();
        obj.b = null;
        HashSet hashSet = new HashSet();
        obj.a = hashSet;
        obj.c = new HashSet();
        obj.d = 0;
        obj.e = 0;
        obj.g = new HashSet();
        hashSet.add(pac);
        for (pac c2 : pacArr) {
            q8.c(c2, "Null interface");
        }
        Collections.addAll((HashSet) obj.a, pacArr);
        return obj;
    }

    public static mb3 b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(pac.a(cls));
        for (Class cls2 : clsArr) {
            q8.c(cls2, "Null interface");
            hashSet.add(pac.a(cls2));
        }
        return new mb3((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new ms1(20, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.d + ", type=" + this.e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
