package defpackage;

import org.webrtc.SessionDescription;

/* renamed from: cbb  reason: default package */
public final class cbb extends j4b {
    public final /* synthetic */ int E;
    public final /* synthetic */ fbb F;

    public /* synthetic */ cbb(fbb fbb, int i) {
        this.E = i;
        this.F = fbb;
    }

    public final void onCreateFailure(String str) {
        switch (this.E) {
            case 0:
                this.F.h(str);
                return;
            default:
                this.F.h(str);
                return;
        }
    }

    public final void onCreateSuccess(SessionDescription sessionDescription) {
        switch (this.E) {
            case 0:
                this.F.m(sessionDescription);
                return;
            default:
                this.F.m(sessionDescription);
                return;
        }
    }
}
