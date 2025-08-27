package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.webrtc.IceCandidate;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;
import org.webrtc.StatsObserver;
import org.webrtc.VideoEncoderObserver;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;

/* renamed from: zab  reason: default package */
public final /* synthetic */ class zab implements rk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zab(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                PeerConnection peerConnection = (PeerConnection) obj;
                fbb fbb = (fbb) this.b;
                fbb.getClass();
                PeerConnection.IceGatheringState iceGatheringState = PeerConnection.IceGatheringState.GATHERING;
                PeerConnection.IceGatheringState iceGatheringState2 = (PeerConnection.IceGatheringState) this.c;
                if (iceGatheringState2 == iceGatheringState) {
                    fbb.T0 = SystemClock.elapsedRealtime();
                }
                if (iceGatheringState2 == PeerConnection.IceGatheringState.COMPLETE) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(fbb.toString());
                    sb.append(": iceGatheringState=");
                    ArrayList arrayList = fbb.e1;
                    sb.append(arrayList.size());
                    sb.append(" ");
                    sb.append(arrayList);
                    fbb.J0.log("PCRTCClient", sb.toString());
                    if (fbb.g1) {
                        boolean z = false;
                        fbb.g1 = false;
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            IceCandidate iceCandidate = (IceCandidate) it.next();
                            if (iceCandidate.sdp.contains("typ srflx") || iceCandidate.sdp.contains("typ prflx") || iceCandidate.sdp.contains("typ relay")) {
                                z = true;
                            }
                        }
                        if (!z) {
                            fbb.I0.log(jme.app_event, "rtc.no.stun.candidates", (String) null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1:
                PeerConnection peerConnection2 = (PeerConnection) obj;
                fbb fbb2 = (fbb) this.b;
                fbb2.getClass();
                if (((z7g) this.c).c == 0) {
                    fbb2.u(peerConnection2, false);
                    return;
                } else {
                    fbb2.k(peerConnection2, false);
                    return;
                }
            case 2:
                fbb fbb3 = (fbb) this.b;
                fbb3.getClass();
                if (!((PeerConnection) obj).getStats((StatsObserver) this.c, (MediaStreamTrack) null)) {
                    fbb3.J0.log("PCRTCClient", fbb3.toString() + ": failed to get stats");
                    return;
                }
                return;
            case 3:
                PeerConnection peerConnection3 = (PeerConnection) obj;
                fbb fbb4 = (fbb) this.b;
                fbb4.getClass();
                StringBuilder sb2 = new StringBuilder("❄ -> removed ice candidates: ");
                IceCandidate[] iceCandidateArr = (IceCandidate[]) this.c;
                sb2.append(Arrays.toString(iceCandidateArr));
                fbb4.J0.log("PCRTCClient", sb2.toString());
                fbb4.B0.post(new sx8(20, fbb4, iceCandidateArr));
                return;
            case 4:
                ((PeerConnection) obj).setConfiguration(((fbb) this.b).g((List) this.c));
                return;
            case 5:
                PeerConnection peerConnection4 = (PeerConnection) obj;
                qr0 qr0 = (qr0) this.b;
                qr0.getClass();
                boolean isHardwareAccelerated = ((VideoEncoderObserver.EncoderInfo) this.c).isHardwareAccelerated();
                fbb fbb5 = (fbb) qr0.b;
                if (isHardwareAccelerated) {
                    fbb5.f1.m((Float) null, (Float) null);
                    return;
                } else {
                    fbb5.f1.m(Float.valueOf(fbb5.r1), Float.valueOf(fbb5.s1));
                    return;
                }
            default:
                WaitingRoomParticipants.loadWaitingParticipantIdsPageSingle$lambda$6$lambda$4((WaitingRoomParticipants) this.b, (ube) this.c, (xn1) obj);
                return;
        }
    }
}
