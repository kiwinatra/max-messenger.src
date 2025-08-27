package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* renamed from: t4h  reason: default package */
public final class t4h extends a {
    public final int f() {
        return 12451000;
    }

    public final /* synthetic */ IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return queryLocalInterface instanceof z2h ? (z2h) queryLocalInterface : new z2h(iBinder);
    }

    public final String p() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    public final String q() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }
}
