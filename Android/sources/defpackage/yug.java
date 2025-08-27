package defpackage;

import org.webrtc.PeerConnection;

/* renamed from: yug  reason: default package */
public final class yug extends gw1 {
    public final /* synthetic */ int c;
    public final rk3 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yug(fbb fbb, rk3 rk3, int i) {
        super(fbb);
        this.c = i;
        switch (i) {
            case 1:
                super(fbb);
                this.o = rk3;
                return;
            default:
                this.o = rk3;
                return;
        }
    }

    public final void a(PeerConnection peerConnection) {
        switch (this.c) {
            case 0:
                this.o.accept(peerConnection);
                return;
            default:
                this.o.accept(peerConnection);
                return;
        }
    }
}
