package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* renamed from: i1h  reason: default package */
public final class i1h extends a {
    public final qae I0 = new qae(0);
    public final qae J0 = new qae(0);
    public final qae K0 = new qae(0);

    public i1h(Context context, Looper looper, b33 b33, ft6 ft6, gt6 gt6) {
        super(context, looper, 23, b33, ft6, gt6);
    }

    public final int f() {
        return 11717000;
    }

    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof j7h ? (j7h) queryLocalInterface : new bvg(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 2);
    }

    public final tj5[] m() {
        return y64.d;
    }

    public final String p() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public final String q() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public final void s() {
        System.currentTimeMillis();
        synchronized (this.I0) {
            this.I0.clear();
        }
        synchronized (this.J0) {
            this.J0.clear();
        }
        synchronized (this.K0) {
            this.K0.clear();
        }
    }

    public final boolean t() {
        return true;
    }
}
