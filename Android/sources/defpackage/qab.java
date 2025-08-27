package defpackage;

import org.webrtc.MediaConstraints;
import org.webrtc.PeerConnection;

/* renamed from: qab  reason: default package */
public final /* synthetic */ class qab implements rk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fbb b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qab(fbb fbb, boolean z, int i) {
        this.a = i;
        this.b = fbb;
        this.c = z;
    }

    public final void accept(Object obj) {
        PeerConnection peerConnection = (PeerConnection) obj;
        switch (this.a) {
            case 0:
                fbb fbb = this.b;
                MediaConstraints mediaConstraints = fbb.X0;
                if (this.c) {
                    mediaConstraints = new MediaConstraints();
                    mediaConstraints.optional.addAll(fbb.X0.optional);
                    mediaConstraints.mandatory.addAll(fbb.X0.mandatory);
                    mediaConstraints.mandatory.add(new MediaConstraints.KeyValuePair("IceRestart", "true"));
                }
                peerConnection.createOffer(new cbb(fbb, 0), mediaConstraints);
                return;
            default:
                fbb fbb2 = this.b;
                boolean z = this.c;
                fbb2.u(peerConnection, z);
                fbb2.k(peerConnection, z);
                return;
        }
    }
}
