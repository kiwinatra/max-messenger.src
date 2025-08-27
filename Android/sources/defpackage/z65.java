package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* renamed from: z65  reason: default package */
public final class z65 extends vyc {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final /* synthetic */ Object d;

    public z65(or0 or0, RecyclerView recyclerView, tyc tyc) {
        this.b = or0;
        this.c = recyclerView;
        this.d = tyc;
    }

    public void a() {
        switch (this.a) {
            case 0:
                h();
                return;
            default:
                return;
        }
    }

    public void b(int i, int i2) {
        switch (this.a) {
            case 0:
                Class<z65> cls = z65.class;
                String name = cls.getName();
                EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this.d;
                a67 a67 = z68.b;
                if (a67 != null && a67.c()) {
                    a67.d(w78.o, name, i2a.i("onItemRangeInserted start. isComputingLayout:", endlessRecyclerView2.b0()), (Throwable) null);
                }
                h();
                String name2 = cls.getName();
                EndlessRecyclerView2 endlessRecyclerView22 = (EndlessRecyclerView2) this.d;
                a67 a672 = z68.b;
                if (a672 != null && a672.c()) {
                    a672.d(w78.o, name2, i2a.i("onItemRangeInserted end. isComputingLayout:", endlessRecyclerView22.b0()), (Throwable) null);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 0:
                h();
                return;
            default:
                super.c(i, i2, obj);
                return;
        }
    }

    public final void d(int i, int i2) {
        switch (this.a) {
            case 0:
                h();
                return;
            default:
                or0 or0 = (or0) this.b;
                if (i2 == or0.w && or0.g0(or0, (RecyclerView) this.c, i)) {
                    String str = ((or0) this.b).x;
                    RecyclerView recyclerView = (RecyclerView) this.c;
                    a67 a67 = z68.b;
                    if (a67 != null && a67.c()) {
                        a67.d(w78.o, str, i2a.i("onItemRangeInserted start. isComputingLayout:", recyclerView.b0()), (Throwable) null);
                    }
                    or0.h0((or0) this.b, (RecyclerView) this.c, (tyc) this.d, i);
                    String str2 = ((or0) this.b).x;
                    RecyclerView recyclerView2 = (RecyclerView) this.c;
                    a67 a672 = z68.b;
                    if (a672 != null && a672.c()) {
                        a672.d(w78.o, str2, i2a.i("onItemRangeInserted end. isComputingLayout:", recyclerView2.b0()), (Throwable) null);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void e(int i, int i2) {
        switch (this.a) {
            case 0:
                h();
                return;
            default:
                or0 or0 = (or0) this.b;
                int i3 = or0.w;
                tyc tyc = (tyc) this.d;
                RecyclerView recyclerView = (RecyclerView) this.c;
                if (1 == i3 && or0.g0(or0, recyclerView, i)) {
                    or0.h0(or0, recyclerView, tyc, i);
                    return;
                } else if (1 == or0.w && or0.g0(or0, recyclerView, i2)) {
                    or0.h0(or0, recyclerView, tyc, i);
                    return;
                } else {
                    return;
                }
        }
    }

    public final void f(int i, int i2) {
        switch (this.a) {
            case 0:
                h();
                return;
            default:
                or0 or0 = (or0) this.b;
                if (i2 == or0.w) {
                    RecyclerView recyclerView = (RecyclerView) this.c;
                    if (or0.g0(or0, recyclerView, i)) {
                        or0.h0(or0, recyclerView, (tyc) this.d, i);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void h() {
        kne.K((EndlessRecyclerView2) this.d, (vj6) this.c);
    }

    public z65(EndlessRecyclerView2 endlessRecyclerView2) {
        this.d = endlessRecyclerView2;
        this.b = new AtomicBoolean(true);
        this.c = new vj6(3, (Object) this, (Object) endlessRecyclerView2);
    }
}
