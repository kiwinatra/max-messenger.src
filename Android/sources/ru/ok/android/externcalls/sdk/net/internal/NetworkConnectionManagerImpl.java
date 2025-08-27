package ru.ok.android.externcalls.sdk.net.internal;

import kotlin.Metadata;
import org.webrtc.NetworkMonitor;
import ru.ok.android.externcalls.sdk.net.NetworkConnectionManager;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ok/android/externcalls/sdk/net/internal/NetworkConnectionManagerImpl;", "Lru/ok/android/externcalls/sdk/net/NetworkConnectionManager;", "Lhz0;", "call", "<init>", "(Lhz0;)V", "Leg0;", "callback", "", "registerBadConnectionCallback", "(Leg0;)V", "unregisterBadConnectionCallback", "Lt6a;", "listener", "addNetworkConnectivityListener", "(Lt6a;)V", "removeNetworkConnectivityListener", "Lynf;", "plusAssign", "(Lynf;)V", "minusAssign", "Lhz0;", "Lxnf;", "getTopology", "()Lxnf;", "topology", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class NetworkConnectionManagerImpl implements NetworkConnectionManager {
    private final hz0 call;

    public NetworkConnectionManagerImpl(hz0 hz0) {
        this.call = hz0;
    }

    public void addNetworkConnectivityListener(t6a t6a) {
        if (this.call.o1.add(t6a)) {
            NetworkMonitor.isOnline();
            t6a.a();
        }
    }

    public xnf getTopology() {
        return this.call.r1.y();
    }

    public void minusAssign(ynf ynf) {
        this.call.p1.remove(ynf);
    }

    public void plusAssign(ynf ynf) {
        this.call.p1.add(ynf);
    }

    public void registerBadConnectionCallback(eg0 eg0) {
        hz0 hz0 = this.call;
        if (hz0.V0) {
            hz0.U0.k.add(eg0);
        } else {
            hz0.T0.log("OKRTCCall", "Using registerBadConnectionCallback w/ enableLossRttBadConnectionHandling disabled, ignoring");
        }
    }

    public void removeNetworkConnectivityListener(t6a t6a) {
        this.call.o1.remove(t6a);
    }

    public void unregisterBadConnectionCallback(eg0 eg0) {
        hz0 hz0 = this.call;
        if (hz0.V0) {
            hz0.U0.k.remove(eg0);
        } else {
            hz0.T0.log("OKRTCCall", "Using unregisterBadConnectionCallback w/ enableLossRttBadConnectionHandling disabled, ignoring");
        }
    }
}
