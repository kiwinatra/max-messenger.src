package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;

/* renamed from: n3d  reason: default package */
public final class n3d extends ConnectivityManager.NetworkCallback {
    public boolean a;
    public boolean b;
    public final /* synthetic */ sb0 c;

    public n3d(sb0 sb0) {
        this.c = sb0;
    }

    public final void onAvailable(Network network) {
        ((Handler) this.c.e).post(new m3d(this, 0));
    }

    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (!z) {
            ((Handler) this.c.e).post(new m3d(this, 1));
        }
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean hasCapability = networkCapabilities.hasCapability(16);
        boolean z = this.a;
        sb0 sb0 = this.c;
        if (!z || this.b != hasCapability) {
            this.a = true;
            this.b = hasCapability;
            ((Handler) sb0.e).post(new m3d(this, 0));
        } else if (hasCapability) {
            ((Handler) sb0.e).post(new m3d(this, 1));
        }
    }

    public final void onLost(Network network) {
        ((Handler) this.c.e).post(new m3d(this, 0));
    }
}
