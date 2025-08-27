package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.List;

/* renamed from: ey3  reason: default package */
public abstract class ey3 {
    public static final HashMap c = new HashMap();
    public boolean a;
    public boolean b;

    public ey3() {
        try {
            getClass().getConstructor((Class[]) null);
        } catch (Throwable unused) {
            throw new RuntimeException(getClass() + " does not have a default constructor.");
        }
    }

    public static final void c(by3 by3) {
        View view;
        zx3 zx3 = by3.a;
        ViewGroup viewGroup = by3.d;
        if (viewGroup != null) {
            ey3 ey3 = by3.e;
            if (ey3 == null) {
                ey3 = new jbe(true);
            } else if (ey3.b && !ey3.e()) {
                ey3 = ey3.b();
            }
            ey3 ey32 = ey3;
            ey32.b = true;
            HashMap hashMap = c;
            zx3 zx32 = by3.b;
            boolean z = by3.c;
            if (zx32 != null) {
                if (z) {
                    ld8.m(zx32.getInstanceId());
                } else {
                    ay3 ay3 = (ay3) hashMap.get(zx32.getInstanceId());
                    if (ay3 != null) {
                        boolean z2 = ay3.b;
                        ey3 ey33 = ay3.a;
                        if (z2) {
                            ey33.f();
                        } else {
                            ey33.a();
                        }
                        ay3 ay32 = (ay3) hashMap.remove(zx32.getInstanceId());
                    }
                }
            }
            if (zx3 != null) {
                hashMap.put(zx3.getInstanceId(), new ay3(ey32, z));
            }
            List<dy3> list = by3.f;
            for (dy3 a2 : list) {
                a2.a(zx3, zx32, z);
            }
            fy3 fy3 = z ? fy3.PUSH_ENTER : fy3.POP_ENTER;
            fy3 fy32 = z ? fy3.PUSH_EXIT : fy3.POP_EXIT;
            View view2 = null;
            if (zx3 != null) {
                View inflate = zx3.inflate(viewGroup);
                zx3.changeStarted(ey32, fy3);
                view = inflate;
            } else {
                view = null;
            }
            if (zx32 != null) {
                view2 = zx32.getView();
                zx32.changeStarted(ey32, fy32);
            }
            ey32.g(viewGroup, view2, view, z, new cy3(zx32, ey32, fy32, zx3, list, view2, fy3, z, viewGroup));
        }
    }

    public void a() {
    }

    public ey3 b() {
        return ld8.z(j());
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return false;
    }

    public void f() {
    }

    public abstract void g(ViewGroup viewGroup, View view, View view2, boolean z, cy3 cy3);

    public void h(Bundle bundle) {
    }

    public void i(Bundle bundle) {
    }

    public final Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putString("ControllerChangeHandler.className", getClass().getName());
        Bundle bundle2 = new Bundle();
        i(bundle2);
        bundle.putBundle("ControllerChangeHandler.savedState", bundle2);
        return bundle;
    }
}
