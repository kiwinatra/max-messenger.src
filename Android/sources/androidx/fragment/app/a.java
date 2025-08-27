package androidx.fragment.app;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.strictmode.GetTargetFragmentRequestCodeUsageViolation;
import androidx.fragment.app.strictmode.GetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetRetainInstanceUsageViolation;
import androidx.fragment.app.strictmode.SetTargetFragmentUsageViolation;
import androidx.fragment.app.strictmode.SetUserVisibleHintViolation;
import androidx.fragment.app.strictmode.Violation;
import androidx.loader.app.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.uuid.Uuid;

public abstract class a implements ComponentCallbacks, View.OnCreateContextMenuListener, jv7, hbg, tw6, odd {
    public static final Object k1 = new Object();
    public boolean A0;
    public boolean B0;
    public int C0;
    public c D0;
    public oc6 E0;
    public ed6 F0;
    public a G0;
    public int H0;
    public int I0;
    public String J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public boolean P0;
    public boolean Q0;
    public ViewGroup R0;
    public View S0;
    public boolean T0;
    public boolean U0;
    public kc6 V0;
    public boolean W0;
    public int X;
    public LayoutInflater X0;
    public Boolean Y;
    public boolean Y0;
    public boolean Z;
    public String Z0;
    public int a;
    public iu7 a1;
    public Bundle b;
    public lv7 b1;
    public SparseArray c;
    public od6 c1;
    public final fz9 d1;
    public pdd e1;
    public ndd f1;
    public final int g1;
    public final AtomicInteger h1;
    public final ArrayList i1;
    public final gc6 j1;
    public Bundle o;
    public Boolean v;
    public boolean v0;
    public String w;
    public boolean w0;
    public Bundle x;
    public boolean x0;
    public a y;
    public boolean y0;
    public String z;
    public boolean z0;

    /* JADX WARNING: type inference failed for: r0v4, types: [androidx.fragment.app.c, ed6] */
    /* JADX WARNING: type inference failed for: r0v8, types: [fz9, u08] */
    public a() {
        this.a = -1;
        this.w = UUID.randomUUID().toString();
        this.z = null;
        this.Y = null;
        this.F0 = new c();
        this.P0 = true;
        this.U0 = true;
        new cf(23, this);
        this.a1 = iu7.v;
        this.d1 = new u08();
        this.h1 = new AtomicInteger();
        this.i1 = new ArrayList();
        this.j1 = new gc6(this);
        Y1();
    }

    public void A2(View view, Bundle bundle) {
    }

    public void B2(Bundle bundle) {
        this.Q0 = true;
    }

