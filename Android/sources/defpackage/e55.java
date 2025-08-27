package defpackage;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.functions.Function1;

/* renamed from: e55  reason: default package */
public final class e55 extends of {
    public final View l;
    public final Rect m = new Rect();
    public int n;
    public int o;
    public int p;
    public boolean q;

    public e55(gj0 gj0, View view) {
        super(gj0, new yh7((jdb) null, (nr0) null, 3), 1, (Function1) null, 56);
        this.l = view;
    }

    public final void g(iog iog, h0h h0h) {
        int i = iog.a.f(8).d;
        int i2 = iog.a.f(7).d;
        boolean z = i == 0;
        int i3 = ((wh7) h0h.c).d;
        this.p = i3;
        Rect rect = this.m;
        this.o = Math.abs(((this.a.getHeight() + ((z ? (rect.bottom + i2) - i3 : (rect.bottom + i3) - i2) - rect.top)) / 2) - this.n);
    }

    public final iog h(iog iog) {
        if (this.q) {
            return iog;
        }
        wh7 f = iog.a.f(this.j);
        wh7 f2 = iog.a.f(this.d);
        int i = f.d;
        int i2 = f2.d;
        wh7 b = wh7.b(f.a - f2.a, f.b - f2.b, f.c - f2.c, i - i2);
        this.a.setTranslationY((((float) wh7.b(Math.max(b.a, 0), Math.max(b.b, 0), Math.max(b.c, 0), Math.max(b.d, 0)).d) / ((float) (this.p - i2))) * ((float) this.o));
        return iog;
    }

    public final void i() {
        this.a.setTranslationY(c44.DEFAULT_ASPECT_RATIO);
        this.q = false;
    }

    public final void j() {
        this.l.getGlobalVisibleRect(this.m);
        this.n = this.a.getBottom();
    }
}
