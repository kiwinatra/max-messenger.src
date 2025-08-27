package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongFragmentContainerViolation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.loader.app.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;

public final class e {
    public final wsb a;
    public final f b;
    public final a c;
    public boolean d = false;
    public int e = -1;

    public e(wsb wsb, f fVar, a aVar) {
        this.a = wsb;
        this.b = fVar;
        this.c = aVar;
    }

    public final void a() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        Bundle bundle = aVar.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        aVar.F0.S();
        aVar.a = 3;
        aVar.Q0 = false;
        aVar.e2(bundle2);
        if (aVar.Q0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                aVar.toString();
            }
            if (aVar.S0 != null) {
                Bundle bundle3 = aVar.b;
                Bundle bundle4 = bundle3 != null ? bundle3.getBundle("savedInstanceState") : null;
                SparseArray sparseArray = aVar.c;
                if (sparseArray != null) {
                    aVar.S0.restoreHierarchyState(sparseArray);
                    aVar.c = null;
                }
                aVar.Q0 = false;
                aVar.B2(bundle4);
                if (!aVar.Q0) {
                    throw new AndroidRuntimeException(g63.g(aVar, "Fragment ", " did not call through to super.onViewStateRestored()"));
                } else if (aVar.S0 != null) {
                    aVar.c1.a(hu7.ON_CREATE);
                }
            }
            aVar.b = null;
            ed6 ed6 = aVar.F0;
            ed6.I = false;
            ed6.J = false;
            ed6.P.h = false;
            ed6.u(4);
            this.a.K(false);
            return;
        }
        throw new AndroidRuntimeException(g63.g(aVar, "Fragment ", " did not call through to super.onActivityCreated()"));
    }

    public final void b() {
        a aVar;
        View view;
        View view2;
        int i = -1;
        a aVar2 = this.c;
        View view3 = aVar2.R0;
        while (true) {
            aVar = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(whc.fragment_container_view_tag);
            a aVar3 = tag instanceof a ? (a) tag : null;
            if (aVar3 != null) {
                aVar = aVar3;
                break;
            } else {
                ViewParent parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        a aVar4 = aVar2.G0;
        if (aVar != null && !aVar.equals(aVar4)) {
            int i2 = aVar2.I0;
            kd6 kd6 = ld6.a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(aVar2);
            sb.append(" within the view of parent fragment ");
            sb.append(aVar);
            sb.append(" via container with ID ");
            Violation violation = new Violation(aVar2, wj6.l(sb, i2, " without using parent's childFragmentManager"));
            ld6.c(violation);
            kd6 a2 = ld6.a(aVar2);
            if (a2.a.contains(jd6.v) && ld6.e(a2, aVar2.getClass(), WrongNestedHierarchyViolation.class)) {
                ld6.b(a2, violation);
            }
        }
        f fVar = this.b;
        fVar.getClass();
        ViewGroup viewGroup = aVar2.R0;
        if (viewGroup != null) {
            ArrayList arrayList = fVar.a;
            int indexOf = arrayList.indexOf(aVar2);
            int i3 = indexOf - 1;
            while (true) {
                if (i3 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        a aVar5 = (a) arrayList.get(indexOf);
                        if (aVar5.R0 == viewGroup && (view = aVar5.S0) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    a aVar6 = (a) arrayList.get(i3);
                    if (aVar6.R0 == viewGroup && (view2 = aVar6.S0) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i3--;
                }
            }
        }
        aVar2.R0.addView(aVar2.S0, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: androidx.fragment.app.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c() {
        /*
            r7 = this;
            java.lang.String r0 = "FragmentManager"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            androidx.fragment.app.a r1 = r7.c
            if (r0 == 0) goto L_0x000e
            java.util.Objects.toString(r1)
        L_0x000e:
            androidx.fragment.app.a r0 = r1.y
            r2 = 0
            java.lang.String r3 = " that does not belong to this FragmentManager!"
            java.lang.String r4 = " declared target fragment "
            androidx.fragment.app.f r5 = r7.b
            java.lang.String r6 = "Fragment "
            if (r0 == 0) goto L_0x004e
            java.lang.String r0 = r0.w
            java.util.HashMap r5 = r5.b
            java.lang.Object r0 = r5.get(r0)
            androidx.fragment.app.e r0 = (androidx.fragment.app.e) r0
            if (r0 == 0) goto L_0x0031
            androidx.fragment.app.a r3 = r1.y
            java.lang.String r3 = r3.w
            r1.z = r3
            r1.y = r2
            r2 = r0
            goto L_0x0075
        L_0x0031:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            r0.append(r1)
            r0.append(r4)
            androidx.fragment.app.a r1 = r1.y
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x004e:
            java.lang.String r0 = r1.z
            if (r0 == 0) goto L_0x0075
            java.util.HashMap r2 = r5.b
            java.lang.Object r0 = r2.get(r0)
            r2 = r0
            androidx.fragment.app.e r2 = (androidx.fragment.app.e) r2
            if (r2 == 0) goto L_0x005e
            goto L_0x0075
        L_0x005e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = r1.z
            java.lang.String r0 = defpackage.wj6.n(r0, r1, r3)
            r7.<init>(r0)
            throw r7
        L_0x0075:
            if (r2 == 0) goto L_0x007a
            r2.k()
        L_0x007a:
            androidx.fragment.app.c r0 = r1.D0
            oc6 r2 = r0.w
            r1.E0 = r2
            androidx.fragment.app.a r0 = r0.y
            r1.G0 = r0
            wsb r7 = r7.a
            r0 = 0
            r7.Q(r0)
            java.util.ArrayList r2 = r1.i1
            java.util.Iterator r3 = r2.iterator()
        L_0x0090:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00a0
            java.lang.Object r4 = r3.next()
            lc6 r4 = (defpackage.lc6) r4
            r4.a()
            goto L_0x0090
        L_0x00a0:
            r2.clear()
            ed6 r2 = r1.F0
            oc6 r3 = r1.E0
            ld8 r4 = r1.J1()
            r2.b(r3, r4, r1)
            r1.a = r0
            r1.Q0 = r0
            oc6 r2 = r1.E0
            android.content.Context r2 = r2.w0
            r1.h2(r2)
            boolean r2 = r1.Q0
            if (r2 == 0) goto L_0x00e6
            androidx.fragment.app.c r2 = r1.D0
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.p
            java.util.Iterator r2 = r2.iterator()
        L_0x00c5:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x00d5
            java.lang.Object r3 = r2.next()
            gd6 r3 = (defpackage.gd6) r3
            r3.a(r1)
            goto L_0x00c5
        L_0x00d5:
            ed6 r1 = r1.F0
            r1.I = r0
            r1.J = r0
            androidx.fragment.app.FragmentManagerViewModel r2 = r1.P
            r2.h = r0
            r1.u(r0)
            r7.L(r0)
            return
        L_0x00e6:
            ho1 r7 = new ho1
            java.lang.String r0 = " did not call through to super.onAttach()"
            java.lang.String r0 = defpackage.g63.g(r1, r6, r0)
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e.c():void");
    }

    public final int d() {
        tge tge;
        a aVar = this.c;
        if (aVar.D0 == null) {
            return aVar.a;
        }
        int i = this.e;
        int ordinal = aVar.a1.ordinal();
        int i2 = 0;
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (aVar.x0) {
            if (aVar.y0) {
                i = Math.max(this.e, 2);
                View view = aVar.S0;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = this.e < 4 ? Math.min(i, aVar.a) : Math.min(i, 1);
            }
        }
        if (aVar.z0 && aVar.R0 == null) {
            i = Math.min(i, 4);
        }
        if (!aVar.Z) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = aVar.R0;
        if (viewGroup != null) {
            p9a K = aVar.Q1().K();
            Object tag = viewGroup.getTag(whc.special_effects_controller_view_tag);
            if (tag instanceof tge) {
                tge = (tge) tag;
            } else {
                K.getClass();
                tge = new tge(viewGroup);
                viewGroup.setTag(whc.special_effects_controller_view_tag, tge);
            }
            tge.getClass();
            qge f = tge.f(aVar);
            int i3 = f != null ? f.b : 0;
            qge g = tge.g(aVar);
            if (g != null) {
                i2 = g.b;
            }
            int i4 = i3 == 0 ? -1 : sge.$EnumSwitchMapping$0[tr1.y(i3)];
            if (!(i4 == -1 || i4 == 1)) {
                i2 = i3;
            }
        }
        if (i2 == 2) {
            i = Math.min(i, 6);
        } else if (i2 == 3) {
            i = Math.max(i, 3);
        } else if (aVar.v0) {
            i = aVar.c2() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (aVar.T0 && aVar.a < 5) {
            i = Math.min(i, 4);
        }
        if (aVar.w0) {
            i = Math.max(i, 3);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(aVar);
        }
        return i;
    }

    public final void e() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        Bundle bundle = aVar.b;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (!aVar.Y0) {
            wsb wsb = this.a;
            wsb.R(false);
            aVar.F0.S();
            aVar.a = 1;
            aVar.Q0 = false;
            aVar.b1.a(new qyc(5, aVar));
            aVar.i2(bundle2);
            aVar.Y0 = true;
            if (aVar.Q0) {
                aVar.b1.e(hu7.ON_CREATE);
                wsb.M(false);
                return;
            }
            throw new AndroidRuntimeException(g63.g(aVar, "Fragment ", " did not call through to super.onCreate()"));
        }
        aVar.a = 1;
        aVar.J2();
    }

    public final void f() {
        String str;
        a aVar = this.c;
        if (!aVar.x0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(aVar);
            }
            Bundle bundle = aVar.b;
            Bundle bundle2 = null;
            Bundle bundle3 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater o2 = aVar.o2(bundle3);
            aVar.X0 = o2;
            ViewGroup viewGroup = aVar.R0;
            if (viewGroup == null) {
                int i = aVar.I0;
                if (i == 0) {
                    viewGroup = null;
                } else if (i != -1) {
                    viewGroup = (ViewGroup) aVar.D0.x.h0(i);
                    if (viewGroup == null) {
                        if (!aVar.A0 && !aVar.z0) {
                            try {
                                str = aVar.R1().getResourceName(aVar.I0);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(aVar.I0) + " (" + str + ") for fragment " + aVar);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        kd6 kd6 = ld6.a;
                        Violation violation = new Violation(aVar, "Attempting to add fragment " + aVar + " to container " + viewGroup + " which is not a FragmentContainerView");
                        ld6.c(violation);
                        kd6 a2 = ld6.a(aVar);
                        if (a2.a.contains(jd6.z) && ld6.e(a2, aVar.getClass(), WrongFragmentContainerViolation.class)) {
                            ld6.b(a2, violation);
                        }
                    }
                } else {
                    throw new IllegalArgumentException(g63.g(aVar, "Cannot create fragment ", " for a container view with no id"));
                }
            }
            aVar.R0 = viewGroup;
            aVar.C2(o2, viewGroup, bundle3);
            if (aVar.S0 != null) {
                if (Log.isLoggable("FragmentManager", 3)) {
                    Objects.toString(aVar);
                }
                aVar.S0.setSaveFromParentEnabled(false);
                aVar.S0.setTag(whc.fragment_container_view_tag, aVar);
                if (viewGroup != null) {
                    b();
                }
                if (aVar.K0) {
                    aVar.S0.setVisibility(8);
                }
                if (aVar.S0.isAttachedToWindow()) {
                    View view = aVar.S0;
                    WeakHashMap weakHashMap = gag.a;
                    t9g.c(view);
                } else {
                    View view2 = aVar.S0;
                    view2.addOnAttachStateChangeListener(new mf(view2, 1));
                }
                Bundle bundle4 = aVar.b;
                if (bundle4 != null) {
                    bundle2 = bundle4.getBundle("savedInstanceState");
                }
                aVar.A2(aVar.S0, bundle2);
                aVar.F0.u(2);
                this.a.W(aVar, aVar.S0, false);
                int visibility = aVar.S0.getVisibility();
                aVar.L1().j = aVar.S0.getAlpha();
                if (aVar.R0 != null && visibility == 0) {
                    View findFocus = aVar.S0.findFocus();
                    if (findFocus != null) {
                        aVar.L1().k = findFocus;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            findFocus.toString();
                            Objects.toString(aVar);
                        }
                    }
                    aVar.S0.setAlpha(c44.DEFAULT_ASPECT_RATIO);
                }
            }
            aVar.a = 2;
        }
    }

    public final void g() {
        a b2;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        boolean z = true;
        boolean z2 = aVar.v0 && !aVar.c2();
        f fVar = this.b;
        if (z2) {
            fVar.i(aVar.w, (Bundle) null);
        }
        if (!z2) {
            FragmentManagerViewModel fragmentManagerViewModel = fVar.d;
            if (!((fragmentManagerViewModel.c.containsKey(aVar.w) && fragmentManagerViewModel.f) ? fragmentManagerViewModel.g : true)) {
                String str = aVar.z;
                if (!(str == null || (b2 = fVar.b(str)) == null || !b2.M0)) {
                    aVar.y = b2;
                }
                aVar.a = 0;
                return;
            }
        }
        oc6 oc6 = aVar.E0;
        if (oc6 instanceof hbg) {
            z = fVar.d.g;
        } else {
            Context context = oc6.w0;
            if (context instanceof Activity) {
                z = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (z2 || z) {
            FragmentManagerViewModel fragmentManagerViewModel2 = fVar.d;
            fragmentManagerViewModel2.getClass();
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(aVar);
            }
            fragmentManagerViewModel2.k(aVar.w, false);
        }
        aVar.F0.l();
        aVar.b1.e(hu7.ON_DESTROY);
        aVar.a = 0;
        aVar.Q0 = false;
        aVar.Y0 = false;
        aVar.l2();
        if (aVar.Q0) {
            this.a.N(false);
            Iterator it = fVar.d().iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                if (eVar != null) {
                    String str2 = aVar.w;
                    a aVar2 = eVar.c;
                    if (str2.equals(aVar2.z)) {
                        aVar2.y = aVar;
                        aVar2.z = null;
                    }
                }
            }
            String str3 = aVar.z;
            if (str3 != null) {
                aVar.y = fVar.b(str3);
            }
            fVar.h(this);
            return;
        }
        throw new AndroidRuntimeException(g63.g(aVar, "Fragment ", " did not call through to super.onDestroy()"));
    }

    public final void h() {
        View view;
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        ViewGroup viewGroup = aVar.R0;
        if (!(viewGroup == null || (view = aVar.S0) == null)) {
            viewGroup.removeView(view);
        }
        aVar.F0.u(1);
        if (aVar.S0 != null) {
            od6 od6 = aVar.c1;
            od6.b();
            if (od6.v.d.a(iu7.c)) {
                aVar.c1.a(hu7.ON_DESTROY);
            }
        }
        aVar.a = 1;
        aVar.Q0 = false;
        aVar.m2();
        if (aVar.Q0) {
            new b(aVar, aVar.getViewModelStore()).c();
            aVar.B0 = false;
            this.a.X(false);
            aVar.R0 = null;
            aVar.S0 = null;
            aVar.c1 = null;
            aVar.d1.k((Object) null);
            aVar.y0 = false;
            return;
        }
        throw new AndroidRuntimeException(g63.g(aVar, "Fragment ", " did not call through to super.onDestroyView()"));
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [androidx.fragment.app.c, ed6] */
    public final void i() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        aVar.a = -1;
        aVar.Q0 = false;
        aVar.n2();
        aVar.X0 = null;
        if (aVar.Q0) {
            ed6 ed6 = aVar.F0;
            if (!ed6.K) {
                ed6.l();
                aVar.F0 = new c();
            }
            this.a.O(false);
            aVar.a = -1;
            aVar.E0 = null;
            aVar.G0 = null;
            aVar.D0 = null;
            if (!aVar.v0 || aVar.c2()) {
                FragmentManagerViewModel fragmentManagerViewModel = this.b.d;
                boolean z = true;
                if (fragmentManagerViewModel.c.containsKey(aVar.w) && fragmentManagerViewModel.f) {
                    z = fragmentManagerViewModel.g;
                }
                if (!z) {
                    return;
                }
            }
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(aVar);
            }
            aVar.Z1();
            return;
        }
        throw new AndroidRuntimeException(g63.g(aVar, "Fragment ", " did not call through to super.onDetach()"));
    }

    public final void j() {
        a aVar = this.c;
        if (aVar.x0 && aVar.y0 && !aVar.B0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(aVar);
            }
            Bundle bundle = aVar.b;
            Bundle bundle2 = null;
            Bundle bundle3 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater o2 = aVar.o2(bundle3);
            aVar.X0 = o2;
            aVar.C2(o2, (ViewGroup) null, bundle3);
            View view = aVar.S0;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                aVar.S0.setTag(whc.fragment_container_view_tag, aVar);
                if (aVar.K0) {
                    aVar.S0.setVisibility(8);
                }
                Bundle bundle4 = aVar.b;
                if (bundle4 != null) {
                    bundle2 = bundle4.getBundle("savedInstanceState");
                }
                aVar.A2(aVar.S0, bundle2);
                aVar.F0.u(2);
                this.a.W(aVar, aVar.S0, false);
                aVar.a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        tge tge;
        ViewGroup viewGroup2;
        tge tge2;
        ViewGroup viewGroup3;
        tge tge3;
        f fVar = this.b;
        boolean z = this.d;
        a aVar = this.c;
        if (!z) {
            try {
                this.d = true;
                boolean z2 = false;
                while (true) {
                    int d2 = d();
                    int i = aVar.a;
                    int i2 = 3;
                    if (d2 != i) {
                        if (d2 <= i) {
                            switch (i - 1) {
                                case -1:
                                    i();
                                    break;
                                case 0:
                                    g();
                                    break;
                                case 1:
                                    h();
                                    aVar.a = 1;
                                    break;
                                case 2:
                                    aVar.y0 = false;
                                    aVar.a = 2;
                                    break;
                                case 3:
                                    if (Log.isLoggable("FragmentManager", 3)) {
                                        Objects.toString(aVar);
                                    }
                                    if (aVar.S0 != null && aVar.c == null) {
                                        p();
                                    }
                                    if (!(aVar.S0 == null || (viewGroup2 = aVar.R0) == null)) {
                                        p9a K = aVar.Q1().K();
                                        Object tag = viewGroup2.getTag(whc.special_effects_controller_view_tag);
                                        if (tag instanceof tge) {
                                            tge2 = (tge) tag;
                                        } else {
                                            K.getClass();
                                            tge2 = new tge(viewGroup2);
                                            viewGroup2.setTag(whc.special_effects_controller_view_tag, tge2);
                                        }
                                        if (Log.isLoggable("FragmentManager", 2)) {
                                            tge2.getClass();
                                            Objects.toString(aVar);
                                        }
                                        tge2.d(1, 3, this);
                                    }
                                    aVar.a = 3;
                                    break;
                                case 4:
                                    r();
                                    break;
                                case 5:
                                    aVar.a = 5;
                                    break;
                                case 6:
                                    l();
                                    break;
                            }
                        } else {
                            switch (i + 1) {
                                case 0:
                                    c();
                                    break;
                                case 1:
                                    e();
                                    break;
                                case 2:
                                    j();
                                    f();
                                    break;
                                case 3:
                                    a();
                                    break;
                                case 4:
                                    if (!(aVar.S0 == null || (viewGroup3 = aVar.R0) == null)) {
                                        p9a K2 = aVar.Q1().K();
                                        Object tag2 = viewGroup3.getTag(whc.special_effects_controller_view_tag);
                                        if (tag2 instanceof tge) {
                                            tge3 = (tge) tag2;
                                        } else {
                                            K2.getClass();
                                            tge3 = new tge(viewGroup3);
                                            viewGroup3.setTag(whc.special_effects_controller_view_tag, tge3);
                                        }
                                        int visibility = aVar.S0.getVisibility();
                                        if (visibility == 0) {
                                            i2 = 2;
                                        } else if (visibility == 4) {
                                            i2 = 4;
                                        } else if (visibility != 8) {
                                            throw new IllegalArgumentException("Unknown visibility " + visibility);
                                        }
                                        if (Log.isLoggable("FragmentManager", 2)) {
                                            tge3.getClass();
                                            Objects.toString(aVar);
                                        }
                                        tge3.d(i2, 2, this);
                                    }
                                    aVar.a = 4;
                                    break;
                                case 5:
                                    q();
                                    break;
                                case 6:
                                    aVar.a = 6;
                                    break;
                                case 7:
                                    n();
                                    break;
                            }
                        }
                        z2 = true;
                    } else {
                        if (!z2 && i == -1 && aVar.v0 && !aVar.c2()) {
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(aVar);
                            }
                            FragmentManagerViewModel fragmentManagerViewModel = fVar.d;
                            fragmentManagerViewModel.getClass();
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(aVar);
                            }
                            fragmentManagerViewModel.k(aVar.w, true);
                            fVar.h(this);
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(aVar);
                            }
                            aVar.Z1();
                        }
                        if (aVar.W0) {
                            if (!(aVar.S0 == null || (viewGroup = aVar.R0) == null)) {
                                p9a K3 = aVar.Q1().K();
                                Object tag3 = viewGroup.getTag(whc.special_effects_controller_view_tag);
                                if (tag3 instanceof tge) {
                                    tge = (tge) tag3;
                                } else {
                                    K3.getClass();
                                    tge = new tge(viewGroup);
                                    viewGroup.setTag(whc.special_effects_controller_view_tag, tge);
                                }
                                if (aVar.K0) {
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        tge.getClass();
                                        Objects.toString(aVar);
                                    }
                                    tge.d(3, 1, this);
                                } else {
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        tge.getClass();
                                        Objects.toString(aVar);
                                    }
                                    tge.d(2, 1, this);
                                }
                            }
                            c cVar = aVar.D0;
                            if (cVar != null && aVar.Z && c.M(aVar)) {
                                cVar.H = true;
                            }
                            aVar.W0 = false;
                            aVar.p2(aVar.K0);
                            aVar.F0.o();
                        }
                        this.d = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.d = false;
                throw th;
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(aVar);
        }
    }

    public final void l() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        aVar.F0.u(5);
        if (aVar.S0 != null) {
            aVar.c1.a(hu7.ON_PAUSE);
        }
        aVar.b1.e(hu7.ON_PAUSE);
        aVar.a = 6;
        aVar.Q0 = false;
        aVar.t2();
        if (aVar.Q0) {
            this.a.P(false);
            return;
        }
        throw new AndroidRuntimeException(g63.g(aVar, "Fragment ", " did not call through to super.onPause()"));
    }

    public final void m(ClassLoader classLoader) {
        a aVar = this.c;
        Bundle bundle = aVar.b;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            if (aVar.b.getBundle("savedInstanceState") == null) {
                aVar.b.putBundle("savedInstanceState", new Bundle());
            }
            try {
                aVar.c = aVar.b.getSparseParcelableArray("viewState");
                aVar.o = aVar.b.getBundle("viewRegistryState");
                id6 id6 = (id6) aVar.b.getParcelable("state");
                if (id6 != null) {
                    aVar.z = id6.v0;
                    aVar.X = id6.w0;
                    Boolean bool = aVar.v;
                    if (bool != null) {
                        aVar.U0 = bool.booleanValue();
                        aVar.v = null;
                    } else {
                        aVar.U0 = id6.x0;
                    }
                }
                if (!aVar.U0) {
                    aVar.T0 = true;
                }
            } catch (BadParcelableException e2) {
                throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + aVar, e2);
            }
        }
    }

    public final void n() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        kc6 kc6 = aVar.V0;
        View view = kc6 == null ? null : kc6.k;
        if (view != null) {
            if (view != aVar.S0) {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent == null) {
                        break;
                    } else if (parent == aVar.S0) {
                        break;
                    } else {
                        parent = parent.getParent();
                    }
                }
            }
            view.requestFocus();
            if (Log.isLoggable("FragmentManager", 2)) {
                view.toString();
                Objects.toString(aVar);
                Objects.toString(aVar.S0.findFocus());
            }
        }
        aVar.L1().k = null;
        aVar.F0.S();
        aVar.F0.A(true);
        aVar.a = 7;
        aVar.Q0 = false;
        aVar.w2();
        if (aVar.Q0) {
            lv7 lv7 = aVar.b1;
            hu7 hu7 = hu7.ON_RESUME;
            lv7.e(hu7);
            if (aVar.S0 != null) {
                aVar.c1.a(hu7);
            }
            ed6 ed6 = aVar.F0;
            ed6.I = false;
            ed6.J = false;
            ed6.P.h = false;
            ed6.u(7);
            this.a.S(false);
            this.b.i(aVar.w, (Bundle) null);
            aVar.b = null;
            aVar.c = null;
            aVar.o = null;
            return;
        }
        throw new AndroidRuntimeException(g63.g(aVar, "Fragment ", " did not call through to super.onResume()"));
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        a aVar = this.c;
        if (aVar.a == -1 && (bundle = aVar.b) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new id6(aVar));
        if (aVar.a > -1) {
            Bundle bundle3 = new Bundle();
            aVar.x2(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.T(false);
            Bundle bundle4 = new Bundle();
            aVar.f1.c(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle b0 = aVar.F0.b0();
            if (!b0.isEmpty()) {
                bundle2.putBundle("childFragmentManager", b0);
            }
            if (aVar.S0 != null) {
                p();
            }
            SparseArray sparseArray = aVar.c;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = aVar.o;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = aVar.x;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        a aVar = this.c;
        if (aVar.S0 != null) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(aVar);
                Objects.toString(aVar.S0);
            }
            SparseArray sparseArray = new SparseArray();
            aVar.S0.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                aVar.c = sparseArray;
            }
            Bundle bundle = new Bundle();
            aVar.c1.w.c(bundle);
            if (!bundle.isEmpty()) {
                aVar.o = bundle;
            }
        }
    }

    public final void q() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        aVar.F0.S();
        aVar.F0.A(true);
        aVar.a = 5;
        aVar.Q0 = false;
        aVar.y2();
        if (aVar.Q0) {
            lv7 lv7 = aVar.b1;
            hu7 hu7 = hu7.ON_START;
            lv7.e(hu7);
            if (aVar.S0 != null) {
                aVar.c1.a(hu7);
            }
            ed6 ed6 = aVar.F0;
            ed6.I = false;
            ed6.J = false;
            ed6.P.h = false;
            ed6.u(5);
            this.a.U(false);
            return;
        }
        throw new AndroidRuntimeException(g63.g(aVar, "Fragment ", " did not call through to super.onStart()"));
    }

    public final void r() {
        boolean isLoggable = Log.isLoggable("FragmentManager", 3);
        a aVar = this.c;
        if (isLoggable) {
            Objects.toString(aVar);
        }
        ed6 ed6 = aVar.F0;
        ed6.J = true;
        ed6.P.h = true;
        ed6.u(4);
        if (aVar.S0 != null) {
            aVar.c1.a(hu7.ON_STOP);
        }
        aVar.b1.e(hu7.ON_STOP);
        aVar.a = 4;
        aVar.Q0 = false;
        aVar.z2();
        if (aVar.Q0) {
            this.a.V(false);
            return;
        }
        throw new AndroidRuntimeException(g63.g(aVar, "Fragment ", " did not call through to super.onStop()"));
    }

    public e(wsb wsb, f fVar, ClassLoader classLoader, rc6 rc6, Bundle bundle) {
        this.a = wsb;
        this.b = fVar;
        id6 id6 = (id6) bundle.getParcelable("state");
        a a2 = rc6.a(classLoader, id6.a);
        a2.w = id6.b;
        a2.x0 = id6.c;
        a2.z0 = id6.o;
        a2.A0 = true;
        a2.H0 = id6.v;
        a2.I0 = id6.w;
        a2.J0 = id6.x;
        a2.M0 = id6.y;
        a2.v0 = id6.z;
        a2.L0 = id6.X;
        a2.K0 = id6.Y;
        a2.a1 = iu7.values()[id6.Z];
        a2.z = id6.v0;
        a2.X = id6.w0;
        a2.U0 = id6.x0;
        this.c = a2;
        a2.b = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        a2.L2(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(a2);
        }
    }

    public e(wsb wsb, f fVar, a aVar, Bundle bundle) {
        this.a = wsb;
        this.b = fVar;
        this.c = aVar;
        aVar.c = null;
        aVar.o = null;
        aVar.C0 = 0;
        aVar.y0 = false;
        aVar.Z = false;
        a aVar2 = aVar.y;
        aVar.z = aVar2 != null ? aVar2.w : null;
        aVar.y = null;
        aVar.b = bundle;
        aVar.x = bundle.getBundle("arguments");
    }
}
