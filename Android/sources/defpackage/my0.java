package defpackage;

import java.util.Iterator;
import org.webrtc.EglBase;
import org.webrtc.PeerConnectionFactory;

/* renamed from: my0  reason: default package */
public final /* synthetic */ class my0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hz0 b;

    public /* synthetic */ my0(hz0 hz0, int i) {
        this.a = i;
        this.b = hz0;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                hz0 hz0 = this.b;
                if (!hz0.y0) {
                    Iterator it = hz0.o1.iterator();
                    if (it.hasNext()) {
                        rae.w(it.next());
                        throw null;
                    }
                    return;
                }
                return;
            case 1:
                hz0 hz02 = this.b;
                hz02.y.post(new my0(hz02, 3));
                return;
            case 2:
                hz0 hz03 = this.b;
                if (!hz03.y0) {
                    int c = hz03.j1.c();
                    boolean z = true;
                    if (!(c == 2 || c == 1)) {
                        z = false;
                    }
                    mz9 mz9 = hz03.w1;
                    if (z != mz9.f) {
                        hz03.T0.log("OKRTCCall", "onLocalMediaStreamChanged, media settings video enabled state (" + mz9.f + ") != camera video enabled state (" + z + "). Let us update media settings");
                        hz03.G(z);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                hz0 hz04 = this.b;
                voc voc = hz04.T0;
                EglBase eglBase = hz04.v0;
                try {
                    voc.log("OKRTCCall", "Releasing " + ur9.c(eglBase));
                    eglBase.release();
                    voc.log("OKRTCCall", ur9.c(eglBase) + " was released");
                    return;
                } catch (Exception e) {
                    voc.reportException("OKRTCCall", "release.egl", e);
                    return;
                }
            default:
                hz0 hz05 = this.b;
                hz05.getClass();
                try {
                    PeerConnectionFactory peerConnectionFactory = hz05.i1.d;
                    if (peerConnectionFactory != null) {
                        peerConnectionFactory.clearDumpRequests();
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    hz05.T0.logException("OKRTCCall", "Error stopping local audio dump", th);
                    return;
                }
        }
    }

    public /* synthetic */ my0(hz0 hz0, boolean z) {
        this.a = 0;
        this.b = hz0;
    }
}
