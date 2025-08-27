package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: lwe  reason: default package */
public final class lwe extends vyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lwe(Object obj, RecyclerView recyclerView, int i) {
        this.a = i;
        this.c = obj;
        this.b = recyclerView;
    }

    public void a() {
        switch (this.a) {
            case 0:
                nwe.i((nwe) this.c);
                return;
            default:
                return;
        }
    }

    public void b(int i, int i2) {
        switch (this.a) {
            case 0:
                nwe.i((nwe) this.c);
                return;
            default:
                return;
        }
    }

    public void c(int i, int i2, Object obj) {
        switch (this.a) {
            case 0:
                nwe.i((nwe) this.c);
                return;
            default:
                super.c(i, i2, obj);
                return;
        }
    }

    public final void d(int i, int i2) {
        switch (this.a) {
            case 0:
                Class<lwe> cls = lwe.class;
                String name = cls.getName();
                RecyclerView recyclerView = this.b;
                a67 a67 = z68.b;
                if (a67 != null && a67.c()) {
                    a67.d(w78.o, name, i2a.i("onItemRangeInserted start. isComputingLayout:", recyclerView.b0()), (Throwable) null);
                }
                nwe.i((nwe) this.c);
                String name2 = cls.getName();
                RecyclerView recyclerView2 = this.b;
                a67 a672 = z68.b;
                if (a672 != null && a672.c()) {
                    a672.d(w78.o, name2, i2a.i("onItemRangeInserted end. isComputingLayout:", recyclerView2.b0()), (Throwable) null);
                    return;
                }
                return;
            default:
                if (i == 0) {
                    bnf.g0((bnf) this.c, this.b);
                    return;
                }
                return;
        }
    }

    public final void e(int i, int i2) {
        switch (this.a) {
            case 0:
                nwe.i((nwe) this.c);
                return;
            default:
                if (i == 0 || i2 == 0) {
                    bnf.g0((bnf) this.c, this.b);
                    return;
                }
                return;
        }
    }

    public final void f(int i, int i2) {
        switch (this.a) {
            case 0:
                nwe.i((nwe) this.c);
                return;
            default:
                if (i == 0) {
                    bnf.g0((bnf) this.c, this.b);
                    return;
                }
                return;
        }
    }
}
