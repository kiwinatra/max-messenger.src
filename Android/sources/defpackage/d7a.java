package defpackage;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* renamed from: d7a  reason: default package */
public final class d7a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final g7a a;

    public d7a(g7a g7a) {
        this.a = g7a;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int b = telephonyDisplayInfo.getOverrideNetworkType();
        int i = 5;
        boolean z = b == 3 || b == 4 || b == 5;
        g7a g7a = this.a;
        if (z) {
            i = 10;
        }
        g7a.a(i, g7a);
    }
}
