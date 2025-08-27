package defpackage;

import org.webrtc.SessionDescription;

/* renamed from: bbb  reason: default package */
public final class bbb extends j4b {
    public final /* synthetic */ int E;
    public final /* synthetic */ SessionDescription F;
    public final /* synthetic */ fbb G;

    public /* synthetic */ bbb(fbb fbb, SessionDescription sessionDescription, int i) {
        this.E = i;
        this.G = fbb;
        this.F = sessionDescription;
    }

    public final void onSetFailure(String str) {
        switch (this.E) {
            case 0:
                this.G.o(this.F, true, str);
                return;
            default:
                this.G.o(this.F, false, str);
                return;
        }
    }

    public final void onSetSuccess() {
        switch (this.E) {
            case 0:
                this.G.n(this.F, true);
                return;
            default:
                this.G.n(this.F, false);
                return;
        }
    }
}
