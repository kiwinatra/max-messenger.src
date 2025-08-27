package defpackage;

import android.util.Pair;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: rd3  reason: default package */
public final class rd3 extends tyc {
    public final sd3 o;

    public rd3(tyc... tycArr) {
        this(qd3.c, tycArr);
    }

    public final void E(tyc tyc) {
        this.o.a(0, tyc);
    }

    public final List F() {
        List list;
        ArrayList arrayList = (ArrayList) this.o.d;
        if (arrayList.isEmpty()) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((b6a) it.next()).c);
            }
            list = arrayList2;
        }
        return Collections.unmodifiableList(list);
    }

    public final Pair G(int i) {
        sd3 sd3 = this.o;
        w h = sd3.h(i);
        Pair pair = new Pair(((b6a) h.c).c, Integer.valueOf(h.a));
        h.b = false;
        h.c = null;
        h.a = -1;
        sd3.h = h;
        return pair;
    }

    public final void H(tyc tyc) {
        sd3 sd3 = this.o;
        int m = sd3.m(tyc);
        if (m != -1) {
            ArrayList arrayList = (ArrayList) sd3.d;
            b6a b6a = (b6a) arrayList.get(m);
            int e = sd3.e(b6a);
            arrayList.remove(m);
            ((rd3) sd3.e).q(e, b6a.e);
            Iterator it = ((ArrayList) sd3.c).iterator();
            while (it.hasNext()) {
                RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
                if (recyclerView != null) {
                    tyc.v(recyclerView);
                }
            }
            b6a.c.D(b6a.f);
            b6a.a.dispose();
            sd3.d();
        }
    }

    public final int i(tyc tyc, pzc pzc, int i) {
        sd3 sd3 = this.o;
        b6a b6a = (b6a) ((IdentityHashMap) sd3.g).get(pzc);
        if (b6a == null) {
            return -1;
        }
        int e = i - sd3.e(b6a);
        tyc tyc2 = b6a.c;
        int j = tyc2.j();
        if (e >= 0 && e < j) {
            return tyc2.i(tyc, pzc, e);
        }
        StringBuilder n = a81.n("Detected inconsistent adapter updates. The local position of the view holder maps to ", e, " which is out of bounds for the adapter with size ", j, ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        n.append(pzc);
        n.append("adapter:");
        n.append(tyc);
        throw new IllegalStateException(n.toString());
    }

    public final int j() {
        Iterator it = ((ArrayList) this.o.d).iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((b6a) it.next()).e;
        }
        return i;
    }

    public final long k(int i) {
        sd3 sd3 = this.o;
        w h = sd3.h(i);
        b6a b6a = (b6a) h.c;
        long o2 = b6a.b.o(b6a.c.k(h.a));
        h.b = false;
        h.c = null;
        h.a = -1;
        sd3.h = h;
        return o2;
    }

    public final int l(int i) {
        sd3 sd3 = this.o;
        w h = sd3.h(i);
        b6a b6a = (b6a) h.c;
        int n = b6a.a.n(b6a.c.l(h.a));
        h.b = false;
        h.c = null;
        h.a = -1;
        sd3.h = h;
        return n;
    }

    public final void r(RecyclerView recyclerView) {
        sd3 sd3 = this.o;
        ArrayList arrayList = (ArrayList) sd3.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        arrayList.add(new WeakReference(recyclerView));
        Iterator it2 = ((ArrayList) sd3.d).iterator();
        while (it2.hasNext()) {
            ((b6a) it2.next()).c.r(recyclerView);
        }
    }

    public final void s(pzc pzc, int i) {
        sd3 sd3 = this.o;
        w h = sd3.h(i);
        ((IdentityHashMap) sd3.g).put(pzc, (b6a) h.c);
        ((b6a) h.c).c.h(pzc, h.a);
        h.b = false;
        h.c = null;
        h.a = -1;
        sd3.h = h;
    }

    public final pzc u(ViewGroup viewGroup, int i) {
        b6a c = ((ncg) this.o.f).c(i);
        return c.c.u(viewGroup, c.a.l(i));
    }

    public final void v(RecyclerView recyclerView) {
        sd3 sd3 = this.o;
        ArrayList arrayList = (ArrayList) sd3.c;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (weakReference.get() == null) {
                arrayList.remove(size);
            } else if (weakReference.get() == recyclerView) {
                arrayList.remove(size);
                break;
            }
            size--;
        }
        Iterator it = ((ArrayList) sd3.d).iterator();
        while (it.hasNext()) {
            ((b6a) it.next()).c.v(recyclerView);
        }
    }

    public final boolean w(pzc pzc) {
        sd3 sd3 = this.o;
        IdentityHashMap identityHashMap = (IdentityHashMap) sd3.g;
        b6a b6a = (b6a) identityHashMap.get(pzc);
        if (b6a != null) {
            boolean w = b6a.c.w(pzc);
            identityHashMap.remove(pzc);
            return w;
        }
        throw new IllegalStateException("Cannot find wrapper for " + pzc + ", seems like it is not bound by this adapter: " + sd3);
    }

    public final void x(pzc pzc) {
        this.o.k(pzc).c.x(pzc);
    }

    public final void y(pzc pzc) {
        this.o.k(pzc).c.y(pzc);
    }

    public final void z(pzc pzc) {
        sd3 sd3 = this.o;
        IdentityHashMap identityHashMap = (IdentityHashMap) sd3.g;
        b6a b6a = (b6a) identityHashMap.get(pzc);
        if (b6a != null) {
            b6a.c.z(pzc);
            identityHashMap.remove(pzc);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + pzc + ", seems like it is not bound by this adapter: " + sd3);
    }

    public rd3(qd3 qd3, tyc... tycArr) {
        List<tyc> asList = Arrays.asList(tycArr);
        this.o = new sd3(this, qd3);
        for (tyc a : asList) {
            sd3 sd3 = this.o;
            sd3.a(((ArrayList) sd3.d).size(), a);
        }
        C(this.o.b == 1 ? false : true);
    }
}
