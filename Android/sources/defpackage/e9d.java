package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e9d  reason: default package */
public abstract class e9d {
    public final bg0 a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public int e;
    public boolean f;
    public boolean g = false;
    public boolean h = false;
    public ViewGroup i;

    public e9d() {
        bg0 bg0 = new bg0();
        this.a = bg0;
        bg0.b = new d9d(0, this);
    }

    public static void b(e9d e9d, ArrayList arrayList) {
        e9d.getClass();
        bg0 bg0 = e9d.a;
        ArrayList arrayList2 = new ArrayList(bg0.a.size());
        Iterator e2 = bg0.e();
        while (e2.hasNext()) {
            arrayList2.add(((i9d) e2.next()).a);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zx3 zx3 = (zx3) it.next();
            if (zx3.getView() != null) {
                arrayList.add(zx3.getView());
            }
            for (e9d b2 : zx3.getChildRouters()) {
                b(b2, arrayList);
            }
        }
    }

    public static ArrayList l(Iterator it, boolean z) {
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        while (it.hasNext()) {
            i9d i9d = (i9d) it.next();
            if (z2) {
                arrayList.add(i9d);
            }
            z2 = i9d.b() != null && !i9d.b().d();
            if (z && !z2) {
                break;
            }
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public final void A() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.c;
            if (i2 < arrayList.size()) {
                ey3.c((by3) arrayList.get(i2));
                i2++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }

    public final boolean B(zx3 zx3) {
        bs0.y();
        bg0 bg0 = this.a;
        i9d b2 = bg0.b();
        ArrayDeque arrayDeque = bg0.a;
        if (b2 == null || b2.a != zx3) {
            Iterator it = bg0.iterator();
            i9d i9d = null;
            ey3 b3 = b2 != null ? b2.b() : null;
            boolean z = b3 != null && !b3.d();
            i9d i9d2 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                i9d i9d3 = (i9d) it.next();
                zx3 zx32 = i9d3.a;
                if (zx32 == zx3) {
                    X(i9d3);
                    arrayDeque.remove(i9d3);
                    i9d2 = i9d3;
                } else if (i9d2 != null) {
                    if (z && !zx32.isAttached()) {
                        i9d = i9d3;
                    }
                }
            }
            if (i9d2 != null) {
                y(i9d, i9d2, false);
            }
        } else {
            X(bg0.d());
            y(bg0.b(), b2, false);
        }
        return this.e == 3 ? b2 != null : !arrayDeque.isEmpty();
    }

    public final boolean C() {
        bs0.y();
        i9d b2 = this.a.b();
        if (b2 != null) {
            return B(b2.a);
        }
        throw new IllegalStateException("Trying to pop the current controller when there are none on the backstack.");
    }

    public final void D(String str) {
        bs0.y();
        bs0.y();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            i9d i9d = (i9d) it.next();
            if (str.equals(i9d.b)) {
                E(i9d);
                return;
            }
        }
    }

    public final void E(i9d i9d) {
        bg0 bg0 = this.a;
        if (bg0.a.size() > 0) {
            i9d b2 = bg0.b();
            ArrayList arrayList = new ArrayList();
            Iterator e2 = bg0.e();
            while (e2.hasNext()) {
                i9d i9d2 = (i9d) e2.next();
                arrayList.add(i9d2);
                if (i9d2 == i9d) {
                    break;
                }
            }
            ey3 overriddenPopHandler = b2.a.getOverriddenPopHandler();
            if (overriddenPopHandler == null) {
                overriddenPopHandler = b2.d;
            }
            P(arrayList, overriddenPopHandler);
        }
    }

