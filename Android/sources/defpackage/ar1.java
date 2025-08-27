package defpackage;

import android.content.Context;
import org.webrtc.Camera1Enumerator;
import org.webrtc.Camera2Enumerator;
import org.webrtc.CameraEnumerator;

/* renamed from: ar1  reason: default package */
public final class ar1 extends fbf {
    public final /* synthetic */ int v = 1;
    public final CameraEnumerator w;

    public ar1(voc voc, boolean z) {
        super(voc);
        this.w = new Camera1Enumerator(z);
    }

    public final CameraEnumerator H() {
        switch (this.v) {
            case 0:
                return (Camera1Enumerator) this.w;
            default:
                return (Camera2Enumerator) this.w;
        }
    }

    public ar1(Context context, voc voc) {
        super(voc);
        this.w = new Camera2Enumerator(context);
    }
}
