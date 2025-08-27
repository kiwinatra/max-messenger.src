package defpackage;

import java.util.List;
import org.webrtc.PeerConnection;

/* renamed from: vh4  reason: default package */
public final /* synthetic */ class vh4 implements rk3 {
    public final /* synthetic */ xh4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ln1 c;
    public final /* synthetic */ List d;

    public /* synthetic */ vh4(xh4 xh4, String str, ln1 ln1, List list) {
        this.a = xh4;
        this.b = str;
        this.c = ln1;
        this.d = list;
    }

    public final void accept(Object obj) {
        PeerConnection peerConnection = (PeerConnection) obj;
        this.a.u(this.b, this.c, this.d);
    }
}
