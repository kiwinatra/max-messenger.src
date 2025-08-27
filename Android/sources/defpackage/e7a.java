package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;

/* renamed from: e7a  reason: default package */
public final class e7a extends PhoneStateListener {
    public final /* synthetic */ f7a a;

    public e7a(f7a f7a) {
        this.a = f7a;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int b = telephonyDisplayInfo.getOverrideNetworkType();
        f7a.b(this.a, b == 3 || b == 4 ? 10 : 5);
    }

    public final void onServiceStateChanged(ServiceState serviceState) {
        String serviceState2 = serviceState == null ? "" : serviceState.toString();
        f7a.b(this.a, serviceState2.contains("nrState=CONNECTED") || serviceState2.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
    }
}
