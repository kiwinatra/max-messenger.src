package defpackage;

import java.util.Collections;
import java.util.regex.Matcher;
import org.json.HTTP;
import org.webrtc.PeerConnection;
import org.webrtc.SessionDescription;

/* renamed from: tab  reason: default package */
public final /* synthetic */ class tab implements rk3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fbb b;
    public final /* synthetic */ SessionDescription c;

    public /* synthetic */ tab(fbb fbb, SessionDescription sessionDescription, int i) {
        this.a = i;
        this.b = fbb;
        this.c = sessionDescription;
    }

    public final void accept(Object obj) {
        String group;
        switch (this.a) {
            case 0:
                PeerConnection peerConnection = (PeerConnection) obj;
                fbb fbb = this.b;
                fbb.getClass();
                SessionDescription sessionDescription = this.c;
                String str = sessionDescription.description;
                voc voc = fbb.J0;
                ld9.s(str, voc);
                if (fbb.G0 != 2) {
                    str = fbb.e(str, true);
                }
                boolean z = fbb.w;
                yoc yoc = fbb.I0;
                if (z) {
                    str = ld9.Q(ld9.e(str, "dred", "100", yoc, voc), Collections.singletonList("opus"), yoc, voc);
                }
                Integer num = fbb.x;
                if (num != null) {
                    str = ld9.e(str, "minptime", String.valueOf(num.intValue()), yoc, voc);
                }
                Integer num2 = fbb.y;
                if (num2 != null) {
                    str = ld9.e(str, "maxptime", String.valueOf(num2.intValue()), yoc, voc);
                }
                if (fbb.o) {
                    str = ld9.Q(str, Collections.singletonList("red"), yoc, voc);
                }
                String i = g63.i(str, str.endsWith("\n") ? "" : HTTP.CRLF, "a=animoji:2\r\n");
                if (!fbb.v) {
                    i = ld9.e(i, "usedtx", String.valueOf(1), yoc, voc);
                }
                SessionDescription sessionDescription2 = new SessionDescription(sessionDescription.type, i);
                voc.log("PCRTCClient", fbb.toString() + ": set local sdp from " + sessionDescription2.type);
                peerConnection.setLocalDescription(new bbb(fbb, sessionDescription2, 0), sessionDescription2);
                return;
            default:
                fbb fbb2 = this.b;
                SessionDescription sessionDescription3 = this.c;
                PeerConnection peerConnection2 = (PeerConnection) obj;
                fbb2.getClass();
                String str2 = sessionDescription3.description;
                ld9.s(str2, fbb2.J0);
                if (!fbb2.q1 && fbb2.f1 != null) {
                    if (fbb.u1.matcher(str2).find()) {
                        voc voc2 = fbb2.J0;
                        voc2.log("PCRTCClient", fbb2.toString() + ": remote sdp supports h264 decoding");
                    } else {
                        voc voc3 = fbb2.J0;
                        voc3.log("PCRTCClient", fbb2.toString() + ": remote does not support h264 decoding");
                        fbb2.f1.m(Float.valueOf(fbb2.r1), Float.valueOf(fbb2.s1));
                    }
                }
                SessionDescription sessionDescription4 = new SessionDescription(sessionDescription3.type, fbb2.e(str2, false));
                if (fbb2.z.c == null) {
                    Matcher matcher = fbb.v1.matcher(sessionDescription3.description);
                    int i2 = 1;
                    if (matcher.find() && (group = matcher.group(1)) != null) {
                        i2 = Integer.parseInt(group);
                    }
                    fbb2.K0.getClass();
                    int min = Math.min(i2, 2);
                    voc voc4 = fbb2.J0;
                    voc4.log("PCRTCClient", fbb2.toString() + ": set animoji protocol version: " + min + "(local: 2, remote: " + i2 + ")");
                    kk kkVar = fbb2.z;
                    if (kkVar.c != null) {
                        Throwable th = new Throwable("Resetting animoji protocol version");
                        voc voc5 = (voc) kkVar.a.a;
                        String message = th.getMessage();
                        if (message == null) {
                            message = "animoji error";
                        }
                        voc5.logException("AniSend", message, th);
                    }
                    kkVar.c = Integer.valueOf(min);
                    o15 o15 = kkVar.g;
                    if (o15 != null) {
                        o15.a();
                    }
                }
                voc voc6 = fbb2.J0;
                voc6.log("PCRTCClient", fbb2.toString() + ": set remote sdp from " + sessionDescription3.type);
                peerConnection2.setRemoteDescription(new bbb(fbb2, sessionDescription4, 1), sessionDescription4);
                return;
        }
    }
}
