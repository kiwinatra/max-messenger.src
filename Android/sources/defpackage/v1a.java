package defpackage;

import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: v1a  reason: default package */
public final class v1a extends w1 {
    public static final /* synthetic */ int z = 0;
    public final q1a b;
    public final ggd c;
    public final gaf o;
    public final jx3 v;
    public final CopyOnWriteArrayList w = new CopyOnWriteArrayList();
    public final Lazy x = LazyKt.lazy(new s1a(this, 0));
    public final Lazy y = LazyKt.lazy(new s1a(this, 1));

    public v1a(b4a b4a, q1a q1a, ggd ggd) {
        super(b4a);
        this.b = q1a;
        this.c = ggd;
        gaf G = ((qra) ym.e()).G();
        this.o = G;
        this.v = e14.a(((osa) G).c());
        b4a.R(this);
    }

    public final void W() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.w;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            ((pm7) it.next()).b((CancellationException) null);
        }
        copyOnWriteArrayList.clear();
    }
}
