package defpackage;

import androidx.recyclerview.widget.b;
import java.util.List;
import kotlin.collections.CollectionsKt;
import one.me.sdk.arch.Widget;

/* renamed from: y66  reason: default package */
public final class y66 extends e54 {
    public static final js9 y0 = new Object();
    public final zx3 Z;
    public final b v0;
    public final x66 w0;
    public List x0 = CollectionsKt.emptyList();

    public y66(zx3 zx3, b bVar, x66 x66) {
        super(zx3, 0);
        this.Z = zx3;
        this.v0 = bVar;
        this.w0 = x66;
    }

    public final void G(e9d e9d, int i) {
        if (!e9d.n()) {
            Widget c = this.w0.c(((y16) this.x0.get(i)).a, this.v0);
            c.setTargetController(this.Z);
            c.setRetainViewMode(yx3.b);
            e9d.R(new i9d(c, (String) null, (ey3) null, (ey3) null, false, -1));
        }
    }

    public final void P(List list) {
        if (!this.x0.isEmpty() || !(!list.isEmpty())) {
            mo4 h = h88.h(new c71(3, this.x0, list));
            this.x0 = list;
            h.a(new y35(2, (Object) this));
            return;
        }
        this.x0 = list;
        o(0, list.size());
    }

    public final int j() {
        return this.x0.size();
    }

    public final long k(int i) {
        y16 y16 = (y16) CollectionsKt.getOrNull(this.x0, i);
        String str = y16 != null ? y16.a : null;
        return (long) (str != null ? str.hashCode() : 0);
    }
}
