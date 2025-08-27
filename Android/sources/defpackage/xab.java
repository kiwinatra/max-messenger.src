package defpackage;

import org.webrtc.MediaStreamTrack;
import org.webrtc.RtpReceiver;

/* renamed from: xab  reason: default package */
public final /* synthetic */ class xab implements RtpReceiver.Observer {
    public final /* synthetic */ fbb a;

    public /* synthetic */ xab(fbb fbb) {
        this.a = fbb;
    }

    public void onFirstPacketReceived(MediaStreamTrack.MediaType mediaType) {
        fbb fbb = this.a;
        fbb.B0.post(new vab(fbb, 5));
    }
}
