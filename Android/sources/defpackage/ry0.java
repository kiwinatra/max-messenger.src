package defpackage;

import org.webrtc.AndroidVideoDecoder;
import ru.ok.android.externcalls.sdk.signaling.SignalingProvider;

/* renamed from: ry0  reason: default package */
public final /* synthetic */ class ry0 implements AndroidVideoDecoder.ErrorCallback, SignalingProvider {
    public final /* synthetic */ hz0 a;

    public /* synthetic */ ry0(hz0 hz0) {
        this.a = hz0;
    }

    public void error(Exception exc, String str) {
        hz0 hz0 = this.a;
        hz0.getClass();
        hz0.T0.logException("OKRTCCall", str, new IllegalStateException(str, exc));
    }

    public o9e getSignaling() {
        return this.a.x;
    }
}
