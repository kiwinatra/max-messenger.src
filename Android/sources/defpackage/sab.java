package defpackage;

import org.webrtc.PeerConnection;
import org.webrtc.Size;

/* renamed from: sab  reason: default package */
public final /* synthetic */ class sab implements rk3 {
    public final /* synthetic */ fbb a;
    public final /* synthetic */ Size b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ sab(fbb fbb, Size size, int i, int i2) {
        this.a = fbb;
        this.b = size;
        this.c = i;
        this.d = i2;
    }

    public final void accept(Object obj) {
        PeerConnection peerConnection = (PeerConnection) obj;
        fbb fbb = this.a;
        fbb.F();
        Size size = this.b;
        int i = size.width;
        int i2 = size.height;
        int i3 = fbb.x0;
        h44 h44 = fbb.n1;
        if (!(i3 == i && fbb.y0 == i2)) {
            h44.f = i2;
            h44.c = i;
            StringBuilder sb = new StringBuilder("Camera video size changed: ");
            sb.append(fbb.x0);
            sb.append("x");
            g63.o(sb, fbb.y0, " -> ", i, "x");
            sb.append(i2);
            fbb.J0.log("PCRTCClient", sb.toString());
            fbb.x0 = i;
            fbb.y0 = i2;
            fbb.u(peerConnection, false);
        }
        int i4 = fbb.v0;
        int i5 = this.c;
        int i6 = this.d;
        if (i4 != i5 || fbb.w0 != i6) {
            h44.g = i5;
            h44.h = i6;
            fbb.v0 = i5;
            fbb.w0 = i6;
            fbb.k(peerConnection, false);
        }
    }
}
