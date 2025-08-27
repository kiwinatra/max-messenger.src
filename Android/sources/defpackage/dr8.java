package defpackage;

import java.io.Serializable;
import java.util.HashSet;

/* renamed from: dr8  reason: default package */
public final class dr8 {
    public Object a;
    public String b = null;
    public Serializable c;
    public int d;
    public int e;
    public Object f;
    public Serializable g;

    public dr8(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.c = new HashSet();
        this.d = 0;
        this.e = 0;
        this.g = new HashSet();
        hashSet.add(pac.a(cls));
        for (Class cls2 : clsArr) {
            q8.c(cls2, "Null interface");
            ((HashSet) this.a).add(pac.a(cls2));
        }
    }

    public void a(bm4 bm4) {
        if (!((HashSet) this.a).contains(bm4.a)) {
            ((HashSet) this.c).add(bm4);
            return;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }

    public mb3 b() {
        if (((fc3) this.f) != null) {
            return new mb3(this.b, new HashSet((HashSet) this.a), new HashSet((HashSet) this.c), this.d, this.e, (fc3) this.f, (HashSet) this.g);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }
}
