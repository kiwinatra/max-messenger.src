package defpackage;

import java.io.Serializable;
import kotlin.jvm.functions.Function1;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.RtpReceiver;
import org.webrtc.VideoTrack;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.sessionroom.internal.participant.SessionRoomParticipantsDataProviderImpl;

/* renamed from: wh4  reason: default package */
public final /* synthetic */ class wh4 implements rk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wh4(Object obj, Object obj2, Serializable serializable, int i) {
        this.a = i;
        this.d = obj;
        this.b = obj2;
        this.c = serializable;
    }

    public final void accept(Object obj) {
        String str;
        switch (this.a) {
            case 0:
                PeerConnection peerConnection = (PeerConnection) obj;
                xh4 xh4 = (xh4) this.d;
                xh4.getClass();
                MediaStreamTrack track = ((RtpReceiver) this.b).track();
                for (VideoTrack next : ((MediaStream[]) this.c)[0].videoTracks) {
                    String id = next.id();
                    String m = a81.m("remote video track ", id);
                    voc voc = (voc) xh4.b;
                    voc.log("DefaultRemoteVideoTracks", m);
                    if (track != null && id.equals(track.id())) {
                        voc.log("DefaultRemoteVideoTracks", "add remote video track ".concat(id));
                        if (id.startsWith("video-")) {
                            String substring = id.substring(6);
                            if (!substring.startsWith("u") && !substring.startsWith("g")) {
                                str = "video-u".concat(substring);
                                xh4.x.put(str, next);
                                next.setEnabled(true);
                                fbb fbb = ((xab) xh4.o).a;
                                fbb.B0.post(new rab(fbb, id, 2));
                            }
                        }
                        str = id;
                        xh4.x.put(str, next);
                        next.setEnabled(true);
                        fbb fbb2 = ((xab) xh4.o).a;
                        fbb2.B0.post(new rab(fbb2, id, 2));
                    }
                }
                return;
            case 1:
                d9b d9b = (d9b) this.d;
                RtpReceiver rtpReceiver = (RtpReceiver) this.b;
                MediaStream[] mediaStreamArr = (MediaStream[]) this.c;
                PeerConnection peerConnection2 = (PeerConnection) obj;
                synchronized (d9b) {
                    try {
                        MediaStreamTrack track2 = rtpReceiver.track();
                        for (VideoTrack next2 : mediaStreamArr[0].videoTracks) {
                            String id2 = next2.id();
                            ((voc) d9b.b).log("ParticipantsAgnosticVideoTracks", "remote video track " + id2);
                            if (track2 != null) {
                                if (id2.equals(track2.id())) {
                                    ((voc) d9b.b).log("ParticipantsAgnosticVideoTracks", "add remote video track ".concat(id2));
                                    e9b e9b = new e9b(d9b.X, (wie) d9b.v);
                                    c9b c9b = new c9b(d9b, id2);
                                    d9b.x.add(e9b);
                                    d9b.y.add(c9b);
                                    d9b.w.add(next2);
                                    if (next2.isDisposed()) {
                                        ((voc) d9b.b).log("ParticipantsAgnosticVideoTracks", "error: video track is disposed");
                                    } else {
                                        next2.addSink(e9b);
                                        next2.addSink(c9b);
                                    }
                                }
                            }
                        }
                    } finally {
                    }
                }
                return;
            default:
                SessionRoomParticipantsDataProviderImpl.resolveInternalIdByExternal$lambda$0((Function1) this.d, (Function1) this.b, (ParticipantId) this.c, (ue1) obj);
                return;
        }
    }
}