    public void C2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.F0.S();
        this.B0 = true;
        this.c1 = new od6(this, getViewModelStore(), new y86(1, (Object) this));
        View k2 = k2(layoutInflater, viewGroup, bundle);
        this.S0 = k2;
        if (k2 != null) {
            this.c1.b();
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(this.S0);
                toString();
            }
            q8.M(this.S0, this.c1);
            this.S0.setTag(sic.view_tree_view_model_store_owner, this.c1);
            iq.V(this.S0, this.c1);
            this.d1.k(this.c1);
        } else if (this.c1.v == null) {
            this.c1 = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public final LayoutInflater D2() {
        LayoutInflater o2 = o2((Bundle) null);
        this.X0 = o2;
        return o2;
    }

    public final b E2() {
        b M1 = M1();
        if (M1 != null) {
            return M1;
        }
        throw new IllegalStateException(g63.g(this, "Fragment ", " not attached to an activity."));
    }

    public final Bundle F2() {
        Bundle bundle = this.x;
        if (bundle != null) {
            return bundle;
        }
        throw new IllegalStateException(g63.g(this, "Fragment ", " does not have any arguments."));
    }

    public final Context G2() {
        Context O1 = O1();
        if (O1 != null) {
            return O1;
        }
        throw new IllegalStateException(g63.g(this, "Fragment ", " not attached to a context."));
    }

    public final a H2() {
        a aVar = this.G0;
        if (aVar != null) {
            return aVar;
        }
        if (O1() == null) {
            throw new IllegalStateException(g63.g(this, "Fragment ", " is not attached to any Fragment or host"));
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + O1());
    }

    public final View I2() {
        View W1 = W1();
        if (W1 != null) {
            return W1;
        }
        throw new IllegalStateException(g63.g(this, "Fragment ", " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public ld8 J1() {
        return new hc6(this);
    }

    public final void J2() {
        Bundle bundle;
        Bundle bundle2 = this.b;
        if (bundle2 != null && (bundle = bundle2.getBundle("childFragmentManager")) != null) {
            this.F0.a0(bundle);
            ed6 ed6 = this.F0;
            ed6.I = false;
            ed6.J = false;
            ed6.P.h = false;
            ed6.u(1);
        }
    }

    public void K1(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.H0));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.I0));
        printWriter.print(" mTag=");
        printWriter.println(this.J0);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.a);
        printWriter.print(" mWho=");
        printWriter.print(this.w);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.C0);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.Z);
        printWriter.print(" mRemoving=");
        printWriter.print(this.v0);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.x0);
        printWriter.print(" mInLayout=");
        printWriter.println(this.y0);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.K0);
        printWriter.print(" mDetached=");
        printWriter.print(this.L0);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.P0);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.O0);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.M0);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.U0);
        if (this.D0 != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.D0);
        }
        if (this.E0 != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.E0);
        }
        if (this.G0 != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.G0);
        }
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.x);
        }
        if (this.b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.b);
        }
        if (this.c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.c);
        }
        if (this.o != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.o);
        }
        int i = 0;
        a U1 = U1(false);
        if (U1 != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(U1);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.X);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        kc6 kc6 = this.V0;
        printWriter.println(kc6 == null ? false : kc6.a);
        kc6 kc62 = this.V0;
        if ((kc62 == null ? 0 : kc62.b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            kc6 kc63 = this.V0;
            printWriter.println(kc63 == null ? 0 : kc63.b);
        }
        kc6 kc64 = this.V0;
        if ((kc64 == null ? 0 : kc64.c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            kc6 kc65 = this.V0;
            printWriter.println(kc65 == null ? 0 : kc65.c);
        }
        kc6 kc66 = this.V0;
        if ((kc66 == null ? 0 : kc66.d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            kc6 kc67 = this.V0;
            printWriter.println(kc67 == null ? 0 : kc67.d);
        }
        kc6 kc68 = this.V0;
        if ((kc68 == null ? 0 : kc68.e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            kc6 kc69 = this.V0;
            if (kc69 != null) {
                i = kc69.e;
            }
            printWriter.println(i);
        }
        if (this.R0 != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.R0);
        }
        if (this.S0 != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.S0);
        }
        if (O1() != null) {
            new b(this, getViewModelStore()).a(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.F0 + ":");
        this.F0.w(tr1.j(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final void K2(int i, int i2, int i3, int i4) {
        if (this.V0 != null || i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
            L1().b = i;
            L1().c = i2;
            L1().d = i3;
            L1().e = i4;
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, kc6] */
    public final kc6 L1() {
        if (this.V0 == null) {
            ? obj = new Object();
            Object obj2 = k1;
            obj.g = obj2;
            obj.h = obj2;
            obj.i = obj2;
            obj.j = 1.0f;
            obj.k = null;
            this.V0 = obj;
        }
        return this.V0;
    }

    public void L2(Bundle bundle) {
        c cVar = this.D0;
        if (cVar != null) {
            if (cVar == null ? false : cVar.Q()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.x = bundle;
    }

    public final b M1() {
        oc6 oc6 = this.E0;
        if (oc6 == null) {
            return null;
        }
        return (b) oc6.v0;
    }

    public final void M2(boolean z2) {
        if (!this.O0) {
            this.O0 = true;
            if (a2() && !b2()) {
                this.E0.z0.invalidateMenu();
            }
        }
    }

    public final c N1() {
        if (this.E0 != null) {
            return this.F0;
        }
        throw new IllegalStateException(g63.g(this, "Fragment ", " has not been attached yet."));
    }

    public final void N2(boolean z2) {
        if (this.P0 != z2) {
            this.P0 = z2;
            if (this.O0 && a2() && !b2()) {
                this.E0.z0.invalidateMenu();
            }
        }
    }

    public final Context O1() {
        oc6 oc6 = this.E0;
        if (oc6 == null) {
            return null;
        }
        return oc6.w0;
    }

    public final void O2() {
        kd6 kd6 = ld6.a;
        Violation violation = new Violation(this, "Attempting to set retain instance for fragment " + this);
        ld6.c(violation);
        kd6 a2 = ld6.a(this);
        if (a2.a.contains(jd6.w) && ld6.e(a2, getClass(), SetRetainInstanceUsageViolation.class)) {
            ld6.b(a2, violation);
        }
        this.M0 = true;
        c cVar = this.D0;
        if (cVar != null) {
            cVar.P.j(this);
        } else {
            this.N0 = true;
        }
    }

    public final int P1() {
        iu7 iu7 = this.a1;
        return (iu7 == iu7.b || this.G0 == null) ? iu7.ordinal() : Math.min(iu7.ordinal(), this.G0.P1());
    }

    public final void P2(int i, a aVar) {
        if (aVar != null) {
            kd6 kd6 = ld6.a;
            Violation violation = new Violation(this, "Attempting to set target fragment " + aVar + " with request code " + i + " for fragment " + this);
            ld6.c(violation);
            kd6 a2 = ld6.a(this);
            if (a2.a.contains(jd6.y) && ld6.e(a2, getClass(), SetTargetFragmentUsageViolation.class)) {
                ld6.b(a2, violation);
            }
        }
        c cVar = this.D0;
        c cVar2 = aVar != null ? aVar.D0 : null;
        if (cVar == null || cVar2 == null || cVar == cVar2) {
            a aVar2 = aVar;
            while (aVar2 != null) {
                if (!super.equals(this)) {
                    aVar2 = aVar2.U1(false);
                } else {
                    throw new IllegalArgumentException("Setting " + aVar + " as the target of " + this + " would create a target cycle");
                }
            }
            if (aVar == null) {
                this.z = null;
                this.y = null;
            } else if (this.D0 == null || aVar.D0 == null) {
                this.z = null;
                this.y = aVar;
            } else {
                this.z = aVar.w;
                this.y = null;
            }
            this.X = i;
            return;
        }
        throw new IllegalArgumentException(g63.g(aVar, "Fragment ", " must share the same FragmentManager to be set as a target fragment"));
    }

    public final c Q1() {
        c cVar = this.D0;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException(g63.g(this, "Fragment ", " not associated with a fragment manager."));
    }

    public void Q2(boolean z2) {
        kd6 kd6 = ld6.a;
        Violation violation = new Violation(this, "Attempting to set user visible hint to " + z2 + " for fragment " + this);
        ld6.c(violation);
        kd6 a2 = ld6.a(this);
        if (a2.a.contains(jd6.x) && ld6.e(a2, getClass(), SetUserVisibleHintViolation.class)) {
            ld6.b(a2, violation);
        }
        boolean z3 = false;
        if (!this.U0 && z2 && this.a < 5 && this.D0 != null && a2() && this.Y0) {
            c cVar = this.D0;
            e g = cVar.g(this);
            a aVar = g.c;
            if (aVar.T0) {
                if (cVar.b) {
                    cVar.L = true;
                } else {
                    aVar.T0 = false;
                    g.k();
                }
            }
        }
        this.U0 = z2;
        if (this.a < 5 && !z2) {
            z3 = true;
        }
        this.T0 = z3;
        if (this.b != null) {
            this.v = Boolean.valueOf(z2);
        }
    }

    public final Resources R1() {
        return G2().getResources();
    }

    public final void R2(Intent intent, Bundle bundle) {
        oc6 oc6 = this.E0;
        if (oc6 != null) {
            oc6.w0.startActivity(intent, bundle);
            return;
        }
        throw new IllegalStateException(g63.g(this, "Fragment ", " not attached to Activity"));
    }

    public final String S1(int i) {
        return R1().getString(i);
    }

    public final void S2(Intent intent, int i, Bundle bundle) {
        if (this.E0 != null) {
            c Q1 = Q1();
            if (Q1.D != null) {
                Q1.G.addLast(new zc6(this.w, i));
                if (bundle != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
                }
                Q1.D.a(intent);
                return;
            }
            oc6 oc6 = Q1.w;
            if (i == -1) {
                oc6.w0.startActivity(intent, bundle);
            } else {
                oc6.getClass();
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host".toString());
            }
        } else {
            throw new IllegalStateException(g63.g(this, "Fragment ", " not attached to Activity"));
        }
    }

    public final String T1(int i, Object... objArr) {
        return R1().getString(i, objArr);
    }

    public final a U1(boolean z2) {
        String str;
        if (z2) {
            kd6 kd6 = ld6.a;
            Violation violation = new Violation(this, "Attempting to get target fragment from fragment " + this);
            ld6.c(violation);
            kd6 a2 = ld6.a(this);
            if (a2.a.contains(jd6.y) && ld6.e(a2, getClass(), GetTargetFragmentUsageViolation.class)) {
                ld6.b(a2, violation);
            }
        }
        a aVar = this.y;
        if (aVar != null) {
            return aVar;
        }
        c cVar = this.D0;
        if (cVar == null || (str = this.z) == null) {
            return null;
        }
        return cVar.c.b(str);
    }

    public final int V1() {
        kd6 kd6 = ld6.a;
        Violation violation = new Violation(this, "Attempting to get target request code from fragment " + this);
        ld6.c(violation);
        kd6 a2 = ld6.a(this);
        if (a2.a.contains(jd6.y) && ld6.e(a2, getClass(), GetTargetFragmentRequestCodeUsageViolation.class)) {
            ld6.b(a2, violation);
        }
        return this.X;
    }

    public View W1() {
        return this.S0;
    }

    public final jv7 X1() {
        od6 od6 = this.c1;
        if (od6 != null) {
            return od6;
        }
        throw new IllegalStateException(g63.g(this, "Can't access the Fragment View's LifecycleOwner for ", " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public final void Y1() {
        this.b1 = new lv7(this);
        this.f1 = new ndd(this);
        this.e1 = null;
        ArrayList arrayList = this.i1;
        gc6 gc6 = this.j1;
        if (arrayList.contains(gc6)) {
            return;
        }
        if (this.a >= 0) {
            gc6.a();
        } else {
            arrayList.add(gc6);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [androidx.fragment.app.c, ed6] */
    public final void Z1() {
        Y1();
        this.Z0 = this.w;
        this.w = UUID.randomUUID().toString();
        this.Z = false;
        this.v0 = false;
        this.x0 = false;
        this.y0 = false;
        this.A0 = false;
        this.C0 = 0;
        this.D0 = null;
        this.F0 = new c();
        this.E0 = null;
        this.H0 = 0;
        this.I0 = 0;
        this.J0 = null;
        this.K0 = false;
        this.L0 = false;
    }

    public final boolean a2() {
        return this.E0 != null && this.Z;
    }

    public final boolean b2() {
        if (!this.K0) {
            c cVar = this.D0;
            if (cVar == null) {
                return false;
            }
            a aVar = this.G0;
            cVar.getClass();
            return aVar == null ? false : aVar.b2();
        }
    }

    public final boolean c2() {
        return this.C0 > 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r0 = r1.S0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d2() {
        /*
            r1 = this;
            boolean r0 = r1.a2()
            if (r0 == 0) goto L_0x0020
            boolean r0 = r1.b2()
            if (r0 != 0) goto L_0x0020
            android.view.View r0 = r1.S0
            if (r0 == 0) goto L_0x0020
            android.os.IBinder r0 = r0.getWindowToken()
            if (r0 == 0) goto L_0x0020
            android.view.View r1 = r1.S0
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x0020
            r1 = 1
            goto L_0x0021
        L_0x0020:
            r1 = 0
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.a.d2():boolean");
    }

    public void e2(Bundle bundle) {
        this.Q0 = true;
    }

    public void f2(int i, int i2, Intent intent) {
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void g2(Activity activity) {
        this.Q0 = true;
    }

    public final y34 getDefaultViewModelCreationExtras() {
        Application application;
        Context applicationContext = G2().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(G2().getApplicationContext());
        }
        zy9 zy9 = new zy9(0);
        if (application != null) {
            zy9.a(cbg.d, application);
        }
        zy9.a(b59.o, this);
        zy9.a(b59.p, this);
        Bundle bundle = this.x;
        if (bundle != null) {
            zy9.a(b59.q, bundle);
        }
        return zy9;
    }

    public final dbg getDefaultViewModelProviderFactory() {
        Application application;
        if (this.D0 != null) {
            if (this.e1 == null) {
                Context applicationContext = G2().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        application = null;
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && Log.isLoggable("FragmentManager", 3)) {
                    Objects.toString(G2().getApplicationContext());
                }
                this.e1 = new pdd(application, this, this.x);
            }
            return this.e1;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final ju7 getLifecycle() {
        return this.b1;
    }

    public final mdd getSavedStateRegistry() {
        return this.f1.b;
    }

    public final gbg getViewModelStore() {
        if (this.D0 == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (P1() != 1) {
            HashMap hashMap = this.D0.P.e;
            gbg gbg = (gbg) hashMap.get(this.w);
            if (gbg != null) {
                return gbg;
            }
            gbg gbg2 = new gbg();
            hashMap.put(this.w, gbg2);
            return gbg2;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public void h2(Context context) {
        this.Q0 = true;
        oc6 oc6 = this.E0;
        Activity activity = oc6 == null ? null : oc6.v0;
        if (activity != null) {
            this.Q0 = false;
            g2(activity);
        }
    }

    public void i2(Bundle bundle) {
        this.Q0 = true;
        J2();
        ed6 ed6 = this.F0;
        if (ed6.v < 1) {
            ed6.I = false;
            ed6.J = false;
            ed6.P.h = false;
            ed6.u(1);
        }
    }

    public void j2(Menu menu, MenuInflater menuInflater) {
    }

    public View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.g1;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void l2() {
        this.Q0 = true;
    }

    public void m2() {
        this.Q0 = true;
    }

    public void n2() {
        this.Q0 = true;
    }

    public LayoutInflater o2(Bundle bundle) {
        oc6 oc6 = this.E0;
        if (oc6 != null) {
            b bVar = oc6.z0;
            LayoutInflater cloneInContext = bVar.getLayoutInflater().cloneInContext(bVar);
            cloneInContext.setFactory2(this.F0.f);
            return cloneInContext;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.Q0 = true;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        E2().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onLowMemory() {
        this.Q0 = true;
    }

    public void p2(boolean z2) {
    }

    public void q2(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.Q0 = true;
    }

    public final void r2(AttributeSet attributeSet, Bundle bundle) {
        this.Q0 = true;
        oc6 oc6 = this.E0;
        Activity activity = oc6 == null ? null : oc6.v0;
        if (activity != null) {
            this.Q0 = false;
            q2(activity, attributeSet, bundle);
        }
    }

    public final void requestPermissions(String[] strArr, int i) {
        if (this.E0 != null) {
            c Q1 = Q1();
            if (Q1.F != null) {
                Q1.G.addLast(new zc6(this.w, i));
                Q1.F.a(strArr);
                return;
            }
            Q1.w.getClass();
            return;
        }
        throw new IllegalStateException(g63.g(this, "Fragment ", " not attached to Activity"));
    }

    public boolean s2(MenuItem menuItem) {
        return false;
    }

    public final void startActivity(Intent intent) {
        R2(intent, (Bundle) null);
    }

    public void t2() {
        this.Q0 = true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Uuid.SIZE_BITS);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.w);
        if (this.H0 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.H0));
        }
        if (this.J0 != null) {
            sb.append(" tag=");
            sb.append(this.J0);
        }
        sb.append(")");
        return sb.toString();
    }

    public void u2(Menu menu) {
    }

    public void v2(int i, String[] strArr, int[] iArr) {
    }

    public void w2() {
        this.Q0 = true;
    }

    public void x2(Bundle bundle) {
    }

    public void y2() {
        this.Q0 = true;
    }

    public void z2() {
        this.Q0 = true;
    }

    public a(int i) {
        this();
        this.g1 = i;
    }
}
