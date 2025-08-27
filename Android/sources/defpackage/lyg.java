package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import com.google.android.gms.maps.GoogleMapOptions;

/* renamed from: lyg  reason: default package */
public final class lyg implements wu7 {
    public final a a;
    public final l5h b;

    public lyg(a aVar, l5h l5h) {
        this.b = l5h;
        vzg.m(aVar);
        this.a = aVar;
    }

    public final void a(ee8 ee8) {
        try {
            l5h l5h = this.b;
            mxg mxg = new mxg(ee8, 1);
            Parcel H0 = l5h.H0();
            hzg.c(H0, mxg);
            l5h.I0(H0, 12);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void c() {
        try {
            l5h l5h = this.b;
            l5h.I0(l5h.H0(), 8);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void d() {
        try {
            l5h l5h = this.b;
            l5h.I0(l5h.H0(), 6);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void e() {
        try {
            l5h l5h = this.b;
            l5h.I0(l5h.H0(), 5);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void f() {
        try {
            l5h l5h = this.b;
            l5h.I0(l5h.H0(), 16);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void g(Activity activity, Bundle bundle, Bundle bundle2) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
        try {
            Bundle bundle3 = new Bundle();
            vzg.P(bundle2, bundle3);
            l5h l5h = this.b;
            hha hha = new hha(activity);
            Parcel H0 = l5h.H0();
            hzg.c(H0, hha);
            hzg.b(H0, googleMapOptions);
            hzg.b(H0, bundle3);
            l5h.I0(H0, 2);
            vzg.P(bundle3, bundle2);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final View h(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy;
        try {
            Bundle bundle2 = new Bundle();
            vzg.P(bundle, bundle2);
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            l5h l5h = this.b;
            hha hha = new hha(layoutInflater);
            hha hha2 = new hha(viewGroup);
            Parcel H0 = l5h.H0();
            hzg.c(H0, hha);
            hzg.c(H0, hha2);
            hzg.b(H0, bundle2);
            Parcel R = l5h.R(H0, 4);
            p67 L0 = hha.L0(R.readStrongBinder());
            R.recycle();
            StrictMode.setThreadPolicy(threadPolicy);
            vzg.P(bundle2, bundle);
            return (View) hha.M0(L0);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    public final void i(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            vzg.P(bundle, bundle2);
            l5h l5h = this.b;
            Parcel H0 = l5h.H0();
            hzg.b(H0, bundle2);
            Parcel R = l5h.R(H0, 10);
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
        try {
            l5h l5h = this.b;
            l5h.I0(l5h.H0(), 7);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void k() {
        try {
            l5h l5h = this.b;
            l5h.I0(l5h.H0(), 15);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void l(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            vzg.P(bundle, bundle2);
            Bundle bundle3 = this.a.x;
            if (bundle3 != null && bundle3.containsKey("MapOptions")) {
                vzg.Q(bundle2, "MapOptions", bundle3.getParcelable("MapOptions"));
            }
            l5h l5h = this.b;
            Parcel H0 = l5h.H0();
            hzg.b(H0, bundle2);
            l5h.I0(H0, 3);
            vzg.P(bundle2, bundle);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    public final void onLowMemory() {
        try {
            l5h l5h = this.b;
            l5h.I0(l5h.H0(), 9);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
