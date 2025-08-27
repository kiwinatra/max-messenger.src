package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public class DialogFragment extends a implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean A1 = false;
    public Handler l1;
    public final cf m1 = new cf(16, this);
    public final yn4 n1 = new yn4(this);
    public final zn4 o1 = new zn4(this);
    public int p1 = 0;
    public int q1 = 0;
    public boolean r1 = true;
    public boolean s1 = true;
    public int t1 = -1;
    public boolean u1;
    public final ao4 v1 = new ao4(0, this);
    public Dialog w1;
    public boolean x1;
    public boolean y1;
    public boolean z1;

    public final void B2(Bundle bundle) {
        Bundle bundle2;
        this.Q0 = true;
        if (this.w1 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.w1.onRestoreInstanceState(bundle2);
        }
    }

    public final void C2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.C2(layoutInflater, viewGroup, bundle);
        if (this.S0 == null && this.w1 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.w1.onRestoreInstanceState(bundle2);
        }
    }

    public final ld8 J1() {
        return new bo4(this, new hc6(this));
    }

    public final void T2(boolean z, boolean z2) {
        if (!this.y1) {
            this.y1 = true;
            this.z1 = false;
            Dialog dialog = this.w1;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.w1.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.l1.getLooper()) {
                        onDismiss(this.w1);
                    } else {
                        this.l1.post(this.m1);
                    }
                }
            }
            this.x1 = true;
            if (this.t1 >= 0) {
                c Q1 = Q1();
                int i = this.t1;
                if (i >= 0) {
                    Q1.y(new cd6(Q1, i, 1), z);
                    this.t1 = -1;
                    return;
                }
                throw new IllegalArgumentException(wj6.h(i, "Bad id: "));
            }
            xe0 xe0 = new xe0(Q1());
            xe0.p = true;
            xe0.j(this);
            if (z) {
                xe0.e(true);
            } else {
                xe0.e(false);
            }
        }
    }

    public int U2() {
        return this.q1;
    }

    public Dialog V2(Bundle bundle) {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        return new dc3(G2(), U2());
    }

    public final Dialog W2() {
        Dialog dialog = this.w1;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void X2(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void Y2(c cVar, String str) {
        this.y1 = false;
        this.z1 = true;
        cVar.getClass();
        xe0 xe0 = new xe0(cVar);
        xe0.p = true;
        xe0.h(0, this, str, 1);
        xe0.e(false);
    }

    public final void e2(Bundle bundle) {
        this.Q0 = true;
    }

    public final void h2(Context context) {
        super.h2(context);
        this.d1.f(this.v1);
        if (!this.z1) {
            this.y1 = false;
        }
    }

    public void i2(Bundle bundle) {
        super.i2(bundle);
        this.l1 = new Handler();
        this.s1 = this.I0 == 0;
        if (bundle != null) {
            this.p1 = bundle.getInt("android:style", 0);
            this.q1 = bundle.getInt("android:theme", 0);
            this.r1 = bundle.getBoolean("android:cancelable", true);
            this.s1 = bundle.getBoolean("android:showsDialog", this.s1);
            this.t1 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void m2() {
        this.Q0 = true;
        Dialog dialog = this.w1;
        if (dialog != null) {
            this.x1 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.w1.dismiss();
            if (!this.y1) {
                onDismiss(this.w1);
            }
            this.w1 = null;
            this.A1 = false;
        }
    }

    public final void n2() {
        this.Q0 = true;
        if (!this.z1 && !this.y1) {
            this.y1 = true;
        }
        this.d1.j(this.v1);
    }

    public final LayoutInflater o2(Bundle bundle) {
        LayoutInflater o2 = super.o2(bundle);
        boolean z = this.s1;
        if (!z || this.u1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            return o2;
        }
        if (z && !this.A1) {
            try {
                this.u1 = true;
                Dialog V2 = V2(bundle);
                this.w1 = V2;
                if (this.s1) {
                    X2(V2, this.p1);
                    Context O1 = O1();
                    if (O1 instanceof Activity) {
                        this.w1.setOwnerActivity((Activity) O1);
                    }
                    this.w1.setCancelable(this.r1);
                    this.w1.setOnCancelListener(this.n1);
                    this.w1.setOnDismissListener(this.o1);
                    this.A1 = true;
                } else {
                    this.w1 = null;
                }
            } finally {
                this.u1 = false;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        Dialog dialog = this.w1;
        return dialog != null ? o2.cloneInContext(dialog.getContext()) : o2;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.x1) {
            if (Log.isLoggable("FragmentManager", 3)) {
                toString();
            }
            T2(true, true);
        }
    }

    public void x2(Bundle bundle) {
        Dialog dialog = this.w1;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.p1;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.q1;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.r1;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.s1;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.t1;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void y2() {
        this.Q0 = true;
        Dialog dialog = this.w1;
        if (dialog != null) {
            this.x1 = false;
            dialog.show();
            View decorView = this.w1.getWindow().getDecorView();
            q8.M(decorView, this);
            decorView.setTag(sic.view_tree_view_model_store_owner, this);
            decorView.setTag(xfc.view_tree_saved_state_registry_owner, this);
        }
    }

    public void z2() {
        this.Q0 = true;
        Dialog dialog = this.w1;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
