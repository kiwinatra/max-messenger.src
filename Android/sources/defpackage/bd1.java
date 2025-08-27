package defpackage;

import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* renamed from: bd1  reason: default package */
public final class bd1 extends pae {
    public final grg v;
    public final nxc w;

    public bd1(grg grg, nxc nxc, ExecutorService executorService) {
        super(executorService);
        this.v = grg;
        this.w = nxc;
    }

    /* renamed from: J */
    public final void s(kbe kbe, int i) {
        boolean z = kbe instanceof ad1;
        grg grg = this.v;
        if (z) {
            ad1 ad1 = (ad1) kbe;
            lz7 lz7 = (lz7) E(i);
            if (lz7 instanceof kz0) {
                ad1.M(lz7);
                View view = ad1.a;
                r1e r1e = (r1e) view;
                kz0 kz0 = (kz0) lz7;
                r1e.setEnabled(kz0.y);
                if (kz0.y) {
                    ct.G(view, 300, new yc1(grg, (kz0) lz7, 1));
                } else {
                    view.setOnClickListener((View.OnClickListener) null);
                }
                CharSequence charSequence = ad1.D0.b;
                r1e.setDescription(charSequence != null ? new mgf(charSequence) : kz0.o);
            }
        } else if (kbe instanceof zc1) {
            zc1 zc1 = (zc1) kbe;
            lz7 lz72 = (lz7) E(i);
            if (lz72 instanceof kz0) {
                zc1.M(lz72);
                View view2 = zc1.a;
                kz0 kz02 = (kz0) lz72;
                ((r1e) view2).setEnabled(kz02.y);
                if (kz02.y) {
                    ct.G(view2, 300, new yc1(grg, (kz0) lz72, 0));
                } else {
                    view2.setOnClickListener((View.OnClickListener) null);
                }
            }
        } else {
            kbe.M((lz7) E(i));
        }
    }

    /* renamed from: K */
    public final void z(kbe kbe) {
        kbe.O();
        ad1 ad1 = kbe instanceof ad1 ? (ad1) kbe : null;
        if (ad1 != null) {
            ad1.D0.a.remove(ad1);
        }
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        if (i == qqa.V) {
            r1e r1e = new r1e(viewGroup.getContext(), (AttributeSet) null);
            pzc pzc = new pzc(r1e);
            r1e.setThemeDepended(m1e.b);
            return pzc;
        } else if (i == qqa.T) {
            return new ad1(viewGroup.getContext(), this.w);
        } else {
            String name = bd1.class.getName();
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                a67.d(w78.w, name, wj6.h(i, "unknown item viewType: "), (Throwable) null);
            }
            return new b61(new View(viewGroup.getContext()), 1);
        }
    }
}
