package defpackage;

import java.util.Map;

/* renamed from: s93  reason: default package */
public final class s93 extends l2 {
    public final Object a;
    public int b;
    public final /* synthetic */ t93 c;

    public s93(t93 t93, int i) {
        this.c = t93;
        Object obj = t93.X;
        this.a = t93.i()[i];
        this.b = i;
    }

    public final void a() {
        int i = this.b;
        Object obj = this.a;
        t93 t93 = this.c;
        if (i != -1 && i < t93.size()) {
            if (cjf.n(obj, t93.i()[this.b])) {
                return;
            }
        }
        Object obj2 = t93.X;
        this.b = t93.d(obj);
    }

    public final Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        t93 t93 = this.c;
        Map b2 = t93.b();
        if (b2 != null) {
            return b2.get(this.a);
        }
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return t93.j()[i];
    }

    public final Object setValue(Object obj) {
        t93 t93 = this.c;
        Map b2 = t93.b();
        Object obj2 = this.a;
        if (b2 != null) {
            return b2.put(obj2, obj);
        }
        a();
        int i = this.b;
        if (i == -1) {
            t93.put(obj2, obj);
            return null;
        }
        Object obj3 = t93.j()[i];
        t93.j()[this.b] = obj;
        return obj3;
    }
}
