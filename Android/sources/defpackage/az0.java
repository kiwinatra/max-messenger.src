package defpackage;

import org.webrtc.PeerConnectionFactory;

/* renamed from: az0  reason: default package */
public final /* synthetic */ class az0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hz0 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ az0(hz0 hz0, Runnable runnable, int i) {
        this.a = i;
        this.b = hz0;
        this.c = runnable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                hz0 hz0 = this.b;
                hz0.y.post(new az0(hz0, this.c, 1));
                return;
            default:
                hz0 hz02 = this.b;
                hz02.T0.log("OKRTCCall", "disabling enhancer");
                if (!hz02.y0) {
                    hz02.Y0 = true;
                    hz02.F(new baa(false, true, true, false, (PeerConnectionFactory.EnhancerKind) null, (String) null, 0, 0, 0, 0, 0, false, (si0) null, (aaa) null));
                    Runnable runnable = this.c;
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
