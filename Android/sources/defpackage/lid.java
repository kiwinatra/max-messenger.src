package defpackage;

import com.futuremind.recyclerviewfastscroll.FastScroller;

/* renamed from: lid  reason: default package */
public abstract class lid {
    public FastScroller a;
    public js9 b;

    /* JADX WARNING: type inference failed for: r1v0, types: [js9, java.lang.Object] */
    public final js9 a() {
        if (this.b == null) {
            new i56(((di4) this).c, ucc.fastscroll__default_show, ucc.fastscroll__default_hide, 1.0f, 1.0f);
            this.b = new Object();
        }
        return this.b;
    }
}
