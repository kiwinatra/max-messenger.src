package defpackage;

import org.webrtc.IceCandidate;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* renamed from: ebb  reason: default package */
public interface ebb {
    void b(fbb fbb, SessionDescription sessionDescription);

    void c(fbb fbb);

    void d(fbb fbb);

    void e();

    void f(String str);

    void g();

    void h(fbb fbb, String str);

    void i(fbb fbb, IceCandidate[] iceCandidateArr);

    void l(fbb fbb, PeerConnection.SignalingState signalingState);

    void m(fbb fbb, IceCandidate iceCandidate);

    void n(fbb fbb, SessionDescription sessionDescription);

    void o(fbb fbb, PeerConnection.IceConnectionState iceConnectionState);

    void p(fbb fbb, long j) {
    }

    void r(fbb fbb);
}
