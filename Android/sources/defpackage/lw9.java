package defpackage;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* renamed from: lw9  reason: default package */
public final class lw9 extends tyc {
    public final ArrayList o = new ArrayList();
    public final SparseArray v = new SparseArray();
    public final HashMap w = new HashMap();
    public tyc x;
    public int y;
    public final y35 z = new y35(29, (Object) this);

    public final void E(tyc tyc) {
        this.o.add(tyc);
        t45 t45 = new t45(5, this.z);
        this.w.put(t45, tyc);
        tyc.A(t45);
    }

    public final void F() {
        HashMap hashMap = this.w;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((tyc) entry.getValue()).D((vyc) entry.getKey());
        }
        this.o.clear();
        hashMap.clear();
    }

    public final int G(tyc tyc) {
        tyc tyc2;
        Iterator it = this.o.iterator();
        int i = 0;
        while (it.hasNext() && (tyc2 = (tyc) it.next()) != tyc) {
            i += tyc2.j();
        }
        return i;
    }

    public final void H(int i) {
        this.x = null;
        this.y = 0;
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            tyc tyc = (tyc) it.next();
            int j = tyc.j();
            if (i < j) {
                this.x = tyc;
                this.y = i;
                return;
            }
            i -= j;
        }
    }

    public final int j() {
        Iterator it = this.o.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((tyc) it.next()).j();
        }
        return i;
    }

    public final long k(int i) {
        int i2;
        H(i);
        tyc tyc = this.x;
        if (tyc == null || (i2 = this.y) == -1) {
            return 0;
        }
        return tyc.k(i2);
    }

    public final int l(int i) {
        H(i);
        int l = this.x.l(this.y);
        SparseArray sparseArray = this.v;
        tyc tyc = (tyc) sparseArray.get(l);
        if (!(tyc == null || tyc == this.x)) {
            Locale locale = Locale.ENGLISH;
            String simpleName = tyc.getClass().getSimpleName();
            String simpleName2 = this.x.getClass().getSimpleName();
            StringBuilder sb = new StringBuilder("Different adapters have same viewType. Adapters ");
            sb.append(simpleName);
            sb.append(" and ");
            sb.append(simpleName2);
            sb.append(".");
        }
        sparseArray.put(l, this.x);
        return l;
    }

    public final void r(RecyclerView recyclerView) {
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((tyc) it.next()).r(recyclerView);
        }
    }

    public final void s(pzc pzc, int i) {
        H(i);
        this.x.s(pzc, this.y);
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        return ((tyc) this.v.get(i)).u(viewGroup, i);
    }

    public final void v(RecyclerView recyclerView) {
        Iterator it = this.o.iterator();
        while (it.hasNext()) {
            ((tyc) it.next()).v(recyclerView);
        }
    }

    public final void x(pzc pzc) {
        tyc tyc = this.x;
        if (tyc != null) {
            tyc.x(pzc);
        }
    }
}
