package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* renamed from: twg  reason: default package */
public final class twg extends a {
    public final oef I0;

    public twg(Context context, Looper looper, b33 b33, oef oef, ft6 ft6, gt6 gt6) {
        super(context, looper, 270, b33, ft6, gt6);
        this.I0 = oef;
    }

    public final int f() {
        return 203400000;
    }

    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof pwg ? (pwg) queryLocalInterface : new bvg(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    public final tj5[] m() {
        return kv0.e;
    }

    public final Bundle n() {
        oef oef = this.I0;
        oef.getClass();
        Bundle bundle = new Bundle();
        String str = oef.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final String p() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    public final String q() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    public final boolean r() {
        return true;
    }
}
