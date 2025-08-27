package defpackage;

import android.graphics.SurfaceTexture;
import org.webrtc.SurfaceTextureHelper;

/* renamed from: eed  reason: default package */
public final /* synthetic */ class eed implements SurfaceTexture.OnFrameAvailableListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eed(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                ((fed) this.b).a.set(true);
                return;
            default:
                ((SurfaceTextureHelper) this.b).lambda$new$0(surfaceTexture);
                return;
        }
    }
}
