package defpackage;

import org.webrtc.VpxEncoderWrapper;

/* renamed from: ae6  reason: default package */
public final /* synthetic */ class ae6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ be6 b;

    public /* synthetic */ ae6(be6 be6, int i) {
        this.a = i;
        this.b = be6;
    }

    public final void run() {
        int i = this.a;
        be6 be6 = this.b;
        switch (i) {
            case 0:
                be6.v0 = true;
                VpxEncoderWrapper vpxEncoderWrapper = new VpxEncoderWrapper();
                vpxEncoderWrapper.setConsumerCallback(be6);
                be6.w = vpxEncoderWrapper;
                return;
            case 1:
                be6.a();
                return;
            default:
                be6.a();
                be6.x = null;
                be6.y = null;
                return;
        }
    }
}
