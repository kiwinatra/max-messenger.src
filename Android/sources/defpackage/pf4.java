package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: pf4  reason: default package */
public final class pf4 implements tx6, ux6 {
    public final m9c a;
    public final Context b;
    public final m9c c;
    public final Set d;
    public final Executor e;

    public pf4(Context context, String str, Set set, m9c m9c, Executor executor) {
        this.a = new hc3(1, context, str);
        this.d = set;
        this.e = executor;
        this.c = m9c;
        this.b = context;
    }

    public final s7h a() {
        return k0g.a(this.b) ^ true ? hsg.o("") : hsg.f(new of4(this, 0), this.e);
    }

    public final void b() {
        if (this.d.size() <= 0) {
            hsg.o((Object) null);
        } else if (!k0g.a(this.b)) {
            hsg.o((Object) null);
        } else {
            hsg.f(new of4(this, 1), this.e);
        }
    }
}
