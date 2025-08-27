package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: w4d  reason: default package */
public final class w4d implements r2f {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    public r2f b = null;

    public final void a(r2f r2f) {
        this.b = r2f;
        for (v4d v4d : this.a) {
            if (!v4d.g()) {
                v4d.p(r2f);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [i0, v4d, java.lang.Object] */
    public final Object get() {
        ? i0Var = new i0();
        i0Var.h = null;
        i0Var.p(this.b);
        this.a.add(i0Var);
        return i0Var;
    }
}
