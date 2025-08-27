package defpackage;

import android.os.Handler;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* renamed from: wab  reason: default package */
public final /* synthetic */ class wab implements rk3 {
    public final /* synthetic */ fbb a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ SessionDescription c;

    public /* synthetic */ wab(fbb fbb, boolean z, SessionDescription sessionDescription) {
        this.a = fbb;
        this.b = z;
        this.c = sessionDescription;
    }

    public final void accept(Object obj) {
        PeerConnection peerConnection = (PeerConnection) obj;
        fbb fbb = this.a;
        Handler handler = fbb.B0;
        boolean z = this.b;
        SessionDescription sessionDescription = this.c;
        if (z) {
            handler.post(new abb(fbb, sessionDescription, 0));
        } else {
            handler.post(new abb(fbb, sessionDescription, 1));
        }
    }
}
