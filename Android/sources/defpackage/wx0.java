package defpackage;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: wx0  reason: default package */
public final class wx0 {
    public static final LinkedHashSet l;
    public final pl5 a;
    public final f40 b;
    public final jqg c;
    public final u13 d;
    public final qk3 e;
    public final lfd f;
    public final lfd g;
    public final vx0 h;
    public final AtomicBoolean i = new AtomicBoolean();
    public volatile sja j;
    public volatile ux0 k;

    static {
        LinkedList linkedList = new LinkedList(Arrays.asList(zx0.values()));
        linkedList.remove(zx0.a);
        l = new LinkedHashSet(linkedList);
    }

    public wx0(pl5 pl5, f40 f40, u13 u13, jqg jqg, lfd lfd, lfd lfd2, qk3 qk3, vx0 vx0) {
        this.a = pl5;
        this.b = f40;
        this.c = jqg;
        this.h = vx0;
        this.d = u13;
        this.e = qk3;
        this.f = lfd;
        this.g = lfd2;
    }

    public final void a(or7 or7) {
        try {
            this.e.accept(or7);
        } catch (Throwable th) {
            z68.f("wx0", "updateData: failed to accept disposable", th);
        }
    }

    public final void b() {
        lja s = c().x(this.f).s(this.g);
        or7 or7 = new or7(new sx0(this, 0), new fm0(6), m58.e);
        s.a(or7);
        a(or7);
    }

    public final synchronized jha c() {
        if (this.j != null) {
            return this.j;
        }
        this.j = new sja(new pja(new rha(new tbe(new mka(2, new h5(3, this)), new sx0(this, 6), 3).o().j(new sx0(this, 7)), m58.f, new b5(3, this), 2)));
        return this.j;
    }
}
