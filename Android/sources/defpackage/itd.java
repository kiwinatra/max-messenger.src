package defpackage;

import org.webrtc.NetworkMonitor;
import org.webrtc.PeerConnection;

/* renamed from: itd  reason: default package */
public final /* synthetic */ class itd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ktd b;

    public /* synthetic */ itd(ktd ktd, int i) {
        this.a = i;
        this.b = ktd;
    }

    public final void run() {
        fm1 fm1;
        int i = this.a;
        ktd ktd = this.b;
        switch (i) {
            case 0:
                ktd.getClass();
                if (NetworkMonitor.isOnline() && ktd.G0.B0 && (fm1 = ktd.w0) != null) {
                    ((hz0) fm1).A(ktd, PeerConnection.IceConnectionState.FAILED);
                    return;
                }
                return;
            default:
                if (ktd.I()) {
                    mvf mvf = ktd.G0;
                    if (mvf.z0.C() != PeerConnection.IceConnectionState.CONNECTED) {
                        ur9.d(mvf.v, "SERVER_CONNECTION_TIMEOUT", "in");
                    }
                    if (mvf.z0 != null) {
                        mvf.z0.I(mvf.w0);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
