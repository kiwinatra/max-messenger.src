package defpackage;

import java.util.Iterator;

/* renamed from: il4  reason: default package */
public final /* synthetic */ class il4 implements bj8 {
    public final /* synthetic */ jl4 a;

    public /* synthetic */ il4(jl4 jl4) {
        this.a = jl4;
    }

    public final void q(dj8 dj8) {
        jl4 jl4 = this.a;
        jl4.d = dj8;
        Iterator it = jl4.c.iterator();
        while (it.hasNext()) {
            ((bj8) it.next()).q(dj8);
        }
    }
}
