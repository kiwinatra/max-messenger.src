package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.fragment.app.a;

/* renamed from: i3a  reason: default package */
public final class i3a extends q2 implements lk8, f2a {
    public final a X;
    public final bud Y;
    public final ln5 Z;
    public final View o;
    public final WindowManager v;
    public final ggd v0;
    public final wj8 w;
    public ok8 w0;
    public final u2a x;
    public g5b x0;
    public final dm4 y;
    public x55 y0;
    public final vuf z;

    public i3a(a aVar, ViewGroup viewGroup, WindowManager windowManager, wj8 wj8, u2a u2a, dm4 dm4, vuf vuf, bud bud, po5 po5, ggd ggd, fk fkVar, hn4 hn4) {
        super(viewGroup.getContext());
        this.X = aVar;
        this.o = viewGroup;
        this.v = windowManager;
        this.w = wj8;
        this.x = u2a;
        this.y = dm4;
        this.z = vuf;
        this.Y = bud;
        this.Z = po5;
        this.v0 = ggd;
    }

    public final void M() {
    }

    public final void Z(Bundle bundle) {
        d0();
        ok8 ok8 = new ok8(this.o.getContext(), this.w, this.y, this.z, this.Y, this.Z, this.v0);
        this.w0 = ok8;
        ok8.setListener(this);
        g5b g5b = new g5b((View) this.w0, this.v);
        this.x0 = g5b;
        ((WindowManager.LayoutParams) g5b.v).softInputMode = 48;
        e0();
        if (bundle == null) {
            this.w0.post(new g3a(this, 1));
        } else {
            this.w0.m(bundle);
        }
        this.w0.post(new g3a(this, 2));
    }

    public final void a0(Runnable runnable, boolean z2) {
        x55 x55;
        if (c0()) {
            if (this.w0.getScrollState() == 0) {
                View view = this.o;
                if (view != null && (x55 = this.y0) != null) {
                    view.removeCallbacks(x55);
                    return;
                }
                return;
            }
            this.w0.l((Runnable) null, z2);
        }
    }

    public final boolean c0() {
        return (this.x0 == null || this.w0 == null) ? false : true;
    }

    public final void d0() {
        a aVar = this.X;
        try {
            a D = aVar.Q1().D(lic.gallery_container);
            if (D != null) {
                z68.c("i3a", "let's try to remove gallery fragment from backstack", new Object[0]);
                try {
                    xe0 xe0 = new xe0(aVar.Q1());
                    xe0.j(D);
                    xe0.g();
                } catch (Exception e) {
                    z68.f("i3a", "error while remove gallery fragment", e);
                }
                try {
                    a D2 = aVar.Q1().D(lic.albums_selection_fragment);
                    if (D2 != null) {
                        z68.c("i3a", "let's try to remove albums selection fragment from backstack", new Object[0]);
                        try {
                            xe0 xe02 = new xe0(aVar.Q1());
                            xe02.j(D2);
                            xe02.g();
                        } catch (Exception e2) {
                            z68.f("i3a", "error while remove albums fragment", e2);
                        }
                    }
                } catch (Throwable th) {
                    z68.f("i3a", "error while try to find albums container", th);
                }
            }
        } catch (Throwable th2) {
            z68.f("i3a", "error while try to find gallery container", th2);
        }
    }

    public final void e0() {
        if (this.z.isActive()) {
            g5b g5b = this.x0;
            if (!g5b.a) {
                g5b.a = true;
                try {
                    ((WindowManager) g5b.o).addView((View) g5b.c, (WindowManager.LayoutParams) g5b.v);
                } catch (Exception unused) {
                    g5b.a = false;
                    g5b.b = false;
                }
            }
        }
    }
}
