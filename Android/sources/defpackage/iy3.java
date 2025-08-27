package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: iy3  reason: default package */
public final class iy3 extends e9d {
    public zx3 j;
    public int k;
    public String l;
    public boolean m;
    public boolean n;

    public iy3() {
        this.e = 2;
    }

    public final void H(i9d i9d) {
        if (this.m) {
            i9d.a.setDetachFrozen(true);
        }
        super.H(i9d);
    }

    public final void J(int i, String str) {
        zx3 zx3 = this.j;
        if (zx3 != null && zx3.getRouter() != null) {
            this.j.getRouter().J(i, str);
        }
    }

    public final void M(String str, String[] strArr, int i) {
        zx3 zx3 = this.j;
        if (zx3 != null && zx3.getRouter() != null) {
            this.j.getRouter().M(str, strArr, i);
        }
    }

    public final void N(Bundle bundle) {
        super.N(bundle);
        this.k = bundle.getInt("ControllerHostedRouter.hostId");
        this.n = bundle.getBoolean("ControllerHostedRouter.boundToContainer");
        this.l = bundle.getString("ControllerHostedRouter.tag");
    }

    public final void O(Bundle bundle) {
        super.O(bundle);
        bundle.putInt("ControllerHostedRouter.hostId", this.k);
        bundle.putBoolean("ControllerHostedRouter.boundToContainer", this.n);
        bundle.putString("ControllerHostedRouter.tag", this.l);
    }

    public final void P(List list, ey3 ey3) {
        if (this.m) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((i9d) it.next()).a.setDetachFrozen(true);
            }
        }
        super.P(list, ey3);
    }

    public final void S(zx3 zx3) {
        zx3.setParentController(this.j);
        zx3.setRouter(this);
        zx3.onContextAvailable();
    }

    public final void T(Intent intent) {
        zx3 zx3 = this.j;
        if (zx3 != null && zx3.getRouter() != null) {
            this.j.getRouter().T(intent);
        }
    }

    public final void U(String str, Intent intent, int i) {
        zx3 zx3 = this.j;
        if (zx3 != null && zx3.getRouter() != null) {
            this.j.getRouter().U(str, intent, i);
        }
    }

    public final void V(String str, Intent intent, int i, Bundle bundle) {
        zx3 zx3 = this.j;
        if (zx3 != null && zx3.getRouter() != null) {
            this.j.getRouter().V(str, intent, i, bundle);
        }
    }

    public final void W(String str, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        zx3 zx3 = this.j;
        if (zx3 != null && zx3.getRouter() != null) {
            this.j.getRouter().W(str, intentSender, i, intent, i2, i3, i4, bundle);
        }
    }

    public final void Y(String str) {
        zx3 zx3 = this.j;
        if (zx3 != null && zx3.getRouter() != null) {
            this.j.getRouter().Y(str);
        }
    }

    public final void Z() {
        ViewGroup viewGroup = this.i;
        if (viewGroup != null && (viewGroup instanceof dy3)) {
            K((dy3) viewGroup);
        }
        Iterator it = new ArrayList(this.d).iterator();
        while (it.hasNext()) {
            zx3 zx3 = (zx3) it.next();
            if (zx3.getView() != null) {
                zx3.detach(zx3.getView(), true, false);
            }
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            i9d i9d = (i9d) it2.next();
            if (i9d.a.getView() != null) {
                zx3 zx32 = i9d.a;
                zx32.detach(zx32.getView(), true, false);
            }
        }
        this.g = false;
        ViewGroup viewGroup2 = this.i;
        if (viewGroup2 != null) {
            viewGroup2.setOnHierarchyChangeListener((ViewGroup.OnHierarchyChangeListener) null);
        }
        this.i = null;
    }

    public final void a0(boolean z) {
        this.m = z;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((i9d) it.next()).a.setDetachFrozen(z);
        }
    }

    public final void b0(zx3 zx3, ViewGroup viewGroup) {
        if (this.j != zx3 || this.i != viewGroup) {
            Z();
            if (viewGroup instanceof dy3) {
                a((dy3) viewGroup);
            }
            this.j = zx3;
            this.i = viewGroup;
            Q(zx3.onBackPressedDispatcherEnabled);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((i9d) it.next()).a.setParentController(zx3);
            }
            this.i.post(new tj7(24, this));
        }
    }

    public final void c(boolean z) {
        a0(false);
        super.c(z);
    }

    public final Activity d() {
        zx3 zx3 = this.j;
        if (zx3 != null) {
            return zx3.getActivity();
        }
        return null;
    }

    public final e9d i() {
        zx3 zx3 = this.j;
        return (zx3 == null || zx3.getRouter() == null) ? this : this.j.getRouter().i();
    }

    public final List j() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.j.getChildRouters());
        arrayList.addAll(this.j.getRouter().j());
        return arrayList;
    }

    public final jq5 k() {
        if (i() != this) {
            return i().k();
        }
        zx3 zx3 = this.j;
        throw new IllegalStateException("Unable to retrieve TransactionIndexer from ".concat(zx3 != null ? String.format(Locale.ENGLISH, "%s (attached? %b, destroyed? %b, parent: %s)", new Object[]{zx3.getClass().getSimpleName(), Boolean.valueOf(this.j.isAttached()), Boolean.valueOf(this.j.isBeingDestroyed), this.j.getParentController()}) : "null host controller"));
    }

    public final void o() {
        zx3 zx3 = this.j;
        if (zx3 != null && zx3.getRouter() != null) {
            this.j.getRouter().o();
        }
    }

    public final void p(Activity activity, boolean z) {
        super.p(activity, z);
        Z();
    }

    public final void y(i9d i9d, i9d i9d2, boolean z) {
        super.y(i9d, i9d2, z);
        if (i9d != null && !this.j.isAttached()) {
            if (i9d.b() == null || i9d.b().d()) {
                Iterator it = this.a.iterator();
                while (it.hasNext()) {
                    ((i9d) it.next()).a.setNeedsAttach(false);
                }
            }
        }
    }
}