    public final void F() {
        this.c.clear();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            i9d i9d = (i9d) it.next();
            String instanceId = i9d.a.getInstanceId();
            HashMap hashMap = ey3.c;
            boolean m = ld8.m(instanceId);
            zx3 zx3 = i9d.a;
            if (m) {
                zx3.setNeedsAttach(true);
            }
            zx3.prepareForHostDetach();
        }
    }

    public final void G(i9d i9d) {
        bs0.y();
        i9d b2 = this.a.b();
        H(i9d);
        y(i9d, b2, true);
    }

    public void H(i9d i9d) {
        bg0 bg0 = this.a;
        ArrayDeque arrayDeque = bg0.a;
        if (!(arrayDeque instanceof Collection) || !arrayDeque.isEmpty()) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (Intrinsics.areEqual((Object) ((i9d) it.next()).a, (Object) i9d.a)) {
                    throw new IllegalStateException("Trying to push a controller that already exists on the backstack.");
                }
            }
        }
        bg0.a.push(i9d);
        d9d d9d = bg0.b;
        if (d9d != null) {
            d9d.d();
        }
    }

    public final void I() {
        bs0.y();
        bg0 bg0 = this.a;
        ArrayList arrayList = new ArrayList(bg0.a.size());
        Iterator e2 = bg0.e();
        while (e2.hasNext()) {
            arrayList.add((i9d) e2.next());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i9d i9d = (i9d) it.next();
            if (i9d.a.getNeedsAttach()) {
                z(i9d, (i9d) null, true, new jbe(false));
            } else {
                S(i9d.a);
            }
        }
    }

    public abstract void J(int i2, String str);

    public final void K(dy3 dy3) {
        this.b.remove(dy3);
    }

    public final void L(i9d i9d) {
        bs0.y();
        bg0 bg0 = this.a;
        i9d b2 = bg0.b();
        if (!bg0.a.isEmpty()) {
            X(bg0.d());
        }
        ey3 b3 = i9d.b();
        if (b2 != null) {
            boolean z = false;
            boolean z2 = b2.b() == null || b2.b().d();
            if (b3 == null || b3.d()) {
                z = true;
            }
            if (!z2 && z) {
                Iterator it = l(bg0.iterator(), true).iterator();
                while (it.hasNext()) {
                    z((i9d) null, (i9d) it.next(), true, b3);
                }
            }
        }
        H(i9d);
        if (b3 != null) {
            b3.a = true;
        }
        i9d.c(b3);
        y(i9d, b2, true);
    }

    public abstract void M(String str, String[] strArr, int i2);

    public void N(Bundle bundle) {
        this.e = tr1.A(3)[bundle.getInt("Router.popRootControllerMode")];
        this.f = bundle.getBoolean("Router.onBackPressedDispatcherEnabled");
        bg0 bg0 = this.a;
        bg0.getClass();
        ArrayList parcelableArrayList = ((Bundle) bundle.getParcelable("Router.backstack")).getParcelableArrayList("Backstack.entries");
        if (parcelableArrayList != null) {
            CollectionsKt.reverse(parcelableArrayList);
            Iterator it = parcelableArrayList.iterator();
            while (it.hasNext()) {
                Bundle bundle2 = (Bundle) it.next();
                ArrayDeque arrayDeque = bg0.a;
                zx3 newInstance = zx3.newInstance(bundle2.getBundle("RouterTransaction.controller.bundle"));
                HashMap hashMap = ey3.c;
                ey3 z = ld8.z(bundle2.getBundle("RouterTransaction.pushControllerChangeHandler"));
                ey3 z2 = ld8.z(bundle2.getBundle("RouterTransaction.popControllerChangeHandler"));
                arrayDeque.push(new i9d(newInstance, bundle2.getString("RouterTransaction.tag"), z, z2, bundle2.getBoolean("RouterTransaction.attachedToRouter"), bundle2.getInt("RouterTransaction.transactionIndex")));
            }
        }
        d9d d9d = bg0.b;
        if (d9d != null) {
            d9d.d();
        }
        Iterator e2 = bg0.e();
        while (e2.hasNext()) {
            S(((i9d) e2.next()).a);
        }
    }

    public void O(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bg0 bg0 = this.a;
        bg0.getClass();
        ArrayDeque arrayDeque = bg0.a;
        ArrayList arrayList = new ArrayList(arrayDeque.size());
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            i9d i9d = (i9d) it.next();
            i9d.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putBundle("RouterTransaction.controller.bundle", i9d.a.saveInstanceState());
            ey3 ey3 = i9d.c;
            if (ey3 != null) {
                bundle3.putBundle("RouterTransaction.pushControllerChangeHandler", ey3.j());
            }
            ey3 ey32 = i9d.d;
            if (ey32 != null) {
                bundle3.putBundle("RouterTransaction.popControllerChangeHandler", ey32.j());
            }
            bundle3.putString("RouterTransaction.tag", i9d.b);
            bundle3.putInt("RouterTransaction.transactionIndex", i9d.f);
            bundle3.putBoolean("RouterTransaction.attachedToRouter", i9d.e);
            arrayList.add(bundle3);
        }
        bundle2.putParcelableArrayList("Backstack.entries", arrayList);
        bundle.putInt("Router.popRootControllerMode", tr1.y(this.e));
        bundle.putBoolean("Router.onBackPressedDispatcherEnabled", this.f);
        bundle.putParcelable("Router.backstack", bundle2);
    }

    public void P(List list, ey3 ey3) {
        boolean z;
        bs0.y();
        ArrayList e2 = e();
        bg0 bg0 = this.a;
        ArrayList l = l(bg0.iterator(), false);
        ArrayList arrayList = new ArrayList();
        Iterator it = l(bg0.iterator(), false).iterator();
        while (it.hasNext()) {
            i9d i9d = (i9d) it.next();
            if (i9d.a.getView() != null) {
                arrayList.add(i9d.a.getView());
            }
        }
        for (e9d e9d : j()) {
            if (e9d.i == this.i) {
                b(e9d, arrayList);
            }
        }
        for (int childCount = this.i.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.i.getChildAt(childCount);
            if (!arrayList.contains(childAt)) {
                this.i.removeView(childAt);
            }
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            i9d i9d2 = (i9d) it2.next();
            jq5 k = k();
            if (i9d2.f == -1) {
                int i2 = k.b + 1;
                k.b = i2;
                i9d2.f = i2;
            }
            arrayList2.add(Integer.valueOf(i9d2.f));
        }
        Collections.sort(arrayList2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((i9d) list.get(i3)).f = ((Integer) arrayList2.get(i3)).intValue();
        }
        int i4 = 0;
        while (i4 < list.size()) {
            zx3 zx3 = ((i9d) list.get(i4)).a;
            i4++;
            int i5 = i4;
            while (true) {
                if (i5 < list.size()) {
                    if (((i9d) list.get(i5)).a != zx3) {
                        i5++;
                    } else {
                        throw new IllegalStateException("Trying to push the same controller to the backstack more than once.");
                    }
                }
            }
        }
        ArrayDeque arrayDeque = bg0.a;
        arrayDeque.clear();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            arrayDeque.push((i9d) it3.next());
        }
        d9d d9d = bg0.b;
        if (d9d != null) {
            d9d.d();
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it4 = e2.iterator();
        while (it4.hasNext()) {
            i9d i9d3 = (i9d) it4.next();
            Iterator it5 = list.iterator();
            while (true) {
                if (it5.hasNext()) {
                    if (i9d3.a == ((i9d) it5.next()).a) {
                        break;
                    }
                } else {
                    i9d3.a.isBeingDestroyed = true;
                    arrayList3.add(i9d3);
                    break;
                }
            }
        }
        Iterator e3 = bg0.e();
        while (e3.hasNext()) {
            i9d i9d4 = (i9d) e3.next();
            i9d4.e = true;
            S(i9d4.a);
        }
        if (list.size() > 0) {
            ArrayList arrayList4 = new ArrayList(list);
            Collections.reverse(arrayList4);
            ArrayList l2 = l(arrayList4.iterator(), false);
            boolean z2 = l2.size() <= 0 || !e2.contains(l2.get(0));
            if (l2.size() == l.size()) {
                int i6 = 0;
                while (true) {
                    if (i6 >= l.size()) {
                        z = true;
                        break;
                    } else if (((i9d) l.get(i6)).a != ((i9d) l2.get(i6)).a) {
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            z = false;
            if (!z) {
                i9d i9d5 = l.size() > 0 ? (i9d) l.get(0) : null;
                i9d i9d6 = (i9d) l2.get(0);
                if (i9d5 == null || i9d5.a != i9d6.a) {
                    if (i9d5 != null) {
                        String instanceId = i9d5.a.getInstanceId();
                        HashMap hashMap = ey3.c;
                        ld8.m(instanceId);
                    }
                    z(i9d6, i9d5, z2, ey3);
                }
                for (int size = l.size() - 1; size > 0; size--) {
                    i9d i9d7 = (i9d) l.get(size);
                    if (!l2.contains(i9d7)) {
                        ey3 b2 = ey3 != null ? ey3.b() : new jbe();
                        b2.a = true;
                        ld8.m(i9d7.a.getInstanceId());
                        if (i9d7.a.view != null) {
                            z((i9d) null, i9d7, z2, b2);
                        }
                    }
                }
                for (int i7 = 1; i7 < l2.size(); i7++) {
                    i9d i9d8 = (i9d) l2.get(i7);
                    if (!l.contains(i9d8)) {
                        z(i9d8, (i9d) l2.get(i7 - 1), true, i9d8.b());
                    }
                }
            }
        } else {
            for (int size2 = l.size() - 1; size2 >= 0; size2--) {
                i9d i9d9 = (i9d) l.get(size2);
                ey3 b3 = ey3 != null ? ey3.b() : new jbe();
                String instanceId2 = i9d9.a.getInstanceId();
                HashMap hashMap2 = ey3.c;
                ld8.m(instanceId2);
                z((i9d) null, i9d9, false, b3);
            }
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            i9d i9d10 = (i9d) it6.next();
            Iterator it7 = this.c.iterator();
            boolean z3 = false;
            while (it7.hasNext()) {
                if (((by3) it7.next()).b == i9d10.a) {
                    z3 = true;
                }
            }
            if (!z3) {
                i9d10.a.destroy();
            }
        }
    }

    public final void Q(boolean z) {
        this.a.getSize();
        this.f = z;
    }

    public final void R(i9d i9d) {
        bs0.y();
        P(Collections.singletonList(i9d), i9d.b());
    }

    public void S(zx3 zx3) {
        zx3.setRouter(this);
        zx3.onContextAvailable();
    }

    public abstract void T(Intent intent);

    public abstract void U(String str, Intent intent, int i2);

    public abstract void V(String str, Intent intent, int i2, Bundle bundle);

    public abstract void W(String str, IntentSender intentSender, int i2, Intent intent, int i3, int i4, int i5, Bundle bundle);

    public final void X(i9d i9d) {
        if (!i9d.a.isDestroyed()) {
            ArrayList arrayList = this.d;
            zx3 zx3 = i9d.a;
            arrayList.add(zx3);
            zx3.addLifecycleListener(new fa3(4, this));
        }
    }

    public abstract void Y(String str);

    public final void a(dy3 dy3) {
        ArrayList arrayList = this.b;
        if (!arrayList.contains(dy3)) {
            arrayList.add(dy3);
        }
    }

    public void c(boolean z) {
        this.e = 3;
        bg0 bg0 = this.a;
        bg0.getClass();
        ArrayList arrayList = new ArrayList();
        while (!bg0.a.isEmpty()) {
            arrayList.add(bg0.d());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            X((i9d) it.next());
        }
        i9d i9d = null;
        if (z && arrayList.size() > 0) {
            i9d i9d2 = (i9d) arrayList.get(0);
            i9d2.a.addLifecycleListener(new t6b((iy3) this, arrayList));
            ey3 overriddenPopHandler = i9d2.a.getOverriddenPopHandler();
            if (overriddenPopHandler == null) {
                overriddenPopHandler = i9d2.d;
            }
            z((i9d) null, i9d2, false, overriddenPopHandler);
            i9d = i9d2;
        }
        if (arrayList.size() > 0) {
            r9a r9a = new r9a();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                i9d i9d3 = (i9d) it2.next();
                if (i9d3 != i9d) {
                    zx3 zx3 = i9d3.a;
                    fy3 fy3 = fy3.POP_EXIT;
                    zx3.changeStarted(r9a, fy3);
                    i9d3.a.changeEnded(r9a, fy3);
                }
            }
        }
    }

    public abstract Activity d();

    public final ArrayList e() {
        bg0 bg0 = this.a;
        ArrayList arrayList = new ArrayList(bg0.a.size());
        Iterator e2 = bg0.e();
        while (e2.hasNext()) {
            arrayList.add((i9d) e2.next());
        }
        return arrayList;
    }

    public final zx3 f(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            zx3 findController = ((i9d) it.next()).a.findController(str);
            if (findController != null) {
                return findController;
            }
        }
        return null;
    }

    public final zx3 g(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            i9d i9d = (i9d) it.next();
            if (str.equals(i9d.b)) {
                return i9d.a;
            }
        }
        return null;
    }

    public final fma h() {
        Activity d2 = d();
        if (d2 instanceof bc3) {
            return ((bc3) d2).getOnBackPressedDispatcher();
        }
        return null;
    }

    public abstract e9d i();

    public abstract List j();

    public abstract jq5 k();

    public final boolean m() {
        bg0 bg0 = this.a;
        if (bg0.a.isEmpty()) {
            return false;
        }
        if (bg0.b().a.handleBack()) {
            return true;
        }
        return (bg0.a.size() > 1 || this.e != 1) && C();
    }

    public final boolean n() {
        return this.a.getSize() > 0;
    }

    public abstract void o();

    public void p(Activity activity, boolean z) {
        this.g = false;
        ViewGroup viewGroup = this.i;
        if (viewGroup != null) {
            viewGroup.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
        }
        this.b.clear();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            i9d i9d = (i9d) it.next();
            i9d.a.activityDestroyed(activity);
            for (e9d p : i9d.a.getChildRouters()) {
                p.p(activity, z);
            }
        }
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            zx3 zx3 = (zx3) arrayList.get(size);
            zx3.activityDestroyed(activity);
            for (e9d p2 : zx3.getChildRouters()) {
                p2.p(activity, z);
            }
        }
        this.i = null;
    }

    public final void q(Activity activity) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            i9d i9d = (i9d) it.next();
            i9d.a.activityPaused(activity);
            for (e9d q : i9d.a.getChildRouters()) {
                q.q(activity);
            }
        }
    }

    public final void r(Activity activity) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            i9d i9d = (i9d) it.next();
            i9d.a.activityResumed(activity);
            for (e9d r : i9d.a.getChildRouters()) {
                r.r(activity);
            }
        }
    }

    public final void s(Activity activity) {
        this.h = false;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            i9d i9d = (i9d) it.next();
            i9d.a.activityStarted(activity);
            for (e9d s : i9d.a.getChildRouters()) {
                s.s(activity);
            }
        }
    }

    public final void t(Activity activity) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            i9d i9d = (i9d) it.next();
            i9d.a.activityStopped(activity);
            for (e9d t : i9d.a.getChildRouters()) {
                t.t(activity);
            }
        }
        this.h = true;
    }

    public void u() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((i9d) it.next()).a.onContextAvailable();
        }
    }

    public final void v(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            i9d i9d = (i9d) it.next();
            i9d.a.createOptionsMenu(menu, menuInflater);
            for (e9d v : i9d.a.getChildRouters()) {
                v.v(menu, menuInflater);
            }
        }
    }

    public final boolean w(MenuItem menuItem) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            i9d i9d = (i9d) it.next();
            if (i9d.a.optionsItemSelected(menuItem)) {
                return true;
            }
            Iterator<e9d> it2 = i9d.a.getChildRouters().iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (it2.next().w(menuItem)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void x(Menu menu) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            i9d i9d = (i9d) it.next();
            i9d.a.prepareOptionsMenu(menu);
            for (e9d x : i9d.a.getChildRouters()) {
                x.x(menu);
            }
        }
    }

    public void y(i9d i9d, i9d i9d2, boolean z) {
        ey3 ey3;
        if (z && i9d != null) {
            i9d.e = true;
        }
        if (z) {
            ey3 = i9d.b();
        } else if (i9d2 != null) {
            ey3 = i9d2.a.getOverriddenPopHandler();
            if (ey3 == null) {
                ey3 = i9d2.d;
            }
        } else {
            ey3 = null;
        }
        z(i9d, i9d2, z, ey3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        if (r0.isAttached() == false) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z(defpackage.i9d r12, defpackage.i9d r13, boolean r14, defpackage.ey3 r15) {
        /*
            r11 = this;
            r0 = 0
            if (r12 == 0) goto L_0x0006
            zx3 r1 = r12.a
            goto L_0x0007
        L_0x0006:
            r1 = r0
        L_0x0007:
            if (r13 == 0) goto L_0x000b
            zx3 r0 = r13.a
        L_0x000b:
            r13 = 1
            r9 = 0
            if (r12 == 0) goto L_0x0023
            jq5 r2 = r11.k()
            int r3 = r12.f
            r4 = -1
            if (r3 != r4) goto L_0x001f
            int r3 = r2.b
            int r3 = r3 + r13
            r2.b = r3
            r12.f = r3
        L_0x001f:
            r11.S(r1)
            goto L_0x0044
        L_0x0023:
            bg0 r12 = r11.a
            java.util.ArrayDeque r12 = r12.a
            int r12 = r12.size()
            if (r12 != 0) goto L_0x0039
            int r12 = r11.e
            r2 = 2
            if (r12 != r2) goto L_0x0039
            r9a r15 = new r9a
            r15.<init>()
        L_0x0037:
            r12 = r13
            goto L_0x0045
        L_0x0039:
            if (r14 != 0) goto L_0x0044
            if (r0 == 0) goto L_0x0044
            boolean r12 = r0.isAttached()
            if (r12 != 0) goto L_0x0044
            goto L_0x0037
        L_0x0044:
            r12 = r9
        L_0x0045:
            if (r14 == 0) goto L_0x0071
            if (r1 == 0) goto L_0x0071
            boolean r2 = r1.isDestroyed()
            if (r2 != 0) goto L_0x0050
            goto L_0x0071
        L_0x0050:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Trying to push a controller that has already been destroyed. ("
            r12.<init>(r13)
            java.lang.Class r13 = r1.getClass()
            java.lang.String r13 = r13.getSimpleName()
            r12.append(r13)
            java.lang.String r13 = ")"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L_0x0071:
            by3 r10 = new by3
            android.view.ViewGroup r6 = r11.i
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.ArrayList r2 = r11.b
            r8.<init>(r2)
            r2 = r10
            r3 = r1
            r4 = r0
            r5 = r14
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.util.ArrayList r14 = r11.c
            int r2 = r14.size()
            if (r2 <= 0) goto L_0x0095
            if (r1 == 0) goto L_0x0091
            r1.setNeedsAttach(r13)
        L_0x0091:
            r14.add(r10)
            goto L_0x00bd
        L_0x0095:
            if (r0 == 0) goto L_0x00ba
            if (r15 == 0) goto L_0x009f
            boolean r15 = r15.d()
            if (r15 == 0) goto L_0x00ba
        L_0x009f:
            boolean r15 = r11.g
            if (r15 != 0) goto L_0x00ba
            if (r1 == 0) goto L_0x00a8
            r1.setNeedsAttach(r13)
        L_0x00a8:
            r14.add(r10)
            android.view.ViewGroup r14 = r11.i
            if (r14 == 0) goto L_0x00bd
            o99 r15 = new o99
            r1 = 29
            r15.<init>(r1, r11)
            r14.post(r15)
            goto L_0x00bd
        L_0x00ba:
            defpackage.ey3.c(r10)
        L_0x00bd:
            if (r12 == 0) goto L_0x00d2
            if (r0 == 0) goto L_0x00d2
            android.view.View r11 = r0.getView()
            if (r11 == 0) goto L_0x00cf
            android.view.View r11 = r0.getView()
            r0.detach(r11, r13, r9)
            goto L_0x00d2
        L_0x00cf:
            r0.destroy()
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e9d.z(i9d, i9d, boolean, ey3):void");
    }
}
