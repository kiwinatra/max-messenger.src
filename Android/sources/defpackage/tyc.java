package defpackage;

import android.database.Observable;
import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: tyc  reason: default package */
public abstract class tyc {
    public final uyc a = new Observable();
    public boolean b = false;
    public int c = 1;

    public void A(vyc vyc) {
        this.a.registerObserver(vyc);
    }

    public void C(boolean z) {
        if (!this.a.a()) {
            this.b = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public void D(vyc vyc) {
        this.a.unregisterObserver(vyc);
    }

    public final void h(pzc pzc, int i) {
        boolean z = pzc.B0 == null;
        if (z) {
            pzc.c = i;
            if (this.b) {
                pzc.v = k(i);
            }
            pzc.X = (pzc.X & -520) | 1;
            Trace.beginSection("RV OnBindView");
        }
        pzc.B0 = this;
        boolean z2 = RecyclerView.J1;
        View view = pzc.a;
        if (z2) {
            if (view.getParent() == null) {
                WeakHashMap weakHashMap = gag.a;
                if (view.isAttachedToWindow() != pzc.E()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + pzc.E() + ", attached to window: " + view.isAttachedToWindow() + ", holder: " + pzc);
                }
            }
            if (view.getParent() == null) {
                WeakHashMap weakHashMap2 = gag.a;
                if (view.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + pzc);
                }
            }
        }
        t(pzc, i, pzc.t());
        if (z) {
            ArrayList arrayList = pzc.Y;
            if (arrayList != null) {
                arrayList.clear();
            }
            pzc.X &= -1025;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof bzc) {
                ((bzc) layoutParams).c = true;
            }
            Trace.endSection();
        }
    }

    public int i(tyc tyc, pzc pzc, int i) {
        if (tyc == this) {
            return i;
        }
        return -1;
    }

    public abstract int j();

    public long k(int i) {
        return -1;
    }

    public int l(int i) {
        return 0;
    }

    public final void m() {
        this.a.b();
    }

    public final void n(int i, int i2) {
        this.a.c(i, i2);
    }

    public final void o(int i, int i2) {
        this.a.e(i, i2);
    }

    public final void q(int i, int i2) {
        this.a.f(i, i2);
    }

    public void r(RecyclerView recyclerView) {
    }

    public abstract void s(pzc pzc, int i);

    public void t(pzc pzc, int i, List list) {
        s(pzc, i);
    }

    public abstract pzc u(ViewGroup viewGroup, int i);

    public void v(RecyclerView recyclerView) {
    }

    public boolean w(pzc pzc) {
        return false;
    }

    public void x(pzc pzc) {
    }

    public void y(pzc pzc) {
    }

    public void z(pzc pzc) {
    }
}
