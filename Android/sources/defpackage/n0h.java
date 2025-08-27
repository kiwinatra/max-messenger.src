package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* renamed from: n0h  reason: default package */
public final class n0h extends a {
    public final int f() {
        return 212800000;
    }

    public final /* synthetic */ IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof m3h ? (m3h) queryLocalInterface : new m3h(iBinder);
    }

    public final tj5[] m() {
        return o54.k;
    }

    public final String p() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    public final String q() {
        return "com.google.android.gms.appset.service.START";
    }

    public final boolean r() {
        return true;
    }
}
