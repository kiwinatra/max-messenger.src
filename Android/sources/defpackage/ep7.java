package defpackage;

import java.util.Date;
import java.util.HashMap;

/* renamed from: ep7  reason: default package */
public final class ep7 implements s55 {
    public static final bp7 e = new bp7(0);
    public static final cp7 f = new cp7(0);
    public static final cp7 g = new cp7(1);
    public static final dp7 h = new Object();
    public final HashMap a;
    public final HashMap b;
    public final bp7 c = e;
    public boolean d = false;

    public ep7() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        Class<String> cls = String.class;
        hashMap2.put(cls, f);
        hashMap.remove(cls);
        Class<Boolean> cls2 = Boolean.class;
        hashMap2.put(cls2, g);
        hashMap.remove(cls2);
        Class<Date> cls3 = Date.class;
        hashMap2.put(cls3, h);
        hashMap.remove(cls3);
    }

    public final s55 a(Class cls, dha dha) {
        this.a.put(cls, dha);
        this.b.remove(cls);
        return this;
    }
}
