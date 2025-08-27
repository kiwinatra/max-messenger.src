package defpackage;

import java.util.Iterator;
import java.util.List;
import org.webrtc.AudioTrack;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.RtpSender;
import org.webrtc.RtpTransceiver;
import org.webrtc.VideoTrack;

/* renamed from: yab  reason: default package */
public final /* synthetic */ class yab implements rk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fbb b;

    public /* synthetic */ yab(fbb fbb, int i) {
        this.a = i;
        this.b = fbb;
    }

    public final void accept(Object obj) {
        voc voc;
        RtpTransceiver rtpTransceiver;
        VideoTrack videoTrack;
        AudioTrack audioTrack;
        switch (this.a) {
            case 0:
                PeerConnection peerConnection = (PeerConnection) obj;
                fbb fbb = this.b;
                fbb.u(peerConnection, false);
                fbb.k(peerConnection, false);
                return;
            default:
                PeerConnection peerConnection2 = (PeerConnection) obj;
                fbb fbb2 = this.b;
                fbb2.getClass();
                List<RtpTransceiver> transceivers = peerConnection2.getTransceivers();
                RtpTransceiver rtpTransceiver2 = null;
                fbb2.b1 = null;
                fbb2.d1 = null;
                Iterator<RtpTransceiver> it = transceivers.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    voc = fbb2.J0;
                    if (hasNext) {
                        rtpTransceiver = it.next();
                        if (rtpTransceiver.getMid() != null && rtpTransceiver.getMid().contains("s") && rtpTransceiver.getMediaType() == MediaStreamTrack.MediaType.MEDIA_TYPE_AUDIO) {
                            voc.log("PCRTCClient", "audioShareTransceiver found");
                        }
                    } else {
                        rtpTransceiver = null;
                    }
                }
                d dVar = fbb2.D0;
                if (rtpTransceiver != null) {
                    try {
                        rtpTransceiver.setDirection(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY);
                    } catch (Exception e) {
                        voc.log("PCRTCClient", "audioShareTransceiver setDirection failed with error: " + e.getMessage());
                    }
                    v48 v48 = (v48) dVar.a().b;
                    if (!(v48 == null || (audioTrack = (AudioTrack) ((MediaStreamTrack) v48.j.v)) == null)) {
                        RtpSender sender = rtpTransceiver.getSender();
                        fbb2.b1 = sender;
                        fbb2.A0.a(sender, "audio-share");
                        sender.setTrack(audioTrack, false);
                        voc.log("PCRTCClient", "audioShareTransceiver setTrack, trackId = " + audioTrack.id());
                    }
                }
                Iterator<RtpTransceiver> it2 = transceivers.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        RtpTransceiver next = it2.next();
                        if (next.getMid() != null && next.getMid().contains("s") && next.getMediaType() == MediaStreamTrack.MediaType.MEDIA_TYPE_VIDEO) {
                            voc.log("PCRTCClient", "shareScreenTransceiver found");
                            rtpTransceiver2 = next;
                        }
                    }
                }
                if (rtpTransceiver2 != null) {
                    try {
                        rtpTransceiver2.setDirection(RtpTransceiver.RtpTransceiverDirection.SEND_ONLY);
                    } catch (Exception e2) {
                        voc.log("PCRTCClient", "shareScreenTransceiver setDirection failed with error: " + e2.getMessage());
                    }
                    v48 v482 = (v48) dVar.a().b;
                    if (!(v482 == null || (videoTrack = (VideoTrack) ((MediaStreamTrack) v482.z.v)) == null)) {
                        RtpSender sender2 = rtpTransceiver2.getSender();
                        fbb2.A0.b(sender2, "screen-share", 30000, 2048000, (Double) null, false);
                        fbb2.d1 = sender2;
                        sender2.setTrack(videoTrack, false);
                        RtpSender rtpSender = fbb2.d1;
                        if (fbb2.q1 && rtpSender != null) {
                            rtpSender.setVideoEncoderObserver(new qr0((Object) fbb2, false));
                        }
                        voc.log("PCRTCClient", "shareScreenTransceiver setTrack, trackId = " + videoTrack.id());
                        try {
                            fbb2.l(peerConnection2, false, true, fbb2.d1);
                        } catch (IllegalStateException e3) {
                            voc.log("PCRTCClient", "IllegalStateException, " + fbb2 + " ex=" + e3);
                        } catch (Exception e4) {
                            voc.log("PCRTCClient", "Exception, " + fbb2 + " ex=" + e4);
                        }
                    }
                }
                fbb2.v(peerConnection2);
                peerConnection2.createAnswer(new cbb(fbb2, 1), fbb2.X0);
                return;
        }
    }
}
