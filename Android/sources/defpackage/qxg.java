package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: qxg  reason: default package */
public final class qxg implements wu7 {
    public final ViewGroup a;
    public final t5h b;
    public View c;

    public qxg(ViewGroup viewGroup, t5h t5h) {
        this.b = t5h;
        vzg.m(viewGroup);
        this.a = viewGroup;
    }

    public final void a(ee8 ee8) {
        try {
            t5h t5h = this.b;
            mxg mxg = new mxg(ee8, 0);
            Parcel H0 = t5h.H0();
            hzg.c(H0, mxg);
            t5h.I0(H0, 9);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void c() {
        try {
            t5h t5h = this.b;
            t5h.I0(t5h.H0(), 5);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void d() {
        try {
            t5h t5h = this.b;
            t5h.I0(t5h.H0(), 4);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void e() {
        try {
            t5h t5h = this.b;
            t5h.I0(t5h.H0(), 3);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void f() {
        try {
            t5h t5h = this.b;
            t5h.I0(t5h.H0(), 13);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void g(Activity activity, Bundle bundle, Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
    }

    public final View h(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
    }

    public final void i(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            vzg.P(bundle, bundle2);
            t5h t5h = this.b;
            Parcel H0 = t5h.H0();
            hzg.b(H0, bundle2);
            Parcel R = t5h.R(H0, 7);
            if (R.readInt() != 0) {
                bundle2.readFromParcel(R);
            }
            R.recycle();
            vzg.P(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void j() {
        throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
    }

    public final void k() {
        try {
            t5h t5h = this.b;
            t5h.I0(t5h.H0(), 12);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void l(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            vzg.P(bundle, bundle2);
            t5h t5h = this.b;
            Parcel H0 = t5h.H0();
            hzg.b(H0, bundle2);
            t5h.I0(H0, 2);
            vzg.P(bundle2, bundle);
            Parcel R = t5h.R(t5h.H0(), 8);
            p67 L0 = hha.L0(R.readStrongBinder());
            R.recycle();
            this.c = (View) hha.M0(L0);
            ViewGroup viewGroup = this.a;
            viewGroup.removeAllViews();
            viewGroup.addView(this.c);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void onLowMemory() {
        try {
            t5h t5h = this.b;
            t5h.I0(t5h.H0(), 6);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
