package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: jl4  reason: default package */
public final class jl4 implements p6a {
    public final voc a;
    public volatile p6a b;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public dj8 d = new dj8(cj8.a, (kbb) null, true);
    public final il4 e = new il4(this);

    public jl4(voc voc) {
        this.a = voc;
    }

    public final void a(bj8 bj8) {
        this.c.remove(bj8);
    }

    public final void b(bj8 bj8) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        if (!copyOnWriteArrayList.contains(bj8)) {
            copyOnWriteArrayList.add(bj8);
            bj8.q(this.d);
        }
    }
}
