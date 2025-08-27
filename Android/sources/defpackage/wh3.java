package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.TuplesKt;

/* renamed from: wh3  reason: default package */
public final class wh3 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wh3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void onAvailable(Network network) {
        switch (this.a) {
            case 0:
                String str = ((xh3) this.b).l;
                a67 a67 = z68.b;
                if (a67 != null && a67.c()) {
                    a67.d(w78.o, str, "onAvailable", (Throwable) null);
                }
                super.onAvailable(network);
                xh3 xh3 = (xh3) this.b;
                xh3.k(vh3.a((vh3) xh3.k.get(), true, true, 12));
                return;
            default:
                super.onAvailable(network);
                return;
        }
    }

    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case 0:
                xh3 xh3 = (xh3) this.b;
                xh3.getClass();
                xh3.h = xh3.g(networkCapabilities);
                xh3 xh32 = (xh3) this.b;
                String str = xh32.l;
                a67 a67 = z68.b;
                if (a67 != null && a67.c()) {
                    w78 w78 = w78.o;
                    mi3 mi3 = xh32.h;
                    a67.d(w78, str, "onCapabilitiesChanged, current connection is " + mi3 + ", capabilities=" + networkCapabilities, (Throwable) null);
                }
                super.onCapabilitiesChanged(network, networkCapabilities);
                ((xh3) this.b).l(TuplesKt.to(network, networkCapabilities));
                return;
            default:
                h88 x = h88.x();
                String str2 = z6a.a;
                x.p(str2, "Network capabilities changed: " + networkCapabilities);
                y6a y6a = (y6a) this.b;
                y6a.q(z6a.a(y6a.w));
                return;
        }
    }

    public final void onLost(Network network) {
        switch (this.a) {
            case 0:
                String str = ((xh3) this.b).l;
                a67 a67 = z68.b;
                if (a67 != null && a67.c()) {
                    a67.d(w78.o, str, "onLost", (Throwable) null);
                }
                xh3 xh3 = (xh3) this.b;
                xh3.k(vh3.a((vh3) xh3.k.get(), false, false, 14));
                super.onLost(network);
                return;
            default:
                h88.x().p(z6a.a, "Network connection lost");
                y6a y6a = (y6a) this.b;
                y6a.q(z6a.a(y6a.w));
                return;
        }
    }
}
